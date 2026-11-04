package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۜܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BPK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7306 implements InterfaceC4544, Serializable, InterfaceC7136 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4544 f24045;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4544 f24046;

    public /* synthetic */ C7306(InterfaceC4544 interfaceC4544, InterfaceC4544 interfaceC4545) {
        this.f24045 = interfaceC4544;
        this.f24046 = interfaceC4545;
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C14017.m34138(this, comparator);
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
        return mo14286(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // l.InterfaceC4544
    /* JADX INFO: renamed from: ۙ */
    public final C7306 mo14285(InterfaceC4544 interfaceC4544) {
        return new C7306(this, interfaceC4544);
    }

    @Override // l.InterfaceC4544
    /* JADX INFO: renamed from: ᩷ */
    public final int mo14286(int i, int i2) {
        int iMo14286 = this.f24045.mo14286(i, i2);
        return iMo14286 == 0 ? this.f24046.mo14286(i, i2) : iMo14286;
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public final Comparator reversed() {
        return new C10509(this);
    }
}
