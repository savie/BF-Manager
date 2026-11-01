package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: l.᩻ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB0Y */
/* JADX INFO: loaded from: classes.dex */
public final class C23401 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12900 m51538(MappedByteBuffer mappedByteBuffer) throws IOException {
        long jM15882;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        C5761 c5761 = new C5761(byteBufferDuplicate);
        c5761.m15881(4);
        int iM15879 = c5761.m15879();
        if (iM15879 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        c5761.m15881(6);
        int i = 0;
        while (true) {
            if (i >= iM15879) {
                jM15882 = -1;
                break;
            }
            int iM15883 = c5761.m15883();
            c5761.m15881(4);
            jM15882 = c5761.m15882();
            c5761.m15881(4);
            if (1835365473 == iM15883) {
                break;
            }
            i++;
        }
        if (jM15882 != -1) {
            c5761.m15881((int) (jM15882 - c5761.m15880()));
            c5761.m15881(12);
            long jM15883 = c5761.m15882();
            for (int i2 = 0; i2 < jM15883; i2++) {
                int iM15884 = c5761.m15883();
                long jM15884 = c5761.m15882();
                c5761.m15882();
                if (1164798569 == iM15884 || 1701669481 == iM15884) {
                    byteBufferDuplicate.position((int) new C10701(jM15884 + jM15882).m26924());
                    return C12900.m31973(byteBufferDuplicate);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
