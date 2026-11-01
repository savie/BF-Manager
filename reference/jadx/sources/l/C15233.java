package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܶ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15233 extends AbstractC18054 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C15233 f49660 = new C15233("");

    public final String toString() {
        return "-∞";
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(AbstractC18054 abstractC18054) {
        return abstractC18054 == this ? 0 : -1;
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18344(Comparable comparable) {
        return true;
    }

    @Override // l.AbstractC18054, java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((AbstractC18054) obj) == this ? 0 : -1;
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ۙ */
    public final Comparable mo18342() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ܰ */
    public final EnumC18179 mo18346() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ۚ */
    public final EnumC18179 mo18345() {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ۙ */
    public final void mo18343(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ܰ */
    public final void mo18347(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // l.AbstractC18054
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18054 mo36486(AbstractC8177 abstractC8177) {
        try {
            abstractC8177.getClass();
            return new C21582(Integer.MIN_VALUE);
        } catch (NoSuchElementException unused) {
            return this;
        }
    }

    @Override // l.AbstractC18054
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    private Object readResolve() {
        return f49660;
    }
}
