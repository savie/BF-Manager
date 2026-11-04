package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.security.MessageDigest;
import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.֫᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1VP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2217 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MessageDigest f7275 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f7276;

    public C2217(byte[] bArr) {
        this.f7276 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m7566(InterfaceC17044 interfaceC17044, InterfaceC17044 interfaceC17045, InterfaceC17044 interfaceC17046, InterfaceC7509 interfaceC7509) throws EOFException {
        long j;
        InterfaceC17044 interfaceC17044M41638;
        if (interfaceC17044.size() % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF != 0) {
            throw new IllegalStateException("APK Signing Block size not a multiple of 4096: " + interfaceC17044.size());
        }
        C13315 c13315M41637 = C17790.m41637(interfaceC17044, interfaceC17045, interfaceC17046);
        MessageDigest messageDigest = this.f7275;
        int digestLength = messageDigest.getDigestLength();
        long size = c13315M41637.size();
        ArrayList arrayList = new ArrayList();
        do {
            j = digestLength;
            size = ((size + 4095) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) * j;
            arrayList.add(Long.valueOf(((size + 4095) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) * ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF));
        } while (size > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
        int size2 = arrayList.size();
        int[] iArr = new int[size2 + 1];
        iArr[0] = 0;
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 1;
            int i3 = iArr[i];
            long jLongValue = ((Long) arrayList.get((arrayList.size() - i) - 1)).longValue();
            int i4 = (int) jLongValue;
            if (i4 != jLongValue) {
                throw new ArithmeticException("integer overflow");
            }
            iArr[i2] = i3 + i4;
            i = i2;
        }
        byte[] bArr = new byte[iArr[size2]];
        int i5 = size2 - 1;
        int i6 = i5;
        while (true) {
            byte[] bArr2 = this.f7276;
            if (i6 < 0) {
                messageDigest.reset();
                messageDigest.update(bArr2);
                messageDigest.update(bArr, 0, 4096);
                return messageDigest.digest();
            }
            int i7 = i6 + 1;
            C20028 c20028M17051 = C5858.m17051(iArr[i6], iArr[i7], bArr);
            if (i6 == i5) {
                interfaceC17044M41638 = c13315M41637;
            } else {
                int i8 = iArr[i7];
                interfaceC17044M41638 = C17790.m41638(i8, iArr[i6 + 2] - i8, bArr);
            }
            InterfaceC17044 interfaceC17044Mo32881 = interfaceC17044M41638.mo32881();
            long size3 = interfaceC17044Mo32881.size();
            long j2 = 0;
            while (true) {
                j2 += ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                if (j2 > size3) {
                    break;
                }
                messageDigest.reset();
                messageDigest.update(bArr2);
                interfaceC17044Mo32881.mo32880(messageDigest, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
                byte[] bArrDigest = messageDigest.digest();
                c20028M17051.m46075(bArrDigest.length, bArrDigest);
            }
            int i9 = (int) (size3 % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (i9 > 0) {
                throw new IllegalStateException(C13645.m33382(i9, "Remaining: "));
            }
            int size4 = (int) ((((interfaceC17044M41638.size() + 4095) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) * j) % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (size4 > 0) {
                int i10 = 4096 - size4;
                c20028M17051.m46075(i10, new byte[i10]);
            }
            if (interfaceC7509.mo924()) {
                return null;
            }
            i6--;
        }
    }
}
