package l;

import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܿܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17432 extends AbstractC23783 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14009 f55449;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f55450;

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return "utf8";
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2379() {
        return false;
    }

    static {
        new C17432("");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m40636(int i, int i2) {
        throw new IllegalArgumentException("bad utf-8 byte " + C22475.m49983(i) + " at offset " + C22475.m49978(i2));
    }

    public C17432(String str) {
        if (str == null) {
            throw new NullPointerException("string == null");
        }
        this.f55450 = str.intern();
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
        this.f55449 = new C14009(bArr2);
    }

    public C17432(C14009 c14009) {
        char c;
        this.f55449 = c14009;
        int iM33864 = c14009.m33864();
        char[] cArr = new char[iM33864];
        int i = 0;
        int i2 = 0;
        while (iM33864 > 0) {
            int iM33868 = c14009.m33868(i2);
            switch (iM33868 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    iM33864--;
                    if (iM33868 == 0) {
                        m40636(iM33868, i2);
                        throw null;
                    }
                    c = (char) iM33868;
                    i2++;
                    break;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m40636(iM33868, i2);
                    throw null;
                case 12:
                case 13:
                    iM33864 -= 2;
                    if (iM33864 < 0) {
                        m40636(iM33868, i2);
                        throw null;
                    }
                    int i3 = i2 + 1;
                    int iM33869 = c14009.m33868(i3);
                    if ((iM33869 & 192) != 128) {
                        m40636(iM33869, i3);
                        throw null;
                    }
                    int i4 = ((iM33868 & 31) << 6) | (iM33869 & 63);
                    if (i4 != 0 && i4 < 128) {
                        m40636(iM33869, i3);
                        throw null;
                    }
                    c = (char) i4;
                    i2 += 2;
                    break;
                    break;
                case 14:
                    iM33864 -= 3;
                    if (iM33864 < 0) {
                        m40636(iM33868, i2);
                        throw null;
                    }
                    int i5 = i2 + 1;
                    int iM338610 = c14009.m33868(i5);
                    int i6 = iM338610 & 192;
                    if (i6 != 128) {
                        m40636(iM338610, i5);
                        throw null;
                    }
                    int i7 = i2 + 2;
                    int iM338611 = c14009.m33868(i7);
                    if (i6 != 128) {
                        m40636(iM338611, i7);
                        throw null;
                    }
                    int i8 = ((iM33868 & 15) << 12) | ((iM338610 & 63) << 6) | (iM338611 & 63);
                    if (i8 < 2048) {
                        m40636(iM338611, i7);
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
        this.f55450 = new String(cArr, 0, i).intern();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17432)) {
            return false;
        }
        return this.f55450.equals(((C17432) obj).f55450);
    }

    public final int hashCode() {
        return this.f55450.hashCode();
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final int mo2378(AbstractC9901 abstractC9901) {
        return this.f55450.compareTo(((C17432) abstractC9901).f55450);
    }

    public final String toString() {
        return "string{\"" + mo2376() + "\"}";
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        String str = this.f55450;
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

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m40637() {
        return "\"" + mo2376() + '\"';
    }

    public final String getString() {
        return this.f55450;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C14009 m40638() {
        return this.f55449;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m40640() {
        return this.f55449.m33864();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m40639() {
        return this.f55450.length();
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12265;
    }
}
