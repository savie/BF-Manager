package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ۙ֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes3.dex */
public class C4338 extends AbstractC13512 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile AbstractC13512 f15533;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Character f15534;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14590 f15535;

    public C4338(C14590 c14590, Character ch) {
        c14590.getClass();
        this.f15535 = c14590;
        C18304.m42514(ch, "Padding character %s was already in alphabet", ch == null || !c14590.m35062(ch.charValue()));
        this.f15534 = ch;
    }

    public C4338(String str, String str2) {
        this(new C14590(str, str2.toCharArray()), Character.valueOf(a.h));
    }

    @Override // l.AbstractC13512
    /* JADX INFO: renamed from: ۙ */
    public void mo6146(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        C18304.m42511(0, i, bArr.length);
        while (i2 < i) {
            C14590 c14590 = this.f15535;
            m12176(sb, bArr, i2, Math.min(c14590.f47748, i - i2));
            i2 += c14590.f47748;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12176(StringBuilder sb, byte[] bArr, int i, int i2) {
        C18304.m42511(i, i + i2, bArr.length);
        C14590 c14590 = this.f15535;
        int i3 = c14590.f47748;
        int i4 = c14590.f47744;
        int i5 = 0;
        C18304.m42517(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(c14590.m35059(((int) (j >>> (i7 - i5))) & c14590.f47741));
            i5 += i4;
        }
        Character ch = this.f15534;
        if (ch != null) {
            while (i5 < c14590.f47748 * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    @Override // l.AbstractC13512
    /* JADX INFO: renamed from: ۙ */
    public int mo6144(byte[] bArr, CharSequence charSequence) throws C3299 {
        CharSequence charSequenceMo12174 = mo12174(charSequence);
        int length = charSequenceMo12174.length();
        C14590 c14590 = this.f15535;
        boolean zM35063 = c14590.m35063(length);
        int i = c14590.f47744;
        int i2 = c14590.f47742;
        if (!zM35063) {
            throw new C3299("Invalid input length " + charSequenceMo12174.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceMo12174.length(); i4 += i2) {
            long jM35060 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                jM35060 <<= i;
                if (i4 + i6 < charSequenceMo12174.length()) {
                    jM35060 |= (long) c14590.m35060(charSequenceMo12174.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = c14590.f47748;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((jM35060 >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    @Override // l.AbstractC13512
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC13512 mo12177() {
        return this.f15534 == null ? this : mo6145(this.f15535, (Character) null);
    }

    @Override // l.AbstractC13512
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13512 mo12175() {
        AbstractC13512 abstractC13512Mo6145 = this.f15533;
        if (abstractC13512Mo6145 == null) {
            C14590 c14590M35061 = this.f15535.m35061();
            abstractC13512Mo6145 = c14590M35061 == this.f15535 ? this : mo6145(c14590M35061, this.f15534);
            this.f15533 = abstractC13512Mo6145;
        }
        return abstractC13512Mo6145;
    }

    @Override // l.AbstractC13512
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo12174(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.f15534;
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

    /* JADX INFO: renamed from: ۙ */
    public AbstractC13512 mo6145(C14590 c14590, Character ch) {
        return new C4338(c14590, ch);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C14590 c14590 = this.f15535;
        sb.append(c14590);
        if (8 % c14590.f47744 != 0) {
            Character ch = this.f15534;
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
        if (obj instanceof C4338) {
            C4338 c4338 = (C4338) obj;
            if (this.f15535.equals(c4338.f15535) && C13638.equals(this.f15534, c4338.f15534)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15535.hashCode() ^ C13638.hashCode(this.f15534);
    }
}
