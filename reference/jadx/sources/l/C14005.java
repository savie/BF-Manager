package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14005 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44370;

    public /* synthetic */ C14005(int i) {
        this.f44370 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f44370) {
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
        switch (this.f44370) {
            case 0:
                AbstractC22044 abstractC22044 = (AbstractC22044) obj;
                if (abstractC22044.mo4304()) {
                    String name = abstractC22044.getName();
                    if (name.endsWith(".jks") || name.endsWith(".bks") || name.endsWith(".keystore")) {
                        return true;
                    }
                }
                return false;
            default:
                String strM42887 = ((C18379) obj).m42887();
                C4209 c4209 = C18379.f59876;
                return !C4209.m13460(strM42887);
        }
    }
}
