package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class S3StringResponseHandler extends AbstractS3ResponseHandler {
    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ۙ */
    public final Object mo270(HttpResponse httpResponse) throws IOException {
        AmazonWebServiceResponse amazonWebServiceResponseM451 = AbstractS3ResponseHandler.m451(httpResponse);
        byte[] bArr = new byte[1024];
        StringBuilder sb = new StringBuilder();
        InputStream inputStreamM260 = httpResponse.m260();
        while (true) {
            int i = inputStreamM260.read(bArr);
            if (i > 0) {
                sb.append(new String(bArr, 0, i, StringUtils.f834));
            } else {
                amazonWebServiceResponseM451.m159(sb.toString());
                return amazonWebServiceResponseM451;
            }
        }
    }
}
