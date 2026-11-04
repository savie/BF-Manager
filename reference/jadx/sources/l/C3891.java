package l;

import java.util.HashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6I5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3891 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13259;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13260;

    public /* synthetic */ C3891(int i, Object obj) {
        this.f13259 = i;
        this.f13260 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f13259) {
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
        switch (this.f13259) {
            case 0:
                return ((C24927) obj).m55571().m4957().equals((String) this.f13260);
            case 1:
                return C1610.m5663((HashSet) this.f13260, (InterfaceC13673) obj);
            case 2:
                AbstractC11781 abstractC11781 = (AbstractC11781) obj;
                return abstractC11781.f38066 == EnumC13603.f43213 && abstractC11781.mo29575() == ((AbstractC19728) this.f13260);
            default:
                return EnumC7687.m20946((EnumC18128) this.f13260, (EnumC7687) obj);
        }
    }
}
