package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.֡ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 91Q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0594 extends AbstractC13448 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient int[] f2378;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f2379;

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C0594() {
        this.f2378 = C8052.f26680;
    }

    public C0594(int i) {
        this.f2378 = new int[i];
    }

    public C0594(int[] iArr) {
        this.f2378 = iArr;
        this.f2379 = iArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m2686(int i) {
        int[] iArr = this.f2378;
        int i2 = this.f2379;
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

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21477(this);
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return new C21477(this);
    }

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C18493(this);
    }

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C18493(this);
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        return m2686(i) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2379;
    }

    @Override // l.AbstractC13448
    public final boolean remove(int i) {
        int iM2686 = m2686(i);
        if (iM2686 == -1) {
            return false;
        }
        int i2 = (this.f2379 - iM2686) - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            int[] iArr = this.f2378;
            int i4 = iM2686 + i3;
            iArr[i4] = iArr[i4 + 1];
        }
        this.f2379--;
        return true;
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    public final boolean add(int i) {
        if (m2686(i) != -1) {
            return false;
        }
        int i2 = this.f2379;
        if (i2 == this.f2378.length) {
            int[] iArr = new int[i2 == 0 ? 2 : i2 * 2];
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                iArr[i3] = this.f2378[i3];
                i2 = i3;
            }
            this.f2378 = iArr;
        }
        int[] iArr2 = this.f2378;
        int i4 = this.f2379;
        this.f2379 = i4 + 1;
        iArr2[i4] = i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2379 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2379 == 0;
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int[] mo2687() {
        int i = this.f2379;
        return i == 0 ? C8052.f26680 : Arrays.copyOf(this.f2378, i);
    }

    public final Object clone() {
        try {
            C0594 c0594 = (C0594) super.clone();
            c0594.f2378 = (int[]) this.f2378.clone();
            return c0594;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f2378;
        for (int i = 0; i < this.f2379; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[this.f2379];
        this.f2378 = iArr;
        for (int i = 0; i < this.f2379; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }
}
