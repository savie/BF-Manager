package l;

import android.os.Build;
import android.util.Log;
import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ܿ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes5.dex */
public class C18002 extends C9052 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20986 f58950;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0849 f58951;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0849 f58952;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0849 f58953;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0849 f58954;

    public C18002(C0849 c0849, C0849 c08410, C0849 c08411, C0849 c08412) throws NoSuchMethodException {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", null);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f58950 = new C20986(method3, method2, method);
        this.f58951 = c0849;
        this.f58952 = c08410;
        this.f58954 = c08411;
        this.f58953 = c08412;
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ */
    public final void mo24182(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C19822.m45604(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ */
    public void mo1206(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f58951.m3463(sSLSocket, Boolean.TRUE);
            this.f58952.m3463(sSLSocket, str);
        }
        C0849 c0849 = this.f58953;
        if (c0849 == null || !c0849.m3464(sSLSocket)) {
            return;
        }
        C1879 c1879 = new C1879();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC4225 enumC4225 = (EnumC4225) list.get(i);
            if (enumC4225 != EnumC4225.HTTP_1_0) {
                c1879.m6455writeByte(enumC4225.toString().length());
                String string = enumC4225.toString();
                c1879.m6437(0, string.length(), string);
            }
        }
        try {
            c0849.m3462((Object) sSLSocket, c1879.mo4179());
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ᩷ */
    public String mo1208(SSLSocket sSLSocket) {
        C0849 c0849 = this.f58954;
        if (c0849 == null || !c0849.m3464(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) c0849.m3462((Object) sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, C19822.f63729);
            }
            return null;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ */
    public final void mo24180(int i, String str, Throwable th) {
        int iMin;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int iIndexOf = str.indexOf(10, i2);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i2 + OpenAuthTask.SYS_ERR);
                str.substring(i2, iMin);
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo24185() {
        return this.f58950.m47965();
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ */
    public final void mo24181(Object obj, String str) {
        if (this.f58950.m47966(obj)) {
            return;
        }
        mo24180(5, str, (Throwable) null);
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo24184(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m41973(cls, cls.getMethod("getInstance", null).invoke(null, null), str);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw C19822.m45592("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw C19822.m45592("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw C19822.m45592("unable to determine cleartext support", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41973(Class cls, Object obj, String str) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13527 mo24179(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C3832(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo24179(x509TrustManager);
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC22016 mo24186(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C14272(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo24186(x509TrustManager);
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ */
    public final SSLContext mo1205() {
        try {
            if (Build.VERSION.SDK_INT < 22) {
                try {
                    return SSLContext.getInstance("TLSv1.2");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            try {
                return SSLContext.getInstance("TLS");
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException("No TLS provider", e);
            }
        } catch (NoClassDefFoundError unused2) {
        }
    }
}
