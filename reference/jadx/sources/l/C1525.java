package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֫ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B7V */
/* JADX INFO: loaded from: classes2.dex */
public final class C1525 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f6222;

    public C1525(ByteBuffer byteBuffer) {
        this.f6222 = byteBuffer.slice();
    }

    public C1525(byte[] bArr) {
        this.f6222 = ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m5292() {
        return this.f6222.slice();
    }
}
