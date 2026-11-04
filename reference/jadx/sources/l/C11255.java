package l;

import com.google.android.material.motion.MotionUtils;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11255 extends AbstractC13493 implements RandomAccess, Serializable {
    public static final long serialVersionUID = 7054639518438982401L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f35535;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final transient int[] f35536;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16476 f35537;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f35538;

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14688(int i, int i2, int i3, int[] iArr) {
        C18450.m42990(iArr.length, i2, i3);
        m37464(i);
        int i4 = this.f35538;
        if (i + i4 + i3 > this.f35535) {
            throw new IndexOutOfBoundsException("Final index " + (i + i4 + i3) + " (startingIndex: " + (i + i4) + " + length: " + i3 + ") is greater then list length " + size());
        }
        System.arraycopy(this.f35536, i + i4, iArr, i2, i3);
    }

    @Override // l.InterfaceC9018
    public final int getInt(int i) {
        m37464(i);
        return this.f35536[i + this.f35538];
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    public final int indexOf(int i) {
        int i2 = this.f35538;
        for (int i3 = i2; i3 < this.f35535; i3++) {
            if (i == this.f35536[i3]) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    public final int lastIndexOf(int i) {
        int i2 = this.f35535;
        while (true) {
            int i3 = i2 - 1;
            int i4 = this.f35538;
            if (i2 == i4) {
                return -1;
            }
            if (i == this.f35536[i3]) {
                return i3 - i4;
            }
            i2 = i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35535 - this.f35538;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f35535 <= this.f35538;
    }

    @Override // l.AbstractC15685, l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
        for (int i = this.f35538; i < this.f35535; i++) {
            intConsumer.accept(this.f35536[i]);
        }
    }

    @Override // l.AbstractC15685, l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ۘ */
    public final int[] mo2687() {
        return Arrays.copyOfRange(this.f35536, this.f35538, this.f35535);
    }

    @Override // l.AbstractC15685, java.util.List
    public final InterfaceC8273 listIterator(int i) {
        m37462(i);
        return new C5290(this, i);
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C1561(this);
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C1561(this);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m28494(int i, int i2, int[] iArr) {
        int i3 = this.f35535;
        int i4 = this.f35538;
        int[] iArr2 = this.f35536;
        if (iArr2 == iArr && i4 == i && i3 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i4 < i3) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            if (iArr2[i4] != iArr[i]) {
                return false;
            }
            i4 = i5;
            i = i6;
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
        if (obj instanceof C16476) {
            C16476 c16476 = (C16476) obj;
            return m28494(0, c16476.size(), c16476.f53438);
        }
        if (obj instanceof C11255) {
            C11255 c11255 = (C11255) obj;
            return m28494(c11255.f35538, c11255.f35535, c11255.f35536);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m28493(int i, int i2, int[] iArr) {
        int i3 = this.f35535;
        int i4 = this.f35538;
        int[] iArr2 = this.f35536;
        if (iArr2 == iArr && i4 == i && i3 == i2) {
            return 0;
        }
        while (i4 < i3 && i4 < i2) {
            int iCompare = Integer.compare(iArr2[i4], iArr[i]);
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

    @Override // l.AbstractC15685, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C16476) {
            C16476 c16476 = (C16476) list;
            return m28493(0, c16476.size(), c16476.f53438);
        }
        if (list instanceof C11255) {
            C11255 c11255 = (C11255) list;
            return m28493(c11255.f35538, c11255.f35535, c11255.f35536);
        }
        return super.compareTo(list);
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return this.f35537.subList(this.f35538, this.f35535);
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    @Override // l.AbstractC15685, l.InterfaceC9018, java.util.List
    public final InterfaceC9018 subList(int i, int i2) {
        m37462(i);
        m37462(i2);
        if (i == i2) {
            return C16476.f53437;
        }
        if (i > i2) {
            throw new IllegalArgumentException(C0703.m3016("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        int i3 = this.f35538;
        return new C11255(this.f35537, i + i3, i2 + i3);
    }

    public C11255(C16476 c16476, int i, int i2) {
        this.f35537 = c16476;
        this.f35538 = i;
        this.f35535 = i2;
        this.f35536 = c16476.f53438;
    }
}
