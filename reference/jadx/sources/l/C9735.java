package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ۡ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C9735 extends C8990 {
    public C9735(String str, String str2) {
        this(new C10481(str, str2.toCharArray()), Character.valueOf(a.h));
    }

    public C9735(C10481 c10481, Character ch) {
        super(c10481, ch);
        C12128.m30309(c10481.f33356.length == 64);
    }

    @Override // l.C8990, l.AbstractC7499
    /* JADX INFO: renamed from: ۙ */
    public final void mo5443(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        C12128.m30303(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            C10481 c10481 = this.f29294;
            sb.append(c10481.m26922(i6 >>> 18));
            sb.append(c10481.m26922((i6 >>> 12) & 63));
            sb.append(c10481.m26922((i6 >>> 6) & 63));
            sb.append(c10481.m26922(i6 & 63));
        }
        if (i2 < i) {
            m23986(sb, bArr, i2, i - i2);
        }
    }

    @Override // l.C8990, l.AbstractC7499
    /* JADX INFO: renamed from: ۙ */
    public final int mo5441(byte[] bArr, CharSequence charSequence) throws C3024 {
        CharSequence charSequenceMo20549 = mo20549(charSequence);
        int length = charSequenceMo20549.length();
        C10481 c10481 = this.f29294;
        if (!c10481.m26926(length)) {
            throw new C3024("Invalid input length " + charSequenceMo20549.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceMo20549.length()) {
            int i3 = i + 2;
            int iM26923 = (c10481.m26923(charSequenceMo20549.charAt(i + 1)) << 12) | (c10481.m26923(charSequenceMo20549.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iM26923 >>> 16);
            if (i3 < charSequenceMo20549.length()) {
                int i5 = i + 3;
                int iM26924 = iM26923 | (c10481.m26923(charSequenceMo20549.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((iM26924 >>> 8) & 255);
                if (i5 < charSequenceMo20549.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iM26924 | c10481.m26923(charSequenceMo20549.charAt(i5))) & 255);
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

    @Override // l.C8990
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7499 mo5442(C10481 c10481, Character ch) {
        return new C9735(c10481, ch);
    }
}
