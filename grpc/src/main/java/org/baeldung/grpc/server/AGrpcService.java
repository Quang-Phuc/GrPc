package org.baeldung.grpc.server;

import io.grpc.stub.StreamObserver;
import org.baeldung.grpc.AGrpc;

import org.baeldung.grpc.dao.ADao;
import org.baeldung.grpc.getInfoAReponse;
import org.baeldung.grpc.getInforequest;

public class AGrpcService extends AGrpc.AImplBase {
    ADao aDao = new ADao();
    @Override
    public void getA(getInforequest request, StreamObserver<getInfoAReponse> responseObserver) {
        responseObserver.onNext(aDao.getInfoA(request));
        responseObserver.onCompleted();
    }
}
