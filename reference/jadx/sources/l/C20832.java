package l;

/* JADX INFO: renamed from: l.᩷ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20832 extends C3897 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f67696;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC9462 f67697;

    @Override // l.C3897, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
    }

    @Override // l.C3897, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        if (this.f67696) {
            return;
        }
        this.f67696 = true;
        try {
            super.mo3959(c22489);
        } finally {
            this.f67696 = false;
        }
    }

    @Override // l.C3897, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        this.f67697.mo24224(c6656.f22475);
        super.mo3928(c6656);
    }

    @Override // l.C3897
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo11351(C6263 c6263) {
        return this.f67697.mo9331(c6263) && c6263.f77448.f77452 == EnumC10477.f35879;
    }
}
