package l;

/* JADX INFO: renamed from: l.᩻ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes.dex */
public final class C25012 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f80954 = System.nanoTime();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55844() {
        C18870.m43769();
        if (System.nanoTime() - this.f80954 > 5000000000L) {
            throw C16060.m38214(EnumC4590.LIMIT, "Formatting time limit exceeded");
        }
    }
}
