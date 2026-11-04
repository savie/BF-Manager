package l;

/* JADX INFO: renamed from: l.۫ܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6ES */
/* JADX INFO: loaded from: classes4.dex */
public final class C13145 extends AbstractC16700 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f42041 = C16980.m40037(C13145.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3560 f42042;

    public C13145(InterfaceC3560 interfaceC3560) {
        this.f42042 = interfaceC3560;
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        try {
            this.f42042.m11607();
        } catch (Exception | StackOverflowError e) {
            f42041.mo13718("Error in decompile pass init: {}", this, e);
        }
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        try {
            return this.f42042.m11609();
        } catch (Exception | StackOverflowError e) {
            c24927.getClass();
            C23977.m53506(c24927, "Error in decompile pass: " + this, e);
            return false;
        }
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        try {
            this.f42042.m11608();
        } catch (Exception | StackOverflowError e) {
            c2551.getClass();
            C23977.m53506(c2551, "Error in decompile pass: " + this, e);
        }
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        this.f42042.m41522();
        throw null;
    }
}
