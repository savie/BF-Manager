package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۧ۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11614 extends AbstractC10892 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f36444;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f36445;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f36446;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f36447;

    public C11614(C24975 c24975, C8565 c8565) {
        this.f36445 = c24975;
        this.f36444 = c24975.m55822(c8565.m22996());
        int iM22996 = c8565.m22996();
        this.f36447 = iM22996;
        this.f36446 = c8565.m23001();
        m29185(c8565, iM22996);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29184(C8565 c8565) {
        c8565.m23000();
        m29185(c8565, c8565.m22996());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29185(C8565 c8565, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            c8565.m23000();
            AbstractC21976.m49711(c8565);
        }
    }

    @Override // l.InterfaceC15299
    public final String getType() {
        return this.f36444;
    }

    @Override // l.InterfaceC15299
    public final Set getElements() {
        return new C1920(this, this.f36445, this.f36446, this.f36447);
    }
}
