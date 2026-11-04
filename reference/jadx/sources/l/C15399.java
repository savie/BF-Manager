package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15399 extends AbstractC18890 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float f50192;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient int f50193;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public transient int f50194;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public transient int[] f50195;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int[] f50196;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f50197;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final transient int f50198;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int f50199;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1340 f50200;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0179 f50201;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC5509 f50202;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient boolean f50203;

    public C15399(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f50192 = 0.75f;
        int iM30014 = C11972.m30014(0.75f, i);
        this.f50194 = iM30014;
        this.f50198 = iM30014;
        this.f50199 = iM30014 - 1;
        this.f50193 = C11972.m30029(0.75f, iM30014);
        int i3 = this.f50194 + 1;
        this.f50196 = new int[i3];
        this.f50195 = new int[i3];
    }

    public C15399() {
        this(16, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int m36867(int i) {
        int i2;
        int[] iArr = this.f50195;
        int i3 = iArr[i];
        this.f50197--;
        int[] iArr2 = this.f50196;
        loop0: while (true) {
            int i4 = (i + 1) & this.f50199;
            while (true) {
                i2 = iArr2[i4];
                if (i2 != 0) {
                    int iM30015 = C11972.m30015(i2);
                    int i5 = this.f50199;
                    int i6 = iM30015 & i5;
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
        int i7 = this.f50194;
        if (i7 > this.f50198 && this.f50197 < this.f50193 / 4 && i7 > 16) {
            m36869(i7 / 2);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m36864() {
        this.f50203 = false;
        int[] iArr = this.f50195;
        int i = this.f50194;
        int i2 = iArr[i];
        int i3 = this.f50197 - 1;
        this.f50197 = i3;
        if (i > this.f50198 && i3 < this.f50193 / 4 && i > 16) {
            m36869(i / 2);
        }
        return i2;
    }

    @Override // l.AbstractC18890, java.util.Map
    public final void putAll(Map map) {
        float f = this.f50192;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, map.size());
            if (iM30014 > this.f50194) {
                m36869(iM30014);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil((map.size() + this.f50197) / f))));
            if (iMin > this.f50194) {
                m36869(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC7703, l.InterfaceC14348
    /* JADX INFO: renamed from: ۙ */
    public final int mo20978(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = this.f50203 ? this.f50194 : -(this.f50194 + 1);
        } else {
            int[] iArr = this.f50196;
            int iM30015 = C11972.m30015(i) & this.f50199;
            int i4 = iArr[iM30015];
            if (i4 != 0) {
                if (i != i4) {
                    while (true) {
                        iM30015 = (iM30015 + 1) & this.f50199;
                        int i5 = iArr[iM30015];
                        if (i5 == 0) {
                            i3 = -(iM30015 + 1);
                        } else if (i == i5) {
                        }
                    }
                }
                i3 = iM30015;
            } else {
                i3 = -(iM30015 + 1);
            }
        }
        if (i3 < 0) {
            int i6 = (-i3) - 1;
            if (i6 == this.f50194) {
                this.f50203 = true;
            }
            this.f50196[i6] = i;
            this.f50195[i6] = i2;
            int i7 = this.f50197;
            this.f50197 = i7 + 1;
            if (i7 >= this.f50193) {
                m36869(C11972.m30014(this.f50192, i7 + 2));
            }
            return this.f25411;
        }
        int[] iArr2 = this.f50195;
        int i8 = iArr2[i3];
        iArr2[i3] = i2;
        return i8;
    }

    public final int remove(int i) {
        int i2;
        if (i == 0) {
            return this.f50203 ? m36864() : this.f25411;
        }
        int[] iArr = this.f50196;
        int iM30015 = C11972.m30015(i) & this.f50199;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return this.f25411;
        }
        if (i == i3) {
            return m36867(iM30015);
        }
        do {
            iM30015 = (iM30015 + 1) & this.f50199;
            i2 = iArr[iM30015];
            if (i2 == 0) {
                return this.f25411;
            }
        } while (i != i2);
        return m36867(iM30015);
    }

    @Override // l.InterfaceC14348
    public final int get(int i) {
        int i2;
        if (i == 0) {
            return this.f50203 ? this.f50195[this.f50194] : this.f25411;
        }
        int[] iArr = this.f50196;
        int iM30015 = C11972.m30015(i) & this.f50199;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return this.f25411;
        }
        if (i == i3) {
            return this.f50195[iM30015];
        }
        do {
            iM30015 = (iM30015 + 1) & this.f50199;
            i2 = iArr[iM30015];
            if (i2 == 0) {
                return this.f25411;
            }
        } while (i != i2);
        return this.f50195[iM30015];
    }

    @Override // l.InterfaceC14348
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo34770(int i) {
        int i2;
        if (i == 0) {
            return this.f50203;
        }
        int[] iArr = this.f50196;
        int iM30015 = C11972.m30015(i) & this.f50199;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM30015 = (iM30015 + 1) & this.f50199;
                i2 = iArr[iM30015];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m36871(int i) {
        int[] iArr = this.f50196;
        int[] iArr2 = this.f50195;
        if (this.f50203 && iArr2[this.f50194] == i) {
            return true;
        }
        int i2 = this.f50194;
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m36868(int i, int i2) {
        int i3;
        if (i == 0) {
            if (this.f50203) {
                return this.f50195[this.f50194];
            }
        } else {
            int[] iArr = this.f50196;
            int iM30015 = C11972.m30015(i) & this.f50199;
            int i4 = iArr[iM30015];
            if (i4 != 0) {
                if (i == i4) {
                    return this.f50195[iM30015];
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f50199;
                    i3 = iArr[iM30015];
                    if (i3 == 0) {
                    }
                } while (i != i3);
                return this.f50195[iM30015];
            }
        }
        return i2;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f50197 == 0) {
            return;
        }
        this.f50197 = 0;
        this.f50203 = false;
        Arrays.fill(this.f50196, 0);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f50197;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f50197 == 0;
    }

    @Override // l.InterfaceC7637
    /* JADX INFO: renamed from: ۢۙ */
    public final InterfaceC7767 mo20854() {
        if (this.f50201 == null) {
            this.f50201 = new C4959(this);
        }
        return this.f50201;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f50202 == null) {
            this.f50202 = new C8382(this);
        }
        return this.f50202;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f50200 == null) {
            this.f50200 = new C18824(this);
        }
        return this.f50200;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m36870() {
        float f = this.f50197;
        float f2 = this.f50192;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f50194 || this.f50197 > C11972.m30029(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m36869(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36869(int i) {
        int i2;
        int[] iArr = this.f50196;
        int[] iArr2 = this.f50195;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int i5 = this.f50194;
        int i6 = this.f50203 ? this.f50197 - 1 : this.f50197;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM30015 = C11972.m30015(i2) & i3;
                if (iArr3[iM30015] != 0) {
                    do {
                        iM30015 = (iM30015 + 1) & i3;
                    } while (iArr3[iM30015] != 0);
                }
                iArr3[iM30015] = iArr[i5];
                iArr4[iM30015] = iArr2[i5];
                i6 = i7;
            } else {
                iArr4[i] = iArr2[this.f50194];
                this.f50194 = i;
                this.f50199 = i3;
                this.f50193 = C11972.m30029(this.f50192, i);
                this.f50196 = iArr3;
                this.f50195 = iArr4;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C15399 c15399 = (C15399) super.clone();
            c15399.f50202 = null;
            c15399.f50200 = null;
            c15399.f50201 = null;
            c15399.f50203 = this.f50203;
            c15399.f50196 = (int[]) this.f50196.clone();
            c15399.f50195 = (int[]) this.f50195.clone();
            return c15399;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f50196;
        int[] iArr2 = this.f50195;
        int i2 = this.f50203 ? this.f50197 - 1 : this.f50197;
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
        return this.f50203 ? i3 + iArr2[this.f50194] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f50196;
        int[] iArr2 = this.f50195;
        C9873 c9873 = new C9873(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f50197;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM50066 = c9873.m50066();
            objectOutputStream.writeInt(iArr[iM50066]);
            objectOutputStream.writeInt(iArr2[iM50066]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f50197;
        float f = this.f50192;
        int iM30014 = C11972.m30014(f, i2);
        this.f50194 = iM30014;
        this.f50193 = C11972.m30029(f, iM30014);
        int i3 = this.f50194;
        this.f50199 = i3 - 1;
        int[] iArr = new int[i3 + 1];
        this.f50196 = iArr;
        int[] iArr2 = new int[i3 + 1];
        this.f50195 = iArr2;
        int i4 = this.f50197;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            int i7 = objectInputStream.readInt();
            if (i6 == 0) {
                i = this.f50194;
                this.f50203 = true;
            } else {
                int iM30015 = C11972.m30015(i6);
                int i8 = this.f50199;
                while (true) {
                    i = iM30015 & i8;
                    if (iArr[i] != 0) {
                        iM30015 = i + 1;
                        i8 = this.f50199;
                    }
                }
            }
            iArr[i] = i6;
            iArr2[i] = i7;
            i4 = i5;
        }
    }
}
