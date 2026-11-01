package l;

/* JADX INFO: renamed from: l.ܺ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: VBK3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15594 implements Cloneable {
    public abstract double getX();

    public abstract double getY();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19028(double d, double d2);

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(getX()) ^ (Double.doubleToLongBits(getY()) * 31);
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC15594) {
            AbstractC15594 abstractC15594 = (AbstractC15594) obj;
            return getX() == abstractC15594.getX() && getY() == abstractC15594.getY();
        }
        return super.equals(obj);
    }
}
