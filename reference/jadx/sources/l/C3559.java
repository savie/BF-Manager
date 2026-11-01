package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3559 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13108;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f13109;

    public /* synthetic */ C3559(int i, CharSequence charSequence) {
        this.f13108 = i;
        this.f13109 = charSequence;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f13108) {
            case 0:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f13108) {
            case 0:
                return ((String) ((Map.Entry) obj).getKey()).startsWith((String) this.f13109);
            default:
                AbstractC23903 abstractC23903 = (AbstractC23903) obj;
                return abstractC23903.f77452 == EnumC10477.f35865 && abstractC23903.mo50003() == ((AbstractC11242) this.f13109);
        }
    }
}
