package com.http_codes.logic;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.Arrays;

@Service
public class RispostaHttpStatus {

    public ResponseEntity<String> responseEntity(String code) {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT.getReasonPhrase(), HttpStatus.I_AM_A_TEAPOT);
        MultiValueMap<String, String> headers = new HttpHeaders();
        int value = Integer.parseInt(code);

        if(HttpStatus.ACCEPTED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.ACCEPTED.getReasonPhrase(), HttpStatus.ACCEPTED);
        }
        else if(HttpStatus.ALREADY_REPORTED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.ALREADY_REPORTED.getReasonPhrase(), HttpStatus.ALREADY_REPORTED);
        }
        else if(HttpStatus.BAD_GATEWAY.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.BAD_GATEWAY.getReasonPhrase(), HttpStatus.BAD_GATEWAY);
        }
        else if(HttpStatus.BAD_REQUEST.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST);
        }
        else if(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED.getReasonPhrase(), HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
        }
        else if(HttpStatus.CONTINUE.value() == value){
            headers.put("Status", Arrays.asList(HttpStatus.CONTINUE.getReasonPhrase()));
            responseEntity = new ResponseEntity<>(HttpStatus.OK.getReasonPhrase(), headers, HttpStatus.OK);
        }
        else if(HttpStatus.CHECKPOINT.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.CHECKPOINT.getReasonPhrase(), HttpStatus.CHECKPOINT);
        }
        else if(HttpStatus.CONFLICT.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.CONFLICT.getReasonPhrase(), HttpStatus.CONFLICT);
        }
        else if(HttpStatus.CREATED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.CREATED.getReasonPhrase(), HttpStatus.CREATED);
        }
        else if(HttpStatus.EXPECTATION_FAILED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED.getReasonPhrase(), HttpStatus.EXPECTATION_FAILED);
        }
        else if(HttpStatus.FAILED_DEPENDENCY.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.FAILED_DEPENDENCY.getReasonPhrase(), HttpStatus.FAILED_DEPENDENCY);
        }
        else if(HttpStatus.FORBIDDEN.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.FORBIDDEN.getReasonPhrase(), HttpStatus.FORBIDDEN);
        }
        else if(HttpStatus.FOUND.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.FOUND.getReasonPhrase(), HttpStatus.FOUND);
        }
        else if(HttpStatus.GATEWAY_TIMEOUT.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.GATEWAY_TIMEOUT.getReasonPhrase(), HttpStatus.GATEWAY_TIMEOUT);
        }
        else if(HttpStatus.GONE.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.GONE.getReasonPhrase(), HttpStatus.GONE);
        }
        else if(HttpStatus.HTTP_VERSION_NOT_SUPPORTED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.HTTP_VERSION_NOT_SUPPORTED.getReasonPhrase(), HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
        }
        else if(HttpStatus.IM_USED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.IM_USED.getReasonPhrase(), HttpStatus.IM_USED);
        }
        else if(HttpStatus.INSUFFICIENT_STORAGE.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.INSUFFICIENT_STORAGE.getReasonPhrase(), HttpStatus.INSUFFICIENT_STORAGE);
        }
        else if(HttpStatus.INTERNAL_SERVER_ERROR.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        else if(HttpStatus.LENGTH_REQUIRED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.LENGTH_REQUIRED.getReasonPhrase(), HttpStatus.LENGTH_REQUIRED);
        }
        else if(HttpStatus.LOCKED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.LOCKED.getReasonPhrase(), HttpStatus.LOCKED);
        }
        else if(HttpStatus.LOOP_DETECTED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.LOOP_DETECTED.getReasonPhrase(), HttpStatus.LOOP_DETECTED);
        }
        else if(HttpStatus.METHOD_NOT_ALLOWED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.METHOD_NOT_ALLOWED.getReasonPhrase(), HttpStatus.METHOD_NOT_ALLOWED);
        }
        else if(HttpStatus.MOVED_PERMANENTLY.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.MOVED_PERMANENTLY.getReasonPhrase(), HttpStatus.MOVED_PERMANENTLY);
        }
        else if(HttpStatus.MULTI_STATUS.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.MULTI_STATUS.getReasonPhrase(), HttpStatus.MULTI_STATUS);
        }
        else if(HttpStatus.MULTIPLE_CHOICES.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.MULTIPLE_CHOICES.getReasonPhrase(), HttpStatus.MULTIPLE_CHOICES);
        }
        else if(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED.getReasonPhrase(), HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
        }
        else if(HttpStatus.NON_AUTHORITATIVE_INFORMATION.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.NON_AUTHORITATIVE_INFORMATION.getReasonPhrase(), HttpStatus.NON_AUTHORITATIVE_INFORMATION);
        }
        else if(HttpStatus.NO_CONTENT.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT.getReasonPhrase(), HttpStatus.NO_CONTENT);
        }
        else if(HttpStatus.NOT_ACCEPTABLE.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE.getReasonPhrase(), HttpStatus.NOT_ACCEPTABLE);
        }
        else if(HttpStatus.NOT_EXTENDED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_EXTENDED.getReasonPhrase(), HttpStatus.NOT_EXTENDED);
        }
        else if(HttpStatus.NOT_FOUND.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND.getReasonPhrase(), HttpStatus.NOT_FOUND);
        }
        else if(HttpStatus.NOT_IMPLEMENTED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED.getReasonPhrase(), HttpStatus.NOT_IMPLEMENTED);
        }
        else if(HttpStatus.NOT_MODIFIED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_MODIFIED.getReasonPhrase(), HttpStatus.NOT_MODIFIED);
        }
        else if(HttpStatus.OK.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.OK.getReasonPhrase(), HttpStatus.OK);
        }
        else if(HttpStatus.PARTIAL_CONTENT.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.PARTIAL_CONTENT.getReasonPhrase(), HttpStatus.PARTIAL_CONTENT);
        }
        else if(HttpStatus.PAYLOAD_TOO_LARGE.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.PAYLOAD_TOO_LARGE.getReasonPhrase(), HttpStatus.PAYLOAD_TOO_LARGE);
        }
        else if(HttpStatus.PAYMENT_REQUIRED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.PAYMENT_REQUIRED.getReasonPhrase(), HttpStatus.PAYMENT_REQUIRED);
        }
        else if(HttpStatus.PERMANENT_REDIRECT.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.PERMANENT_REDIRECT.getReasonPhrase(), HttpStatus.PERMANENT_REDIRECT);
        }
        else if(HttpStatus.PRECONDITION_FAILED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.PRECONDITION_FAILED.getReasonPhrase(), HttpStatus.PRECONDITION_FAILED);
        }
        else if(HttpStatus.PRECONDITION_REQUIRED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.PRECONDITION_REQUIRED.getReasonPhrase(), HttpStatus.PRECONDITION_REQUIRED);
        }
        else if(HttpStatus.PROCESSING.value() == value){
            headers.put("Status", Arrays.asList(HttpStatus.PROCESSING.getReasonPhrase()));
            responseEntity = new ResponseEntity<>(HttpStatus.OK.getReasonPhrase(), headers, HttpStatus.OK);
        }
        else if(HttpStatus.PROXY_AUTHENTICATION_REQUIRED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.PROXY_AUTHENTICATION_REQUIRED.getReasonPhrase(), HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
        }
        else if(HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE.getReasonPhrase(), HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
        }
        else if(HttpStatus.REQUEST_TIMEOUT.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.REQUEST_TIMEOUT.getReasonPhrase(), HttpStatus.REQUEST_TIMEOUT);
        }
        else if(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE.getReasonPhrase(), HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
        }
        else if(HttpStatus.RESET_CONTENT.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.RESET_CONTENT.getReasonPhrase(), HttpStatus.RESET_CONTENT);
        }
        else if(HttpStatus.SEE_OTHER.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.SEE_OTHER.getReasonPhrase(), HttpStatus.SEE_OTHER);
        }
        else if(HttpStatus.SERVICE_UNAVAILABLE.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE.getReasonPhrase(), HttpStatus.SERVICE_UNAVAILABLE);
        }
        else if(HttpStatus.SWITCHING_PROTOCOLS.value() == value){
            headers.put("Status", Arrays.asList(HttpStatus.SWITCHING_PROTOCOLS.getReasonPhrase()));
            responseEntity = new ResponseEntity<>(HttpStatus.OK.getReasonPhrase(), headers, HttpStatus.OK);
        }
        else if(HttpStatus.TEMPORARY_REDIRECT.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.TEMPORARY_REDIRECT.getReasonPhrase(), HttpStatus.TEMPORARY_REDIRECT);
        }
        else if(HttpStatus.TOO_MANY_REQUESTS.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.TOO_MANY_REQUESTS.getReasonPhrase(), HttpStatus.TOO_MANY_REQUESTS);
        }
        else if(HttpStatus.UNAUTHORIZED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.UNAUTHORIZED.getReasonPhrase(), HttpStatus.UNAUTHORIZED);
        }
        else if(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS.getReasonPhrase(), HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
        }
        else if(HttpStatus.UNPROCESSABLE_ENTITY.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY.getReasonPhrase(), HttpStatus.UNPROCESSABLE_ENTITY);
        }
        else if(HttpStatus.UNSUPPORTED_MEDIA_TYPE.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.UNSUPPORTED_MEDIA_TYPE.getReasonPhrase(), HttpStatus.UNSUPPORTED_MEDIA_TYPE);
        }
        else if(HttpStatus.UPGRADE_REQUIRED.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.UPGRADE_REQUIRED.getReasonPhrase(), HttpStatus.UPGRADE_REQUIRED);
        }
        else if(HttpStatus.URI_TOO_LONG.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.URI_TOO_LONG.getReasonPhrase(), HttpStatus.URI_TOO_LONG);
        }
        else if(HttpStatus.VARIANT_ALSO_NEGOTIATES.value() == value){
            responseEntity = new ResponseEntity<>(HttpStatus.VARIANT_ALSO_NEGOTIATES.getReasonPhrase(), HttpStatus.VARIANT_ALSO_NEGOTIATES);
        }

        return responseEntity;
    }
}