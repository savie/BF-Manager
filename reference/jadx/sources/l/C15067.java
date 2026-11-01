package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܶۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8IG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15067 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f49118;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f49119;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f49120;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f49121;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f49122;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f49123;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f49124;

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    public C15067(int i, int i2, String str) {
        this.f49123 = i;
        this.f49122 = i2;
        this.f49119 = str;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        int i = this.f49122;
        int i2 = this.f49123;
        C2023.m6510((i2 == -1 || i == -1) ? false : true);
        C2460 c2460 = new C2460(i);
        ((C14984) interfaceC7222).mo19219(false, 0, i, c2460.m7518());
        return c2460.m7519() == i2;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f49120 = interfaceC15690;
        InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(1024, 4);
        this.f49118 = interfaceC8011Mo7684;
        C10471 c10471 = new C10471();
        String str = this.f49119;
        c10471.m26521(str);
        c10471.m26533(str);
        interfaceC8011Mo7684.mo8116(c10471.m26497());
        this.f49120.mo7696();
        this.f49120.mo7690(new C21416());
        this.f49124 = 1;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) {
        int i = this.f49124;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC8011 interfaceC8011 = this.f49118;
        interfaceC8011.getClass();
        int iMo8111 = interfaceC8011.mo8111((InterfaceC6942) interfaceC7222, 1024, true);
        if (iMo8111 == -1) {
            this.f49124 = 2;
            this.f49118.mo8114(0L, 1, this.f49121, 0, null);
            this.f49121 = 0;
            return 0;
        }
        this.f49121 += iMo8111;
        return 0;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        if (j == 0 || this.f49124 == 1) {
            this.f49124 = 1;
            this.f49121 = 0;
        }
    }
}
