package l;

import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ۡ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45RK */
/* JADX INFO: loaded from: classes3.dex */
public class C9052 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C9052 f29442;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Logger f29443;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo24183(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo1206(SSLSocket sSLSocket, String str, List list) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo1207(SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo24184(String str) {
        return true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public String mo1208(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C9052 m24178() {
        return f29442;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo24182(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo24180(int i, String str, Throwable th) {
        f29443.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object mo24185() {
        if (f29443.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo24181(Object obj, String str) {
        if (obj == null) {
            str = C14483.m34972(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo24180(5, str, (Throwable) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m24177(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC4225 enumC4225 = (EnumC4225) list.get(i);
            if (enumC4225 != EnumC4225.HTTP_1_0) {
                arrayList.add(enumC4225.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC13527 mo24179(X509TrustManager x509TrustManager) {
        return new C8307(mo24186(x509TrustManager));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    static {
        C9052 c7561;
        int i;
        boolean z;
        C0849 c0849;
        C0849 c08410;
        C9052 c9797 = null;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                try {
                    try {
                        i = Build.VERSION.SDK_INT;
                    } catch (NoClassDefFoundError unused) {
                        i = 0;
                    }
                    if (i >= 29) {
                        Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                        c7561 = new C23970(null, null, null, null);
                    } else {
                        c7561 = null;
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } else {
                c7561 = null;
            }
            if (c7561 == null) {
                if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                    try {
                        try {
                            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                        } catch (ClassNotFoundException unused3) {
                            Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
                        }
                        C0849 c08411 = new C0849(null, "setUseSessionTickets", Boolean.TYPE);
                        C0849 c08412 = new C0849(null, "setHostname", String.class);
                        if (Security.getProvider("GMSCore_OpenSSL") == null) {
                            try {
                                Class.forName("android.net.Network");
                            } catch (ClassNotFoundException unused4) {
                                z = false;
                            }
                        }
                        z = true;
                        if (z) {
                            c0849 = new C0849(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                            c08410 = new C0849(null, "setAlpnProtocols", byte[].class);
                        } else {
                            c0849 = null;
                            c08410 = null;
                        }
                        c9797 = new C18002(c08411, c08412, c0849, c08410);
                    } catch (ClassNotFoundException unused5) {
                    }
                }
                if (c9797 == null) {
                    throw new NullPointerException("No platform found on Android");
                }
            }
        } else {
            if (!("conscrypt".equals(System.getProperty("okhttp.platform")) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (c7561 = C0103.m1204()) == null) {
                try {
                    c7561 = new C7561(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (NoSuchMethodException unused6) {
                    c7561 = null;
                }
                if (c7561 == null) {
                    try {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        c9797 = new C9797(cls.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused7) {
                    }
                    c7561 = c9797 != null ? c9797 : new C9052();
                }
            }
        }
        f29442 = c7561;
        f29443 = Logger.getLogger(C24363.class.getName());
    }

    /* JADX INFO: renamed from: ۙ */
    public SSLContext mo1205() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
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
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC22016 mo24186(X509TrustManager x509TrustManager) {
        return new C6816(x509TrustManager.getAcceptedIssuers());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
