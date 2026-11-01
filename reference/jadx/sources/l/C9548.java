package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۢۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C9548 implements InterfaceC19010, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f32245 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C9548 f32246 = new C9548(C15233.f49660, C6765.f22852);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC18054 f32247;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC18054 f32248;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C9548 m24397() {
        return new C9548(new C22994(0), new C22994(0));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C9548 m24398(Comparable comparable) {
        return new C9548(C15233.f49660, AbstractC18054.m42048(comparable));
    }

    @Override // l.InterfaceC19010
    @Deprecated
    public final boolean apply(Object obj) {
        return m24405((Comparable) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9548 m24396(AbstractC18054 abstractC18054, AbstractC18054 abstractC18055) {
        return new C9548(abstractC18054, abstractC18055);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9548 m24401(Integer num, Integer num2) {
        return new C9548(AbstractC18054.m42047(num), new C21582(num2));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9548 m24400(Comparable comparable, EnumC18179 enumC18179) {
        int i = C14487.f47468[enumC18179.ordinal()];
        if (i == 1) {
            return new C9548(C15233.f49660, AbstractC18054.m42047(comparable));
        }
        if (i == 2) {
            return m24398(comparable);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9548 m24399(Comparable comparable) {
        return new C9548(AbstractC18054.m42047(comparable), C6765.f22852);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9548 m24393(Comparable comparable, EnumC18179 enumC18179) {
        int i = C14487.f47468[enumC18179.ordinal()];
        if (i == 1) {
            return new C9548(AbstractC18054.m42048(comparable), C6765.f22852);
        }
        if (i == 2) {
            return m24399(comparable);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C9548 m24392() {
        return f32246;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9548 m24395(Integer num, Integer num2) {
        return new C9548(new C21582(num), new C22994(num2));
    }

    public C9548(AbstractC18054 abstractC18054, AbstractC18054 abstractC18055) {
        abstractC18054.getClass();
        this.f32247 = abstractC18054;
        abstractC18055.getClass();
        this.f32248 = abstractC18055;
        if (abstractC18054.compareTo(abstractC18055) > 0 || abstractC18054 == C6765.f22852 || abstractC18055 == C15233.f49660) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            abstractC18054.mo18343(sb2);
            sb2.append("..");
            abstractC18055.mo18347(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Comparable m24409() {
        return this.f32247.mo18342();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Comparable m24407() {
        return this.f32248.mo18342();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24404() {
        return this.f32247.equals(this.f32248);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24406(C9548 c9548) {
        return this.f32247.compareTo(c9548.f32247) <= 0 && this.f32248.compareTo(c9548.f32248) >= 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m24408(C9548 c9548) {
        return this.f32247.compareTo(c9548.f32248) <= 0 && c9548.f32247.compareTo(this.f32248) <= 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9548 m24410(C9548 c9548) {
        AbstractC18054 abstractC18054 = c9548.f32247;
        AbstractC18054 abstractC18055 = this.f32247;
        int iMo18341 = abstractC18055.compareTo(abstractC18054);
        AbstractC18054 abstractC18056 = c9548.f32248;
        AbstractC18054 abstractC18057 = this.f32248;
        int iMo18342 = abstractC18057.compareTo(abstractC18056);
        if (iMo18341 >= 0 && iMo18342 <= 0) {
            return this;
        }
        if (iMo18341 <= 0 && iMo18342 >= 0) {
            return c9548;
        }
        if (iMo18341 < 0) {
            abstractC18055 = c9548.f32247;
        }
        if (iMo18342 <= 0) {
            abstractC18056 = abstractC18057;
        }
        C18304.m42518(abstractC18055.compareTo(abstractC18056) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, c9548);
        return new C9548(abstractC18055, abstractC18056);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9548 m24402(C9548 c9548) {
        AbstractC18054 abstractC18054 = c9548.f32247;
        AbstractC18054 abstractC18055 = this.f32247;
        int iMo18341 = abstractC18055.compareTo(abstractC18054);
        AbstractC18054 abstractC18056 = c9548.f32248;
        AbstractC18054 abstractC18057 = this.f32248;
        int iMo18342 = abstractC18057.compareTo(abstractC18056);
        if (iMo18341 <= 0 && iMo18342 >= 0) {
            return this;
        }
        if (iMo18341 >= 0 && iMo18342 <= 0) {
            return c9548;
        }
        if (iMo18341 > 0) {
            abstractC18055 = c9548.f32247;
        }
        if (iMo18342 >= 0) {
            abstractC18056 = abstractC18057;
        }
        return new C9548(abstractC18055, abstractC18056);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9548) {
            C9548 c9548 = (C9548) obj;
            if (this.f32247.equals(c9548.f32247) && this.f32248.equals(c9548.f32248)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32247.hashCode() * 31) + this.f32248.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f32247.mo18343(sb);
        sb.append("..");
        this.f32248.mo18347(sb);
        return sb.toString();
    }

    public Object readResolve() {
        C9548 c9548 = f32246;
        return equals(c9548) ? c9548 : this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9548 m24394(Comparable comparable, EnumC18179 enumC18179, Comparable comparable2, EnumC18179 enumC181710) {
        enumC18179.getClass();
        enumC181710.getClass();
        EnumC18179 enumC181711 = EnumC18179.OPEN;
        return new C9548(enumC18179 == enumC181711 ? AbstractC18054.m42048(comparable) : AbstractC18054.m42047(comparable), enumC181710 == enumC181711 ? AbstractC18054.m42047(comparable2) : AbstractC18054.m42048(comparable2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9548 m24403(AbstractC8177 abstractC8177) {
        abstractC8177.getClass();
        AbstractC18054 abstractC18054 = this.f32247;
        AbstractC18054 abstractC18054Mo36486 = abstractC18054.mo36486(abstractC8177);
        AbstractC18054 abstractC18055 = this.f32248;
        AbstractC18054 abstractC18054Mo36487 = abstractC18055.mo36486(abstractC8177);
        return (abstractC18054Mo36486 == abstractC18054 && abstractC18054Mo36487 == abstractC18055) ? this : new C9548(abstractC18054Mo36486, abstractC18054Mo36487);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24405(Comparable comparable) {
        comparable.getClass();
        return this.f32247.mo18344(comparable) && !this.f32248.mo18344(comparable);
    }
}
