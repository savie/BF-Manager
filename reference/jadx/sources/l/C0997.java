package l;

/* JADX INFO: renamed from: l.֨۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB99 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0997 extends RuntimeException {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f4660;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f4661;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f4662;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f4663;

    public C0997(C12993 c12993, String str, boolean z) {
        this.f4663 = c12993.f43328;
        this.f4660 = c12993.f43331;
        this.f4661 = z;
        this.f4662 = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        boolean z = this.f4661;
        String str = this.f4662;
        int i = this.f4663;
        if (z) {
            return "Parse error [" + i + ":eol] " + str;
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Parse error [", ":");
        sbM40153.append(this.f4660);
        sbM40153.append("] ");
        sbM40153.append(str);
        return sbM40153.toString();
    }
}
