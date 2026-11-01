package l;

/* JADX INFO: renamed from: l.᩷ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20652 extends AbstractC3924 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15714 f67223;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20652(C15714 c15714) {
        super(c15714.f57484);
        this.f67223 = c15714;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20652(C15714 c15714, int i, int i2) {
        super(i, i2);
        this.f67223 = c15714;
    }

    @Override // l.AbstractC3924
    /* JADX INFO: renamed from: ܰ */
    public final int mo11386() {
        return this.f67223.f57483;
    }

    @Override // l.AbstractC2513
    /* JADX INFO: renamed from: ۙ */
    public final char mo7699(int i) {
        return this.f67223.f50999.f63895[i];
    }

    @Override // l.AbstractC2513
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11687 mo7700(int i, int i2) {
        return new C20652(this.f67223, i, i2);
    }

    @Override // l.AbstractC2513, l.InterfaceC10110
    /* JADX INFO: renamed from: ܰ */
    public final boolean tryAdvance(InterfaceC1164 interfaceC1164) {
        if (this.f9970 >= mo4112()) {
            return false;
        }
        char[] cArr = this.f67223.f50999.f63895;
        int i = this.f9970;
        this.f9970 = i + 1;
        interfaceC1164.mo4297(cArr[i]);
        return true;
    }

    @Override // l.AbstractC2513, l.AbstractC10213, l.InterfaceC10110
    /* JADX INFO: renamed from: ۙ */
    public final void forEachRemaining(InterfaceC1164 interfaceC1164) {
        char[] cArr = this.f67223.f50999.f63895;
        int iMo4112 = mo4112();
        while (true) {
            int i = this.f9970;
            if (i >= iMo4112) {
                return;
            }
            this.f9970 = i + 1;
            interfaceC1164.mo4297(cArr[i]);
        }
    }
}
