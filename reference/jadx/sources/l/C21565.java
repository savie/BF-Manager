package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.᩸ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J4EF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21565 extends C18743 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Class f70008;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Method f70009;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Method f70010;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Class f70011;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Method f70012;

    public C21565(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f70010 = method;
        this.f70009 = method2;
        this.f70012 = method3;
        this.f70011 = cls;
        this.f70008 = cls2;
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ */
    public final void mo11393(SSLSocket sSLSocket, String str, List list) {
        try {
            this.f70010.invoke(null, sSLSocket, Proxy.newProxyInstance(C18743.class.getClassLoader(), new Class[]{this.f70011, this.f70008}, new C15216(C18743.m43293(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0140.m1222("unable to set alpn", (Exception) e);
        }
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ */
    public final void mo43295(SSLSocket sSLSocket) {
        try {
            this.f70012.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0140.m1222("unable to remove alpn", (Exception) e);
        }
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ܰ */
    public final String mo11396(SSLSocket sSLSocket) {
        try {
            C15216 c15216 = (C15216) Proxy.getInvocationHandler(this.f70009.invoke(null, sSLSocket));
            boolean z = c15216.f49623;
            if (!z && c15216.f49625 == null) {
                C18743.m43294().mo11390(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z) {
                return null;
            }
            return c15216.f49625;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0140.m1222("unable to get selected protocol", (Exception) e);
        }
    }
}
