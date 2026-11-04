package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ܳ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UAPK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15575 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37298(InterfaceC13338 interfaceC13338, int i) {
        return interfaceC13338.mo28051(C8485.m22804(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37299(InterfaceC13338 interfaceC13338, Character ch) {
        return interfaceC13338.mo28051(ch.charValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13338 m37297(InterfaceC13338 interfaceC13338, IntPredicate intPredicate) {
        InterfaceC13338 c22289;
        if (intPredicate instanceof InterfaceC13338) {
            c22289 = (InterfaceC13338) intPredicate;
        } else {
            C17359.requireNonNull(intPredicate);
            c22289 = new C22289(intPredicate);
        }
        return interfaceC13338.mo28050(c22289);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC13338 m37300(InterfaceC13338 interfaceC13338, IntPredicate intPredicate) {
        InterfaceC13338 c22289;
        if (intPredicate instanceof InterfaceC13338) {
            c22289 = (InterfaceC13338) intPredicate;
        } else {
            C17359.requireNonNull(intPredicate);
            c22289 = new C22289(intPredicate);
        }
        return interfaceC13338.mo28052(c22289);
    }
}
