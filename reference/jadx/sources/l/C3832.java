package l;

import com.alipay.sdk.m.p.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: l.ۘ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3832 extends AbstractC13527 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f13065;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f13066;

    public final int hashCode() {
        return 0;
    }

    public C3832(Object obj, Method method) {
        this.f13066 = obj;
        this.f13065 = method;
    }

    @Override // l.AbstractC13527
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo12371(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return (List) this.f13065.invoke(this.f13066, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), d.a, str);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof C3832;
    }
}
