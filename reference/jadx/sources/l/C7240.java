package l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۜܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C7240 extends AbstractC24439 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC17067 f23876;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f23877;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22377 f23878;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f23879;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f23880;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public char f23881;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public char f23882;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC9257 f23883;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC10442, java.util.SortedMap
    public final void comparator() {
    }

    public C7240(C22377 c22377, char c, boolean z, char c2, boolean z2) {
        this.f23878 = c22377;
        if (!z && !z2 && Character.compare(c, c2) > 0) {
            throw new IllegalArgumentException("Start key (" + c + ") is larger than end key (" + c2 + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f23881 = c;
        this.f23880 = z;
        this.f23882 = c2;
        this.f23879 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C14697 c14697 = this.f23878.f72453;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C9476 c9476 = new C9476(this);
        while (c9476.hasNext()) {
            c9476.m34022();
            c9476.remove();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m19858(char c) {
        if (this.f23880 || Character.compare(c, this.f23881) >= 0) {
            return this.f23879 || Character.compare(c, this.f23882) < 0;
        }
        return false;
    }

    @Override // l.AbstractC24439, l.InterfaceC11934, l.InterfaceC10442
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9257 mo19859() {
        if (this.f23883 == null) {
            this.f23883 = new C7986(this);
        }
        return this.f23883;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC17067 keySet() {
        if (this.f23876 == null) {
            this.f23876 = new C10222(this);
        }
        return this.f23876;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f23877 == null) {
            this.f23877 = new C19173(this);
        }
        return this.f23877;
    }

    @Override // l.AbstractC12504, l.InterfaceC23123
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19857(char c) {
        return m19858(c) && this.f23878.mo19857(c);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C9476 c9476 = new C9476(this);
        while (c9476.hasNext()) {
            if (C17359.equals(c9476.m34022().f66378, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC23123
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object mo19863(char c) {
        C14697 c14697M50461;
        if (!m19858(c) || (c14697M50461 = this.f23878.m50461(c)) == null) {
            return null;
        }
        return c14697M50461.f66378;
    }

    @Override // l.AbstractC3555, l.InterfaceC23123
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11584(char c, Object obj) {
        C22377 c22377 = this.f23878;
        c22377.f72457 = false;
        if (m19858(c)) {
            Object objMo11584 = c22377.mo11584(c, obj);
            if (c22377.f72457) {
                return null;
            }
            return objMo11584;
        }
        StringBuilder sb = new StringBuilder("Key (");
        sb.append(c);
        sb.append(") out of range [");
        sb.append(this.f23880 ? "-" : String.valueOf(this.f23881));
        sb.append(", ");
        throw new IllegalArgumentException(C8947.m23910(sb, this.f23879 ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : String.valueOf(this.f23882), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC3555, l.InterfaceC23123
    /* JADX INFO: renamed from: ᩴ */
    public final Object mo11585(char c) {
        C22377 c22377 = this.f23878;
        c22377.f72457 = false;
        if (!m19858(c)) {
            return null;
        }
        Object objMo11585 = c22377.mo11585(c);
        if (c22377.f72457) {
            return objMo11585;
        }
        return null;
    }

    @Override // l.AbstractC3555, l.InterfaceC21433, java.util.Map
    public final int size() {
        C9476 c9476 = new C9476(this);
        int i = 0;
        while (c9476.hasNext()) {
            i++;
            c9476.m34022();
        }
        return i;
    }

    @Override // l.InterfaceC10442
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC10442 mo19865(char c) {
        boolean z = this.f23879;
        C22377 c22377 = this.f23878;
        if (z) {
            return new C7240(c22377, this.f23881, this.f23880, c, false);
        }
        if (Character.compare(c, this.f23882) >= 0) {
            return this;
        }
        return new C7240(c22377, this.f23881, this.f23880, c, false);
    }

    @Override // l.InterfaceC10442
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10442 mo19860(char c) {
        boolean z = this.f23880;
        C22377 c22377 = this.f23878;
        if (z) {
            return new C7240(c22377, c, false, this.f23882, this.f23879);
        }
        return Character.compare(c, this.f23881) > 0 ? new C7240(c22377, c, false, this.f23882, this.f23879) : this;
    }

    @Override // l.InterfaceC10442
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC10442 mo19864(char c, char c2) {
        C22377 c22377 = this.f23878;
        boolean z = this.f23880;
        boolean z2 = this.f23879;
        if (z2 && z) {
            return new C7240(c22377, c, false, c2, false);
        }
        char c3 = this.f23882;
        char c4 = (z2 || Character.compare(c2, c3) < 0) ? c2 : c3;
        char c5 = this.f23881;
        if (!z && Character.compare(c, c5) <= 0) {
            c = c5;
        }
        return (z2 || z || c != c5 || c4 != c3) ? new C7240(c22377, c, false, c4, false) : this;
    }

    public final C14697 firstEntry() {
        C14697 c14697M50460;
        C22377 c22377 = this.f23878;
        if (c22377.f72454 == null) {
            return null;
        }
        if (this.f23880) {
            c14697M50460 = c22377.f72453;
        } else {
            char c = this.f23881;
            c14697M50460 = c22377.m50460(c);
            if (Character.compare(c14697M50460.f66377, c) < 0) {
                c14697M50460 = c14697M50460.m35366();
            }
        }
        if (c14697M50460 == null) {
            return null;
        }
        if (this.f23879 || Character.compare(c14697M50460.f66377, this.f23882) < 0) {
            return c14697M50460;
        }
        return null;
    }

    public final C14697 lastEntry() {
        C14697 c14697M50460;
        C22377 c22377 = this.f23878;
        if (c22377.f72454 == null) {
            return null;
        }
        if (this.f23879) {
            c14697M50460 = c22377.f72460;
        } else {
            char c = this.f23882;
            c14697M50460 = c22377.m50460(c);
            if (Character.compare(c14697M50460.f66377, c) >= 0) {
                c14697M50460 = c14697M50460.m35365();
            }
        }
        if (c14697M50460 == null) {
            return null;
        }
        if (this.f23880 || Character.compare(c14697M50460.f66377, this.f23881) >= 0) {
            return c14697M50460;
        }
        return null;
    }

    @Override // l.InterfaceC10442
    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final char mo19862() {
        C14697 c14697FirstEntry = firstEntry();
        if (c14697FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c14697FirstEntry.f66377;
    }

    @Override // l.InterfaceC10442
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final char mo19861() {
        C14697 c14697LastEntry = lastEntry();
        if (c14697LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c14697LastEntry.f66377;
    }
}
