package l;

/* JADX INFO: renamed from: l.᩶᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20477 {
    SIMPLE,
    BY_FILE,
    BY_TODO;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20477 m46284(String str) {
        if (str == null) {
            return C16949.f54185;
        }
        if (str.equals("simple")) {
            return SIMPLE;
        }
        if (str.equals("byfile")) {
            return BY_FILE;
        }
        if (str.equals("bytodo")) {
            return BY_TODO;
        }
        return C16949.f54185;
    }
}
