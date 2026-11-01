package l;

/* JADX INFO: renamed from: l.᩻ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QY */
/* JADX INFO: loaded from: classes.dex */
public final enum C23746 extends EnumC3283 {
    public /* synthetic */ C23746() {
        this("TYPE", 1, true);
    }

    public C23746(String str, int i, boolean z) {
        super(str, i, 0, z);
    }

    @Override // l.EnumC3283
    /* JADX INFO: renamed from: ۙ */
    public EnumC3283 mo6069(EnumC6106 enumC6106) {
        int i = C17395.f55362[enumC6106.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return EnumC3283.f12171;
        }
        if (i == 4) {
            return EnumC3283.f12169;
        }
        throw new AssertionError();
    }
}
