package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0843 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC9791 f3163;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f3164;

    public C0843(AbstractC11781 abstractC11781, EnumC9791 enumC9791) {
        this.f3163 = enumC9791;
        this.f3164 = abstractC11781;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0843(AbstractC11781 abstractC11781, final C12775 c12775) {
        EnumC9791 enumC9791;
        int i = C18324.f59776[abstractC11781.f38066.ordinal()];
        if (i == 4 || i == 5) {
            enumC9791 = (EnumC9791) C1170.stream(c12775.f40880).filter(new Predicate() { // from class: l.۟֫ۘ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    C15012 c15012 = (C15012) obj;
                    return c15012.m36160() && c15012.f49046 == c12775.f40879;
                }
            }).map(new C22119(1)).reduce(new C18742()).orElse(EnumC9791.UNDEFINED);
        } else {
            enumC9791 = EnumC9791.UNDEFINED;
        }
        this(abstractC11781, enumC9791);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m3348() {
        return this.f3163 != EnumC9791.UNDEFINED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3347(EnumC9791 enumC9791) {
        return this.f3163 == enumC9791;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3346() {
        int[] iArr = C18324.f59776;
        AbstractC11781 abstractC11781 = this.f3164;
        int i = iArr[abstractC11781.f38066.ordinal()];
        if (i != 1) {
            if (i == 3) {
                C3936 c3936 = (C3936) abstractC11781.mo10410();
                String strM14347 = EnumC4572.ARITY_MISMATCH.m14347();
                C15758[] c15758Arr = new C15758[0];
                C17007 c17007 = (C17007) c3936.mo12637().f19301;
                Object[] objArrM40085 = c17007.m40085();
                if (c17007.mo32405().matches(strM14347) && c17007.m40085().length == 0) {
                    for (int i2 = 0; i2 < objArrM40085.length; i2++) {
                        if (c15758Arr[i2].mo15967(objArrM40085[i2])) {
                        }
                    }
                }
            } else if (i == 6) {
                return C18106.m42224(((C18106) abstractC11781.mo10410()).m42226()).isEmpty();
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0843 m3345(AbstractC11781 abstractC11781) {
        return new C0843(abstractC11781, EnumC9791.UNDEFINED);
    }
}
