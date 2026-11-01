package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.᩺ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4CG */
/* JADX INFO: loaded from: classes.dex */
public final class C22977 extends C18743 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Method f74679;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Method f74680;

    public C22977(Method method, Method method2) {
        this.f74679 = method;
        this.f74680 = method2;
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ */
    public final void mo11393(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayListM43293 = C18743.m43293(list);
            this.f74679.invoke(sSLParameters, arrayListM43293.toArray(new String[arrayListM43293.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0140.m1222("unable to set ssl parameters", (Exception) e);
        }
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ܰ */
    public final String mo11396(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f74680.invoke(sSLSocket, null);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException e) {
            throw C0140.m1222("failed to get ALPN selected protocol", (Exception) e);
        } catch (InvocationTargetException e2) {
            if (!(e2.getCause() instanceof UnsupportedOperationException)) {
                throw C0140.m1222("failed to get ALPN selected protocol", (Exception) e2);
            }
        }
    }
}
