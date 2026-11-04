package l;

/* JADX INFO: renamed from: l.ۡ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7704 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9736 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8246 f31405;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9629 f31406;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f31407;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f31408;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f31409;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1270 f31410;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f31411;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20661 f31412;

    public C9736(InterfaceC9629 interfaceC9629, C20661 c20661, C1270 c1270, C8246 c8246, int i, int i2) {
        C17359.requireNonNull(interfaceC9629, "textOwner");
        this.f31406 = interfaceC9629;
        this.f31412 = c20661;
        C17359.requireNonNull(c1270, "store");
        this.f31410 = c1270;
        C17359.requireNonNull(c8246, "contexts");
        this.f31405 = c8246;
        this.f31408 = interfaceC9629.mo15344();
        int length = interfaceC9629.length();
        this.f31409 = length;
        C17359.checkFromToIndex(i, i2, length);
        if (c1270.m4628() != length || c8246.m22191() != i2 - i || !c8246.m22184(c8246.m22191(), c20661.f66265)) {
            throw new IllegalArgumentException("Syntax consumer context differs from display");
        }
        this.f31407 = i;
        this.f31411 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9736 m25352(InterfaceC19106 interfaceC19106, C20661 c20661, C1270 c1270, C8246 c8246) {
        return new C9736(interfaceC19106, c20661, c1270, c8246, 0, interfaceC19106.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9736 m25353(InterfaceC19106 interfaceC19106, C20661 c20661, C1270 c1270, C8246 c8246, int i, int i2) {
        return new C9736(interfaceC19106, c20661, c1270, c8246, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25360(InterfaceC19106 interfaceC19106, C20661 c20661) {
        return this.f31406 == interfaceC19106 && this.f31412 == c20661 && this.f31408 == interfaceC19106.mo15344() && this.f31409 == interfaceC19106.length();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m25365() {
        return this.f31409;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m25367(int i, int i2) {
        int i3 = this.f31409;
        C17359.checkFromToIndex(i, i2, i3);
        int i4 = this.f31411;
        int i5 = this.f31407;
        if (i < i2) {
            return i5 <= i && i2 <= i4;
        }
        if (i3 == 0) {
            return i5 == 0 && i4 == 0;
        }
        if (i < i3) {
            return i5 <= i && i < i4;
        }
        return i4 == i3 && i5 < i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25357(int i) {
        C17359.checkIndex(i, this.f31409);
        m25356(i, i + 1);
        return this.f31405.m22182(i - this.f31407);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25358(int i, int i2) {
        m25356(i, i2);
        int i3 = this.f31407;
        C8246 c8246 = this.f31405;
        if (i == i2) {
            int i4 = this.f31409;
            if (i4 == 0) {
                return 0;
            }
            if (i >= i4) {
                i--;
            }
            return c8246.m22182(i - i3);
        }
        return c8246.m22183(i - i3, i2 - i3);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16800 m25362(int i, int i2) {
        return this.f31405.m22193(m25358(i, i2));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16800 m25361(int i) {
        return this.f31405.m22193(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m25364(int i) {
        return this.f31405.m22189(i) + this.f31407;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m25368(int i) {
        return this.f31405.m22186(i) + this.f31407;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m25366(int i) {
        return this.f31405.m22192(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m25363(int i) {
        C17359.checkIndex(i, this.f31409);
        m25356(i, i + 1);
        return this.f31410.m4631(i).m30045();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1270 m25359() {
        return this.f31410;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m25356(int i, int i2) {
        if (!m25367(i, i2)) {
            throw new IllegalStateException("Syntax context is unknown outside coverage");
        }
    }
}
