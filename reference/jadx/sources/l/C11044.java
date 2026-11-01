package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۧܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAPK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11044 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27847(InterfaceC23744 interfaceC23744, int i) {
        return interfaceC23744.mo16050(C21273.m47738(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27848(InterfaceC23744 interfaceC23744, Character ch) {
        return interfaceC23744.mo16050(ch.charValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23744 m27846(InterfaceC23744 interfaceC23744, IntPredicate intPredicate) {
        InterfaceC23744 c16688;
        if (intPredicate instanceof InterfaceC23744) {
            c16688 = (InterfaceC23744) intPredicate;
        } else {
            C13638.requireNonNull(intPredicate);
            c16688 = new C16688(intPredicate);
        }
        return interfaceC23744.mo16049(c16688);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23744 m27849(InterfaceC23744 interfaceC23744, IntPredicate intPredicate) {
        InterfaceC23744 c16688;
        if (intPredicate instanceof InterfaceC23744) {
            c16688 = (InterfaceC23744) intPredicate;
        } else {
            C13638.requireNonNull(intPredicate);
            c16688 = new C16688(intPredicate);
        }
        return interfaceC23744.mo16051(c16688);
    }
}
