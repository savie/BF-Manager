package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.ۘᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C55Y */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC4334 extends AbstractRunnableC15257 implements Runnable {
    public RunnableC4334(C5563 c5563, String str) {
        super(c5563);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5563 c5563 = this.f49894;
        int iM16490 = c5563.m16490();
        if (iM16490 == 0) {
            c5563.m16486("502 Couldn't open a port\r\n");
            return;
        }
        InetAddress inetAddressM16485 = c5563.m16485();
        if (inetAddressM16485 == null) {
            c5563.m16486("502 Couldn't open a port\r\n");
            return;
        }
        if (iM16490 < 1) {
            c5563.m16486("502 Couldn't open a port\r\n");
            return;
        }
        String hostAddress = inetAddressM16485.getHostAddress();
        if (hostAddress != null) {
            hostAddress = hostAddress.replace('.', ',');
        }
        StringBuilder sbM51387 = C22783.m51387("227 Entering Passive Mode (", hostAddress, ",");
        sbM51387.append(iM16490 / 256);
        sbM51387.append(",");
        sbM51387.append(iM16490 % 256);
        sbM51387.append(").\r\n");
        c5563.m16486(sbM51387.toString());
    }
}
