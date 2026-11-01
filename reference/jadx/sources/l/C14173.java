package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14173 implements Predicate {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46520;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46521;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46522;

    public /* synthetic */ C14173(int i, Object obj, Object obj2) {
        this.f46521 = i;
        this.f46522 = obj;
        this.f46520 = obj2;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f46521) {
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
        switch (this.f46521) {
            case 0:
                C6761 c6761 = (C6761) this.f46522;
                AbstractC16579 abstractC16579 = (AbstractC16579) this.f46520;
                AbstractC16579 abstractC165710 = (AbstractC16579) obj;
                c6761.getClass();
                if (abstractC165710.m39001(EnumC6617.INT)) {
                    C23800 c23800 = c6761.f22802;
                    if (c23800.m52428(abstractC165710, abstractC16579, c23800.f76946)) {
                        return true;
                    }
                }
                return false;
            default:
                C14563 c14563 = (C14563) this.f46522;
                return c14563.f47670.test(obj, (C21825) this.f46520);
        }
    }
}
