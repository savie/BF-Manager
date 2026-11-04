package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩶ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZP */
/* JADX INFO: loaded from: classes2.dex */
public final class C21421 extends C14707 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48723(int i) {
        ByteBuffer byteBuffer = this.f48049.f40054;
        int i2 = ((int) this.f48048) + i;
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte b = byteBuffer.get(i2);
            if (b != 0) {
                sb.append((char) b);
                i2++;
            } else {
                return sb.toString();
            }
        }
    }
}
