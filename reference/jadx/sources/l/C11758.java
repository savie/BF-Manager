package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۧܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: RAPC */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11758 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29526(InterfaceC25185 interfaceC25185, int i) {
        return interfaceC25185.mo7133(C8485.m22799(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29527(InterfaceC25185 interfaceC25185, Byte b) {
        return interfaceC25185.mo7133(b.byteValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25185 m29525(InterfaceC25185 interfaceC25185, IntPredicate intPredicate) {
        InterfaceC25185 c13250;
        if (intPredicate instanceof InterfaceC25185) {
            c13250 = (InterfaceC25185) intPredicate;
        } else {
            C17359.requireNonNull(intPredicate);
            c13250 = new C13250(intPredicate);
        }
        return interfaceC25185.mo7131(c13250);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC25185 m29528(InterfaceC25185 interfaceC25185, IntPredicate intPredicate) {
        InterfaceC25185 c13250;
        if (intPredicate instanceof InterfaceC25185) {
            c13250 = (InterfaceC25185) intPredicate;
        } else {
            C17359.requireNonNull(intPredicate);
            c13250 = new C13250(intPredicate);
        }
        return interfaceC25185.mo7132(c13250);
    }
}
