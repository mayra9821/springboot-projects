package com.mayto.quickstart.services.Impl;

import com.mayto.quickstart.services.RedPrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "Rojo";
    }
}
