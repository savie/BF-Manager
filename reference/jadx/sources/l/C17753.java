package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.security.MessageDigest;
import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ᩳۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1VP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17753 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MessageDigest f56322 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f56323;

    public C17753(byte[] bArr) {
        this.f56323 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m41313(InterfaceC19248 interfaceC19248, InterfaceC19248 interfaceC19249, InterfaceC19248 interfaceC192410, InterfaceC5614 interfaceC5614) throws EOFException {
        long j;
        InterfaceC19248 interfaceC19248M22464;
        if (interfaceC19248.size() % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF != 0) {
            throw new IllegalStateException("APK Signing Block size not a multiple of 4096: " + interfaceC19248.size());
        }
        C15015 c15015M22463 = C8665.m22463(interfaceC19248, interfaceC19249, interfaceC192410);
        MessageDigest messageDigest = this.f56322;
        int digestLength = messageDigest.getDigestLength();
        long size = c15015M22463.size();
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
            byte[] bArr2 = this.f56323;
            if (i6 < 0) {
                messageDigest.reset();
                messageDigest.update(bArr2);
                messageDigest.update(bArr, 0, 4096);
                return messageDigest.digest();
            }
            int i7 = i6 + 1;
            C6547 c6547M47895 = C21364.m47895(iArr[i6], iArr[i7], bArr);
            if (i6 == i5) {
                interfaceC19248M22464 = c15015M22463;
            } else {
                int i8 = iArr[i7];
                interfaceC19248M22464 = C8665.m22464(i8, iArr[i6 + 2] - i8, bArr);
            }
            InterfaceC19248 interfaceC19248Mo25494 = interfaceC19248M22464.mo25494();
            long size3 = interfaceC19248Mo25494.size();
            long j2 = 0;
            while (true) {
                j2 += ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                if (j2 > size3) {
                    break;
                }
                messageDigest.reset();
                messageDigest.update(bArr2);
                interfaceC19248Mo25494.mo25493(messageDigest, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
                byte[] bArrDigest = messageDigest.digest();
                c6547M47895.m17779(bArrDigest.length, bArrDigest);
            }
            int i9 = (int) (size3 % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (i9 > 0) {
                throw new IllegalStateException(C8479.m22141(i9, "Remaining: "));
            }
            int size4 = (int) ((((interfaceC19248M22464.size() + 4095) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) * j) % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (size4 > 0) {
                int i10 = 4096 - size4;
                c6547M47895.m17779(i10, new byte[i10]);
            }
            if (interfaceC5614.mo2357()) {
                return null;
            }
            i6--;
        }
    }
}
