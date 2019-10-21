package org.baeldung.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.baeldung.grpc.BGrpc;
import org.baeldung.grpc.getInfoBReponse;
import org.baeldung.grpc.getInforequest;
import org.baeldung.grpc.model.B;

import java.util.List;
import java.util.stream.Collectors;

public class BService {
    public List<B> getInforB(String id)
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        getInforequest request =getInforequest.newBuilder()
                .setId(id).build();
        BGrpc.BBlockingStub stub = BGrpc.newBlockingStub(channel);
        getInfoBReponse reponse = stub.getB(request);
        return reponse.getInfoBList().stream().map(B::new).collect(Collectors.toList());

    }
}
