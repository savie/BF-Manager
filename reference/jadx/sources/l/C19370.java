package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ᩳ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B7V */
/* JADX INFO: loaded from: classes5.dex */
public final class C19370 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f62588;

    public C19370(ByteBuffer byteBuffer) {
        this.f62588 = byteBuffer.slice();
    }

    public C19370(byte[] bArr) {
        this.f62588 = ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m44796() {
        return this.f62588.slice();
    }
}
