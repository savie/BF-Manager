package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.d;
import java.util.Map;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۜܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: TIY6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7232 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19832(String str, String str2, Map map) {
        boolean zEquals;
        if (str2 == null || str2.isEmpty()) {
            return false;
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2060644629:
                if (str.equals("checked-state")) {
                    b = 0;
                }
                break;
            case -2041899694:
                if (str.equals("request-initial-accessibility-focus")) {
                    b = 1;
                }
                break;
            case -1917823363:
                if (str.equals("expanded-state")) {
                    b = 2;
                }
                break;
            case -1861579970:
                if (str.equals("range-info")) {
                    b = 3;
                }
                break;
            case -1715965556:
                if (str.equals("selection")) {
                    b = 4;
                }
                break;
            case -1659019196:
                if (str.equals("context-clickable")) {
                    b = 5;
                }
                break;
            case -1567076692:
                if (str.equals("extra-rendering-info")) {
                    b = 6;
                }
                break;
            case -1371475228:
                if (str.equals("dismissable")) {
                    b = 7;
                }
                break;
            case -1289032093:
                if (str.equals("extras")) {
                    b = 8;
                }
                break;
            case -1285671474:
                if (str.equals("movement-granularities")) {
                    b = 9;
                }
                break;
            case -1179485550:
                if (str.equals("accessibility-data-sensitive")) {
                    b = 10;
                }
                break;
            case -1161803523:
                if (str.equals("actions")) {
                    b = 11;
                }
                break;
            case -1029096383:
                if (str.equals("text-selection-start")) {
                    b = 12;
                }
                break;
            case -879982104:
                if (str.equals("touch-delegate-info")) {
                    b = cb.k;
                }
                break;
            case -859963189:
                if (str.equals("available-extra-data")) {
                    b = cb.f82047l;
                }
                break;
            case -413399818:
                if (str.equals("text-selectable")) {
                    b = 15;
                }
                break;
            case -217050088:
                if (str.equals("window-id")) {
                    b = 16;
                }
                break;
            case -34121495:
                if (str.equals("granular-scrolling-supported")) {
                    b = 17;
                }
                break;
            case 111687046:
                if (str.equals("can-open-popup")) {
                    b = 18;
                }
                break;
            case 284591890:
                if (str.equals("field-required")) {
                    b = 19;
                }
                break;
            case 334660469:
                if (str.equals("structured-data-info")) {
                    b = 20;
                }
                break;
            case 619787404:
                if (str.equals("min-duration-between-content-changes")) {
                    b = 21;
                }
                break;
            case 696562859:
                if (str.equals("showing-hint-text")) {
                    b = 22;
                }
                break;
            case 742313895:
                if (str.equals("checked")) {
                    b = 23;
                }
                break;
            case 795311618:
                if (str.equals("heading")) {
                    b = 24;
                }
                break;
            case 1013992061:
                if (str.equals("collection-info")) {
                    b = 25;
                }
                break;
            case 1140883619:
                if (str.equals("content-invalid")) {
                    b = 26;
                }
                break;
            case 1156064026:
                if (str.equals("labeled-by-list")) {
                    b = 27;
                }
                break;
            case 1203197960:
                if (str.equals("multi-line")) {
                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    b = 29;
                }
                break;
            case 1254780026:
                if (str.equals("text-selection-end")) {
                    b = 30;
                }
                break;
            case 1340516189:
                if (str.equals("input-type")) {
                    b = bo.j;
                }
                break;
            case 1499194852:
                if (str.equals("text-entry-key")) {
                    b = UTF8.S_CS3;
                }
                break;
            case 1595826873:
                if (str.equals("collection-item-info")) {
                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                }
                break;
            case 1602416228:
                if (str.equals("editable")) {
                    b = 34;
                }
                break;
            case 1790787317:
                if (str.equals("live-region")) {
                    b = 35;
                }
                break;
            case 1902562537:
                if (str.equals("screen-reader-focusable")) {
                    b = 36;
                }
                break;
            case 1951949981:
                if (str.equals("max-text-length")) {
                    b = 37;
                }
                break;
        }
        switch (b) {
            case 0:
            case 23:
                return "true".equals(map.get("checkable")) || !("false".equals(str2) || "0".equals(str2));
            case 1:
            case 5:
            case 7:
            case 10:
            case 18:
            case 24:
            case 32:
            case 36:
                zEquals = "false".equals(str2);
                break;
            case 2:
                zEquals = "0".equals(str2);
                break;
            case 3:
            case 4:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 20:
            case 25:
            case 27:
            case 33:
                return ("[]".equals(str2) || "{}".equals(str2) || "null".equals(str2)) ? false : true;
            case 9:
            case 31:
            case 35:
                zEquals = "0".equals(str2);
                break;
            case 12:
            case 16:
            case 30:
            case 37:
                zEquals = "-1".equals(str2);
                break;
            case 15:
            case 34:
                return !"false".equals(str2) || m19833(map) || m19831((String) map.get(TextBundle.TEXT_ENTRY)) || m19831((String) map.get("hint-text"));
            case 17:
                return !"false".equals(str2) || "true".equals(map.get("scrollable"));
            case 19:
                return !"false".equals(str2) || m19833(map) || "true".equals(map.get("checkable"));
            case 21:
                zEquals = "PT0S".equals(str2);
                break;
            case 22:
                return !"false".equals(str2) || m19831((String) map.get("hint-text"));
            case 26:
                return !"false".equals(str2) || m19833(map) || m19831((String) map.get(d.O));
            case 28:
            case 29:
                return !"false".equals(str2) || m19833(map);
            default:
                return true;
        }
        return !zEquals;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19833(Map map) {
        String str = (String) map.get("input-type");
        String str2 = (String) map.get("max-text-length");
        if ("true".equals(map.get("editable"))) {
            return true;
        }
        if (!m19831(str) || "0".equals(str)) {
            return m19831(str2) && !"-1".equals(str2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19831(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }
}
