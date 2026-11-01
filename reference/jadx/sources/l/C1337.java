package l;

/* JADX INFO: renamed from: l.֨᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6VE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1337 extends AbstractC0631 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC0631[] f5650;

    public C1337(Object obj, AbstractC0631[] abstractC0631Arr) {
        super(abstractC0631Arr[0].f2724 + 1, obj);
        this.f5650 = abstractC0631Arr;
        m4741();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4741() {
        this.f2725 = -1L;
        long j = 0;
        long j2 = 0;
        for (AbstractC0631 abstractC0631 : this.f5650) {
            j += (long) abstractC0631.f2727;
            j2 += (long) abstractC0631.f2726;
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Text exceeds UTF-16 coordinate limit");
        }
        this.f2727 = (int) j;
        this.f2726 = (int) j2;
    }
}
