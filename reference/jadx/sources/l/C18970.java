package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ᩴ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18970 extends C3404 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8387 f61421;

    @Override // l.C11894, l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18970(C8387 c8387, int i, int i2) {
        super(c8387, i, i2);
        this.f61421 = c8387;
    }

    @Override // l.C11894, java.util.List
    public final Object get(int i) {
        m8299(i);
        return this.f61421.f29126[i + this.f39905];
    }

    @Override // l.AbstractC2720, java.util.List
    public final ListIterator listIterator(int i) {
        return new C21792(this, i);
    }

    @Override // l.C11894, l.AbstractC2720, java.util.List
    public final InterfaceC13722 listIterator(int i) {
        return new C21792(this, i);
    }

    @Override // l.C11894, l.AbstractC2720, l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC10441, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C18264(this);
    }

    @Override // l.C11894, l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C18264(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m43671(int i, int i2, Object[] objArr) {
        C8387 c8387 = this.f61421;
        Object[] objArr2 = c8387.f29126;
        int i3 = this.f39905;
        if (objArr2 == objArr && i3 == i && this.f39904 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f39904) {
            int i4 = i3 + 1;
            Object obj = c8387.f29126[i3];
            int i5 = i + 1;
            if (!C13638.equals(obj, objArr[i])) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC2720, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C8387) {
            C8387 c8387 = (C8387) obj;
            return m43671(0, c8387.f29127, c8387.f29126);
        }
        if (obj instanceof C18970) {
            C18970 c18970 = (C18970) obj;
            return m43671(c18970.f39905, c18970.f39904, c18970.f61421.f29126);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m43672(int i, int i2, Object[] objArr) {
        int i3;
        int i4 = this.f39905;
        while (true) {
            i3 = this.f39904;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompareTo = ((Comparable) this.f61421.f29126[i4]).compareTo(objArr[i]);
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

    @Override // l.C11894, l.AbstractC2720, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C8387) {
            C8387 c8387 = (C8387) list;
            return m43672(0, c8387.f29127, c8387.f29126);
        }
        if (list instanceof C18970) {
            C18970 c18970 = (C18970) list;
            return m43672(c18970.f39905, c18970.f39904, c18970.f61421.f29126);
        }
        return super.compareTo(list);
    }
}
