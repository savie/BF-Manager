package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14447 extends AbstractC11624 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC14572 f47384;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient char[] f47385;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC2263 f47386;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f47387;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC23475 f47388;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient char[] f47389;

    public C14447() {
        char[] cArr = C17124.f54609;
        this.f47389 = cArr;
        this.f47385 = cArr;
    }

    public C14447(int i) {
        this.f47389 = new char[i];
        this.f47385 = new char[i];
    }

    @Override // l.InterfaceC5086
    /* JADX INFO: renamed from: ܳۙ */
    public final InterfaceC18660 mo14178() {
        if (this.f47386 == null) {
            this.f47386 = new C20091(this);
        }
        return this.f47386;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int m34848(char c) {
        char[] cArr = this.f47389;
        int i = this.f47387;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (cArr[i2] == c) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC9508
    /* JADX INFO: renamed from: ܰ */
    public final char mo9552(char c) {
        char[] cArr = this.f47389;
        int i = this.f47387;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return (char) 0;
            }
            if (cArr[i2] == c) {
                return this.f47385[i2];
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC6456
    public final int size() {
        return this.f47387;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f47387 = 0;
    }

    @Override // l.InterfaceC9508
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9551(char c) {
        return m34848(c) != -1;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f47387 == 0;
    }

    @Override // l.AbstractC13741, l.InterfaceC9508
    /* JADX INFO: renamed from: ۙ */
    public final char mo24344(char c, char c2) {
        int iM34848 = m34848(c);
        if (iM34848 != -1) {
            char[] cArr = this.f47385;
            char c3 = cArr[iM34848];
            cArr[iM34848] = c2;
            return c3;
        }
        int i = this.f47387;
        if (i == this.f47389.length) {
            char[] cArr2 = new char[i == 0 ? 2 : i * 2];
            char[] cArr3 = new char[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                cArr2[i2] = this.f47389[i2];
                cArr3[i2] = this.f47385[i2];
                i = i2;
            }
            this.f47389 = cArr2;
            this.f47385 = cArr3;
        }
        char[] cArr4 = this.f47389;
        int i3 = this.f47387;
        cArr4[i3] = c;
        this.f47385[i3] = c2;
        this.f47387 = i3 + 1;
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final char m34849(char c) {
        int iM34848 = m34848(c);
        if (iM34848 == -1) {
            return (char) 0;
        }
        char c2 = this.f47385[iM34848];
        int i = (this.f47387 - iM34848) - 1;
        char[] cArr = this.f47389;
        int i2 = iM34848 + 1;
        System.arraycopy(cArr, i2, cArr, iM34848, i);
        char[] cArr2 = this.f47385;
        System.arraycopy(cArr2, i2, cArr2, iM34848, i);
        this.f47387--;
        return c2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f47384 == null) {
            this.f47384 = new C12330(this);
        }
        return this.f47384;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f47388 == null) {
            this.f47388 = new C23619(this);
        }
        return this.f47388;
    }

    public final Object clone() {
        try {
            C14447 c14447 = (C14447) super.clone();
            c14447.f47389 = (char[]) this.f47389.clone();
            c14447.f47385 = (char[]) this.f47385.clone();
            c14447.f47386 = null;
            c14447.f47384 = null;
            c14447.f47388 = null;
            return c14447;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f47389;
        char[] cArr2 = this.f47385;
        int i = this.f47387;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeChar(cArr[i2]);
            objectOutputStream.writeChar(cArr2[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f47387;
        char[] cArr = new char[i];
        this.f47389 = cArr;
        char[] cArr2 = new char[i];
        this.f47385 = cArr2;
        for (int i2 = 0; i2 < this.f47387; i2++) {
            cArr[i2] = objectInputStream.readChar();
            cArr2[i2] = objectInputStream.readChar();
        }
    }
}
