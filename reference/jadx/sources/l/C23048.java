package l;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSCredentials;

/* JADX INFO: renamed from: l.᩸᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C7UE */
/* JADX INFO: loaded from: classes2.dex */
public final class C23048 extends AWS4Signer {
    @Override // com.amazonaws.auth.AWS4Signer
    public final String calculateContentHash(Request request) {
        return "UNSIGNED-PAYLOAD";
    }

    public C23048() {
        super(false);
        setServiceName("s3");
        setRegionName("auto");
    }

    @Override // com.amazonaws.auth.AWS4Signer, com.amazonaws.auth.Signer
    public final void sign(Request request, AWSCredentials aWSCredentials) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        if (defaultRequest.m182().get("x-amz-content-sha256") == null) {
            defaultRequest.m177("x-amz-content-sha256", "UNSIGNED-PAYLOAD");
        }
        super.sign(defaultRequest, aWSCredentials);
    }
}
