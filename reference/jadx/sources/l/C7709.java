package l;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.umeng.commonsdk.utils.c;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C7709 {
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20986(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (C10185.m26293(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && C18896.f61313 == null) {
                if (Build.VERSION.SDK_INT >= 35) {
                    z = false;
                } else {
                    int iM20987 = m20987(false);
                    int iM20988 = m20987(true);
                    if (iM20987 != 0 && (iM20988 != 0 ? !(iM20987 != 2 || iM20988 != 2) : iM20987 == 2)) {
                        z = false;
                    }
                }
                C18896.f61313 = Boolean.valueOf(z);
                if (C18896.f61313.booleanValue()) {
                }
            }
            return i3;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20987(boolean z) {
        List listM6722;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            C20124 c20124 = new C20124();
            c20124.m46315("video/avc");
            C15648 c15648M46295 = c20124.m46295();
            String str = c15648M46295.f50848;
            if (str != null) {
                List listM6723 = C1939.m6722(str, z, false);
                String strM6719 = C1939.m6719(c15648M46295);
                if (strM6719 == null) {
                    listM6722 = AbstractC1928.of();
                } else {
                    listM6722 = C1939.m6722(strM6719, z, false);
                }
                C22811 c22811 = new C22811();
                c22811.m19806(listM6723);
                c22811.m19806(listM6722);
                AbstractC1928 abstractC1928M51441 = c22811.m51441();
                for (int i = 0; i < abstractC1928M51441.size(); i++) {
                    if (((C0251) abstractC1928M51441.get(i)).f1531 != null && (videoCapabilities = ((C0251) abstractC1928M51441.get(i)).f1531.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, c.e, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (C10185.m26293(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (C22822 unused) {
        }
        return 0;
    }
}
