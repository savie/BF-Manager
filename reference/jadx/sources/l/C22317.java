package l;

/* JADX INFO: renamed from: l.᩷᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22317 extends C14354 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f72243;

    @Override // l.C14354, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
    }

    @Override // l.C14354, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1510(C11018 c11018) {
        m8184(new C9133(c11018));
    }

    @Override // l.C14354, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        if (this.f72243 || c16327.m38748() == EnumC25033.EXPRESSION) {
            return;
        }
        this.f72243 = true;
        try {
            super.mo1518(c16327);
        } finally {
            this.f72243 = false;
        }
    }
}
