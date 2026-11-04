package l;

/* JADX INFO: renamed from: l.֨᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C1500 extends C9702 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f5228;

    public C1500(EnumC7466 enumC7466, int i, int i2, String str, int i3, C14769 c14769) {
        super(enumC7466, i, i2, str, c14769);
        this.f5228 = i3;
    }

    @Override // l.C9702, l.C8957
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5352() {
        EnumC2991 enumC2991 = this.f29212.f24715;
        EnumC2991 enumC2992 = EnumC2991.NUMERIC;
        if (enumC2991 == enumC2992) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC2992);
    }

    @Override // l.C8957
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo5353() {
        return this.f5228;
    }
}
