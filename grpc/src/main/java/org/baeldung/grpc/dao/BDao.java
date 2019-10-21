package org.baeldung.grpc.dao;

import org.baeldung.grpc.getInfoBReponse;
import org.baeldung.grpc.getInforequest;
import org.baeldung.grpc.model.B;

import java.util.List;

public class BDao {
    public getInfoBReponse getInfoA(getInforequest request) {
        getInfoBReponse.Builder response = getInfoBReponse.newBuilder();
        List<B> aList = null /*findByBid(request.getBid)*/;
        return  response.build();
    }
}
