package l;

/* JADX INFO: renamed from: l.۬ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7704 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12942 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f43018;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1900 f43019;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2357 f43020;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7027 f43021;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f43022;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC0507 f43023;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f43024;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f43025;

    public C12942(InterfaceC0507 interfaceC0507, C1900 c1900, C7027 c7027, C2357 c2357, int i, int i2) {
        C13638.requireNonNull(interfaceC0507, "textOwner");
        this.f43023 = interfaceC0507;
        this.f43019 = c1900;
        C13638.requireNonNull(c7027, "store");
        this.f43021 = c7027;
        C13638.requireNonNull(c2357, "contexts");
        this.f43020 = c2357;
        this.f43018 = interfaceC0507.mo2395();
        int length = interfaceC0507.length();
        this.f43025 = length;
        C13638.checkFromToIndex(i, i2, length);
        if (c7027.m18860() != length || c2357.m7174() != i2 - i || !c2357.m7169(c2357.m7174(), c1900.f7183)) {
            throw new IllegalArgumentException("Syntax consumer context differs from display");
        }
        this.f43022 = i;
        this.f43024 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12942 m32061(InterfaceC2916 interfaceC2916, C1900 c1900, C7027 c7027, C2357 c2357) {
        return new C12942(interfaceC2916, c1900, c7027, c2357, 0, interfaceC2916.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12942 m32062(InterfaceC2916 interfaceC2916, C1900 c1900, C7027 c7027, C2357 c2357, int i, int i2) {
        return new C12942(interfaceC2916, c1900, c7027, c2357, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32069(InterfaceC2916 interfaceC2916, C1900 c1900) {
        return this.f43023 == interfaceC2916 && this.f43019 == c1900 && this.f43018 == interfaceC2916.mo2395() && this.f43025 == interfaceC2916.length();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m32073() {
        return this.f43025;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m32075(int i, int i2) {
        int i3 = this.f43025;
        C13638.checkFromToIndex(i, i2, i3);
        int i4 = this.f43024;
        int i5 = this.f43022;
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
    public final int m32066(int i) {
        C13638.checkIndex(i, this.f43025);
        m32059(i, i + 1);
        return this.f43020.m7167(i - this.f43022);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32067(int i, int i2) {
        m32059(i, i2);
        int i3 = this.f43022;
        C2357 c2357 = this.f43020;
        if (i == i2) {
            int i4 = this.f43025;
            if (i4 == 0) {
                return 0;
            }
            if (i >= i4) {
                i--;
            }
            return c2357.m7167(i - i3);
        }
        return c2357.m7168(i - i3, i2 - i3);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20889 m32072(int i, int i2) {
        return this.f43020.m7164(m32067(i, i2));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20889 m32071(int i) {
        return this.f43020.m7164(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m32070(int i) {
        return this.f43020.m7176(i) + this.f43022;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m32065(int i) {
        return this.f43020.m7172(i) + this.f43022;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m32074(int i) {
        return this.f43020.m7175(i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m32076(int i) {
        C13638.checkIndex(i, this.f43025);
        m32059(i, i + 1);
        return this.f43021.m18863(i).m37379();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7027 m32068() {
        return this.f43021;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m32059(int i, int i2) {
        if (!m32075(i, i2)) {
            throw new IllegalStateException("Syntax context is unknown outside coverage");
        }
    }
}
