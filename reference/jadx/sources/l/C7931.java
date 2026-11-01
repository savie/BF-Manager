package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public final class C7931 extends AbstractC10090 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float f26046;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public transient Object[] f26047;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f26048;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f26049;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final transient int f26050;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient InterfaceC14842 f26051;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f26052;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f26053;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient int[] f26054;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int f26055;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1849 f26056;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public transient int f26057;

    public C7931(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f26046 = 0.75f;
        int iM25124 = C9927.m25124(0.75f, i);
        this.f26057 = iM25124;
        this.f26050 = iM25124;
        this.f26055 = iM25124 - 1;
        this.f26048 = C9927.m25131(0.75f, iM25124);
        int i2 = this.f26057 + 1;
        this.f26054 = new int[i2];
        this.f26047 = new Object[i2];
    }

    public C7931() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object m20943(int i) {
        int i2;
        Object[] objArr = this.f26047;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f26052--;
        int[] iArr = this.f26054;
        loop0: while (true) {
            int i3 = (i + 1) & this.f26055;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM25125 = C9927.m25125(i2);
                    int i4 = this.f26055;
                    int i5 = iM25125 & i4;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    } else {
                        if (i >= i5 || i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    }
                } else {
                    break loop0;
                }
            }
            iArr[i] = i2;
            objArr[i] = objArr[i3];
            i = i3;
        }
        iArr[i] = 0;
        objArr[i] = null;
        int i6 = this.f26057;
        if (i6 > this.f26050 && this.f26052 < this.f26048 / 4 && i6 > 16) {
            m20945(i6 / 2);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m20938() {
        this.f26053 = false;
        Object[] objArr = this.f26047;
        int i = this.f26057;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.f26052 - 1;
        this.f26052 = i2;
        if (i > this.f26050 && i2 < this.f26048 / 4 && i > 16) {
            m20945(i / 2);
        }
        return obj;
    }

    @Override // l.AbstractC10090, java.util.Map
    public final void putAll(Map map) {
        float f = this.f26046;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, map.size());
            if (iM25124 > this.f26057) {
                m20945(iM25124);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil((map.size() + this.f26052) / f))));
            if (iMin > this.f26057) {
                m20945(iMin);
            }
        }
        super.putAll(map);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m20942(int i) {
        int i2;
        if (i == 0) {
            return this.f26053 ? this.f26057 : -(this.f26057 + 1);
        }
        int[] iArr = this.f26054;
        int iM25125 = C9927.m25125(i) & this.f26055;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return -(iM25125 + 1);
        }
        if (i == i3) {
            return iM25125;
        }
        do {
            iM25125 = (iM25125 + 1) & this.f26055;
            i2 = iArr[iM25125];
            if (i2 == 0) {
                return -(iM25125 + 1);
            }
        } while (i != i2);
        return iM25125;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20939(int i, int i2, Object obj) {
        if (i == this.f26057) {
            this.f26053 = true;
        }
        this.f26054[i] = i2;
        this.f26047[i] = obj;
        int i3 = this.f26052;
        this.f26052 = i3 + 1;
        if (i3 >= this.f26048) {
            m20945(C9927.m25124(this.f26046, i3 + 2));
        }
    }

    @Override // l.AbstractC19262, l.InterfaceC17372
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8944(int i, Object obj) {
        int iM20942 = m20942(i);
        if (iM20942 < 0) {
            m20939((-iM20942) - 1, i, obj);
            return null;
        }
        Object[] objArr = this.f26047;
        Object obj2 = objArr[iM20942];
        objArr[iM20942] = obj;
        return obj2;
    }

    @Override // l.AbstractC19262, l.InterfaceC17372
    public final Object remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f26053) {
                return m20938();
            }
            return null;
        }
        int[] iArr = this.f26054;
        int iM25125 = C9927.m25125(i) & this.f26055;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return null;
        }
        if (i == i3) {
            return m20943(iM25125);
        }
        do {
            iM25125 = (iM25125 + 1) & this.f26055;
            i2 = iArr[iM25125];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return m20943(iM25125);
    }

    @Override // l.InterfaceC17372
    public final Object get(int i) {
        int i2;
        if (i == 0) {
            if (this.f26053) {
                return this.f26047[this.f26057];
            }
            return null;
        }
        int[] iArr = this.f26054;
        int iM25125 = C9927.m25125(i) & this.f26055;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return null;
        }
        if (i == i3) {
            return this.f26047[iM25125];
        }
        do {
            iM25125 = (iM25125 + 1) & this.f26055;
            i2 = iArr[iM25125];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return this.f26047[iM25125];
    }

    @Override // l.AbstractC10090, l.InterfaceC17372, l.InterfaceC9612
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8945(int i) {
        int i2;
        if (i == 0) {
            return this.f26053;
        }
        int[] iArr = this.f26054;
        int iM25125 = C9927.m25125(i) & this.f26055;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM25125 = (iM25125 + 1) & this.f26055;
                i2 = iArr[iM25125];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int[] iArr = this.f26054;
        Object[] objArr = this.f26047;
        if (this.f26053 && C13638.equals(objArr[this.f26057], obj)) {
            return true;
        }
        int i = this.f26057;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (iArr[i2] != 0 && C13638.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m20944(int i, Object obj) {
        int iM20942 = m20942(i);
        if (iM20942 >= 0) {
            return this.f26047[iM20942];
        }
        m20939((-iM20942) - 1, i, obj);
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f26052 == 0) {
            return;
        }
        this.f26052 = 0;
        this.f26053 = false;
        Arrays.fill(this.f26054, 0);
        Arrays.fill(this.f26047, (Object) null);
    }

    @Override // l.AbstractC19262, l.InterfaceC6456
    public final int size() {
        return this.f26052;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f26052 == 0;
    }

    @Override // l.InterfaceC9612, l.InterfaceC4485
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC18660 mo8949() {
        if (this.f26056 == null) {
            this.f26056 = new C22748(this);
        }
        return this.f26056;
    }

    @Override // java.util.Map
    public final InterfaceC14842 keySet() {
        if (this.f26051 == null) {
            this.f26051 = new C12870(this);
        }
        return this.f26051;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f26049 == null) {
            this.f26049 = new C11459(this);
        }
        return this.f26049;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20945(int i) {
        int i2;
        int[] iArr = this.f26054;
        Object[] objArr = this.f26047;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        Object[] objArr2 = new Object[i4];
        int i5 = this.f26057;
        int i6 = this.f26053 ? this.f26052 - 1 : this.f26052;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM25125 = C9927.m25125(i2) & i3;
                if (iArr2[iM25125] != 0) {
                    do {
                        iM25125 = (iM25125 + 1) & i3;
                    } while (iArr2[iM25125] != 0);
                }
                iArr2[iM25125] = iArr[i5];
                objArr2[iM25125] = objArr[i5];
                i6 = i7;
            } else {
                objArr2[i] = objArr[this.f26057];
                this.f26057 = i;
                this.f26055 = i3;
                this.f26048 = C9927.m25131(this.f26046, i);
                this.f26054 = iArr2;
                this.f26047 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C7931 c7931 = (C7931) super.clone();
            c7931.f26051 = null;
            c7931.f26049 = null;
            c7931.f26056 = null;
            c7931.f26053 = this.f26053;
            c7931.f26054 = (int[]) this.f26054.clone();
            c7931.f26047 = (Object[]) this.f26047.clone();
            return c7931;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC10090, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int[] iArr = this.f26054;
        Object[] objArr = this.f26047;
        int i = this.f26053 ? this.f26052 - 1 : this.f26052;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                break;
            }
            while (true) {
                iHashCode = iArr[i2];
                if (iHashCode != 0) {
                    break;
                }
                i2++;
            }
            Object obj = objArr[i2];
            if (this != obj) {
                iHashCode ^= obj == null ? 0 : obj.hashCode();
            }
            i3 += iHashCode;
            i2++;
            i = i4;
        }
        if (!this.f26053) {
            return i3;
        }
        Object obj2 = objArr[this.f26057];
        return i3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f26054;
        Object[] objArr = this.f26047;
        C2285 c2285 = new C2285(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f26052;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM35965 = c2285.m35965();
            objectOutputStream.writeInt(iArr[iM35965]);
            objectOutputStream.writeObject(objArr[iM35965]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f26052;
        float f = this.f26046;
        int iM25124 = C9927.m25124(f, i2);
        this.f26057 = iM25124;
        this.f26048 = C9927.m25131(f, iM25124);
        int i3 = this.f26057;
        this.f26055 = i3 - 1;
        int[] iArr = new int[i3 + 1];
        this.f26054 = iArr;
        Object[] objArr = new Object[i3 + 1];
        this.f26047 = objArr;
        int i4 = this.f26052;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            Object object = objectInputStream.readObject();
            if (i6 == 0) {
                i = this.f26057;
                this.f26053 = true;
            } else {
                int iM25125 = C9927.m25125(i6);
                int i7 = this.f26055;
                while (true) {
                    i = iM25125 & i7;
                    if (iArr[i] != 0) {
                        iM25125 = i + 1;
                        i7 = this.f26055;
                    }
                }
            }
            iArr[i] = i6;
            objArr[i] = object;
            i4 = i5;
        }
    }
}
