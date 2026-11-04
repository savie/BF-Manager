package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܿܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5VW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18437 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f60034;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f60035;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21421 f60036;

    public C18437(C12470 c12470, C21421 c21421, int i) {
        ByteBuffer byteBuffer = c12470.f40054;
        this.f60036 = c21421;
        this.f60034 = byteBuffer.getInt(i);
        if (c12470.f40056) {
            byteBuffer.get(i + 4);
            byteBuffer.get(i + 5);
            byteBuffer.getShort(i + 6);
            this.f60035 = byteBuffer.getLong(i + 8);
            byteBuffer.getInt(i + 16);
            return;
        }
        this.f60035 = ((long) byteBuffer.getInt(i + 4)) & 4294967295L;
        byteBuffer.getInt(i + 8);
        byteBuffer.get(i + 12);
        byteBuffer.get(i + 13);
        byteBuffer.getShort(i + 14);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21421 c21421 = this.f60036;
        sb.append(c21421 == null ? null : c21421.m48723(this.f60034));
        sb.append('@');
        sb.append(Long.toHexString(this.f60035));
        return sb.toString();
    }
}
