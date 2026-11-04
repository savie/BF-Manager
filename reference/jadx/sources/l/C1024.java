package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AK2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1024 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f3705;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C24145 f3707;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InputStream f3708;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f3709 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f3706 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21161 f3710 = null;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int iM48267;
        C21161 c21161 = this.f3710;
        if (c21161 == null) {
            m3919();
            iM48267 = -1;
        } else {
            iM48267 = c21161.m48267();
        }
        return (iM48267 == -1 && m3918()) ? this.f3710.m48267() : iM48267;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        C21161 c21161 = this.f3710;
        int i4 = 0;
        if (c21161 == null) {
            m3919();
        } else {
            i3 = 0;
            int i5 = i;
            while (i3 < i2) {
                int iM48267 = c21161.m48267();
                if (iM48267 == -1) {
                    if (i3 != 0) {
                        break;
                    }
                    break;
                }
                bArr[i5] = (byte) iM48267;
                i3++;
                i5++;
            }
            if (i3 == -1 || !m3918()) {
                return i3;
            }
            C21161 c21162 = this.f3710;
            while (i4 < i2) {
                int iM48268 = c21162.m48267();
                if (iM48268 == -1) {
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4;
                }
                bArr[i] = (byte) iM48268;
                i4++;
                i++;
            }
            c21162.getClass();
            return i4;
        }
        i3 = -1;
        if (i3 == -1) {
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3707 != null) {
            this.f3709 = true;
            this.f3710 = null;
            this.f3707 = null;
            try {
                this.f3708.close();
            } finally {
                this.f3708 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m3919() throws IOException {
        C24145 c24145 = this.f3707;
        if (c24145 == null) {
            throw new C7736("Stream closed");
        }
        if (this.f3709) {
            return;
        }
        try {
            int iM54114 = c24145.m54114(16);
            int iM54115 = this.f3707.m54114(8);
            int iM54116 = this.f3707.m54114(8) - 48;
            if (iM54114 != 16986 || iM54115 != 104 || iM54116 < 1 || iM54116 > 9) {
                throw new C7736("Invalid BZip2 header");
            }
            this.f3705 = iM54116 * 100000;
        } catch (IOException e) {
            this.f3709 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m3918() throws IOException {
        if (this.f3709) {
            return false;
        }
        C21161 c21161 = this.f3710;
        if (c21161 != null) {
            int iM48266 = c21161.m48266();
            int i = this.f3706;
            this.f3706 = iM48266 ^ ((i >>> 31) | (i << 1));
        }
        int iM54114 = this.f3707.m54114(24);
        int iM54115 = this.f3707.m54114(24);
        if (iM54114 == 3227993 && iM54115 == 2511705) {
            try {
                this.f3710 = new C21161(this.f3707, this.f3705);
                return true;
            } catch (IOException e) {
                this.f3709 = true;
                throw e;
            }
        }
        if (iM54114 == 1536581 && iM54115 == 3690640) {
            this.f3709 = true;
            C24145 c24145 = this.f3707;
            if ((c24145.m54114(16) | (c24145.m54114(16) << 16)) == this.f3706) {
                return false;
            }
            throw new C7736("BZip2 stream CRC error");
        }
        this.f3709 = true;
        throw new C7736("BZip2 stream format error");
    }

    public C1024(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Null input stream");
        }
        this.f3708 = inputStream;
        this.f3707 = new C24145(inputStream);
    }
}
