package l;

import android.text.TextUtils;
import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.i18n.TextBundle;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.ۡ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8ON */
/* JADX INFO: loaded from: classes3.dex */
public final class C9681 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f31256 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f31257 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f31258 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m25251(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case q.f /* 99 */:
            case 100:
            case 101:
                return "video/mpeg2";
            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                return "audio/mp4a-latm";
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                return "audio/mpeg";
            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m25258(String str) {
        return "audio".equals(m25263(str));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m25257(String str) {
        return "video".equals(m25263(str));
    }

    @Pure
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25250(String str) {
        return TextBundle.TEXT_ENTRY.equals(m25263(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m25254(String str) {
        return "image".equals(m25263(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25253(String str, String str2) {
        C1479 c1479M25256;
        int iM5269;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (c1479M25256 = m25256(str2)) == null || (iM5269 = c1479M25256.m5269()) == 0 || iM5269 == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m25259(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C7116.m19503(str)) {
            String strM25261 = m25261(str2);
            if (strM25261 != null && m25257(strM25261)) {
                return strM25261;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m25262(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrM19503 = C7116.m19503(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrM19503) {
                if (str2.equals(m25261(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m25252(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C7116.m19503(str)) {
            String strM25261 = m25261(str2);
            if (strM25261 != null && m25258(strM25261)) {
                return strM25261;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m25261(String str) {
        C1479 c1479M25256;
        String strM25251 = null;
        if (str == null) {
            return null;
        }
        String strM21453 = C7914.m21453(str.trim());
        if (strM21453.startsWith("avc1") || strM21453.startsWith("avc3")) {
            return "video/avc";
        }
        if (strM21453.startsWith("hev1") || strM21453.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strM21453.startsWith("dvav") || strM21453.startsWith("dva1") || strM21453.startsWith("dvhe") || strM21453.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strM21453.startsWith("av01")) {
            return "video/av01";
        }
        if (strM21453.startsWith("vp9") || strM21453.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strM21453.startsWith("vp8") || strM21453.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strM21453.startsWith("mp4a")) {
            if (strM21453.startsWith("mp4a.") && (c1479M25256 = m25256(strM21453)) != null) {
                strM25251 = m25251(c1479M25256.f5144);
            }
            return strM25251 == null ? "audio/mp4a-latm" : strM25251;
        }
        if (strM21453.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strM21453.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strM21453.startsWith("ac-3") || strM21453.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strM21453.startsWith("ec-3") || strM21453.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strM21453.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strM21453.startsWith("ac-4") || strM21453.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strM21453.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strM21453.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strM21453.startsWith("dtsh") || strM21453.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strM21453.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strM21453.startsWith("opus")) {
            return "audio/opus";
        }
        if (strM21453.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strM21453.startsWith("flac")) {
            return "audio/flac";
        }
        if (strM21453.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strM21453.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strM21453.contains("cea708")) {
            return "application/cea-708";
        }
        if (strM21453.contains("eia608") || strM21453.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f31257;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C10427) arrayList.get(i)).getClass();
            if (strM21453.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m25260(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m25258(str)) {
            return 1;
        }
        if (m25257(str)) {
            return 2;
        }
        if (m25250(str)) {
            return 3;
        }
        if (m25254(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f31257;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C10427) arrayList.get(i)).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m25255(String str, String str2) {
        C1479 c1479M25256;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c1479M25256 = m25256(str2)) == null) {
                    return 0;
                }
                return c1479M25256.m5269();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m25264(String str) {
        if (str == null) {
            return null;
        }
        String strM21453 = C7914.m21453(str);
        strM21453.getClass();
        switch (strM21453) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM21453;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m25263(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C1479 m25256(String str) {
        Matcher matcher = f31258.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C1479(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
