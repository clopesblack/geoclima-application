package br.com.uol.test.geoclima.service.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Caroline Lopes on 15/08/18.
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class GenericErrorException extends RuntimeException {

    private String code;
    private String msg;
}
