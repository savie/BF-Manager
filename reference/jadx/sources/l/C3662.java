package l;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3662 extends AbstractList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13542 f13406 = new C13542();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10797(C3662 c3662) {
        ((AbstractList) c3662).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m10810((C14435) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C14435 c14435 = get(i);
        this.f13406.m33125(i, (C14435) obj);
        return c14435;
    }

    public C3662() {
    }

    public C3662(int i) {
    }

    public C3662(Collection collection) {
        addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f13406.m33126(), collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13406.m33126();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m10802(int i, int i2) {
        if (i2 >= 0) {
            int iM33126 = this.f13406.m33126();
            if (iM33126 == 0) {
                return -1;
            }
            int iMin = Math.min(i2, iM33126 - 1);
            int iM10821 = m10821(iMin);
            if (iM10821 == i) {
                return iMin;
            }
            if (iM10821 < i) {
                int iM10798 = m10798(i, iMin, false);
                if (iM10798 >= iM33126 || m10821(iM10798) != i) {
                    return -1;
                }
                return iM10798;
            }
            int iM10799 = m10798(i, iMin, true) - 1;
            if (iM10799 < 0 || m10821(iM10799) != i) {
                return -1;
            }
            return iM10799;
        }
        throw new IndexOutOfBoundsException("Negative line index");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10804(int i) {
        int iM33126 = this.f13406.m33126() - 1;
        int i2 = 0;
        while (i2 <= iM33126) {
            int i3 = (i2 + iM33126) >>> 1;
            int iM10821 = m10821(i3);
            if (i < iM10821) {
                iM33126 = i3 - 1;
            } else {
                if (i <= iM10821) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10810(C14435 c14435) {
        add(this.f13406.m33126(), c14435);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m10811() {
        return this.f13406.m33126() - 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m10814() {
        return this.f13406.m33126() == 1 && m10813(0) == m10816(0);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m10815(int i) {
        return i == this.f13406.m33126() - 1 || m10821(i + 1) != m10821(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f13406.m33119();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final C14435 get(int i) {
        C14435 c14435 = new C14435();
        this.f13406.m33129(i, c14435);
        return c14435;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10820(int i, C14435 c14435) {
        this.f13406.m33125(i, c14435);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void add(int i, C14435 c14435) {
        this.f13406.m33123(i, c14435);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        C14435 c14435 = get(i);
        m10805(i, i + 1);
        return c14435;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C3662 c3662;
        if (collection instanceof C3662) {
            c3662 = (C3662) collection;
        } else {
            C3662 c3663 = new C3662();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c3663.m10810((C14435) it.next());
            }
            c3662 = c3663;
        }
        this.f13406.m33128(i, i, c3662.f13406);
        ((AbstractList) this).modCount++;
        return !c3662.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10805(int i, int i2) {
        this.f13406.m33128(i, i2, new C13542());
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m10805(i, i2);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m10813(int i) {
        return this.f13406.m33127(i, 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m10816(int i) {
        return this.f13406.m33127(i, 1);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m10821(int i) {
        return this.f13406.m33127(i, 2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9496 m10817() {
        C13542 c13542 = this.f13406;
        c13542.getClass();
        return new C9496(c13542);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10806(int i, int i2, int i3, int i4) {
        this.f13406.m33121(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10818(int i, int i2) {
        this.f13406.m33120(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10807(int i, int i2, C3662 c3662) {
        this.f13406.m33122(i, i2, c3662.f13406);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10809(C3662 c3662) {
        if (this.f13406.m33124(c3662.f13406)) {
            ((AbstractList) this).modCount++;
            ((AbstractList) c3662).modCount++;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m10800(int i) {
        return i == 0 || m10821(i + (-1)) != m10821(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m10801(int i) {
        return m10798(m10821(i), i, false);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m10812(int i) {
        return m10798(m10821(i), i, true) - 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m10798(int i, int i2, boolean z) {
        int iM33126;
        int i3;
        long j = 1;
        if (!m10796(i2, i, z)) {
            iM33126 = i2;
            while (true) {
                if (j > i2) {
                    i3 = 0;
                    break;
                }
                int i4 = i2 - ((int) j);
                if (m10796(i4, i, z)) {
                    i3 = i4 + 1;
                    break;
                }
                j <<= 1;
                iM33126 = i4;
            }
        } else {
            i3 = i2 + 1;
            C13542 c13542 = this.f13406;
            iM33126 = c13542.m33126();
            while (j < ((long) c13542.m33126()) - ((long) i2)) {
                int i5 = ((int) j) + i2;
                if (!m10796(i5, i, z)) {
                    iM33126 = i5;
                    break;
                }
                i3 = i5 + 1;
                j <<= 1;
            }
        }
        while (i3 < iM33126) {
            int i6 = (i3 + iM33126) >>> 1;
            if (m10796(i6, i, z)) {
                i3 = i6 + 1;
            } else {
                iM33126 = i6;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m10796(int i, int i2, boolean z) {
        int iM10821 = m10821(i);
        if (iM10821 >= i2) {
            return z && iM10821 == i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14435 m10803() {
        return get(m10811());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10819(int i, int i2, C3662 c3662) {
        this.f13406.m33128(i, i2 + i, c3662.f13406);
        ((AbstractList) this).modCount++;
    }
}
