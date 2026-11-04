package l;

import android.net.Uri;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۬ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: N13V */
/* JADX INFO: loaded from: classes4.dex */
public final class C13923 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m33908(String str) {
        String strReplace;
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        if (i > 0) {
            str = str.substring(i);
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'V') {
            strReplace = ClassTransform.VOID;
        } else if (cCharAt == 'Z') {
            strReplace = ClassTransform.BOOLEAN;
        } else if (cCharAt == 'B') {
            strReplace = ClassTransform.BYTE;
        } else if (cCharAt == 'C') {
            strReplace = ClassTransform.CHARACTER;
        } else if (cCharAt == 'S') {
            strReplace = ClassTransform.SHORT;
        } else if (cCharAt == 'I') {
            strReplace = ClassTransform.INTEGER;
        } else if (cCharAt == 'F') {
            strReplace = ClassTransform.FLOAT;
        } else if (cCharAt == 'J') {
            strReplace = ClassTransform.LONG;
        } else if (cCharAt == 'D') {
            strReplace = ClassTransform.DOUBLE;
        } else if (cCharAt == '%') {
            strReplace = "%";
        } else {
            strReplace = cCharAt == 'L' ? str.substring(1, str.indexOf(59)).replace('/', '.') : null;
        }
        if (strReplace == null) {
            throw new IllegalArgumentException(C14442.m34865("Unknown type [", str, "]"));
        }
        for (int i2 = 0; i2 < i; i2++) {
            strReplace = C14483.m34972(strReplace, "[]");
        }
        return strReplace;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:136:0x01e6  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m33907(String str) {
        byte b;
        if (str == null) {
            return -1;
        }
        String strM25264 = C9681.m25264(str);
        strM25264.getClass();
        switch (strM25264.hashCode()) {
            case -2123537834:
                if (!strM25264.equals("audio/eac3-joc")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1662384011:
                if (!strM25264.equals("video/mp2p")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1662384007:
                if (!strM25264.equals("video/mp2t")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1662095187:
                if (!strM25264.equals("video/webm")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1606874997:
                if (!strM25264.equals("audio/amr-wb")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1487656890:
                if (!strM25264.equals("image/avif")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -1487464693:
                if (!strM25264.equals("image/heic")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -1487464690:
                if (!strM25264.equals("image/heif")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case -1487394660:
                if (!strM25264.equals("image/jpeg")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1487018032:
                if (!strM25264.equals("image/webp")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case -1248337486:
                if (!strM25264.equals("application/mp4")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -1079884372:
                if (!strM25264.equals("video/x-msvideo")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case -1004728940:
                if (!strM25264.equals("text/vtt")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case -879272239:
                if (!strM25264.equals("image/bmp")) {
                    b = -1;
                } else {
                    b = cb.k;
                }
                break;
            case -879258763:
                if (!strM25264.equals("image/png")) {
                    b = -1;
                } else {
                    b = cb.f82047l;
                }
                break;
            case -387023398:
                if (!strM25264.equals("audio/x-matroska")) {
                    b = -1;
                } else {
                    b = 15;
                }
                break;
            case -43467528:
                if (!strM25264.equals("application/webm")) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case 13915911:
                if (!strM25264.equals("video/x-flv")) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 187078296:
                if (!strM25264.equals("audio/ac3")) {
                    b = -1;
                } else {
                    b = 18;
                }
                break;
            case 187078297:
                if (!strM25264.equals("audio/ac4")) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case 187078669:
                if (!strM25264.equals("audio/amr")) {
                    b = -1;
                } else {
                    b = 20;
                }
                break;
            case 187090232:
                if (!strM25264.equals("audio/mp4")) {
                    b = -1;
                } else {
                    b = 21;
                }
                break;
            case 187091926:
                if (!strM25264.equals("audio/ogg")) {
                    b = -1;
                } else {
                    b = 22;
                }
                break;
            case 187099443:
                if (!strM25264.equals("audio/wav")) {
                    b = -1;
                } else {
                    b = 23;
                }
                break;
            case 1331848029:
                if (!strM25264.equals("video/mp4")) {
                    b = -1;
                } else {
                    b = 24;
                }
                break;
            case 1503095341:
                if (!strM25264.equals("audio/3gpp")) {
                    b = -1;
                } else {
                    b = 25;
                }
                break;
            case 1504578661:
                if (!strM25264.equals("audio/eac3")) {
                    b = -1;
                } else {
                    b = 26;
                }
                break;
            case 1504619009:
                if (!strM25264.equals("audio/flac")) {
                    b = -1;
                } else {
                    b = 27;
                }
                break;
            case 1504824762:
                if (!strM25264.equals("audio/midi")) {
                    b = -1;
                } else {
                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                }
                break;
            case 1504831518:
                if (!strM25264.equals("audio/mpeg")) {
                    b = -1;
                } else {
                    b = 29;
                }
                break;
            case 1505118770:
                if (!strM25264.equals("audio/webm")) {
                    b = -1;
                } else {
                    b = 30;
                }
                break;
            case 2039520277:
                if (!strM25264.equals("video/x-matroska")) {
                    b = -1;
                } else {
                    b = bo.j;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return 20;
            case 8:
                return 14;
            case 9:
                return 18;
            case 10:
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case 12:
                return 13;
            case 13:
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33905(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m33909(String str) {
        return str.equals("<clinit>") || str.equals("<init>");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m33906(String str) {
        StringBuilder sb = new StringBuilder();
        C22064 c22064 = new C22064(str);
        while (c22064.m49896()) {
            sb.append(m33908(c22064.m49897()));
            if (c22064.m49896()) {
                sb.append(',');
            }
        }
        return sb.toString();
    }
}
