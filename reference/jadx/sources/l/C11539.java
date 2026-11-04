package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۧۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BVX */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11539 implements InterfaceC16760, Serializable, InterfaceC7136 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16760 f36295;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16760 f36296;

    public /* synthetic */ C11539(InterfaceC16760 interfaceC16760, InterfaceC16760 interfaceC16761) {
        this.f36295 = interfaceC16760;
        this.f36296 = interfaceC16761;
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C24966.m55774(this, comparator);
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
        return mo29042(((Long) obj).longValue(), ((Long) obj2).longValue());
    }

    @Override // l.InterfaceC16760
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11539 mo29043(InterfaceC16760 interfaceC16760) {
        return new C11539(this, interfaceC16760);
    }

    @Override // l.InterfaceC16760
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo29042(long j, long j2) {
        int iMo29042 = this.f36295.mo29042(j, j2);
        return iMo29042 == 0 ? this.f36296.mo29042(j, j2) : iMo29042;
    }

    @Override // java.util.Comparator, l.InterfaceC7136
    public final Comparator reversed() {
        return new C16014(this);
    }
}
