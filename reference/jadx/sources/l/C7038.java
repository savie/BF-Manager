package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7038 extends AbstractC16024 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC18928 f23644;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC8450 f23646;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f23647;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f23648;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient long[] f23649 = C11272.f38094;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient Object[] f23645 = C7681.f25444;

    @Override // l.InterfaceC19739
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC18660 mo18878() {
        if (this.f23646 == null) {
            this.f23646 = new C14095(this);
        }
        return this.f23646;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int m18874(long j) {
        long[] jArr = this.f23649;
        int i = this.f23647;
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

    @Override // l.InterfaceC15506
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object mo18880(long j) {
        long[] jArr = this.f23649;
        int i = this.f23647;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return null;
            }
            if (jArr[i2] == j) {
                return this.f23645[i2];
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC6456
    public final int size() {
        return this.f23647;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f23645;
        int i = this.f23647;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f23647 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC15506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo18877(long j) {
        return m18874(j) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f23645;
        int i = this.f23647;
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
        return this.f23647 == 0;
    }

    @Override // l.AbstractC20962
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo18876(long j, Object obj) {
        int iM18874 = m18874(j);
        if (iM18874 != -1) {
            Object[] objArr = this.f23645;
            Object obj2 = objArr[iM18874];
            objArr[iM18874] = obj;
            return obj2;
        }
        int i = this.f23647;
        if (i == this.f23649.length) {
            long[] jArr = new long[i == 0 ? 2 : i * 2];
            Object[] objArr2 = new Object[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                jArr[i2] = this.f23649[i2];
                objArr2[i2] = this.f23645[i2];
                i = i2;
            }
            this.f23649 = jArr;
            this.f23645 = objArr2;
        }
        long[] jArr2 = this.f23649;
        int i3 = this.f23647;
        jArr2[i3] = j;
        this.f23645[i3] = obj;
        this.f23647 = i3 + 1;
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m18879(long j) {
        int iM18874 = m18874(j);
        if (iM18874 == -1) {
            return null;
        }
        Object obj = this.f23645[iM18874];
        int i = (this.f23647 - iM18874) - 1;
        long[] jArr = this.f23649;
        int i2 = iM18874 + 1;
        System.arraycopy(jArr, i2, jArr, iM18874, i);
        Object[] objArr = this.f23645;
        System.arraycopy(objArr, i2, objArr, iM18874, i);
        int i3 = this.f23647 - 1;
        this.f23647 = i3;
        this.f23645[i3] = null;
        return obj;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f23644 == null) {
            this.f23644 = new C5627(this);
        }
        return this.f23644;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f23648 == null) {
            this.f23648 = new C4215(this);
        }
        return this.f23648;
    }

    public final Object clone() {
        try {
            C7038 c7038 = (C7038) super.clone();
            c7038.f23649 = (long[]) this.f23649.clone();
            c7038.f23645 = (Object[]) this.f23645.clone();
            c7038.f23646 = null;
            c7038.f23644 = null;
            c7038.f23648 = null;
            return c7038;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f23649;
        Object[] objArr = this.f23645;
        int i = this.f23647;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeLong(jArr[i2]);
            objectOutputStream.writeObject(objArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f23647;
        long[] jArr = new long[i];
        this.f23649 = jArr;
        Object[] objArr = new Object[i];
        this.f23645 = objArr;
        for (int i2 = 0; i2 < this.f23647; i2++) {
            jArr[i2] = objectInputStream.readLong();
            objArr[i2] = objectInputStream.readObject();
        }
    }
}
