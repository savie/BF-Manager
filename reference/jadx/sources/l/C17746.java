package l;

/* JADX INFO: renamed from: l.ܽܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V6VE */
/* JADX INFO: loaded from: classes5.dex */
public final class C17746 extends AbstractC1339 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC1339[] f58291;

    public C17746(Object obj, AbstractC1339[] abstractC1339Arr) {
        super(abstractC1339Arr[0].f4791 + 1, obj);
        this.f58291 = abstractC1339Arr;
        m41559();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41559() {
        this.f4793 = -1L;
        long j = 0;
        long j2 = 0;
        for (AbstractC1339 abstractC1339 : this.f58291) {
            j += (long) abstractC1339.f4794;
            j2 += (long) abstractC1339.f4792;
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Text exceeds UTF-16 coordinate limit");
        }
        this.f4794 = (int) j;
        this.f4792 = (int) j2;
    }
}
