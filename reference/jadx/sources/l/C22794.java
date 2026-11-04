package l;

/* JADX INFO: renamed from: l.᩸ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes2.dex */
public final class C22794 extends AbstractC12177 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19810 f73920;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22794(C19810 c19810) {
        super(c19810.f31088);
        this.f73920 = c19810;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22794(C19810 c19810, int i, int i2) {
        super(i, i2);
        this.f73920 = c19810;
    }

    @Override // l.AbstractC12177
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9527() {
        return this.f73920.f31089;
    }

    @Override // l.AbstractC23366
    /* JADX INFO: renamed from: ۙ */
    public final float mo9525(int i) {
        return this.f73920.f63682.f50088[i];
    }

    @Override // l.AbstractC23366
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15906 mo9526(int i, int i2) {
        return new C22794(this.f73920, i, i2);
    }

    @Override // l.AbstractC23366, l.InterfaceC9154
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean tryAdvance(InterfaceC0419 interfaceC0419) {
        if (this.f75652 >= mo30440()) {
            return false;
        }
        float[] fArr = this.f73920.f63682.f50088;
        int i = this.f75652;
        this.f75652 = i + 1;
        interfaceC0419.mo2223(fArr[i]);
        return true;
    }

    @Override // l.AbstractC23366, l.AbstractC14083, l.InterfaceC9154
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void forEachRemaining(InterfaceC0419 interfaceC0419) {
        float[] fArr = this.f73920.f63682.f50088;
        int iMo30440 = mo30440();
        while (true) {
            int i = this.f75652;
            if (i >= iMo30440) {
                return;
            }
            this.f75652 = i + 1;
            interfaceC0419.mo2223(fArr[i]);
        }
    }
}
