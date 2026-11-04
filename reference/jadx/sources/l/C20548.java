package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20548 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65785;

    public /* synthetic */ C20548(int i) {
        this.f65785 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f65785) {
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
            case 5:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f65785) {
            case 0:
                return !((InterfaceC2386) obj).mo8106();
            case 1:
                return C17359.nonNull((C25042) obj);
            case 2:
                return ((C17467) obj).m40969();
            case 3:
                return ((InterfaceC6281) obj).mo17865(EnumC1763.REMOVE);
            case 4:
                return ((C25051) obj).m55875();
            case 5:
                return ((AbstractC11781) obj).f38066 == EnumC13603.f43213;
            default:
                return C19881.m45768((C2920) obj);
        }
    }
}
