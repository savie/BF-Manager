package l;

import android.text.TextUtils;
import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.i18n.TextBundle;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.ۜ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8ON */
/* JADX INFO: loaded from: classes2.dex */
public final class C6632 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22408 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f22409 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f22410 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17978(int i) {
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m17975(String str) {
        return "audio".equals(m17976(str));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m17982(String str) {
        return "video".equals(m17976(str));
    }

    @Pure
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m17977(String str) {
        return TextBundle.TEXT_ENTRY.equals(m17976(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m17985(String str) {
        return "image".equals(m17976(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17980(String str, String str2) {
        C3809 c3809M17984;
        int iM11095;
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
                return (str2 == null || (c3809M17984 = m17984(str2)) == null || (iM11095 = c3809M17984.m11095()) == 0 || iM11095 == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m17988(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C17983.m41848(str)) {
            String strM17986 = m17986(str2);
            if (strM17986 != null && m17982(strM17986)) {
                return strM17986;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m17987(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrM41848 = C17983.m41848(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrM41848) {
                if (str2.equals(m17986(str3))) {
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
    public static String m17979(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C17983.m41848(str)) {
            String strM17986 = m17986(str2);
            if (strM17986 != null && m17975(strM17986)) {
                return strM17986;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m17986(String str) {
        C3809 c3809M17984;
        String strM17978 = null;
        if (str == null) {
            return null;
        }
        String strM46672 = C20733.m46672(str.trim());
        if (strM46672.startsWith("avc1") || strM46672.startsWith("avc3")) {
            return "video/avc";
        }
        if (strM46672.startsWith("hev1") || strM46672.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strM46672.startsWith("dvav") || strM46672.startsWith("dva1") || strM46672.startsWith("dvhe") || strM46672.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strM46672.startsWith("av01")) {
            return "video/av01";
        }
        if (strM46672.startsWith("vp9") || strM46672.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strM46672.startsWith("vp8") || strM46672.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strM46672.startsWith("mp4a")) {
            if (strM46672.startsWith("mp4a.") && (c3809M17984 = m17984(strM46672)) != null) {
                strM17978 = m17978(c3809M17984.f14142);
            }
            return strM17978 == null ? "audio/mp4a-latm" : strM17978;
        }
        if (strM46672.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strM46672.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strM46672.startsWith("ac-3") || strM46672.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strM46672.startsWith("ec-3") || strM46672.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strM46672.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strM46672.startsWith("ac-4") || strM46672.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strM46672.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strM46672.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strM46672.startsWith("dtsh") || strM46672.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strM46672.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strM46672.startsWith("opus")) {
            return "audio/opus";
        }
        if (strM46672.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strM46672.startsWith("flac")) {
            return "audio/flac";
        }
        if (strM46672.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strM46672.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strM46672.contains("cea708")) {
            return "application/cea-708";
        }
        if (strM46672.contains("eia608") || strM46672.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f22409;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C12983) arrayList.get(i)).getClass();
            if (strM46672.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m17981(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m17975(str)) {
            return 1;
        }
        if (m17982(str)) {
            return 2;
        }
        if (m17977(str)) {
            return 3;
        }
        if (m17985(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f22409;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C12983) arrayList.get(i)).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m17983(String str, String str2) {
        C3809 c3809M17984;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c3809M17984 = m17984(str2)) == null) {
                    return 0;
                }
                return c3809M17984.m11095();
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

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static String m17989(String str) {
        if (str == null) {
            return null;
        }
        String strM46672 = C20733.m46672(str);
        strM46672.getClass();
        switch (strM46672) {
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
                return strM46672;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m17976(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C3809 m17984(String str) {
        Matcher matcher = f22410.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C3809(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
