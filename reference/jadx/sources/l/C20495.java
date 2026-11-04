package l;

import com.umeng.analytics.pro.bo;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.᩵ۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20495 extends CharsetDecoder {
    public static boolean a(int i, int i2, int i3) {
        return ((i != -32 || (i2 & BERTags.FLAGS) != 128) && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
    }

    public static boolean b(int i, int i2) {
        if (i != 240 || (i2 >= 144 && i2 <= 191)) {
            return (i == 244 && (i2 & 240) != 128) || (i2 & 192) != 128;
        }
        return true;
    }

    public static boolean c(int i) {
        return (i & 192) != 128;
    }

    public C20495(C6325 c6325) {
        super(c6325, 1.0f, 1.0f);
    }

    public static CoderResult e(ByteBuffer byteBuffer, int i) {
        int i2 = 1;
        if (i == 1 || i == 2) {
            return CoderResult.malformedForLength(1);
        }
        if (i == 3) {
            byte b = byteBuffer.get();
            byte b2 = byteBuffer.get();
            if ((b != -32 || (b2 & bo.k) != 128) && !c(b2)) {
                i2 = 2;
            }
            return CoderResult.malformedForLength(i2);
        }
        if (i != 4) {
            return null;
        }
        int i3 = byteBuffer.get() & 255;
        byte b3 = byteBuffer.get();
        int i4 = b3 & 255;
        if (i3 > 244 || ((i3 == 240 && (i4 < 144 || i4 > 191)) || ((i3 == 244 && (b3 & 240) != 128) || c(i4)))) {
            return CoderResult.malformedForLength(1);
        }
        if (c(byteBuffer.get())) {
            return CoderResult.malformedForLength(2);
        }
        return CoderResult.malformedForLength(3);
    }

    public static CoderResult d(ByteBuffer byteBuffer, int i, CharBuffer charBuffer, int i2, int i3) {
        CoderResult coderResultE = e(byteBuffer, i3);
        C6325.i(byteBuffer, i, charBuffer, i2);
        return coderResultE;
    }

    public static CoderResult g(Buffer buffer, int i, int i2, Buffer buffer2, int i3, int i4) {
        C6325.i(buffer, i, buffer2, i3);
        return (i4 == 0 || i2 - i < i4) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    public static CoderResult f(Buffer buffer, int i, int i2) {
        buffer.position(i);
        return (i2 == 0 || buffer.remaining() < i2) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x029a, code lost:
    
        if ((r1 & 192) != r3) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
    
        if ((r1 & 192) != r5) goto L59;
     */
    @Override // java.nio.charset.CharsetDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.charset.CoderResult decodeLoop(java.nio.ByteBuffer r20, java.nio.CharBuffer r21) {
        /*
            Method dump skipped, instruction units count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20495.decodeLoop(java.nio.ByteBuffer, java.nio.CharBuffer):java.nio.charset.CoderResult");
    }
}
