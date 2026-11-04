package l;

/* JADX INFO: renamed from: l.ۧܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1FE */
/* JADX INFO: loaded from: classes4.dex */
public final class C11702 implements InterfaceC18525 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5737 f37867;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9829 f37868 = new C9829();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16923 f37869;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C2008 f37870;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C2008 f37871;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f37872;

    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14234(String str) {
        C2008 c2008 = new C2008();
        c2008.f6679 = str;
        C2008 c2009 = this.f37871;
        C9829 c9829 = this.f37868;
        if (c2009 == null) {
            this.f37871 = c2008;
        } else {
            ((C2008) c9829.m52130()).f6680.add(c2008);
        }
        c9829.add(c2008);
        this.f37870 = c2008;
        this.f37872 = 1;
    }

    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ۙ */
    public final void mo14233(String str, String str2) {
        C5737 c5737 = new C5737();
        c5737.f19745 = str;
        c5737.f19750 = str2;
        C9829 c9829 = this.f37868;
        int i = ((C2008) c9829.m52130()).f74367;
        c5737.f19744 = i;
        c5737.f19753 = i;
        ((C2008) c9829.m52130()).f6681.add(c5737);
        this.f37867 = c5737;
        this.f37872 = 2;
    }

    @Override // l.InterfaceC18525
    public final void text(String str) {
        if (this.f37872 == 3) {
            C16923 c16923 = this.f37869;
            CharSequence charSequence = c16923.f55314;
            if (charSequence instanceof StringBuilder) {
                ((StringBuilder) charSequence).append(str);
                return;
            }
            StringBuilder sb = new StringBuilder(charSequence);
            sb.append(str);
            c16923.f55314 = sb;
            return;
        }
        C16923 c16924 = new C16923();
        c16924.f55314 = str;
        ((C2008) this.f37868.m52130()).f6680.add(c16924);
        this.f37869 = c16924;
        this.f37872 = 3;
    }

    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ۙ */
    public final void mo14232(String str) {
        if (!((C2008) this.f37868.pop()).f6679.equals(str)) {
            throw new RuntimeException();
        }
        this.f37872 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2008 m29372() {
        if (this.f37871 == null || !this.f37868.isEmpty()) {
            throw new RuntimeException();
        }
        return this.f37871;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29376(int i, int i2, int i3) {
        if (this.f37872 != 1) {
            throw new IllegalStateException();
        }
        C2008 c2008 = this.f37870;
        c2008.f74367 = i;
        c2008.f74366 = i2;
        c2008.f74369 = i3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29375(int i) {
        int i2 = this.f37872;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException();
        }
        this.f37870.f74368 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29374(int i, int i2, int i3) {
        if (this.f37872 != 2) {
            throw new IllegalStateException();
        }
        C5737 c5737 = this.f37867;
        c5737.f19753 = i;
        c5737.f19752 = i2;
        c5737.f19751 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29373(int i) {
        if (this.f37872 != 2) {
            throw new IllegalStateException();
        }
        this.f37867.f19747 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29378(int i, int i2, int i3) {
        if (this.f37872 != 2) {
            throw new IllegalStateException();
        }
        C5737 c5737 = this.f37867;
        c5737.f19744 = i;
        c5737.f19749 = i2;
        c5737.f19748 = i3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29377(int i) {
        if (this.f37872 != 2) {
            throw new IllegalStateException();
        }
        this.f37867.f19746 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m29381(int i, int i2, int i3) {
        if (this.f37872 != 3) {
            throw new IllegalStateException();
        }
        C16923 c16923 = this.f37869;
        c16923.f74367 = i;
        c16923.f74366 = i2;
        c16923.f74369 = i3;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m29380(int i) {
        if (this.f37872 != 3) {
            throw new IllegalStateException();
        }
        this.f37869.f74368 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m29379() {
        return this.f37872 == 3;
    }
}
