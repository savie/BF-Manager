package l;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ۚۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A0Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5100 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f17773;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22034 f17774;

    public C5100(int i, C22034 c22034, int i2) {
        super(i);
        this.f17774 = c22034;
        this.f17773 = i2;
    }

    public final void writeByte(int i) {
        write(i & 255);
    }

    @Override // java.io.ByteArrayOutputStream
    public final void writeBytes(byte[] bArr) {
        if (bArr != null) {
            m14209(bArr.length, bArr);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14209(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            writeByte(bArr[i2]);
        }
    }

    public final void writeShort(int i) {
        writeByte(i >> 8);
        writeByte(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14212(int i, String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            char cCharAt = str.charAt(i3);
            i2 = (cCharAt < 1 || cCharAt > 127) ? cCharAt > 2047 ? i2 + 3 : i2 + 2 : i2 + 1;
        }
        writeByte(i2);
        for (int i4 = 0; i4 < i; i4++) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                writeByte(cCharAt2);
            } else if (cCharAt2 > 2047) {
                writeByte(((cCharAt2 >> '\f') & 15) | BERTags.FLAGS);
                writeByte(((cCharAt2 >> 6) & 63) | 128);
                writeByte((cCharAt2 & '?') | 128);
            } else {
                writeByte(((cCharAt2 >> 6) & 31) | 192);
                writeByte((cCharAt2 & '?') | 128);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14210(String str) {
        int iIndexOf;
        while (true) {
            int i = 0;
            while (true) {
                iIndexOf = str.indexOf(46, i);
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                    break;
                } else if (iIndexOf == 0 || str.charAt(iIndexOf - 1) != '\\') {
                    break;
                } else {
                    i = iIndexOf + 1;
                }
            }
            if (iIndexOf < 0) {
                iIndexOf = str.length();
            }
            if (iIndexOf <= 0) {
                writeByte(0);
                return;
            }
            String strReplace = str.substring(0, iIndexOf).replace("\\.", ".");
            C22034 c22034 = this.f17774;
            Integer num = (Integer) c22034.f71415.get(str);
            if (num != null) {
                int iIntValue = num.intValue();
                writeByte((iIntValue >> 8) | 192);
                writeByte(iIntValue & 255);
                return;
            } else {
                c22034.f71415.put(str, Integer.valueOf(size() + this.f17773));
                m14212(strReplace.length(), strReplace);
                str = str.substring(iIndexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14211(AbstractC19918 abstractC19918, long j) {
        int iMax;
        m14210(abstractC19918.m24477());
        writeShort(abstractC19918.m24467().m34598());
        int iM51842 = abstractC19918.m24475().m51842();
        boolean zM24468 = abstractC19918.m24468();
        C22034 c22034 = this.f17774;
        writeShort(iM51842 | ((zM24468 && c22034.f8132) ? 32768 : 0));
        if (j != 0) {
            iMax = (int) Math.max(0L, (abstractC19918.m45202(100) - j) / 1000);
        } else {
            iMax = abstractC19918.m45210();
        }
        writeShort(iMax >> 16);
        writeShort(iMax);
        C5100 c5100 = new C5100(512, c22034, size() + this.f17773 + 2);
        abstractC19918.mo19179(c5100);
        byte[] byteArray = c5100.toByteArray();
        writeShort(byteArray.length);
        write(byteArray, 0, byteArray.length);
    }
}
