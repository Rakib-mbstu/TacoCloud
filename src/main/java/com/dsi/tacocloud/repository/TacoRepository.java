package com.dsi.tacocloud.repository;

import com.dsi.tacocloud.tacos.Taco;

public interface TacoRepository {
    Taco save(Taco taco);
}
