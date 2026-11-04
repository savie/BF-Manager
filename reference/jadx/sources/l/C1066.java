package l;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.֨ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1066 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f3824;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f3825;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f3826;

    public C1066(InetAddress inetAddress, int i) {
        int iMax = Math.max(0, Math.min(32, i));
        this.f3825 = iMax;
        int i2 = iMax != 0 ? (int) (4294967295 << (32 - iMax)) : 0;
        this.f3824 = i2;
        this.f3826 = C2557.m8581(inetAddress) & i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4003(InetAddress inetAddress) {
        return (inetAddress instanceof Inet4Address) && (C2557.m8581(inetAddress) & this.f3824) == this.f3826;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InetAddress m4002() {
        int i = this.f3825;
        if (i == 0 || i >= 31) {
            return null;
        }
        int i2 = (~this.f3824) | this.f3826;
        int i3 = C2557.f8211;
        try {
            return InetAddress.getByAddress(new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
