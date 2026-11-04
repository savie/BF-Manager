package l;

import android.media.MediaFormat;
import android.os.Build;
import com.umeng.analytics.pro.am;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8IJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16811 {
    /* JADX WARN: Code duplicated, block: B:153:0x025e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15648 m39701(MediaFormat mediaFormat) {
        String string;
        int i;
        int i2;
        float integer;
        C1259 c1259M26329;
        byte[] bArr;
        C20124 c20124 = new C20124();
        c20124.m46315(mediaFormat.getString("mime"));
        c20124.m46321(mediaFormat.getString(am.N));
        c20124.m46322(mediaFormat.containsKey("max-bitrate") ? mediaFormat.getInteger("max-bitrate") : -1);
        c20124.m46308(mediaFormat.containsKey("bitrate") ? mediaFormat.getInteger("bitrate") : -1);
        int i3 = 0;
        if (C17359.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer2 = mediaFormat.getInteger("profile");
            int integer3 = mediaFormat.getInteger("level");
            int i4 = C21528.f68786;
            String str = C7116.f23455;
            Locale locale = Locale.US;
            string = C6934.m19217("s263.", integer2, integer3, ".");
        } else if (C17359.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer4 = mediaFormat.getInteger("profile");
            int i5 = C21528.f68786;
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
                    throw new IllegalArgumentException(C13645.m33382(integer4, "Unknown Dolby Vision profile: "));
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
                        throw new IllegalArgumentException(C13645.m33382(integer5, "Unknown Dolby Vision level: "));
                }
            } else {
                i2 = 2;
            }
            if (i > 9) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str2 = C7116.f23455;
                string = String.format(Locale.US, "dvh1.%02d.%02d", objArr);
            } else if (i > 8) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str3 = C7116.f23455;
                string = String.format(Locale.US, "dvav.%02d.%02d", objArr2);
            } else {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str4 = C7116.f23455;
                string = String.format(Locale.US, "dvhe.%02d.%02d", objArr3);
            }
        } else {
            string = mediaFormat.containsKey("codecs-string") ? mediaFormat.getString("codecs-string") : null;
        }
        c20124.m46300(string);
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                integer = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
        } else {
            integer = -1.0f;
        }
        c20124.m46296(integer);
        c20124.m46291(mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : -1);
        c20124.m46333(mediaFormat.containsKey("height") ? mediaFormat.getInteger("height") : -1);
        c20124.m46325((mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f);
        c20124.m46318(mediaFormat.containsKey("max-input-size") ? mediaFormat.getInteger("max-input-size") : -1);
        c20124.m46307(mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0);
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
                c1259M26329 = null;
            } else {
                C10207 c10207 = new C10207();
                c10207.m26332(integer6);
                c10207.m26334(integer7);
                c10207.m26335(integer8);
                c10207.m26331(bArr);
                c1259M26329 = c10207.m26329();
            }
        } else {
            c1259M26329 = null;
        }
        c20124.m46302(c1259M26329);
        c20124.m46332(mediaFormat.containsKey("sample-rate") ? mediaFormat.getInteger("sample-rate") : -1);
        c20124.m46329(mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : -1);
        c20124.m46293(mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : -1);
        C22811 c22811 = new C22811();
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i3);
            if (byteBuffer2 == null) {
                c20124.m46301((List) c22811.m51441());
                if (mediaFormat.containsKey("track-id")) {
                    c20124.m46317(mediaFormat.getInteger("track-id"));
                }
                return c20124.m46295();
            }
            byte[] bArr2 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr2);
            byteBuffer2.rewind();
            c22811.m19807(bArr2);
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39703(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(C13645.m33382(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39702(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39704(MediaFormat mediaFormat, C1259 c1259) {
        if (c1259 != null) {
            m39702(mediaFormat, "color-transfer", c1259.f4541);
            m39702(mediaFormat, "color-standard", c1259.f4536);
            m39702(mediaFormat, "color-range", c1259.f4540);
            byte[] bArr = c1259.f4538;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }
}
