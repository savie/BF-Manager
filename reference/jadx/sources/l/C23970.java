package l;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: l.᩺֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31HA */
/* JADX INFO: loaded from: classes.dex */
public final class C23970 extends C18002 {
    @Override // l.C18002, l.C9052
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: ۙ */
    public final void mo1206(SSLSocket sSLSocket, String str, List list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C9052.m24177(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // l.C18002, l.C9052
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1208(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
