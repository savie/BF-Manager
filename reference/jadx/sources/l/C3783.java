package l;

import android.media.MediaFormat;
import android.os.Build;
import android.util.Pair;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۘ֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes2.dex */
public final class C3783 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f12961;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23921 f12962;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f12963;

    public C3783(C23921 c23921, boolean z, String str) {
        this.f12962 = c23921;
        this.f12963 = z;
        this.f12961 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaFormat m12292(C16461 c16461, C5690 c5690) {
        int i;
        c16461.m39010();
        this.f12962.m34306(c16461, c5690, 2, false);
        C15648 c15648 = c16461.f53378;
        c15648.getClass();
        c16461.m39010();
        MediaFormat mediaFormat = new MediaFormat();
        C16811.m39702(mediaFormat, "bitrate", c15648.f50849);
        C16811.m39702(mediaFormat, "max-bitrate", c15648.f50815);
        C16811.m39702(mediaFormat, "channel-count", c15648.f50843);
        C16811.m39704(mediaFormat, c15648.f50832);
        String str = c15648.f50848;
        if (str != null) {
            mediaFormat.setString("mime", str);
        }
        String str2 = c15648.f50836;
        if (str2 != null) {
            mediaFormat.setString("codecs-string", str2);
        }
        float f = c15648.f50845;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        C16811.m39702(mediaFormat, "width", c15648.f50814);
        C16811.m39702(mediaFormat, "height", c15648.f50852);
        C16811.m39703(mediaFormat, c15648.f50835);
        int i2 = c15648.f50826;
        if (i2 != -1) {
            C16811.m39702(mediaFormat, "exo-pcm-encoding-int", i2);
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
        String str3 = c15648.f50811;
        if (str3 != null) {
            mediaFormat.setString(am.N, str3);
        }
        C16811.m39702(mediaFormat, "max-input-size", c15648.f50824);
        C16811.m39702(mediaFormat, "sample-rate", c15648.f50829);
        C16811.m39702(mediaFormat, "caption-service-number", c15648.f50818);
        mediaFormat.setInteger("rotation-degrees", c15648.f50819);
        int i3 = c15648.f50850;
        int i4 = 1;
        mediaFormat.setInteger("is-autoselect", (i3 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i3 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i3 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", c15648.f50851);
        mediaFormat.setInteger("encoder-padding", c15648.f50816);
        float f2 = c15648.f50825;
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
        String str4 = c15648.f50817;
        if (str4 != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str4));
            } catch (NumberFormatException unused) {
            }
        }
        String str5 = this.f12961;
        if (str5 != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaFormat.removeKey("codecs-string");
            }
            mediaFormat.setString("mime", str5);
        }
        Pair pairM48970 = C21528.m48970(c15648);
        if (pairM48970 != null && Build.VERSION.SDK_INT >= 23) {
            mediaFormat.setInteger("profile", ((Integer) pairM48970.first).intValue());
            mediaFormat.setInteger("level", ((Integer) pairM48970.second).intValue());
        }
        return mediaFormat;
    }

    public final String toString() {
        return "MediaExtractorSampleQueue: " + this.f12962 + ", isCompatibilityTrack: " + this.f12963 + ", compatibilityTrackMimeType: " + this.f12961;
    }
}
