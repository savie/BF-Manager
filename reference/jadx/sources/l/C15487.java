package l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: RAPC */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15487 implements InterfaceC25185 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC25185 f50414;

    public /* synthetic */ C15487(InterfaceC25185 interfaceC25185) {
        this.f50414 = interfaceC25185;
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return C11758.m29526(this, i);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C11758.m29525(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C11758.m29528(this, intPredicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return C11758.m29527(this, (Byte) obj);
    }

    @Override // l.InterfaceC25185
    /* JADX INFO: renamed from: ۙ */
    public final C2064 mo7131(InterfaceC25185 interfaceC25185) {
        return new C2064(this, interfaceC25185);
    }

    @Override // java.util.function.Predicate
    public final Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    public final IntPredicate negate() {
        return new C15487(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final Predicate mo7134negate() {
        return new C15487(this);
    }

    @Override // l.InterfaceC25185
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo7133(byte b) {
        return !this.f50414.mo7133(b);
    }

    @Override // l.InterfaceC25185
    /* JADX INFO: renamed from: ᩷ */
    public final C5793 mo7132(InterfaceC25185 interfaceC25185) {
        return new C5793(this, interfaceC25185);
    }

    public final Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }
}
