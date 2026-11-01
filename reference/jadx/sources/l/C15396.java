package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15396 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50113;

    public /* synthetic */ C15396(int i) {
        this.f50113 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f50113) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f50113) {
            case 0:
                return ((AbstractC23157) obj).mo21788();
            case 1:
                String lowerCase = ((AbstractC20745) obj).getName().toLowerCase();
                return lowerCase.endsWith(".pk8") || lowerCase.endsWith(".aes") || lowerCase.endsWith(".key") || lowerCase.endsWith(".enc");
            case 2:
                return ((EnumC15236) obj).m36503();
            case 3:
                return ((AbstractC16579) obj).mo9480();
            default:
                return ((AbstractC8774) obj).m22847(EnumC18651.f60554);
        }
    }
}
