package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۛۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6042 extends C8159 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10982 f20519;

    @Override // l.C10276, l.AbstractC20859, l.AbstractC18036, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6042(C10982 c10982, int i, int i2) {
        super(c10982, i, i2);
        this.f20519 = c10982;
    }

    @Override // l.C10276, l.InterfaceC16357
    public final float getFloat(int i) {
        m46895(i);
        return this.f20519.f37398[i + this.f35021];
    }

    @Override // l.AbstractC20859, java.util.List
    public final ListIterator listIterator(int i) {
        return new C12393(this, i);
    }

    @Override // l.C10276, l.AbstractC20859, java.util.List
    public final InterfaceC12124 listIterator(int i) {
        return new C12393(this, i);
    }

    @Override // l.C10276, l.AbstractC20859, l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11501 spliterator() {
        return new C17331(this);
    }

    @Override // l.C10276, l.AbstractC20859, l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C17331(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m16394(int i, int i2, float[] fArr) {
        C10982 c10982 = this.f20519;
        float[] fArr2 = c10982.f37398;
        int i3 = this.f35021;
        if (fArr2 == fArr && i3 == i && this.f35020 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f35020) {
            int i4 = i3 + 1;
            float f = c10982.f37398[i3];
            int i5 = i + 1;
            if (f != fArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC20859, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C10982) {
            C10982 c10982 = (C10982) obj;
            return m16394(0, c10982.f37399, c10982.f37398);
        }
        if (obj instanceof C6042) {
            C6042 c6042 = (C6042) obj;
            return m16394(c6042.f35021, c6042.f35020, c6042.f20519.f37398);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m16395(int i, int i2, float[] fArr) {
        int i3;
        C10982 c10982 = this.f20519;
        float[] fArr2 = c10982.f37398;
        int i4 = this.f35021;
        if (fArr2 == fArr && i4 == i && this.f35020 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f35020;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Float.compare(c10982.f37398[i4], fArr[i]);
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

    @Override // l.C10276, l.AbstractC20859, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(List list) {
        if (list instanceof C10982) {
            C10982 c10982 = (C10982) list;
            return m16395(0, c10982.f37399, c10982.f37398);
        }
        if (list instanceof C6042) {
            C6042 c6042 = (C6042) list;
            return m16395(c6042.f35021, c6042.f35020, c6042.f20519.f37398);
        }
        return super.compareTo(list);
    }
}
