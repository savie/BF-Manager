package l;

/* JADX INFO: renamed from: l.᩹۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R6U3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23408 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f75770;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23408 f75771;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f75772;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23408 f75773;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C10046 f75774;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f75775;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile long f75776 = -1;

    public C23408(Object obj) {
        C17359.requireNonNull(obj);
        this.f75775 = obj;
        this.f75773 = null;
        this.f75771 = null;
        this.f75772 = 1;
        this.f75770 = 1;
    }

    public C23408(C23408 c23408, C23408 c23409) {
        C17359.requireNonNull(c23408);
        this.f75771 = c23408;
        C17359.requireNonNull(c23409);
        this.f75773 = c23409;
        this.f75775 = null;
        this.f75770 = Math.max(c23408.f75770, c23409.f75770) + 1;
        long j = ((long) c23408.f75772) + ((long) c23409.f75772);
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        this.f75772 = i;
    }
}
