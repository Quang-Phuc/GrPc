package org.baeldung.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import org.baeldung.grpc.ABGrpc;
import org.baeldung.grpc.getInfoABReponse;
import org.baeldung.grpc.getInforequest;

import java.util.stream.Collectors;

public class ABService {
    public getInfoABReponse getInforAB(String id)
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        getInforequest request =getInforequest.newBuilder()
                .setId(id)
                .build();
        ABGrpc.ABBlockingStub stub = ABGrpc.newBlockingStub(channel);
        return stub.getAB(request);

    }
}
