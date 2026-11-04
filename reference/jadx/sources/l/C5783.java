package l;

import com.google.android.material.textfield.IndicatorViewController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AST */
/* JADX INFO: loaded from: classes3.dex */
public class C5783 implements Set {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f19856;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f19857;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f19858;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public BitSet f19859;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f19860;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f19861;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f19862;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC19953 f19863;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f19864;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22937[] f19865;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        m16885((C22937) obj, null);
        return true;
    }

    public C5783() {
        this(true, false);
    }

    public C5783(boolean z, boolean z2) {
        this.f19860 = false;
        this.f19856 = new ArrayList(7);
        this.f19862 = -1;
        this.f19861 = z;
        if (z2) {
            this.f19865 = new C22937[8];
        } else {
            this.f19863 = new C13240(C15477.f50389, 2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16885(C22937 c22937, C20875 c20875) {
        C22937 c22938;
        if (this.f19860) {
            throw new IllegalStateException("This set is readonly");
        }
        AbstractC7230 abstractC7230 = c22937.f74516;
        AbstractC17715 abstractC17715 = c22937.f74514;
        if (abstractC7230 != C10212.f32654) {
            this.f19857 = true;
        }
        if ((c22937.f74513 & (-1073741825)) > 0) {
            this.f19864 = true;
        }
        C22937[] c22937Arr = this.f19865;
        ArrayList arrayList = this.f19856;
        if (c22937Arr == null) {
            c22938 = (C22937) this.f19863.m12111(c22937);
        } else {
            int i = abstractC17715.f58209;
            int i2 = c22937.f74512;
            int iM16882 = m16882(i, i2, abstractC7230);
            c22938 = this.f19865[iM16882];
            if (c22938 == null) {
                int size = arrayList.size();
                C22937[] c22937Arr2 = this.f19865;
                if (size >= c22937Arr2.length / 2) {
                    this.f19865 = new C22937[c22937Arr2.length * 2];
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        C22937 c22939 = (C22937) arrayList.get(i3);
                        this.f19865[m16882(c22939.f74514.f58209, c22939.f74512, c22939.f74516)] = c22939;
                    }
                    iM16882 = m16882(abstractC17715.f58209, i2, abstractC7230);
                }
                this.f19865[iM16882] = c22937;
                c22938 = c22937;
            }
        }
        if (c22938 == c22937) {
            this.f19862 = -1;
            arrayList.add(c22937);
        } else {
            m16883(c22938, c22937.f74515, c22937.f74513, c20875);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16884(C22937 c22937, AbstractC17715 abstractC17715, AbstractC12450 abstractC12450, AbstractC7230 abstractC7230, C20875 c20875) {
        C22937 c22938;
        if (this.f19860) {
            throw new IllegalStateException("This set is readonly");
        }
        C22937[] c22937Arr = this.f19865;
        if (c22937Arr != null && (c22938 = c22937Arr[m16882(abstractC17715.f58209, c22937.f74512, abstractC7230)]) != null) {
            if (abstractC7230 != C10212.f32654) {
                this.f19857 = true;
            }
            int i = c22937.f74513;
            if (((-1073741825) & i) > 0) {
                this.f19864 = true;
            }
            m16883(c22938, abstractC12450, i, c20875);
            return;
        }
        m16885(new C22937(c22937, abstractC17715, abstractC12450, abstractC7230), c20875);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16883(C22937 c22937, AbstractC12450 abstractC12450, int i, C20875 c20875) {
        AbstractC12450 abstractC12450M30920 = AbstractC12450.m30920(c22937.f74515, abstractC12450, !this.f19861, c20875);
        int iMax = Math.max(c22937.f74513, i);
        c22937.f74513 = iMax;
        if ((i & 1073741824) != 0) {
            c22937.f74513 = iMax | 1073741824;
        }
        c22937.f74515 = abstractC12450M30920;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m16882(int i, int i2, AbstractC7230 abstractC7230) {
        int i3;
        int iHashCode = abstractC7230.hashCode() + ((((i + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + i2) * 31);
        int length = this.f19865.length - 1;
        int i4 = iHashCode ^ (iHashCode >>> 16);
        while (true) {
            i3 = i4 & length;
            C22937 c22937 = this.f19865[i3];
            if (c22937 == null || (c22937.f74514.f58209 == i && c22937.f74512 == i2 && c22937.f74516.equals(abstractC7230))) {
                break;
            }
            i4 = i3 + 1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BitSet m16887() {
        BitSet bitSet = new BitSet();
        Iterator it = this.f19856.iterator();
        while (it.hasNext()) {
            bitSet.set(((C22937) it.next()).f74512);
        }
        return bitSet;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m16885((C22937) it.next(), null);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5783)) {
            return false;
        }
        C5783 c5783 = (C5783) obj;
        ArrayList arrayList = this.f19856;
        return arrayList != null && arrayList.equals(c5783.f19856) && this.f19861 == c5783.f19861 && this.f19858 == c5783.f19858 && this.f19859 == c5783.f19859 && this.f19857 == c5783.f19857 && this.f19864 == c5783.f19864;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f19856.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f19856.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        boolean zM12109;
        C22937[] c22937Arr = this.f19865;
        if (c22937Arr == null) {
            AbstractC19953 abstractC19953 = this.f19863;
            if (abstractC19953 == null) {
                throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
            }
            return abstractC19953.contains(obj);
        }
        if (obj instanceof C22937) {
            C22937 c22937 = (C22937) obj;
            if (c22937Arr != null) {
                zM12109 = c22937Arr[m16882(c22937.f74514.f58209, c22937.f74512, c22937.f74516)] != null;
            } else {
                AbstractC19953 abstractC19954 = this.f19863;
                if (abstractC19954 == null) {
                    throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
                }
                zM12109 = abstractC19954.m12109(c22937);
            }
            if (zM12109) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f19856.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.f19860) {
            throw new IllegalStateException("This set is readonly");
        }
        this.f19856.clear();
        this.f19862 = -1;
        C22937[] c22937Arr = this.f19865;
        if (c22937Arr != null) {
            Arrays.fill(c22937Arr, (Object) null);
        } else {
            this.f19863.clear();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        boolean z = this.f19860;
        ArrayList arrayList = this.f19856;
        if (z) {
            if (this.f19862 == -1) {
                this.f19862 = arrayList.hashCode();
            }
            return this.f19862;
        }
        return arrayList.hashCode();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m16886() {
        this.f19860 = true;
        this.f19863 = null;
        this.f19865 = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19856.toString());
        if (this.f19857) {
            sb.append(",hasSemanticContext=");
            sb.append(this.f19857);
        }
        if (this.f19858 != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.f19858);
        }
        if (this.f19859 != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.f19859);
        }
        if (this.f19864) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        if (this.f19865 == null) {
            return (C22937[]) this.f19863.toArray();
        }
        ArrayList arrayList = this.f19856;
        return (C22937[]) arrayList.toArray(new C22937[arrayList.size()]);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f19865 != null ? this.f19856.toArray(objArr) : this.f19863.toArray(objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
