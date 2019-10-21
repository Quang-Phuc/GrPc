package org.baeldung.grpc.dao;

import org.baeldung.grpc.client.AService;
import org.baeldung.grpc.client.BService;
import org.baeldung.grpc.getInfoABReponse;

import org.baeldung.grpc.getInforequest;
import org.baeldung.grpc.model.A;
import org.baeldung.grpc.model.B;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ABDao {
    public getInfoABReponse getInfoAB(getInforequest request) {
        getInfoABReponse.Builder response = getInfoABReponse.newBuilder();
        AService a = new AService();
        BService b = new BService();
        getInfoABReponse.InfoAB.Builder builder = getInfoABReponse.InfoAB.newBuilder();
        List<A> aList = a.getInforA(request.getId());
        List<B> bList=b.getInforB(request.getId());
        aList.forEach(o -> {
            builder.setIdA(o.getIdA());
            builder.setNameA(o.getNameA());
            builder.setNameB(o.getNameA());
        });
        bList.forEach(o2->{
            builder.setNameB(o2.getNameB());
        });
         List<getInfoABReponse.InfoAB> infoABList = new ArrayList<>();
        infoABList.add(builder.build());
        response.addAllInfoAB(infoABList);
        return  response.build();
    }
}
