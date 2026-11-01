package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.ۨᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C55Y */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC11863 extends AbstractRunnableC16096 implements Runnable {
    public RunnableC11863(C0572 c0572, String str) {
        super(c0572);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0572 c0572 = this.f52046;
        int iM2715 = c0572.m2715();
        if (iM2715 == 0) {
            c0572.m2708("502 Couldn't open a port\r\n");
            return;
        }
        InetAddress inetAddressM2707 = c0572.m2707();
        if (inetAddressM2707 == null) {
            c0572.m2708("502 Couldn't open a port\r\n");
            return;
        }
        if (iM2715 < 1) {
            c0572.m2708("502 Couldn't open a port\r\n");
            return;
        }
        String hostAddress = inetAddressM2707.getHostAddress();
        if (hostAddress != null) {
            hostAddress = hostAddress.replace('.', ',');
        }
        StringBuilder sbM30914 = C12441.m30914("227 Entering Passive Mode (", hostAddress, ",");
        sbM30914.append(iM2715 / 256);
        sbM30914.append(",");
        sbM30914.append(iM2715 % 256);
        sbM30914.append(").\r\n");
        c0572.m2708(sbM30914.toString());
    }
}
