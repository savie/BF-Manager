package l;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X99G */
/* JADX INFO: loaded from: classes3.dex */
public final class C8242 extends AbstractC18119 implements Closeable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f28690;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f28691;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f28692;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1388 f28694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f28695;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f28693 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f28689 = -1;

    public C8242(AbstractC20745 abstractC20745) throws EOFException {
        C1388 c1388M46710 = abstractC20745.m46710("r");
        this.f28694 = c1388M46710;
        long length = c1388M46710.length();
        int i = (int) length;
        if (length != i) {
            throw new ArithmeticException();
        }
        this.f28692 = i;
        this.f28695 = new byte[i];
        this.f28694.seek(0L);
        this.f28694.readFully(this.f28695);
        this.f28690 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21620(C17684 c17684) {
        if (c17684.m41166() != this) {
            throw new RuntimeException();
        }
        Iterator it = new C21212(c17684).iterator();
        C4007 c4007 = null;
        int i = -1;
        int i2 = -1;
        while (it.hasNext()) {
            Iterator it2 = ((C7807) it.next()).getMethods().iterator();
            while (it2.hasNext()) {
                C4007 c4007Mo25747 = ((C11770) it2.next()).mo25747();
                if (c4007Mo25747 != null) {
                    int i3 = c4007Mo25747.f14853;
                    if (i == -1) {
                        c4007 = c4007Mo25747;
                        i = i3;
                        i2 = i;
                    } else if (i3 < i) {
                        i = i3;
                    } else if (i3 > i2) {
                        c4007 = c4007Mo25747;
                        i2 = i3;
                    }
                }
            }
        }
        if (c4007 == null) {
            return;
        }
        int iM11509 = (c4007.m11509() * 2) + c4007.f14853 + 16;
        Iterator it3 = c4007.mo11511().iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((C15298) it3.next()).mo18943().iterator();
            while (it4.hasNext()) {
                it4.next();
            }
            iM11509 = Math.max(iM11509, ((AbstractC15673) it4).m37344());
        }
        if (this.f28693 != -1) {
            throw new IllegalStateException();
        }
        this.f28693 = i;
        this.f28689 = iM11509;
        if (this.f28694 == null) {
            AbstractC20745 abstractC20745M46728 = C11904.f39939.m46728();
            abstractC20745M46728.m46704(this.f28695, i, iM11509 - i);
            this.f28691 = abstractC20745M46728;
            this.f28694 = abstractC20745M46728.m46710("r");
            this.f28690 = -i;
        }
        byte[] bArr = this.f28695;
        int length = bArr.length - (iM11509 - i);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = this.f28695;
        System.arraycopy(bArr3, iM11509, bArr2, i, bArr3.length - iM11509);
        System.out.println("FileDexBuffer.optimize() save memory: " + ((this.f28695.length - length) / 1024) + "KB");
        this.f28695 = bArr2;
    }

    @Override // l.AbstractC18119
    /* JADX INFO: renamed from: ۙ */
    public final byte mo5855(int i) {
        byte b;
        int i2 = this.f28693;
        int i3 = this.f28689;
        boolean z = true;
        if (i2 != -1 && i > i2 - 1) {
            if (i >= i3) {
                i -= i3 - i2;
            } else {
                z = false;
            }
        }
        if (z) {
            return this.f28695[i];
        }
        if (i < i2 || i + 1 > i3) {
            throw new RuntimeException();
        }
        synchronized (this.f28694) {
            try {
                try {
                    this.f28694.seek(this.f28690 + i);
                    b = this.f28694.readByte();
                } catch (IOException e) {
                    throw new C20749(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // l.AbstractC18119
    /* JADX INFO: renamed from: ֨ */
    public final int mo5854(int i) {
        boolean z;
        short sMo4872;
        int i2 = this.f28693;
        int i3 = this.f28689;
        if (i2 == -1 || i <= i2 - 2) {
            z = true;
        } else if (i >= i3) {
            i -= i3 - i2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = this.f28695;
            return (bArr[i + 1] << 8) | (bArr[i] & 255);
        }
        if (i < i2 || i + 2 > i3) {
            return (mo5855(i + 1) << 8) | (mo5855(i) & 255);
        }
        synchronized (this.f28694) {
            try {
                try {
                    this.f28694.seek(this.f28690 + i);
                    sMo4872 = (short) this.f28694.mo4872();
                } catch (IOException e) {
                    throw new C20749(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sMo4872;
    }

    @Override // l.AbstractC18119
    /* JADX INFO: renamed from: ܰ */
    public final int mo5859(int i) {
        int i2;
        int i3 = this.f28693;
        int i4 = this.f28689;
        boolean z = true;
        if (i3 != -1 && i > i3 - 4) {
            if (i >= i4) {
                i -= i4 - i3;
            } else {
                z = false;
            }
        }
        if (z) {
            byte[] bArr = this.f28695;
            return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        if (i < i3 || i + 4 > i4) {
            return (mo5855(i + 3) << 24) | (mo5855(i) & 255) | ((mo5855(i + 1) & 255) << 8) | ((mo5855(i + 2) & 255) << 16);
        }
        synchronized (this.f28694) {
            try {
                try {
                    this.f28694.seek(this.f28690 + i);
                    i2 = this.f28694.readInt();
                } catch (IOException e) {
                    throw new C20749(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    @Override // l.AbstractC18119
    /* JADX INFO: renamed from: ۨ */
    public final long mo5858(int i) {
        long j;
        int i2 = this.f28693;
        int i3 = this.f28689;
        boolean z = true;
        if (i2 != -1 && i > i2 - 8) {
            if (i >= i3) {
                i -= i3 - i2;
            } else {
                z = false;
            }
        }
        if (z) {
            byte[] bArr = this.f28695;
            return (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 4]) & 255) << 32) | ((long) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 40);
        }
        if (i < i2 || i + 8 > i3) {
            return ((long) ((mo5855(i) & 255) | ((mo5855(i + 1) & 255) << 8) | ((mo5855(i + 2) & 255) << 16))) | ((((long) mo5855(i + 3)) & 255) << 24) | ((((long) mo5855(i + 4)) & 255) << 32) | ((((long) mo5855(i + 5)) & 255) << 40) | ((((long) mo5855(i + 6)) & 255) << 48) | (((long) mo5855(i + 7)) << 56);
        }
        synchronized (this.f28694) {
            try {
                try {
                    this.f28694.seek(this.f28690 + i);
                    j = this.f28694.readLong();
                } catch (IOException e) {
                    throw new C20749(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // l.AbstractC18119
    public final int length() {
        return this.f28692;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f28695 = null;
        C1388 c1388 = this.f28694;
        if (c1388 != null) {
            c1388.close();
            this.f28694 = null;
        }
        AbstractC20745 abstractC20745 = this.f28691;
        if (abstractC20745 != null) {
            abstractC20745.mo24644();
            this.f28691 = null;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        C19431.m44468(this);
    }
}
