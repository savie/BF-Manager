package l;

/* JADX INFO: renamed from: l.֨ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1081 extends C20838 {
    public final ConcurrentMapC13783 i;
    public C19427 j;

    public AbstractC1081(C19427[] c19427Arr, int i, int i2, ConcurrentMapC13783 concurrentMapC13783) {
        super(c19427Arr, i, 0, i2);
        this.i = concurrentMapC13783;
        a();
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final void remove() {
        C19427 c19427 = this.j;
        if (c19427 == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.i.g(c19427.b, null, null);
    }
}
