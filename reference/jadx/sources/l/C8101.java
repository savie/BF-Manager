package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K4GH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8101 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28366 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19390 f28367;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f28368;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f28369;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InputStream f28370;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f28371;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f28372;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C8101(final C2455 c2455, final C12107 c12107, C5984 c5984, String str) throws IOException {
        this.f28369 = new byte[16];
        this.f28368 = 0;
        this.f28372 = 0;
        this.f28370 = c5984;
        int iM30101 = c12107.m30101();
        int iM48148 = C21506.m48148(iM30101);
        long j = ((long) iM48148) + 12;
        if (c12107.m30138() < j) {
            throw new IOException("Invalid AES compressed size: " + c12107.m30138() + " < " + j + " (" + c12107.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        byte[] bArr = new byte[iM48148];
        byte[] bArr2 = new byte[2];
        C21506.m48154(c5984, bArr, iM48148);
        C21506.m48154(c5984, bArr2, 2);
        this.f28371 = c12107.m30138() - j;
        this.f28367 = new C19390(iM30101, str, bArr, bArr2, new InterfaceC23949() { // from class: l.ᩴۢ᩺
            @Override // l.InterfaceC23949
            public final Object get() {
                c2455.m7474("");
                return new C17978(c12107.getName());
            }
        });
    }

    public C8101(AbstractC20745 abstractC20745, String str, InterfaceC23949 interfaceC23949) throws IOException {
        BufferedInputStream bufferedInputStreamM46719 = abstractC20745.m46719();
        long jMo33964 = abstractC20745.mo33964();
        this.f28369 = new byte[16];
        this.f28368 = 0;
        this.f28372 = 0;
        this.f28370 = bufferedInputStreamM46719;
        try {
            byte[] bArr = new byte[8];
            byte[] bArr2 = new byte[2];
            C21506.m48154(bufferedInputStreamM46719, bArr, 8);
            if (C15157.m36351(0, bArr) != 6436280820912968781L) {
                throw new IOException("Bad magic");
            }
            C21506.m48154(bufferedInputStreamM46719, bArr, 8);
            C21506.m48154(bufferedInputStreamM46719, bArr2, 2);
            this.f28371 = (((jMo33964 - 8) - ((long) 8)) - ((long) 2)) - 10;
            this.f28367 = new C19390(1, str, bArr, bArr2, interfaceC23949);
        } catch (IOException e) {
            C19431.m44468(bufferedInputStreamM46719);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f28372;
        if (i3 == -1) {
            return -1;
        }
        if (this.f28368 >= i3) {
            m21314();
            if (this.f28372 == -1) {
                return -1;
            }
        }
        int i4 = 0;
        do {
            int iMin = Math.min(this.f28372 - this.f28368, i2);
            System.arraycopy(this.f28369, this.f28368, bArr, i, iMin);
            i4 += iMin;
            this.f28368 += iMin;
            i += iMin;
            i2 -= iMin;
            if (i2 == 0) {
                break;
            }
            m21314();
        } while (this.f28372 != -1);
        return i4;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f28372;
        if (i == -1) {
            return -1;
        }
        if (this.f28368 >= i) {
            m21314();
            if (this.f28372 == -1) {
                return -1;
            }
        }
        int i2 = this.f28368;
        this.f28368 = i2 + 1;
        return this.f28369[i2] & 255;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m21314() throws IOException {
        if (this.f28372 == -1) {
            throw new IllegalStateException();
        }
        long j = this.f28371;
        InputStream inputStream = this.f28370;
        C19390 c19390 = this.f28367;
        if (j == 0) {
            this.f28372 = -1;
            byte[] bArrM44439 = c19390.m44439();
            byte[] bArr = new byte[10];
            C21506.m48154(inputStream, bArr, 10);
            for (int i = 0; i < 10; i++) {
                if (bArr[i] != bArrM44439[i]) {
                    throw new IOException("Reached end of data for this entry, but aes verification failed");
                }
            }
            return;
        }
        int iMin = (int) Math.min(16L, j);
        byte[] bArr2 = this.f28369;
        int iM48149 = C21506.m48149(inputStream, bArr2, iMin);
        this.f28372 = iM48149;
        if (iM48149 == 0) {
            this.f28372 = -1;
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
        c19390.m44438(iM48149, bArr2);
        this.f28368 = 0;
        this.f28371 -= (long) this.f28372;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f28370.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m21315() {
        return this.f28371;
    }
}
