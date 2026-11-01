package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܳۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C14282 extends AbstractC20673 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f46801;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f46802;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f46803;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2991 f46804;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f46805;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC4733 f46806;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f46807;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC10194 f46808;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ۛ */
    public final void mo8947() {
    }

    public C14282(C2991 c2991, int i, boolean z, int i2, boolean z2) {
        this.f46804 = c2991;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C8015.m21119("Start key (", i, ") is larger than end key (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f46801 = i;
        this.f46805 = z;
        this.f46807 = i2;
        this.f46802 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C7225 c7225 = this.f46804.f11225;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C5814 c5814 = new C5814(this);
        while (c5814.hasNext()) {
            c5814.m5385();
            c5814.remove();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m34514(int i) {
        if (this.f46805 || Integer.compare(i, this.f46801) >= 0) {
            return this.f46802 || Integer.compare(i, this.f46807) < 0;
        }
        return false;
    }

    @Override // l.AbstractC20673, l.InterfaceC9612, l.InterfaceC4485
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC10194 mo8949() {
        if (this.f46808 == null) {
            this.f46808 = new C0169(this);
        }
        return this.f46808;
    }

    @Override // l.AbstractC20673, java.util.Map, l.InterfaceC4485, java.util.SortedMap
    public final InterfaceC4733 keySet() {
        if (this.f46806 == null) {
            this.f46806 = new C12165(this);
        }
        return this.f46806;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f46803 == null) {
            this.f46803 = new C16398(this);
        }
        return this.f46803;
    }

    @Override // l.AbstractC10090, l.InterfaceC17372, l.InterfaceC9612
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8945(int i) {
        return m34514(i) && this.f46804.mo8945(i);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C5814 c5814 = new C5814(this);
        while (c5814.hasNext()) {
            if (C13638.equals(c5814.m5385().f29882, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC17372
    public final Object get(int i) {
        C7225 c7225M8948;
        if (!m34514(i) || (c7225M8948 = this.f46804.m8948(i)) == null) {
            return null;
        }
        return c7225M8948.f29882;
    }

    @Override // l.AbstractC19262, l.InterfaceC17372
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8944(int i, Object obj) {
        C2991 c2991 = this.f46804;
        c2991.f11220 = false;
        if (m34514(i)) {
            Object objMo8944 = c2991.mo8944(i, obj);
            if (c2991.f11220) {
                return null;
            }
            return objMo8944;
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Key (", ") out of range [");
        sbM40153.append(this.f46805 ? "-" : String.valueOf(this.f46801));
        sbM40153.append(", ");
        throw new IllegalArgumentException(C22697.m50267(sbM40153, this.f46802 ? "-" : String.valueOf(this.f46807), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC19262, l.InterfaceC17372
    public final Object remove(int i) {
        C2991 c2991 = this.f46804;
        c2991.f11220 = false;
        if (!m34514(i)) {
            return null;
        }
        Object objRemove = c2991.remove(i);
        if (c2991.f11220) {
            return objRemove;
        }
        return null;
    }

    @Override // l.AbstractC19262, l.InterfaceC6456
    public final int size() {
        C5814 c5814 = new C5814(this);
        int i = 0;
        while (c5814.hasNext()) {
            i++;
            c5814.m5385();
        }
        return i;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC4485 mo8943(int i) {
        boolean z = this.f46802;
        C2991 c2991 = this.f46804;
        if (z) {
            return new C14282(c2991, this.f46801, this.f46805, i, false);
        }
        if (Integer.compare(i, this.f46807) >= 0) {
            return this;
        }
        return new C14282(c2991, this.f46801, this.f46805, i, false);
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC4485 mo8952(int i) {
        boolean z = this.f46805;
        C2991 c2991 = this.f46804;
        if (z) {
            return new C14282(c2991, i, false, this.f46807, this.f46802);
        }
        return Integer.compare(i, this.f46801) > 0 ? new C14282(c2991, i, false, this.f46807, this.f46802) : this;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4485 mo8950(int i, int i2) {
        C2991 c2991 = this.f46804;
        boolean z = this.f46805;
        boolean z2 = this.f46802;
        if (z2 && z) {
            return new C14282(c2991, i, false, i2, false);
        }
        int i3 = this.f46807;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f46801;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C14282(c2991, i, false, i4, false) : this;
    }

    public final C7225 firstEntry() {
        C7225 c7225M8946;
        C2991 c2991 = this.f46804;
        if (c2991.f11228 == null) {
            return null;
        }
        if (this.f46805) {
            c7225M8946 = c2991.f11225;
        } else {
            int i = this.f46801;
            c7225M8946 = c2991.m8946(i);
            if (Integer.compare(c7225M8946.f29881, i) < 0) {
                c7225M8946 = c7225M8946.m19238();
            }
        }
        if (c7225M8946 == null) {
            return null;
        }
        if (this.f46802 || Integer.compare(c7225M8946.f29881, this.f46807) < 0) {
            return c7225M8946;
        }
        return null;
    }

    public final C7225 lastEntry() {
        C7225 c7225M8946;
        C2991 c2991 = this.f46804;
        if (c2991.f11228 == null) {
            return null;
        }
        if (this.f46802) {
            c7225M8946 = c2991.f11226;
        } else {
            int i = this.f46807;
            c7225M8946 = c2991.m8946(i);
            if (Integer.compare(c7225M8946.f29881, i) >= 0) {
                c7225M8946 = c7225M8946.m19237();
            }
        }
        if (c7225M8946 == null) {
            return null;
        }
        if (this.f46805 || Integer.compare(c7225M8946.f29881, this.f46801) >= 0) {
            return c7225M8946;
        }
        return null;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩺ */
    public final int mo8951() {
        C7225 c7225FirstEntry = firstEntry();
        if (c7225FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c7225FirstEntry.f29881;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩻ */
    public final int mo8953() {
        C7225 c7225LastEntry = lastEntry();
        if (c7225LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c7225LastEntry.f29881;
    }
}
