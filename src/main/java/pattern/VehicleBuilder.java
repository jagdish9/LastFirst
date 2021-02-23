/*
 *  This source is part of the FLEXCUBE Software Product.
 *  Copyright (c) 2008 ,2020, Oracle and/or its affiliates.
 *  All rights reserved.
 *
 *  No part of this work may be reproduced, stored in a retrieval system,
 *  adopted or transmitted in any form or by any means, electronic, mechanical, photographic,
 *  graphic, optic recording or otherwise, translated in any language or computer language,
 *  without the prior written permission of Oracle and/or its affiliates.
 *
 *  Oracle Financial Services Software Limited.
 *  Oracle Park, Off Western Express Highway,
 *  Goregaon (East),
 *  Mumbai - 400 063,
 *  India.
 *
 *  Written by         : Pankaj Chaudhary
 *  Date of creation   : 04-12-2020
 *  File Name          : SmartConstant.java
 *  Purpose			  : Constant declaration for SMART.
 *  Called From       :
 *
 *  CHANGE LOG
 *  Last Modified By   :
 *  Last modified on   :
 *  Full Version       :
 *  Reason             :
 */

package pattern;

import java.util.ArrayList;
import java.util.List;

public class VehicleBuilder implements Builder<Vehicle>{

    private List<Vehicle> vehicleList;
    private List<Vehicle> vehicleFinalList;
    private List<String> strList;

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public VehicleBuilder(List<Vehicle> vehicleFinalList){
        this.vehicleFinalList = vehicleFinalList;
        init();
    }

    public void init() {
        vehicleList = new ArrayList<Vehicle>();
    }

    public Builder add(Vehicle obj) {
        if(obj != null)
            vehicleList.add(obj);
        return this;
    }

    public Builder remove(Vehicle obj) {
        if(obj != null)
            vehicleList.remove(obj);
        return this;
    }

    public void build() {
        vehicleList.forEach(v -> {
            vehicleFinalList.add(v);
        });
    }
}
