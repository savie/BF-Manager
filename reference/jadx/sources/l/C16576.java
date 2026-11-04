package l;

/* JADX INFO: renamed from: l.ܺۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAHK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16576 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39247(C18257 c18257) {
        return (c18257 == null || c18257.isNegative() || c18257.isZero()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18257 m39246(C18257 c18257, C18257 c18258) {
        if (c18257 != null) {
            return c18257;
        }
        C17359.requireNonNull(c18258, "defaultValue");
        return c18258;
    }
}
