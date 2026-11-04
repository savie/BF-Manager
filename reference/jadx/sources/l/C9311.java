package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T19G */
/* JADX INFO: loaded from: classes3.dex */
public final class C9311 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f30250;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f30251;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f30252;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final short f30253;

    public C9311(short s, int i, int i2, int i3) {
        this.f30253 = s;
        this.f30252 = i;
        this.f30250 = i2;
        this.f30251 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24537(int i) throws IOException {
        short s = this.f30253;
        if (s != i) {
            throw new IOException(String.format("Invalid chunk type: expected=0x%04x, got=0x%04x, offset=0x%04x", Integer.valueOf(i), Short.valueOf(s), Integer.valueOf(this.f30251)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9311 m24535(C16618 c16618) {
        int iM39314 = c16618.m39314();
        if (c16618.m39305() < 8) {
            return new C9311((short) -1, 0, 0, iM39314);
        }
        return new C9311(c16618.m39313(), c16618.m39311(), c16618.m39316(), iM39314);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9311 m24536(C20348 c20348) {
        int iM46744 = c20348.m46744();
        if (c20348.available() < 8) {
            return new C9311((short) -1, 0, 0, iM46744);
        }
        return new C9311(c20348.readShort(), c20348.m46749(), c20348.readInt(), iM46744);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9311 m24534(C13961 c13961) {
        int iM34027 = c13961.m34027();
        if (c13961.length() - ((long) iM34027) < 8) {
            return new C9311((short) -1, 0, 0, iM34027);
        }
        return new C9311((short) c13961.mo34029(), c13961.mo34029(), c13961.readInt(), iM34027);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24538(C20348 c20348) {
        c20348.seek(this.f30251 + this.f30250);
    }
}
