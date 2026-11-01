package l;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ۖᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T596 */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC2689 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f10377;

    public RunnableC2689(C0572 c0572, String str) {
        super(c0572);
        this.f10377 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM38890;
        String strM38120 = AbstractRunnableC16096.m38120(this.f10377);
        boolean zContains = strM38120.contains("|");
        C0572 c0572 = this.f52046;
        if (zContains && strM38120.contains("::")) {
            strM38890 = "550 No IPv6 support, reconfigure your client\r\n";
        } else {
            String[] strArrSplit = strM38120.split(",");
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
                            InetAddress inetAddress = c0572.m2709().getInetAddress();
                            if (inetAddress != null && !byAddress.equals(inetAddress)) {
                                strM38890 = "550 PORT host must match control connection\r\n";
                                break;
                            }
                            int i3 = (iArr[4] * 256) + iArr[5];
                            if (i3 == 0) {
                                strM38890 = "550 Invalid PORT argument: port 0\r\n";
                                break;
                            } else {
                                c0572.m2700(byAddress, i3);
                                strM38890 = null;
                                break;
                            }
                        } catch (UnknownHostException unused) {
                            strM38890 = "550 Unknown host\r\n";
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
                    strM38890 = C16523.m38890("550 Invalid PORT argument: ", str, "\r\n");
                    break;
                }
            }
            strM38890 = "550 Malformed PORT argument\r\n";
        }
        if (strM38890 == null) {
            c0572.m2708("200 PORT OK\r\n");
        } else {
            c0572.m2708(strM38890);
        }
    }
}
