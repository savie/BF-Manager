package l;

import com.alipay.sdk.m.p.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: l.᩹ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22271 extends AbstractC10277 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f72783;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f72784;

    public final int hashCode() {
        return 0;
    }

    public C22271(Object obj, Method method) {
        this.f72784 = obj;
        this.f72783 = method;
    }

    @Override // l.AbstractC10277
    /* JADX INFO: renamed from: ۙ */
    public final List mo26071(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return (List) this.f72783.invoke(this.f72784, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), d.a, str);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof C22271;
    }
}
