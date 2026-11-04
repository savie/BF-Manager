package l;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: l.֡֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4DV */
/* JADX INFO: loaded from: classes3.dex */
public final class C0103 extends C9052 {
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Provider m1203() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1206(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C9052.m24177(list).toArray(new String[0]));
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo1208(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SSLContext mo1205() {
        try {
            return SSLContext.getInstance("TLSv1.3", m1203());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m1203());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C0103 m1204() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new C0103();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // l.C9052
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1207(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
