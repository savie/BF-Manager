package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۖ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C2346 implements InterfaceC6163, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C2346 f7566 = new C2346(C23622.f76665, C17654.f58034);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7567 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20638 f7568;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC20638 f7569;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C2346 m7911() {
        return new C2346(new C16162(0), new C16162(0));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C2346 m7910(Comparable comparable) {
        return new C2346(C23622.f76665, AbstractC20638.m47252(comparable));
    }

    @Override // l.InterfaceC6163
    @Deprecated
    public final boolean apply(Object obj) {
        return m7918((Comparable) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2346 m7909(AbstractC20638 abstractC20638, AbstractC20638 abstractC20639) {
        return new C2346(abstractC20638, abstractC20639);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2346 m7914(Integer num, Integer num2) {
        return new C2346(AbstractC20638.m47251(num), new C3484(num2));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2346 m7913(Comparable comparable, EnumC3616 enumC3616) {
        int i = C0854.f3215[enumC3616.ordinal()];
        if (i == 1) {
            return new C2346(C23622.f76665, AbstractC20638.m47251(comparable));
        }
        if (i == 2) {
            return m7910(comparable);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2346 m7912(Comparable comparable) {
        return new C2346(AbstractC20638.m47251(comparable), C17654.f58034);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2346 m7906(Comparable comparable, EnumC3616 enumC3616) {
        int i = C0854.f3215[enumC3616.ordinal()];
        if (i == 1) {
            return new C2346(AbstractC20638.m47252(comparable), C17654.f58034);
        }
        if (i == 2) {
            return m7912(comparable);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C2346 m7915() {
        return f7566;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2346 m7908(Integer num, Integer num2) {
        return new C2346(new C3484(num), new C16162(num2));
    }

    public C2346(AbstractC20638 abstractC20638, AbstractC20638 abstractC20639) {
        abstractC20638.getClass();
        this.f7568 = abstractC20638;
        abstractC20639.getClass();
        this.f7569 = abstractC20639;
        if (abstractC20638.compareTo(abstractC20639) > 0 || abstractC20638 == C17654.f58034 || abstractC20639 == C23622.f76665) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            abstractC20638.mo11448(sb2);
            sb2.append("..");
            abstractC20639.mo11451(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Comparable m7922() {
        return this.f7568.mo41314();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Comparable m7920() {
        return this.f7569.mo41314();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7917() {
        return this.f7568.equals(this.f7569);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7919(C2346 c2346) {
        return this.f7568.compareTo(c2346.f7568) <= 0 && this.f7569.compareTo(c2346.f7569) >= 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m7921(C2346 c2346) {
        return this.f7568.compareTo(c2346.f7569) <= 0 && c2346.f7568.compareTo(this.f7569) <= 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2346 m7923(C2346 c2346) {
        AbstractC20638 abstractC20638 = c2346.f7568;
        AbstractC20638 abstractC20639 = this.f7568;
        int iMo41313 = abstractC20639.compareTo(abstractC20638);
        AbstractC20638 abstractC206310 = c2346.f7569;
        AbstractC20638 abstractC206311 = this.f7569;
        int iMo41314 = abstractC206311.compareTo(abstractC206310);
        if (iMo41313 >= 0 && iMo41314 <= 0) {
            return this;
        }
        if (iMo41313 <= 0 && iMo41314 >= 0) {
            return c2346;
        }
        if (iMo41313 < 0) {
            abstractC20639 = c2346.f7568;
        }
        if (iMo41314 <= 0) {
            abstractC206310 = abstractC206311;
        }
        C12128.m30310(abstractC20639.compareTo(abstractC206310) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, c2346);
        return new C2346(abstractC20639, abstractC206310);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2346 m7924(C2346 c2346) {
        AbstractC20638 abstractC20638 = c2346.f7568;
        AbstractC20638 abstractC20639 = this.f7568;
        int iMo41313 = abstractC20639.compareTo(abstractC20638);
        AbstractC20638 abstractC206310 = c2346.f7569;
        AbstractC20638 abstractC206311 = this.f7569;
        int iMo41314 = abstractC206311.compareTo(abstractC206310);
        if (iMo41313 <= 0 && iMo41314 >= 0) {
            return this;
        }
        if (iMo41313 >= 0 && iMo41314 <= 0) {
            return c2346;
        }
        if (iMo41313 > 0) {
            abstractC20639 = c2346.f7568;
        }
        if (iMo41314 >= 0) {
            abstractC206310 = abstractC206311;
        }
        return new C2346(abstractC20639, abstractC206310);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2346) {
            C2346 c2346 = (C2346) obj;
            if (this.f7568.equals(c2346.f7568) && this.f7569.equals(c2346.f7569)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f7568.hashCode() * 31) + this.f7569.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f7568.mo11448(sb);
        sb.append("..");
        this.f7569.mo11451(sb);
        return sb.toString();
    }

    public Object readResolve() {
        C2346 c2346 = f7566;
        return equals(c2346) ? c2346 : this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2346 m7907(Comparable comparable, EnumC3616 enumC3616, Comparable comparable2, EnumC3616 enumC3617) {
        enumC3616.getClass();
        enumC3617.getClass();
        EnumC3616 enumC3618 = EnumC3616.OPEN;
        return new C2346(enumC3616 == enumC3618 ? AbstractC20638.m47252(comparable) : AbstractC20638.m47251(comparable), enumC3617 == enumC3618 ? AbstractC20638.m47251(comparable2) : AbstractC20638.m47252(comparable2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2346 m7916(AbstractC6468 abstractC6468) {
        abstractC6468.getClass();
        AbstractC20638 abstractC20638 = this.f7568;
        AbstractC20638 abstractC20638Mo38339 = abstractC20638.mo38339(abstractC6468);
        AbstractC20638 abstractC20639 = this.f7569;
        AbstractC20638 abstractC20638Mo383310 = abstractC20639.mo38339(abstractC6468);
        return (abstractC20638Mo38339 == abstractC20638 && abstractC20638Mo383310 == abstractC20639) ? this : new C2346(abstractC20638Mo38339, abstractC20638Mo383310);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7918(Comparable comparable) {
        comparable.getClass();
        return this.f7568.mo11449(comparable) && !this.f7569.mo11449(comparable);
    }
}
