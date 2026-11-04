package l;

/* JADX INFO: renamed from: l.ܺۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1IVX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16618 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21094 f53739;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f53740;

    public C16618(AbstractC21094 abstractC21094, int i) {
        this.f53739 = abstractC21094;
        this.f53740 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m39314() {
        return this.f53740;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39310(int i) {
        this.f53740 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte m39309() {
        byte bMo10516 = this.f53739.mo10516(this.f53740);
        this.f53740++;
        return bMo10516;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m39312() {
        int iMo10515 = this.f53739.mo10515(this.f53740);
        this.f53740++;
        return iMo10515;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final short m39313() {
        short sMo10518 = this.f53739.mo10518(this.f53740);
        this.f53740 += 2;
        return sMo10518;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m39311() {
        int iMo10514 = this.f53739.mo10514(this.f53740);
        this.f53740 += 2;
        return iMo10514;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m39316() {
        int iMo10513 = this.f53739.mo10513(this.f53740);
        this.f53740 += 4;
        return iMo10513;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m39307(int i) {
        int[] iArrMo42229 = this.f53739.mo42229(this.f53740, i);
        this.f53740 = (i * 4) + this.f53740;
        return iArrMo42229;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m39315(int i) {
        int i2 = this.f53740;
        if (i < 0) {
            throw new IndexOutOfBoundsException("Negative string length");
        }
        StringBuilder sb = new StringBuilder(16);
        int i3 = i;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                break;
            }
            char cMo10518 = (char) this.f53739.mo10518(i2);
            i2 += 2;
            if (cMo10518 == 0) {
                break;
            }
            sb.append(cMo10518);
            i3 = i4;
        }
        String string = sb.toString();
        this.f53740 = (i * 2) + this.f53740;
        return string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39306(byte[] bArr) {
        this.f53739.mo10511(this.f53740, bArr.length, bArr);
        this.f53740 += bArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39305() {
        return this.f53739.m48154(this.f53740);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m39308() {
        this.f53740 += 4;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m39317(int i) {
        this.f53740 += i;
    }
}
