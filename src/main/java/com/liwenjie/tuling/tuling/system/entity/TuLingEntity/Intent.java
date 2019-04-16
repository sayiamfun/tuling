package com.liwenjie.tuling.tuling.system.entity.TuLingEntity;

import lombok.Data;

@Data
public class Intent {
    private String actionName;
    private Integer code;
    private String intentName;
    private Parameters parameters;
}
