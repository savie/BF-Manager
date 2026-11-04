package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: renamed from: l.᩷᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22311 extends AbstractC9193 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f72228;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient Object[] f72229;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC2174 f72230;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC5509 f72231;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f72232;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int[] f72233;

    public C22311() {
        this.f72233 = C8052.f26680;
        this.f72229 = C8338.f27328;
    }

    public C22311(int i) {
        this.f72233 = new int[i];
        this.f72229 = new Object[i];
    }

    @Override // l.InterfaceC11868, l.InterfaceC25207
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC2174 mo13468() {
        if (this.f72230 == null) {
            this.f72230 = new C10178(this);
        }
        return this.f72230;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int m50372(int i) {
        int[] iArr = this.f72233;
        int i2 = this.f72228;
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

    @Override // l.InterfaceC23057
    public final Object get(int i) {
        int[] iArr = this.f72233;
        int i2 = this.f72228;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return null;
            }
            if (iArr[i3] == i) {
                return this.f72229[i3];
            }
            i2 = i3;
        }
    }

    @Override // l.AbstractC9939, l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f72228;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f72229;
        int i = this.f72228;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f72228 = 0;
                return;
            }
        }
    }

    @Override // l.AbstractC9193, l.InterfaceC23057, l.InterfaceC11868
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13467(int i) {
        return m50372(i) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f72229;
        int i = this.f72228;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C17359.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f72228 == 0;
    }

    @Override // l.AbstractC9939, l.InterfaceC23057
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13466(int i, Object obj) {
        int iM50372 = m50372(i);
        if (iM50372 != -1) {
            Object[] objArr = this.f72229;
            Object obj2 = objArr[iM50372];
            objArr[iM50372] = obj;
            return obj2;
        }
        int i2 = this.f72228;
        if (i2 == this.f72233.length) {
            int[] iArr = new int[i2 == 0 ? 2 : i2 * 2];
            Object[] objArr2 = new Object[i2 != 0 ? i2 * 2 : 2];
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                iArr[i3] = this.f72233[i3];
                objArr2[i3] = this.f72229[i3];
                i2 = i3;
            }
            this.f72233 = iArr;
            this.f72229 = objArr2;
        }
        int[] iArr2 = this.f72233;
        int i4 = this.f72228;
        iArr2[i4] = i;
        this.f72229[i4] = obj;
        this.f72228 = i4 + 1;
        return null;
    }

    @Override // l.AbstractC9939, l.InterfaceC23057
    public final Object remove(int i) {
        int iM50372 = m50372(i);
        if (iM50372 == -1) {
            return null;
        }
        Object obj = this.f72229[iM50372];
        int i2 = (this.f72228 - iM50372) - 1;
        int[] iArr = this.f72233;
        int i3 = iM50372 + 1;
        System.arraycopy(iArr, i3, iArr, iM50372, i2);
        Object[] objArr = this.f72229;
        System.arraycopy(objArr, i3, objArr, iM50372, i2);
        int i4 = this.f72228 - 1;
        this.f72228 = i4;
        this.f72229[i4] = null;
        return obj;
    }

    @Override // java.util.Map
    public final InterfaceC5509 keySet() {
        if (this.f72231 == null) {
            this.f72231 = new C2721(this);
        }
        return this.f72231;
    }

    @Override // java.util.Map
    public final InterfaceC21938 values() {
        if (this.f72232 == null) {
            this.f72232 = new C5157(this);
        }
        return this.f72232;
    }

    public final Object clone() {
        try {
            C22311 c22311 = (C22311) super.clone();
            c22311.f72233 = (int[]) this.f72233.clone();
            c22311.f72229 = (Object[]) this.f72229.clone();
            c22311.f72230 = null;
            c22311.f72231 = null;
            c22311.f72232 = null;
            return c22311;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f72233;
        Object[] objArr = this.f72229;
        int i = this.f72228;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeInt(iArr[i2]);
            objectOutputStream.writeObject(objArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f72228;
        int[] iArr = new int[i];
        this.f72233 = iArr;
        Object[] objArr = new Object[i];
        this.f72229 = objArr;
        for (int i2 = 0; i2 < this.f72228; i2++) {
            iArr[i2] = objectInputStream.readInt();
            objArr[i2] = objectInputStream.readObject();
        }
    }
}
