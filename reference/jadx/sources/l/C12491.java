package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 954P */
/* JADX INFO: loaded from: classes3.dex */
public final class C12491 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f41780;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9669 f41781;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f41782;

    public C12491(C16724 c16724, C6140 c6140, int i) {
        ByteBuffer byteBuffer = c16724.f53556;
        C11080 c11080 = c6140.f37606.f53557[c6140.f37610];
        long j = c6140.f37607;
        this.f41781 = (C9669) c11080;
        if (c16724.f53558) {
            byteBuffer.getLong(i);
            this.f41782 = byteBuffer.getLong(i + 8);
            this.f41780 = j >= 24 ? byteBuffer.getLong(i + 16) : 0L;
        } else {
            byteBuffer.getInt(i);
            this.f41782 = byteBuffer.getInt(i + 4);
            this.f41780 = j >= 12 ? byteBuffer.getInt(i + 8) : 0L;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.f41782;
        C14608 c14608M24573 = this.f41781.m24573((int) (j >>> 32));
        C23780 c23780 = c14608M24573.f47804;
        sb.append(c23780 == null ? null : c23780.m52320(c14608M24573.f47802));
        sb.append('(');
        sb.append((int) j);
        sb.append(')');
        sb.append(this.f41780);
        return sb.toString();
    }
}
