package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.֡᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes3.dex */
public final class C0687 extends C12496 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16916 f2868;

    @Override // l.C11085, l.AbstractC23785, l.AbstractC20257, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0687(C16916 c16916, int i, int i2) {
        super(c16916, i, i2);
        this.f2868 = c16916;
    }

    @Override // l.C11085, l.InterfaceC21750
    public final long getLong(int i) {
        m52321(i);
        return this.f2868.f54097[i + this.f37626];
    }

    @Override // l.AbstractC23785, java.util.List
    public final ListIterator listIterator(int i) {
        return new C16211(this, i);
    }

    @Override // l.C11085, l.AbstractC23785, java.util.List
    public final InterfaceC18222 listIterator(int i) {
        return new C16211(this, i);
    }

    @Override // l.C11085, l.AbstractC23785, l.AbstractC20257, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC10462 spliterator() {
        return new C20444(this);
    }

    @Override // l.C11085, l.AbstractC23785, l.AbstractC20257, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C20444(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m3068(int i, int i2, long[] jArr) {
        C16916 c16916 = this.f2868;
        long[] jArr2 = c16916.f54097;
        int i3 = this.f37626;
        if (jArr2 == jArr && i3 == i && this.f37625 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f37625) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            if (c16916.f54097[i3] != jArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC23785, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C16916) {
            C16916 c16916 = (C16916) obj;
            return m3068(0, c16916.f54098, c16916.f54097);
        }
        if (obj instanceof C0687) {
            C0687 c0687 = (C0687) obj;
            return m3068(c0687.f37626, c0687.f37625, c0687.f2868.f54097);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m3069(int i, int i2, long[] jArr) {
        int i3;
        C16916 c16916 = this.f2868;
        long[] jArr2 = c16916.f54097;
        int i4 = this.f37626;
        if (jArr2 == jArr && i4 == i && this.f37625 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f37625;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Long.compare(c16916.f54097[i4], jArr[i]);
            if (iCompare != 0) {
                return iCompare;
            }
            i4++;
            i++;
        }
        if (i4 < i2) {
            return -1;
        }
        return i4 < i3 ? 1 : 0;
    }

    @Override // l.C11085, l.AbstractC23785, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(List list) {
        if (list instanceof C16916) {
            C16916 c16916 = (C16916) list;
            return m3069(0, c16916.f54098, c16916.f54097);
        }
        if (list instanceof C0687) {
            C0687 c0687 = (C0687) list;
            return m3069(c0687.f37626, c0687.f37625, c0687.f2868.f54097);
        }
        return super.compareTo(list);
    }
}
