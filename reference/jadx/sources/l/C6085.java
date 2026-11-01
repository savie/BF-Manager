package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۛ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes3.dex */
public class C6085 extends AbstractC17374 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f20598;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int mo16485() {
        return 0;
    }

    public C6085(byte[] bArr) {
        bArr.getClass();
        this.f20598 = bArr;
    }

    @Override // l.AbstractC23725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte mo16486(int i) {
        return this.f20598[i];
    }

    @Override // l.AbstractC23725
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte mo16492(int i) {
        return this.f20598[i];
    }

    @Override // l.AbstractC23725
    public int size() {
        return this.f20598.length;
    }

    @Override // l.AbstractC23725
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23725 mo16493(int i, int i2) {
        int iM52257 = AbstractC23725.m52257(i, i2, size());
        if (iM52257 == 0) {
            return AbstractC23725.f76778;
        }
        return new C20197(this.f20598, mo16485() + i, iM52257);
    }

    @Override // l.AbstractC23725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo16489(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f20598, i, bArr, i2, i3);
    }

    @Override // l.AbstractC23725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16490(AbstractC22044 abstractC22044) {
        abstractC22044.mo14235(mo16485(), size(), this.f20598);
    }

    @Override // l.AbstractC23725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo16488(Charset charset) {
        return new String(this.f20598, mo16485(), size(), charset);
    }

    @Override // l.AbstractC23725
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo16494() {
        int iMo16485 = mo16485();
        return C6003.m16294(iMo16485, size() + iMo16485, this.f20598);
    }

    @Override // l.AbstractC23725
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC23725) || size() != ((AbstractC23725) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C6085)) {
            return obj.equals(this);
        }
        C6085 c6085 = (C6085) obj;
        int iM52258 = m52258();
        int iM52259 = c6085.m52258();
        if (iM52258 != 0 && iM52259 != 0 && iM52258 != iM52259) {
            return false;
        }
        int size = size();
        if (size > c6085.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        int i = 0 + size;
        if (i > c6085.size()) {
            StringBuilder sbM2791 = C0589.m2791("Ran off end of other: ", 0, ", ", ", ", size);
            sbM2791.append(c6085.size());
            throw new IllegalArgumentException(sbM2791.toString());
        }
        if (!(c6085 instanceof C6085)) {
            return c6085.mo16493(0, i).equals(mo16493(0, size));
        }
        byte[] bArr = c6085.f20598;
        int iMo16485 = mo16485() + size;
        int iMo16486 = mo16485();
        int iMo16487 = c6085.mo16485() + 0;
        while (iMo16486 < iMo16485) {
            if (this.f20598[iMo16486] != bArr[iMo16487]) {
                return false;
            }
            iMo16486++;
            iMo16487++;
        }
        return true;
    }

    @Override // l.AbstractC23725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo16487(int i, int i2, int i3) {
        int iMo16485 = mo16485() + i2;
        byte[] bArr = C9779.f33478;
        for (int i4 = iMo16485; i4 < iMo16485 + i3; i4++) {
            i = (i * 31) + this.f20598[i4];
        }
        return i;
    }

    @Override // l.AbstractC23725
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC3262 mo16491() {
        return AbstractC3262.m9743(true, mo16485(), size(), this.f20598);
    }
}
