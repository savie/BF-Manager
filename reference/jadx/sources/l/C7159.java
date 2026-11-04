package l;

/* JADX INFO: renamed from: l.ۜ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8LH */
/* JADX INFO: loaded from: classes4.dex */
public final class C7159 implements InterfaceC4848 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4848 f23664;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13870 f23665;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f23666;

    public C7159(C13870 c13870, InterfaceC4848 interfaceC4848) {
        this.f23665 = c13870;
        this.f23664 = interfaceC4848;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19734() {
        this.f23666 = false;
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo14092() {
        return !this.f23665.m33812() && this.f23664.mo14092();
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final void mo14091() {
        this.f23664.mo14091();
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final int mo14090(C16461 c16461, C5690 c5690, int i) {
        C13870 c13870 = this.f23665;
        if (c13870.m33812()) {
            return -3;
        }
        if (this.f23666) {
            c5690.m33307(4);
            return -4;
        }
        long jMo6052 = c13870.mo6052();
        int iMo14090 = this.f23664.mo14090(c16461, c5690, i);
        if (iMo14090 == -5) {
            C15648 c15648 = c16461.f53378;
            c15648.getClass();
            int i2 = c15648.f50816;
            int i3 = c15648.f50851;
            if (i3 == 0 && i2 == 0) {
                return -5;
            }
            if (c13870.f43995 != 0) {
                i3 = 0;
            }
            if (c13870.f43997 != Long.MIN_VALUE) {
                i2 = 0;
            }
            C20124 c20124M37397 = c15648.m37397();
            c20124M37397.m46292(i3);
            c20124M37397.m46310(i2);
            c16461.f53378 = c20124M37397.m46295();
            return -5;
        }
        long j = c13870.f43997;
        if (j == Long.MIN_VALUE || ((iMo14090 != -4 || c5690.f19652 < j) && !(iMo14090 == -3 && jMo6052 == Long.MIN_VALUE && !c5690.f19654))) {
            return iMo14090;
        }
        c5690.mo7();
        c5690.m33307(4);
        this.f23666 = true;
        return -4;
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final int mo14089(long j) {
        if (this.f23665.m33812()) {
            return -3;
        }
        return this.f23664.mo14089(j);
    }
}
