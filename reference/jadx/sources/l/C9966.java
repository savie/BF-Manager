package l;

/* JADX INFO: renamed from: l.ۢ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9966 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Object f32028 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f32030;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object[] f32032 = new Object[64];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f32029 = new int[64];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f32031 = 63;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25799(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i = (iIdentityHashCode >>> 15) ^ iIdentityHashCode;
        int i2 = (iIdentityHashCode ^ (iIdentityHashCode << 6)) | 1;
        int i3 = i & this.f32031;
        int i4 = -1;
        while (true) {
            Object obj2 = this.f32032[i3];
            if (obj2 == obj) {
                break;
            }
            if (obj2 != null) {
                if (obj2 == f32028 && i4 < 0) {
                    i4 = i3;
                }
                i3 = (i3 + i2) & this.f32031;
            } else if (i4 >= 0) {
                return i4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25800(AbstractC8036 abstractC8036) {
        int iM25799 = m25799((Object) abstractC8036);
        Object obj = this.f32032[iM25799];
        if (obj == null || obj == f32028) {
            return -1;
        }
        return this.f32029[iM25799];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25801(int i, Object obj) {
        int iM25799 = m25799(obj);
        Object[] objArr = this.f32032;
        Object obj2 = objArr[iM25799];
        Object obj3 = f32028;
        if (obj2 == null || obj2 == obj3) {
            objArr[iM25799] = obj;
            int[] iArr = this.f32029;
            iArr[iM25799] = i;
            if (obj2 != obj3) {
                this.f32030++;
            }
            if (this.f32030 * 3 < objArr.length * 2) {
                return;
            }
            int length = objArr.length << 1;
            this.f32032 = new Object[length];
            this.f32029 = new int[length];
            this.f32031 = length - 1;
            this.f32030 = 0;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    return;
                }
                Object obj4 = objArr[length2];
                if (obj4 != null && obj4 != obj3) {
                    m25801(iArr[length2], obj4);
                }
            }
        } else {
            int[] iArr2 = this.f32029;
            int i2 = iArr2[iM25799];
            iArr2[iM25799] = i;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m25802(AbstractC8036 abstractC8036) {
        Object obj;
        int iM25799 = m25799((Object) abstractC8036);
        Object[] objArr = this.f32032;
        Object obj2 = objArr[iM25799];
        if (obj2 == null || obj2 == (obj = f32028)) {
            return -1;
        }
        objArr[iM25799] = obj;
        return this.f32029[iM25799];
    }
}
