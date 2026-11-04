package l;

import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19355 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62530;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62531;

    public /* synthetic */ C19355(int i, Object obj) {
        this.f62530 = i;
        this.f62531 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f62530) {
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
        switch (this.f62530) {
            case 0:
                return ((C12510) obj).f40164 == ((C22224) this.f62531).f38072;
            case 1:
                return !((Set) this.f62531).contains((C21943) obj);
            case 2:
                return ((C21943) obj) == ((C21943) this.f62531);
            default:
                return ((C7395) obj) != ((C1917) this.f62531).f6450;
        }
    }
}
