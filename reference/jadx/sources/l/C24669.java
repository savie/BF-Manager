package l;

/* JADX INFO: renamed from: l.᩻֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes.dex */
public final enum C24669 extends EnumC15717 {
    public /* synthetic */ C24669() {
        this("Text", 7);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        if (abstractC0802.f2843 == EnumC9750.Character) {
            c4310.m13750((C3785) abstractC0802);
            return true;
        }
        if (abstractC0802.m3221()) {
            c4310.m13755(this);
            c4310.m13770();
            c4310.m13765(c4310.m13788());
            return c4310.mo13758(abstractC0802);
        }
        if (!abstractC0802.m3218()) {
            return true;
        }
        c4310.m13770();
        c4310.m13765(c4310.m13788());
        return true;
    }

    public C24669(String str, int i) {
        super(str, i, 0);
    }
}
