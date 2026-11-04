package l;

import com.umeng.analytics.pro.d;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۙ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1IX2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5215 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f18400 = new HashMap();

    static {
        String[] strArr = {"package", Name.LABEL, "resource-id", "resource-id-hex", "unique-id", TextBundle.TEXT_ENTRY, "hint-text", "showing-hint-text", "content-desc", "supplemental-description", "state-description", "tooltip-text", "pane-title", "container-title", "width", "height", "position", "bounds", "position-in-parent", "bounds-in-parent", "index", "window-id", "child-count", "bounds-in-window", "drawing-order", "visible-to-user", "enabled", "selected", "focusable", "focused", "accessibility-focused", "checkable", "checked", "checked-state", "expanded-state", "range-info", "clickable", "long-clickable", "context-clickable", "can-open-popup", "dismissable", "scrollable", "granular-scrolling-supported", "editable", "input-type", "password", "multi-line", "max-text-length", "text-selectable", "text-entry-key", "movement-granularities", "text-selection-start", "text-selection-end", "selection", "field-required", "content-invalid", d.O, "collection-info", "collection-item-info", "important-for-accessibility", "screen-reader-focusable", "request-initial-accessibility-focus", "heading", "live-region", "min-duration-between-content-changes", "accessibility-data-sensitive", "label-for", "labeled-by", "labeled-by-list", "traversal-before", "traversal-after", "touch-delegate-info", "extra-rendering-info", "structured-data-info", "extras"};
        for (int i = 0; i < 75; i++) {
            f18400.put(strArr[i], Integer.valueOf(i));
        }
        C1402.m5129(2147483646, f18400, "actions", Integer.MAX_VALUE, "available-extra-data");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15690(Map map, boolean z, float f, String str) {
        char c;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        ArrayList arrayList = new ArrayList();
        DecimalFormat decimalFormat = new DecimalFormat("0.##", DecimalFormatSymbols.getInstance(Locale.ROOT));
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (z || C7232.m19832(str2, str3, map)) {
                if ("bounds".equals(str2) || "bounds-in-parent".equals(str2)) {
                    int[] iArr = null;
                    if (str3 != null && str3.startsWith("[") && str3.endsWith("]")) {
                        int iIndexOf = str3.indexOf(44);
                        int iIndexOf2 = str3.indexOf("][");
                        int i = iIndexOf2 + 2;
                        int iIndexOf3 = str3.indexOf(44, i);
                        if (iIndexOf < 1 || iIndexOf2 <= iIndexOf || iIndexOf3 <= i) {
                            c = 1;
                        } else {
                            try {
                                c = 1;
                                try {
                                    iArr = new int[]{Integer.parseInt(str3.substring(1, iIndexOf)), Integer.parseInt(str3.substring(iIndexOf + 1, iIndexOf2)), Integer.parseInt(str3.substring(i, iIndexOf3)), Integer.parseInt(str3.substring(iIndexOf3 + 1, str3.length() - 1))};
                                } catch (NumberFormatException unused) {
                                }
                            } catch (NumberFormatException unused2) {
                                c = 1;
                            }
                        }
                    } else {
                        c = 1;
                    }
                    if (iArr != null) {
                        if ("bounds".equals(str2)) {
                            arrayList.add(new AbstractMap.SimpleImmutableEntry("width", m15688(((long) iArr[2]) - ((long) iArr[0]), f, decimalFormat)));
                            arrayList.add(new AbstractMap.SimpleImmutableEntry("height", m15688(((long) iArr[3]) - ((long) iArr[c]), f, decimalFormat)));
                            simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry("position", m15689(iArr, f, decimalFormat));
                        } else {
                            simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry("position-in-parent", m15689(iArr, f, decimalFormat));
                        }
                        arrayList.add(simpleImmutableEntry);
                    }
                }
                arrayList.add(entry);
            }
        }
        if (str != null) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry("resource-id-hex", str));
        }
        Collections.sort(arrayList, new C13943());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15687(Map.Entry entry, Map.Entry entry2) {
        String str = (String) entry.getKey();
        HashMap map = f18400;
        Integer num = (Integer) map.get(str);
        int iIntValue = num == null ? 2147483645 : num.intValue();
        Integer num2 = (Integer) map.get((String) entry2.getKey());
        return Integer.compare(iIntValue, num2 != null ? num2.intValue() : 2147483645);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15688(long j, float f, DecimalFormat decimalFormat) {
        return j + "px / " + decimalFormat.format(j / ((double) f)) + "dp";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15689(int[] iArr, float f, DecimalFormat decimalFormat) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(iArr[0]);
        sb.append("px, ");
        sb.append(iArr[1]);
        sb.append("px] / [");
        double d = f;
        sb.append(decimalFormat.format(((double) iArr[0]) / d));
        sb.append("dp, ");
        sb.append(decimalFormat.format(((double) iArr[1]) / d));
        sb.append("dp]");
        return sb.toString();
    }
}
