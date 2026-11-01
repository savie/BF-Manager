package l;

/* JADX INFO: renamed from: l.ۤ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G7KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10143 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Object f34639 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f34642;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object[] f34640 = new Object[64];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f34641 = new int[64];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f34643 = 63;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25781(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i = (iIdentityHashCode >>> 15) ^ iIdentityHashCode;
        int i2 = (iIdentityHashCode ^ (iIdentityHashCode << 6)) | 1;
        int i3 = i & this.f34643;
        int i4 = -1;
        while (true) {
            Object obj2 = this.f34640[i3];
            if (obj2 == obj) {
                break;
            }
            if (obj2 != null) {
                if (obj2 == f34639 && i4 < 0) {
                    i4 = i3;
                }
                i3 = (i3 + i2) & this.f34643;
            } else if (i4 >= 0) {
                return i4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25782(AbstractC8774 abstractC8774) {
        int iM25781 = m25781((Object) abstractC8774);
        Object obj = this.f34640[iM25781];
        if (obj == null || obj == f34639) {
            return -1;
        }
        return this.f34641[iM25781];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25783(int i, Object obj) {
        int iM25781 = m25781(obj);
        Object[] objArr = this.f34640;
        Object obj2 = objArr[iM25781];
        Object obj3 = f34639;
        if (obj2 == null || obj2 == obj3) {
            objArr[iM25781] = obj;
            int[] iArr = this.f34641;
            iArr[iM25781] = i;
            if (obj2 != obj3) {
                this.f34642++;
            }
            if (this.f34642 * 3 < objArr.length * 2) {
                return;
            }
            int length = objArr.length << 1;
            this.f34640 = new Object[length];
            this.f34641 = new int[length];
            this.f34643 = length - 1;
            this.f34642 = 0;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    return;
                }
                Object obj4 = objArr[length2];
                if (obj4 != null && obj4 != obj3) {
                    m25783(iArr[length2], obj4);
                }
            }
        } else {
            int[] iArr2 = this.f34641;
            int i2 = iArr2[iM25781];
            iArr2[iM25781] = i;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m25784(AbstractC8774 abstractC8774) {
        Object obj;
        int iM25781 = m25781((Object) abstractC8774);
        Object[] objArr = this.f34640;
        Object obj2 = objArr[iM25781];
        if (obj2 == null || obj2 == (obj = f34639)) {
            return -1;
        }
        objArr[iM25781] = obj;
        return this.f34641[iM25781];
    }
}
