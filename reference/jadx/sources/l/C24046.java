package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes2.dex */
public final class C24046 extends AbstractC0245 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC5509 f77773;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient int f77774;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public transient float[] f77775;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int f77776;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public transient InterfaceC17572 f77777;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f77778;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final transient int f77779;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f77780;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int[] f77781;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient int f77782;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21808 f77783;

    public C24046() {
        int iM30014 = C11972.m30014(0.75f, 16);
        this.f77774 = iM30014;
        this.f77779 = iM30014;
        this.f77776 = iM30014 - 1;
        this.f77782 = C11972.m30029(0.75f, iM30014);
        int i = this.f77774 + 1;
        this.f77781 = new int[i];
        this.f77775 = new float[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float m53599(int i) {
        int i2;
        float[] fArr = this.f77775;
        float f = fArr[i];
        this.f77778--;
        int[] iArr = this.f77781;
        loop0: while (true) {
            int i3 = (i + 1) & this.f77776;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM30015 = C11972.m30015(i2);
                    int i4 = this.f77776;
                    int i5 = iM30015 & i4;
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
        int i6 = this.f77774;
        if (i6 > this.f77779 && this.f77778 < this.f77782 / 4 && i6 > 16) {
            m53601(i6 / 2);
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float m53596() {
        this.f77780 = false;
        float[] fArr = this.f77775;
        int i = this.f77774;
        float f = fArr[i];
        int i2 = this.f77778 - 1;
        this.f77778 = i2;
        if (i > this.f77779 && i2 < this.f77782 / 4 && i > 16) {
            m53601(i / 2);
        }
        return f;
    }

    @Override // l.AbstractC0245, java.util.Map
    public final void putAll(Map map) {
        if (0.75f <= 0.5d) {
            int iM30014 = C11972.m30014(0.75f, map.size());
            if (iM30014 > this.f77774) {
                m53601(iM30014);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil((map.size() + this.f77778) / 0.75f))));
            if (iMin > this.f77774) {
                m53601(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC18144, l.InterfaceC3007
    /* JADX INFO: renamed from: ۙ */
    public final float mo9814(float f, int i) {
        int i2;
        if (i == 0) {
            i2 = this.f77780 ? this.f77774 : -(this.f77774 + 1);
        } else {
            int[] iArr = this.f77781;
            int iM30015 = C11972.m30015(i) & this.f77776;
            int i3 = iArr[iM30015];
            if (i3 != 0) {
                if (i != i3) {
                    while (true) {
                        iM30015 = (iM30015 + 1) & this.f77776;
                        int i4 = iArr[iM30015];
                        if (i4 == 0) {
                            i2 = -(iM30015 + 1);
                        } else if (i == i4) {
                        }
                    }
                }
                i2 = iM30015;
            } else {
                i2 = -(iM30015 + 1);
            }
        }
        if (i2 < 0) {
            int i5 = (-i2) - 1;
            if (i5 == this.f77774) {
                this.f77780 = true;
            }
            this.f77781[i5] = i;
            this.f77775[i5] = f;
            int i6 = this.f77778;
            this.f77778 = i6 + 1;
            if (i6 < this.f77782) {
                return 0.0f;
            }
            m53601(C11972.m30014(0.75f, i6 + 2));
            return 0.0f;
        }
        float[] fArr = this.f77775;
        float f2 = fArr[i2];
        fArr[i2] = f;
        return f2;
    }

    @Override // l.AbstractC18144, l.InterfaceC3007
    public final float remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f77780) {
                return m53596();
            }
            return 0.0f;
        }
        int[] iArr = this.f77781;
        int iM30015 = C11972.m30015(i) & this.f77776;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return 0.0f;
        }
        if (i == i3) {
            return m53599(iM30015);
        }
        do {
            iM30015 = (iM30015 + 1) & this.f77776;
            i2 = iArr[iM30015];
            if (i2 == 0) {
                return 0.0f;
            }
        } while (i != i2);
        return m53599(iM30015);
    }

    @Override // l.InterfaceC3007
    public final float get(int i) {
        int i2;
        if (i == 0) {
            if (this.f77780) {
                return this.f77775[this.f77774];
            }
            return 0.0f;
        }
        int[] iArr = this.f77781;
        int iM30015 = C11972.m30015(i) & this.f77776;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return 0.0f;
        }
        if (i == i3) {
            return this.f77775[iM30015];
        }
        do {
            iM30015 = (iM30015 + 1) & this.f77776;
            i2 = iArr[iM30015];
            if (i2 == 0) {
                return 0.0f;
            }
        } while (i != i2);
        return this.f77775[iM30015];
    }

    @Override // l.InterfaceC3007
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9815(int i) {
        int i2;
        if (i == 0) {
            return this.f77780;
        }
        int[] iArr = this.f77781;
        int iM30015 = C11972.m30015(i) & this.f77776;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM30015 = (iM30015 + 1) & this.f77776;
                i2 = iArr[iM30015];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53600(float f) {
        int[] iArr = this.f77781;
        float[] fArr = this.f77775;
        if (this.f77780 && Float.floatToRawIntBits(fArr[this.f77774]) == Float.floatToRawIntBits(f)) {
            return true;
        }
        int i = this.f77774;
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
        if (this.f77778 == 0) {
            return;
        }
        this.f77778 = 0;
        this.f77780 = false;
        Arrays.fill(this.f77781, 0);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f77778;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f77778 == 0;
    }

    @Override // l.InterfaceC10619
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC7767 mo27095() {
        if (this.f77783 == null) {
            this.f77783 = new C23300(this);
        }
        return this.f77783;
    }

    @Override // java.util.Map
    public final InterfaceC5509 keySet() {
        if (this.f77773 == null) {
            this.f77773 = new C16586(this);
        }
        return this.f77773;
    }

    @Override // java.util.Map
    public final InterfaceC17572 values() {
        if (this.f77777 == null) {
            this.f77777 = new C12857(this);
        }
        return this.f77777;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m53601(int i) {
        int i2;
        int[] iArr = this.f77781;
        float[] fArr = this.f77775;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        float[] fArr2 = new float[i4];
        int i5 = this.f77774;
        int i6 = this.f77780 ? this.f77778 - 1 : this.f77778;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM30015 = C11972.m30015(i2) & i3;
                if (iArr2[iM30015] != 0) {
                    do {
                        iM30015 = (iM30015 + 1) & i3;
                    } while (iArr2[iM30015] != 0);
                }
                iArr2[iM30015] = iArr[i5];
                fArr2[iM30015] = fArr[i5];
                i6 = i7;
            } else {
                fArr2[i] = fArr[this.f77774];
                this.f77774 = i;
                this.f77776 = i3;
                this.f77782 = C11972.m30029(0.75f, i);
                this.f77781 = iArr2;
                this.f77775 = fArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C24046 c24046 = (C24046) super.clone();
            c24046.f77773 = null;
            c24046.f77777 = null;
            c24046.f77783 = null;
            c24046.f77780 = this.f77780;
            c24046.f77781 = (int[]) this.f77781.clone();
            c24046.f77775 = (float[]) this.f77775.clone();
            return c24046;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f77781;
        float[] fArr = this.f77775;
        int i2 = this.f77780 ? this.f77778 - 1 : this.f77778;
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
        return this.f77780 ? Float.floatToRawIntBits(fArr[this.f77774]) + iFloatToRawIntBits : iFloatToRawIntBits;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f77781;
        float[] fArr = this.f77775;
        C5400 c5400 = new C5400(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f77778;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM10342 = c5400.m10342();
            objectOutputStream.writeInt(iArr[iM10342]);
            objectOutputStream.writeFloat(fArr[iM10342]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int iM30014 = C11972.m30014(0.75f, this.f77778);
        this.f77774 = iM30014;
        this.f77782 = C11972.m30029(0.75f, iM30014);
        int i2 = this.f77774;
        this.f77776 = i2 - 1;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        this.f77781 = iArr;
        float[] fArr = new float[i3];
        this.f77775 = fArr;
        int i4 = this.f77778;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            float f = objectInputStream.readFloat();
            if (i6 == 0) {
                i = this.f77774;
                this.f77780 = true;
            } else {
                int iM30015 = C11972.m30015(i6);
                int i7 = this.f77776;
                while (true) {
                    i = iM30015 & i7;
                    if (iArr[i] != 0) {
                        iM30015 = i + 1;
                        i7 = this.f77776;
                    }
                }
            }
            iArr[i] = i6;
            fArr[i] = f;
            i4 = i5;
        }
    }
}
