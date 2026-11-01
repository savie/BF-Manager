package l;

/* JADX INFO: renamed from: l.ۢܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QY */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9635 extends EnumC3283 {
    public /* synthetic */ C9635() {
        this("AMBIGUOUS", 4, false);
    }

    public C9635(String str, int i, boolean z) {
        super(str, i, 0, z);
    }

    @Override // l.EnumC3283
    /* JADX INFO: renamed from: ۙ */
    public EnumC3283 mo6069(EnumC6106 enumC6106) {
        int i = C17395.f55362[enumC6106.ordinal()];
        if (i == 1) {
            return EnumC3283.f12168;
        }
        if (i == 2 || i == 3) {
            return EnumC3283.f12170;
        }
        if (i == 4) {
            return EnumC3283.f12169;
        }
        throw new AssertionError();
    }
}
