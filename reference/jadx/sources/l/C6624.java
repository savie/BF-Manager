package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AK2 */
/* JADX INFO: loaded from: classes3.dex */
public class C6624 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InputStream f22389;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C4507 f22391;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f22392;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f22393 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f22390 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2390 f22394 = null;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int iM7263;
        C2390 c2390 = this.f22394;
        if (c2390 == null) {
            m17965();
            iM7263 = -1;
        } else {
            iM7263 = c2390.m7263();
        }
        return (iM7263 == -1 && m17964()) ? this.f22394.m7263() : iM7263;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        C2390 c2390 = this.f22394;
        int i4 = 0;
        if (c2390 == null) {
            m17965();
        } else {
            i3 = 0;
            int i5 = i;
            while (i3 < i2) {
                int iM7263 = c2390.m7263();
                if (iM7263 == -1) {
                    if (i3 != 0) {
                        break;
                    }
                    break;
                }
                bArr[i5] = (byte) iM7263;
                i3++;
                i5++;
            }
            if (i3 == -1 || !m17964()) {
                return i3;
            }
            C2390 c2391 = this.f22394;
            while (i4 < i2) {
                int iM7264 = c2391.m7263();
                if (iM7264 == -1) {
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4;
                }
                bArr[i] = (byte) iM7264;
                i4++;
                i++;
            }
            c2391.getClass();
            return i4;
        }
        i3 = -1;
        if (i3 == -1) {
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22391 != null) {
            this.f22393 = true;
            this.f22394 = null;
            this.f22391 = null;
            try {
                this.f22389.close();
            } finally {
                this.f22389 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m17965() throws IOException {
        C4507 c4507 = this.f22391;
        if (c4507 == null) {
            throw new C0979("Stream closed");
        }
        if (this.f22393) {
            return;
        }
        try {
            int iM12543 = c4507.m12543(16);
            int iM12544 = this.f22391.m12543(8);
            int iM12545 = this.f22391.m12543(8) - 48;
            if (iM12543 != 16986 || iM12544 != 104 || iM12545 < 1 || iM12545 > 9) {
                throw new C0979("Invalid BZip2 header");
            }
            this.f22392 = iM12545 * 100000;
        } catch (IOException e) {
            this.f22393 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m17964() throws IOException {
        if (this.f22393) {
            return false;
        }
        C2390 c2390 = this.f22394;
        if (c2390 != null) {
            int iM7262 = c2390.m7262();
            int i = this.f22390;
            this.f22390 = iM7262 ^ ((i >>> 31) | (i << 1));
        }
        int iM12543 = this.f22391.m12543(24);
        int iM12544 = this.f22391.m12543(24);
        if (iM12543 == 3227993 && iM12544 == 2511705) {
            try {
                this.f22394 = new C2390(this.f22391, this.f22392);
                return true;
            } catch (IOException e) {
                this.f22393 = true;
                throw e;
            }
        }
        if (iM12543 == 1536581 && iM12544 == 3690640) {
            this.f22393 = true;
            C4507 c4507 = this.f22391;
            if ((c4507.m12543(16) | (c4507.m12543(16) << 16)) == this.f22390) {
                return false;
            }
            throw new C0979("BZip2 stream CRC error");
        }
        this.f22393 = true;
        throw new C0979("BZip2 stream format error");
    }

    public C6624(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Null input stream");
        }
        this.f22389 = inputStream;
        this.f22391 = new C4507(inputStream);
    }
}
