package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes3.dex */
public final class C4345 extends AbstractC7000 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f15714;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19261 f15716;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC7811 f15717;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f15718;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient long[] f15719 = C15268.f49916;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient Object[] f15715 = C8338.f27328;

    @Override // l.InterfaceC10310
    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC7767 mo5009() {
        if (this.f15716 == null) {
            this.f15716 = new C17769(this);
        }
        return this.f15716;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m13845(long j) {
        long[] jArr = this.f15719;
        int i = this.f15714;
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

    @Override // l.InterfaceC21499
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object mo13849(long j) {
        long[] jArr = this.f15719;
        int i = this.f15714;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return null;
            }
            if (jArr[i2] == j) {
                return this.f15715[i2];
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f15714;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f15715;
        int i = this.f15714;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f15714 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC21499
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13847(long j) {
        return m13845(j) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f15715;
        int i = this.f15714;
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
        return this.f15714 == 0;
    }

    @Override // l.AbstractC8491
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo13846(long j, Object obj) {
        int iM13845 = m13845(j);
        if (iM13845 != -1) {
            Object[] objArr = this.f15715;
            Object obj2 = objArr[iM13845];
            objArr[iM13845] = obj;
            return obj2;
        }
        int i = this.f15714;
        if (i == this.f15719.length) {
            long[] jArr = new long[i == 0 ? 2 : i * 2];
            Object[] objArr2 = new Object[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                jArr[i2] = this.f15719[i2];
                objArr2[i2] = this.f15715[i2];
                i = i2;
            }
            this.f15719 = jArr;
            this.f15715 = objArr2;
        }
        long[] jArr2 = this.f15719;
        int i3 = this.f15714;
        jArr2[i3] = j;
        this.f15715[i3] = obj;
        this.f15714 = i3 + 1;
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m13848(long j) {
        int iM13845 = m13845(j);
        if (iM13845 == -1) {
            return null;
        }
        Object obj = this.f15715[iM13845];
        int i = (this.f15714 - iM13845) - 1;
        long[] jArr = this.f15719;
        int i2 = iM13845 + 1;
        System.arraycopy(jArr, i2, jArr, iM13845, i);
        Object[] objArr = this.f15715;
        System.arraycopy(objArr, i2, objArr, iM13845, i);
        int i3 = this.f15714 - 1;
        this.f15714 = i3;
        this.f15715[i3] = null;
        return obj;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f15717 == null) {
            this.f15717 = new C3599(this);
        }
        return this.f15717;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f15718 == null) {
            this.f15718 = new C24483(this);
        }
        return this.f15718;
    }

    public final Object clone() {
        try {
            C4345 c4345 = (C4345) super.clone();
            c4345.f15719 = (long[]) this.f15719.clone();
            c4345.f15715 = (Object[]) this.f15715.clone();
            c4345.f15716 = null;
            c4345.f15717 = null;
            c4345.f15718 = null;
            return c4345;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f15719;
        Object[] objArr = this.f15715;
        int i = this.f15714;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeLong(jArr[i2]);
            objectOutputStream.writeObject(objArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f15714;
        long[] jArr = new long[i];
        this.f15719 = jArr;
        Object[] objArr = new Object[i];
        this.f15715 = objArr;
        for (int i2 = 0; i2 < this.f15714; i2++) {
            jArr[i2] = objectInputStream.readLong();
            objArr[i2] = objectInputStream.readObject();
        }
    }
}
