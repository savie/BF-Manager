package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ᩴۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19744 extends AbstractC5837 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient long[] f63566;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63567;

    @Override // l.AbstractC5837, l.AbstractC13711, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C19744() {
        this.f63566 = C15268.f49916;
    }

    public C19744(long[] jArr) {
        this.f63566 = jArr;
        this.f63567 = jArr.length;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m45506(long j) {
        long[] jArr = this.f63566;
        int i = this.f63567;
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
        return new C10793(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC5574, l.InterfaceC3336
    public final InterfaceC12285 iterator() {
        return new C10793(this);
    }

    @Override // l.AbstractC5837, l.AbstractC13711, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C22728(this);
    }

    @Override // l.InterfaceC5574
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6352(long j) {
        return m45506(j) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f63567;
    }

    @Override // l.AbstractC5837
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11667(long j) {
        int iM45506 = m45506(j);
        if (iM45506 == -1) {
            return false;
        }
        int i = (this.f63567 - iM45506) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            long[] jArr = this.f63566;
            int i3 = iM45506 + i2;
            jArr[i3] = jArr[i3 + 1];
        }
        this.f63567--;
        return true;
    }

    @Override // l.AbstractC13711, l.InterfaceC5574
    public final boolean add(long j) {
        if (m45506(j) != -1) {
            return false;
        }
        int i = this.f63567;
        if (i == this.f63566.length) {
            long[] jArr = new long[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                jArr[i2] = this.f63566[i2];
                i = i2;
            }
            this.f63566 = jArr;
        }
        long[] jArr2 = this.f63566;
        int i3 = this.f63567;
        this.f63567 = i3 + 1;
        jArr2[i3] = j;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f63567 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f63567 == 0;
    }

    public final Object clone() {
        try {
            C19744 c19744 = (C19744) super.clone();
            c19744.f63566 = (long[]) this.f63566.clone();
            return c19744;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f63566;
        for (int i = 0; i < this.f63567; i++) {
            objectOutputStream.writeLong(jArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long[] jArr = new long[this.f63567];
        this.f63566 = jArr;
        for (int i = 0; i < this.f63567; i++) {
            jArr[i] = objectInputStream.readLong();
        }
    }
}
