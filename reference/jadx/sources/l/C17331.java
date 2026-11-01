package l;

/* JADX INFO: renamed from: l.ܿۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes5.dex */
public final class C17331 extends AbstractC0916 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6042 f55146;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17331(C6042 c6042) {
        super(c6042.f35021);
        this.f55146 = c6042;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17331(C6042 c6042, int i, int i2) {
        super(i, i2);
        this.f55146 = c6042;
    }

    @Override // l.AbstractC0916
    /* JADX INFO: renamed from: ܰ */
    public final int mo3638() {
        return this.f55146.f35020;
    }

    @Override // l.AbstractC2327
    /* JADX INFO: renamed from: ۙ */
    public final float mo7063(int i) {
        return this.f55146.f20519.f37398[i];
    }

    @Override // l.AbstractC2327
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11501 mo7064(int i, int i2) {
        return new C17331(this.f55146, i, i2);
    }

    @Override // l.AbstractC2327, l.InterfaceC10110
    /* JADX INFO: renamed from: ܰ */
    public final boolean tryAdvance(InterfaceC17767 interfaceC17767) {
        if (this.f8255 >= mo3637()) {
            return false;
        }
        float[] fArr = this.f55146.f20519.f37398;
        int i = this.f8255;
        this.f8255 = i + 1;
        interfaceC17767.mo35707(fArr[i]);
        return true;
    }

    @Override // l.AbstractC2327, l.AbstractC20154, l.InterfaceC10110
    /* JADX INFO: renamed from: ۙ */
    public final void forEachRemaining(InterfaceC17767 interfaceC17767) {
        float[] fArr = this.f55146.f20519.f37398;
        int iMo3637 = mo3637();
        while (true) {
            int i = this.f8255;
            if (i >= iMo3637) {
                return;
            }
            this.f8255 = i + 1;
            interfaceC17767.mo35707(fArr[i]);
        }
    }
}
