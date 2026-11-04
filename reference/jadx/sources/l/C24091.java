package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24091 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77894;

    public /* synthetic */ C24091(int i) {
        this.f77894 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f77894) {
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
        switch (this.f77894) {
            case 0:
                InterfaceC16454 interfaceC16454 = (InterfaceC16454) obj;
                return interfaceC16454 != null && interfaceC16454.mo19009();
            case 1:
                AbstractC22664 abstractC22664 = (AbstractC22664) obj;
                return abstractC22664.mo9329() || abstractC22664.m51067(EnumC21172.NONE);
            default:
                AbstractC18367 abstractC18367 = (AbstractC18367) obj;
                return abstractC18367.mo9536() && C11239.m28351((AbstractC22295) abstractC18367);
        }
    }
}
