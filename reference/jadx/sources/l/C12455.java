package l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAPK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12455 implements InterfaceC23744 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23744 f41528;

    public /* synthetic */ C12455(InterfaceC23744 interfaceC23744) {
        this.f41528 = interfaceC23744;
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return C11044.m27847(this, i);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C11044.m27846(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C11044.m27849(this, intPredicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return C11044.m27848(this, (Character) obj);
    }

    @Override // l.InterfaceC23744
    /* JADX INFO: renamed from: ۙ */
    public final C17393 mo16049(InterfaceC23744 interfaceC23744) {
        return new C17393(this, interfaceC23744);
    }

    @Override // java.util.function.Predicate
    public final Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    public final IntPredicate negate() {
        return new C12455(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final Predicate mo9645negate() {
        return new C12455(this);
    }

    @Override // l.InterfaceC23744
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo16050(char c) {
        return !this.f41528.mo16050(c);
    }

    @Override // l.InterfaceC23744
    /* JADX INFO: renamed from: ܰ */
    public final C6104 mo16051(InterfaceC23744 interfaceC23744) {
        return new C6104(this, interfaceC23744);
    }

    public final Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }
}
