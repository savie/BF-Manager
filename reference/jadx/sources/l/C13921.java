package l;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: renamed from: l.۬ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L70P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13921 implements InterfaceC19795, InterfaceC5417, InterfaceC10777 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44146;

    public /* synthetic */ C13921(int i) {
        this.f44146 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m33901(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        return str + aSN1ObjectIdentifier + str2;
    }

    @Override // l.InterfaceC5417
    public Object apply(Object obj) {
        return Long.valueOf(((C16187) obj).f52543);
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        InterfaceC19992 interfaceC19992 = (InterfaceC19992) obj;
        switch (this.f44146) {
            case 2:
                interfaceC19992.getClass();
                break;
            default:
                interfaceC19992.getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m33903(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        int i = 0;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            while (i > 0 && bArr[i2] != bArr[i]) {
                i = iArr[i - 1];
            }
            if (bArr[i2] == bArr[i]) {
                i++;
            }
            iArr[i2] = i;
        }
        return iArr;
    }

    @Override // l.InterfaceC10777
    /* JADX INFO: renamed from: ۙ */
    public Object mo27471(int i, int i2, byte[] bArr) {
        byte[] bArrM47329 = C20693.m47329(i, i2, bArr);
        return C21901.m49591(0, bArrM47329.length, bArrM47329);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m33904(int i, int i2, int i3) {
        long j = ((long) i2) + ((long) i3);
        if (i2 < 0 || i3 < 0 || j > i) {
            StringBuilder sbM5126 = C1402.m5126("offset=", i2, ", length=", ", totalLength=", i3);
            sbM5126.append(i);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33902(int i, int i2, int i3) {
        long j = ((long) i2) + ((long) i3);
        if (i2 < 0 || i3 < 0 || j > i) {
            StringBuilder sbM5126 = C1402.m5126("offset=", i2, ", length=", ", arrayLength=", i3);
            sbM5126.append(i);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
    }
}
