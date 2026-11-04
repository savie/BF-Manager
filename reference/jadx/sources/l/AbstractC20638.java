package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩵ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20638 implements Comparable, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Comparable f66190;

    public abstract int hashCode();

    /* JADX INFO: renamed from: ۙ */
    public AbstractC20638 mo38339(AbstractC6468 abstractC6468) {
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo11448(StringBuilder sb);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo11449(Comparable comparable);

    /* JADX INFO: renamed from: ᩴ */
    public abstract EnumC3616 mo11450();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo11451(StringBuilder sb);

    /* JADX INFO: renamed from: ᩸ */
    public abstract EnumC3616 mo11452();

    public AbstractC20638(Comparable comparable) {
        this.f66190 = comparable;
    }

    /* JADX INFO: renamed from: ۙ */
    public Comparable mo41314() {
        return this.f66190;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC20638) {
            try {
                if (compareTo((AbstractC20638) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC20638 abstractC20638) {
        if (abstractC20638 == C23622.f76665) {
            return 1;
        }
        if (abstractC20638 == C17654.f58034) {
            return -1;
        }
        Comparable comparable = abstractC20638.f66190;
        int i = C2346.f7567;
        int iCompareTo = this.f66190.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof C16162, abstractC20638 instanceof C16162);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C3484 m47251(Comparable comparable) {
        comparable.getClass();
        return new C3484(comparable);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C16162 m47252(Comparable comparable) {
        comparable.getClass();
        return new C16162(comparable);
    }
}
