package l;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6909 extends AbstractList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18842 f22905 = new C18842();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19164(C6909 c6909) {
        ((AbstractList) c6909).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m19173((C14366) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C14366 c14366 = get(i);
        this.f22905.m43733(i, (C14366) obj);
        return c14366;
    }

    public C6909() {
    }

    public C6909(int i) {
    }

    public C6909(Collection collection) {
        addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f22905.m43734(), collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22905.m43734();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m19167(int i) {
        int iM43734 = this.f22905.m43734() - 1;
        int i2 = 0;
        while (i2 <= iM43734) {
            int i3 = (i2 + iM43734) >>> 1;
            int iM19188 = m19188(i3);
            if (i < iM19188) {
                iM43734 = i3 - 1;
            } else {
                if (i <= iM19188) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19173(C14366 c14366) {
        add(this.f22905.m43734(), c14366);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m19174(int i) {
        return i == this.f22905.m43734() - 1 || m19188(i + 1) != m19188(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m19175() {
        return this.f22905.m43734() == 1 && m19176(0) == m19180(0);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m19178() {
        return this.f22905.m43734() - 1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m19186(int i, int i2) {
        if (i2 >= 0) {
            int iM43734 = this.f22905.m43734();
            if (iM43734 == 0) {
                return -1;
            }
            int iMin = Math.min(i2, iM43734 - 1);
            int iM19188 = m19188(iMin);
            if (iM19188 == i) {
                return iMin;
            }
            if (iM19188 < i) {
                int iM19165 = m19165(i, iMin, false);
                if (iM19165 >= iM43734 || m19188(iM19165) != i) {
                    return -1;
                }
                return iM19165;
            }
            int iM19166 = m19165(i, iMin, true) - 1;
            if (iM19166 < 0 || m19188(iM19166) != i) {
                return -1;
            }
            return iM19166;
        }
        throw new IndexOutOfBoundsException("Negative line index");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f22905.m43727();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final C14366 get(int i) {
        C14366 c14366 = new C14366();
        this.f22905.m43737(i, c14366);
        return c14366;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19184(int i, C14366 c14366) {
        this.f22905.m43733(i, c14366);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void add(int i, C14366 c14366) {
        this.f22905.m43731(i, c14366);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        C14366 c14366 = get(i);
        m19168(i, i + 1);
        return c14366;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C6909 c6909;
        if (collection instanceof C6909) {
            c6909 = (C6909) collection;
        } else {
            C6909 c69010 = new C6909();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c69010.m19173((C14366) it.next());
            }
            c6909 = c69010;
        }
        this.f22905.m43736(i, i, c6909.f22905);
        ((AbstractList) this).modCount++;
        return !c6909.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19168(int i, int i2) {
        this.f22905.m43736(i, i2, new C18842());
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m19168(i, i2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m19176(int i) {
        return this.f22905.m43735(i, 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m19180(int i) {
        return this.f22905.m43735(i, 1);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m19188(int i) {
        return this.f22905.m43735(i, 2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18096 m19181() {
        C18842 c18842 = this.f22905;
        c18842.getClass();
        return new C18096(c18842);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19169(int i, int i2, int i3, int i4) {
        this.f22905.m43729(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19182(int i, int i2) {
        this.f22905.m43728(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19170(int i, int i2, C6909 c6909) {
        this.f22905.m43730(i, i2, c6909.f22905);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19172(C6909 c6909) {
        if (this.f22905.m43732(c6909.f22905)) {
            ((AbstractList) this).modCount++;
            ((AbstractList) c6909).modCount++;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m19177(int i) {
        return i == 0 || m19188(i + (-1)) != m19188(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m19185(int i) {
        return m19165(m19188(i), i, false);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m19179(int i) {
        return m19165(m19188(i), i, true) - 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m19165(int i, int i2, boolean z) {
        int iM43734;
        int i3;
        long j = 1;
        if (!m19163(i2, i, z)) {
            iM43734 = i2;
            while (true) {
                if (j > i2) {
                    i3 = 0;
                    break;
                }
                int i4 = i2 - ((int) j);
                if (m19163(i4, i, z)) {
                    i3 = i4 + 1;
                    break;
                }
                j <<= 1;
                iM43734 = i4;
            }
        } else {
            i3 = i2 + 1;
            C18842 c18842 = this.f22905;
            iM43734 = c18842.m43734();
            while (j < ((long) c18842.m43734()) - ((long) i2)) {
                int i5 = ((int) j) + i2;
                if (!m19163(i5, i, z)) {
                    iM43734 = i5;
                    break;
                }
                i3 = i5 + 1;
                j <<= 1;
            }
        }
        while (i3 < iM43734) {
            int i6 = (i3 + iM43734) >>> 1;
            if (m19163(i6, i, z)) {
                i3 = i6 + 1;
            } else {
                iM43734 = i6;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m19163(int i, int i2, boolean z) {
        int iM19188 = m19188(i);
        if (iM19188 >= i2) {
            return z && iM19188 == i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14366 m19187() {
        return get(m19178());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19183(int i, int i2, C6909 c6909) {
        this.f22905.m43736(i, i2 + i, c6909.f22905);
        ((AbstractList) this).modCount++;
    }
}
