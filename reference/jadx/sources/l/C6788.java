package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۜ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6788 extends AbstractC20673 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f22914;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f22915;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f22916;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21605 f22917;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f22918;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC4733 f22919;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f22920;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC10194 f22921;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ۛ */
    public final void mo8947() {
    }

    public C6788(C21605 c21605, int i, boolean z, int i2, boolean z2) {
        this.f22917 = c21605;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C8015.m21119("Start key (", i, ") is larger than end key (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f22914 = i;
        this.f22918 = z;
        this.f22920 = i2;
        this.f22915 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C9261 c9261 = this.f22917.f70079;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C1143 c1143 = new C1143(this);
        while (c1143.hasNext()) {
            c1143.m50909();
            c1143.remove();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m18390(int i) {
        if (this.f22918 || Integer.compare(i, this.f22914) >= 0) {
            return this.f22915 || Integer.compare(i, this.f22920) < 0;
        }
        return false;
    }

    @Override // l.AbstractC20673, l.InterfaceC9612, l.InterfaceC4485
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC10194 mo8949() {
        if (this.f22921 == null) {
            this.f22921 = new C11728(this);
        }
        return this.f22921;
    }

    @Override // l.AbstractC20673, java.util.Map, l.InterfaceC4485, java.util.SortedMap
    public final InterfaceC4733 keySet() {
        if (this.f22919 == null) {
            this.f22919 = new C5377(this);
        }
        return this.f22919;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f22916 == null) {
            this.f22916 = new C2554(this);
        }
        return this.f22916;
    }

    @Override // l.AbstractC10090, l.InterfaceC17372, l.InterfaceC9612
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8945(int i) {
        return m18390(i) && this.f22917.mo8945(i);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C1143 c1143 = new C1143(this);
        while (c1143.hasNext()) {
            if (C13638.equals(c1143.m50909().f29882, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC17372
    public final Object get(int i) {
        C9261 c9261M48311;
        if (!m18390(i) || (c9261M48311 = this.f22917.m48311(i)) == null) {
            return null;
        }
        return c9261M48311.f29882;
    }

    @Override // l.AbstractC19262, l.InterfaceC17372
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8944(int i, Object obj) {
        C21605 c21605 = this.f22917;
        c21605.f70075 = false;
        if (m18390(i)) {
            Object objMo8944 = c21605.mo8944(i, obj);
            if (c21605.f70075) {
                return null;
            }
            return objMo8944;
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Key (", ") out of range [");
        sbM40153.append(this.f22918 ? "-" : String.valueOf(this.f22914));
        sbM40153.append(", ");
        throw new IllegalArgumentException(C22697.m50267(sbM40153, this.f22915 ? "-" : String.valueOf(this.f22920), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC19262, l.InterfaceC17372
    public final Object remove(int i) {
        C21605 c21605 = this.f22917;
        c21605.f70075 = false;
        if (!m18390(i)) {
            return null;
        }
        Object objRemove = c21605.remove(i);
        if (c21605.f70075) {
            return objRemove;
        }
        return null;
    }

    @Override // l.AbstractC19262, l.InterfaceC6456
    public final int size() {
        C1143 c1143 = new C1143(this);
        int i = 0;
        while (c1143.hasNext()) {
            i++;
            c1143.m50909();
        }
        return i;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC4485 mo8943(int i) {
        boolean z = this.f22915;
        C21605 c21605 = this.f22917;
        if (z) {
            return new C6788(c21605, this.f22914, this.f22918, i, false);
        }
        if (Integer.compare(i, this.f22920) >= 0) {
            return this;
        }
        return new C6788(c21605, this.f22914, this.f22918, i, false);
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC4485 mo8952(int i) {
        boolean z = this.f22918;
        C21605 c21605 = this.f22917;
        if (z) {
            return new C6788(c21605, i, false, this.f22920, this.f22915);
        }
        return Integer.compare(i, this.f22914) > 0 ? new C6788(c21605, i, false, this.f22920, this.f22915) : this;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4485 mo8950(int i, int i2) {
        C21605 c21605 = this.f22917;
        boolean z = this.f22918;
        boolean z2 = this.f22915;
        if (z2 && z) {
            return new C6788(c21605, i, false, i2, false);
        }
        int i3 = this.f22920;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f22914;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C6788(c21605, i, false, i4, false) : this;
    }

    public final C9261 firstEntry() {
        C9261 c9261M48310;
        C21605 c21605 = this.f22917;
        if (c21605.f70076 == null) {
            return null;
        }
        if (this.f22918) {
            c9261M48310 = c21605.f70079;
        } else {
            int i = this.f22914;
            c9261M48310 = c21605.m48310(i);
            if (Integer.compare(c9261M48310.f29881, i) < 0) {
                c9261M48310 = c9261M48310.m23785();
            }
        }
        if (c9261M48310 == null) {
            return null;
        }
        if (this.f22915 || Integer.compare(c9261M48310.f29881, this.f22920) < 0) {
            return c9261M48310;
        }
        return null;
    }

    public final C9261 lastEntry() {
        C9261 c9261M48310;
        C21605 c21605 = this.f22917;
        if (c21605.f70076 == null) {
            return null;
        }
        if (this.f22915) {
            c9261M48310 = c21605.f70080;
        } else {
            int i = this.f22920;
            c9261M48310 = c21605.m48310(i);
            if (Integer.compare(c9261M48310.f29881, i) >= 0) {
                c9261M48310 = c9261M48310.m23791();
            }
        }
        if (c9261M48310 == null) {
            return null;
        }
        if (this.f22918 || Integer.compare(c9261M48310.f29881, this.f22914) >= 0) {
            return c9261M48310;
        }
        return null;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩺ */
    public final int mo8951() {
        C9261 c9261FirstEntry = firstEntry();
        if (c9261FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c9261FirstEntry.f29881;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩻ */
    public final int mo8953() {
        C9261 c9261LastEntry = lastEntry();
        if (c9261LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c9261LastEntry.f29881;
    }
}
