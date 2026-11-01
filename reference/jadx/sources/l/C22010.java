package l;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.umeng.commonsdk.utils.c;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QN */
/* JADX INFO: loaded from: classes.dex */
public final class C22010 {
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48898(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
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
                if (C22979.m50818((Object) supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && C0842.f3486 == null) {
                if (Build.VERSION.SDK_INT >= 35) {
                    z = false;
                } else {
                    int iM48899 = m48899(false);
                    int iM488910 = m48899(true);
                    if (iM48899 != 0 && (iM488910 != 0 ? !(iM48899 != 2 || iM488910 != 2) : iM48899 == 2)) {
                        z = false;
                    }
                }
                C0842.f3486 = Boolean.valueOf(z);
                if (C0842.f3486.booleanValue()) {
                }
            }
            return i3;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48899(boolean z) {
        List listM45161;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            C10471 c10471 = new C10471();
            c10471.m26533("video/avc");
            C7648 c7648M26497 = c10471.m26497();
            String str = c7648M26497.f25265;
            if (str != null) {
                List listM45162 = C19894.m45161(str, z, false);
                String strM45158 = C19894.m45158(c7648M26497);
                if (strM45158 == null) {
                    listM45161 = AbstractC22433.of();
                } else {
                    listM45161 = C19894.m45161(strM45158, z, false);
                }
                C4793 c4793 = new C4793();
                c4793.m52162(listM45162);
                c4793.m52162(listM45161);
                AbstractC22433 abstractC22433M13309 = c4793.m13309();
                for (int i = 0; i < abstractC22433M13309.size(); i++) {
                    if (((C5076) abstractC22433M13309.get(i)).f17687 != null && (videoCapabilities = ((C5076) abstractC22433M13309.get(i)).f17687.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, c.e, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (C22979.m50818((Object) supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (C8605 unused) {
        }
        return 0;
    }
}
