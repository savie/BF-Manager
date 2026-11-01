package l;

/* JADX INFO: renamed from: l.۟ᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes4.dex */
public final class C7630 extends C21035 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f25199;

    public C7630(EnumC0573 enumC0573, int i, int i2, String str, int i3, C21825 c21825) {
        super(enumC0573, i, i2, str, c21825);
        this.f25199 = i3;
    }

    @Override // l.C21035, l.C20330
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20176() {
        EnumC16097 enumC16097 = this.f65849.f2498;
        EnumC16097 enumC16098 = EnumC16097.NUMERIC;
        if (enumC16097 == enumC16098) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC16098);
    }

    @Override // l.C20330
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo20177() {
        return this.f25199;
    }
}
