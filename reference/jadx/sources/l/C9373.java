package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C9373 extends C10784 {
    public C9373(byte[] bArr) {
        super(bArr);
        this.f36737.mark(Integer.MAX_VALUE);
    }

    public C9373(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f36737.mark(Integer.MAX_VALUE);
    }

    public final void seek(long j) throws IOException {
        int i = this.f36736;
        if (i > j) {
            this.f36736 = 0;
            this.f36737.reset();
        } else {
            j -= (long) i;
        }
        m27080((int) j);
    }
}
