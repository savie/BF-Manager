package l;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import java.net.URI;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۙ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4906 extends AmazonS3Client {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public URI f17200;

    static {
        SignerFactory.m223(C13975.class, "UnsignedPayloadSignerType");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13639(URI uri) {
        this.f17200 = uri;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13638(boolean z) {
        this.f464.m454(z);
    }

    @Override // com.amazonaws.services.s3.AmazonS3Client, com.amazonaws.AmazonWebServiceClient
    /* JADX INFO: renamed from: ۙ */
    public final void mo157(String str) {
        if (m13637(str)) {
            ClientConfiguration clientConfiguration = this.f84;
            clientConfiguration.m169();
            clientConfiguration.m174();
        }
        super.mo157(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m13637(String str) {
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
    public final void mo449(DefaultRequest defaultRequest, String str, String str2, URI uri) {
        if (this.f17200 != null && (defaultRequest.m189() instanceof GetObjectRequest)) {
            defaultRequest.m186(this.f17200);
            if (str2 != null && str2.startsWith("/")) {
                str2 = "/".concat(str2);
            }
            defaultRequest.m184(str2);
            return;
        }
        super.mo449(defaultRequest, str, str2, uri);
    }
}
