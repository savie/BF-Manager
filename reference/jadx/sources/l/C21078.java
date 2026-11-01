package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩷᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1L */
/* JADX INFO: loaded from: classes5.dex */
public final class C21078 extends AbstractC9085 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f68657;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f68658;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f68659;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f68660;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f68661;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f68662;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f68663;

    /* JADX WARN: Code duplicated, block: B:108:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:111:0x0201  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v16 l.ￖﾡ￡ﾩﾵￛﾠ, still in use, count: 2, list:
          (r10v16 l.ￖﾡ￡ﾩﾵￛﾠ) from 0x0178: INVOKE (r10v16 l.ￖﾡ￡ﾩﾵￛﾠ) VIRTUAL call: l.ￖﾡ￡ﾩﾵￛﾠ.ￜﾰ():int A[MD:():int (m), WRAPPED] (LINE:102)
          (r10v16 l.ￖﾡ￡ﾩﾵￛﾠ) from 0x0180: PHI (r10 I:??) = (r10v12 l.ￖﾡ￡ﾩﾵￛﾠ), (r10v16 l.ￖﾡ￡ﾩﾵￛﾠ) binds: [B:85:0x017f, B:175:0x0180] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public C21078(l.InterfaceC19067 r17, l.C7673 r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21078.<init>(l.ᩴ᩺۠, l.۟᩵۠, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47489(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f68663;
        if (bArr3 == null) {
            return;
        }
        MessageDigest messageDigestM38990 = C16577.m38990(bArr3);
        messageDigestM38990.update(bArr);
        messageDigestM38990.update(bArr2);
        messageDigestM38990.update(m47488());
        this.f68657 = messageDigestM38990.digest();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m47490() {
        return this.f68663;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] m47488() {
        int length;
        byte[] bytes;
        byte[] bytes2;
        int i;
        int i2;
        boolean zM23422 = m23422(1);
        String str = zM23422 ? null : "Cp850";
        String str2 = this.f68658;
        if (str2 == null || str2.length() == 0) {
            length = 64;
            bytes = null;
        } else {
            bytes = zM23422 ? str2.getBytes("UTF-16LE") : str2.getBytes(str);
            length = bytes.length + 64;
        }
        String str3 = this.f68661;
        if (str3 == null || str3.length() == 0) {
            bytes2 = null;
        } else {
            bytes2 = zM23422 ? str3.getBytes("UTF-16LE") : str3.toUpperCase().getBytes(str);
            length += bytes2.length;
        }
        byte[] bArr = this.f68657;
        if (bArr != null) {
            length += 24;
        } else if (m23422(33554432)) {
            length += 8;
        }
        byte[] bArr2 = this.f68660;
        int length2 = length + (bArr2 != null ? bArr2.length : 0);
        byte[] bArr3 = this.f68662;
        int length3 = length2 + (bArr3 != null ? bArr3.length : 0);
        byte[] bArr4 = this.f68659;
        byte[] bArr5 = new byte[length3 + (bArr4 != null ? bArr4.length : 0)];
        System.arraycopy(AbstractC9085.f30957, 0, bArr5, 0, 8);
        AbstractC9085.m23418(8, 3, bArr5);
        int iM23417 = AbstractC9085.m23417(12, bArr5, bArr2);
        int iM23418 = AbstractC9085.m23417(20, bArr5, bArr3);
        int iM23419 = AbstractC9085.m23417(28, bArr5, bytes);
        int iM234110 = AbstractC9085.m23417(36, bArr5, bytes2);
        int iM234111 = AbstractC9085.m23417(44, bArr5, (byte[]) null);
        int iM234112 = AbstractC9085.m23417(52, bArr5, bArr4);
        AbstractC9085.m23418(60, m23421(), bArr5);
        if (m23422(33554432)) {
            i2 = 0;
            System.arraycopy(AbstractC9085.f30956, 0, bArr5, 64, 8);
        } else {
            i = 64;
            i2 = 0;
            if (bArr != null) {
            }
            if (bArr != null) {
                System.arraycopy(bArr, i2, bArr5, i, 16);
                i += 16;
            }
            int iM23416 = i + AbstractC9085.m23416(i, iM23417, bArr5, bArr2);
            int iM234113 = iM23416 + AbstractC9085.m23416(iM23416, iM23418, bArr5, bArr3);
            int iM234114 = iM234113 + AbstractC9085.m23416(iM234113, iM23419, bArr5, bytes);
            int iM234115 = iM234114 + AbstractC9085.m23416(iM234114, iM234110, bArr5, bytes2);
            AbstractC9085.m23416(iM234115 + AbstractC9085.m23416(iM234115, iM234111, bArr5, null), iM234112, bArr5, bArr4);
            return bArr5;
        }
        i = 72;
        if (bArr != null) {
            System.arraycopy(bArr, i2, bArr5, i, 16);
            i += 16;
        }
        int iM234116 = i + AbstractC9085.m23416(i, iM23417, bArr5, bArr2);
        int iM234117 = iM234116 + AbstractC9085.m23416(iM234116, iM23418, bArr5, bArr3);
        int iM234118 = iM234117 + AbstractC9085.m23416(iM234117, iM23419, bArr5, bytes);
        int iM234119 = iM234118 + AbstractC9085.m23416(iM234118, iM234110, bArr5, bytes2);
        AbstractC9085.m23416(iM234119 + AbstractC9085.m23416(iM234119, iM234111, bArr5, null), iM234112, bArr5, bArr4);
        return bArr5;
    }

    public final String toString() {
        String strM30911;
        String strM30912;
        StringBuilder sbM30515 = C12278.m30515("Type3Message[domain=", this.f68658, ",user=", this.f68661, ",workstation=null,lmResponse=");
        String strM30913 = "null";
        byte[] bArr = this.f68660;
        if (bArr == null) {
            strM30911 = "null";
        } else {
            strM30911 = C12441.m30911(bArr.length, " bytes>", new StringBuilder("<"));
        }
        sbM30515.append(strM30911);
        sbM30515.append(",ntResponse=");
        byte[] bArr2 = this.f68662;
        if (bArr2 == null) {
            strM30912 = "null";
        } else {
            strM30912 = C12441.m30911(bArr2.length, " bytes>", new StringBuilder("<"));
        }
        sbM30515.append(strM30912);
        sbM30515.append(",sessionKey=");
        byte[] bArr3 = this.f68659;
        if (bArr3 != null) {
            strM30913 = C12441.m30911(bArr3.length, " bytes>", new StringBuilder("<"));
        }
        sbM30515.append(strM30913);
        sbM30515.append(",flags=0x");
        sbM30515.append(C5993.m16280(m23421(), 8));
        sbM30515.append("]");
        return sbM30515.toString();
    }
}
