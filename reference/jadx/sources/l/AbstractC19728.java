package l;

/* JADX INFO: renamed from: l.ᩴۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19728 implements InterfaceC3058, InterfaceC13564 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22712 f63499;

    @Override // l.InterfaceC13564
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2971(C24705 c24705) {
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract byte[] mo42394();

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo42395();

    @Override // l.InterfaceC13564
    /* JADX INFO: renamed from: ܶ */
    public final int mo2973() {
        return 1;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract int mo42396();

    /* JADX INFO: renamed from: ᩷ */
    public abstract byte mo42397(int i);

    /* JADX INFO: renamed from: ᩸ */
    public abstract int mo42398();

    public AbstractC19728(AbstractC22712 abstractC22712) {
        this.f63499 = abstractC22712;
    }

    @Override // l.InterfaceC3058
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9945(String str) {
        return toString().equals(str.toString());
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return toString().charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 m45430(AbstractC19728 abstractC19728) {
        int iMo42395 = mo42395();
        int iMo42396 = abstractC19728.mo42395() + iMo42395;
        byte[] bArr = new byte[iMo42396];
        m45431(0, bArr);
        abstractC19728.m45431(iMo42395, bArr);
        return this.f63499.mo2068(0, iMo42396, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 m45428(char c, AbstractC19728 abstractC19728) {
        int iMo42395 = mo42395();
        int i = iMo42395 + 1;
        int iMo42396 = abstractC19728.mo42395() + i;
        byte[] bArr = new byte[iMo42396];
        m45431(0, bArr);
        bArr[iMo42395] = (byte) c;
        abstractC19728.m45431(i, bArr);
        return this.f63499.mo2068(0, iMo42396, bArr);
    }

    public final boolean isEmpty() {
        return mo42395() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45427(byte b) {
        byte[] bArrMo42394 = mo42394();
        int iMo42398 = mo42398();
        int iMo42395 = mo42395();
        do {
            iMo42395--;
            if (iMo42395 < 0) {
                break;
            }
        } while (bArrMo42394[iMo42398 + iMo42395] != b);
        return iMo42395;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m45432(AbstractC19728 abstractC19728) {
        byte[] bArrMo42394 = mo42394();
        int iMo42398 = mo42398();
        int iMo42395 = mo42395();
        byte[] bArrMo42395 = abstractC19728.mo42394();
        int iMo42399 = abstractC19728.mo42398();
        int iMo42396 = abstractC19728.mo42395();
        if (iMo42395 >= iMo42396) {
            int i = 0;
            while (i < iMo42396 && bArrMo42394[iMo42398 + i] == bArrMo42395[iMo42399 + i]) {
                i++;
            }
            if (i == iMo42396) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 m45429(int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        byte[] bArrMo42394 = mo42394();
        return this.f63499.mo2068(mo42398() + i, i2 - i, bArrMo42394);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return C21901.m49591(mo42398(), mo42395(), mo42394());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45431(int i, byte[] bArr) {
        System.arraycopy(mo42394(), mo42398(), bArr, i, mo42395());
    }
}
