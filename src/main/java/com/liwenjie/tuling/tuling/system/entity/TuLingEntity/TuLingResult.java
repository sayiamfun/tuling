package com.liwenjie.tuling.tuling.system.entity.TuLingEntity;

import lombok.Data;

import java.util.List;


@Data
public class TuLingResult {
    private Emotion emotion;
    private Intent intent;
    private List<Results> results;
}
