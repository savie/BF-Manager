package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܶۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: BWD */
/* JADX INFO: loaded from: classes5.dex */
public final class C15818 implements InterfaceC16564, Serializable, InterfaceC7136 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16564 f51458;

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

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return mo28639(((Character) obj).charValue(), ((Character) obj2).charValue());
    }

    @Override // l.InterfaceC16564
    /* JADX INFO: renamed from: ۤ */
    public final C11343 mo28640(InterfaceC16564 interfaceC16564) {
        return new C11343(this, interfaceC16564);
    }

    public C15818(InterfaceC16564 interfaceC16564) {
        this.f51458 = interfaceC16564;
    }

    @Override // l.InterfaceC16564
    /* JADX INFO: renamed from: ۙ */
    public final int mo28639(char c, char c2) {
        return this.f51458.mo28639(c2, c);
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public final Comparator reversed() {
        return this.f51458;
    }
}
