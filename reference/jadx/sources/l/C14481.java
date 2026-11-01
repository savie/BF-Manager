package l;

/* JADX INFO: renamed from: l.ܳۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: HAWG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14481 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] f47457 = new Object[16];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f47458;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f47459;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34883() {
        return this.f47459 == this.f47458;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34882(AbstractC13255 abstractC13255) {
        Object[] objArr = this.f47457;
        int i = this.f47458;
        objArr[i] = abstractC13255;
        int length = (objArr.length - 1) & (i + 1);
        this.f47458 = length;
        int i2 = this.f47459;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            C1676.m5592(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = this.f47457;
            int length3 = objArr3.length;
            int i3 = this.f47459;
            C1676.m5592(objArr3, objArr2, length3 - i3, 0, i3, 4);
            this.f47457 = objArr2;
            this.f47459 = 0;
            this.f47458 = length2;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m34884() {
        int i = this.f47459;
        if (i == this.f47458) {
            return null;
        }
        Object[] objArr = this.f47457;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f47459 = (i + 1) & (objArr.length - 1);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
