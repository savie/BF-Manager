package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public class C7043 extends AbstractC12769 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23232;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient Object[] f23233;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC22510 f23234;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC7767 f23235;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f23236;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Object[] f23237;

    public C7043() {
        Object[] objArr = C8338.f27328;
        this.f23237 = objArr;
        this.f23233 = objArr;
    }

    @Override // l.InterfaceC19526
    /* JADX INFO: renamed from: ۧ᩷ */
    public final InterfaceC7767 mo12503() {
        if (this.f23234 == null) {
            this.f23234 = new C0331(this);
        }
        return this.f23234;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int m19368(Object obj) {
        Object[] objArr = this.f23237;
        int i = this.f23232;
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

    @Override // l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        Object[] objArr = this.f23237;
        int i = this.f23232;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return null;
            }
            if (C17359.equals(objArr[i2], obj)) {
                return this.f23233[i2];
            }
            i = i2;
        }
    }

    @Override // l.AbstractC15006, l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f23232;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f23237;
        Object[] objArr2 = this.f23233;
        int i = this.f23232;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                objArr2[i2] = null;
                i = i2;
            } else {
                this.f23232 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        return m19368(obj) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f23233;
        int i = this.f23232;
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
        return this.f23232 == 0;
    }

    @Override // l.InterfaceC19526, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iM19368 = m19368(obj);
        if (iM19368 != -1) {
            Object[] objArr = this.f23233;
            Object obj3 = objArr[iM19368];
            objArr[iM19368] = obj2;
            return obj3;
        }
        int i = this.f23232;
        if (i == this.f23237.length) {
            Object[] objArr2 = new Object[i == 0 ? 2 : i * 2];
            Object[] objArr3 = new Object[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr2[i2] = this.f23237[i2];
                objArr3[i2] = this.f23233[i2];
                i = i2;
            }
            this.f23237 = objArr2;
            this.f23233 = objArr3;
        }
        Object[] objArr4 = this.f23237;
        int i3 = this.f23232;
        objArr4[i3] = obj;
        this.f23233[i3] = obj2;
        this.f23232 = i3 + 1;
        return null;
    }

    @Override // l.InterfaceC19526, java.util.Map
    public final Object remove(Object obj) {
        int iM19368 = m19368(obj);
        if (iM19368 == -1) {
            return null;
        }
        Object obj2 = this.f23233[iM19368];
        int i = (this.f23232 - iM19368) - 1;
        Object[] objArr = this.f23237;
        int i2 = iM19368 + 1;
        System.arraycopy(objArr, i2, objArr, iM19368, i);
        Object[] objArr2 = this.f23233;
        System.arraycopy(objArr2, i2, objArr2, iM19368, i);
        int i3 = this.f23232 - 1;
        this.f23232 = i3;
        this.f23237[i3] = null;
        this.f23233[i3] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f23235 == null) {
            this.f23235 = new C10025(this);
        }
        return this.f23235;
    }

    @Override // java.util.Map
    public final InterfaceC21938 values() {
        if (this.f23236 == null) {
            this.f23236 = new C8534(this);
        }
        return this.f23236;
    }

    public final Object clone() {
        try {
            C7043 c7043 = (C7043) super.clone();
            c7043.f23237 = (Object[]) this.f23237.clone();
            c7043.f23233 = (Object[]) this.f23233.clone();
            c7043.f23234 = null;
            c7043.f23235 = null;
            c7043.f23236 = null;
            return c7043;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f23237;
        Object[] objArr2 = this.f23233;
        int i = this.f23232;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeObject(objArr[i2]);
            objectOutputStream.writeObject(objArr2[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f23232;
        Object[] objArr = new Object[i];
        this.f23237 = objArr;
        Object[] objArr2 = new Object[i];
        this.f23233 = objArr2;
        for (int i2 = 0; i2 < this.f23232; i2++) {
            objArr[i2] = objectInputStream.readObject();
            objArr2[i2] = objectInputStream.readObject();
        }
    }
}
