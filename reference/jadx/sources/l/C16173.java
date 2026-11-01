package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7JN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16173 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52249;

    public /* synthetic */ C16173(int i) {
        this.f52249 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f52249) {
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
        switch (this.f52249) {
            case 0:
                return ((int[]) ((Map.Entry) obj).getValue())[1] != -1;
            case 1:
                return C5383.m14948(((InterfaceC2557) obj).getPath());
            case 2:
                return ((C11948) obj).mo29759() == EnumC23921.ERROR;
            case 3:
                return ((InterfaceC2847) obj) == EnumC7081.OVERRIDE_READ_ONLY;
            default:
                return C13638.nonNull(obj);
        }
    }
}
