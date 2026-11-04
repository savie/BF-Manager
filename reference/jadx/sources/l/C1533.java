package l;

/* JADX INFO: renamed from: l.֨᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C1533 extends C8990 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final char[] f5328;

    public C1533() {
        this(new C10481("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public C1533(C10481 c10481) {
        super(c10481, (Character) null);
        this.f5328 = new char[512];
        C12128.m30309(c10481.f33356.length == 16);
        for (int i = 0; i < 256; i++) {
            this.f5328[i] = c10481.m26922(i >>> 4);
            this.f5328[i | 256] = c10481.m26922(i & 15);
        }
    }

    @Override // l.C8990, l.AbstractC7499
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5443(StringBuilder sb, byte[] bArr, int i) {
        C12128.m30303(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f5328;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // l.C8990, l.AbstractC7499
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo5441(byte[] bArr, CharSequence charSequence) throws C3024 {
        if (charSequence.length() % 2 == 1) {
            throw new C3024("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            C10481 c10481 = this.f29294;
            bArr[i2] = (byte) ((c10481.m26923(cCharAt) << 4) | c10481.m26923(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // l.C8990
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7499 mo5442(C10481 c10481, Character ch) {
        return new C1533(c10481);
    }
}
