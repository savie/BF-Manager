package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟ۖ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7594 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25076;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25077;

    public /* synthetic */ C7594(int i, Object obj) {
        this.f25076 = i;
        this.f25077 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f25076) {
            case 0:
                break;
            case 1:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean zM50054;
        switch (this.f25076) {
            case 0:
                zM50054 = ((C0310) this.f25077).f1698.m50054((AbstractC22664) obj);
                break;
            case 1:
                zM50054 = ((AbstractC22664) obj).m51073(((AbstractC22664) this.f25077).mo15882());
                break;
            default:
                return ((C12510) obj).f40164 == ((C12510) this.f25077).f40164;
        }
        return !zM50054;
    }
}
