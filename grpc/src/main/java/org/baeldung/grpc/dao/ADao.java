package org.baeldung.grpc.dao;

import com.google.common.base.Strings;
import org.baeldung.grpc.getInfoAReponse;

import org.baeldung.grpc.getInforequest;
import org.baeldung.grpc.model.A;

import java.util.List;
import java.util.stream.Collectors;

public class ADao {
    public getInfoAReponse getInfoA(getInforequest request) {
        getInfoAReponse.Builder response = getInfoAReponse.newBuilder();
        List<A> aList = null /*findByAid(request.getAid)*/;
        return  response.build();
    }
}
