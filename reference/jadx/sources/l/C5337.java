package l;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: l.ۚۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 31HA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5337 extends C3925 {
    @Override // l.C3925, l.C18743
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: ۙ */
    public final void mo11393(SSLSocket sSLSocket, String str, List list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C18743.m43293(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // l.C3925, l.C18743
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: ܰ */
    public final String mo11396(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
