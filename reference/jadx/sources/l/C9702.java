package l;

/* JADX INFO: renamed from: l.ۡ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes4.dex */
public class C9702 extends C8957 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f31330;

    public C9702(EnumC7466 enumC7466, int i, int i2, String str, C14769 c14769) {
        super(enumC7466, i, i2, c14769);
        this.f31330 = str;
    }

    @Override // l.C8957
    /* JADX INFO: renamed from: ۙ */
    public void mo5352() {
        EnumC2991 enumC2991 = this.f29212.f24715;
        EnumC2991 enumC2992 = EnumC2991.STRING;
        if (enumC2991 == enumC2992) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC2992);
    }

    @Override // l.C8957
    /* JADX INFO: renamed from: ܳ */
    public final String mo23943() {
        return this.f31330;
    }
}
