package l;

import com.google.android.material.textfield.IndicatorViewController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AST */
/* JADX INFO: loaded from: classes4.dex */
public class C17643 implements Set {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC0709 f56078;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f56079;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f56080;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public BitSet f56081;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f56082;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f56083;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f56084;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f56085;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20466[] f56086;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f56087;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        m41115((C20466) obj, null);
        return true;
    }

    public C17643() {
        this(true, false);
    }

    public C17643(boolean z, boolean z2) {
        this.f56087 = false;
        this.f56084 = new ArrayList(7);
        this.f56083 = -1;
        this.f56079 = z;
        if (z2) {
            this.f56086 = new C20466[8];
        } else {
            this.f56078 = new C12705(C16938.f54136, 2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41115(C20466 c20466, C13577 c13577) {
        C20466 c20467;
        if (this.f56087) {
            throw new IllegalStateException("This set is readonly");
        }
        AbstractC8907 abstractC8907 = c20466.f66404;
        AbstractC2120 abstractC2120 = c20466.f66406;
        if (abstractC8907 != C21606.f70083) {
            this.f56080 = true;
        }
        if ((c20466.f66407 & (-1073741825)) > 0) {
            this.f56085 = true;
        }
        C20466[] c20466Arr = this.f56086;
        ArrayList arrayList = this.f56084;
        if (c20466Arr == null) {
            c20467 = (C20466) this.f56078.m12269(c20466);
        } else {
            int i = abstractC2120.f7775;
            int i2 = c20466.f66405;
            int iM41112 = m41112(i, i2, abstractC8907);
            c20467 = this.f56086[iM41112];
            if (c20467 == null) {
                int size = arrayList.size();
                C20466[] c20466Arr2 = this.f56086;
                if (size >= c20466Arr2.length / 2) {
                    this.f56086 = new C20466[c20466Arr2.length * 2];
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        C20466 c20468 = (C20466) arrayList.get(i3);
                        this.f56086[m41112(c20468.f66406.f7775, c20468.f66405, c20468.f66404)] = c20468;
                    }
                    iM41112 = m41112(abstractC2120.f7775, i2, abstractC8907);
                }
                this.f56086[iM41112] = c20466;
                c20467 = c20466;
            }
        }
        if (c20467 == c20466) {
            this.f56083 = -1;
            arrayList.add(c20466);
        } else {
            m41113(c20467, c20466.f66408, c20466.f66407, c13577);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41114(C20466 c20466, AbstractC2120 abstractC2120, AbstractC11729 abstractC11729, AbstractC8907 abstractC8907, C13577 c13577) {
        C20466 c20467;
        if (this.f56087) {
            throw new IllegalStateException("This set is readonly");
        }
        C20466[] c20466Arr = this.f56086;
        if (c20466Arr != null && (c20467 = c20466Arr[m41112(abstractC2120.f7775, c20466.f66405, abstractC8907)]) != null) {
            if (abstractC8907 != C21606.f70083) {
                this.f56080 = true;
            }
            int i = c20466.f66407;
            if (((-1073741825) & i) > 0) {
                this.f56085 = true;
            }
            m41113(c20467, abstractC11729, i, c13577);
            return;
        }
        m41115(new C20466(c20466, abstractC2120, abstractC11729, abstractC8907), c13577);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41113(C20466 c20466, AbstractC11729 abstractC11729, int i, C13577 c13577) {
        AbstractC11729 abstractC11729M29311 = AbstractC11729.m29311(c20466.f66408, abstractC11729, !this.f56079, c13577);
        int iMax = Math.max(c20466.f66407, i);
        c20466.f66407 = iMax;
        if ((i & 1073741824) != 0) {
            c20466.f66407 = iMax | 1073741824;
        }
        c20466.f66408 = abstractC11729M29311;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41112(int i, int i2, AbstractC8907 abstractC8907) {
        int i3;
        int iHashCode = abstractC8907.hashCode() + ((((i + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + i2) * 31);
        int length = this.f56086.length - 1;
        int i4 = iHashCode ^ (iHashCode >>> 16);
        while (true) {
            i3 = i4 & length;
            C20466 c20466 = this.f56086[i3];
            if (c20466 == null || (c20466.f66406.f7775 == i && c20466.f66405 == i2 && c20466.f66404.equals(abstractC8907))) {
                break;
            }
            i4 = i3 + 1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final BitSet m41117() {
        BitSet bitSet = new BitSet();
        Iterator it = this.f56084.iterator();
        while (it.hasNext()) {
            bitSet.set(((C20466) it.next()).f66405);
        }
        return bitSet;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m41115((C20466) it.next(), null);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17643)) {
            return false;
        }
        C17643 c17643 = (C17643) obj;
        ArrayList arrayList = this.f56084;
        return arrayList != null && arrayList.equals(c17643.f56084) && this.f56079 == c17643.f56079 && this.f56082 == c17643.f56082 && this.f56081 == c17643.f56081 && this.f56080 == c17643.f56080 && this.f56085 == c17643.f56085;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f56084.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f56084.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        boolean zM12272;
        C20466[] c20466Arr = this.f56086;
        if (c20466Arr == null) {
            AbstractC0709 abstractC0709 = this.f56078;
            if (abstractC0709 == null) {
                throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
            }
            return abstractC0709.contains(obj);
        }
        if (obj instanceof C20466) {
            C20466 c20466 = (C20466) obj;
            if (c20466Arr != null) {
                zM12272 = c20466Arr[m41112(c20466.f66406.f7775, c20466.f66405, c20466.f66404)] != null;
            } else {
                AbstractC0709 abstractC07010 = this.f56078;
                if (abstractC07010 == null) {
                    throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
                }
                zM12272 = abstractC07010.m12272(c20466);
            }
            if (zM12272) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f56084.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.f56087) {
            throw new IllegalStateException("This set is readonly");
        }
        this.f56084.clear();
        this.f56083 = -1;
        C20466[] c20466Arr = this.f56086;
        if (c20466Arr != null) {
            Arrays.fill(c20466Arr, (Object) null);
        } else {
            this.f56078.clear();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        boolean z = this.f56087;
        ArrayList arrayList = this.f56084;
        if (z) {
            if (this.f56083 == -1) {
                this.f56083 = arrayList.hashCode();
            }
            return this.f56083;
        }
        return arrayList.hashCode();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m41116() {
        this.f56087 = true;
        this.f56078 = null;
        this.f56086 = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56084.toString());
        if (this.f56080) {
            sb.append(",hasSemanticContext=");
            sb.append(this.f56080);
        }
        if (this.f56082 != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.f56082);
        }
        if (this.f56081 != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.f56081);
        }
        if (this.f56085) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        if (this.f56086 == null) {
            return (C20466[]) this.f56078.toArray();
        }
        ArrayList arrayList = this.f56084;
        return (C20466[]) arrayList.toArray(new C20466[arrayList.size()]);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f56086 != null ? this.f56084.toArray(objArr) : this.f56078.toArray(objArr);
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
