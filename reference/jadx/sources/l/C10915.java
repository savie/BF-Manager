package l;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import java.net.URI;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۤܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7TX */
/* JADX INFO: loaded from: classes4.dex */
public final class C10915 extends AmazonS3Client {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public URI f34545;

    static {
        SignerFactory.m217(C23048.class, "UnsignedPayloadSignerType");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27691(URI uri) {
        this.f34545 = uri;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27690(boolean z) {
        this.f454.m448(z);
    }

    @Override // com.amazonaws.services.s3.AmazonS3Client, com.amazonaws.AmazonWebServiceClient
    /* JADX INFO: renamed from: ۙ */
    public final void mo151(String str) {
        if (m27689(str)) {
            ClientConfiguration clientConfiguration = this.f74;
            clientConfiguration.m161();
            clientConfiguration.m164();
        }
        super.mo151(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m27689(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int iIndexOf = lowerCase.indexOf("://");
        if (iIndexOf >= 0) {
            lowerCase = lowerCase.substring(iIndexOf + 3);
        }
        int iIndexOf2 = lowerCase.indexOf(47);
        if (iIndexOf2 >= 0) {
            lowerCase = lowerCase.substring(0, iIndexOf2);
        }
        int iIndexOf3 = lowerCase.indexOf(58);
        if (iIndexOf3 >= 0) {
            lowerCase = lowerCase.substring(0, iIndexOf3);
        }
        return "s3.cstcloud.cn".equals(lowerCase);
    }

    @Override // com.amazonaws.services.s3.AmazonS3Client
    /* JADX INFO: renamed from: ۙ */
    public final void mo443(DefaultRequest defaultRequest, String str, String str2, URI uri) {
        if (this.f34545 != null && (defaultRequest.m186() instanceof GetObjectRequest)) {
            defaultRequest.m178(this.f34545);
            if (str2 != null && str2.startsWith("/")) {
                str2 = "/".concat(str2);
            }
            defaultRequest.m176(str2);
            return;
        }
        super.mo443(defaultRequest, str, str2, uri);
    }
}
