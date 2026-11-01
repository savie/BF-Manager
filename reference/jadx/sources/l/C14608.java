package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܳܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5VW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14608 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f47802;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f47803;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23780 f47804;

    public C14608(C16724 c16724, C23780 c23780, int i) {
        ByteBuffer byteBuffer = c16724.f53556;
        this.f47804 = c23780;
        this.f47802 = byteBuffer.getInt(i);
        if (c16724.f53558) {
            byteBuffer.get(i + 4);
            byteBuffer.get(i + 5);
            byteBuffer.getShort(i + 6);
            this.f47803 = byteBuffer.getLong(i + 8);
            byteBuffer.getInt(i + 16);
            return;
        }
        this.f47803 = ((long) byteBuffer.getInt(i + 4)) & 4294967295L;
        byteBuffer.getInt(i + 8);
        byteBuffer.get(i + 12);
        byteBuffer.get(i + 13);
        byteBuffer.getShort(i + 14);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C23780 c23780 = this.f47804;
        sb.append(c23780 == null ? null : c23780.m52320(this.f47802));
        sb.append('@');
        sb.append(Long.toHexString(this.f47803));
        return sb.toString();
    }
}
