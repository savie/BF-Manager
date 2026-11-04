package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۢ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C9797 extends C9052 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Class f31579;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Class f31580;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f31581;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Method f31582;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Method f31583;

    public C9797(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f31582 = method;
        this.f31583 = method2;
        this.f31581 = method3;
        this.f31579 = cls;
        this.f31580 = cls2;
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ */
    public final void mo1206(SSLSocket sSLSocket, String str, List list) {
        try {
            this.f31582.invoke(null, sSLSocket, Proxy.newProxyInstance(C9052.class.getClassLoader(), new Class[]{this.f31579, this.f31580}, new C18748(C9052.m24177(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C19822.m45592("unable to set alpn", (Exception) e);
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ */
    public final void mo24183(SSLSocket sSLSocket) {
        try {
            this.f31581.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C19822.m45592("unable to remove alpn", (Exception) e);
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1208(SSLSocket sSLSocket) {
        try {
            C18748 c18748 = (C18748) Proxy.getInvocationHandler(this.f31583.invoke(null, sSLSocket));
            boolean z = c18748.f60907;
            if (!z && c18748.f60908 == null) {
                C9052.m24178().mo24180(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z) {
                return null;
            }
            return c18748.f60908;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C19822.m45592("unable to get selected protocol", (Exception) e);
        }
    }
}
