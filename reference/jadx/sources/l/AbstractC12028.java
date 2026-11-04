package l;

/* JADX INFO: renamed from: l.ۨ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12028 extends C8300 {
    public final ConcurrentMapC17249 i;
    public C9790 j;

    public AbstractC12028(C9790[] c9790Arr, int i, int i2, ConcurrentMapC17249 concurrentMapC17249) {
        super(c9790Arr, i, 0, i2);
        this.i = concurrentMapC17249;
        a();
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final void remove() {
        C9790 c9790 = this.j;
        if (c9790 == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.i.g(c9790.b, null, null);
    }
}
