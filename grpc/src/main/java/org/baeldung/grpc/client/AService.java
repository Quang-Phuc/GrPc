package org.baeldung.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.baeldung.grpc.AGrpc;
import org.baeldung.grpc.getInfoAReponse;
import org.baeldung.grpc.getInforequest;
import org.baeldung.grpc.model.A;

import java.util.List;
import java.util.stream.Collectors;


public class AService {
    public List<A> getInforA(String id) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        getInforequest request = getInforequest.newBuilder()
                .setId(id).build();
        AGrpc.ABlockingStub stub = AGrpc.newBlockingStub(channel);
        getInfoAReponse reponse = stub.getA(request);
        return reponse.getInfoAList().stream().map(A::new).collect(Collectors.toList());

    }
}
