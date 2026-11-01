package l;

/* JADX INFO: renamed from: l.۬ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13154 {
    MODULE_INFO,
    PACKAGE_INFO,
    CLASS_UNIT;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC13154 m32524(String str, int i) {
        if (str.endsWith("module-info") || EnumC23839.m52549(i)) {
            return MODULE_INFO;
        }
        if (str.endsWith("package-info") && EnumC23839.m52527(i)) {
            return PACKAGE_INFO;
        }
        return CLASS_UNIT;
    }
}
