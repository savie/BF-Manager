package l;

/* JADX INFO: renamed from: l.᩵ܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19542 extends EnumC19730 {
    public /* synthetic */ C19542(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("WARNUNCHECKED", 54, "-warnunchecked", null, enumC19024, enumC18318);
    }

    public C19542(String str, int i, String str2, String str3, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2367(AbstractC10558 abstractC10558, String str) {
        abstractC10558.mo12006("-Xlint:unchecked", str);
    }
}
