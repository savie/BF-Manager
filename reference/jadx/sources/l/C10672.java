package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10672 extends AbstractC7973 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC17726 f36409;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f36410;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC10131 f36411;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f36412;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int[] f36413;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient int f36414;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int[] f36415;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public transient int f36416;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f36417;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC14842 f36418;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient boolean f36419;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final transient int f36420;

    public C10672(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f36417 = 0.75f;
        int iM25124 = C9927.m25124(0.75f, i);
        this.f36416 = iM25124;
        this.f36420 = iM25124;
        this.f36412 = iM25124 - 1;
        this.f36414 = C9927.m25131(0.75f, iM25124);
        int i3 = this.f36416 + 1;
        this.f36415 = new int[i3];
        this.f36413 = new int[i3];
    }

    public C10672() {
        this(16, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int m26876(int i) {
        int i2;
        int[] iArr = this.f36413;
        int i3 = iArr[i];
        this.f36410--;
        int[] iArr2 = this.f36415;
        loop0: while (true) {
            int i4 = (i + 1) & this.f36412;
            while (true) {
                i2 = iArr2[i4];
                if (i2 != 0) {
                    int iM25125 = C9927.m25125(i2);
                    int i5 = this.f36412;
                    int i6 = iM25125 & i5;
                    if (i > i4) {
                        if (i >= i6 && i6 > i4) {
                            break;
                        }
                        i4 = (i4 + 1) & i5;
                    } else {
                        if (i >= i6 || i6 > i4) {
                            break;
                        }
                        i4 = (i4 + 1) & i5;
                    }
                } else {
                    break loop0;
                }
            }
            iArr2[i] = i2;
            iArr[i] = iArr[i4];
            i = i4;
        }
        iArr2[i] = 0;
        int i7 = this.f36416;
        if (i7 > this.f36420 && this.f36410 < this.f36414 / 4 && i7 > 16) {
            m26881(i7 / 2);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int m26873() {
        this.f36419 = false;
        int[] iArr = this.f36413;
        int i = this.f36416;
        int i2 = iArr[i];
        int i3 = this.f36410 - 1;
        this.f36410 = i3;
        if (i > this.f36420 && i3 < this.f36414 / 4 && i > 16) {
            m26881(i / 2);
        }
        return i2;
    }

    @Override // l.AbstractC7973, java.util.Map
    public final void putAll(Map map) {
        float f = this.f36417;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, map.size());
            if (iM25124 > this.f36416) {
                m26881(iM25124);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil((map.size() + this.f36410) / f))));
            if (iMin > this.f36416) {
                m26881(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC18556, l.InterfaceC22666
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo26878(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = this.f36419 ? this.f36416 : -(this.f36416 + 1);
        } else {
            int[] iArr = this.f36415;
            int iM25125 = C9927.m25125(i) & this.f36412;
            int i4 = iArr[iM25125];
            if (i4 != 0) {
                if (i != i4) {
                    while (true) {
                        iM25125 = (iM25125 + 1) & this.f36412;
                        int i5 = iArr[iM25125];
                        if (i5 == 0) {
                            i3 = -(iM25125 + 1);
                        } else if (i == i5) {
                        }
                    }
                }
                i3 = iM25125;
            } else {
                i3 = -(iM25125 + 1);
            }
        }
        if (i3 < 0) {
            int i6 = (-i3) - 1;
            if (i6 == this.f36416) {
                this.f36419 = true;
            }
            this.f36415[i6] = i;
            this.f36413[i6] = i2;
            int i7 = this.f36410;
            this.f36410 = i7 + 1;
            if (i7 >= this.f36414) {
                m26881(C9927.m25124(this.f36417, i7 + 2));
            }
            return this.f59037;
        }
        int[] iArr2 = this.f36413;
        int i8 = iArr2[i3];
        iArr2[i3] = i2;
        return i8;
    }

    public final int remove(int i) {
        int i2;
        if (i == 0) {
            return this.f36419 ? m26873() : this.f59037;
        }
        int[] iArr = this.f36415;
        int iM25125 = C9927.m25125(i) & this.f36412;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return this.f59037;
        }
        if (i == i3) {
            return m26876(iM25125);
        }
        do {
            iM25125 = (iM25125 + 1) & this.f36412;
            i2 = iArr[iM25125];
            if (i2 == 0) {
                return this.f59037;
            }
        } while (i != i2);
        return m26876(iM25125);
    }

    @Override // l.InterfaceC22666
    public final int get(int i) {
        int i2;
        if (i == 0) {
            return this.f36419 ? this.f36413[this.f36416] : this.f59037;
        }
        int[] iArr = this.f36415;
        int iM25125 = C9927.m25125(i) & this.f36412;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return this.f59037;
        }
        if (i == i3) {
            return this.f36413[iM25125];
        }
        do {
            iM25125 = (iM25125 + 1) & this.f36412;
            i2 = iArr[iM25125];
            if (i2 == 0) {
                return this.f59037;
            }
        } while (i != i2);
        return this.f36413[iM25125];
    }

    @Override // l.InterfaceC22666
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo26879(int i) {
        int i2;
        if (i == 0) {
            return this.f36419;
        }
        int[] iArr = this.f36415;
        int iM25125 = C9927.m25125(i) & this.f36412;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM25125 = (iM25125 + 1) & this.f36412;
                i2 = iArr[iM25125];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m26877(int i) {
        int[] iArr = this.f36415;
        int[] iArr2 = this.f36413;
        if (this.f36419 && iArr2[this.f36416] == i) {
            return true;
        }
        int i2 = this.f36416;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return false;
            }
            if (iArr[i3] != 0 && iArr2[i3] == i) {
                return true;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m26883(int i) {
        int i2;
        if (i == 0) {
            if (this.f36419) {
                return this.f36413[this.f36416];
            }
            return -1;
        }
        int[] iArr = this.f36415;
        int iM25125 = C9927.m25125(i) & this.f36412;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return -1;
        }
        if (i == i3) {
            return this.f36413[iM25125];
        }
        do {
            iM25125 = (iM25125 + 1) & this.f36412;
            i2 = iArr[iM25125];
            if (i2 == 0) {
                return -1;
            }
        } while (i != i2);
        return this.f36413[iM25125];
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f36410 == 0) {
            return;
        }
        this.f36410 = 0;
        this.f36419 = false;
        Arrays.fill(this.f36415, 0);
    }

    @Override // l.InterfaceC6456
    public final int size() {
        return this.f36410;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f36410 == 0;
    }

    @Override // l.InterfaceC18432
    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18660 mo26882() {
        if (this.f36409 == null) {
            this.f36409 = new C0087(this);
        }
        return this.f36409;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f36418 == null) {
            this.f36418 = new C20549(this);
        }
        return this.f36418;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f36411 == null) {
            this.f36411 = new C7849(this);
        }
        return this.f36411;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m26880() {
        float f = this.f36410;
        float f2 = this.f36417;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f36416 || this.f36410 > C9927.m25131(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m26881(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m26881(int i) {
        int i2;
        int[] iArr = this.f36415;
        int[] iArr2 = this.f36413;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int i5 = this.f36416;
        int i6 = this.f36419 ? this.f36410 - 1 : this.f36410;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM25125 = C9927.m25125(i2) & i3;
                if (iArr3[iM25125] != 0) {
                    do {
                        iM25125 = (iM25125 + 1) & i3;
                    } while (iArr3[iM25125] != 0);
                }
                iArr3[iM25125] = iArr[i5];
                iArr4[iM25125] = iArr2[i5];
                i6 = i7;
            } else {
                iArr4[i] = iArr2[this.f36416];
                this.f36416 = i;
                this.f36412 = i3;
                this.f36414 = C9927.m25131(this.f36417, i);
                this.f36415 = iArr3;
                this.f36413 = iArr4;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C10672 c10672 = (C10672) super.clone();
            c10672.f36418 = null;
            c10672.f36411 = null;
            c10672.f36409 = null;
            c10672.f36419 = this.f36419;
            c10672.f36415 = (int[]) this.f36415.clone();
            c10672.f36413 = (int[]) this.f36413.clone();
            return c10672;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f36415;
        int[] iArr2 = this.f36413;
        int i2 = this.f36419 ? this.f36410 - 1 : this.f36410;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                break;
            }
            while (true) {
                i = iArr[i4];
                if (i == 0) {
                    i4++;
                }
            }
            i3 += i ^ iArr2[i4];
            i4++;
            i2 = i5;
        }
        return this.f36419 ? i3 + iArr2[this.f36416] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f36415;
        int[] iArr2 = this.f36413;
        C19138 c19138 = new C19138(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f36410;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM38482 = c19138.m38482();
            objectOutputStream.writeInt(iArr[iM38482]);
            objectOutputStream.writeInt(iArr2[iM38482]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f36410;
        float f = this.f36417;
        int iM25124 = C9927.m25124(f, i2);
        this.f36416 = iM25124;
        this.f36414 = C9927.m25131(f, iM25124);
        int i3 = this.f36416;
        this.f36412 = i3 - 1;
        int[] iArr = new int[i3 + 1];
        this.f36415 = iArr;
        int[] iArr2 = new int[i3 + 1];
        this.f36413 = iArr2;
        int i4 = this.f36410;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            int i7 = objectInputStream.readInt();
            if (i6 == 0) {
                i = this.f36416;
                this.f36419 = true;
            } else {
                int iM25125 = C9927.m25125(i6);
                int i8 = this.f36412;
                while (true) {
                    i = iM25125 & i8;
                    if (iArr[i] != 0) {
                        iM25125 = i + 1;
                        i8 = this.f36412;
                    }
                }
            }
            iArr[i] = i6;
            iArr2[i] = i7;
            i4 = i5;
        }
    }
}
