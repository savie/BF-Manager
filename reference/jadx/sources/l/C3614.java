package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C3614 extends AbstractC17850 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int[] f13284;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public transient InterfaceC13535 f13285;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient int f13286;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient int f13287;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f13288;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public transient float[] f13289;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f13290;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC14842 f13291;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int f13292;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC16937 f13293;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f13294;

    public C3614() {
        int iM25124 = C9927.m25124(0.75f, 16);
        this.f13287 = iM25124;
        this.f13286 = iM25124;
        this.f13288 = iM25124 - 1;
        this.f13292 = C9927.m25131(0.75f, iM25124);
        int i = this.f13287 + 1;
        this.f13284 = new int[i];
        this.f13289 = new float[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float m10710(int i) {
        int i2;
        float[] fArr = this.f13289;
        float f = fArr[i];
        this.f13294--;
        int[] iArr = this.f13284;
        loop0: while (true) {
            int i3 = (i + 1) & this.f13288;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM25125 = C9927.m25125(i2);
                    int i4 = this.f13288;
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
            fArr[i] = fArr[i3];
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f13287;
        if (i6 > this.f13286 && this.f13294 < this.f13292 / 4 && i6 > 16) {
            m10714(i6 / 2);
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float m10707() {
        this.f13290 = false;
        float[] fArr = this.f13289;
        int i = this.f13287;
        float f = fArr[i];
        int i2 = this.f13294 - 1;
        this.f13294 = i2;
        if (i > this.f13286 && i2 < this.f13292 / 4 && i > 16) {
            m10714(i / 2);
        }
        return f;
    }

    @Override // l.AbstractC17850, java.util.Map
    public final void putAll(Map map) {
        if (0.75f <= 0.5d) {
            int iM25124 = C9927.m25124(0.75f, map.size());
            if (iM25124 > this.f13287) {
                m10714(iM25124);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil((map.size() + this.f13294) / 0.75f))));
            if (iMin > this.f13287) {
                m10714(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC21378, l.InterfaceC7765
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo10711(float f, int i) {
        int i2;
        if (i == 0) {
            i2 = this.f13290 ? this.f13287 : -(this.f13287 + 1);
        } else {
            int[] iArr = this.f13284;
            int iM25125 = C9927.m25125(i) & this.f13288;
            int i3 = iArr[iM25125];
            if (i3 != 0) {
                if (i != i3) {
                    while (true) {
                        iM25125 = (iM25125 + 1) & this.f13288;
                        int i4 = iArr[iM25125];
                        if (i4 == 0) {
                            i2 = -(iM25125 + 1);
                        } else if (i == i4) {
                        }
                    }
                }
                i2 = iM25125;
            } else {
                i2 = -(iM25125 + 1);
            }
        }
        if (i2 < 0) {
            int i5 = (-i2) - 1;
            if (i5 == this.f13287) {
                this.f13290 = true;
            }
            this.f13284[i5] = i;
            this.f13289[i5] = f;
            int i6 = this.f13294;
            this.f13294 = i6 + 1;
            if (i6 < this.f13292) {
                return 0.0f;
            }
            m10714(C9927.m25124(0.75f, i6 + 2));
            return 0.0f;
        }
        float[] fArr = this.f13289;
        float f2 = fArr[i2];
        fArr[i2] = f;
        return f2;
    }

    @Override // l.AbstractC21378, l.InterfaceC7765
    public final float remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f13290) {
                return m10707();
            }
            return 0.0f;
        }
        int[] iArr = this.f13284;
        int iM25125 = C9927.m25125(i) & this.f13288;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return 0.0f;
        }
        if (i == i3) {
            return m10710(iM25125);
        }
        do {
            iM25125 = (iM25125 + 1) & this.f13288;
            i2 = iArr[iM25125];
            if (i2 == 0) {
                return 0.0f;
            }
        } while (i != i2);
        return m10710(iM25125);
    }

    @Override // l.InterfaceC7765
    public final float get(int i) {
        int i2;
        if (i == 0) {
            if (this.f13290) {
                return this.f13289[this.f13287];
            }
            return 0.0f;
        }
        int[] iArr = this.f13284;
        int iM25125 = C9927.m25125(i) & this.f13288;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return 0.0f;
        }
        if (i == i3) {
            return this.f13289[iM25125];
        }
        do {
            iM25125 = (iM25125 + 1) & this.f13288;
            i2 = iArr[iM25125];
            if (i2 == 0) {
                return 0.0f;
            }
        } while (i != i2);
        return this.f13289[iM25125];
    }

    @Override // l.InterfaceC7765
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo10713(int i) {
        int i2;
        if (i == 0) {
            return this.f13290;
        }
        int[] iArr = this.f13284;
        int iM25125 = C9927.m25125(i) & this.f13288;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM25125 = (iM25125 + 1) & this.f13288;
                i2 = iArr[iM25125];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10712(float f) {
        int[] iArr = this.f13284;
        float[] fArr = this.f13289;
        if (this.f13290 && Float.floatToRawIntBits(fArr[this.f13287]) == Float.floatToRawIntBits(f)) {
            return true;
        }
        int i = this.f13287;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (iArr[i2] != 0 && Float.floatToRawIntBits(fArr[i2]) == Float.floatToRawIntBits(f)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f13294 == 0) {
            return;
        }
        this.f13294 = 0;
        this.f13290 = false;
        Arrays.fill(this.f13284, 0);
    }

    @Override // l.InterfaceC6456
    public final int size() {
        return this.f13294;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f13294 == 0;
    }

    @Override // l.InterfaceC12704
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18660 mo10715() {
        if (this.f13293 == null) {
            this.f13293 = new C2203(this);
        }
        return this.f13293;
    }

    @Override // java.util.Map
    public final InterfaceC14842 keySet() {
        if (this.f13291 == null) {
            this.f13291 = new C4320(this);
        }
        return this.f13291;
    }

    @Override // java.util.Map
    public final InterfaceC13535 values() {
        if (this.f13285 == null) {
            this.f13285 = new C23993(this);
        }
        return this.f13285;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m10714(int i) {
        int i2;
        int[] iArr = this.f13284;
        float[] fArr = this.f13289;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        float[] fArr2 = new float[i4];
        int i5 = this.f13287;
        int i6 = this.f13290 ? this.f13294 - 1 : this.f13294;
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
                fArr2[iM25125] = fArr[i5];
                i6 = i7;
            } else {
                fArr2[i] = fArr[this.f13287];
                this.f13287 = i;
                this.f13288 = i3;
                this.f13292 = C9927.m25131(0.75f, i);
                this.f13284 = iArr2;
                this.f13289 = fArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C3614 c3614 = (C3614) super.clone();
            c3614.f13291 = null;
            c3614.f13285 = null;
            c3614.f13293 = null;
            c3614.f13290 = this.f13290;
            c3614.f13284 = (int[]) this.f13284.clone();
            c3614.f13289 = (float[]) this.f13289.clone();
            return c3614;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f13284;
        float[] fArr = this.f13289;
        int i2 = this.f13290 ? this.f13294 - 1 : this.f13294;
        int iFloatToRawIntBits = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                break;
            }
            while (true) {
                i = iArr[i3];
                if (i == 0) {
                    i3++;
                }
            }
            iFloatToRawIntBits += i ^ Float.floatToRawIntBits(fArr[i3]);
            i3++;
            i2 = i4;
        }
        return this.f13290 ? Float.floatToRawIntBits(fArr[this.f13287]) + iFloatToRawIntBits : iFloatToRawIntBits;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f13284;
        float[] fArr = this.f13289;
        C14821 c14821 = new C14821(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f13294;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM13969 = c14821.m13969();
            objectOutputStream.writeInt(iArr[iM13969]);
            objectOutputStream.writeFloat(fArr[iM13969]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int iM25124 = C9927.m25124(0.75f, this.f13294);
        this.f13287 = iM25124;
        this.f13292 = C9927.m25131(0.75f, iM25124);
        int i2 = this.f13287;
        this.f13288 = i2 - 1;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        this.f13284 = iArr;
        float[] fArr = new float[i3];
        this.f13289 = fArr;
        int i4 = this.f13294;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            float f = objectInputStream.readFloat();
            if (i6 == 0) {
                i = this.f13287;
                this.f13290 = true;
            } else {
                int iM25125 = C9927.m25125(i6);
                int i7 = this.f13288;
                while (true) {
                    i = iM25125 & i7;
                    if (iArr[i] != 0) {
                        iM25125 = i + 1;
                        i7 = this.f13288;
                    }
                }
            }
            iArr[i] = i6;
            fArr[i] = f;
            i4 = i5;
        }
    }
}
