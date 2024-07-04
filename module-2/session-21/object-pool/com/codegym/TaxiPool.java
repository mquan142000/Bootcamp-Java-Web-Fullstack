package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaxiPool {
    private static final long EXPIRED_TIME_IN_MILLISECOND = 1200;
    private static final int NUMBER_OF_TAXI = 4;
    private final List<Taxi> available = Collections.synchronizedList(new ArrayList<Taxi>());
    private final List<Taxi> inUse = Collections.synchronizedList(new ArrayList<Taxi>());

}
