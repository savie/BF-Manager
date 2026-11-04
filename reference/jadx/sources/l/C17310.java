package l;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܽۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: BWD */
/* JADX INFO: loaded from: classes5.dex */
public final class C17310 implements InterfaceC16564, InterfaceC7136 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Comparator f56373;

    @Override // java.util.Comparator, l.InterfaceC7136
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C24770.m55294(this, comparator);
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public /* synthetic */ Comparator thenComparing(Function function) {
        return C2661.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        return C8627.thenComparing(this, C2661.comparing(function, comparator));
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return C2661.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return C2661.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return C2661.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // l.InterfaceC16564
    /* JADX INFO: renamed from: ۤ */
    public final C11343 mo28640(InterfaceC16564 interfaceC16564) {
        return new C11343(this, interfaceC16564);
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public final Comparator reversed() {
        return new C15818(this);
    }

    public C17310(Comparator comparator) {
        this.f56373 = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f56373.compare((Character) obj, (Character) obj2);
    }

    @Override // l.InterfaceC16564
    /* JADX INFO: renamed from: ۙ */
    public final int mo28639(char c, char c2) {
        return this.f56373.compare(Character.valueOf(c), Character.valueOf(c2));
    }
}
