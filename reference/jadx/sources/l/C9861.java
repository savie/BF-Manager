package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۢ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BVX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9861 implements InterfaceC4816, Serializable, InterfaceC16085 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4816 f33702;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4816 f33703;

    public /* synthetic */ C9861(InterfaceC4816 interfaceC4816, InterfaceC4816 interfaceC4817) {
        this.f33702 = interfaceC4816;
        this.f33703 = interfaceC4817;
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C3509.m10333(this, comparator);
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
        return mo13375(((Long) obj).longValue(), ((Long) obj2).longValue());
    }

    @Override // l.InterfaceC4816
    /* JADX INFO: renamed from: ۨ */
    public final C9861 mo13376(InterfaceC4816 interfaceC4816) {
        return new C9861(this, interfaceC4816);
    }

    @Override // l.InterfaceC4816
    /* JADX INFO: renamed from: ۙ */
    public final int mo13375(long j, long j2) {
        int iMo13375 = this.f33702.mo13375(j, j2);
        return iMo13375 == 0 ? this.f33703.mo13375(j, j2) : iMo13375;
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public final Comparator reversed() {
        return new C11873(this);
    }
}
