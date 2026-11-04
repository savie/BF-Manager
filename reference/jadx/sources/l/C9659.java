package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: l.ۡ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB0Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C9659 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5844 m25173(MappedByteBuffer mappedByteBuffer) throws IOException {
        long jM26714;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        C10405 c10405 = new C10405(byteBufferDuplicate);
        c10405.m26713(4);
        int iM26716 = c10405.m26716();
        if (iM26716 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        c10405.m26713(6);
        int i = 0;
        while (true) {
            if (i >= iM26716) {
                jM26714 = -1;
                break;
            }
            int iM26715 = c10405.m26715();
            c10405.m26713(4);
            jM26714 = c10405.m26714();
            c10405.m26713(4);
            if (1835365473 == iM26715) {
                break;
            }
            i++;
        }
        if (jM26714 != -1) {
            c10405.m26713((int) (jM26714 - c10405.m26712()));
            c10405.m26713(12);
            long jM26715 = c10405.m26714();
            for (int i2 = 0; i2 < jM26715; i2++) {
                int iM26717 = c10405.m26715();
                long jM26716 = c10405.m26714();
                c10405.m26714();
                if (1164798569 == iM26717 || 1701669481 == iM26717) {
                    byteBufferDuplicate.position((int) new C1457(jM26716 + jM26714).m5232());
                    return C5844.m17027(byteBufferDuplicate);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
