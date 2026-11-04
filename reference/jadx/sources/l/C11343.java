package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۧۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: RC7A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11343 implements InterfaceC16564, Serializable, InterfaceC7136 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16564 f35735;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16564 f35736;

    public /* synthetic */ C11343(InterfaceC16564 interfaceC16564, InterfaceC16564 interfaceC16565) {
        this.f35735 = interfaceC16564;
        this.f35736 = interfaceC16565;
    }

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
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11343 mo28640(InterfaceC16564 interfaceC16564) {
        return new C11343(this, interfaceC16564);
    }

    @Override // l.InterfaceC16564
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo28639(char c, char c2) {
        int iMo28639 = this.f35735.mo28639(c, c2);
        return iMo28639 == 0 ? this.f35736.mo28639(c, c2) : iMo28639;
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public final Comparator reversed() {
        return new C15818(this);
    }
}
