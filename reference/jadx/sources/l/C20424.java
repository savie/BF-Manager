package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R6U3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20424 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23408 f65428;

    public C20424() {
        this(null);
    }

    public C20424(C23408 c23408) {
        this.f65428 = c23408;
    }

    public final boolean isEmpty() {
        return this.f65428 == null;
    }

    public final Object get(int i) {
        if (i < 0 || i >= m46836()) {
            throw new IndexOutOfBoundsException("Invalid history index");
        }
        C23408 c23408 = this.f65428;
        while (true) {
            Object obj = c23408.f75775;
            if (obj != null) {
                return obj;
            }
            C23408 c23409 = c23408.f75771;
            int i2 = c23409.f75772;
            if (i < i2) {
                c23408 = c23409;
            } else {
                i -= i2;
                c23408 = c23408.f75773;
            }
        }
    }

    public final Object last() {
        return get(m46836() - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20424 m46834(Object obj) {
        C17359.requireNonNull(obj);
        return new C20424(m46833(this.f65428, new C23408(obj)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20424 m46835(C20424 c20424) {
        return new C20424(m46833(this.f65428, c20424.f65428));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20424 m46837(Object obj) {
        C23408 c23408 = this.f65428;
        if (c23408 == null) {
            throw new NoSuchElementException();
        }
        return new C20424(m46831(c23408, obj));
    }

    public final C20424 removeLast() {
        C23408 c23408 = this.f65428;
        if (c23408 == null) {
            throw new NoSuchElementException();
        }
        int iM46836 = m46836() - 1;
        if (iM46836 >= 0 && iM46836 <= m46836()) {
            return new C20424(m46830(c23408, iM46836).f10648);
        }
        throw new IndexOutOfBoundsException("Invalid history count");
    }

    public final C20424 removeFirst() {
        C23408 c23408 = this.f65428;
        if (c23408 == null) {
            throw new NoSuchElementException();
        }
        if (1 <= m46836()) {
            return new C20424(m46830(c23408, 1).f10649);
        }
        throw new IndexOutOfBoundsException("Invalid history count");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C15948(this, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23408 m46831(C23408 c23408, Object obj) {
        return c23408.f75775 != null ? new C23408(obj) : new C23408(c23408.f75771, m46831(c23408.f75773, obj));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3270 m46830(C23408 c23408, int i) {
        if (i == 0) {
            return new C3270(null, c23408);
        }
        if (i == (c23408 == null ? 0 : c23408.f75772)) {
            return new C3270(c23408, null);
        }
        C23408 c23409 = c23408.f75771;
        C23408 c234010 = c23408.f75773;
        int i2 = c23409.f75772;
        if (i < i2) {
            C3270 c3270M46830 = m46830(c23409, i);
            return new C3270(c3270M46830.f10648, m46833(c3270M46830.f10649, c234010));
        }
        C3270 c3270M46831 = m46830(c234010, i - i2);
        return new C3270(m46833(c23408.f75771, c3270M46831.f10648), c3270M46831.f10649);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C23408 m46833(C23408 c23408, C23408 c23409) {
        if (c23408 == null) {
            return c23409;
        }
        if (c23409 == null) {
            return c23408;
        }
        int i = c23408.f75770;
        int i2 = c23409.f75770;
        if (i > i2 + 1) {
            return m46832(c23408.f75771, m46833(c23408.f75773, c23409));
        }
        if (i2 > i + 1) {
            return m46832(m46833(c23408, c23409.f75771), c23409.f75773);
        }
        return new C23408(c23408, c23409);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23408 m46832(C23408 c23408, C23408 c23409) {
        int i = c23408.f75770;
        C23408 c234010 = c23408.f75773;
        int i2 = c23409.f75770;
        C23408 c234011 = c23409.f75771;
        C23408 c234012 = c23409.f75773;
        if (i > i2 + 1) {
            C23408 c234013 = c23408.f75771;
            return c234013.f75770 >= c234010.f75770 ? new C23408(c234013, new C23408(c234010, c23409)) : new C23408(new C23408(c234013, c234010.f75771), new C23408(c234010.f75773, c23409));
        }
        if (i2 > i + 1) {
            return c234012.f75770 >= c234011.f75770 ? new C23408(new C23408(c23408, c234011), c234012) : new C23408(new C23408(c23408, c234011.f75771), new C23408(c234011.f75773, c234012));
        }
        return new C23408(c23408, c23409);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m46836() {
        C23408 c23408 = this.f65428;
        if (c23408 == null) {
            return 0;
        }
        return c23408.f75772;
    }
}
