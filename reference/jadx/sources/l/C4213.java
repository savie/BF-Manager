package l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4213 extends AbstractC8448 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC16695 f15390;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f15391;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18383 f15392;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f15393;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f15394;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f15395;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f15396;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC9257 f15397;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo13470() {
    }

    public C4213(C18383 c18383, int i, boolean z, int i2, boolean z2) {
        this.f15392 = c18383;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C0703.m3016("Start key (", i, ") is larger than end key (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f15395 = i;
        this.f15394 = z;
        this.f15396 = i2;
        this.f15393 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C11670 c11670 = this.f15392.f59888;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C12416 c12416 = new C12416(this);
        while (c12416.hasNext()) {
            c12416.m35284();
            c12416.remove();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m13471(int i) {
        if (this.f15394 || Integer.compare(i, this.f15395) >= 0) {
            return this.f15393 || Integer.compare(i, this.f15396) < 0;
        }
        return false;
    }

    @Override // l.AbstractC8448, l.InterfaceC11868, l.InterfaceC25207
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9257 mo13468() {
        if (this.f15397 == null) {
            this.f15397 = new C16145(this);
        }
        return this.f15397;
    }

    @Override // l.AbstractC8448, java.util.Map, l.InterfaceC25207, java.util.SortedMap
    public final InterfaceC16695 keySet() {
        if (this.f15390 == null) {
            this.f15390 = new C3467(this);
        }
        return this.f15390;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f15391 == null) {
            this.f15391 = new C23605(this);
        }
        return this.f15391;
    }

    @Override // l.AbstractC9193, l.InterfaceC23057, l.InterfaceC11868
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13467(int i) {
        return m13471(i) && this.f15392.mo13467(i);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C12416 c12416 = new C12416(this);
        while (c12416.hasNext()) {
            if (C17359.equals(c12416.m35284().f3593, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC23057
    public final Object get(int i) {
        C11670 c11670M42894;
        if (!m13471(i) || (c11670M42894 = this.f15392.m42894(i)) == null) {
            return null;
        }
        return c11670M42894.f3593;
    }

    @Override // l.AbstractC9939, l.InterfaceC23057
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo13466(int i, Object obj) {
        C18383 c18383 = this.f15392;
        c18383.f59892 = false;
        if (m13471(i)) {
            Object objMo13466 = c18383.mo13466(i, obj);
            if (c18383.f59892) {
                return null;
            }
            return objMo13466;
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Key (", ") out of range [");
        sbM12235.append(this.f15394 ? "-" : String.valueOf(this.f15395));
        sbM12235.append(", ");
        throw new IllegalArgumentException(C8947.m23910(sbM12235, this.f15393 ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : String.valueOf(this.f15396), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC9939, l.InterfaceC23057
    public final Object remove(int i) {
        C18383 c18383 = this.f15392;
        c18383.f59892 = false;
        if (!m13471(i)) {
            return null;
        }
        Object objRemove = c18383.remove(i);
        if (c18383.f59892) {
            return objRemove;
        }
        return null;
    }

    @Override // l.AbstractC9939, l.InterfaceC21433, java.util.Map
    public final int size() {
        C12416 c12416 = new C12416(this);
        int i = 0;
        while (c12416.hasNext()) {
            i++;
            c12416.m35284();
        }
        return i;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC25207 mo13472(int i) {
        boolean z = this.f15393;
        C18383 c18383 = this.f15392;
        if (z) {
            return new C4213(c18383, this.f15395, this.f15394, i, false);
        }
        if (Integer.compare(i, this.f15396) >= 0) {
            return this;
        }
        return new C4213(c18383, this.f15395, this.f15394, i, false);
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC25207 mo13475(int i) {
        boolean z = this.f15394;
        C18383 c18383 = this.f15392;
        if (z) {
            return new C4213(c18383, i, false, this.f15396, this.f15393);
        }
        return Integer.compare(i, this.f15395) > 0 ? new C4213(c18383, i, false, this.f15396, this.f15393) : this;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC25207 mo13473(int i, int i2) {
        C18383 c18383 = this.f15392;
        boolean z = this.f15394;
        boolean z2 = this.f15393;
        if (z2 && z) {
            return new C4213(c18383, i, false, i2, false);
        }
        int i3 = this.f15396;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f15395;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C4213(c18383, i, false, i4, false) : this;
    }

    public final C11670 firstEntry() {
        C11670 c11670M42895;
        C18383 c18383 = this.f15392;
        if (c18383.f59889 == null) {
            return null;
        }
        if (this.f15394) {
            c11670M42895 = c18383.f59888;
        } else {
            int i = this.f15395;
            c11670M42895 = c18383.m42895(i);
            if (Integer.compare(c11670M42895.f3592, i) < 0) {
                c11670M42895 = c11670M42895.m29344();
            }
        }
        if (c11670M42895 == null) {
            return null;
        }
        if (this.f15393 || Integer.compare(c11670M42895.f3592, this.f15396) < 0) {
            return c11670M42895;
        }
        return null;
    }

    public final C11670 lastEntry() {
        C11670 c11670M42895;
        C18383 c18383 = this.f15392;
        if (c18383.f59889 == null) {
            return null;
        }
        if (this.f15393) {
            c11670M42895 = c18383.f59895;
        } else {
            int i = this.f15396;
            c11670M42895 = c18383.m42895(i);
            if (Integer.compare(c11670M42895.f3592, i) >= 0) {
                c11670M42895 = c11670M42895.m29343();
            }
        }
        if (c11670M42895 == null) {
            return null;
        }
        if (this.f15394 || Integer.compare(c11670M42895.f3592, this.f15395) >= 0) {
            return c11670M42895;
        }
        return null;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo13474() {
        C11670 c11670FirstEntry = firstEntry();
        if (c11670FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c11670FirstEntry.f3592;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int mo13469() {
        C11670 c11670LastEntry = lastEntry();
        if (c11670LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c11670LastEntry.f3592;
    }
}
