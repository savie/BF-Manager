package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۧܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5JT */
/* JADX INFO: loaded from: classes3.dex */
public class C11080 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f37605;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16724 f37606;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f37607;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f37608;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f37609;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f37610;

    public C11080(C16724 c16724, int i) {
        ByteBuffer byteBuffer = c16724.f53556;
        this.f37606 = c16724;
        this.f37605 = byteBuffer.getInt(i);
        byteBuffer.getInt(i + 4);
        if (c16724.f53558) {
            byteBuffer.getLong(i + 8);
            byteBuffer.getLong(i + 16);
            this.f37608 = byteBuffer.getLong(i + 24);
            this.f37609 = byteBuffer.getLong(i + 32);
            this.f37610 = byteBuffer.getInt(i + 40);
            byteBuffer.getInt(i + 44);
            byteBuffer.getLong(i + 48);
            this.f37607 = byteBuffer.getLong(i + 56);
            return;
        }
        byteBuffer.getInt(i + 8);
        byteBuffer.getInt(i + 12);
        this.f37608 = ((long) byteBuffer.getInt(i + 16)) & 4294967295L;
        this.f37609 = ((long) byteBuffer.getInt(i + 20)) & 4294967295L;
        this.f37610 = byteBuffer.getInt(i + 24);
        byteBuffer.getInt(i + 28);
        byteBuffer.getInt(i + 32);
        this.f37607 = byteBuffer.getInt(i + 36);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        C23780 c23780 = this.f37606.f53555;
        sb.append(c23780 == null ? null : c23780.m52320(this.f37605));
        sb.append(')');
        return sb.toString();
    }
}
