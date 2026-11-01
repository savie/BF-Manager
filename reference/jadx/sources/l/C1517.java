package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.֫֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAPC */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1517 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5287(InterfaceC9280 interfaceC9280, int i) {
        return interfaceC9280.mo15848(C21273.m47735(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5288(InterfaceC9280 interfaceC9280, Byte b) {
        return interfaceC9280.mo15848(b.byteValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC9280 m5286(InterfaceC9280 interfaceC9280, IntPredicate intPredicate) {
        InterfaceC9280 c10691;
        if (intPredicate instanceof InterfaceC9280) {
            c10691 = (InterfaceC9280) intPredicate;
        } else {
            C13638.requireNonNull(intPredicate);
            c10691 = new C10691(intPredicate);
        }
        return interfaceC9280.mo15846(c10691);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC9280 m5289(InterfaceC9280 interfaceC9280, IntPredicate intPredicate) {
        InterfaceC9280 c10691;
        if (intPredicate instanceof InterfaceC9280) {
            c10691 = (InterfaceC9280) intPredicate;
        } else {
            C13638.requireNonNull(intPredicate);
            c10691 = new C10691(intPredicate);
        }
        return interfaceC9280.mo15847(c10691);
    }
}
