package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ᩴۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes5.dex */
public final class C19810 extends C19305 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15334 f63682;

    @Override // l.C9608, l.AbstractC8863, l.AbstractC0660, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19810(C15334 c15334, int i, int i2) {
        super(c15334, i, i2);
        this.f63682 = c15334;
    }

    @Override // l.C9608, l.InterfaceC21874
    public final float getFloat(int i) {
        m23746(i);
        return this.f63682.f50088[i + this.f31088];
    }

    @Override // l.AbstractC8863, java.util.List
    public final ListIterator listIterator(int i) {
        return new C10859(this, i);
    }

    @Override // l.C9608, l.AbstractC8863, java.util.List
    public final InterfaceC10685 listIterator(int i) {
        return new C10859(this, i);
    }

    @Override // l.C9608, l.AbstractC8863, l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C22794(this);
    }

    @Override // l.C9608, l.AbstractC8863, l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15906 spliterator() {
        return new C22794(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m45581(int i, int i2, float[] fArr) {
        C15334 c15334 = this.f63682;
        float[] fArr2 = c15334.f50088;
        int i3 = this.f31088;
        if (fArr2 == fArr && i3 == i && this.f31089 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f31089) {
            int i4 = i3 + 1;
            float f = c15334.f50088[i3];
            int i5 = i + 1;
            if (f != fArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC8863, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C15334) {
            C15334 c15334 = (C15334) obj;
            return m45581(0, c15334.f50089, c15334.f50088);
        }
        if (obj instanceof C19810) {
            C19810 c19810 = (C19810) obj;
            return m45581(c19810.f31088, c19810.f31089, c19810.f63682.f50088);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m45582(int i, int i2, float[] fArr) {
        int i3;
        C15334 c15334 = this.f63682;
        float[] fArr2 = c15334.f50088;
        int i4 = this.f31088;
        if (fArr2 == fArr && i4 == i && this.f31089 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f31089;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Float.compare(c15334.f50088[i4], fArr[i]);
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

    @Override // l.C9608, l.AbstractC8863, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C15334) {
            C15334 c15334 = (C15334) list;
            return m45582(0, c15334.f50089, c15334.f50088);
        }
        if (list instanceof C19810) {
            C19810 c19810 = (C19810) list;
            return m45582(c19810.f31088, c19810.f31089, c19810.f63682.f50088);
        }
        return super.compareTo(list);
    }
}
