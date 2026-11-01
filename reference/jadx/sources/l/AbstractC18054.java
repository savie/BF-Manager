package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩳ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18054 implements Comparable, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Comparable f57718;

    public abstract int hashCode();

    /* JADX INFO: renamed from: ۙ */
    public AbstractC18054 mo36486(AbstractC8177 abstractC8177) {
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo18343(StringBuilder sb);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo18344(Comparable comparable);

    /* JADX INFO: renamed from: ۚ */
    public abstract EnumC18179 mo18345();

    /* JADX INFO: renamed from: ܰ */
    public abstract EnumC18179 mo18346();

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo18347(StringBuilder sb);

    public AbstractC18054(Comparable comparable) {
        this.f57718 = comparable;
    }

    /* JADX INFO: renamed from: ۙ */
    public Comparable mo18342() {
        return this.f57718;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC18054) {
            try {
                if (compareTo((AbstractC18054) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC18054 abstractC18054) {
        if (abstractC18054 == C15233.f49660) {
            return 1;
        }
        if (abstractC18054 == C6765.f22852) {
            return -1;
        }
        Comparable comparable = abstractC18054.f57718;
        int i = C9548.f32245;
        int iCompareTo = this.f57718.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof C22994, abstractC18054 instanceof C22994);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C21582 m42047(Comparable comparable) {
        comparable.getClass();
        return new C21582(comparable);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C22994 m42048(Comparable comparable) {
        comparable.getClass();
        return new C22994(comparable);
    }
}
