package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7660 extends AbstractC6227 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC18660 f25318;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC17537 f25320;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f25321;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC10131 f25322;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Object[] f25323 = C7681.f25444;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int[] f25319 = C8014.f26269;

    @Override // l.InterfaceC6248
    /* JADX INFO: renamed from: ۙۙ */
    public final InterfaceC18660 mo17317() {
        if (this.f25320 == null) {
            this.f25320 = new C15422(this);
        }
        return this.f25320;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int m20219(Object obj) {
        Object[] objArr = this.f25323;
        int i = this.f25321;
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

    @Override // l.InterfaceC16127
    /* JADX INFO: renamed from: ܰ */
    public final int mo18022(Object obj) {
        Object[] objArr = this.f25323;
        int i = this.f25321;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return 0;
            }
            if (C13638.equals(objArr[i2], obj)) {
                return this.f25319[i2];
            }
            i = i2;
        }
    }

    @Override // l.AbstractC17516, l.InterfaceC6456
    public final int size() {
        return this.f25321;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f25323;
        int i = this.f25321;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f25321 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        return m20219(obj) != -1;
    }

    @Override // l.InterfaceC6248
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo17316(int i) {
        int[] iArr = this.f25319;
        int i2 = this.f25321;
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
        return this.f25321 == 0;
    }

    @Override // l.AbstractC17516, l.InterfaceC16127
    /* JADX INFO: renamed from: ۙ */
    public final int mo18019(int i, Object obj) {
        int iM20219 = m20219(obj);
        if (iM20219 != -1) {
            int[] iArr = this.f25319;
            int i2 = iArr[iM20219];
            iArr[iM20219] = i;
            return i2;
        }
        int i3 = this.f25321;
        if (i3 == this.f25323.length) {
            Object[] objArr = new Object[i3 == 0 ? 2 : i3 * 2];
            int[] iArr2 = new int[i3 != 0 ? i3 * 2 : 2];
            while (true) {
                int i4 = i3 - 1;
                if (i3 == 0) {
                    break;
                }
                objArr[i4] = this.f25323[i4];
                iArr2[i4] = this.f25319[i4];
                i3 = i4;
            }
            this.f25323 = objArr;
            this.f25319 = iArr2;
        }
        Object[] objArr2 = this.f25323;
        int i5 = this.f25321;
        objArr2[i5] = obj;
        this.f25319[i5] = i;
        this.f25321 = i5 + 1;
        return 0;
    }

    @Override // l.AbstractC17516, l.InterfaceC16127
    /* JADX INFO: renamed from: ۙ */
    public final int mo18020(Object obj) {
        int iM20219 = m20219(obj);
        if (iM20219 == -1) {
            return 0;
        }
        int i = this.f25319[iM20219];
        int i2 = (this.f25321 - iM20219) - 1;
        Object[] objArr = this.f25323;
        int i3 = iM20219 + 1;
        System.arraycopy(objArr, i3, objArr, iM20219, i2);
        int[] iArr = this.f25319;
        System.arraycopy(iArr, i3, iArr, iM20219, i2);
        int i4 = this.f25321 - 1;
        this.f25321 = i4;
        this.f25323[i4] = null;
        return i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f25318 == null) {
            this.f25318 = new C18949(this);
        }
        return this.f25318;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f25322 == null) {
            this.f25322 = new C10483(this);
        }
        return this.f25322;
    }

    public final Object clone() {
        try {
            C7660 c7660 = (C7660) super.clone();
            c7660.f25323 = (Object[]) this.f25323.clone();
            c7660.f25319 = (int[]) this.f25319.clone();
            c7660.f25320 = null;
            c7660.f25318 = null;
            c7660.f25322 = null;
            return c7660;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f25323;
        int[] iArr = this.f25319;
        int i = this.f25321;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeObject(objArr[i2]);
            objectOutputStream.writeInt(iArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f25321;
        Object[] objArr = new Object[i];
        this.f25323 = objArr;
        int[] iArr = new int[i];
        this.f25319 = iArr;
        for (int i2 = 0; i2 < this.f25321; i2++) {
            objArr[i2] = objectInputStream.readObject();
            iArr[i2] = objectInputStream.readInt();
        }
    }
}
