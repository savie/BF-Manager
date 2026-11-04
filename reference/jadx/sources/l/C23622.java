package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes.dex */
public final class C23622 extends AbstractC20638 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C23622 f76665 = new C23622("");

    public final String toString() {
        return "-∞";
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(AbstractC20638 abstractC20638) {
        return abstractC20638 == this ? 0 : -1;
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11449(Comparable comparable) {
        return true;
    }

    @Override // l.AbstractC20638, java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((AbstractC20638) obj) == this ? 0 : -1;
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ۙ */
    public final Comparable mo41314() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC3616 mo11452() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ᩴ */
    public final EnumC3616 mo11450() {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ۙ */
    public final void mo11448(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11451(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // l.AbstractC20638
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC20638 mo38339(AbstractC6468 abstractC6468) {
        try {
            abstractC6468.getClass();
            return new C3484(Integer.MIN_VALUE);
        } catch (NoSuchElementException unused) {
            return this;
        }
    }

    @Override // l.AbstractC20638
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    private Object readResolve() {
        return f76665;
    }
}
