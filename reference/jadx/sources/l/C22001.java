package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.᩹ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CK5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22001 implements InterfaceC12829, Serializable, InterfaceC16085 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12829 f71341;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12829 f71342;

    public /* synthetic */ C22001(InterfaceC12829 interfaceC12829, InterfaceC12829 interfaceC128210) {
        this.f71341 = interfaceC12829;
        this.f71342 = interfaceC128210;
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C0833.m3429(this, comparator);
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public /* synthetic */ Comparator thenComparing(Function function) {
        return C7618.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        return C21023.thenComparing(this, C7618.comparing(function, comparator));
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return C7618.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return C21023.thenComparing(this, C7618.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return C7618.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return mo10769(((Float) obj).floatValue(), ((Float) obj2).floatValue());
    }

    @Override // l.InterfaceC12829
    /* JADX INFO: renamed from: ۙ */
    public final C22001 mo10770(InterfaceC12829 interfaceC12829) {
        return new C22001(this, interfaceC12829);
    }

    @Override // l.InterfaceC12829
    /* JADX INFO: renamed from: ۙ */
    public final int mo10769(float f, float f2) {
        int iMo10769 = this.f71341.mo10769(f, f2);
        return iMo10769 == 0 ? this.f71342.mo10769(f, f2) : iMo10769;
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public final Comparator reversed() {
        return new C6478(this);
    }
}
