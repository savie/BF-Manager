package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܿۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CFT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17186 implements InterfaceC16481, Serializable, InterfaceC16085 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16481 f54794;

    @Override // java.util.Comparator, l.InterfaceC16085
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C0252.m1695(this, comparator);
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
        return mo30457(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // l.InterfaceC16481
    /* JADX INFO: renamed from: ۙ */
    public final C20009 mo30456(InterfaceC16481 interfaceC16481) {
        return new C20009(this, interfaceC16481);
    }

    public C17186(InterfaceC16481 interfaceC16481) {
        this.f54794 = interfaceC16481;
    }

    @Override // l.InterfaceC16481
    /* JADX INFO: renamed from: ܰ */
    public final int mo30457(int i, int i2) {
        return this.f54794.mo30457(i2, i);
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public final Comparator reversed() {
        return this.f54794;
    }
}
