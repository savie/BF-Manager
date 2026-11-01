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

/* JADX INFO: renamed from: l.ۘۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes2.dex */
public class C3925 extends C18743 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C18037 f14633;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C18037 f14634;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18037 f14635;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13099 f14636;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18037 f14637;

    public C3925(C18037 c18037, C18037 c18038, C18037 c18039, C18037 c180310) throws NoSuchMethodException {
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
        this.f14636 = new C13099(method3, method2, method);
        this.f14633 = c18037;
        this.f14637 = c18038;
        this.f14634 = c18039;
        this.f14635 = c180310;
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11392(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C0140.m1234(e)) {
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

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo11393(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f14633.m42023(sSLSocket, Boolean.TRUE);
            this.f14637.m42023(sSLSocket, str);
        }
        C18037 c18037 = this.f14635;
        if (c18037 == null || !c18037.m42024(sSLSocket)) {
            return;
        }
        C6043 c6043 = new C6043();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC22013 enumC22013 = (EnumC22013) list.get(i);
            if (enumC22013 != EnumC22013.HTTP_1_0) {
                c6043.m16434writeByte(enumC22013.toString().length());
                String string = enumC22013.toString();
                c6043.m16408(0, string.length(), string);
            }
        }
        try {
            c18037.m42022((Object) sSLSocket, c6043.mo16422());
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

    @Override // l.C18743
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String mo11396(SSLSocket sSLSocket) {
        C18037 c18037 = this.f14634;
        if (c18037 == null || !c18037.m42024(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) c18037.m42022((Object) sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, C0140.f1178);
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

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11390(int i, String str, Throwable th) {
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

    @Override // l.C18743
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object mo11395() {
        return this.f14636.m32316();
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11391(Object obj, String str) {
        if (this.f14636.m32317(obj)) {
            return;
        }
        mo11390(5, str, (Throwable) null);
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11394(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m11387(cls, cls.getMethod("getInstance", null).invoke(null, null), str);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw C0140.m1222("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw C0140.m1222("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw C0140.m1222("unable to determine cleartext support", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11387(Class cls, Object obj, String str) {
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

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10277 mo11389(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C22271(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo11389(x509TrustManager);
        }
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20860 mo11397(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C1103(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo11397(x509TrustManager);
        }
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SSLContext mo11388() {
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
