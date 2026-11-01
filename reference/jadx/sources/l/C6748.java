package l;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: l.ۜۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T4DV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6748 extends C18743 {
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Provider m18247() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ */
    public final void mo11393(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C18743.m43293(list).toArray(new String[0]));
        }
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ܰ */
    public final String mo11396(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ */
    public final SSLContext mo11388() {
        try {
            return SSLContext.getInstance("TLSv1.3", m18247());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m18247());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C6748 m18246() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new C6748();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // l.C18743
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18248(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
