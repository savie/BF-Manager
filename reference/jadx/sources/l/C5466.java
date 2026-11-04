package l;

import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.ۚۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5466 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16296(InterfaceC1737 interfaceC1737, double d) {
        return interfaceC1737.mo6144(C8485.m22800(d));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16297(InterfaceC1737 interfaceC1737, Float f) {
        return interfaceC1737.mo6144(f.floatValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1737 m16295(InterfaceC1737 interfaceC1737, DoublePredicate doublePredicate) {
        InterfaceC1737 c19636;
        if (doublePredicate instanceof InterfaceC1737) {
            c19636 = (InterfaceC1737) doublePredicate;
        } else {
            C17359.requireNonNull(doublePredicate);
            c19636 = new C19636(doublePredicate);
        }
        return interfaceC1737.mo6145(c19636);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC1737 m16298(InterfaceC1737 interfaceC1737, DoublePredicate doublePredicate) {
        InterfaceC1737 c19636;
        if (doublePredicate instanceof InterfaceC1737) {
            c19636 = (InterfaceC1737) doublePredicate;
        } else {
            C17359.requireNonNull(doublePredicate);
            c19636 = new C19636(doublePredicate);
        }
        return interfaceC1737.mo6143(c19636);
    }
}
