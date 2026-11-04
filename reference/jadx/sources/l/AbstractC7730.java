package l;

/* JADX INFO: renamed from: l.۟۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7730 extends AbstractC6239 implements Comparable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f25465;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25466;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract Iterable mo21015();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.f25466;
        int i2 = ((AbstractC7730) obj).f25466;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public AbstractC7730(Object obj) {
        super(obj);
        this.f25466 = -1;
    }
}
