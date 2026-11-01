package l;

/* JADX INFO: renamed from: l.ۧ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11242 implements InterfaceC22510, InterfaceC15767 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC6302 f38032;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract int mo28207();

    @Override // l.InterfaceC15767
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18742(C23800 c23800) {
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract byte[] mo28214();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract int mo28215();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract byte mo28216(int i);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract int mo28217();

    @Override // l.InterfaceC15767
    /* JADX INFO: renamed from: ᩳ */
    public final int mo1941() {
        return 1;
    }

    public AbstractC11242(AbstractC6302 abstractC6302) {
        this.f38032 = abstractC6302;
    }

    @Override // l.InterfaceC22510
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo28213(String str) {
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
    public final AbstractC11242 m28211(AbstractC11242 abstractC11242) {
        int iMo28217 = mo28217();
        int iMo28218 = abstractC11242.mo28217() + iMo28217;
        byte[] bArr = new byte[iMo28218];
        m28212(0, bArr);
        abstractC11242.m28212(iMo28217, bArr);
        return this.f38032.mo17388(0, iMo28218, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 m28209(char c, AbstractC11242 abstractC11242) {
        int iMo28217 = mo28217();
        int i = iMo28217 + 1;
        int iMo28218 = abstractC11242.mo28217() + i;
        byte[] bArr = new byte[iMo28218];
        m28212(0, bArr);
        bArr[iMo28217] = (byte) c;
        abstractC11242.m28212(i, bArr);
        return this.f38032.mo17388(0, iMo28218, bArr);
    }

    public final boolean isEmpty() {
        return mo28217() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28208(byte b) {
        byte[] bArrMo28214 = mo28214();
        int iMo28207 = mo28207();
        int iMo28217 = mo28217();
        do {
            iMo28217--;
            if (iMo28217 < 0) {
                break;
            }
        } while (bArrMo28214[iMo28207 + iMo28217] != b);
        return iMo28217;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m28218(AbstractC11242 abstractC11242) {
        byte[] bArrMo28214 = mo28214();
        int iMo28207 = mo28207();
        int iMo28217 = mo28217();
        byte[] bArrMo28215 = abstractC11242.mo28214();
        int iMo28208 = abstractC11242.mo28207();
        int iMo28218 = abstractC11242.mo28217();
        if (iMo28217 >= iMo28218) {
            int i = 0;
            while (i < iMo28218 && bArrMo28214[iMo28207 + i] == bArrMo28215[iMo28208 + i]) {
                i++;
            }
            if (i == iMo28218) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 m28210(int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        byte[] bArrMo28214 = mo28214();
        return this.f38032.mo17388(mo28207() + i, i2 - i, bArrMo28214);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return C17281.m40240(mo28207(), mo28217(), mo28214());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28212(int i, byte[] bArr) {
        System.arraycopy(mo28214(), mo28207(), bArr, i, mo28217());
    }
}
