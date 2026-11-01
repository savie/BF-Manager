package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.֨ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1103 implements InterfaceC20860 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f5008;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final X509TrustManager f5009;

    public C1103(X509TrustManager x509TrustManager, Method method) {
        this.f5008 = method;
        this.f5009 = x509TrustManager;
    }

    @Override // l.InterfaceC20860
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final X509Certificate mo4113(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f5008.invoke(this.f5009, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException e) {
            throw C0140.m1222("unable to get issues and signature", (Exception) e);
        } catch (InvocationTargetException unused) {
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1103)) {
            return false;
        }
        C1103 c1103 = (C1103) obj;
        return this.f5009.equals(c1103.f5009) && this.f5008.equals(c1103.f5008);
    }

    public final int hashCode() {
        return (this.f5008.hashCode() * 31) + this.f5009.hashCode();
    }
}
