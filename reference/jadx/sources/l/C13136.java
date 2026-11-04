package l;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.۫۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes4.dex */
public final class C13136 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42019;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16774 f42020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CRC32 f42021;

    public C13136(BufferedOutputStream bufferedOutputStream, C16774 c16774) {
        super(bufferedOutputStream);
        this.f42021 = new CRC32();
        this.f42019 = true;
        this.f42020 = c16774;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m32649() {
        return this.f42021.getValue();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32650() {
        this.f42019 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        C16774 c16774 = this.f42020;
        if (c16774 != null) {
            c16774.m39606();
        }
        ((FilterOutputStream) this).out.write(i);
        if (this.f42019) {
            this.f42021.update(i);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C16774 c16774 = this.f42020;
        if (c16774 != null) {
            c16774.m39606();
        }
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        if (this.f42019) {
            this.f42021.update(bArr, i, i2);
        }
    }
}
