package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۜ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes4.dex */
public final class C7460 extends C21455 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14171 f24582;

    @Override // l.C8030, l.AbstractC10266, l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7460(C14171 c14171, int i, int i2) {
        super(c14171, i, i2);
        this.f24582 = c14171;
    }

    @Override // l.C8030, l.InterfaceC9105
    public final char getChar(int i) {
        m26473(i);
        return this.f24582.f44819[i + this.f26648];
    }

    @Override // l.AbstractC10266, java.util.List
    public final ListIterator listIterator(int i) {
        return new C2985(this, i);
    }

    @Override // l.C8030, l.AbstractC10266, java.util.List
    public final InterfaceC8360 listIterator(int i) {
        return new C2985(this, i);
    }

    @Override // l.C8030, l.AbstractC10266, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C8951(this);
    }

    @Override // l.C8030, l.AbstractC10266, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC16321 spliterator() {
        return new C8951(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m20479(char[] cArr, int i, int i2) {
        C14171 c14171 = this.f24582;
        char[] cArr2 = c14171.f44819;
        int i3 = this.f26648;
        if (cArr2 == cArr && i3 == i && this.f26649 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f26649) {
            int i4 = i3 + 1;
            char c = c14171.f44819[i3];
            int i5 = i + 1;
            if (c != cArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC10266, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C14171) {
            C14171 c14171 = (C14171) obj;
            return m20479(c14171.f44819, 0, c14171.f44820);
        }
        if (obj instanceof C7460) {
            C7460 c7460 = (C7460) obj;
            return m20479(c7460.f24582.f44819, c7460.f26648, c7460.f26649);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m20480(char[] cArr, int i, int i2) {
        int i3;
        C14171 c14171 = this.f24582;
        char[] cArr2 = c14171.f44819;
        int i4 = this.f26648;
        if (cArr2 == cArr && i4 == i && this.f26649 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f26649;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Character.compare(c14171.f44819[i4], cArr[i]);
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

    @Override // l.C8030, l.AbstractC10266, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int compareTo(List list) {
        if (list instanceof C14171) {
            C14171 c14171 = (C14171) list;
            return m20480(c14171.f44819, 0, c14171.f44820);
        }
        if (list instanceof C7460) {
            C7460 c7460 = (C7460) list;
            return m20480(c7460.f24582.f44819, c7460.f26648, c7460.f26649);
        }
        return super.compareTo(list);
    }
}
