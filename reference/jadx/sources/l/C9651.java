package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ۢܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C9651 extends C4338 {
    public C9651(String str, String str2) {
        this(new C14590(str, str2.toCharArray()), Character.valueOf(a.h));
    }

    public C9651(C14590 c14590, Character ch) {
        super(c14590, ch);
        C18304.m42517(c14590.f47746.length == 64);
    }

    @Override // l.C4338, l.AbstractC13512
    /* JADX INFO: renamed from: ۙ */
    public final void mo6146(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        C18304.m42511(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            C14590 c14590 = this.f15535;
            sb.append(c14590.m35059(i6 >>> 18));
            sb.append(c14590.m35059((i6 >>> 12) & 63));
            sb.append(c14590.m35059((i6 >>> 6) & 63));
            sb.append(c14590.m35059(i6 & 63));
        }
        if (i2 < i) {
            m12176(sb, bArr, i2, i - i2);
        }
    }

    @Override // l.C4338, l.AbstractC13512
    /* JADX INFO: renamed from: ۙ */
    public final int mo6144(byte[] bArr, CharSequence charSequence) throws C3299 {
        CharSequence charSequenceMo12174 = mo12174(charSequence);
        int length = charSequenceMo12174.length();
        C14590 c14590 = this.f15535;
        if (!c14590.m35063(length)) {
            throw new C3299("Invalid input length " + charSequenceMo12174.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceMo12174.length()) {
            int i3 = i + 2;
            int iM35060 = (c14590.m35060(charSequenceMo12174.charAt(i + 1)) << 12) | (c14590.m35060(charSequenceMo12174.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iM35060 >>> 16);
            if (i3 < charSequenceMo12174.length()) {
                int i5 = i + 3;
                int iM35061 = iM35060 | (c14590.m35060(charSequenceMo12174.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((iM35061 >>> 8) & 255);
                if (i5 < charSequenceMo12174.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iM35061 | c14590.m35060(charSequenceMo12174.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // l.C4338
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13512 mo6145(C14590 c14590, Character ch) {
        return new C9651(c14590, ch);
    }
}
