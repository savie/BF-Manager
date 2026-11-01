package l;

import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.ۡۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 49VB */
/* JADX INFO: loaded from: classes4.dex */
public final class C8775 extends C14605 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f30191 = C13488.m32997(C8775.class);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f30193 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f30192 = null;

    static {
        try {
            new C8775("S-1-1-0");
            new C8775("S-1-3-0");
            new C8775("S-1-5-18");
        } catch (C12303 e) {
            f30191.mo12138("Failed to create builtin SIDs", (Throwable) e);
        }
    }

    public C8775(byte[] bArr, int i) {
        this.f47800 = bArr[i];
        this.f47797 = bArr[i + 1];
        byte[] bArr2 = new byte[6];
        this.f47798 = bArr2;
        System.arraycopy(bArr, i + 2, bArr2, 0, 6);
        int i2 = i + 8;
        int i3 = this.f47797;
        if (i3 > 100) {
            throw new C17655("Invalid SID sub_authority_count");
        }
        this.f47799 = new int[i3];
        for (int i4 = 0; i4 < this.f47797; i4++) {
            this.f47799[i4] = C4850.m13549(i2, bArr);
            i2 += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8775(String str) throws C12303 {
        long j;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "-");
        if (stringTokenizer.countTokens() < 3 || !stringTokenizer.nextToken().equals("S")) {
            throw new C12303("Bad textual SID format: ".concat(str));
        }
        this.f47800 = Byte.parseByte(stringTokenizer.nextToken());
        String strNextToken = stringTokenizer.nextToken();
        if (strNextToken.startsWith("0x")) {
            j = Long.parseLong(strNextToken.substring(2), 16);
        } else {
            j = Long.parseLong(strNextToken);
        }
        this.f47798 = new byte[6];
        int i = 5;
        while (j > 0) {
            this.f47798[i] = (byte) (j % 256);
            j >>= 8;
            i--;
        }
        int iCountTokens = (byte) stringTokenizer.countTokens();
        this.f47797 = iCountTokens;
        if (iCountTokens > 0) {
            this.f47799 = new int[iCountTokens];
            for (int i2 = 0; i2 < this.f47797; i2++) {
                this.f47799[i2] = (int) (Long.parseLong(stringTokenizer.nextToken()) & 4294967295L);
            }
        }
    }

    public final int hashCode() {
        int i = this.f47798[5];
        for (int i2 = 0; i2 < this.f47797; i2++) {
            i += this.f47799[i2] * 65599;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8775) {
            C8775 c8775 = (C8775) obj;
            if (c8775 == this) {
                return true;
            }
            byte b = c8775.f47797;
            int i = this.f47797;
            if (b == i) {
                while (true) {
                    int i2 = i - 1;
                    if (i > 0) {
                        if (c8775.f47799[i2] != this.f47799[i2]) {
                            return false;
                        }
                        i = i2;
                    } else {
                        for (int i3 = 0; i3 < 6; i3++) {
                            if (c8775.f47798[i3] != this.f47798[i3]) {
                                return false;
                            }
                        }
                        if (c8775.f47800 == this.f47800) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String string;
        String strM30911 = C12441.m30911(this.f47800 & 255, "-", new StringBuilder("S-"));
        byte[] bArr = this.f47798;
        if (bArr[0] == 0 && bArr[1] == 0) {
            long j = 0;
            long j2 = 0;
            for (int i = 5; i > 1; i--) {
                j += (((long) this.f47798[i]) & 255) << ((int) j2);
                j2 += 8;
            }
            string = strM30911 + j;
        } else {
            StringBuilder sbM23356 = C9023.m23356(C15489.m37076(strM30911, "0x"));
            sbM23356.append(C5993.m16281(this.f47798, 0, 6));
            string = sbM23356.toString();
        }
        for (int i2 = 0; i2 < this.f47797; i2++) {
            StringBuilder sbM8976 = C3012.m8976(string, "-");
            sbM8976.append(((long) this.f47799[i2]) & 4294967295L);
            string = sbM8976.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m22848() {
        String str = this.f30193;
        if (str != null) {
            if (str.equals("BUILTIN")) {
                return this.f30192;
            }
            return this.f30193 + "\\" + this.f30192;
        }
        return toString();
    }
}
