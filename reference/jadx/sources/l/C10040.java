package l;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.ۤۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10040 extends AbstractC7923 {
    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final void mo19179(C5100 c5100) {
        InetAddress inetAddress = this.f26022;
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
            c5100.m14209(address.length, address);
        }
    }

    @Override // l.AbstractC7923, l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final C0244 mo19176(boolean z) {
        C0244 c0244Mo19176 = super.mo19176(z);
        c0244Mo19176.m1644((Inet6Address) this.f26022);
        return c0244Mo19176;
    }
}
