package l;

/* JADX INFO: renamed from: l.֡ۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QY */
/* JADX INFO: loaded from: classes3.dex */
public final enum C0152 extends EnumC0898 {
    public /* synthetic */ C0152() {
        this("TYPE", 1, true);
    }

    public C0152(String str, int i, boolean z) {
        super(str, i, 0, z);
    }

    @Override // l.EnumC0898
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC0898 mo1347(EnumC21035 enumC21035) {
        int i = C14321.f45190[enumC21035.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return EnumC0898.f3330;
        }
        if (i == 4) {
            return EnumC0898.f3332;
        }
        throw new AssertionError();
    }
}
