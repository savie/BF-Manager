package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۧ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11863 extends AbstractC2169 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] f38241;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int mo29726() {
        return 0;
    }

    public C11863(byte[] bArr) {
        bArr.getClass();
        this.f38241 = bArr;
    }

    @Override // l.AbstractC17084
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte mo29720(int i) {
        return this.f38241[i];
    }

    @Override // l.AbstractC17084
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte mo29727(int i) {
        return this.f38241[i];
    }

    @Override // l.AbstractC17084
    public int size() {
        return this.f38241.length;
    }

    @Override // l.AbstractC17084
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC17084 mo29728(int i, int i2) {
        int iM40220 = AbstractC17084.m40220(i, i2, size());
        if (iM40220 == 0) {
            return AbstractC17084.f55772;
        }
        return new C20068(this.f38241, mo29726() + i, iM40220);
    }

    @Override // l.AbstractC17084
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo29723(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f38241, i, bArr, i2, i3);
    }

    @Override // l.AbstractC17084
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29724(AbstractC14846 abstractC14846) {
        abstractC14846.mo14005(mo29726(), size(), this.f38241);
    }

    @Override // l.AbstractC17084
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo29722(Charset charset) {
        return new String(this.f38241, mo29726(), size(), charset);
    }

    @Override // l.AbstractC17084
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo29729() {
        int iMo29726 = mo29726();
        return C11643.m29259(iMo29726, size() + iMo29726, this.f38241);
    }

    @Override // l.AbstractC17084
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC17084) || size() != ((AbstractC17084) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C11863)) {
            return obj.equals(this);
        }
        C11863 c11863 = (C11863) obj;
        int iM40223 = m40223();
        int iM40224 = c11863.m40223();
        if (iM40223 != 0 && iM40224 != 0 && iM40223 != iM40224) {
            return false;
        }
        int size = size();
        if (size > c11863.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        int i = 0 + size;
        if (i > c11863.size()) {
            StringBuilder sbM5126 = C1402.m5126("Ran off end of other: ", 0, ", ", ", ", size);
            sbM5126.append(c11863.size());
            throw new IllegalArgumentException(sbM5126.toString());
        }
        if (!(c11863 instanceof C11863)) {
            return c11863.mo29728(0, i).equals(mo29728(0, size));
        }
        byte[] bArr = c11863.f38241;
        int iMo29726 = mo29726() + size;
        int iMo29727 = mo29726();
        int iMo29728 = c11863.mo29726() + 0;
        while (iMo29727 < iMo29726) {
            if (this.f38241[iMo29727] != bArr[iMo29728]) {
                return false;
            }
            iMo29727++;
            iMo29728++;
        }
        return true;
    }

    @Override // l.AbstractC17084
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo29721(int i, int i2, int i3) {
        int iMo29726 = mo29726() + i2;
        byte[] bArr = C23447.f75887;
        for (int i4 = iMo29726; i4 < iMo29726 + i3; i4++) {
            i = (i * 31) + this.f38241[i4];
        }
        return i;
    }

    @Override // l.AbstractC17084
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC3660 mo29725() {
        return AbstractC3660.m11872(true, mo29726(), size(), this.f38241);
    }
}
