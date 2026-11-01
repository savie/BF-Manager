package l;

import com.alipay.sdk.m.t.e;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13439 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44481;

    public /* synthetic */ C13439(int i) {
        this.f44481 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f44481) {
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
        switch (this.f44481) {
            case 0:
                AbstractC20745 abstractC20745 = (AbstractC20745) obj;
                if (abstractC20745.mo33974()) {
                    AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("dex");
                    if (abstractC20745M46690.mo33974() && abstractC20745M46690.m46690(e.m).mo33974()) {
                        return true;
                    }
                    AbstractC20745 abstractC20745M46691 = abstractC20745.m46690("arsc");
                    if (abstractC20745M46691.mo33974() && abstractC20745M46691.m46690(e.m).mo33974()) {
                        return true;
                    }
                }
                return false;
            case 1:
                String strM40128 = ((C17196) obj).m40128();
                C0262 c0262 = C17196.f54822;
                return !C0262.m1763(strM40128);
            default:
                return C13638.nonNull((InterfaceC22762) obj);
        }
    }
}
