package l;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ᩳ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18254 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f58249;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f58250;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f58251;

    public C18254(InetAddress inetAddress, int i) {
        int iMax = Math.max(0, Math.min(32, i));
        this.f58250 = iMax;
        int i2 = iMax != 0 ? (int) (4294967295 << (32 - iMax)) : 0;
        this.f58249 = i2;
        this.f58251 = C8377.m21995(inetAddress) & i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42446(InetAddress inetAddress) {
        return (inetAddress instanceof Inet4Address) && (C8377.m21995(inetAddress) & this.f58249) == this.f58251;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InetAddress m42445() {
        int i = this.f58250;
        if (i == 0 || i >= 31) {
            return null;
        }
        int i2 = (~this.f58249) | this.f58251;
        int i3 = C8377.f29079;
        try {
            return InetAddress.getByAddress(new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
