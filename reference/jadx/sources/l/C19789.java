package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4ZG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19789 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63558;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63559;

    public /* synthetic */ C19789(int i, Object obj) {
        this.f63558 = i;
        this.f63559 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f63558) {
            case 0:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f63558) {
            case 0:
                return C22627.m50154((String) obj).equals((String) this.f63559);
            default:
                return ((C1821) obj).m5923() == ((EnumC15934) this.f63559);
        }
    }
}
