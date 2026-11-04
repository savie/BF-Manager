package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ᩳۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18780 extends C24704 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9829 f60993;

    @Override // l.C15752, l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18780(C9829 c9829, int i, int i2) {
        super(c9829, i, i2);
        this.f60993 = c9829;
    }

    @Override // l.C15752, java.util.List
    public final Object get(int i) {
        m52131(i);
        return this.f60993.f31642[i + this.f51221];
    }

    @Override // l.AbstractC23212, l.InterfaceC17462, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0135(this, i);
    }

    @Override // l.C15752, l.AbstractC23212, l.InterfaceC17462, java.util.List
    public final InterfaceC15970 listIterator(int i) {
        return new C0135(this, i);
    }

    @Override // l.C15752, l.AbstractC23212, l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC21938, l.InterfaceC9372, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C7593(this);
    }

    @Override // l.C15752, l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C7593(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m43570(int i, int i2, Object[] objArr) {
        C9829 c9829 = this.f60993;
        Object[] objArr2 = c9829.f31642;
        int i3 = this.f51221;
        if (objArr2 == objArr && i3 == i && this.f51222 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f51222) {
            int i4 = i3 + 1;
            Object obj = c9829.f31642[i3];
            int i5 = i + 1;
            if (!C17359.equals(obj, objArr[i])) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC23212, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C9829) {
            C9829 c9829 = (C9829) obj;
            return m43570(0, c9829.f31644, c9829.f31642);
        }
        if (obj instanceof C18780) {
            C18780 c18780 = (C18780) obj;
            return m43570(c18780.f51221, c18780.f51222, c18780.f60993.f31642);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m43571(int i, int i2, Object[] objArr) {
        int i3;
        int i4 = this.f51221;
        while (true) {
            i3 = this.f51222;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompareTo = ((Comparable) this.f60993.f31642[i4]).compareTo(objArr[i]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i4++;
            i++;
        }
        if (i4 < i2) {
            return -1;
        }
        return i4 < i3 ? 1 : 0;
    }

    @Override // l.C15752, l.AbstractC23212, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C9829) {
            C9829 c9829 = (C9829) list;
            return m43571(0, c9829.f31644, c9829.f31642);
        }
        if (list instanceof C18780) {
            C18780 c18780 = (C18780) list;
            return m43571(c18780.f51221, c18780.f51222, c18780.f60993.f31642);
        }
        return super.compareTo(list);
    }
}
