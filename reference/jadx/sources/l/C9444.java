package l;

import java.io.Closeable;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5QJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9444 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f30623;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C9444 f30624;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC4225 f30625;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C7954 f30626;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C5717 f30627;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long f30628;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C9444 f30629;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f30630;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f30631;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC8699 f30632;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9444 f30633;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11682 f30634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C12560 f30635;

    public C9444(C1242 c1242) {
        this.f30626 = c1242.f4502;
        this.f30625 = c1242.f4491;
        this.f30623 = c1242.f4494;
        this.f30630 = c1242.f4497;
        this.f30627 = c1242.f4501;
        C1988 c1988 = c1242.f4499;
        c1988.getClass();
        this.f30634 = new C11682(c1988);
        this.f30632 = c1242.f4492;
        this.f30624 = c1242.f4496;
        this.f30633 = c1242.f4500;
        this.f30629 = c1242.f4493;
        this.f30631 = c1242.f4498;
        this.f30628 = c1242.f4495;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C7954 m24826() {
        return this.f30626;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m24820() {
        return this.f30623;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m24819() {
        int i = this.f30623;
        return i >= 200 && i < 300;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m24825() {
        return this.f30630;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5717 m24823() {
        return this.f30627;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List m24821() {
        return this.f30634.m29365("Set-Cookie");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24817(String str) {
        String strM29361 = this.f30634.m29361(str);
        if (strM29361 != null) {
            return strM29361;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11682 m24822() {
        return this.f30634;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8699 m24818() {
        return this.f30632;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C1242 m24824() {
        C1242 c1242 = new C1242();
        c1242.f4502 = this.f30626;
        c1242.f4491 = this.f30625;
        c1242.f4494 = this.f30623;
        c1242.f4497 = this.f30630;
        c1242.f4501 = this.f30627;
        c1242.f4499 = this.f30634.m29362();
        c1242.f4492 = this.f30632;
        c1242.f4496 = this.f30624;
        c1242.f4500 = this.f30633;
        c1242.f4493 = this.f30629;
        c1242.f4498 = this.f30631;
        c1242.f4495 = this.f30628;
        return c1242;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C9444 m24828() {
        return this.f30629;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12560 m24827() {
        C12560 c12560 = this.f30635;
        if (c12560 != null) {
            return c12560;
        }
        C12560 c12560M31260 = C12560.m31260(this.f30634);
        this.f30635 = c12560M31260;
        return c12560M31260;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m24816() {
        return this.f30631;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long m24815() {
        return this.f30628;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC8699 abstractC8699 = this.f30632;
        if (abstractC8699 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC8699.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f30625 + ", code=" + this.f30623 + ", message=" + this.f30630 + ", url=" + this.f30626.f26430 + '}';
    }
}
