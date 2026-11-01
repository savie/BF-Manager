package l;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9375 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31743;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31744;

    public /* synthetic */ C9375(int i, Object obj) {
        this.f31743 = i;
        this.f31744 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f31743) {
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
        switch (this.f31743) {
            case 0:
                String str = (String) obj;
                Iterator it = ((List) this.f31744).iterator();
                while (it.hasNext()) {
                    if (str.startsWith((String) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                AbstractC23903 abstractC23903 = (AbstractC23903) obj;
                return (abstractC23903 == ((AbstractC23903) this.f31744) || abstractC23903.f77449.mo1926()) ? false : true;
            default:
                return C12325.m30624((C12325) this.f31744, (C19670) obj);
        }
    }
}
