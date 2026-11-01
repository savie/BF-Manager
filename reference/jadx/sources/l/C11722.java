package l;

import java.io.IOException;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۨ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1SM */
/* JADX INFO: loaded from: classes4.dex */
public final class C11722 extends AbstractC23366 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC21330 f39400;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20625 f39401;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC23366 f39402;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f39404;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17720 f39405;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC9606 f39407;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f39396 = true;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f39398 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f39397 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f39409 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f39403 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public IOException f39406 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f39408 = new byte[6];

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f39399 = new byte[1];

    public C11722(AbstractC23366 abstractC23366, C13839 c13839, C17720 c17720) {
        abstractC23366.getClass();
        this.f39405 = c17720;
        this.f39402 = abstractC23366;
        this.f39401 = new C20625(c17720);
        int iM33666 = c13839.m33666();
        AbstractC21330 abstractC21330M47843 = AbstractC21330.m47843(this.f39401, c13839.m33660(), c13839.m33661(), c13839.m33669(), iM33666, 65536 > iM33666 ? 65536 - iM33666 : 0, c13839.m33668(), c13839.m33665(), c13839.m33662(), c17720);
        this.f39400 = abstractC21330M47843;
        this.f39407 = abstractC21330M47843.m47853();
        this.f39404 = c13839.m33660() + (c13839.m33661() * 45);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f39399;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f39406;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f39403) {
            throw new C21599("Stream finished or closed");
        }
        while (i2 > 0) {
            try {
                int iM24489 = this.f39407.m24489(i, i2, bArr);
                i += iM24489;
                i2 -= iM24489;
                this.f39409 += iM24489;
                if (this.f39400.m47855()) {
                    m29305();
                }
            } catch (IOException e) {
                this.f39406 = e;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29305() throws IOException {
        int i;
        int iM46488 = this.f39401.m46488();
        int iM47856 = this.f39400.m47856();
        int i2 = iM46488 + 2;
        byte[] bArr = this.f39408;
        if (i2 >= iM47856) {
            this.f39400.mo10858();
            iM47856 = this.f39400.m47856();
            int i3 = iM47856;
            while (i3 > 0) {
                int iMin = Math.min(i3, 65536);
                bArr[0] = (byte) (this.f39396 ? 1 : 2);
                int i4 = iMin - 1;
                bArr[1] = (byte) (i4 >>> 8);
                bArr[2] = (byte) i4;
                this.f39402.write(bArr, 0, 3);
                this.f39407.m24490(this.f39402, i3, iMin);
                i3 -= iMin;
                this.f39396 = false;
            }
            this.f39398 = true;
        } else {
            boolean z = this.f39397;
            if (z) {
                i = this.f39396 ? BERTags.FLAGS : 192;
            } else {
                i = this.f39398 ? DHParameters.DEFAULT_MINIMUM_LENGTH : 128;
            }
            int i5 = iM47856 - 1;
            bArr[0] = (byte) (i | (i5 >>> 16));
            bArr[1] = (byte) (i5 >>> 8);
            bArr[2] = (byte) i5;
            int i6 = iM46488 - 1;
            bArr[3] = (byte) (i6 >>> 8);
            bArr[4] = (byte) i6;
            if (z) {
                bArr[5] = (byte) this.f39404;
                this.f39402.write(bArr, 0, 6);
            } else {
                this.f39402.write(bArr, 0, 5);
            }
            this.f39401.m46489(this.f39402);
            this.f39397 = false;
            this.f39398 = false;
            this.f39396 = false;
        }
        this.f39409 -= iM47856;
        this.f39400.m47846();
        this.f39401.m46493();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m29306() throws IOException {
        IOException iOException = this.f39406;
        if (iOException != null) {
            throw iOException;
        }
        this.f39407.m24492();
        while (this.f39409 > 0) {
            try {
                this.f39400.m47855();
                m29305();
            } catch (IOException e) {
                this.f39406 = e;
                throw e;
            }
        }
        this.f39402.write(0);
        this.f39403 = true;
        AbstractC21330 abstractC21330 = this.f39400;
        C17720 c17720 = this.f39405;
        abstractC21330.m47852(c17720);
        this.f39400 = null;
        this.f39407 = null;
        this.f39401.m46490(c17720);
        this.f39401 = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f39406;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f39403) {
            throw new C21599("Stream finished or closed");
        }
        try {
            this.f39407.m24498();
            while (this.f39409 > 0) {
                this.f39400.m47855();
                m29305();
            }
            this.f39402.flush();
        } catch (IOException e) {
            this.f39406 = e;
            throw e;
        }
    }

    @Override // l.AbstractC23366
    public final void finish() throws IOException {
        if (this.f39403) {
            return;
        }
        m29306();
        try {
            this.f39402.finish();
        } catch (IOException e) {
            this.f39406 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f39402 != null) {
            if (!this.f39403) {
                try {
                    m29306();
                } catch (IOException unused) {
                }
            }
            try {
                this.f39402.close();
            } catch (IOException e) {
                if (this.f39406 == null) {
                    this.f39406 = e;
                }
            }
            this.f39402 = null;
        }
        IOException iOException = this.f39406;
        if (iOException != null) {
            throw iOException;
        }
    }
}
