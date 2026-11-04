package l;

/* JADX INFO: renamed from: l.۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8BR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8568 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C8568 f27973 = new C8568();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8909[] f27974;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC11902 f27975;

    public C8568() {
        AbstractC8909 abstractC8909 = C13394.f42684;
        this.f27975 = C2208.f7251;
        AbstractC8909[] abstractC8909Arr = new AbstractC8909[18];
        this.f27974 = abstractC8909Arr;
        abstractC8909Arr[9] = abstractC8909;
        for (int i = 1; i <= 17; i++) {
            if (i != 9) {
                this.f27974[i] = new C13394(i);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C8568 m23012() {
        return f27973;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8909 m23013(int i) {
        if (i > 17) {
            i = 17;
        } else if (i < 1) {
            i = 9;
        }
        return this.f27974[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11902 m23014() {
        return this.f27975;
    }
}
