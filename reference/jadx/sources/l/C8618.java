package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8618 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28176;

    public /* synthetic */ C8618(int i) {
        this.f28176 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f28176) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f28176) {
            case 0:
                return ((AbstractC22044) obj).mo4304();
            case 1:
                return ((C10950) obj).f34616 == 1649176686;
            case 2:
                return ((C5514) ((C4869) obj).m14926()).m16420();
            default:
                return C17359.nonNull((AbstractC15029) obj);
        }
    }
}
