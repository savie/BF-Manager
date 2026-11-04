package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۛܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 954P */
/* JADX INFO: loaded from: classes3.dex */
public final class C6505 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f21843;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7996 f21844;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f21845;

    public C6505(C12470 c12470, C4267 c4267, int i) {
        ByteBuffer byteBuffer = c12470.f40054;
        C14707 c14707 = c4267.f48049.f40055[c4267.f48053];
        long j = c4267.f48050;
        this.f21844 = (C7996) c14707;
        if (c12470.f40056) {
            byteBuffer.getLong(i);
            this.f21845 = byteBuffer.getLong(i + 8);
            this.f21843 = j >= 24 ? byteBuffer.getLong(i + 16) : 0L;
        } else {
            byteBuffer.getInt(i);
            this.f21845 = byteBuffer.getInt(i + 4);
            this.f21843 = j >= 12 ? byteBuffer.getInt(i + 8) : 0L;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.f21845;
        C18437 c18437M21802 = this.f21844.m21802((int) (j >>> 32));
        C21421 c21421 = c18437M21802.f60036;
        sb.append(c21421 == null ? null : c21421.m48723(c18437M21802.f60034));
        sb.append('(');
        sb.append((int) j);
        sb.append(')');
        sb.append(this.f21843);
        return sb.toString();
    }
}
