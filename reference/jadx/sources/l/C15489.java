package l;

import java.io.IOException;
import java.lang.reflect.Constructor;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: renamed from: l.ܶ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 316P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15489 implements InterfaceC11955, InterfaceC7359, InterfaceC21333, InterfaceC17045 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50466;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37074(long j, String str) {
        return str + j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37075(String str, IOException iOException) {
        return str + iOException;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37076(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m37078(ASN1Sequence aSN1Sequence, int i) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets());
    }

    @Override // l.InterfaceC11955
    public Object apply(Object obj) {
        switch (this.f50466) {
            case 4:
                return new C0550((InterfaceC11593) obj);
            default:
                return ((Iterable) obj).iterator();
        }
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    @Override // l.InterfaceC17045
    /* JADX INFO: renamed from: ۙ */
    public boolean mo19507(byte[] bArr) {
        return bArr.length == 14 && "resources.arsc".equals(new String(bArr, C7590.f25134));
    }

    @Override // l.InterfaceC21333
    /* JADX INFO: renamed from: ۙ */
    public Constructor mo22300() {
        return C5573.class.asSubclass(InterfaceC10045.class).getConstructor(null);
    }
}
