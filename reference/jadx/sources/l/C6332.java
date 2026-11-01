package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۛ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6332 extends AbstractC14613 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient long[] f21374;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21375;

    @Override // l.AbstractC14613, l.AbstractC20257, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C6332() {
        this.f21374 = C11272.f38094;
    }

    public C6332(long[] jArr) {
        this.f21374 = jArr;
        this.f21375 = jArr.length;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m17435(long j) {
        long[] jArr = this.f21374;
        int i = this.f21375;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (jArr[i2] == j) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C12683(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC14800, l.InterfaceC5522
    public final InterfaceC1288 iterator() {
        return new C12683(this);
    }

    @Override // l.AbstractC14613, l.AbstractC20257, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C17621(this);
    }

    @Override // l.InterfaceC14800
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo6642(long j) {
        return m17435(j) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21375;
    }

    @Override // l.AbstractC14613
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15519(long j) {
        int iM17435 = m17435(j);
        if (iM17435 == -1) {
            return false;
        }
        int i = (this.f21375 - iM17435) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            long[] jArr = this.f21374;
            int i3 = iM17435 + i2;
            jArr[i3] = jArr[i3 + 1];
        }
        this.f21375--;
        return true;
    }

    @Override // l.AbstractC20257, l.InterfaceC14800
    public final boolean add(long j) {
        if (m17435(j) != -1) {
            return false;
        }
        int i = this.f21375;
        if (i == this.f21374.length) {
            long[] jArr = new long[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                jArr[i2] = this.f21374[i2];
                i = i2;
            }
            this.f21374 = jArr;
        }
        long[] jArr2 = this.f21374;
        int i3 = this.f21375;
        this.f21375 = i3 + 1;
        jArr2[i3] = j;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f21375 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f21375 == 0;
    }

    public final Object clone() {
        try {
            C6332 c6332 = (C6332) super.clone();
            c6332.f21374 = (long[]) this.f21374.clone();
            return c6332;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f21374;
        for (int i = 0; i < this.f21375; i++) {
            objectOutputStream.writeLong(jArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long[] jArr = new long[this.f21375];
        this.f21374 = jArr;
        for (int i = 0; i < this.f21375; i++) {
            jArr[i] = objectInputStream.readLong();
        }
    }
}
