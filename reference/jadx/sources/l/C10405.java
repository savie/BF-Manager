package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۢ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB0Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10405 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f33093;

    public C10405(ByteBuffer byteBuffer) {
        this.f33093 = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m26716() {
        return this.f33093.getShort() & HPKE.aead_EXPORT_ONLY;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m26714() {
        return ((long) this.f33093.getInt()) & 4294967295L;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m26715() {
        return this.f33093.getInt();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26713(int i) {
        ByteBuffer byteBuffer = this.f33093;
        byteBuffer.position(byteBuffer.position() + i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m26712() {
        return this.f33093.position();
    }
}
