package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16476 extends AbstractC13493 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C16476 f53437 = new C16476(C8052.f26680);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f53438;

    public final Object clone() {
        return this;
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.InterfaceC9018
    public final int getInt(int i) {
        int[] iArr = this.f53438;
        if (i < iArr.length) {
            return iArr[i];
        }
        throw new IndexOutOfBoundsException(C12669.m31437(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    public final int indexOf(int i) {
        int[] iArr = this.f53438;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    public final int lastIndexOf(int i) {
        int[] iArr = this.f53438;
        int length = iArr.length;
        while (true) {
            int i2 = length - 1;
            if (length == 0) {
                return -1;
            }
            if (i == iArr[i2]) {
                return i2;
            }
            length = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f53438.length;
    }

    @Override // l.AbstractC15685, l.InterfaceC9018, java.util.List
    public final InterfaceC9018 subList(int i, int i2) {
        if (i == 0 && i2 == this.f53438.length) {
            return this;
        }
        m37462(i);
        m37462(i2);
        if (i == i2) {
            return f53437;
        }
        if (i <= i2) {
            return new C11255(this, i, i2);
        }
        throw new IllegalArgumentException(C0703.m3016("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f53438.length == 0;
    }

    @Override // l.AbstractC15685, l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
        int i = 0;
        while (true) {
            int[] iArr = this.f53438;
            if (i >= iArr.length) {
                return;
            }
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // l.AbstractC15685, l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ۘ */
    public final int[] mo2687() {
        int[] iArr = this.f53438;
        return iArr.length == 0 ? C8052.f26680 : (int[]) iArr.clone();
    }

    @Override // l.AbstractC15685, java.util.List
    public final InterfaceC8273 listIterator(int i) {
        m37462(i);
        return new C12747(this, i);
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14688(int i, int i2, int i3, int[] iArr) {
        C18450.m42990(iArr.length, i2, i3);
        System.arraycopy(this.f53438, i, iArr, i2, i3);
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C24682(this);
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C24682(this);
    }

    @Override // l.AbstractC15685, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        int[] iArr;
        int[] iArr2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C16476) {
            C16476 c16476 = (C16476) obj;
            if (c16476 == this || (iArr2 = this.f53438) == (iArr = c16476.f53438)) {
                return true;
            }
            if (iArr2.length != iArr.length) {
                return false;
            }
            return Arrays.equals(iArr2, iArr);
        }
        if (obj instanceof C11255) {
            return ((C11255) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC15685, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C16476) {
            int[] iArr = ((C16476) list).f53438;
            int[] iArr2 = this.f53438;
            if (iArr2 != iArr) {
                int length = iArr2.length;
                int length2 = iArr.length;
                int i = 0;
                while (i < length && i < length2) {
                    int iCompare = Integer.compare(iArr2[i], iArr[i]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i++;
                }
                if (i < length2) {
                    return -1;
                }
                if (i < length) {
                    return 1;
                }
            }
            return 0;
        }
        if (list instanceof C11255) {
            return -((C11255) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    public C16476(int[] iArr) {
        this.f53438 = iArr;
    }
}
