package l;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A6IB */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0110 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1054;

    public /* synthetic */ C0110(int i) {
        this.f1054 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f1054) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f1054) {
            case 0:
                return C8314.m22411(((C6041) obj).m39118(), EnumC24203.PHI);
            case 1:
                return C17359.nonNull((C24501) obj);
            case 2:
                return ((C21943) obj).mo17865(EnumC1763.TRY_ENTER);
            case 3:
                return !((Set) ((Map.Entry) obj).getValue()).isEmpty();
            default:
                return ((InterfaceC8344) obj) != null;
        }
    }
}
