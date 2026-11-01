package l;

import android.media.MediaCodec;
import android.os.Build;

/* JADX INFO: renamed from: l.ۖۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8UZ */
/* JADX INFO: loaded from: classes2.dex */
public class C2253 extends C7565 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f8056;

    public C2253(IllegalStateException illegalStateException, C5076 c5076) {
        int iM41821;
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(c5076 == null ? null : c5076.f17691);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        String diagnosticInfo = z ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null;
        if (Build.VERSION.SDK_INT < 23) {
            iM41821 = C17983.m41821(diagnosticInfo);
        } else {
            iM41821 = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
        }
        this.f8056 = iM41821;
    }
}
