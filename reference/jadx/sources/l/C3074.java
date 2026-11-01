package l;

import com.google.android.material.motion.MotionUtils;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3074 extends AbstractC20486 implements RandomAccess, Serializable {
    public static final long serialVersionUID = 7054639518438982401L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14137 f11639;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final transient int[] f11640;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f11641;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f11642;

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3167(int i, int i2, int i3, int[] iArr) {
        C7000.m18807(iArr.length, i2, i3);
        m27090(i);
        int i4 = this.f11642;
        if (i4 + i3 > this.f11641) {
            throw new IndexOutOfBoundsException("Final index " + (i4 + i3) + " (startingIndex: " + i4 + " + length: " + i3 + ") is greater then list length " + size());
        }
        System.arraycopy(this.f11640, i + i4, iArr, i2, i3);
    }

    @Override // l.InterfaceC10609
    public final int getInt(int i) {
        m27090(i);
        return this.f11640[i + this.f11642];
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    public final int indexOf(int i) {
        int i2 = this.f11642;
        for (int i3 = i2; i3 < this.f11641; i3++) {
            if (i == this.f11640[i3]) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    public final int lastIndexOf(int i) {
        int i2 = this.f11641;
        while (true) {
            int i3 = i2 - 1;
            int i4 = this.f11642;
            if (i2 == i4) {
                return -1;
            }
            if (i == this.f11640[i3]) {
                return i3 - i4;
            }
            i2 = i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11641 - this.f11642;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f11641 <= this.f11642;
    }

    @Override // l.AbstractC10796, l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        for (int i = this.f11642; i < this.f11641; i++) {
            intConsumer.accept(this.f11640[i]);
        }
    }

    @Override // l.AbstractC10796, l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ᩷ */
    public final int[] mo3181() {
        return Arrays.copyOfRange(this.f11640, this.f11642, this.f11641);
    }

    @Override // l.AbstractC10796, l.InterfaceC10609, java.util.List
    public final InterfaceC21191 listIterator(int i) {
        m27091(i);
        return new C1663(this, i);
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C9426(this);
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C9426(this);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m9252(int i, int i2, int[] iArr) {
        int i3 = this.f11641;
        int i4 = this.f11642;
        int[] iArr2 = this.f11640;
        if (iArr2 == iArr && i4 == i && i3 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i4 < i3) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            if (iArr2[i4] != iArr[i]) {
                return false;
            }
            i4 = i5;
            i = i6;
        }
        return true;
    }

    @Override // l.AbstractC10796, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C14137) {
            C14137 c14137 = (C14137) obj;
            return m9252(0, c14137.size(), c14137.f46397);
        }
        if (obj instanceof C3074) {
            C3074 c3074 = (C3074) obj;
            return m9252(c3074.f11642, c3074.f11641, c3074.f11640);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m9254(int i, int i2, int[] iArr) {
        int i3 = this.f11641;
        int i4 = this.f11642;
        int[] iArr2 = this.f11640;
        if (iArr2 == iArr && i4 == i && i3 == i2) {
            return 0;
        }
        while (i4 < i3 && i4 < i2) {
            int iCompare = Integer.compare(iArr2[i4], iArr[i]);
            if (iCompare != 0) {
                return iCompare;
            }
            i4++;
            i++;
        }
        if (i4 < i2) {
            return -1;
        }
        return i4 < i3 ? 1 : 0;
    }

    @Override // l.AbstractC10796, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int compareTo(List list) {
        if (list instanceof C14137) {
            C14137 c14137 = (C14137) list;
            return m9254(0, c14137.size(), c14137.f46397);
        }
        if (list instanceof C3074) {
            C3074 c3074 = (C3074) list;
            return m9254(c3074.f11642, c3074.f11641, c3074.f11640);
        }
        return super.compareTo(list);
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return this.f11639.subList(this.f11642, this.f11641);
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    @Override // l.AbstractC10796, l.InterfaceC10609, java.util.List
    public final InterfaceC10609 subList(int i, int i2) {
        m27091(i);
        m27091(i2);
        if (i == i2) {
            return C14137.f46396;
        }
        if (i > i2) {
            throw new IllegalArgumentException(C8015.m21119("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        int i3 = this.f11642;
        return new C3074(this.f11639, i + i3, i2 + i3);
    }

    public C3074(C14137 c14137, int i, int i2) {
        this.f11639 = c14137;
        this.f11642 = i;
        this.f11641 = i2;
        this.f11640 = c14137.f46397;
    }
}
