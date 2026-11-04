package l;

import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ۢ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBH */
/* JADX INFO: loaded from: classes4.dex */
public final class C9976 extends AbstractC2519 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22460 f32076;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f32077;

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return "utf8";
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1849() {
        return false;
    }

    static {
        new C9976("");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m25817(int i, int i2) {
        throw new IllegalArgumentException("bad utf-8 byte " + C5306.m15936(i) + " at offset " + C5306.m15938(i2));
    }

    public C9976(String str) {
        if (str == null) {
            throw new NullPointerException("string == null");
        }
        this.f32077 = str.intern();
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                bArr[i + 1] = (byte) ((cCharAt & '?') | 128);
                i += 2;
            } else {
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                bArr[i + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i + 2] = (byte) ((cCharAt & '?') | 128);
                i += 3;
            }
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.f32076 = new C22460(bArr2);
    }

    public C9976(C22460 c22460) {
        char c;
        this.f32076 = c22460;
        int iM50636 = c22460.m50636();
        char[] cArr = new char[iM50636];
        int i = 0;
        int i2 = 0;
        while (iM50636 > 0) {
            int iM50642 = c22460.m50642(i2);
            switch (iM50642 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    iM50636--;
                    if (iM50642 == 0) {
                        m25817(iM50642, i2);
                        throw null;
                    }
                    c = (char) iM50642;
                    i2++;
                    break;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m25817(iM50642, i2);
                    throw null;
                case 12:
                case 13:
                    iM50636 -= 2;
                    if (iM50636 < 0) {
                        m25817(iM50642, i2);
                        throw null;
                    }
                    int i3 = i2 + 1;
                    int iM50643 = c22460.m50642(i3);
                    if ((iM50643 & 192) != 128) {
                        m25817(iM50643, i3);
                        throw null;
                    }
                    int i4 = ((iM50642 & 31) << 6) | (iM50643 & 63);
                    if (i4 != 0 && i4 < 128) {
                        m25817(iM50643, i3);
                        throw null;
                    }
                    c = (char) i4;
                    i2 += 2;
                    break;
                    break;
                case 14:
                    iM50636 -= 3;
                    if (iM50636 < 0) {
                        m25817(iM50642, i2);
                        throw null;
                    }
                    int i5 = i2 + 1;
                    int iM50644 = c22460.m50642(i5);
                    int i6 = iM50644 & 192;
                    if (i6 != 128) {
                        m25817(iM50644, i5);
                        throw null;
                    }
                    int i7 = i2 + 2;
                    int iM50645 = c22460.m50642(i7);
                    if (i6 != 128) {
                        m25817(iM50645, i7);
                        throw null;
                    }
                    int i8 = ((iM50642 & 15) << 12) | ((iM50644 & 63) << 6) | (iM50645 & 63);
                    if (i8 < 2048) {
                        m25817(iM50645, i7);
                        throw null;
                    }
                    c = (char) i8;
                    i2 += 3;
                    break;
                    break;
            }
            cArr[i] = c;
            i++;
        }
        this.f32077 = new String(cArr, 0, i).intern();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9976)) {
            return false;
        }
        return this.f32077.equals(((C9976) obj).f32077);
    }

    public final int hashCode() {
        return this.f32077.hashCode();
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1848(AbstractC13487 abstractC13487) {
        return this.f32077.compareTo(((C9976) abstractC13487).f32077);
    }

    public final String toString() {
        return "string{\"" + mo1843() + "\"}";
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        String str = this.f32077;
        int length = str.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    sb.append('\\');
                }
                sb.append(cCharAt);
            } else if (cCharAt > 127) {
                sb.append("\\u");
                sb.append(Character.forDigit(cCharAt >> '\f', 16));
                sb.append(Character.forDigit((cCharAt >> '\b') & 15, 16));
                sb.append(Character.forDigit((cCharAt >> 4) & 15, 16));
                sb.append(Character.forDigit(cCharAt & 15, 16));
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else {
                char cCharAt2 = i < length + (-1) ? str.charAt(i + 1) : (char) 0;
                boolean z = cCharAt2 >= '0' && cCharAt2 <= '7';
                sb.append('\\');
                for (int i2 = 6; i2 >= 0; i2 -= 3) {
                    char c = (char) (((cCharAt >> i2) & 7) + 48);
                    if (c != '0' || z) {
                        sb.append(c);
                        z = true;
                    }
                }
                if (!z) {
                    sb.append('0');
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m25818() {
        return "\"" + mo1843() + '\"';
    }

    public final String getString() {
        return this.f32077;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22460 m25819() {
        return this.f32076;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m25820() {
        return this.f32076.m50636();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m25821() {
        return this.f32077.length();
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17744;
    }
}
