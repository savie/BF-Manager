package l;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۨۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CK5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12351 implements InterfaceC24161 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30817(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30818(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return str + algorithmParameterSpec;
    }

    @Override // l.InterfaceC24161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0294 mo30821(InterfaceC5341 interfaceC5341, InterfaceC4365 interfaceC4365, InterfaceC6261 interfaceC6261) {
        return new C4769(interfaceC5341, interfaceC4365, interfaceC6261);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Comparator m30819(InterfaceC6386 interfaceC6386, Comparator comparator) {
        return comparator instanceof InterfaceC6386 ? interfaceC6386.mo13302((InterfaceC6386) comparator) : C2661.$default$thenComparing(interfaceC6386, comparator);
    }
}
