package l;

import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.ۚܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 49VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5812 extends C24283 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f19984 = C16980.m40037(C5812.class);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f19985 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f19986 = null;

    static {
        try {
            new C5812("S-1-1-0");
            new C5812("S-1-3-0");
            new C5812("S-1-5-18");
        } catch (C20728 e) {
            f19984.mo13724("Failed to create builtin SIDs", (Throwable) e);
        }
    }

    public C5812(byte[] bArr, int i) {
        this.f78600 = bArr[i];
        this.f78601 = bArr[i + 1];
        byte[] bArr2 = new byte[6];
        this.f78598 = bArr2;
        System.arraycopy(bArr, i + 2, bArr2, 0, 6);
        int i2 = i + 8;
        int i3 = this.f78601;
        if (i3 > 100) {
            throw new C3640("Invalid SID sub_authority_count");
        }
        this.f78599 = new int[i3];
        for (int i4 = 0; i4 < this.f78601; i4++) {
            this.f78599[i4] = C0481.m2322(i2, bArr);
            i2 += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5812(String str) throws C20728 {
        long j;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "-");
        if (stringTokenizer.countTokens() < 3 || !stringTokenizer.nextToken().equals("S")) {
            throw new C20728("Bad textual SID format: ".concat(str));
        }
        this.f78600 = Byte.parseByte(stringTokenizer.nextToken());
        String strNextToken = stringTokenizer.nextToken();
        if (strNextToken.startsWith("0x")) {
            j = Long.parseLong(strNextToken.substring(2), 16);
        } else {
            j = Long.parseLong(strNextToken);
        }
        this.f78598 = new byte[6];
        int i = 5;
        while (j > 0) {
            this.f78598[i] = (byte) (j % 256);
            j >>= 8;
            i--;
        }
        int iCountTokens = (byte) stringTokenizer.countTokens();
        this.f78601 = iCountTokens;
        if (iCountTokens > 0) {
            this.f78599 = new int[iCountTokens];
            for (int i2 = 0; i2 < this.f78601; i2++) {
                this.f78599[i2] = (int) (Long.parseLong(stringTokenizer.nextToken()) & 4294967295L);
            }
        }
    }

    public final int hashCode() {
        int i = this.f78598[5];
        for (int i2 = 0; i2 < this.f78601; i2++) {
            i += this.f78599[i2] * 65599;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5812) {
            C5812 c5812 = (C5812) obj;
            if (c5812 == this) {
                return true;
            }
            byte b = c5812.f78601;
            int i = this.f78601;
            if (b == i) {
                while (true) {
                    int i2 = i - 1;
                    if (i > 0) {
                        if (c5812.f78599[i2] != this.f78599[i2]) {
                            return false;
                        }
                        i = i2;
                    } else {
                        for (int i3 = 0; i3 < 6; i3++) {
                            if (c5812.f78598[i3] != this.f78598[i3]) {
                                return false;
                            }
                        }
                        if (c5812.f78600 == this.f78600) {
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
        String strM31437 = C12669.m31437(this.f78600 & 255, "-", new StringBuilder("S-"));
        byte[] bArr = this.f78598;
        if (bArr[0] == 0 && bArr[1] == 0) {
            long j = 0;
            long j2 = 0;
            for (int i = 5; i > 1; i--) {
                j += (((long) this.f78598[i]) & 255) << ((int) j2);
                j2 += 8;
            }
            string = strM31437 + j;
        } else {
            StringBuilder sbM27333 = C10732.m27333(C14483.m34972(strM31437, "0x"));
            sbM27333.append(C6033.m17504(this.f78598, 0, 6));
            string = sbM27333.toString();
        }
        for (int i2 = 0; i2 < this.f78601; i2++) {
            StringBuilder sbM10405 = C3188.m10405(string, "-");
            sbM10405.append(((long) this.f78599[i2]) & 4294967295L);
            string = sbM10405.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m16943() {
        String str = this.f19985;
        if (str != null) {
            if (str.equals("BUILTIN")) {
                return this.f19986;
            }
            return this.f19985 + "\\" + this.f19986;
        }
        return toString();
    }
}
