package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4GH */
/* JADX INFO: loaded from: classes3.dex */
public final class C3549 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12166 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InputStream f12167;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f12168;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f12169;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20703 f12170;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f12171;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f12172;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C3549(final C22941 c22941, final C8002 c8002, C10260 c10260, String str) throws IOException {
        this.f12169 = new byte[16];
        this.f12168 = 0;
        this.f12172 = 0;
        this.f12167 = c10260;
        int iM21816 = c8002.m21816();
        int iM41492 = C17719.m41492(iM21816);
        long j = ((long) iM41492) + 12;
        if (c8002.m21838() < j) {
            throw new IOException("Invalid AES compressed size: " + c8002.m21838() + " < " + j + " (" + c8002.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        byte[] bArr = new byte[iM41492];
        byte[] bArr2 = new byte[2];
        C17719.m41498(c10260, bArr, iM41492);
        C17719.m41498(c10260, bArr2, 2);
        this.f12171 = c8002.m21838() - j;
        this.f12170 = new C20703(iM21816, str, bArr, bArr2, new InterfaceC6908() { // from class: l.᩹ܽܺ
            @Override // l.InterfaceC6908
            public final Object get() {
                c22941.m51730("");
                return new C16227(c8002.getName());
            }
        });
    }

    public C3549(AbstractC22044 abstractC22044, String str, InterfaceC6908 interfaceC6908) throws IOException {
        BufferedInputStream bufferedInputStreamM49875 = abstractC22044.m49875();
        long jMo4285 = abstractC22044.mo4285();
        this.f12169 = new byte[16];
        this.f12168 = 0;
        this.f12172 = 0;
        this.f12167 = bufferedInputStreamM49875;
        try {
            byte[] bArr = new byte[8];
            byte[] bArr2 = new byte[2];
            C17719.m41498(bufferedInputStreamM49875, bArr, 8);
            if (C6929.m19214(0, bArr) != 6436280820912968781L) {
                throw new IOException("Bad magic");
            }
            C17719.m41498(bufferedInputStreamM49875, bArr, 8);
            C17719.m41498(bufferedInputStreamM49875, bArr2, 2);
            this.f12171 = (((jMo4285 - 8) - ((long) 8)) - ((long) 2)) - 10;
            this.f12170 = new C20703(1, str, bArr, bArr2, interfaceC6908);
        } catch (IOException e) {
            C20244.m46520(bufferedInputStreamM49875);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f12172;
        if (i3 == -1) {
            return -1;
        }
        if (this.f12168 >= i3) {
            m11569();
            if (this.f12172 == -1) {
                return -1;
            }
        }
        int i4 = 0;
        do {
            int iMin = Math.min(this.f12172 - this.f12168, i2);
            System.arraycopy(this.f12169, this.f12168, bArr, i, iMin);
            i4 += iMin;
            this.f12168 += iMin;
            i += iMin;
            i2 -= iMin;
            if (i2 == 0) {
                break;
            }
            m11569();
        } while (this.f12172 != -1);
        return i4;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f12172;
        if (i == -1) {
            return -1;
        }
        if (this.f12168 >= i) {
            m11569();
            if (this.f12172 == -1) {
                return -1;
            }
        }
        int i2 = this.f12168;
        this.f12168 = i2 + 1;
        return this.f12169[i2] & 255;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m11569() throws IOException {
        if (this.f12172 == -1) {
            throw new IllegalStateException();
        }
        long j = this.f12171;
        InputStream inputStream = this.f12167;
        C20703 c20703 = this.f12170;
        if (j == 0) {
            this.f12172 = -1;
            byte[] bArrM47368 = c20703.m47368();
            byte[] bArr = new byte[10];
            C17719.m41498(inputStream, bArr, 10);
            for (int i = 0; i < 10; i++) {
                if (bArr[i] != bArrM47368[i]) {
                    throw new IOException("Reached end of data for this entry, but aes verification failed");
                }
            }
            return;
        }
        int iMin = (int) Math.min(16L, j);
        byte[] bArr2 = this.f12169;
        int iM41493 = C17719.m41493(inputStream, bArr2, iMin);
        this.f12172 = iM41493;
        if (iM41493 == 0) {
            this.f12172 = -1;
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
        c20703.m47367(iM41493, bArr2);
        this.f12168 = 0;
        this.f12171 -= (long) this.f12172;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12167.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m11570() {
        return this.f12171;
    }
}
