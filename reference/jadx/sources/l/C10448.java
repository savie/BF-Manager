package l;

/* JADX INFO: renamed from: l.ۢ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes4.dex */
public final class C10448 extends C8957 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 f33253;

    public C10448(EnumC7466 enumC7466, int i, int i2, AbstractC19728 abstractC19728, C14769 c14769) {
        super(enumC7466, i, i2, c14769);
        this.f33253 = abstractC19728;
    }

    @Override // l.C8957
    /* JADX INFO: renamed from: ۙ */
    public final void mo5352() {
        EnumC2991 enumC2991 = this.f29212.f24715;
        EnumC2991 enumC2992 = EnumC2991.NAMED;
        if (enumC2991 == enumC2992) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC2992);
    }

    @Override // l.C8957
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC19728 mo23945() {
        return this.f33253;
    }
}
