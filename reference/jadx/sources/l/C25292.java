package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩻᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1L */
/* JADX INFO: loaded from: classes.dex */
public final class C25292 extends AbstractC5900 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f81689;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f81690;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f81691;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f81692;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f81693;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f81694;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f81695;

    /* JADX WARN: Code duplicated, block: B:108:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:111:0x0201  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v16 l.ￜﾶ￡ﾩﾶ￡ﾩﾵ, still in use, count: 2, list:
          (r10v16 l.ￜﾶ￡ﾩﾶ￡ﾩﾵ) from 0x0178: INVOKE (r10v16 l.ￜﾶ￡ﾩﾶ￡ﾩﾵ) VIRTUAL call: l.ￜﾶ￡ﾩﾶ￡ﾩﾵ.￡ﾩﾷ():int A[MD:():int (m), WRAPPED] (LINE:102)
          (r10v16 l.ￜﾶ￡ﾩﾶ￡ﾩﾵ) from 0x0180: PHI (r10 I:??) = (r10v12 l.ￜﾶ￡ﾩﾶ￡ﾩﾵ), (r10v16 l.ￜﾶ￡ﾩﾶ￡ﾩﾵ) binds: [B:85:0x017f, B:175:0x0180] A[DONT_GENERATE, DONT_INLINE]
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
    public C25292(l.InterfaceC23032 r17, l.C11865 r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C25292.<init>(l.᩸᩵᩵, l.ۧ᩶᩵, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56473(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f81693;
        if (bArr3 == null) {
            return;
        }
        MessageDigest messageDigestM9905 = C3049.m9905(bArr3);
        messageDigestM9905.update(bArr);
        messageDigestM9905.update(bArr2);
        messageDigestM9905.update(m56475());
        this.f81692 = messageDigestM9905.digest();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m56474() {
        return this.f81693;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] m56475() {
        int length;
        byte[] bytes;
        byte[] bytes2;
        int i;
        int i2;
        boolean zM17133 = m17133(1);
        String str = zM17133 ? null : "Cp850";
        String str2 = this.f81695;
        if (str2 == null || str2.length() == 0) {
            length = 64;
            bytes = null;
        } else {
            bytes = zM17133 ? str2.getBytes("UTF-16LE") : str2.getBytes(str);
            length = bytes.length + 64;
        }
        String str3 = this.f81691;
        if (str3 == null || str3.length() == 0) {
            bytes2 = null;
        } else {
            bytes2 = zM17133 ? str3.getBytes("UTF-16LE") : str3.toUpperCase().getBytes(str);
            length += bytes2.length;
        }
        byte[] bArr = this.f81692;
        if (bArr != null) {
            length += 24;
        } else if (m17133(33554432)) {
            length += 8;
        }
        byte[] bArr2 = this.f81694;
        int length2 = length + (bArr2 != null ? bArr2.length : 0);
        byte[] bArr3 = this.f81690;
        int length3 = length2 + (bArr3 != null ? bArr3.length : 0);
        byte[] bArr4 = this.f81689;
        byte[] bArr5 = new byte[length3 + (bArr4 != null ? bArr4.length : 0)];
        System.arraycopy(AbstractC5900.f20197, 0, bArr5, 0, 8);
        AbstractC5900.m17129(8, 3, bArr5);
        int iM17128 = AbstractC5900.m17128(12, bArr5, bArr2);
        int iM17129 = AbstractC5900.m17128(20, bArr5, bArr3);
        int iM171210 = AbstractC5900.m17128(28, bArr5, bytes);
        int iM171211 = AbstractC5900.m17128(36, bArr5, bytes2);
        int iM171212 = AbstractC5900.m17128(44, bArr5, (byte[]) null);
        int iM171213 = AbstractC5900.m17128(52, bArr5, bArr4);
        AbstractC5900.m17129(60, m17132(), bArr5);
        if (m17133(33554432)) {
            i2 = 0;
            System.arraycopy(AbstractC5900.f20196, 0, bArr5, 64, 8);
        } else {
            i = 64;
            i2 = 0;
            if (bArr != null) {
            }
            if (bArr != null) {
                System.arraycopy(bArr, i2, bArr5, i, 16);
                i += 16;
            }
            int iM17127 = i + AbstractC5900.m17127(i, iM17128, bArr5, bArr2);
            int iM171214 = iM17127 + AbstractC5900.m17127(iM17127, iM17129, bArr5, bArr3);
            int iM171215 = iM171214 + AbstractC5900.m17127(iM171214, iM171210, bArr5, bytes);
            int iM171216 = iM171215 + AbstractC5900.m17127(iM171215, iM171211, bArr5, bytes2);
            AbstractC5900.m17127(iM171216 + AbstractC5900.m17127(iM171216, iM171212, bArr5, null), iM171213, bArr5, bArr4);
            return bArr5;
        }
        i = 72;
        if (bArr != null) {
            System.arraycopy(bArr, i2, bArr5, i, 16);
            i += 16;
        }
        int iM171217 = i + AbstractC5900.m17127(i, iM17128, bArr5, bArr2);
        int iM171218 = iM171217 + AbstractC5900.m17127(iM171217, iM17129, bArr5, bArr3);
        int iM171219 = iM171218 + AbstractC5900.m17127(iM171218, iM171210, bArr5, bytes);
        int iM1712110 = iM171219 + AbstractC5900.m17127(iM171219, iM171211, bArr5, bytes2);
        AbstractC5900.m17127(iM1712110 + AbstractC5900.m17127(iM1712110, iM171212, bArr5, null), iM171213, bArr5, bArr4);
        return bArr5;
    }

    public final String toString() {
        String strM31437;
        String strM31438;
        StringBuilder sbM10406 = C3188.m10406("Type3Message[domain=", this.f81695, ",user=", this.f81691, ",workstation=null,lmResponse=");
        String strM31439 = "null";
        byte[] bArr = this.f81694;
        if (bArr == null) {
            strM31437 = "null";
        } else {
            strM31437 = C12669.m31437(bArr.length, " bytes>", new StringBuilder("<"));
        }
        sbM10406.append(strM31437);
        sbM10406.append(",ntResponse=");
        byte[] bArr2 = this.f81690;
        if (bArr2 == null) {
            strM31438 = "null";
        } else {
            strM31438 = C12669.m31437(bArr2.length, " bytes>", new StringBuilder("<"));
        }
        sbM10406.append(strM31438);
        sbM10406.append(",sessionKey=");
        byte[] bArr3 = this.f81689;
        if (bArr3 != null) {
            strM31439 = C12669.m31437(bArr3.length, " bytes>", new StringBuilder("<"));
        }
        sbM10406.append(strM31439);
        sbM10406.append(",flags=0x");
        sbM10406.append(C6033.m17503(m17132(), 8));
        sbM10406.append("]");
        return sbM10406.toString();
    }
}
