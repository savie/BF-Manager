package l;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.ۨ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public class C11379 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        c1145.m4212(inetAddress == null ? null : inetAddress.getHostAddress());
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        return InetAddress.getByName(c5379.m14922());
    }
}
