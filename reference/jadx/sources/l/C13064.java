package l;

import java.util.EnumSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4ZG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13064 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41798;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41799;

    public /* synthetic */ C13064(int i, Object obj) {
        this.f41798 = i;
        this.f41799 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f41798) {
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
        switch (this.f41798) {
            case 0:
                return C15306.m36755((String) obj).equals((String) this.f41799);
            case 1:
                return !((EnumSet) this.f41799).contains((EnumC0565) obj);
            case 2:
                return ((C7660) obj).m20873().m10398((EnumC3185[]) this.f41799);
            default:
                AbstractC11781 abstractC11781 = (AbstractC11781) obj;
                return (abstractC11781 == ((AbstractC11781) this.f41799) || abstractC11781.f38067.mo9329()) ? false : true;
        }
    }
}
