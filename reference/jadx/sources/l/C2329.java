package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2329 extends AbstractC19482 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f7510;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC22706 f7512;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC7767 f7513;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1340 f7514;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Object[] f7515 = C8338.f27328;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int[] f7511 = C8052.f26680;

    @Override // l.InterfaceC19722
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7767 mo7847() {
        if (this.f7512 == null) {
            this.f7512 = new C20974(this);
        }
        return this.f7512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int m7844(Object obj) {
        Object[] objArr = this.f7515;
        int i = this.f7510;
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

    @Override // l.InterfaceC6804
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo7848(Object obj) {
        Object[] objArr = this.f7515;
        int i = this.f7510;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return 0;
            }
            if (C17359.equals(objArr[i2], obj)) {
                return this.f7511[i2];
            }
            i = i2;
        }
    }

    @Override // l.AbstractC22466, l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f7510;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f7515;
        int i = this.f7510;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f7510 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        return m7844(obj) != -1;
    }

    @Override // l.InterfaceC19722
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo7849(int i) {
        int[] iArr = this.f7511;
        int i2 = this.f7510;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return false;
            }
            if (iArr[i3] == i) {
                return true;
            }
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f7510 == 0;
    }

    @Override // l.AbstractC22466, l.InterfaceC6804
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo7845(int i, Object obj) {
        int iM7844 = m7844(obj);
        if (iM7844 != -1) {
            int[] iArr = this.f7511;
            int i2 = iArr[iM7844];
            iArr[iM7844] = i;
            return i2;
        }
        int i3 = this.f7510;
        if (i3 == this.f7515.length) {
            Object[] objArr = new Object[i3 == 0 ? 2 : i3 * 2];
            int[] iArr2 = new int[i3 != 0 ? i3 * 2 : 2];
            while (true) {
                int i4 = i3 - 1;
                if (i3 == 0) {
                    break;
                }
                objArr[i4] = this.f7515[i4];
                iArr2[i4] = this.f7511[i4];
                i3 = i4;
            }
            this.f7515 = objArr;
            this.f7511 = iArr2;
        }
        Object[] objArr2 = this.f7515;
        int i5 = this.f7510;
        objArr2[i5] = obj;
        this.f7511[i5] = i;
        this.f7510 = i5 + 1;
        return 0;
    }

    @Override // l.AbstractC22466, l.InterfaceC6804
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo7846(Object obj) {
        int iM7844 = m7844(obj);
        if (iM7844 == -1) {
            return 0;
        }
        int i = this.f7511[iM7844];
        int i2 = (this.f7510 - iM7844) - 1;
        Object[] objArr = this.f7515;
        int i3 = iM7844 + 1;
        System.arraycopy(objArr, i3, objArr, iM7844, i2);
        int[] iArr = this.f7511;
        System.arraycopy(iArr, i3, iArr, iM7844, i2);
        int i4 = this.f7510 - 1;
        this.f7510 = i4;
        this.f7515[i4] = null;
        return i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f7513 == null) {
            this.f7513 = new C7549(this);
        }
        return this.f7513;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f7514 == null) {
            this.f7514 = new C9040(this);
        }
        return this.f7514;
    }

    public final Object clone() {
        try {
            C2329 c2329 = (C2329) super.clone();
            c2329.f7515 = (Object[]) this.f7515.clone();
            c2329.f7511 = (int[]) this.f7511.clone();
            c2329.f7512 = null;
            c2329.f7513 = null;
            c2329.f7514 = null;
            return c2329;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f7515;
        int[] iArr = this.f7511;
        int i = this.f7510;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeObject(objArr[i2]);
            objectOutputStream.writeInt(iArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f7510;
        Object[] objArr = new Object[i];
        this.f7515 = objArr;
        int[] iArr = new int[i];
        this.f7511 = iArr;
        for (int i2 = 0; i2 < this.f7510; i2++) {
            objArr[i2] = objectInputStream.readObject();
            iArr[i2] = objectInputStream.readInt();
        }
    }
}
