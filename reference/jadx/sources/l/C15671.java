package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܺۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C15671 extends AbstractC13035 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public char f50884;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f50885;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f50886;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16376 f50887;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f50888;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC4630 f50889;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public char f50890;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC10194 f50891;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC19241, java.util.SortedMap
    public final void comparator() {
    }

    public C15671(C16376 c16376, char c, boolean z, char c2, boolean z2) {
        this.f50887 = c16376;
        if (!z && !z2 && Character.compare(c, c2) > 0) {
            throw new IllegalArgumentException("Start key (" + c + ") is larger than end key (" + c2 + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f50884 = c;
        this.f50888 = z;
        this.f50890 = c2;
        this.f50885 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C22726 c22726 = this.f50887.f52701;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C10026 c10026 = new C10026(this);
        while (c10026.hasNext()) {
            c10026.m45175();
            c10026.remove();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m37339(char c) {
        if (this.f50888 || Character.compare(c, this.f50884) >= 0) {
            return this.f50885 || Character.compare(c, this.f50890) < 0;
        }
        return false;
    }

    @Override // l.AbstractC13035, l.InterfaceC9321
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC10194 mo8794() {
        if (this.f50891 == null) {
            this.f50891 = new C18492(this);
        }
        return this.f50891;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC4630 keySet() {
        if (this.f50889 == null) {
            this.f50889 = new C19198(this);
        }
        return this.f50889;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f50886 == null) {
            this.f50886 = new C7909(this);
        }
        return this.f50886;
    }

    @Override // l.AbstractC22207, l.InterfaceC17081
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15965(char c) {
        return m37339(c) && this.f50887.mo15965(c);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C10026 c10026 = new C10026(this);
        while (c10026.hasNext()) {
            if (C13638.equals(c10026.m45175().f18266, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ܰ */
    public final Object mo15966(char c) {
        C22726 c22726M38563;
        if (!m37339(c) || (c22726M38563 = this.f50887.m38563(c)) == null) {
            return null;
        }
        return c22726M38563.f18266;
    }

    @Override // l.AbstractC2450, l.InterfaceC17081
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7435(char c, Object obj) {
        C16376 c16376 = this.f50887;
        c16376.f52697 = false;
        if (m37339(c)) {
            Object objMo7435 = c16376.mo7435(c, obj);
            if (c16376.f52697) {
                return null;
            }
            return objMo7435;
        }
        StringBuilder sb = new StringBuilder("Key (");
        sb.append(c);
        sb.append(") out of range [");
        sb.append(this.f50888 ? "-" : String.valueOf(this.f50884));
        sb.append(", ");
        throw new IllegalArgumentException(C22697.m50267(sb, this.f50885 ? "-" : String.valueOf(this.f50890), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC2450, l.InterfaceC17081
    /* JADX INFO: renamed from: ۚ */
    public final Object mo7436(char c) {
        C16376 c16376 = this.f50887;
        c16376.f52697 = false;
        if (!m37339(c)) {
            return null;
        }
        Object objMo7436 = c16376.mo7436(c);
        if (c16376.f52697) {
            return objMo7436;
        }
        return null;
    }

    @Override // l.AbstractC2450, l.InterfaceC6456
    public final int size() {
        C10026 c10026 = new C10026(this);
        int i = 0;
        while (c10026.hasNext()) {
            i++;
            c10026.m45175();
        }
        return i;
    }

    @Override // l.InterfaceC19241
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19241 mo37338(char c) {
        boolean z = this.f50885;
        C16376 c16376 = this.f50887;
        if (z) {
            return new C15671(c16376, this.f50884, this.f50888, c, false);
        }
        if (Character.compare(c, this.f50890) >= 0) {
            return this;
        }
        return new C15671(c16376, this.f50884, this.f50888, c, false);
    }

    @Override // l.InterfaceC19241
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC19241 mo37342(char c) {
        boolean z = this.f50888;
        C16376 c16376 = this.f50887;
        if (z) {
            return new C15671(c16376, c, false, this.f50890, this.f50885);
        }
        return Character.compare(c, this.f50884) > 0 ? new C15671(c16376, c, false, this.f50890, this.f50885) : this;
    }

    @Override // l.InterfaceC19241
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19241 mo37340(char c, char c2) {
        C16376 c16376 = this.f50887;
        boolean z = this.f50888;
        boolean z2 = this.f50885;
        if (z2 && z) {
            return new C15671(c16376, c, false, c2, false);
        }
        char c3 = this.f50890;
        char c4 = (z2 || Character.compare(c2, c3) < 0) ? c2 : c3;
        char c5 = this.f50884;
        if (!z && Character.compare(c, c5) <= 0) {
            c = c5;
        }
        return (z2 || z || c != c5 || c4 != c3) ? new C15671(c16376, c, false, c4, false) : this;
    }

    public final C22726 firstEntry() {
        C22726 c22726M38564;
        C16376 c16376 = this.f50887;
        if (c16376.f52698 == null) {
            return null;
        }
        if (this.f50888) {
            c22726M38564 = c16376.f52701;
        } else {
            char c = this.f50884;
            c22726M38564 = c16376.m38564(c);
            if (Character.compare(c22726M38564.f18265, c) < 0) {
                c22726M38564 = c22726M38564.m50381();
            }
        }
        if (c22726M38564 == null) {
            return null;
        }
        if (this.f50885 || Character.compare(c22726M38564.f18265, this.f50890) < 0) {
            return c22726M38564;
        }
        return null;
    }

    public final C22726 lastEntry() {
        C22726 c22726M38564;
        C16376 c16376 = this.f50887;
        if (c16376.f52698 == null) {
            return null;
        }
        if (this.f50885) {
            c22726M38564 = c16376.f52702;
        } else {
            char c = this.f50890;
            c22726M38564 = c16376.m38564(c);
            if (Character.compare(c22726M38564.f18265, c) >= 0) {
                c22726M38564 = c22726M38564.m50387();
            }
        }
        if (c22726M38564 == null) {
            return null;
        }
        if (this.f50888 || Character.compare(c22726M38564.f18265, this.f50884) >= 0) {
            return c22726M38564;
        }
        return null;
    }

    @Override // l.InterfaceC19241
    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final char mo37341() {
        C22726 c22726FirstEntry = firstEntry();
        if (c22726FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c22726FirstEntry.f18265;
    }

    @Override // l.InterfaceC19241
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final char mo37343() {
        C22726 c22726LastEntry = lastEntry();
        if (c22726LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c22726LastEntry.f18265;
    }
}
