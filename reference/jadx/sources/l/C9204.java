package l;

import java.util.HashMap;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9204 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31289;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31290;

    public /* synthetic */ C9204(int i, Object obj) {
        this.f31289 = i;
        this.f31290 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f31289) {
            case 0:
                break;
            case 1:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f31289) {
            case 0:
                return ((C9422) obj).f31925.equals((String) this.f31290);
            case 1:
                return C4757.m13204((HashMap) this.f31290, (InterfaceC21254) obj);
            default:
                return C3128.m9472(((C3812) obj).f14145) == ((AbstractC11242) this.f31290);
        }
    }
}
