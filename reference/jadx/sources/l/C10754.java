package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: W2ZV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10754 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34154;

    public /* synthetic */ C10754(int i) {
        this.f34154 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f34154) {
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
        switch (this.f34154) {
            case 0:
                return C24927.m55527((InterfaceC11653) obj);
            case 1:
                return ((EnumC2536) obj).m8460();
            case 2:
                return C17359.nonNull(obj);
            case 3:
                return ((AbstractC22664) obj).mo40452();
            case 4:
                return ((AbstractC19969) obj).m21911(EnumC21461.f68538);
            default:
                return C11239.m28351((AbstractC8036) ((C21351) obj).f68007.f48335);
        }
    }
}
