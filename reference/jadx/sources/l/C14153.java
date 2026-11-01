package l;

import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܰ᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes4.dex */
public final class C14153 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f46451;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f46452;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f46453;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f46454;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f46455;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f46456;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f46457;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f46458;

    public C14153(int i, int i2, int i3, int i4, float f, String str, String str2, int i5) {
        this.f46456 = i;
        this.f46452 = i2;
        this.f46453 = i3;
        this.f46458 = i4;
        this.f46455 = f;
        this.f46457 = str;
        this.f46451 = str2;
        this.f46454 = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14153)) {
            return false;
        }
        C14153 c14153 = (C14153) obj;
        return this.f46456 == c14153.f46456 && this.f46452 == c14153.f46452 && this.f46453 == c14153.f46453 && this.f46458 == c14153.f46458 && this.f46454 == c14153.f46454 && this.f46455 == c14153.f46455 && C13638.equals(this.f46457, c14153.f46457) && C13638.equals(this.f46451, c14153.f46451);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f46451) + C0589.m2789((Float.floatToIntBits(this.f46455) + (((((((((this.f46456 * 31) + this.f46452) * 31) + this.f46453) * 31) + this.f46458) * 31) + this.f46454) * 31)) * 31, 31, this.f46457);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f46456), Integer.valueOf(this.f46452), Integer.valueOf(this.f46453), Integer.valueOf(this.f46458), Float.valueOf(this.f46455), this.f46457, this.f46451, Integer.valueOf(this.f46454)};
        String[] strArrSplit = "width;height;averageBitrate;peakBitrate;frameRate;codecs;sampleMimeType;matchingOrdinal".length() == 0 ? new String[0] : "width;height;averageBitrate;peakBitrate;frameRate;codecs;sampleMimeType;matchingOrdinal".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C14153.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34229() {
        return this.f46454;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Bundle m34230() {
        Bundle bundle = new Bundle();
        bundle.putInt("schema", 1);
        bundle.putInt("width", this.f46456);
        bundle.putInt("height", this.f46452);
        bundle.putInt("average_bitrate", this.f46453);
        bundle.putInt("peak_bitrate", this.f46458);
        bundle.putFloat("frame_rate", this.f46455);
        bundle.putString("codecs", this.f46457);
        bundle.putString("sample_mime_type", this.f46451);
        bundle.putInt("matching_ordinal", this.f46454);
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34228(C14153 c14153, C7648 c7648) {
        return c14153.f46456 == c7648.f25246 && c14153.f46452 == c7648.f25253 && c14153.f46453 == c7648.f25259 && c14153.f46458 == c7648.f25266 && Float.compare(c14153.f46455, c7648.f25273) == 0 && TextUtils.equals(c14153.f46457, c7648.f25277) && TextUtils.equals(c14153.f46451, c7648.f25265);
    }
}
