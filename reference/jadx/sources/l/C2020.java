package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.֫ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2020 extends AbstractC23693 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f6731;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient char[] f6732;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC3511 f6733;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC5881 f6734;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC12835 f6735;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient char[] f6736;

    public C2020() {
        char[] cArr = C22532.f72878;
        this.f6736 = cArr;
        this.f6732 = cArr;
    }

    public C2020(int i) {
        this.f6736 = new char[i];
        this.f6732 = new char[i];
    }

    @Override // l.InterfaceC20665
    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7767 mo6942() {
        if (this.f6733 == null) {
            this.f6733 = new C5003(this);
        }
        return this.f6733;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int m6941(char c) {
        char[] cArr = this.f6736;
        int i = this.f6731;
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

    @Override // l.InterfaceC25141
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char mo6946(char c) {
        char[] cArr = this.f6736;
        int i = this.f6731;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return (char) 0;
            }
            if (cArr[i2] == c) {
                return this.f6732[i2];
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f6731;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f6731 = 0;
    }

    @Override // l.InterfaceC25141
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6944(char c) {
        return m6941(c) != -1;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f6731 == 0;
    }

    @Override // l.AbstractC16233, l.InterfaceC25141
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char mo6943(char c, char c2) {
        int iM6941 = m6941(c);
        if (iM6941 != -1) {
            char[] cArr = this.f6732;
            char c3 = cArr[iM6941];
            cArr[iM6941] = c2;
            return c3;
        }
        int i = this.f6731;
        if (i == this.f6736.length) {
            char[] cArr2 = new char[i == 0 ? 2 : i * 2];
            char[] cArr3 = new char[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                cArr2[i2] = this.f6736[i2];
                cArr3[i2] = this.f6732[i2];
                i = i2;
            }
            this.f6736 = cArr2;
            this.f6732 = cArr3;
        }
        char[] cArr4 = this.f6736;
        int i3 = this.f6731;
        cArr4[i3] = c;
        this.f6732[i3] = c2;
        this.f6731 = i3 + 1;
        return (char) 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final char m6945(char c) {
        int iM6941 = m6941(c);
        if (iM6941 == -1) {
            return (char) 0;
        }
        char c2 = this.f6732[iM6941];
        int i = (this.f6731 - iM6941) - 1;
        char[] cArr = this.f6736;
        int i2 = iM6941 + 1;
        System.arraycopy(cArr, i2, cArr, iM6941, i);
        char[] cArr2 = this.f6732;
        System.arraycopy(cArr2, i2, cArr2, iM6941, i);
        this.f6731--;
        return c2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f6734 == null) {
            this.f6734 = new C22903(this);
        }
        return this.f6734;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f6735 == null) {
            this.f6735 = new C5749(this);
        }
        return this.f6735;
    }

    public final Object clone() {
        try {
            C2020 c2020 = (C2020) super.clone();
            c2020.f6736 = (char[]) this.f6736.clone();
            c2020.f6732 = (char[]) this.f6732.clone();
            c2020.f6733 = null;
            c2020.f6734 = null;
            c2020.f6735 = null;
            return c2020;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f6736;
        char[] cArr2 = this.f6732;
        int i = this.f6731;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeChar(cArr[i2]);
            objectOutputStream.writeChar(cArr2[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f6731;
        char[] cArr = new char[i];
        this.f6736 = cArr;
        char[] cArr2 = new char[i];
        this.f6732 = cArr2;
        for (int i2 = 0; i2 < this.f6731; i2++) {
            cArr[i2] = objectInputStream.readChar();
            cArr2[i2] = objectInputStream.readChar();
        }
    }
}
