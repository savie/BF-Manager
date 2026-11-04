package l;

import java.util.HashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤۖ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10576 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33592;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33593;

    public /* synthetic */ C10576(int i, Object obj) {
        this.f33592 = i;
        this.f33593 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f33592) {
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
        switch (this.f33592) {
            case 0:
                return ((AbstractC22664) obj).f73596 == ((C24550) this.f33593);
            case 1:
                return ((HashSet) this.f33593).contains((C21943) obj);
            case 2:
                return ((AbstractC16481) obj) != ((AbstractC16481) this.f33593);
            default:
                return C22092.m49937((C22092) this.f33593, (AbstractC19728) obj);
        }
    }
}
