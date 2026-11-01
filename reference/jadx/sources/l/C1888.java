package l;

/* JADX INFO: renamed from: l.֫ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C1888 extends C4338 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final char[] f7132;

    public C1888() {
        this(new C14590("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public C1888(C14590 c14590) {
        super(c14590, (Character) null);
        this.f7132 = new char[512];
        C18304.m42517(c14590.f47746.length == 16);
        for (int i = 0; i < 256; i++) {
            this.f7132[i] = c14590.m35059(i >>> 4);
            this.f7132[i | 256] = c14590.m35059(i & 15);
        }
    }

    @Override // l.C4338, l.AbstractC13512
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6146(StringBuilder sb, byte[] bArr, int i) {
        C18304.m42511(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f7132;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // l.C4338, l.AbstractC13512
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo6144(byte[] bArr, CharSequence charSequence) throws C3299 {
        if (charSequence.length() % 2 == 1) {
            throw new C3299("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            C14590 c14590 = this.f15535;
            bArr[i2] = (byte) ((c14590.m35060(cCharAt) << 4) | c14590.m35060(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // l.C4338
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13512 mo6145(C14590 c14590, Character ch) {
        return new C1888(c14590);
    }
}
