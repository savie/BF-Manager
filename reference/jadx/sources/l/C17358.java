package l;

import com.github.luben.zstd.Zstd;
import com.github.luben.zstd.ZstdCompressCtx;
import com.github.luben.zstd.ZstdDecompressCtx;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܿ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6WV */
/* JADX INFO: loaded from: classes4.dex */
public final class C17358 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f55223;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f55225;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f55227;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C19805 f55221 = new C19805(3);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C19805 f55220 = new C19805(3);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19551 f55228 = new C19551();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final OutputStream f55226 = new C12420(this);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] f55222 = new byte[65536];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f55224 = new byte[0];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9856 m40393() {
        this.f55228.m44640();
        this.f55225 = 0;
        this.f55227 = 0;
        this.f55223 = false;
        return new C9856(new C12678(this.f55222, this.f55226));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m40390() {
        return this.f55223 || this.f55228.f62830 > 8388608;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m40386(C17358 c17358) {
        c17358.f55223 = true;
        C19551 c19551 = c17358.f55228;
        c19551.m44640();
        c19551.f62829 = new byte[0];
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static ZstdCompressCtx m40387() {
        ZstdCompressCtx zstdCompressCtx = (ZstdCompressCtx) f55221.m45009();
        if (zstdCompressCtx != null) {
            return zstdCompressCtx;
        }
        ZstdCompressCtx zstdCompressCtx2 = new ZstdCompressCtx();
        try {
            return zstdCompressCtx2.setLevel(3).setChecksum(true).setContentSize(true).loadDict(C6069.m16473());
        } catch (IOException | RuntimeException e) {
            C19431.m44468(zstdCompressCtx2);
            throw new IllegalStateException("Unable to initialize smali cache compressor", e);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static ZstdDecompressCtx m40383() {
        ZstdDecompressCtx zstdDecompressCtx = (ZstdDecompressCtx) f55220.m45009();
        if (zstdDecompressCtx != null) {
            return zstdDecompressCtx;
        }
        ZstdDecompressCtx zstdDecompressCtx2 = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx2.loadDict(C6069.m16473());
        } catch (IOException | RuntimeException e) {
            C19431.m44468(zstdDecompressCtx2);
            throw new IllegalStateException("Unable to initialize smali cache decompressor", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40384(C19805 c19805, AutoCloseable autoCloseable, boolean z) {
        if (autoCloseable != null) {
            if (z && c19805.m45011(autoCloseable)) {
                return;
            }
            C19431.m44468(autoCloseable);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40391() throws IOException {
        C19805 c19805 = f55221;
        C19551 c19551 = this.f55228;
        int i = c19551.f62830;
        this.f55225 = i;
        this.f55227 = 0;
        if (this.f55223 || i > 8388608) {
            throw new IOException("Smali cache content is too large");
        }
        try {
            try {
                long jCompressBound = Zstd.compressBound(i);
                if (jCompressBound < 0 || jCompressBound > 2147483639) {
                    throw new IOException("Smali cache compressed buffer is too large");
                }
                if (this.f55224.length < jCompressBound) {
                    this.f55224 = new byte[(int) jCompressBound];
                }
                ZstdCompressCtx zstdCompressCtxM40387 = m40387();
                byte[] bArr = this.f55224;
                int iCompressByteArray = zstdCompressCtxM40387.compressByteArray(bArr, 0, bArr.length, c19551.f62829, 0, this.f55225);
                this.f55227 = iCompressByteArray;
                byte[] bArr2 = this.f55224;
                if (!(iCompressByteArray >= 5 && (4 & bArr2[4]) != 0) || Zstd.getDictIdFromFrame(bArr2) != 1773473561 || Zstd.getFrameContentSize(this.f55224, 0, this.f55227) != this.f55225 || Zstd.findFrameCompressedSize(this.f55224, 0, this.f55227) != this.f55227) {
                    throw new IOException("Invalid compressed smali cache frame");
                }
                m40384(c19805, (AutoCloseable) zstdCompressCtxM40387, true);
            } catch (RuntimeException e) {
                throw new IOException("Failed to compress smali cache", e);
            }
        } catch (Throwable th) {
            m40384(c19805, (AutoCloseable) null, false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40392(int i, int i2, byte[] bArr) throws Throwable {
        C19805 c19805 = f55220;
        C19551 c19551 = this.f55228;
        c19551.m44640();
        this.f55225 = 0;
        this.f55223 = false;
        if (i >= 0 && i2 > 0) {
            long j = i2;
            if (((long) i) + j <= bArr.length) {
                if (i2 < 5 || (bArr[i + 4] & 4) == 0) {
                    throw new IOException("Smali cache frame checksum is missing");
                }
                ZstdDecompressCtx zstdDecompressCtx = null;
                try {
                    try {
                        long jFindFrameCompressedSize = Zstd.findFrameCompressedSize(bArr, i, i2);
                        if (Zstd.isError(jFindFrameCompressedSize) || jFindFrameCompressedSize != j) {
                            throw new IOException("Smali cache frame length is invalid");
                        }
                        long frameContentSize = Zstd.getFrameContentSize(bArr, i, i2);
                        if (frameContentSize < 0 || frameContentSize > X931RNG.BLOCK128_RESEED_MAX) {
                            throw new IOException("Smali cache content size is invalid");
                        }
                        int i3 = (int) frameContentSize;
                        if (c19551.f62829.length < i3) {
                            c19551.f62829 = new byte[i3];
                        }
                        ZstdDecompressCtx zstdDecompressCtxM40383 = m40383();
                        try {
                            if (zstdDecompressCtxM40383.decompressByteArray(c19551.f62829, 0, i3, bArr, i, i2) != i3) {
                                throw new IOException("Smali cache decompressed length is invalid");
                            }
                            this.f55225 = i3;
                            m40384(c19805, (AutoCloseable) zstdDecompressCtxM40383, true);
                            return;
                        } catch (RuntimeException e) {
                            e = e;
                            throw new IOException("Failed to decompress smali cache", e);
                        } catch (Throwable th) {
                            th = th;
                            zstdDecompressCtx = zstdDecompressCtxM40383;
                            m40384(c19805, (AutoCloseable) zstdDecompressCtx, false);
                            throw th;
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        throw new IOException("Smali cache frame range is invalid");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m40396() {
        return this.f55228.f62829;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m40389() {
        return this.f55225;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m40395() {
        return this.f55224;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m40394() {
        return this.f55227;
    }
}
