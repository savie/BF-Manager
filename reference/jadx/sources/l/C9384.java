package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5608 */
/* JADX INFO: loaded from: classes4.dex */
public class C9384 extends AbstractC7213 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Object[] f30462;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30463;

    public C9384() {
        super(4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9384 mo24712(Object... objArr) {
        if (this.f30462 != null) {
            for (Object obj : objArr) {
                mo24710(obj);
            }
            return this;
        }
        m19804(objArr.length, objArr);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9384 mo24711(C9384 c9384) {
        if (this.f30462 != null) {
            for (int i = 0; i < c9384.f23799; i++) {
                Object obj = c9384.f23798[i];
                C17359.requireNonNull(obj);
                mo24710(obj);
            }
            return this;
        }
        m19804(c9384.f23799, c9384.f23798);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC8639 mo24709() {
        AbstractC8639 abstractC8639M23281;
        int i = this.f23799;
        if (i == 0) {
            int i2 = AbstractC8639.f28224;
            return C13070.f41806;
        }
        if (i == 1) {
            Object obj = this.f23798[0];
            C17359.requireNonNull(obj);
            int i3 = AbstractC8639.f28224;
            return new C6359(obj);
        }
        if (this.f30462 == null || AbstractC8639.m23275(i) != this.f30462.length) {
            abstractC8639M23281 = AbstractC8639.m23281(this.f23799, this.f23798);
            this.f23799 = abstractC8639M23281.size();
        } else {
            int i4 = this.f23799;
            Object[] objArrCopyOf = this.f23798;
            int length = objArrCopyOf.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            }
            int i5 = this.f30463;
            Object[] objArr = this.f30462;
            abstractC8639M23281 = new C13070(i5, objArr.length - 1, this.f23799, objArrCopyOf, objArr);
        }
        this.f23800 = true;
        this.f30462 = null;
        return abstractC8639M23281;
    }

    @Override // l.AbstractC7213
    /* JADX INFO: renamed from: ۙ */
    public C9384 mo19803(Iterable iterable) {
        iterable.getClass();
        if (this.f30462 != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                mo24710(it.next());
            }
            return this;
        }
        mo19803(iterable);
        return this;
    }

    @Override // l.AbstractC13924
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9384 mo24710(Object obj) {
        obj.getClass();
        if (this.f30462 != null) {
            int iM23275 = AbstractC8639.m23275(this.f23799);
            Object[] objArr = this.f30462;
            if (iM23275 <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iM4501 = C1247.m4501(iHashCode);
                while (true) {
                    int i = iM4501 & length;
                    Object[] objArr2 = this.f30462;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f30463 += iHashCode;
                        m19805(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iM4501 = i + 1;
                }
            }
        }
        this.f30462 = null;
        m19805(obj);
        return this;
    }
}
