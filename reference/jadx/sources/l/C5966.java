package l;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.ۚ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5966 extends AbstractC20136 {
    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final void mo7635(C10219 c10219) {
        InetAddress inetAddress = this.f64714;
        if (inetAddress != null) {
            byte[] address = inetAddress.getAddress();
            if (inetAddress instanceof Inet4Address) {
                byte[] bArr = new byte[16];
                for (int i = 0; i < 16; i++) {
                    if (i < 11) {
                        bArr[i] = address[i - 12];
                    } else {
                        bArr[i] = 0;
                    }
                }
                address = bArr;
            }
            c10219.m26354(address.length, address);
        }
    }

    @Override // l.AbstractC20136, l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final C17307 mo7633(boolean z) {
        C17307 c17307Mo7633 = super.mo7633(z);
        c17307Mo7633.m40639((Inet6Address) this.f64714);
        return c17307Mo7633;
    }
}
