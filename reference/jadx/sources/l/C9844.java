package l;

import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: renamed from: l.ۢۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9844 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f31683 = C16980.m40037(C9844.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC14208 f31684;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9689 f31685;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC15700 f31686;

    public C9844(C9689 c9689) {
        this.f31685 = c9689;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25635(C18049 c18049) {
        this.f31686 = c18049.m42061().m1341();
        if (c18049.m42061().m1341().equals(EnumC15700.SMB_3_1_1)) {
            this.f31684 = c18049.m42064();
        } else {
            this.f31684 = EnumC14208.AES_128_CCM;
        }
        f31683.mo13720(this.f31684, "Initialized PacketEncryptor with Cipher << {} >>");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25636(C8988 c8988) {
        return this.f31686.m37476() && c8988.m49390().m56013() != 0 && ((C10479) c8988.m49391()).m26904() == 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m25638(C8988 c8988, SecretKey secretKey) {
        InterfaceC25186 interfaceC25186 = f31683;
        try {
            C7453 c7453M49390 = c8988.m49390();
            int iM25628 = m25628(c8988, c7453M49390);
            byte[] bArrM25631 = m25631((C10479) c8988.m49391());
            byte[] bArrM26903 = ((C10479) c8988.m49391()).m26903();
            C9689 c9689 = this.f31685;
            String strM34491 = this.f31684.m34491();
            c9689.getClass();
            InterfaceC2758 interfaceC2758M7620 = C2233.m7620(strM34491);
            interfaceC2758M7620.mo9103(EnumC8724.DECRYPT, secretKey.getEncoded(), new GCMParameterSpec(128, ((C10479) c8988.m49391()).m26909(), 0, this.f31684.m34492()));
            interfaceC2758M7620.mo9104(bArrM25631);
            byte[] bArrUpdate = interfaceC2758M7620.update(c7453M49390.m56011(), c7453M49390.m56029(), iM25628);
            byte[] bArrMo9105 = interfaceC2758M7620.mo9105(bArrM26903.length, bArrM26903);
            int length = bArrUpdate.length;
            int length2 = bArrMo9105.length;
            if (length == 0) {
                return bArrMo9105;
            }
            if (length2 == 0) {
                return bArrUpdate;
            }
            byte[] bArr = new byte[length + length2];
            System.arraycopy(bArrUpdate, 0, bArr, 0, length);
            System.arraycopy(bArrMo9105, 0, bArr, length, length2);
            return bArr;
        } catch (C2013 e) {
            interfaceC25186.mo13698(c8988, "Could not read cipherText from packet << {} >>");
            throw new C12082("Could not read cipherText from packet", e);
        } catch (C11181 e2) {
            interfaceC25186.mo13698(c8988, "Security exception while decrypting packet << {} >>");
            throw new C12082(e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24652 m25634(C24652 c24652, SecretKey secretKey) {
        if (secretKey != null) {
            return new C18795(this, c24652, secretKey);
        }
        f31683.mo13716(((C18684) c24652.mo3632()).m43462(), "Not wrapping {} as encrypted, as no key is set.");
        return c24652;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m25631(C10479 c10479) {
        byte[] bArr = new byte[32];
        byte[] bArrM26909 = c10479.m26909();
        System.arraycopy(bArrM26909, 0, bArr, 0, Math.min(bArrM26909.length, 16));
        int iM26907 = c10479.m26907();
        bArr[16] = (byte) iM26907;
        bArr[17] = (byte) (iM26907 >>> 8);
        bArr[18] = (byte) (iM26907 >>> 16);
        bArr[19] = (byte) (iM26907 >>> 24);
        int iM26906 = c10479.m26906();
        bArr[20] = (byte) iM26906;
        bArr[21] = (byte) (iM26906 >>> 8);
        int iM26904 = c10479.m26904();
        bArr[22] = (byte) iM26904;
        bArr[23] = (byte) (iM26904 >>> 8);
        m25630(c10479.m26905(), 24, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m25637() {
        long jNanoTime = System.nanoTime();
        byte[] bArr = new byte[this.f31684.m34492()];
        m25630(jNanoTime, 0, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25628(C8988 c8988, C7453 c7453) throws C2013 {
        int iM26907 = ((C10479) c8988.m49391()).m26907();
        if (c7453.m56013() >= iM26907) {
            return iM26907;
        }
        throw new C2013("Underflow");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25630(long j, int i, byte[] bArr) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >>> 8);
        bArr[i + 2] = (byte) (j >>> 16);
        bArr[i + 3] = (byte) (j >>> 24);
        bArr[i + 4] = (byte) (j >>> 32);
        bArr[i + 5] = (byte) (j >>> 40);
        bArr[i + 6] = (byte) (j >>> 48);
        bArr[i + 7] = (byte) (j >>> 56);
    }
}
