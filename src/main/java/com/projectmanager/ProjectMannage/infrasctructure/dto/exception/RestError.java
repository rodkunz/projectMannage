package com.projectmanager.ProjectMannage.infrasctructure.dto.exception;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder

public class RestError {

    private final String errorCode;
    private final String errorCodeMessage;
    private final List<String> details;
    private final String status;
    private final String path;

}
