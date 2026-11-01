package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14137 extends AbstractC20486 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C14137 f46396 = new C14137(C8014.f26269);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f46397;

    public final Object clone() {
        return this;
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.InterfaceC10609
    public final int getInt(int i) {
        int[] iArr = this.f46397;
        if (i < iArr.length) {
            return iArr[i];
        }
        throw new IndexOutOfBoundsException(C12441.m30911(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    public final int indexOf(int i) {
        int[] iArr = this.f46397;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    public final int lastIndexOf(int i) {
        int[] iArr = this.f46397;
        int length = iArr.length;
        while (true) {
            int i2 = length - 1;
            if (length == 0) {
                return -1;
            }
            if (i == iArr[i2]) {
                return i2;
            }
            length = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46397.length;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609, java.util.List
    public final InterfaceC10609 subList(int i, int i2) {
        if (i == 0 && i2 == this.f46397.length) {
            return this;
        }
        m27091(i);
        m27091(i2);
        if (i == i2) {
            return f46396;
        }
        if (i <= i2) {
            return new C3074(this, i, i2);
        }
        throw new IllegalArgumentException(C8015.m21119("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f46397.length == 0;
    }

    @Override // l.AbstractC10796, l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        int i = 0;
        while (true) {
            int[] iArr = this.f46397;
            if (i >= iArr.length) {
                return;
            }
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // l.AbstractC10796, l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ᩷ */
    public final int[] mo3181() {
        int[] iArr = this.f46397;
        return iArr.length == 0 ? C8014.f26269 : (int[]) iArr.clone();
    }

    @Override // l.AbstractC10796, l.InterfaceC10609, java.util.List
    public final InterfaceC21191 listIterator(int i) {
        m27091(i);
        return new C14365(this, i);
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3167(int i, int i2, int i3, int[] iArr) {
        C7000.m18807(iArr.length, i2, i3);
        System.arraycopy(this.f46397, i, iArr, i2, i3);
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C4963(this);
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C4963(this);
    }

    @Override // l.AbstractC10796, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        int[] iArr;
        int[] iArr2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C14137) {
            C14137 c14137 = (C14137) obj;
            if (c14137 == this || (iArr2 = this.f46397) == (iArr = c14137.f46397)) {
                return true;
            }
            if (iArr2.length != iArr.length) {
                return false;
            }
            return Arrays.equals(iArr2, iArr);
        }
        if (obj instanceof C3074) {
            return ((C3074) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC10796, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C14137) {
            int[] iArr = ((C14137) list).f46397;
            int[] iArr2 = this.f46397;
            if (iArr2 != iArr) {
                int length = iArr2.length;
                int length2 = iArr.length;
                int i = 0;
                while (i < length && i < length2) {
                    int iCompare = Integer.compare(iArr2[i], iArr[i]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i++;
                }
                if (i < length2) {
                    return -1;
                }
                if (i < length) {
                    return 1;
                }
            }
            return 0;
        }
        if (list instanceof C3074) {
            return -((C3074) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    public C14137(int[] iArr) {
        this.f46397 = iArr;
    }
}
