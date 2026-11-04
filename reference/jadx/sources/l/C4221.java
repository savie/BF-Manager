package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4221 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15407;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15408;

    public /* synthetic */ C4221(int i, Object obj) {
        this.f15407 = i;
        this.f15408 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f15407) {
            case 0:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f15407) {
            case 0:
                return ((C0911) obj).f3413.equals((String) this.f15408);
            default:
                return ((C23374) obj).m52540() == ((EnumC19644) this.f15408);
        }
    }
}
