package l;

import android.media.MediaCodec;
import android.os.Build;

/* JADX INFO: renamed from: l.ܿۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8UZ */
/* JADX INFO: loaded from: classes5.dex */
public class C18150 extends C15384 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f59349;

    public C18150(IllegalStateException illegalStateException, C0251 c0251) {
        int iM19468;
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(c0251 == null ? null : c0251.f1533);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        String diagnosticInfo = z ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null;
        if (Build.VERSION.SDK_INT < 23) {
            iM19468 = C7116.m19468(diagnosticInfo);
        } else {
            iM19468 = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
        }
        this.f59349 = iM19468;
    }
}
