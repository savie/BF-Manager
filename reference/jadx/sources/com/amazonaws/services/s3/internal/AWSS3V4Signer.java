package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AwsChunkedEncodingInputStream;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.BinaryUtils;
import java.io.IOException;
import java.io.InputStream;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: loaded from: classes.dex */
public class AWSS3V4Signer extends AWS4Signer {
    @Override // com.amazonaws.auth.AWS4Signer
    public final String calculateContentHashPresign(Request request) {
        return "UNSIGNED-PAYLOAD";
    }

    public AWSS3V4Signer() {
        super(false);
    }

    @Override // com.amazonaws.auth.AWS4Signer
    public final String calculateContentHash(Request request) {
        long j;
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.m177("x-amz-content-sha256", AnnotationHandler.REQUIRED);
        if ((defaultRequest.m186() instanceof PutObjectRequest) || (defaultRequest.m186() instanceof UploadPartRequest)) {
            String str = (String) defaultRequest.m182().get("Content-Length");
            if (str != null) {
                j = Long.parseLong(str);
            } else {
                try {
                    InputStream inputStreamM172 = defaultRequest.m172();
                    if (!inputStreamM172.markSupported()) {
                        throw new AmazonClientException("Failed to get content length");
                    }
                    byte[] bArr = new byte[4096];
                    inputStreamM172.mark(-1);
                    long j2 = 0;
                    while (true) {
                        int i = inputStreamM172.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        j2 += (long) i;
                    }
                    inputStreamM172.reset();
                    j = j2;
                } catch (IOException e) {
                    throw new AmazonClientException("Cannot get the content-lenght of the request content.", e);
                }
            }
            defaultRequest.m177("x-amz-decoded-content-length", Long.toString(j));
            defaultRequest.m177("Content-Length", Long.toString(AwsChunkedEncodingInputStream.m208(j)));
            return "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";
        }
        return super.calculateContentHash(defaultRequest);
    }

    @Override // com.amazonaws.auth.AWS4Signer
    public final void processRequestPayload(Request request, AWS4Signer.HeaderSigningResult headerSigningResult) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        if ((defaultRequest.m186() instanceof PutObjectRequest) || (defaultRequest.m186() instanceof UploadPartRequest)) {
            defaultRequest.m175(new AwsChunkedEncodingInputStream(defaultRequest.m172(), headerSigningResult.m198(), headerSigningResult.m196(), headerSigningResult.m197(), BinaryUtils.m744(headerSigningResult.m199()), this));
        }
    }
}
