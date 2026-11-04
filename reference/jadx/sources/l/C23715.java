package l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes2.dex */
public final class C23715 extends AbstractC5991 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f76856;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f76857;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f76858;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3577 f76859;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f76860;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C17001 c17001 = this.f76859.f12251;
        return !(m52967() != null);
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        comparator();
        return null;
    }

    public C23715(C3577 c3577, int i, boolean z, int i2, boolean z2) {
        this.f76859 = c3577;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C0703.m3016("Start element (", i, ") is larger than end element (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f76860 = i;
        this.f76858 = z;
        this.f76856 = i2;
        this.f76857 = z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        C16255 c16255 = new C16255(this);
        while (c16255.hasNext()) {
            c16255.nextInt();
            c16255.remove();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52966(int i) {
        if (this.f76858 || Integer.compare(i, this.f76860) >= 0) {
            return this.f76857 || Integer.compare(i, this.f76856) < 0;
        }
        return false;
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        return m52966(i) && this.f76859.contains(i);
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    public final boolean add(int i) {
        if (m52966(i)) {
            return this.f76859.add(i);
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Element (", ") out of range [");
        sbM12235.append(this.f76858 ? "-" : String.valueOf(this.f76860));
        sbM12235.append(", ");
        throw new IllegalArgumentException(C8947.m23910(sbM12235, this.f76857 ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : String.valueOf(this.f76856), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC13448
    public final boolean remove(int i) {
        if (m52966(i)) {
            return this.f76859.remove(i);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        C16255 c16255 = new C16255(this);
        int i = 0;
        while (c16255.hasNext()) {
            i++;
            c16255.nextInt();
        }
        return i;
    }

    @Override // l.InterfaceC16695, java.util.SortedSet
    public final InterfaceC4544 comparator() {
        this.f76859.getClass();
        return null;
    }

    @Override // l.AbstractC5991, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C16255(this);
    }

    @Override // l.AbstractC5991, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return new C16255(this);
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC8273 mo11424() {
        return new C16255(this);
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC16695 mo8338(int i) {
        boolean z = this.f76857;
        C3577 c3577 = this.f76859;
        if (z) {
            return new C23715(c3577, this.f76860, this.f76858, i, false);
        }
        if (Integer.compare(i, this.f76856) >= 0) {
            return this;
        }
        return new C23715(c3577, this.f76860, this.f76858, i, false);
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC16695 mo8336(int i) {
        boolean z = this.f76858;
        C3577 c3577 = this.f76859;
        if (z) {
            return new C23715(c3577, i, false, this.f76856, this.f76857);
        }
        return Integer.compare(i, this.f76860) > 0 ? new C23715(c3577, i, false, this.f76856, this.f76857) : this;
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC16695 mo8334(int i, int i2) {
        C3577 c3577 = this.f76859;
        boolean z = this.f76858;
        boolean z2 = this.f76857;
        if (z2 && z) {
            return new C23715(c3577, i, false, i2, false);
        }
        int i3 = this.f76856;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f76860;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C23715(c3577, i, false, i4, false) : this;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17001 m52967() {
        C17001 c17001M11628;
        C3577 c3577 = this.f76859;
        if (c3577.f12249 == null) {
            return null;
        }
        if (this.f76858) {
            c17001M11628 = c3577.f12251;
        } else {
            int i = this.f76860;
            c17001M11628 = c3577.m11628(i);
            if (Integer.compare(c17001M11628.f55552, i) < 0) {
                c17001M11628 = c17001M11628.m40071();
            }
        }
        if (c17001M11628 == null) {
            return null;
        }
        if (this.f76857 || Integer.compare(c17001M11628.f55552, this.f76856) < 0) {
            return c17001M11628;
        }
        return null;
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ۫ۙ */
    public final int mo8335() {
        C17001 c17001M11628;
        C3577 c3577 = this.f76859;
        C17001 c17001 = null;
        if (c3577.f12249 != null) {
            if (this.f76857) {
                c17001M11628 = c3577.f12248;
            } else {
                int i = this.f76856;
                c17001M11628 = c3577.m11628(i);
                if (Integer.compare(c17001M11628.f55552, i) >= 0) {
                    c17001M11628 = c17001M11628.m40070();
                }
            }
            if (c17001M11628 != null && (this.f76858 || Integer.compare(c17001M11628.f55552, this.f76860) >= 0)) {
                c17001 = c17001M11628;
            }
        }
        if (c17001 == null) {
            throw new NoSuchElementException();
        }
        return c17001.f55552;
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ᩵ */
    public final int mo8337() {
        C17001 c17001M52967 = m52967();
        if (c17001M52967 == null) {
            throw new NoSuchElementException();
        }
        return c17001M52967.f55552;
    }
}
