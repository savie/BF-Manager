package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ܰ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14272 implements InterfaceC22016 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f45090;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final X509TrustManager f45091;

    public C14272(X509TrustManager x509TrustManager, Method method) {
        this.f45090 = method;
        this.f45091 = x509TrustManager;
    }

    @Override // l.InterfaceC22016
    /* JADX INFO: renamed from: ۙ */
    public final X509Certificate mo18990(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f45090.invoke(this.f45091, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException e) {
            throw C19822.m45592("unable to get issues and signature", (Exception) e);
        } catch (InvocationTargetException unused) {
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14272)) {
            return false;
        }
        C14272 c14272 = (C14272) obj;
        return this.f45091.equals(c14272.f45091) && this.f45090.equals(c14272.f45090);
    }

    public final int hashCode() {
        return (this.f45090.hashCode() * 31) + this.f45091.hashCode();
    }
}
