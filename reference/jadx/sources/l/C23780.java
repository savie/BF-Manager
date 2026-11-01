package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩻ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZP */
/* JADX INFO: loaded from: classes.dex */
public final class C23780 extends C11080 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m52320(int i) {
        ByteBuffer byteBuffer = this.f37606.f53556;
        int i2 = ((int) this.f37608) + i;
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
