package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۚۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes3.dex */
public final class C5191 extends AbstractC14324 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22125 f18003;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f18004;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f18005;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f18006;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f18007;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C13659 c13659 = this.f18003.f71625;
        return !(m14353() != null);
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        comparator();
        return null;
    }

    public C5191(C22125 c22125, int i, boolean z, int i2, boolean z2) {
        this.f18003 = c22125;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C8015.m21119("Start element (", i, ") is larger than end element (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f18007 = i;
        this.f18005 = z;
        this.f18006 = i2;
        this.f18004 = z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        C2368 c2368 = new C2368(this);
        while (c2368.hasNext()) {
            c2368.nextInt();
            c2368.remove();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14352(int i) {
        if (this.f18005 || Integer.compare(i, this.f18007) >= 0) {
            return this.f18004 || Integer.compare(i, this.f18006) < 0;
        }
        return false;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return m14352(i) && this.f18003.contains(i);
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    public final boolean add(int i) {
        if (m14352(i)) {
            return this.f18003.add(i);
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Element (", ") out of range [");
        sbM40153.append(this.f18005 ? "-" : String.valueOf(this.f18007));
        sbM40153.append(", ");
        throw new IllegalArgumentException(C22697.m50267(sbM40153, this.f18004 ? "-" : String.valueOf(this.f18006), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC23496
    public final boolean remove(int i) {
        if (m14352(i)) {
            return this.f18003.remove(i);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        C2368 c2368 = new C2368(this);
        int i = 0;
        while (c2368.hasNext()) {
            i++;
            c2368.nextInt();
        }
        return i;
    }

    @Override // l.InterfaceC4733, java.util.SortedSet
    public final InterfaceC16481 comparator() {
        this.f18003.getClass();
        return null;
    }

    @Override // l.AbstractC14324, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2368(this);
    }

    @Override // l.AbstractC14324, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C2368(this);
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC21191 mo13101() {
        return new C2368(this);
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC4733 mo13102(int i) {
        boolean z = this.f18004;
        C22125 c22125 = this.f18003;
        if (z) {
            return new C5191(c22125, this.f18007, this.f18005, i, false);
        }
        if (Integer.compare(i, this.f18006) >= 0) {
            return this;
        }
        return new C5191(c22125, this.f18007, this.f18005, i, false);
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC4733 mo13104(int i) {
        boolean z = this.f18005;
        C22125 c22125 = this.f18003;
        if (z) {
            return new C5191(c22125, i, false, this.f18006, this.f18004);
        }
        return Integer.compare(i, this.f18007) > 0 ? new C5191(c22125, i, false, this.f18006, this.f18004) : this;
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC4733 mo13100(int i, int i2) {
        C22125 c22125 = this.f18003;
        boolean z = this.f18005;
        boolean z2 = this.f18004;
        if (z2 && z) {
            return new C5191(c22125, i, false, i2, false);
        }
        int i3 = this.f18006;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f18007;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C5191(c22125, i, false, i4, false) : this;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13659 m14353() {
        C13659 c13659M49084;
        C22125 c22125 = this.f18003;
        if (c22125.f71626 == null) {
            return null;
        }
        if (this.f18005) {
            c13659M49084 = c22125.f71625;
        } else {
            int i = this.f18007;
            c13659M49084 = c22125.m49084(i);
            if (Integer.compare(c13659M49084.f45048, i) < 0) {
                c13659M49084 = c13659M49084.m33357();
            }
        }
        if (c13659M49084 == null) {
            return null;
        }
        if (this.f18004 || Integer.compare(c13659M49084.f45048, this.f18006) < 0) {
            return c13659M49084;
        }
        return null;
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ֨ۙ */
    public final int mo13099() {
        C13659 c13659M49084;
        C22125 c22125 = this.f18003;
        C13659 c13659 = null;
        if (c22125.f71626 != null) {
            if (this.f18004) {
                c13659M49084 = c22125.f71628;
            } else {
                int i = this.f18006;
                c13659M49084 = c22125.m49084(i);
                if (Integer.compare(c13659M49084.f45048, i) >= 0) {
                    c13659M49084 = c13659M49084.m33356();
                }
            }
            if (c13659M49084 != null && (this.f18005 || Integer.compare(c13659M49084.f45048, this.f18007) >= 0)) {
                c13659 = c13659M49084;
            }
        }
        if (c13659 == null) {
            throw new NoSuchElementException();
        }
        return c13659.f45048;
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩵ */
    public final int mo13103() {
        C13659 c13659M14353 = m14353();
        if (c13659M14353 == null) {
            throw new NoSuchElementException();
        }
        return c13659M14353.f45048;
    }
}
