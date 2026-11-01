package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۤ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EP */
/* JADX INFO: loaded from: classes4.dex */
public class C10504 extends AbstractC5543 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient Object[] f35992;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f35993;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C10504() {
        this.f35992 = C7681.f25444;
    }

    public C10504(Object[] objArr) {
        this.f35992 = objArr;
        this.f35993 = objArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m26659(Object obj) {
        Object[] objArr = this.f35992;
        int i = this.f35993;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (C13638.equals(objArr[i2], obj)) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final Iterator iterator() {
        return new C19676(this);
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C19676(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC10441, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C9093(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C9093(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return m26659(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f35993;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f35993;
        if (i == 0) {
            return C7681.f25444;
        }
        return Arrays.copyOf(this.f35992, i, Object[].class);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM26659 = m26659(obj);
        if (iM26659 == -1) {
            return false;
        }
        int i = (this.f35993 - iM26659) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr = this.f35992;
            int i3 = iM26659 + i2;
            objArr[i3] = objArr[i3 + 1];
        }
        int i4 = this.f35993 - 1;
        this.f35993 = i4;
        this.f35992[i4] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (m26659(obj) != -1) {
            return false;
        }
        int i = this.f35993;
        if (i == this.f35992.length) {
            Object[] objArr = new Object[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr[i2] = this.f35992[i2];
                i = i2;
            }
            this.f35992 = objArr;
        }
        Object[] objArr2 = this.f35992;
        int i3 = this.f35993;
        this.f35993 = i3 + 1;
        objArr2[i3] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Arrays.fill(this.f35992, 0, this.f35993, (Object) null);
        this.f35993 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f35993 == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[this.f35993];
        } else if (objArr.length < this.f35993) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f35993);
        }
        System.arraycopy(this.f35992, 0, objArr, 0, this.f35993);
        int length = objArr.length;
        int i = this.f35993;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final Object clone() {
        try {
            C10504 c10504 = (C10504) super.clone();
            c10504.f35992 = (Object[]) this.f35992.clone();
            return c10504;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f35992;
        for (int i = 0; i < this.f35993; i++) {
            objectOutputStream.writeObject(objArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object[] objArr = new Object[this.f35993];
        this.f35992 = objArr;
        for (int i = 0; i < this.f35993; i++) {
            objArr[i] = objectInputStream.readObject();
        }
    }
}
