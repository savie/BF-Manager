package l;

import android.media.MediaFormat;
import android.os.Build;
import com.umeng.analytics.pro.am;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܿۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8IJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17237 {
    /* JADX WARN: Code duplicated, block: B:153:0x025e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7648 m40174(MediaFormat mediaFormat) {
        String string;
        int i;
        int i2;
        float integer;
        C4119 c4119M32773;
        byte[] bArr;
        C10471 c10471 = new C10471();
        c10471.m26533(mediaFormat.getString("mime"));
        c10471.m26509(mediaFormat.getString(am.N));
        c10471.m26528(mediaFormat.containsKey("max-bitrate") ? mediaFormat.getInteger("max-bitrate") : -1);
        c10471.m26515(mediaFormat.containsKey("bitrate") ? mediaFormat.getInteger("bitrate") : -1);
        int i3 = 0;
        if (C13638.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer2 = mediaFormat.getInteger("profile");
            int integer3 = mediaFormat.getInteger("level");
            int i4 = C2419.f9699;
            String str = C17983.f57504;
            Locale locale = Locale.US;
            string = C2271.m6967("s263.", integer2, integer3, ".");
        } else if (C13638.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer4 = mediaFormat.getInteger("profile");
            int i5 = C2419.f9699;
            if (integer4 == 1) {
                i = 0;
            } else if (integer4 == 2) {
                i = 1;
            } else if (integer4 == 4) {
                i = 2;
            } else if (integer4 == 8) {
                i = 3;
            } else if (integer4 == 16) {
                i = 4;
            } else if (integer4 == 32) {
                i = 5;
            } else if (integer4 == 64) {
                i = 6;
            } else if (integer4 == 128) {
                i = 7;
            } else if (integer4 == 256) {
                i = 8;
            } else if (integer4 == 512) {
                i = 9;
            } else {
                if (integer4 != 1024) {
                    throw new IllegalArgumentException(C8479.m22141(integer4, "Unknown Dolby Vision profile: "));
                }
                i = 10;
            }
            int integer5 = mediaFormat.getInteger("level");
            if (integer5 == 1) {
                i2 = 1;
            } else if (integer5 != 2) {
                switch (integer5) {
                    case 4:
                        i2 = 3;
                        break;
                    case 8:
                        i2 = 4;
                        break;
                    case 16:
                        i2 = 5;
                        break;
                    case 32:
                        i2 = 6;
                        break;
                    case 64:
                        i2 = 7;
                        break;
                    case 128:
                        i2 = 8;
                        break;
                    case 256:
                        i2 = 9;
                        break;
                    case 512:
                        i2 = 10;
                        break;
                    case 1024:
                        i2 = 11;
                        break;
                    case 2048:
                        i2 = 12;
                        break;
                    case 4096:
                        i2 = 13;
                        break;
                    default:
                        throw new IllegalArgumentException(C8479.m22141(integer5, "Unknown Dolby Vision level: "));
                }
            } else {
                i2 = 2;
            }
            if (i > 9) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str2 = C17983.f57504;
                string = String.format(Locale.US, "dvh1.%02d.%02d", objArr);
            } else if (i > 8) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str3 = C17983.f57504;
                string = String.format(Locale.US, "dvav.%02d.%02d", objArr2);
            } else {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str4 = C17983.f57504;
                string = String.format(Locale.US, "dvhe.%02d.%02d", objArr3);
            }
        } else {
            string = mediaFormat.containsKey("codecs-string") ? mediaFormat.getString("codecs-string") : null;
        }
        c10471.m26502(string);
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                integer = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
        } else {
            integer = -1.0f;
        }
        c10471.m26498(integer);
        c10471.m26525(mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : -1);
        c10471.m26534(mediaFormat.containsKey("height") ? mediaFormat.getInteger("height") : -1);
        c10471.m26519((mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f);
        c10471.m26531(mediaFormat.containsKey("max-input-size") ? mediaFormat.getInteger("max-input-size") : -1);
        c10471.m26514(mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0);
        if (Build.VERSION.SDK_INT >= 24) {
            int integer6 = mediaFormat.containsKey("color-standard") ? mediaFormat.getInteger("color-standard") : -1;
            int integer7 = mediaFormat.containsKey("color-range") ? mediaFormat.getInteger("color-range") : -1;
            int integer8 = mediaFormat.containsKey("color-transfer") ? mediaFormat.getInteger("color-transfer") : -1;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            if (byteBuffer != null) {
                bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
            } else {
                bArr = null;
            }
            if (integer6 != 2 && integer6 != 1 && integer6 != 6 && integer6 != -1) {
                integer6 = -1;
            }
            if (integer7 != 2 && integer7 != 1 && integer7 != -1) {
                integer7 = -1;
            }
            if (integer8 != 1 && integer8 != 3 && integer8 != 6 && integer8 != 7 && integer8 != -1) {
                integer8 = -1;
            }
            if (integer6 == -1 && integer7 == -1 && integer8 == -1 && bArr == null) {
                c4119M32773 = null;
            } else {
                C13293 c13293 = new C13293();
                c13293.m32777(integer6);
                c13293.m32778(integer7);
                c13293.m32772(integer8);
                c13293.m32775(bArr);
                c4119M32773 = c13293.m32773();
            }
        } else {
            c4119M32773 = null;
        }
        c10471.m26505(c4119M32773);
        c10471.m26511(mediaFormat.containsKey("sample-rate") ? mediaFormat.getInteger("sample-rate") : -1);
        c10471.m26494(mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : -1);
        c10471.m26512(mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : -1);
        C4793 c4793 = new C4793();
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i3);
            if (byteBuffer2 == null) {
                c10471.m26503((List) c4793.m13309());
                if (mediaFormat.containsKey("track-id")) {
                    c10471.m26523(mediaFormat.getInteger("track-id"));
                }
                return c10471.m26497();
            }
            byte[] bArr2 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr2);
            byteBuffer2.rewind();
            c4793.m52163(bArr2);
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40176(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(C8479.m22141(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40175(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40177(MediaFormat mediaFormat, C4119 c4119) {
        if (c4119 != null) {
            m40175(mediaFormat, "color-transfer", c4119.f15084);
            m40175(mediaFormat, "color-standard", c4119.f15087);
            m40175(mediaFormat, "color-range", c4119.f15088);
            byte[] bArr = c4119.f15089;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }
}
