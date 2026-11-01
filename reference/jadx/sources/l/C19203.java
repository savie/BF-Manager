package l;

import com.github.luben.zstd.ZstdInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩵ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A6V5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19203 extends ZstdInputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12107 f62016;

    public C19203(C12107 c12107, InputStream inputStream) {
        super(inputStream);
        this.f62016 = c12107;
    }

    @Override // com.github.luben.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws ZipException {
        try {
            return super.read();
        } catch (IOException e) {
            C21506.m48152(e, this.f62016);
            throw null;
        }
    }

    @Override // com.github.luben.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            C21506.m48152(e, this.f62016);
            throw null;
        }
    }

    @Override // com.github.luben.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws ZipException {
        try {
            return super.skip(j);
        } catch (IOException e) {
            C21506.m48152(e, this.f62016);
            throw null;
        }
    }
}
