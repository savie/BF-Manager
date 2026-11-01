package l;

/* JADX INFO: renamed from: l.᩵۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19315 extends AbstractC6614 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f62313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62314;

    /* JADX INFO: renamed from: ۚ */
    public abstract Iterable mo3680();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.f62314;
        int i2 = ((AbstractC19315) obj).f62314;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public AbstractC19315(Object obj) {
        super(obj);
        this.f62314 = -1;
    }
}
