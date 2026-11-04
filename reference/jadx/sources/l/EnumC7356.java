package l;

/* JADX INFO: renamed from: l.ۜ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7356 {
    SIMPLE,
    BY_FILE,
    BY_TODO;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC7356 m20171(String str) {
        if (str == null) {
            return C4878.f16992;
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
        return C4878.f16992;
    }
}
