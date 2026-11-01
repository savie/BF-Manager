package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܶܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6U3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15346 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6878 f49958;

    public C15346() {
        this(null);
    }

    public C15346(C6878 c6878) {
        this.f49958 = c6878;
    }

    public final boolean isEmpty() {
        return this.f49958 == null;
    }

    public final Object get(int i) {
        if (i < 0 || i >= m36740()) {
            throw new IndexOutOfBoundsException("Invalid history index");
        }
        C6878 c6878 = this.f49958;
        while (true) {
            Object obj = c6878.f23174;
            if (obj != null) {
                return obj;
            }
            C6878 c6879 = c6878.f23173;
            int i2 = c6879.f23169;
            if (i < i2) {
                c6878 = c6879;
            } else {
                i -= i2;
                c6878 = c6878.f23175;
            }
        }
    }

    public final Object last() {
        return get(m36740() - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15346 m36738(Object obj) {
        C13638.requireNonNull(obj);
        return new C15346(m36737(this.f49958, new C6878(obj)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15346 m36739(C15346 c15346) {
        return new C15346(m36737(this.f49958, c15346.f49958));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15346 m36741(Object obj) {
        C6878 c6878 = this.f49958;
        if (c6878 == null) {
            throw new NoSuchElementException();
        }
        return new C15346(m36734(c6878, obj));
    }

    public final C15346 removeLast() {
        C6878 c6878 = this.f49958;
        if (c6878 == null) {
            throw new NoSuchElementException();
        }
        int iM36740 = m36740() - 1;
        if (iM36740 >= 0 && iM36740 <= m36740()) {
            return new C15346(m36736(c6878, iM36740).f75065);
        }
        throw new IndexOutOfBoundsException("Invalid history count");
    }

    public final C15346 removeFirst() {
        C6878 c6878 = this.f49958;
        if (c6878 == null) {
            throw new NoSuchElementException();
        }
        if (1 <= m36740()) {
            return new C15346(m36736(c6878, 1).f75066);
        }
        throw new IndexOutOfBoundsException("Invalid history count");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C4055(this, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6878 m36734(C6878 c6878, Object obj) {
        return c6878.f23174 != null ? new C6878(obj) : new C6878(c6878.f23173, m36734(c6878.f23175, obj));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23107 m36736(C6878 c6878, int i) {
        if (i == 0) {
            return new C23107(null, c6878);
        }
        if (i == (c6878 == null ? 0 : c6878.f23169)) {
            return new C23107(c6878, null);
        }
        C6878 c6879 = c6878.f23173;
        C6878 c68710 = c6878.f23175;
        int i2 = c6879.f23169;
        if (i < i2) {
            C23107 c23107M36736 = m36736(c6879, i);
            return new C23107(c23107M36736.f75065, m36737(c23107M36736.f75066, c68710));
        }
        C23107 c23107M36737 = m36736(c68710, i - i2);
        return new C23107(m36737(c6878.f23173, c23107M36737.f75065), c23107M36737.f75066);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C6878 m36737(C6878 c6878, C6878 c6879) {
        if (c6878 == null) {
            return c6879;
        }
        if (c6879 == null) {
            return c6878;
        }
        int i = c6878.f23171;
        int i2 = c6879.f23171;
        if (i > i2 + 1) {
            return m36735(c6878.f23173, m36737(c6878.f23175, c6879));
        }
        if (i2 > i + 1) {
            return m36735(m36737(c6878, c6879.f23173), c6879.f23175);
        }
        return new C6878(c6878, c6879);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6878 m36735(C6878 c6878, C6878 c6879) {
        int i = c6878.f23171;
        C6878 c68710 = c6878.f23175;
        int i2 = c6879.f23171;
        C6878 c68711 = c6879.f23173;
        C6878 c68712 = c6879.f23175;
        if (i > i2 + 1) {
            C6878 c68713 = c6878.f23173;
            return c68713.f23171 >= c68710.f23171 ? new C6878(c68713, new C6878(c68710, c6879)) : new C6878(new C6878(c68713, c68710.f23173), new C6878(c68710.f23175, c6879));
        }
        if (i2 > i + 1) {
            return c68712.f23171 >= c68711.f23171 ? new C6878(new C6878(c6878, c68711), c68712) : new C6878(new C6878(c6878, c68711.f23173), new C6878(c68711.f23175, c68712));
        }
        return new C6878(c6878, c6879);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m36740() {
        C6878 c6878 = this.f49958;
        if (c6878 == null) {
            return 0;
        }
        return c6878.f23169;
    }
}
