package l;

/* JADX INFO: renamed from: l.ᩴᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20013 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f64309;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f64310;

    @Override // l.C23174
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5474(AbstractC8036 abstractC8036) {
        if (abstractC8036 == null || this.f64310 == null) {
            return;
        }
        abstractC8036.mo2284(this);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1512(C12400 c12400) {
        if (C11239.m28352(c12400.f39896) == this.f64310) {
            this.f64309 = true;
        } else {
            super.mo1512(c12400);
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1495(C3561 c3561) {
        if (C11239.m28352(c3561.f12203) != this.f64310) {
            mo5474(c3561.f12203);
        } else {
            this.f64309 = true;
        }
    }
}
