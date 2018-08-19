package br.com.uol.test.geoclima.api;

import br.com.uol.test.geoclima.api.vo.ClientRequestVO;
import br.com.uol.test.geoclima.api.vo.ClientResponseVO;
import br.com.uol.test.geoclima.service.ClientService;
import br.com.uol.test.geoclima.service.dto.ClientDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

import static br.com.uol.test.geoclima.api.util.IpHelper.getIpFrom;
import static org.springframework.http.HttpStatus.CREATED;

/**
 * Created by Caroline Lopes on 10/08/18.
 */
@RestController
@AllArgsConstructor
@Api(value = "client", description = "CRUD de Clientes")
public class ClientResource {

    private final ClientService service;
    private final ModelMapper mapper;

    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-FORWARDED-FOR", value = "Header com o IP de origem", required = true, paramType = "header", example = "8.8.8.8")
    })
    @ApiOperation(value = "Cadastra um novo cliente.", response = ClientDTO.class)
    @PostMapping(value = "/client", produces = "application/json")
    public ResponseEntity<ClientDTO> save(@Valid @RequestBody final ClientRequestVO clientRequestVO,
                                          final HttpServletRequest request) {
        ClientDTO saved = service.save(mapper.map(clientRequestVO.getClient(), ClientDTO.class), getIpFrom(request));
        return new ResponseEntity<>(saved, CREATED);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "ID do Cliente", required = true, paramType = "path")
    })
    @ApiOperation(value = "Atualiza um cliente pelo id.", response = ClientDTO.class)
    @PutMapping(value = "/client/{id}", produces = "application/json")
    public ClientDTO update(@PathVariable("id") final String id,
                            @RequestBody final ClientRequestVO clientRequestVO) {
        ClientDTO client = mapper.map(clientRequestVO.getClient(), ClientDTO.class);
        client.setId(id);
        return service.update(client);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "ID do Cliente", required = true, paramType = "path")
    })
    @ApiOperation(value = "Busca um cliente pelo id.", response = ClientDTO.class)
    @GetMapping(value = "/client/{id}", produces = "application/json")
    public ClientDTO getById(@PathVariable String id) {
        return mapper.map(service.getClient(id), ClientDTO.class);
    }

    @ApiOperation(value = "Lista todos os clientes cadastrados.", response = ClientDTO.class)
    @GetMapping(value = "/clients", produces = "application/json")
    public List<ClientResponseVO> getAll() {
        return mapper.map(service.list(), new TypeToken<List<ClientDTO>>() {
        }.getType());
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "ID do Cliente", required = true, paramType = "path")
    })
    @ApiOperation(value = "Deleta um cliente pelo id.", response = ClientDTO.class)
    @DeleteMapping(value = "/client/{id}", produces = "application/json")
    public void deleteClient(@PathVariable String id) {
        service.remove(id);
    }
}