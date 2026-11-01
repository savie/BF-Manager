package l;

import android.content.DialogInterface;
import java.util.Comparator;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;

/* JADX INFO: renamed from: l.ۗ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BVX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3509 implements InterfaceC7359, InterfaceC11787 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10332(String str, ComponentCallbacksC22654 componentCallbacksC22654, String str2) {
        return str + componentCallbacksC22654 + str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC19356 m10334(C8067 c8067, int i, DialogInterface.OnClickListener onClickListener, int i2, DialogInterface.OnClickListener onClickListener2) {
        c8067.m21251(i, onClickListener);
        c8067.m21275(i2, onClickListener2);
        return c8067.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10335(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SPHINCSPlusKeyFactorySpi());
    }

    @Override // l.InterfaceC11787
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo10336(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Comparator m10333(InterfaceC4816 interfaceC4816, Comparator comparator) {
        return comparator instanceof InterfaceC4816 ? interfaceC4816.mo13376((InterfaceC4816) comparator) : C7618.$default$thenComparing(interfaceC4816, comparator);
    }
}
