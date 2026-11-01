package l;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܰᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: ECIN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13990 implements InterfaceC4816, InterfaceC16085 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Comparator f45994;

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

    @Override // l.InterfaceC4816
    /* JADX INFO: renamed from: ۨ */
    public final C9861 mo13376(InterfaceC4816 interfaceC4816) {
        return new C9861(this, interfaceC4816);
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public final Comparator reversed() {
        return new C11873(this);
    }

    public C13990(Comparator comparator) {
        this.f45994 = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f45994.compare((Long) obj, (Long) obj2);
    }

    @Override // l.InterfaceC4816
    /* JADX INFO: renamed from: ۙ */
    public final int mo13375(long j, long j2) {
        return this.f45994.compare(Long.valueOf(j), Long.valueOf(j2));
    }
}
