package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8150 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC18733 f28502;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f28503;

    public C8150(AbstractC23903 abstractC23903, EnumC18733 enumC18733) {
        this.f28502 = enumC18733;
        this.f28503 = abstractC23903;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8150(AbstractC23903 abstractC23903, final C6095 c6095) {
        EnumC18733 enumC18733;
        int i = C14999.f48926[abstractC23903.f77452.ordinal()];
        if (i == 4 || i == 5) {
            enumC18733 = (EnumC18733) C9030.stream(c6095.f20639).filter(new Predicate() { // from class: l.ܶۨ۟
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    C17384 c17384 = (C17384) obj;
                    return c17384.m40497() && c17384.f55331 == c6095.f20637;
                }
            }).map(new C21555()).reduce(new C18027()).orElse(EnumC18733.UNDEFINED);
        } else {
            enumC18733 = EnumC18733.UNDEFINED;
        }
        this(abstractC23903, enumC18733);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m21463() {
        return this.f28502 != EnumC18733.UNDEFINED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21462(EnumC18733 enumC18733) {
        return this.f28502 == enumC18733;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21461() {
        int[] iArr = C14999.f48926;
        AbstractC23903 abstractC23903 = this.f28503;
        int i = iArr[abstractC23903.f77452.ordinal()];
        if (i != 1) {
            if (i == 3) {
                C13151 c13151 = (C13151) abstractC23903.mo10880();
                String strM37956 = EnumC15974.ARITY_MISMATCH.m37956();
                C3272[] c3272Arr = new C3272[0];
                C11948 c11948 = (C11948) c13151.mo11471().f7665;
                Object[] objArrM29763 = c11948.m29763();
                if (c11948.mo29765().matches(strM37956) && c11948.m29763().length == 0) {
                    for (int i2 = 0; i2 < objArrM29763.length; i2++) {
                        if (c3272Arr[i2].mo9752(objArrM29763[i2])) {
                        }
                    }
                }
            } else if (i == 6) {
                return C23029.m50967(((C23029) abstractC23903.mo10880()).m50966()).isEmpty();
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8150 m21460(AbstractC23903 abstractC23903) {
        return new C8150(abstractC23903, EnumC18733.UNDEFINED);
    }
}
