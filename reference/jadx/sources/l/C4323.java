package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۘܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes3.dex */
public final class C4323 extends C22399 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14763 f15669;

    @Override // l.C20161, l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4323(C14763 c14763, int i, int i2) {
        super(c14763, i, i2);
        this.f15669 = c14763;
    }

    @Override // l.C20161, l.InterfaceC9018
    public final int getInt(int i) {
        m37464(i);
        return this.f15669.f48233[i + this.f64763];
    }

    @Override // l.AbstractC15685, java.util.List
    public final ListIterator listIterator(int i) {
        return new C6561(this, i);
    }

    @Override // l.C20161, l.AbstractC15685, java.util.List
    public final InterfaceC8273 listIterator(int i) {
        return new C6561(this, i);
    }

    @Override // l.C20161, l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C24461(this);
    }

    @Override // l.C20161, l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C24461(this);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m13820(int i, int i2, int[] iArr) {
        C14763 c14763 = this.f15669;
        int[] iArr2 = c14763.f48233;
        int i3 = this.f64763;
        if (iArr2 == iArr && i3 == i && this.f64764 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f64764) {
            int i4 = i3 + 1;
            int i5 = c14763.f48233[i3];
            int i6 = i + 1;
            if (i5 != iArr[i]) {
                return false;
            }
            i = i6;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC15685, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C14763) {
            C14763 c14763 = (C14763) obj;
            return m13820(0, c14763.f48234, c14763.f48233);
        }
        if (obj instanceof C4323) {
            C4323 c4323 = (C4323) obj;
            return m13820(c4323.f64763, c4323.f64764, c4323.f15669.f48233);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m13819(int i, int i2, int[] iArr) {
        int i3;
        C14763 c14763 = this.f15669;
        int[] iArr2 = c14763.f48233;
        int i4 = this.f64763;
        if (iArr2 == iArr && i4 == i && this.f64764 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f64764;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Integer.compare(c14763.f48233[i4], iArr[i]);
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

    @Override // l.C20161, l.AbstractC15685, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int compareTo(List list) {
        if (list instanceof C14763) {
            C14763 c14763 = (C14763) list;
            return m13819(0, c14763.f48234, c14763.f48233);
        }
        if (list instanceof C4323) {
            C4323 c4323 = (C4323) list;
            return m13819(c4323.f64763, c4323.f64764, c4323.f15669.f48233);
        }
        return super.compareTo(list);
    }
}
