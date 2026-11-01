package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۜۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2E9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6478 implements InterfaceC12829, Serializable, InterfaceC16085 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12829 f21860;

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

    public C6478(InterfaceC12829 interfaceC12829) {
        this.f21860 = interfaceC12829;
    }

    @Override // l.InterfaceC12829
    /* JADX INFO: renamed from: ۙ */
    public final int mo10769(float f, float f2) {
        return this.f21860.mo10769(f2, f);
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public final Comparator reversed() {
        return this.f21860;
    }
}
