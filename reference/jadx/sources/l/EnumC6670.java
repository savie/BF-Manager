package l;

/* JADX INFO: renamed from: l.ۛ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AYO */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6670 {
    V1_V2_V3("V1 + V2 + V3", true, true, true),
    V1_V2("V1 + V2", true, true, false),
    V1_V3("V1 + V3", true, false, true),
    V1("V1", true, false, false),
    V2_V3("V2 + V3 (Android 7.0+)", false, true, true),
    V2("V2 (Android 7.0+)", false, true, false),
    V3("V3 (Android 9.0+)", false, false, true);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f22242;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f22243;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f22244;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f22245;

    EnumC6670(String str, boolean z, boolean z2, boolean z3) {
        this.f22242 = str;
        this.f22243 = z;
        this.f22245 = z2;
        this.f22244 = z3;
    }
}
