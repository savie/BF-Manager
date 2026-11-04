package l;

import com.github.luben.zstd.Zstd;
import com.github.luben.zstd.ZstdCompressCtx;
import com.github.luben.zstd.ZstdDecompressCtx;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩶ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6WV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21105 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f67406;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f67407;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f67408;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C20528 f67401 = new C20528(3);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C20528 f67400 = new C20528(3);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9982 f67405 = new C9982();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final OutputStream f67403 = new C14391(this);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f67404 = new byte[65536];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f67402 = new byte[0];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C8018 m48177() {
        this.f67405.m25824();
        this.f67406 = 0;
        this.f67407 = 0;
        this.f67408 = false;
        return new C8018(new C6527(this.f67404, this.f67403));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m48179() {
        return this.f67408 || this.f67405.f32081 > 8388608;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m48170(C21105 c21105) {
        c21105.f67408 = true;
        C9982 c9982 = c21105.f67405;
        c9982.m25824();
        c9982.f32079 = new byte[0];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static ZstdCompressCtx m48169() {
        ZstdCompressCtx zstdCompressCtx = (ZstdCompressCtx) f67401.m47061();
        if (zstdCompressCtx != null) {
            return zstdCompressCtx;
        }
        ZstdCompressCtx zstdCompressCtx2 = new ZstdCompressCtx();
        try {
            return zstdCompressCtx2.setLevel(3).setChecksum(true).setContentSize(true).loadDict(C18121.m42243());
        } catch (IOException | RuntimeException e) {
            C20244.m46520(zstdCompressCtx2);
            throw new IllegalStateException("Unable to initialize smali cache compressor", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ZstdDecompressCtx m48166() {
        ZstdDecompressCtx zstdDecompressCtx = (ZstdDecompressCtx) f67400.m47061();
        if (zstdDecompressCtx != null) {
            return zstdDecompressCtx;
        }
        ZstdDecompressCtx zstdDecompressCtx2 = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx2.loadDict(C18121.m42243());
        } catch (IOException | RuntimeException e) {
            C20244.m46520(zstdDecompressCtx2);
            throw new IllegalStateException("Unable to initialize smali cache decompressor", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48167(C20528 c20528, AutoCloseable autoCloseable, boolean z) {
        if (autoCloseable != null) {
            if (z && c20528.m47060(autoCloseable)) {
                return;
            }
            C20244.m46520(autoCloseable);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48172() throws IOException {
        C20528 c20528 = f67401;
        C9982 c9982 = this.f67405;
        int i = c9982.f32081;
        this.f67406 = i;
        this.f67407 = 0;
        if (this.f67408 || i > 8388608) {
            throw new IOException("Smali cache content is too large");
        }
        try {
            try {
                long jCompressBound = Zstd.compressBound(i);
                if (jCompressBound < 0 || jCompressBound > 2147483639) {
                    throw new IOException("Smali cache compressed buffer is too large");
                }
                if (this.f67402.length < jCompressBound) {
                    this.f67402 = new byte[(int) jCompressBound];
                }
                ZstdCompressCtx zstdCompressCtxM48169 = m48169();
                byte[] bArr = this.f67402;
                int iCompressByteArray = zstdCompressCtxM48169.compressByteArray(bArr, 0, bArr.length, c9982.f32079, 0, this.f67406);
                this.f67407 = iCompressByteArray;
                byte[] bArr2 = this.f67402;
                if (!(iCompressByteArray >= 5 && (4 & bArr2[4]) != 0) || Zstd.getDictIdFromFrame(bArr2) != 1773473561 || Zstd.getFrameContentSize(this.f67402, 0, this.f67407) != this.f67406 || Zstd.findFrameCompressedSize(this.f67402, 0, this.f67407) != this.f67407) {
                    throw new IOException("Invalid compressed smali cache frame");
                }
                m48167(c20528, (AutoCloseable) zstdCompressCtxM48169, true);
            } catch (RuntimeException e) {
                throw new IOException("Failed to compress smali cache", e);
            }
        } catch (Throwable th) {
            m48167(c20528, (AutoCloseable) null, false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48173(int i, int i2, byte[] bArr) throws Throwable {
        C20528 c20528 = f67400;
        C9982 c9982 = this.f67405;
        c9982.m25824();
        this.f67406 = 0;
        this.f67408 = false;
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
                        if (c9982.f32079.length < i3) {
                            c9982.f32079 = new byte[i3];
                        }
                        ZstdDecompressCtx zstdDecompressCtxM48166 = m48166();
                        try {
                            if (zstdDecompressCtxM48166.decompressByteArray(c9982.f32079, 0, i3, bArr, i, i2) != i3) {
                                throw new IOException("Smali cache decompressed length is invalid");
                            }
                            this.f67406 = i3;
                            m48167(c20528, (AutoCloseable) zstdDecompressCtxM48166, true);
                            return;
                        } catch (RuntimeException e) {
                            e = e;
                            throw new IOException("Failed to decompress smali cache", e);
                        } catch (Throwable th) {
                            th = th;
                            zstdDecompressCtx = zstdDecompressCtxM48166;
                            m48167(c20528, (AutoCloseable) zstdDecompressCtx, false);
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

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m48176() {
        return this.f67405.f32079;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m48175() {
        return this.f67406;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m48178() {
        return this.f67402;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m48174() {
        return this.f67407;
    }
}
