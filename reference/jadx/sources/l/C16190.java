package l;

import java.io.IOException;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܶܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A1SM */
/* JADX INFO: loaded from: classes5.dex */
public final class C16190 extends AbstractC13207 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC13207 f52557;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f52558;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C7461 f52560;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC0749 f52564;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0573 f52566;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC25362 f52568;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f52567 = true;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f52565 = true;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f52562 = true;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f52563 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f52561 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public IOException f52556 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f52569 = new byte[6];

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f52559 = new byte[1];

    public C16190(AbstractC13207 abstractC13207, C17682 c17682, C0573 c0573) {
        abstractC13207.getClass();
        this.f52566 = c0573;
        this.f52557 = abstractC13207;
        this.f52560 = new C7461(c0573);
        int iM41357 = c17682.m41357();
        AbstractC0749 abstractC0749M3083 = AbstractC0749.m3083(this.f52560, c17682.m41353(), c17682.m41348(), c17682.m41355(), iM41357, 65536 > iM41357 ? 65536 - iM41357 : 0, c17682.m41352(), c17682.m41356(), c17682.m41349(), c0573);
        this.f52564 = abstractC0749M3083;
        this.f52568 = abstractC0749M3083.m3094();
        this.f52558 = c17682.m41353() + (c17682.m41348() * 45);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f52559;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f52556;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f52561) {
            throw new C18428("Stream finished or closed");
        }
        while (i2 > 0) {
            try {
                int iM56720 = this.f52568.m56720(i, i2, bArr);
                i += iM56720;
                i2 -= iM56720;
                this.f52563 += iM56720;
                if (this.f52564.m3098()) {
                    m38420();
                }
            } catch (IOException e) {
                this.f52556 = e;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38420() throws IOException {
        int i;
        int iM20484 = this.f52560.m20484();
        int iM3096 = this.f52564.m3096();
        int i2 = iM20484 + 2;
        byte[] bArr = this.f52569;
        if (i2 >= iM3096) {
            this.f52564.mo3090();
            iM3096 = this.f52564.m3096();
            int i3 = iM3096;
            while (i3 > 0) {
                int iMin = Math.min(i3, 65536);
                bArr[0] = (byte) (this.f52567 ? 1 : 2);
                int i4 = iMin - 1;
                bArr[1] = (byte) (i4 >>> 8);
                bArr[2] = (byte) i4;
                this.f52557.write(bArr, 0, 3);
                this.f52568.m56721(this.f52557, i3, iMin);
                i3 -= iMin;
                this.f52567 = false;
            }
            this.f52565 = true;
        } else {
            boolean z = this.f52562;
            if (z) {
                i = this.f52567 ? BERTags.FLAGS : 192;
            } else {
                i = this.f52565 ? DHParameters.DEFAULT_MINIMUM_LENGTH : 128;
            }
            int i5 = iM3096 - 1;
            bArr[0] = (byte) (i | (i5 >>> 16));
            bArr[1] = (byte) (i5 >>> 8);
            bArr[2] = (byte) i5;
            int i6 = iM20484 - 1;
            bArr[3] = (byte) (i6 >>> 8);
            bArr[4] = (byte) i6;
            if (z) {
                bArr[5] = (byte) this.f52558;
                this.f52557.write(bArr, 0, 6);
            } else {
                this.f52557.write(bArr, 0, 5);
            }
            this.f52560.m20486(this.f52557);
            this.f52562 = false;
            this.f52565 = false;
            this.f52567 = false;
        }
        this.f52563 -= iM3096;
        this.f52564.m3095();
        this.f52560.m20490();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m38421() throws IOException {
        IOException iOException = this.f52556;
        if (iOException != null) {
            throw iOException;
        }
        this.f52568.m56725();
        while (this.f52563 > 0) {
            try {
                this.f52564.m3098();
                m38420();
            } catch (IOException e) {
                this.f52556 = e;
                throw e;
            }
        }
        this.f52557.write(0);
        this.f52561 = true;
        AbstractC0749 abstractC0749 = this.f52564;
        C0573 c0573 = this.f52566;
        abstractC0749.m3092(c0573);
        this.f52564 = null;
        this.f52568 = null;
        this.f52560.m20487(c0573);
        this.f52560 = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f52556;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f52561) {
            throw new C18428("Stream finished or closed");
        }
        try {
            this.f52568.m56724();
            while (this.f52563 > 0) {
                this.f52564.m3098();
                m38420();
            }
            this.f52557.flush();
        } catch (IOException e) {
            this.f52556 = e;
            throw e;
        }
    }

    @Override // l.AbstractC13207
    public final void finish() throws IOException {
        if (this.f52561) {
            return;
        }
        m38421();
        try {
            this.f52557.finish();
        } catch (IOException e) {
            this.f52556 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f52557 != null) {
            if (!this.f52561) {
                try {
                    m38421();
                } catch (IOException unused) {
                }
            }
            try {
                this.f52557.close();
            } catch (IOException e) {
                if (this.f52556 == null) {
                    this.f52556 = e;
                }
            }
            this.f52557 = null;
        }
        IOException iOException = this.f52556;
        if (iOException != null) {
            throw iOException;
        }
    }
}
