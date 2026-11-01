package l;

import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: renamed from: l.ܶܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9I0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15276 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f49798 = C13488.m32997(C15276.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC19532 f49799;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21356 f49800;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC20508 f49801;

    public C15276(C21356 c21356) {
        this.f49800 = c21356;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36587(C13159 c13159) {
        this.f49801 = c13159.m32548().m11484();
        if (c13159.m32548().m11484().equals(EnumC20508.SMB_3_1_1)) {
            this.f49799 = c13159.m32546();
        } else {
            this.f49799 = EnumC19532.AES_128_CCM;
        }
        f49798.mo12134(this.f49799, "Initialized PacketEncryptor with Cipher << {} >>");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36588(C18826 c18826) {
        return this.f49801.m46306() && c18826.m19359().m27391() != 0 && ((C23060) c18826.m19360()).m51008() == 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m36590(C18826 c18826, SecretKey secretKey) {
        InterfaceC4314 interfaceC4314 = f49798;
        try {
            C19240 c19240M19359 = c18826.m19359();
            int iM36580 = m36580(c18826, c19240M19359);
            byte[] bArrM36583 = m36583((C23060) c18826.m19360());
            byte[] bArrM51009 = ((C23060) c18826.m19360()).m51009();
            C21356 c21356 = this.f49800;
            String strM44612 = this.f49799.m44612();
            c21356.getClass();
            InterfaceC17789 interfaceC17789M30219 = C12146.m30219(strM44612);
            interfaceC17789M30219.mo38566(EnumC18495.DECRYPT, secretKey.getEncoded(), new GCMParameterSpec(128, ((C23060) c18826.m19360()).m51006(), 0, this.f49799.m44613()));
            interfaceC17789M30219.mo38567(bArrM36583);
            byte[] bArrUpdate = interfaceC17789M30219.update(c19240M19359.m27387(), c19240M19359.m27402(), iM36580);
            byte[] bArrMo38568 = interfaceC17789M30219.mo38568(bArrM51009.length, bArrM51009);
            int length = bArrUpdate.length;
            int length2 = bArrMo38568.length;
            if (length == 0) {
                return bArrMo38568;
            }
            if (length2 == 0) {
                return bArrUpdate;
            }
            byte[] bArr = new byte[length + length2];
            System.arraycopy(bArrUpdate, 0, bArr, 0, length);
            System.arraycopy(bArrMo38568, 0, bArr, length, length2);
            return bArr;
        } catch (C7206 e) {
            interfaceC4314.mo12118(c18826, "Security exception while decrypting packet << {} >>");
            throw new C13865(e);
        } catch (C17271 e2) {
            interfaceC4314.mo12118(c18826, "Could not read cipherText from packet << {} >>");
            throw new C13865("Could not read cipherText from packet", e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11771 m36586(C11771 c11771, SecretKey secretKey) {
        if (secretKey != null) {
            return new C23037(this, c11771, secretKey);
        }
        f49798.mo12126(((C1186) c11771.mo25478()).m4325(), "Not wrapping {} as encrypted, as no key is set.");
        return c11771;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m36583(C23060 c23060) {
        byte[] bArr = new byte[32];
        byte[] bArrM51006 = c23060.m51006();
        System.arraycopy(bArrM51006, 0, bArr, 0, Math.min(bArrM51006.length, 16));
        int iM51007 = c23060.m51007();
        bArr[16] = (byte) iM51007;
        bArr[17] = (byte) (iM51007 >>> 8);
        bArr[18] = (byte) (iM51007 >>> 16);
        bArr[19] = (byte) (iM51007 >>> 24);
        int iM51011 = c23060.m51011();
        bArr[20] = (byte) iM51011;
        bArr[21] = (byte) (iM51011 >>> 8);
        int iM51008 = c23060.m51008();
        bArr[22] = (byte) iM51008;
        bArr[23] = (byte) (iM51008 >>> 8);
        m36582(c23060.m51005(), 24, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m36589() {
        long jNanoTime = System.nanoTime();
        byte[] bArr = new byte[this.f49799.m44613()];
        m36582(jNanoTime, 0, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m36580(C18826 c18826, C19240 c19240) throws C17271 {
        int iM51007 = ((C23060) c18826.m19360()).m51007();
        if (c19240.m27391() >= iM51007) {
            return iM51007;
        }
        throw new C17271("Underflow");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36582(long j, int i, byte[] bArr) {
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
