package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۫᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12651 implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f42260;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f42261;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f42262;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f42263;

    public C12651(int i, int i2, int i3, String str) {
        this.f42260 = i;
        this.f42262 = i2;
        this.f42261 = i3;
        this.f42263 = str;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m31442() {
        return this.f42260;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char m31446() {
        return C13672.m33377(this.f42260);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m31444() {
        return this.f42260 & 4095;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m31447() {
        return this.f42262;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31443() {
        return this.f42261;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m31445() {
        return this.f42263;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtExtras{mode=");
        sb.append(this.f42260);
        sb.append(", uid=");
        sb.append(this.f42262);
        sb.append(", gid=");
        sb.append(this.f42261);
        sb.append(", link='");
        return C22697.m50267(sb, this.f42263, "'}");
    }
}
