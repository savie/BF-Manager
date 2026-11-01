package l;

import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9503 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32150;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32151;

    public /* synthetic */ C9503(int i, Object obj) {
        this.f32150 = i;
        this.f32151 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f32150) {
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
        switch (this.f32150) {
            case 0:
                return ((C10498) obj) != ((C10727) this.f32151).f36566;
            default:
                return ((Set) this.f32151).contains(((AbstractC8774) obj).mo1803());
        }
    }
}
