package l;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ۢܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A0Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10219 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f32662;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1271 f32663;

    public C10219(int i, C1271 c1271, int i2) {
        super(i);
        this.f32663 = c1271;
        this.f32662 = i2;
    }

    public final void writeByte(int i) {
        write(i & 255);
    }

    @Override // java.io.ByteArrayOutputStream
    public final void writeBytes(byte[] bArr) {
        if (bArr != null) {
            m26354(bArr.length, bArr);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26354(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            writeByte(bArr[i2]);
        }
    }

    public final void writeShort(int i) {
        writeByte(i >> 8);
        writeByte(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26357(int i, String str) {
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
    public final void m26355(String str) {
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
            C1271 c1271 = this.f32663;
            Integer num = (Integer) c1271.f4577.get(str);
            if (num != null) {
                int iIntValue = num.intValue();
                writeByte((iIntValue >> 8) | 192);
                writeByte(iIntValue & 255);
                return;
            } else {
                c1271.f4577.put(str, Integer.valueOf(size() + this.f32662));
                m26357(strReplace.length(), strReplace);
                str = str.substring(iIndexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26356(AbstractC17152 abstractC17152, long j) {
        int iMax;
        m26355(abstractC17152.m35359());
        writeShort(abstractC17152.m35360().m53580());
        int iM17677 = abstractC17152.m35354().m17677();
        boolean zM35348 = abstractC17152.m35348();
        C1271 c1271 = this.f32663;
        writeShort(iM17677 | ((zM35348 && c1271.f62025) ? 32768 : 0));
        if (j != 0) {
            iMax = (int) Math.max(0L, (abstractC17152.m40295(100) - j) / 1000);
        } else {
            iMax = abstractC17152.m40301();
        }
        writeShort(iMax >> 16);
        writeShort(iMax);
        C10219 c10219 = new C10219(512, c1271, size() + this.f32662 + 2);
        abstractC17152.mo7635(c10219);
        byte[] byteArray = c10219.toByteArray();
        writeShort(byteArray.length);
        write(byteArray, 0, byteArray.length);
    }
}
