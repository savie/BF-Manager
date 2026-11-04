package l;

/* JADX INFO: renamed from: l.᩷᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z75W */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22346 {
    NONE,
    EXACT,
    TREE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC22346 m50415(boolean z) {
        return z ? TREE : EXACT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m50417(String str) {
        int i = C5192.f18112[ordinal()];
        if (i == 1) {
            C20108.m46239(str);
        } else {
            if (i != 2) {
                return;
            }
            C20108.m46237(str);
        }
    }
}
