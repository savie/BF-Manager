package l;

import android.media.MediaFormat;
import android.os.Build;
import android.util.Pair;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۙ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes2.dex */
public final class C4639 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f16390;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3352 f16391;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f16392;

    public C4639(C3352 c3352, boolean z, String str) {
        this.f16391 = c3352;
        this.f16392 = z;
        this.f16390 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaFormat m12810(C12526 c12526, C16033 c16033) {
        int i;
        c12526.m31083();
        this.f16391.m41998(c12526, c16033, 2, false);
        C7648 c7648 = c12526.f41899;
        c7648.getClass();
        c12526.m31083();
        MediaFormat mediaFormat = new MediaFormat();
        C17237.m40175(mediaFormat, "bitrate", c7648.f25242);
        C17237.m40175(mediaFormat, "max-bitrate", c7648.f25266);
        C17237.m40175(mediaFormat, "channel-count", c7648.f25249);
        C17237.m40177(mediaFormat, c7648.f25239);
        String str = c7648.f25265;
        if (str != null) {
            mediaFormat.setString("mime", str);
        }
        String str2 = c7648.f25277;
        if (str2 != null) {
            mediaFormat.setString("codecs-string", str2);
        }
        float f = c7648.f25273;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        C17237.m40175(mediaFormat, "width", c7648.f25246);
        C17237.m40175(mediaFormat, "height", c7648.f25253);
        C17237.m40176(mediaFormat, c7648.f25268);
        int i2 = c7648.f25280;
        if (i2 != -1) {
            C17237.m40175(mediaFormat, "exo-pcm-encoding-int", i2);
            if (i2 == 0) {
                i = 0;
            } else if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = 4;
                    if (i2 != 4) {
                        i = 21;
                        if (i2 != 21) {
                            i = 22;
                            if (i2 == 22) {
                            }
                        }
                    }
                }
            } else {
                i = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i);
        }
        String str3 = c7648.f25269;
        if (str3 != null) {
            mediaFormat.setString(am.N, str3);
        }
        C17237.m40175(mediaFormat, "max-input-size", c7648.f25261);
        C17237.m40175(mediaFormat, "sample-rate", c7648.f25260);
        C17237.m40175(mediaFormat, "caption-service-number", c7648.f25247);
        mediaFormat.setInteger("rotation-degrees", c7648.f25248);
        int i3 = c7648.f25243;
        int i4 = 1;
        mediaFormat.setInteger("is-autoselect", (i3 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i3 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i3 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", c7648.f25272);
        mediaFormat.setInteger("encoder-padding", c7648.f25254);
        float f2 = c7648.f25241;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f2);
        int i5 = 1073741824;
        if (f2 < 1.0f) {
            i4 = (int) (f2 * 1073741824);
        } else if (f2 > 1.0f) {
            i5 = (int) (1073741824 / f2);
            i4 = 1073741824;
        } else {
            i5 = 1;
        }
        mediaFormat.setInteger("sar-width", i4);
        mediaFormat.setInteger("sar-height", i5);
        String str4 = c7648.f25275;
        if (str4 != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str4));
            } catch (NumberFormatException unused) {
            }
        }
        String str5 = this.f16390;
        if (str5 != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaFormat.removeKey("codecs-string");
            }
            mediaFormat.setString("mime", str5);
        }
        Pair pairM7349 = C2419.m7349(c7648);
        if (pairM7349 != null && Build.VERSION.SDK_INT >= 23) {
            mediaFormat.setInteger("profile", ((Integer) pairM7349.first).intValue());
            mediaFormat.setInteger("level", ((Integer) pairM7349.second).intValue());
        }
        return mediaFormat;
    }

    public final String toString() {
        return "MediaExtractorSampleQueue: " + this.f16391 + ", isCompatibilityTrack: " + this.f16392 + ", compatibilityTrackMimeType: " + this.f16390;
    }
}
