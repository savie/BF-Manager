package l;

import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܳۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes5.dex */
public final class C15120 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f49345;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f49346;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f49347;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f49348;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f49349;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f49350;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f49351;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f49352;

    public C15120(int i, int i2, int i3, int i4, float f, String str, String str2, int i5) {
        this.f49346 = i;
        this.f49352 = i2;
        this.f49345 = i3;
        this.f49349 = i4;
        this.f49347 = f;
        this.f49351 = str;
        this.f49348 = str2;
        this.f49350 = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15120)) {
            return false;
        }
        C15120 c15120 = (C15120) obj;
        return this.f49346 == c15120.f49346 && this.f49352 == c15120.f49352 && this.f49345 == c15120.f49345 && this.f49349 == c15120.f49349 && this.f49350 == c15120.f49350 && this.f49347 == c15120.f49347 && C17359.equals(this.f49351, c15120.f49351) && C17359.equals(this.f49348, c15120.f49348);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f49348) + C24966.m55771((Float.floatToIntBits(this.f49347) + (((((((((this.f49346 * 31) + this.f49352) * 31) + this.f49345) * 31) + this.f49349) * 31) + this.f49350) * 31)) * 31, 31, this.f49351);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f49346), Integer.valueOf(this.f49352), Integer.valueOf(this.f49345), Integer.valueOf(this.f49349), Float.valueOf(this.f49347), this.f49351, this.f49348, Integer.valueOf(this.f49350)};
        String[] strArrSplit = "width;height;averageBitrate;peakBitrate;frameRate;codecs;sampleMimeType;matchingOrdinal".length() == 0 ? new String[0] : "width;height;averageBitrate;peakBitrate;frameRate;codecs;sampleMimeType;matchingOrdinal".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C15120.class, sb, "[");
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
    public final int m36397() {
        return this.f49350;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Bundle m36398() {
        Bundle bundle = new Bundle();
        bundle.putInt("schema", 1);
        bundle.putInt("width", this.f49346);
        bundle.putInt("height", this.f49352);
        bundle.putInt("average_bitrate", this.f49345);
        bundle.putInt("peak_bitrate", this.f49349);
        bundle.putFloat("frame_rate", this.f49347);
        bundle.putString("codecs", this.f49351);
        bundle.putString("sample_mime_type", this.f49348);
        bundle.putInt("matching_ordinal", this.f49350);
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36396(C15120 c15120, C15648 c15648) {
        return c15120.f49346 == c15648.f50814 && c15120.f49352 == c15648.f50852 && c15120.f49345 == c15648.f50828 && c15120.f49349 == c15648.f50815 && Float.compare(c15120.f49347, c15648.f50845) == 0 && TextUtils.equals(c15120.f49351, c15648.f50836) && TextUtils.equals(c15120.f49348, c15648.f50848);
    }
}
