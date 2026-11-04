package l;

/* JADX INFO: renamed from: l.ۤ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11128 extends C0185 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC17836 f35081;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f35082;

    @Override // l.C0185, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
    }

    @Override // l.C0185, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        if (this.f35082) {
            return;
        }
        this.f35082 = true;
        try {
            super.mo1518(c16327);
        } finally {
            this.f35082 = false;
        }
    }

    @Override // l.C0185, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        this.f35081.mo7481(c12510.f40168);
        super.mo1513(c12510);
    }

    @Override // l.C0185
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo1537(C5816 c5816) {
        return this.f35081.mo7485(c5816) && c5816.f38069.f38066 == EnumC13603.f43218;
    }
}
