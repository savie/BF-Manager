package l;

import java.util.Comparator;
import org.bouncycastle.math.ec.ECFieldElement;

/* JADX INFO: renamed from: l.֨ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CK5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0833 implements InterfaceC7359, InterfaceC11955 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m3428(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ECFieldElement m3430(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }

    @Override // l.InterfaceC11955
    public Object apply(Object obj) {
        return (C22453) obj;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m3431(String str) {
        C2664.m8195();
        C22252.m49408(str, true);
        C11838.m29532();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Comparator m3429(InterfaceC12829 interfaceC12829, Comparator comparator) {
        return comparator instanceof InterfaceC12829 ? interfaceC12829.mo10770((InterfaceC12829) comparator) : C7618.$default$thenComparing(interfaceC12829, comparator);
    }
}
