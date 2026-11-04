package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۙۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4828 extends C11056 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21982 f16885;

    @Override // l.C15531, l.AbstractC13294, l.AbstractC13711, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4828(C21982 c21982, int i, int i2) {
        super(c21982, i, i2);
        this.f16885 = c21982;
    }

    @Override // l.C15531, l.InterfaceC18252
    public final long getLong(int i) {
        m32838(i);
        return this.f16885.f70927[i + this.f50532];
    }

    @Override // l.AbstractC13294, java.util.List
    public final ListIterator listIterator(int i) {
        return new C7328(this, i);
    }

    @Override // l.C15531, l.AbstractC13294, java.util.List
    public final InterfaceC0353 listIterator(int i) {
        return new C7328(this, i);
    }

    @Override // l.C15531, l.AbstractC13294, l.AbstractC13711, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C14039(this);
    }

    @Override // l.C15531, l.AbstractC13294, l.AbstractC13711, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC9301 spliterator() {
        return new C14039(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m14863(int i, int i2, long[] jArr) {
        C21982 c21982 = this.f16885;
        long[] jArr2 = c21982.f70927;
        int i3 = this.f50532;
        if (jArr2 == jArr && i3 == i && this.f50533 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f50533) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            if (c21982.f70927[i3] != jArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC13294, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C21982) {
            C21982 c21982 = (C21982) obj;
            return m14863(0, c21982.f70928, c21982.f70927);
        }
        if (obj instanceof C4828) {
            C4828 c4828 = (C4828) obj;
            return m14863(c4828.f50532, c4828.f50533, c4828.f16885.f70927);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m14864(int i, int i2, long[] jArr) {
        int i3;
        C21982 c21982 = this.f16885;
        long[] jArr2 = c21982.f70927;
        int i4 = this.f50532;
        if (jArr2 == jArr && i4 == i && this.f50533 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f50533;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Long.compare(c21982.f70927[i4], jArr[i]);
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

    @Override // l.C15531, l.AbstractC13294, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(List list) {
        if (list instanceof C21982) {
            C21982 c21982 = (C21982) list;
            return m14864(0, c21982.f70928, c21982.f70927);
        }
        if (list instanceof C4828) {
            C4828 c4828 = (C4828) list;
            return m14864(c4828.f50532, c4828.f50533, c4828.f16885.f70927);
        }
        return super.compareTo(list);
    }
}
