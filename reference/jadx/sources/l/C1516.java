package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֨᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1516 extends AbstractC21128 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC5509 f5287;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient int f5288;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public transient byte[] f5289;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int f5290;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public transient InterfaceC8753 f5291;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f5292;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final transient int f5293;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f5294;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int[] f5295;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient int f5296;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC16431 f5297;

    public C1516() {
        int iM30014 = C11972.m30014(0.75f, 16);
        this.f5288 = iM30014;
        this.f5293 = iM30014;
        this.f5290 = iM30014 - 1;
        this.f5296 = C11972.m30029(0.75f, iM30014);
        int i = this.f5288 + 1;
        this.f5295 = new int[i];
        this.f5289 = new byte[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte m5389(int i) {
        int i2;
        byte[] bArr = this.f5289;
        byte b = bArr[i];
        this.f5292--;
        int[] iArr = this.f5295;
        loop0: while (true) {
            int i3 = (i + 1) & this.f5290;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM30015 = C11972.m30015(i2);
                    int i4 = this.f5290;
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
            bArr[i] = bArr[i3];
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f5288;
        if (i6 > this.f5293 && this.f5292 < this.f5296 / 4 && i6 > 16) {
            m5395(i6 / 2);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte m5386() {
        this.f5294 = false;
        byte[] bArr = this.f5289;
        int i = this.f5288;
        byte b = bArr[i];
        int i2 = this.f5292 - 1;
        this.f5292 = i2;
        if (i > this.f5293 && i2 < this.f5296 / 4 && i > 16) {
            m5395(i / 2);
        }
        return b;
    }

    @Override // l.AbstractC21128, java.util.Map
    public final void putAll(Map map) {
        if (0.75f <= 0.5d) {
            int iM30014 = C11972.m30014(0.75f, map.size());
            if (iM30014 > this.f5288) {
                m5395(iM30014);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil((map.size() + this.f5292) / 0.75f))));
            if (iMin > this.f5288) {
                m5395(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC14414, l.InterfaceC25383
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte mo5390(byte b, int i) {
        int i2;
        if (i == 0) {
            i2 = this.f5294 ? this.f5288 : -(this.f5288 + 1);
        } else {
            int[] iArr = this.f5295;
            int iM30015 = C11972.m30015(i) & this.f5290;
            int i3 = iArr[iM30015];
            if (i3 != 0) {
                if (i != i3) {
                    while (true) {
                        iM30015 = (iM30015 + 1) & this.f5290;
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
            if (i5 == this.f5288) {
                this.f5294 = true;
            }
            this.f5295[i5] = i;
            this.f5289[i5] = b;
            int i6 = this.f5292;
            this.f5292 = i6 + 1;
            if (i6 < this.f5296) {
                return (byte) 0;
            }
            m5395(C11972.m30014(0.75f, i6 + 2));
            return (byte) 0;
        }
        byte[] bArr = this.f5289;
        byte b2 = bArr[i2];
        bArr[i2] = b;
        return b2;
    }

    public final byte remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f5294) {
                return m5386();
            }
            return (byte) 0;
        }
        int[] iArr = this.f5295;
        int iM30015 = C11972.m30015(i) & this.f5290;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return m5389(iM30015);
        }
        do {
            iM30015 = (iM30015 + 1) & this.f5290;
            i2 = iArr[iM30015];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return m5389(iM30015);
    }

    @Override // l.InterfaceC25383
    public final byte get(int i) {
        int i2;
        if (i == 0) {
            if (this.f5294) {
                return this.f5289[this.f5288];
            }
            return (byte) 0;
        }
        int[] iArr = this.f5295;
        int iM30015 = C11972.m30015(i) & this.f5290;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return this.f5289[iM30015];
        }
        do {
            iM30015 = (iM30015 + 1) & this.f5290;
            i2 = iArr[iM30015];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return this.f5289[iM30015];
    }

    @Override // l.InterfaceC25383
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo5392(int i) {
        int i2;
        if (i == 0) {
            return this.f5294;
        }
        int[] iArr = this.f5295;
        int iM30015 = C11972.m30015(i) & this.f5290;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM30015 = (iM30015 + 1) & this.f5290;
                i2 = iArr[iM30015];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5391(byte b) {
        int[] iArr = this.f5295;
        byte[] bArr = this.f5289;
        if (this.f5294 && bArr[this.f5288] == b) {
            return true;
        }
        int i = this.f5288;
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte m5393(int i) {
        int i2;
        if (i == 0) {
            if (this.f5294) {
                return this.f5289[this.f5288];
            }
            return (byte) 0;
        }
        int[] iArr = this.f5295;
        int iM30015 = C11972.m30015(i) & this.f5290;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return this.f5289[iM30015];
        }
        do {
            iM30015 = (iM30015 + 1) & this.f5290;
            i2 = iArr[iM30015];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return this.f5289[iM30015];
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f5292 == 0) {
            return;
        }
        this.f5292 = 0;
        this.f5294 = false;
        Arrays.fill(this.f5295, 0);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f5292;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5292 == 0;
    }

    @Override // l.InterfaceC23891
    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7767 mo5394() {
        if (this.f5297 == null) {
            this.f5297 = new C18669(this);
        }
        return this.f5297;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f5287 == null) {
            this.f5287 = new C4499(this);
        }
        return this.f5287;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f5291 == null) {
            this.f5291 = new C3753(this);
        }
        return this.f5291;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m5395(int i) {
        int i2;
        int[] iArr = this.f5295;
        byte[] bArr = this.f5289;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        byte[] bArr2 = new byte[i4];
        int i5 = this.f5288;
        int i6 = this.f5294 ? this.f5292 - 1 : this.f5292;
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
                bArr2[iM30015] = bArr[i5];
                i6 = i7;
            } else {
                bArr2[i] = bArr[this.f5288];
                this.f5288 = i;
                this.f5290 = i3;
                this.f5296 = C11972.m30029(0.75f, i);
                this.f5295 = iArr2;
                this.f5289 = bArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C1516 c1516 = (C1516) super.clone();
            c1516.f5287 = null;
            c1516.f5291 = null;
            c1516.f5297 = null;
            c1516.f5294 = this.f5294;
            c1516.f5295 = (int[]) this.f5295.clone();
            c1516.f5289 = (byte[]) this.f5289.clone();
            return c1516;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f5295;
        byte[] bArr = this.f5289;
        int i2 = this.f5294 ? this.f5292 - 1 : this.f5292;
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
        return this.f5294 ? i3 + bArr[this.f5288] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f5295;
        byte[] bArr = this.f5289;
        C20907 c20907 = new C20907(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f5292;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM3145 = c20907.m3145();
            objectOutputStream.writeInt(iArr[iM3145]);
            objectOutputStream.writeByte(bArr[iM3145]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int iM30014 = C11972.m30014(0.75f, this.f5292);
        this.f5288 = iM30014;
        this.f5296 = C11972.m30029(0.75f, iM30014);
        int i2 = this.f5288;
        this.f5290 = i2 - 1;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        this.f5295 = iArr;
        byte[] bArr = new byte[i3];
        this.f5289 = bArr;
        int i4 = this.f5292;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            byte b = objectInputStream.readByte();
            if (i6 == 0) {
                i = this.f5288;
                this.f5294 = true;
            } else {
                int iM30015 = C11972.m30015(i6);
                int i7 = this.f5290;
                while (true) {
                    i = iM30015 & i7;
                    if (iArr[i] != 0) {
                        iM30015 = i + 1;
                        i7 = this.f5290;
                    }
                }
            }
            iArr[i] = i6;
            bArr[i] = b;
            i4 = i5;
        }
    }
}
