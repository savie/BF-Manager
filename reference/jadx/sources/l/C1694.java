package l;

import android.os.Message;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi;

/* JADX INFO: renamed from: l.֫۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1694 implements InterfaceC7359, InterfaceC20892, InterfaceC7566, InterfaceC8773 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6706;

    public /* synthetic */ C1694(int i) {
        this.f6706 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m5620(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ long m5621(String str) {
        long j;
        long j2;
        long j3;
        int length = str.length();
        if (length == 0) {
            throw new NumberFormatException("empty string");
        }
        long j4 = 10;
        int i = 0;
        long j5 = Long.MIN_VALUE;
        if (j4 < 0) {
            j = C17492.FOREVER_NS < (j4 ^ Long.MIN_VALUE) ? 0L : 1L;
        } else {
            long j6 = (C17492.FOREVER_NS / j4) << 1;
            j = j6 + ((long) ((((-1) - (j6 * j4)) ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE) ? 1 : 0));
        }
        if (str.charAt(0) == '+' && length > 1) {
            i = 1;
        }
        long j7 = 0;
        int i2 = 10;
        while (i < length) {
            int iDigit = Character.digit(str.charAt(i), i2);
            if (iDigit == -1) {
                throw new NumberFormatException(str.toString());
            }
            if (j7 >= 0 && j7 <= j) {
                if (j7 == j) {
                    if (j4 < 0) {
                        if (C17492.FOREVER_NS < (j4 ^ j5)) {
                            j3 = -1;
                        } else {
                            j2 = (-1) - j4;
                        }
                        if (iDigit <= ((int) j3)) {
                        }
                    } else {
                        long j8 = (-1) - (((C17492.FOREVER_NS / j4) << 1) * j4);
                        j2 = j8 - ((j8 ^ j5) >= (j4 ^ j5) ? j4 : 0L);
                    }
                    j3 = j2;
                    if (iDigit <= ((int) j3)) {
                    }
                }
                j7 = (j7 * j4) + ((long) iDigit);
                i++;
                i2 = 10;
                j5 = Long.MIN_VALUE;
            }
            throw new NumberFormatException("Too large for unsigned long: ".concat(str.toString()));
        }
        return j7;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5622(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5623(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SnovaKeyFactorySpi());
    }

    @Override // l.InterfaceC7566
    public InterfaceC20972 get() {
        int i = C5553.f19060;
        return null;
    }

    @Override // l.InterfaceC20892
    /* JADX INFO: renamed from: ۙ */
    public Object mo1795(Object obj, Throwable th) {
        return null;
    }

    @Override // l.InterfaceC8773
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo5624(Object obj, Message message) {
        C20013.m45320((C20013) obj);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        InterfaceC10430 interfaceC10430 = (InterfaceC10430) obj;
        switch (this.f6706) {
            case 4:
                interfaceC10430.getClass();
                break;
            default:
                interfaceC10430.getClass();
                break;
        }
    }
}
