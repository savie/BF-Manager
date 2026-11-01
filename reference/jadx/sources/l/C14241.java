package l;

import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.ܳۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14241 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34371(InterfaceC1539 interfaceC1539, double d) {
        return interfaceC1539.mo5315(C21273.m47736(d));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34372(InterfaceC1539 interfaceC1539, Float f) {
        return interfaceC1539.mo5315(f.floatValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1539 m34370(InterfaceC1539 interfaceC1539, DoublePredicate doublePredicate) {
        InterfaceC1539 c5773;
        if (doublePredicate instanceof InterfaceC1539) {
            c5773 = (InterfaceC1539) doublePredicate;
        } else {
            C13638.requireNonNull(doublePredicate);
            c5773 = new C5773(doublePredicate);
        }
        return interfaceC1539.mo5316(c5773);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1539 m34373(InterfaceC1539 interfaceC1539, DoublePredicate doublePredicate) {
        InterfaceC1539 c5773;
        if (doublePredicate instanceof InterfaceC1539) {
            c5773 = (InterfaceC1539) doublePredicate;
        } else {
            C13638.requireNonNull(doublePredicate);
            c5773 = new C5773(doublePredicate);
        }
        return interfaceC1539.mo5314(c5773);
    }
}
