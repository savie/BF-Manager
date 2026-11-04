package l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۫ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13272 extends AbstractC8448 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC16695 f42392;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f42393;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11780 f42394;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f42395;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42396;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f42397;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f42398;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC9257 f42399;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۢ */
    public final void mo13470() {
    }

    public C13272(C11780 c11780, int i, boolean z, int i2, boolean z2) {
        this.f42394 = c11780;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C0703.m3016("Start key (", i, ") is larger than end key (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f42397 = i;
        this.f42396 = z;
        this.f42398 = i2;
        this.f42395 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C9630 c9630 = this.f42394.f38056;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C22969 c22969 = new C22969(this);
        while (c22969.hasNext()) {
            c22969.m16946();
            c22969.remove();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m32818(int i) {
        if (this.f42396 || Integer.compare(i, this.f42397) >= 0) {
            return this.f42395 || Integer.compare(i, this.f42398) < 0;
        }
        return false;
    }

    @Override // l.AbstractC8448, l.InterfaceC11868, l.InterfaceC25207
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC9257 mo13468() {
        if (this.f42399 == null) {
            this.f42399 = new C14105(this);
        }
        return this.f42399;
    }

    @Override // l.AbstractC8448, java.util.Map, l.InterfaceC25207, java.util.SortedMap
    public final InterfaceC16695 keySet() {
        if (this.f42392 == null) {
            this.f42392 = new C22223(this);
        }
        return this.f42392;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f42393 == null) {
            this.f42393 = new C5069(this);
        }
        return this.f42393;
    }

    @Override // l.AbstractC9193, l.InterfaceC23057, l.InterfaceC11868
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13467(int i) {
        return m32818(i) && this.f42394.mo13467(i);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C22969 c22969 = new C22969(this);
        while (c22969.hasNext()) {
            if (C17359.equals(c22969.m16946().f3593, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC23057
    public final Object get(int i) {
        C9630 c9630M29554;
        if (!m32818(i) || (c9630M29554 = this.f42394.m29554(i)) == null) {
            return null;
        }
        return c9630M29554.f3593;
    }

    @Override // l.AbstractC9939, l.InterfaceC23057
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13466(int i, Object obj) {
        C11780 c11780 = this.f42394;
        c11780.f38061 = false;
        if (m32818(i)) {
            Object objMo13466 = c11780.mo13466(i, obj);
            if (c11780.f38061) {
                return null;
            }
            return objMo13466;
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Key (", ") out of range [");
        sbM12235.append(this.f42396 ? "-" : String.valueOf(this.f42397));
        sbM12235.append(", ");
        throw new IllegalArgumentException(C8947.m23910(sbM12235, this.f42395 ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : String.valueOf(this.f42398), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC9939, l.InterfaceC23057
    public final Object remove(int i) {
        C11780 c11780 = this.f42394;
        c11780.f38061 = false;
        if (!m32818(i)) {
            return null;
        }
        Object objRemove = c11780.remove(i);
        if (c11780.f38061) {
            return objRemove;
        }
        return null;
    }

    @Override // l.AbstractC9939, l.InterfaceC21433, java.util.Map
    public final int size() {
        C22969 c22969 = new C22969(this);
        int i = 0;
        while (c22969.hasNext()) {
            i++;
            c22969.m16946();
        }
        return i;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC25207 mo13472(int i) {
        boolean z = this.f42395;
        C11780 c11780 = this.f42394;
        if (z) {
            return new C13272(c11780, this.f42397, this.f42396, i, false);
        }
        if (Integer.compare(i, this.f42398) >= 0) {
            return this;
        }
        return new C13272(c11780, this.f42397, this.f42396, i, false);
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC25207 mo13475(int i) {
        boolean z = this.f42396;
        C11780 c11780 = this.f42394;
        if (z) {
            return new C13272(c11780, i, false, this.f42398, this.f42395);
        }
        return Integer.compare(i, this.f42397) > 0 ? new C13272(c11780, i, false, this.f42398, this.f42395) : this;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC25207 mo13473(int i, int i2) {
        C11780 c11780 = this.f42394;
        boolean z = this.f42396;
        boolean z2 = this.f42395;
        if (z2 && z) {
            return new C13272(c11780, i, false, i2, false);
        }
        int i3 = this.f42398;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f42397;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C13272(c11780, i, false, i4, false) : this;
    }

    public final C9630 firstEntry() {
        C9630 c9630M29555;
        C11780 c11780 = this.f42394;
        if (c11780.f38060 == null) {
            return null;
        }
        if (this.f42396) {
            c9630M29555 = c11780.f38056;
        } else {
            int i = this.f42397;
            c9630M29555 = c11780.m29555(i);
            if (Integer.compare(c9630M29555.f3592, i) < 0) {
                c9630M29555 = c9630M29555.m25136();
            }
        }
        if (c9630M29555 == null) {
            return null;
        }
        if (this.f42395 || Integer.compare(c9630M29555.f3592, this.f42398) < 0) {
            return c9630M29555;
        }
        return null;
    }

    public final C9630 lastEntry() {
        C9630 c9630M29555;
        C11780 c11780 = this.f42394;
        if (c11780.f38060 == null) {
            return null;
        }
        if (this.f42395) {
            c9630M29555 = c11780.f38064;
        } else {
            int i = this.f42398;
            c9630M29555 = c11780.m29555(i);
            if (Integer.compare(c9630M29555.f3592, i) >= 0) {
                c9630M29555 = c9630M29555.m25138();
            }
        }
        if (c9630M29555 == null) {
            return null;
        }
        if (this.f42396 || Integer.compare(c9630M29555.f3592, this.f42397) >= 0) {
            return c9630M29555;
        }
        return null;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩻ */
    public final int mo13474() {
        C9630 c9630FirstEntry = firstEntry();
        if (c9630FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c9630FirstEntry.f3592;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۡ */
    public final int mo13469() {
        C9630 c9630LastEntry = lastEntry();
        if (c9630LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c9630LastEntry.f3592;
    }
}
