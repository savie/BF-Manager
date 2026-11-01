package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ᩴۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91Q1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18597 extends AbstractC23496 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient int[] f59164;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f59165;

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C18597() {
        this.f59164 = C8014.f26269;
    }

    public C18597(int i) {
        this.f59164 = new int[i];
    }

    public C18597(int[] iArr) {
        this.f59164 = iArr;
        this.f59165 = iArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m42997(int i) {
        int[] iArr = this.f59164;
        int i2 = this.f59165;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return -1;
            }
            if (iArr[i3] == i) {
                return i3;
            }
            i2 = i3;
        }
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C21419(this);
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C21419(this);
    }

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C17891(this);
    }

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C17891(this);
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return m42997(i) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f59165;
    }

    @Override // l.AbstractC23496
    public final boolean remove(int i) {
        int iM42997 = m42997(i);
        if (iM42997 == -1) {
            return false;
        }
        int i2 = (this.f59165 - iM42997) - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            int[] iArr = this.f59164;
            int i4 = iM42997 + i3;
            iArr[i4] = iArr[i4 + 1];
        }
        this.f59165--;
        return true;
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    public final boolean add(int i) {
        if (m42997(i) != -1) {
            return false;
        }
        int i2 = this.f59165;
        if (i2 == this.f59164.length) {
            int[] iArr = new int[i2 == 0 ? 2 : i2 * 2];
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                iArr[i3] = this.f59164[i3];
                i2 = i3;
            }
            this.f59164 = iArr;
        }
        int[] iArr2 = this.f59164;
        int i4 = this.f59165;
        this.f59165 = i4 + 1;
        iArr2[i4] = i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f59165 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f59165 == 0;
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ᩷ */
    public final int[] mo3181() {
        int i = this.f59165;
        return i == 0 ? C8014.f26269 : Arrays.copyOf(this.f59164, i);
    }

    public final Object clone() {
        try {
            C18597 c18597 = (C18597) super.clone();
            c18597.f59164 = (int[]) this.f59164.clone();
            return c18597;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f59164;
        for (int i = 0; i < this.f59165; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[this.f59165];
        this.f59164 = iArr;
        for (int i = 0; i < this.f59165; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }
}
