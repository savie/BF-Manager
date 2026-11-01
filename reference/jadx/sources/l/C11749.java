package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۨܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: BWD */
/* JADX INFO: loaded from: classes4.dex */
public final class C11749 implements InterfaceC4692, Serializable, InterfaceC16085 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4692 f39476;

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

    public C11749(InterfaceC4692 interfaceC4692) {
        this.f39476 = interfaceC4692;
    }

    @Override // l.InterfaceC4692
    /* JADX INFO: renamed from: ۙ */
    public final int mo12999(char c, char c2) {
        return this.f39476.mo12999(c2, c);
    }

    @Override // java.util.Comparator, l.InterfaceC16085
    public final Comparator reversed() {
        return this.f39476;
    }
}
