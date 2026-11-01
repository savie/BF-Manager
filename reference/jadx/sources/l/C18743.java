package l;

import android.os.Build;
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

/* JADX INFO: renamed from: l.ᩴۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 45RK */
/* JADX INFO: loaded from: classes4.dex */
public class C18743 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C18743 f60795;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Logger f60796;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo43295(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo11393(SSLSocket sSLSocket, String str, List list) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo18248(SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo11394(String str) {
        return true;
    }

    /* JADX INFO: renamed from: ܰ */
    public String mo11396(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C18743 m43294() {
        return f60795;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo11392(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo11390(int i, String str, Throwable th) {
        f60796.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: ܰ */
    public Object mo11395() {
        if (f60796.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo11391(Object obj, String str) {
        if (obj == null) {
            str = C15489.m37076(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo11390(5, str, (Throwable) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m43293(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC22013 enumC22013 = (EnumC22013) list.get(i);
            if (enumC22013 != EnumC22013.HTTP_1_0) {
                arrayList.add(enumC22013.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC10277 mo11389(X509TrustManager x509TrustManager) {
        return new C19449(mo11397(x509TrustManager));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    static {
        C18743 c22977;
        int i;
        boolean z;
        C18037 c18037;
        C18037 c18038;
        C18743 c21565 = null;
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
                        c22977 = new C5337(null, null, null, null);
                    } else {
                        c22977 = null;
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } else {
                c22977 = null;
            }
            if (c22977 == null) {
                if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                    try {
                        try {
                            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                        } catch (ClassNotFoundException unused3) {
                            Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
                        }
                        C18037 c18039 = new C18037(null, "setUseSessionTickets", Boolean.TYPE);
                        C18037 c180310 = new C18037(null, "setHostname", String.class);
                        if (Security.getProvider("GMSCore_OpenSSL") == null) {
                            try {
                                Class.forName("android.net.Network");
                            } catch (ClassNotFoundException unused4) {
                                z = false;
                            }
                        }
                        z = true;
                        if (z) {
                            c18037 = new C18037(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                            c18038 = new C18037(null, "setAlpnProtocols", byte[].class);
                        } else {
                            c18037 = null;
                            c18038 = null;
                        }
                        c21565 = new C3925(c18039, c180310, c18037, c18038);
                    } catch (ClassNotFoundException unused5) {
                    }
                }
                if (c21565 == null) {
                    throw new NullPointerException("No platform found on Android");
                }
            }
        } else {
            if (!("conscrypt".equals(System.getProperty("okhttp.platform")) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (c22977 = C6748.m18246()) == null) {
                try {
                    c22977 = new C22977(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (NoSuchMethodException unused6) {
                    c22977 = null;
                }
                if (c22977 == null) {
                    try {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        c21565 = new C21565(cls.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused7) {
                    }
                    c22977 = c21565 != null ? c21565 : new C18743();
                }
            }
        }
        f60795 = c22977;
        f60796 = Logger.getLogger(C5079.class.getName());
    }

    /* JADX INFO: renamed from: ۙ */
    public SSLContext mo11388() {
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

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC20860 mo11397(X509TrustManager x509TrustManager) {
        return new C8866(x509TrustManager.getAcceptedIssuers());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
