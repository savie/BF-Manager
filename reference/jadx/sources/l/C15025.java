package l;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T6GT */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15025 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49063;

    public /* synthetic */ C15025(int i) {
        this.f49063 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f49063) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f49063) {
            case 0:
                return true;
            case 1:
                return C17359.nonNull((C13304) obj);
            case 2:
                return ((String) obj).length() <= 2;
            case 3:
                return C23231.m52184((InterfaceC23435) obj, EnumC24203.JAVA_JSR);
            case 4:
                return ((Set) ((Map.Entry) obj).getValue()).isEmpty();
            default:
                return ((AbstractC11781) obj).f38066 == EnumC13603.f43213;
        }
    }
}
