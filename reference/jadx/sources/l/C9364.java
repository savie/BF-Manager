package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۢۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: RC7A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9364 implements InterfaceC4692, Serializable, InterfaceC16085 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4692 f31721;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4692 f31722;

    public /* synthetic */ C9364(InterfaceC4692 interfaceC4692, InterfaceC4692 interfaceC4693) {
        this.f31721 = interfaceC4692;
        this.f31722 = interfaceC4693;
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C3012.m8977(this, comparator);
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
        return mo12999(((Character) obj).charValue(), ((Character) obj2).charValue());
    }

    @Override // l.InterfaceC4692
    /* JADX INFO: renamed from: ۨ */
    public final C9364 mo13000(InterfaceC4692 interfaceC4692) {
        return new C9364(this, interfaceC4692);
    }

    @Override // l.InterfaceC4692
    /* JADX INFO: renamed from: ۙ */
    public final int mo12999(char c, char c2) {
        int iMo12999 = this.f31721.mo12999(c, c2);
        return iMo12999 == 0 ? this.f31722.mo12999(c, c2) : iMo12999;
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public final Comparator reversed() {
        return new C11749(this);
    }
}
