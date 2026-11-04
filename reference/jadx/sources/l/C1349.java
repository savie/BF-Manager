package l;

/* JADX INFO: renamed from: l.֨ᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C1349 extends EnumC8806 {
    public /* synthetic */ C1349() {
        this("PLAINTEXT", 6);
    }

    public C1349(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        char cM54678 = c24448.m54678();
        if (cM54678 == 0) {
            c8260.m22262(this);
            c24448.m54665();
            c8260.m22253((char) 65533);
        } else if (cM54678 == 65535) {
            c8260.m22257(new C17955());
        } else {
            c8260.m22254(c24448.m54662((char) 0));
        }
    }
}
