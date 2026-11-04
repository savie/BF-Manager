package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: X99G */
/* JADX INFO: loaded from: classes3.dex */
public final class C7074 extends AbstractC2599 implements Closeable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f23297;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f23298;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f23299;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C13961 f23301;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f23302;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23296 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23300 = -1;

    public C7074(AbstractC22044 abstractC22044) {
        C13961 c13961M49855 = abstractC22044.m49855("r");
        this.f23301 = c13961M49855;
        long length = c13961M49855.length();
        int i = (int) length;
        if (length != i) {
            throw new ArithmeticException();
        }
        this.f23298 = i;
        this.f23302 = new byte[i];
        this.f23301.seek(0L);
        this.f23301.readFully(this.f23302);
        this.f23299 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19405(C24975 c24975) {
        if (c24975.m55818() != this) {
            throw new RuntimeException();
        }
        Iterator it = new C19753(c24975).iterator();
        C7820 c7820 = null;
        int i = -1;
        int i2 = -1;
        while (it.hasNext()) {
            Iterator it2 = ((C22737) it.next()).getMethods().iterator();
            while (it2.hasNext()) {
                C7820 c7820Mo13175 = ((C4091) it2.next()).mo13175();
                if (c7820Mo13175 != null) {
                    int i3 = c7820Mo13175.f26038;
                    if (i == -1) {
                        c7820 = c7820Mo13175;
                        i = i3;
                        i2 = i;
                    } else if (i3 < i) {
                        i = i3;
                    } else if (i3 > i2) {
                        c7820 = c7820Mo13175;
                        i2 = i3;
                    }
                }
            }
        }
        if (c7820 == null) {
            return;
        }
        int iM21298 = (c7820.m21298() * 2) + c7820.f26038 + 16;
        Iterator it3 = c7820.mo2839().iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((C1108) it3.next()).mo4116().iterator();
            while (it4.hasNext()) {
                it4.next();
            }
            iM21298 = Math.max(iM21298, ((AbstractC19819) it4).m45585());
        }
        if (this.f23296 != -1) {
            throw new IllegalStateException();
        }
        this.f23296 = i;
        this.f23300 = iM21298;
        if (this.f23301 == null) {
            AbstractC22044 abstractC22044M49877 = C6382.f21565.m49877();
            abstractC22044M49877.m49850(this.f23302, i, iM21298 - i);
            this.f23297 = abstractC22044M49877;
            this.f23301 = abstractC22044M49877.m49855("r");
            this.f23299 = -i;
        }
        byte[] bArr = this.f23302;
        int length = bArr.length - (iM21298 - i);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = this.f23302;
        System.arraycopy(bArr3, iM21298, bArr2, i, bArr3.length - iM21298);
        System.out.println("FileDexBuffer.optimize() save memory: " + ((this.f23302.length - length) / 1024) + "KB");
        this.f23302 = bArr2;
    }

    @Override // l.AbstractC2599
    /* JADX INFO: renamed from: ۙ */
    public final byte mo8717(int i) {
        byte b;
        int i2 = this.f23296;
        int i3 = this.f23300;
        boolean z = true;
        if (i2 != -1 && i > i2 - 1) {
            if (i >= i3) {
                i -= i3 - i2;
            } else {
                z = false;
            }
        }
        if (z) {
            return this.f23302[i];
        }
        if (i < i2 || i + 1 > i3) {
            throw new RuntimeException();
        }
        synchronized (this.f23301) {
            try {
                try {
                    this.f23301.seek(this.f23299 + i);
                    b = this.f23301.readByte();
                } catch (IOException e) {
                    throw new C23044(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // l.AbstractC2599
    /* JADX INFO: renamed from: ۫ */
    public final int mo8722(int i) {
        boolean z;
        short sMo34029;
        int i2 = this.f23296;
        int i3 = this.f23300;
        if (i2 == -1 || i <= i2 - 2) {
            z = true;
        } else if (i >= i3) {
            i -= i3 - i2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = this.f23302;
            return (bArr[i + 1] << 8) | (bArr[i] & 255);
        }
        if (i < i2 || i + 2 > i3) {
            return (mo8717(i + 1) << 8) | (mo8717(i) & 255);
        }
        synchronized (this.f23301) {
            try {
                try {
                    this.f23301.seek(this.f23299 + i);
                    sMo34029 = (short) this.f23301.mo34029();
                } catch (IOException e) {
                    throw new C23044(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sMo34029;
    }

    @Override // l.AbstractC2599
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8725(int i) {
        int i2;
        int i3 = this.f23296;
        int i4 = this.f23300;
        boolean z = true;
        if (i3 != -1 && i > i3 - 4) {
            if (i >= i4) {
                i -= i4 - i3;
            } else {
                z = false;
            }
        }
        if (z) {
            byte[] bArr = this.f23302;
            return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        if (i < i3 || i + 4 > i4) {
            return (mo8717(i + 3) << 24) | (mo8717(i) & 255) | ((mo8717(i + 1) & 255) << 8) | ((mo8717(i + 2) & 255) << 16);
        }
        synchronized (this.f23301) {
            try {
                try {
                    this.f23301.seek(this.f23299 + i);
                    i2 = this.f23301.readInt();
                } catch (IOException e) {
                    throw new C23044(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    @Override // l.AbstractC2599
    /* JADX INFO: renamed from: ۤ */
    public final long mo8720(int i) {
        long j;
        int i2 = this.f23296;
        int i3 = this.f23300;
        boolean z = true;
        if (i2 != -1 && i > i2 - 8) {
            if (i >= i3) {
                i -= i3 - i2;
            } else {
                z = false;
            }
        }
        if (z) {
            byte[] bArr = this.f23302;
            return (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 4]) & 255) << 32) | ((long) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 40);
        }
        if (i < i2 || i + 8 > i3) {
            return ((long) ((mo8717(i) & 255) | ((mo8717(i + 1) & 255) << 8) | ((mo8717(i + 2) & 255) << 16))) | ((((long) mo8717(i + 3)) & 255) << 24) | ((((long) mo8717(i + 4)) & 255) << 32) | ((((long) mo8717(i + 5)) & 255) << 40) | ((((long) mo8717(i + 6)) & 255) << 48) | (((long) mo8717(i + 7)) << 56);
        }
        synchronized (this.f23301) {
            try {
                try {
                    this.f23301.seek(this.f23299 + i);
                    j = this.f23301.readLong();
                } catch (IOException e) {
                    throw new C23044(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // l.AbstractC2599
    public final int length() {
        return this.f23298;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23302 = null;
        C13961 c13961 = this.f23301;
        if (c13961 != null) {
            c13961.close();
            this.f23301 = null;
        }
        AbstractC22044 abstractC22044 = this.f23297;
        if (abstractC22044 != null) {
            abstractC22044.mo4287();
            this.f23297 = null;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        C20244.m46520(this);
    }
}
