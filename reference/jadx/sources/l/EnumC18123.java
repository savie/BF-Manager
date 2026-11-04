package l;

/* JADX INFO: renamed from: l.ܿۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18123 {
    MODULE_INFO,
    PACKAGE_INFO,
    CLASS_UNIT;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC18123 m42244(String str, int i) {
        if (str.endsWith("module-info") || EnumC16856.m39796(i)) {
            return MODULE_INFO;
        }
        if (str.endsWith("package-info") && EnumC16856.m39788(i)) {
            return PACKAGE_INFO;
        }
        return CLASS_UNIT;
    }
}
