package org.bouncycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import l.C10235;
import l.InterfaceC20818;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes.dex */
public class DigestInputStream extends FilterInputStream implements InterfaceC20818 {
    public Digest digest;

    public DigestInputStream(InputStream inputStream, Digest digest) {
        super(inputStream);
        this.digest = digest;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            this.digest.update((byte) i);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 > 0) {
            this.digest.update(bArr, i, i3);
        }
        return i3;
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }
}
