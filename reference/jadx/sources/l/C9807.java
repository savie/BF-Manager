package l;

/* JADX INFO: renamed from: l.ۢ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9807 implements InterfaceC1941 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC1941 f33547;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23130 f33548;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f33549 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC4784 f33550;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f33551;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC2044 f33552;

    public C9807(InterfaceC2044 interfaceC2044, InterfaceC11593 interfaceC11593) {
        this.f33552 = interfaceC2044;
        this.f33548 = new C23130(interfaceC11593);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24911() {
        this.f33551 = true;
        this.f33548.m51130();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m24914() {
        this.f33551 = false;
        this.f33548.m51132();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24912(long j) {
        this.f33548.m51131(j);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m24915(InterfaceC4784 interfaceC4784) throws C2170 {
        InterfaceC1941 interfaceC1941;
        InterfaceC1941 interfaceC1941Mo13265 = interfaceC4784.mo13265();
        if (interfaceC1941Mo13265 == null || interfaceC1941Mo13265 == (interfaceC1941 = this.f33547)) {
            return;
        }
        if (interfaceC1941 != null) {
            throw C2170.m6757(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f33547 = interfaceC1941Mo13265;
        this.f33550 = interfaceC4784;
        interfaceC1941Mo13265.mo6301(this.f33548.mo6303());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24913(InterfaceC4784 interfaceC4784) {
        if (interfaceC4784 == this.f33550) {
            this.f33547 = null;
            this.f33550 = null;
            this.f33549 = true;
        }
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ᩴ */
    public final long mo6304() {
        if (this.f33549) {
            return this.f33548.mo6304();
        }
        InterfaceC1941 interfaceC1941 = this.f33547;
        interfaceC1941.getClass();
        return interfaceC1941.mo6304();
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo6302() {
        if (this.f33549) {
            this.f33548.getClass();
            return false;
        }
        InterfaceC1941 interfaceC1941 = this.f33547;
        interfaceC1941.getClass();
        return interfaceC1941.mo6302();
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۙ */
    public final void mo6301(C21449 c21449) {
        InterfaceC1941 interfaceC1941 = this.f33547;
        if (interfaceC1941 != null) {
            interfaceC1941.mo6301(c21449);
            c21449 = this.f33547.mo6303();
        }
        this.f33548.mo6301(c21449);
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۨ */
    public final C21449 mo6303() {
        InterfaceC1941 interfaceC1941 = this.f33547;
        if (interfaceC1941 != null) {
            return interfaceC1941.mo6303();
        }
        return this.f33548.mo6303();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m24910(boolean z) {
        C21449 c21449Mo6303;
        InterfaceC4784 interfaceC4784 = this.f33550;
        C23130 c23130 = this.f33548;
        if (interfaceC4784 == null || interfaceC4784.mo13268() || ((z && this.f33550.getState() != 2) || (!this.f33550.mo13264() && (z || this.f33550.mo13253())))) {
            this.f33549 = true;
            if (this.f33551) {
                c23130.m51130();
            }
        } else {
            InterfaceC1941 interfaceC1941 = this.f33547;
            interfaceC1941.getClass();
            long jMo6304 = interfaceC1941.mo6304();
            if (!this.f33549) {
                c23130.m51131(jMo6304);
                c21449Mo6303 = interfaceC1941.mo6303();
                if (!c21449Mo6303.equals(c23130.mo6303())) {
                    c23130.mo6301(c21449Mo6303);
                    ((C0530) this.f33552).m2533(c21449Mo6303);
                }
            } else if (jMo6304 < c23130.mo6304()) {
                c23130.m51132();
            } else {
                this.f33549 = false;
                if (this.f33551) {
                    c23130.m51130();
                }
                c23130.m51131(jMo6304);
                c21449Mo6303 = interfaceC1941.mo6303();
                if (!c21449Mo6303.equals(c23130.mo6303())) {
                    c23130.mo6301(c21449Mo6303);
                    ((C0530) this.f33552).m2533(c21449Mo6303);
                }
            }
        }
        return mo6304();
    }
}
