package l;

import com.alipay.sdk.m.w.a;
import java.nio.Buffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: renamed from: l.۬᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13347 extends AbstractC4173 {
    public static final C13347 a;

    static {
        int i = AbstractC5585.a;
        a = new C13347(a.D, new String[]{"UTF8", "unicode-1-1-utf-8"});
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new C22519(this);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new C1351(this);
    }

    public static final void l(Buffer buffer, int i, Buffer buffer2, int i2) {
        buffer.position(i - buffer.arrayOffset());
        buffer2.position(i2 - buffer2.arrayOffset());
    }
}
