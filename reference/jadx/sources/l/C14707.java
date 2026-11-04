package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܰܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5JT */
/* JADX INFO: loaded from: classes4.dex */
public class C14707 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f48048;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C12470 f48049;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f48050;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f48051;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f48052;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f48053;

    public C14707(C12470 c12470, int i) {
        ByteBuffer byteBuffer = c12470.f40054;
        this.f48049 = c12470;
        this.f48051 = byteBuffer.getInt(i);
        byteBuffer.getInt(i + 4);
        if (c12470.f40056) {
            byteBuffer.getLong(i + 8);
            byteBuffer.getLong(i + 16);
            this.f48048 = byteBuffer.getLong(i + 24);
            this.f48052 = byteBuffer.getLong(i + 32);
            this.f48053 = byteBuffer.getInt(i + 40);
            byteBuffer.getInt(i + 44);
            byteBuffer.getLong(i + 48);
            this.f48050 = byteBuffer.getLong(i + 56);
            return;
        }
        byteBuffer.getInt(i + 8);
        byteBuffer.getInt(i + 12);
        this.f48048 = ((long) byteBuffer.getInt(i + 16)) & 4294967295L;
        this.f48052 = ((long) byteBuffer.getInt(i + 20)) & 4294967295L;
        this.f48053 = byteBuffer.getInt(i + 24);
        byteBuffer.getInt(i + 28);
        byteBuffer.getInt(i + 32);
        this.f48050 = byteBuffer.getInt(i + 36);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        C21421 c21421 = this.f48049.f40057;
        sb.append(c21421 == null ? null : c21421.m48723(this.f48051));
        sb.append(')');
        return sb.toString();
    }
}
