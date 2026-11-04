package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.۟֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4CG */
/* JADX INFO: loaded from: classes4.dex */
public final class C7561 extends C9052 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Method f24929;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Method f24930;

    public C7561(Method method, Method method2) {
        this.f24930 = method;
        this.f24929 = method2;
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ */
    public final void mo1206(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayListM24177 = C9052.m24177(list);
            this.f24930.invoke(sSLParameters, arrayListM24177.toArray(new String[arrayListM24177.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C19822.m45592("unable to set ssl parameters", (Exception) e);
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1208(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f24929.invoke(sSLSocket, null);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException e) {
            throw C19822.m45592("failed to get ALPN selected protocol", (Exception) e);
        } catch (InvocationTargetException e2) {
            if (!(e2.getCause() instanceof UnsupportedOperationException)) {
                throw C19822.m45592("failed to get ALPN selected protocol", (Exception) e2);
            }
        }
    }
}
