package l;

/* JADX INFO: renamed from: l.ۘ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D906 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3822 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21524[] f14165;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f14166 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f14167 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f14164 = 0;

    public C3822(InterfaceC21524... interfaceC21524Arr) {
        this.f14165 = interfaceC21524Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21524[] m11112() {
        return this.f14165;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m11113() {
        return this.f14166;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m11115() {
        return this.f14167;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m11110() {
        return this.f14164;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3822 m11116(int i) {
        this.f14166 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3822 m11111(int i) {
        this.f14167 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3822 m11114(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("Lines must be >= 1");
        }
        this.f14164 = i;
        return this;
    }
}
