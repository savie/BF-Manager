package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨ܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1241 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5414;

    public /* synthetic */ C1241(int i) {
        this.f5414 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f5414) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f5414) {
            case 0:
                return ((AbstractC8047) obj).mo16199();
            case 1:
                String str = (String) obj;
                return C5553.m15304(str) || C5553.m15329(str);
            case 2:
                return (((C16142) obj).f52153.f77447 & 16777216) != 0;
            default:
                return ((AbstractC8047) obj).m21179();
        }
    }
}
