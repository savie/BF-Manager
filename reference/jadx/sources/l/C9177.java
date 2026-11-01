package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9177 extends AbstractC15029 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int[] f31228;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public transient InterfaceC7162 f31229;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient int f31230;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient int f31231;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f31232;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public transient byte[] f31233;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f31234;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC14842 f31235;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int f31236;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11999 f31237;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f31238;

    public C9177() {
        int iM25124 = C9927.m25124(0.75f, 16);
        this.f31231 = iM25124;
        this.f31230 = iM25124;
        this.f31232 = iM25124 - 1;
        this.f31236 = C9927.m25131(0.75f, iM25124);
        int i = this.f31231 + 1;
        this.f31228 = new int[i];
        this.f31233 = new byte[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte m23608(int i) {
        int i2;
        byte[] bArr = this.f31233;
        byte b = bArr[i];
        this.f31238--;
        int[] iArr = this.f31228;
        loop0: while (true) {
            int i3 = (i + 1) & this.f31232;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM25125 = C9927.m25125(i2);
                    int i4 = this.f31232;
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
            bArr[i] = bArr[i3];
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f31231;
        if (i6 > this.f31230 && this.f31238 < this.f31236 / 4 && i6 > 16) {
            m23610(i6 / 2);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte m23605() {
        this.f31234 = false;
        byte[] bArr = this.f31233;
        int i = this.f31231;
        byte b = bArr[i];
        int i2 = this.f31238 - 1;
        this.f31238 = i2;
        if (i > this.f31230 && i2 < this.f31236 / 4 && i > 16) {
            m23610(i / 2);
        }
        return b;
    }

    @Override // l.AbstractC15029, java.util.Map
    public final void putAll(Map map) {
        if (0.75f <= 0.5d) {
            int iM25124 = C9927.m25124(0.75f, map.size());
            if (iM25124 > this.f31231) {
                m23610(iM25124);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil((map.size() + this.f31238) / 0.75f))));
            if (iMin > this.f31231) {
                m23610(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC22790, l.InterfaceC3033
    /* JADX INFO: renamed from: ۙ */
    public final byte mo9046(byte b, int i) {
        int i2;
        if (i == 0) {
            i2 = this.f31234 ? this.f31231 : -(this.f31231 + 1);
        } else {
            int[] iArr = this.f31228;
            int iM25125 = C9927.m25125(i) & this.f31232;
            int i3 = iArr[iM25125];
            if (i3 != 0) {
                if (i != i3) {
                    while (true) {
                        iM25125 = (iM25125 + 1) & this.f31232;
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
            if (i5 == this.f31231) {
                this.f31234 = true;
            }
            this.f31228[i5] = i;
            this.f31233[i5] = b;
            int i6 = this.f31238;
            this.f31238 = i6 + 1;
            if (i6 < this.f31236) {
                return (byte) 0;
            }
            m23610(C9927.m25124(0.75f, i6 + 2));
            return (byte) 0;
        }
        byte[] bArr = this.f31233;
        byte b2 = bArr[i2];
        bArr[i2] = b;
        return b2;
    }

    public final byte remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f31234) {
                return m23605();
            }
            return (byte) 0;
        }
        int[] iArr = this.f31228;
        int iM25125 = C9927.m25125(i) & this.f31232;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return m23608(iM25125);
        }
        do {
            iM25125 = (iM25125 + 1) & this.f31232;
            i2 = iArr[iM25125];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return m23608(iM25125);
    }

    @Override // l.InterfaceC3033
    public final byte get(int i) {
        int i2;
        if (i == 0) {
            if (this.f31234) {
                return this.f31233[this.f31231];
            }
            return (byte) 0;
        }
        int[] iArr = this.f31228;
        int iM25125 = C9927.m25125(i) & this.f31232;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return this.f31233[iM25125];
        }
        do {
            iM25125 = (iM25125 + 1) & this.f31232;
            i2 = iArr[iM25125];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return this.f31233[iM25125];
    }

    @Override // l.InterfaceC3033
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9047(int i) {
        int i2;
        if (i == 0) {
            return this.f31234;
        }
        int[] iArr = this.f31228;
        int iM25125 = C9927.m25125(i) & this.f31232;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM25125 = (iM25125 + 1) & this.f31232;
                i2 = iArr[iM25125];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23609(byte b) {
        int[] iArr = this.f31228;
        byte[] bArr = this.f31233;
        if (this.f31234 && bArr[this.f31231] == b) {
            return true;
        }
        int i = this.f31231;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (iArr[i2] != 0 && bArr[i2] == b) {
                return true;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte m23611(int i) {
        int i2;
        if (i == 0) {
            if (this.f31234) {
                return this.f31233[this.f31231];
            }
            return (byte) 0;
        }
        int[] iArr = this.f31228;
        int iM25125 = C9927.m25125(i) & this.f31232;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return this.f31233[iM25125];
        }
        do {
            iM25125 = (iM25125 + 1) & this.f31232;
            i2 = iArr[iM25125];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return this.f31233[iM25125];
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f31238 == 0) {
            return;
        }
        this.f31238 = 0;
        this.f31234 = false;
        Arrays.fill(this.f31228, 0);
    }

    @Override // l.InterfaceC6456
    public final int size() {
        return this.f31238;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f31238 == 0;
    }

    @Override // l.InterfaceC2825
    /* JADX INFO: renamed from: ᩸ۙ */
    public final InterfaceC18660 mo8578() {
        if (this.f31237 == null) {
            this.f31237 = new C21876(this);
        }
        return this.f31237;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f31235 == null) {
            this.f31235 = new C7059(this);
        }
        return this.f31235;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f31229 == null) {
            this.f31229 = new C5648(this);
        }
        return this.f31229;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m23610(int i) {
        int i2;
        int[] iArr = this.f31228;
        byte[] bArr = this.f31233;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        byte[] bArr2 = new byte[i4];
        int i5 = this.f31231;
        int i6 = this.f31234 ? this.f31238 - 1 : this.f31238;
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
                bArr2[iM25125] = bArr[i5];
                i6 = i7;
            } else {
                bArr2[i] = bArr[this.f31231];
                this.f31231 = i;
                this.f31232 = i3;
                this.f31236 = C9927.m25131(0.75f, i);
                this.f31228 = iArr2;
                this.f31233 = bArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C9177 c9177 = (C9177) super.clone();
            c9177.f31235 = null;
            c9177.f31229 = null;
            c9177.f31237 = null;
            c9177.f31234 = this.f31234;
            c9177.f31228 = (int[]) this.f31228.clone();
            c9177.f31233 = (byte[]) this.f31233.clone();
            return c9177;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f31228;
        byte[] bArr = this.f31233;
        int i2 = this.f31234 ? this.f31238 - 1 : this.f31238;
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
            i3 += i ^ bArr[i4];
            i4++;
            i2 = i5;
        }
        return this.f31234 ? i3 + bArr[this.f31231] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f31228;
        byte[] bArr = this.f31233;
        C22582 c22582 = new C22582(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f31238;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM42607 = c22582.m42607();
            objectOutputStream.writeInt(iArr[iM42607]);
            objectOutputStream.writeByte(bArr[iM42607]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int iM25124 = C9927.m25124(0.75f, this.f31238);
        this.f31231 = iM25124;
        this.f31236 = C9927.m25131(0.75f, iM25124);
        int i2 = this.f31231;
        this.f31232 = i2 - 1;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        this.f31228 = iArr;
        byte[] bArr = new byte[i3];
        this.f31233 = bArr;
        int i4 = this.f31238;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            byte b = objectInputStream.readByte();
            if (i6 == 0) {
                i = this.f31231;
                this.f31234 = true;
            } else {
                int iM25125 = C9927.m25125(i6);
                int i7 = this.f31232;
                while (true) {
                    i = iM25125 & i7;
                    if (iArr[i] != 0) {
                        iM25125 = i + 1;
                        i7 = this.f31232;
                    }
                }
            }
            iArr[i] = i6;
            bArr[i] = b;
            i4 = i5;
        }
    }
}
