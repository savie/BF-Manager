package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩺ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes2.dex */
public final class C22831 extends C16440 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15070 f74281;

    @Override // l.C5856, l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22831(C15070 c15070, int i, int i2) {
        super(c15070, i, i2);
        this.f74281 = c15070;
    }

    @Override // l.C5856, l.InterfaceC10609
    public final int getInt(int i) {
        m27090(i);
        return this.f74281.f49125[i + this.f20000];
    }

    @Override // l.AbstractC10796, l.InterfaceC10609, java.util.List
    public final ListIterator listIterator(int i) {
        return new C3779(this, i);
    }

    @Override // l.C5856, l.AbstractC10796, l.InterfaceC10609, java.util.List
    public final InterfaceC21191 listIterator(int i) {
        return new C3779(this, i);
    }

    @Override // l.C5856, l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C6602(this);
    }

    @Override // l.C5856, l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C6602(this);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m50570(int i, int i2, int[] iArr) {
        C15070 c15070 = this.f74281;
        int[] iArr2 = c15070.f49125;
        int i3 = this.f20000;
        if (iArr2 == iArr && i3 == i && this.f19999 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f19999) {
            int i4 = i3 + 1;
            int i5 = c15070.f49125[i3];
            int i6 = i + 1;
            if (i5 != iArr[i]) {
                return false;
            }
            i = i6;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC10796, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C15070) {
            C15070 c15070 = (C15070) obj;
            return m50570(0, c15070.f49126, c15070.f49125);
        }
        if (obj instanceof C22831) {
            C22831 c22831 = (C22831) obj;
            return m50570(c22831.f20000, c22831.f19999, c22831.f74281.f49125);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m50571(int i, int i2, int[] iArr) {
        int i3;
        C15070 c15070 = this.f74281;
        int[] iArr2 = c15070.f49125;
        int i4 = this.f20000;
        if (iArr2 == iArr && i4 == i && this.f19999 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f19999;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Integer.compare(c15070.f49125[i4], iArr[i]);
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

    @Override // l.C5856, l.AbstractC10796, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C15070) {
            C15070 c15070 = (C15070) list;
            return m50571(0, c15070.f49126, c15070.f49125);
        }
        if (list instanceof C22831) {
            C22831 c22831 = (C22831) list;
            return m50571(c22831.f20000, c22831.f19999, c22831.f74281.f49125);
        }
        return super.compareTo(list);
    }
}
