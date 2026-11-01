package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: renamed from: l.ܽ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16667 extends AbstractC10090 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC14842 f53434;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient Object[] f53435;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1849 f53436;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f53437;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f53438;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int[] f53439;

    public C16667() {
        this.f53439 = C8014.f26269;
        this.f53435 = C7681.f25444;
    }

    public C16667(int i) {
        this.f53439 = new int[i];
        this.f53435 = new Object[i];
    }

    @Override // l.InterfaceC9612, l.InterfaceC4485
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC1849 mo8949() {
        if (this.f53436 == null) {
            this.f53436 = new C19489(this);
        }
        return this.f53436;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int m39132(int i) {
        int[] iArr = this.f53439;
        int i2 = this.f53437;
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

    @Override // l.InterfaceC17372
    public final Object get(int i) {
        int[] iArr = this.f53439;
        int i2 = this.f53437;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return null;
            }
            if (iArr[i3] == i) {
                return this.f53435[i3];
            }
            i2 = i3;
        }
    }

    @Override // l.AbstractC19262, l.InterfaceC6456
    public final int size() {
        return this.f53437;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f53435;
        int i = this.f53437;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f53437 = 0;
                return;
            }
        }
    }

    @Override // l.AbstractC10090, l.InterfaceC17372, l.InterfaceC9612
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8945(int i) {
        return m39132(i) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f53435;
        int i = this.f53437;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C13638.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f53437 == 0;
    }

    @Override // l.AbstractC19262, l.InterfaceC17372
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8944(int i, Object obj) {
        int iM39132 = m39132(i);
        if (iM39132 != -1) {
            Object[] objArr = this.f53435;
            Object obj2 = objArr[iM39132];
            objArr[iM39132] = obj;
            return obj2;
        }
        int i2 = this.f53437;
        if (i2 == this.f53439.length) {
            int[] iArr = new int[i2 == 0 ? 2 : i2 * 2];
            Object[] objArr2 = new Object[i2 != 0 ? i2 * 2 : 2];
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                iArr[i3] = this.f53439[i3];
                objArr2[i3] = this.f53435[i3];
                i2 = i3;
            }
            this.f53439 = iArr;
            this.f53435 = objArr2;
        }
        int[] iArr2 = this.f53439;
        int i4 = this.f53437;
        iArr2[i4] = i;
        this.f53435[i4] = obj;
        this.f53437 = i4 + 1;
        return null;
    }

    @Override // l.AbstractC19262, l.InterfaceC17372
    public final Object remove(int i) {
        int iM39132 = m39132(i);
        if (iM39132 == -1) {
            return null;
        }
        Object obj = this.f53435[iM39132];
        int i2 = (this.f53437 - iM39132) - 1;
        int[] iArr = this.f53439;
        int i3 = iM39132 + 1;
        System.arraycopy(iArr, i3, iArr, iM39132, i2);
        Object[] objArr = this.f53435;
        System.arraycopy(objArr, i3, objArr, iM39132, i2);
        int i4 = this.f53437 - 1;
        this.f53437 = i4;
        this.f53435[i4] = null;
        return obj;
    }

    @Override // java.util.Map
    public final InterfaceC14842 keySet() {
        if (this.f53434 == null) {
            this.f53434 = new C7494(this);
        }
        return this.f53434;
    }

    @Override // java.util.Map
    public final InterfaceC0624 values() {
        if (this.f53438 == null) {
            this.f53438 = new C0438(this);
        }
        return this.f53438;
    }

    public final Object clone() {
        try {
            C16667 c16667 = (C16667) super.clone();
            c16667.f53439 = (int[]) this.f53439.clone();
            c16667.f53435 = (Object[]) this.f53435.clone();
            c16667.f53436 = null;
            c16667.f53434 = null;
            c16667.f53438 = null;
            return c16667;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f53439;
        Object[] objArr = this.f53435;
        int i = this.f53437;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeInt(iArr[i2]);
            objectOutputStream.writeObject(objArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f53437;
        int[] iArr = new int[i];
        this.f53439 = iArr;
        Object[] objArr = new Object[i];
        this.f53435 = objArr;
        for (int i2 = 0; i2 < this.f53437; i2++) {
            iArr[i2] = objectInputStream.readInt();
            objArr[i2] = objectInputStream.readObject();
        }
    }
}
