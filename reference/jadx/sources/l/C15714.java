package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܺۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes5.dex */
public final class C15714 extends C22913 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19947 f50999;

    @Override // l.C17973, l.AbstractC8096, l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15714(C19947 c19947, int i, int i2) {
        super(c19947, i, i2);
        this.f50999 = c19947;
    }

    @Override // l.C17973, l.InterfaceC10338
    public final char getChar(int i) {
        m21305(i);
        return this.f50999.f63895[i + this.f57484];
    }

    @Override // l.AbstractC8096, java.util.List
    public final ListIterator listIterator(int i) {
        return new C7246(this, i);
    }

    @Override // l.C17973, l.AbstractC8096, java.util.List
    public final InterfaceC20921 listIterator(int i) {
        return new C7246(this, i);
    }

    @Override // l.C17973, l.AbstractC8096, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11687 spliterator() {
        return new C20652(this);
    }

    @Override // l.C17973, l.AbstractC8096, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C20652(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m37416(char[] cArr, int i, int i2) {
        C19947 c19947 = this.f50999;
        char[] cArr2 = c19947.f63895;
        int i3 = this.f57484;
        if (cArr2 == cArr && i3 == i && this.f57483 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f57483) {
            int i4 = i3 + 1;
            char c = c19947.f63895[i3];
            int i5 = i + 1;
            if (c != cArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC8096, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C19947) {
            C19947 c19947 = (C19947) obj;
            return m37416(c19947.f63895, 0, c19947.f63896);
        }
        if (obj instanceof C15714) {
            C15714 c15714 = (C15714) obj;
            return m37416(c15714.f50999.f63895, c15714.f57484, c15714.f57483);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m37417(char[] cArr, int i, int i2) {
        int i3;
        C19947 c19947 = this.f50999;
        char[] cArr2 = c19947.f63895;
        int i4 = this.f57484;
        if (cArr2 == cArr && i4 == i && this.f57483 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f57483;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Character.compare(c19947.f63895[i4], cArr[i]);
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

    @Override // l.C17973, l.AbstractC8096, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C19947) {
            C19947 c19947 = (C19947) list;
            return m37417(c19947.f63895, 0, c19947.f63896);
        }
        if (list instanceof C15714) {
            C15714 c15714 = (C15714) list;
            return m37417(c15714.f50999.f63895, c15714.f57484, c15714.f57483);
        }
        return super.compareTo(list);
    }
}
