package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۛۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB0Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5761 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f19571;

    public C5761(ByteBuffer byteBuffer) {
        this.f19571 = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m15879() {
        return this.f19571.getShort() & HPKE.aead_EXPORT_ONLY;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m15882() {
        return ((long) this.f19571.getInt()) & 4294967295L;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m15883() {
        return this.f19571.getInt();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15881(int i) {
        ByteBuffer byteBuffer = this.f19571;
        byteBuffer.position(byteBuffer.position() + i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m15880() {
        return this.f19571.position();
    }
}
