package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۖᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C2860 extends C19268 {
    public C2860(byte[] bArr) {
        super(bArr);
        this.f62311.mark(Integer.MAX_VALUE);
    }

    public C2860(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f62311.mark(Integer.MAX_VALUE);
    }

    public final void seek(long j) throws IOException {
        int i = this.f62307;
        if (i > j) {
            this.f62307 = 0;
            this.f62311.reset();
        } else {
            j -= (long) i;
        }
        m44602((int) j);
    }
}
