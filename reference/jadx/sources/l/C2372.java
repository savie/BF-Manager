package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۖۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EP */
/* JADX INFO: loaded from: classes3.dex */
public class C2372 extends AbstractC3074 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient Object[] f7634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f7635;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C2372() {
        this.f7634 = C8338.f27328;
    }

    public C2372(Object[] objArr) {
        this.f7634 = objArr;
        this.f7635 = objArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m8057(Object obj) {
        Object[] objArr = this.f7634;
        int i = this.f7635;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (C17359.equals(objArr[i2], obj)) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0881(this);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C0881(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC21938, l.InterfaceC9372, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C9083(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C9083(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return m8057(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7635;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f7635;
        if (i == 0) {
            return C8338.f27328;
        }
        return Arrays.copyOf(this.f7634, i, Object[].class);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM8057 = m8057(obj);
        if (iM8057 == -1) {
            return false;
        }
        int i = (this.f7635 - iM8057) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr = this.f7634;
            int i3 = iM8057 + i2;
            objArr[i3] = objArr[i3 + 1];
        }
        int i4 = this.f7635 - 1;
        this.f7635 = i4;
        this.f7634[i4] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (m8057(obj) != -1) {
            return false;
        }
        int i = this.f7635;
        if (i == this.f7634.length) {
            Object[] objArr = new Object[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr[i2] = this.f7634[i2];
                i = i2;
            }
            this.f7634 = objArr;
        }
        Object[] objArr2 = this.f7634;
        int i3 = this.f7635;
        this.f7635 = i3 + 1;
        objArr2[i3] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Arrays.fill(this.f7634, 0, this.f7635, (Object) null);
        this.f7635 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7635 == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[this.f7635];
        } else if (objArr.length < this.f7635) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f7635);
        }
        System.arraycopy(this.f7634, 0, objArr, 0, this.f7635);
        int length = objArr.length;
        int i = this.f7635;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final Object clone() {
        try {
            C2372 c2372 = (C2372) super.clone();
            c2372.f7634 = (Object[]) this.f7634.clone();
            return c2372;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f7634;
        for (int i = 0; i < this.f7635; i++) {
            objectOutputStream.writeObject(objArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object[] objArr = new Object[this.f7635];
        this.f7634 = objArr;
        for (int i = 0; i < this.f7635; i++) {
            objArr[i] = objectInputStream.readObject();
        }
    }
}
