package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes5.dex */
public class C15818 extends AbstractC23867 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC18660 f51190;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient Object[] f51191;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC17228 f51192;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51193;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f51194;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Object[] f51195;

    public C15818() {
        Object[] objArr = C7681.f25444;
        this.f51195 = objArr;
        this.f51191 = objArr;
    }

    @Override // l.InterfaceC5939
    /* JADX INFO: renamed from: ۜܰ */
    public final InterfaceC18660 mo16212() {
        if (this.f51192 == null) {
            this.f51192 = new C17933(this);
        }
        return this.f51192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int m37599(Object obj) {
        Object[] objArr = this.f51195;
        int i = this.f51193;
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

    @Override // l.InterfaceC6456
    public final Object get(Object obj) {
        Object[] objArr = this.f51195;
        int i = this.f51193;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return null;
            }
            if (C13638.equals(objArr[i2], obj)) {
                return this.f51191[i2];
            }
            i = i2;
        }
    }

    @Override // l.AbstractC11167, l.InterfaceC6456
    public final int size() {
        return this.f51193;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f51195;
        Object[] objArr2 = this.f51191;
        int i = this.f51193;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                objArr2[i2] = null;
                i = i2;
            } else {
                this.f51193 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        return m37599(obj) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f51191;
        int i = this.f51193;
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
        return this.f51193 == 0;
    }

    @Override // l.InterfaceC5939, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iM37599 = m37599(obj);
        if (iM37599 != -1) {
            Object[] objArr = this.f51191;
            Object obj3 = objArr[iM37599];
            objArr[iM37599] = obj2;
            return obj3;
        }
        int i = this.f51193;
        if (i == this.f51195.length) {
            Object[] objArr2 = new Object[i == 0 ? 2 : i * 2];
            Object[] objArr3 = new Object[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr2[i2] = this.f51195[i2];
                objArr3[i2] = this.f51191[i2];
                i = i2;
            }
            this.f51195 = objArr2;
            this.f51191 = objArr3;
        }
        Object[] objArr4 = this.f51195;
        int i3 = this.f51193;
        objArr4[i3] = obj;
        this.f51191[i3] = obj2;
        this.f51193 = i3 + 1;
        return null;
    }

    @Override // l.InterfaceC5939, java.util.Map
    public final Object remove(Object obj) {
        int iM37599 = m37599(obj);
        if (iM37599 == -1) {
            return null;
        }
        Object obj2 = this.f51191[iM37599];
        int i = (this.f51193 - iM37599) - 1;
        Object[] objArr = this.f51195;
        int i2 = iM37599 + 1;
        System.arraycopy(objArr, i2, objArr, iM37599, i);
        Object[] objArr2 = this.f51191;
        System.arraycopy(objArr2, i2, objArr2, iM37599, i);
        int i3 = this.f51193 - 1;
        this.f51193 = i3;
        this.f51195[i3] = null;
        this.f51191[i3] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f51190 == null) {
            this.f51190 = new C19345(this);
        }
        return this.f51190;
    }

    @Override // java.util.Map
    public final InterfaceC0624 values() {
        if (this.f51194 == null) {
            this.f51194 = new C20756(this);
        }
        return this.f51194;
    }

    public final Object clone() {
        try {
            C15818 c15818 = (C15818) super.clone();
            c15818.f51195 = (Object[]) this.f51195.clone();
            c15818.f51191 = (Object[]) this.f51191.clone();
            c15818.f51192 = null;
            c15818.f51190 = null;
            c15818.f51194 = null;
            return c15818;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f51195;
        Object[] objArr2 = this.f51191;
        int i = this.f51193;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeObject(objArr[i2]);
            objectOutputStream.writeObject(objArr2[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f51193;
        Object[] objArr = new Object[i];
        this.f51195 = objArr;
        Object[] objArr2 = new Object[i];
        this.f51191 = objArr2;
        for (int i2 = 0; i2 < this.f51193; i2++) {
            objArr[i2] = objectInputStream.readObject();
            objArr2[i2] = objectInputStream.readObject();
        }
    }
}
