package l;

/* JADX INFO: renamed from: l.ܳۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAU5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15066 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f49195;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f49196;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f49197;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15066 f49198;

    public C15066(C15066 c15066, Object obj, Object obj2, int i) {
        this.f49198 = c15066;
        this.f49196 = obj;
        this.f49197 = obj2;
        this.f49195 = i;
    }

    public final String toString() {
        C15066 c15066 = this.f49198;
        if (c15066 == null) {
            return "$";
        }
        Object obj = this.f49197;
        if (obj instanceof Integer) {
            return c15066.toString() + "[" + obj + "]";
        }
        return c15066.toString() + "." + obj;
    }
}
