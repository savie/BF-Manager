package l;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ܰᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T596 */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC14774 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f48344;

    public RunnableC14774(C5563 c5563, String str) {
        super(c5563);
        this.f48344 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM34865;
        String strM36601 = AbstractRunnableC15257.m36601(this.f48344);
        boolean zContains = strM36601.contains("|");
        C5563 c5563 = this.f49894;
        if (zContains && strM36601.contains("::")) {
            strM34865 = "550 No IPv6 support, reconfigure your client\r\n";
        } else {
            String[] strArrSplit = strM36601.split(",");
            if (strArrSplit.length == 6) {
                int[] iArr = new int[6];
                int i = 0;
                while (true) {
                    if (i >= strArrSplit.length) {
                        byte[] bArr = new byte[4];
                        for (int i2 = 0; i2 < 4; i2++) {
                            bArr[i2] = (byte) iArr[i2];
                        }
                        try {
                            InetAddress byAddress = InetAddress.getByAddress(bArr);
                            InetAddress inetAddress = c5563.m16484().getInetAddress();
                            if (inetAddress != null && !byAddress.equals(inetAddress)) {
                                strM34865 = "550 PORT host must match control connection\r\n";
                                break;
                            }
                            int i3 = (iArr[4] * 256) + iArr[5];
                            if (i3 == 0) {
                                strM34865 = "550 Invalid PORT argument: port 0\r\n";
                                break;
                            } else {
                                c5563.m16479(byAddress, i3);
                                strM34865 = null;
                                break;
                            }
                        } catch (UnknownHostException unused) {
                            strM34865 = "550 Unknown host\r\n";
                            break;
                        }
                    }
                    String str = strArrSplit[i];
                    if (str.matches("[0-9]+") && str.length() <= 3) {
                        int i4 = Integer.parseInt(str);
                        iArr[i] = i4;
                        if (i4 <= 255) {
                            i++;
                        }
                    }
                    strM34865 = C14442.m34865("550 Invalid PORT argument: ", str, "\r\n");
                    break;
                }
            }
            strM34865 = "550 Malformed PORT argument\r\n";
        }
        if (strM34865 == null) {
            c5563.m16486("200 PORT OK\r\n");
        } else {
            c5563.m16486(strM34865);
        }
    }
}
