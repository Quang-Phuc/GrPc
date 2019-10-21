package org.baeldung.grpc.server;

import io.grpc.stub.StreamObserver;
import org.baeldung.grpc.BGrpc;
import org.baeldung.grpc.dao.BDao;
import org.baeldung.grpc.getInfoBReponse;
import org.baeldung.grpc.getInforequest;

public class BGrpcService extends  BGrpc.BImplBase{
    BDao bDao = new BDao();

    @Override
    public void getB(getInforequest request, StreamObserver<getInfoBReponse> responseObserver) {
        responseObserver.onNext(bDao.getInfoA(request));
        responseObserver.onCompleted();
    }
}
