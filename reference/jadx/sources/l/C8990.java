package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.۠᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes4.dex */
public class C8990 extends AbstractC7499 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10481 f29294;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Character f29295;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile AbstractC7499 f29296;

    public C8990(C10481 c10481, Character ch) {
        c10481.getClass();
        this.f29294 = c10481;
        C12128.m30306(ch, "Padding character %s was already in alphabet", ch == null || !c10481.m26925(ch.charValue()));
        this.f29295 = ch;
    }

    public C8990(String str, String str2) {
        this(new C10481(str, str2.toCharArray()), Character.valueOf(a.h));
    }

    @Override // l.AbstractC7499
    /* JADX INFO: renamed from: ۙ */
    public void mo5443(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        C12128.m30303(0, i, bArr.length);
        while (i2 < i) {
            C10481 c10481 = this.f29294;
            m23986(sb, bArr, i2, Math.min(c10481.f33360, i - i2));
            i2 += c10481.f33360;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23986(StringBuilder sb, byte[] bArr, int i, int i2) {
        C12128.m30303(i, i + i2, bArr.length);
        C10481 c10481 = this.f29294;
        int i3 = c10481.f33360;
        int i4 = c10481.f33354;
        int i5 = 0;
        C12128.m30309(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(c10481.m26922(((int) (j >>> (i7 - i5))) & c10481.f33357));
            i5 += i4;
        }
        Character ch = this.f29295;
        if (ch != null) {
            while (i5 < c10481.f33360 * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    @Override // l.AbstractC7499
    /* JADX INFO: renamed from: ۙ */
    public int mo5441(byte[] bArr, CharSequence charSequence) throws C3024 {
        CharSequence charSequenceMo20549 = mo20549(charSequence);
        int length = charSequenceMo20549.length();
        C10481 c10481 = this.f29294;
        boolean zM26926 = c10481.m26926(length);
        int i = c10481.f33354;
        int i2 = c10481.f33361;
        if (!zM26926) {
            throw new C3024("Invalid input length " + charSequenceMo20549.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceMo20549.length(); i4 += i2) {
            long jM26923 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                jM26923 <<= i;
                if (i4 + i6 < charSequenceMo20549.length()) {
                    jM26923 |= (long) c10481.m26923(charSequenceMo20549.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = c10481.f33360;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((jM26923 >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    @Override // l.AbstractC7499
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC7499 mo20553() {
        return this.f29295 == null ? this : mo5442(this.f29294, (Character) null);
    }

    @Override // l.AbstractC7499
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7499 mo20551() {
        AbstractC7499 abstractC7499Mo5442 = this.f29296;
        if (abstractC7499Mo5442 == null) {
            C10481 c10481M26924 = this.f29294.m26924();
            abstractC7499Mo5442 = c10481M26924 == this.f29294 ? this : mo5442(c10481M26924, this.f29295);
            this.f29296 = abstractC7499Mo5442;
        }
        return abstractC7499Mo5442;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC7499 mo5442(C10481 c10481, Character ch) {
        return new C8990(c10481, ch);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C10481 c10481 = this.f29294;
        sb.append(c10481);
        if (8 % c10481.f33354 != 0) {
            Character ch = this.f29295;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8990) {
            C8990 c8990 = (C8990) obj;
            if (this.f29294.equals(c8990.f29294) && C17359.equals(this.f29295, c8990.f29295)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29294.hashCode() ^ C17359.hashCode(this.f29295);
    }

    @Override // l.AbstractC7499
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo20549(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.f29295;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == cCharValue);
        return charSequence.subSequence(0, length + 1);
    }
}
