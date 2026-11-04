package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۤ᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44KD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11109 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28059(int i) {
        switch (i) {
            case 1:
                return d.O;
            case 2:
                return ClassTransform.INTEGER;
            case 3:
                return ClassTransform.FLOAT;
            case 4:
                return "string";
            case 5:
                return "iso8601";
            case 6:
                return "true";
            case 7:
                return "false";
            case 8:
                return "null";
            case 9:
                return "new";
            case 10:
                return MotionUtils.EASING_TYPE_FORMAT_START;
            case 11:
                return MotionUtils.EASING_TYPE_FORMAT_END;
            case 12:
                return "{";
            case 13:
                return l.d;
            case 14:
                return "[";
            case 15:
                return "]";
            case 16:
                return ",";
            case 17:
                return ":";
            case 18:
                return "ident";
            case 19:
            default:
                return "Unknown";
            case 20:
                return "EOF";
            case 21:
                return "Set";
            case 22:
                return "TreeSet";
            case 23:
                return "undefined";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28060(String str) {
        return "target_not_mapped".equals(str) || "result_limit_reached".equals(str) || "scan_budget_exhausted".equals(str) || "relocation_page_budget_exhausted".equals(str) || "scan_space_exhausted".equals(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m28061(String str) {
        if (str == null) {
            return "null";
        }
        int length = str.length();
        if (length == 0) {
            return "\"\"";
        }
        int i = 0;
        char c = '/';
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (c == '/') {
                if (!Character.isJavaIdentifierStart(cCharAt) && cCharAt != '-') {
                    return C14442.m34865("\"", str, "\"");
                }
                i++;
                c = cCharAt;
            } else {
                if (cCharAt != '/' && !Character.isJavaIdentifierPart(cCharAt) && cCharAt != '-') {
                    return C14442.m34865("\"", str, "\"");
                }
                i++;
                c = cCharAt;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m28058(C18876 c18876) {
        JSONArray jSONArrayArray = JSON.array();
        JSONArray jSONArrayArray2 = JSON.array();
        ArrayList<C7689> arrayList = c18876.f61281;
        String str = c18876.f61279;
        String str2 = c18876.f61280;
        for (C7689 c7689 : arrayList) {
            String strConcat = "resource:".concat(c7689.f25382);
            JSONArray jSONArrayArray3 = JSON.array();
            for (C9925 c9925 : c7689.f25381) {
                jSONArrayArray3.add(JSON.object().add("variant", c9925.f31856).add("targetVersion", c9925.f31855));
                jSONArrayArray2.add(JSON.object().add("locator", strConcat).add("variant", c9925.f31856));
            }
            jSONArrayArray.add(JSON.object().add("index", c7689.f25380).add("locator", strConcat).add("values", jSONArrayArray3));
        }
        return C15300.m36728(C22121.m50076("workspaceId", str2, "editSessionId", str).add("results", jSONArrayArray), JSON.array().add(C2729.m9064(C22121.m50076("workspaceId", str2, "editSessionId", str).add("reads", jSONArrayArray2).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0), "mt_apk_resource_read", "inspect", "Read the newly added resource values")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28056(Comparator comparator, List list, List list2) {
        Iterator it = list2.iterator();
        for (Object obj : list) {
            if (!it.hasNext()) {
                return 1;
            }
            int iCompare = comparator.compare(obj, it.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it.hasNext() ? -1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28057(Set set, Set set2) {
        Comparator comparator;
        Comparator comparator2;
        int iCompare = Integer.compare(set.size(), set2.size());
        if (iCompare != 0) {
            return iCompare;
        }
        if (!(set instanceof SortedSet) || ((comparator2 = ((SortedSet) set).comparator()) != null && !comparator2.equals(AbstractC18753.m43550()))) {
            AbstractC5439.copyOf((Collection) set);
        }
        if (!(set2 instanceof SortedSet) || ((comparator = ((SortedSet) set2).comparator()) != null && !comparator.equals(AbstractC18753.m43550()))) {
            AbstractC5439.copyOf((Collection) set2);
        }
        Iterator it = set2.iterator();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            int iCompareTo = ((Comparable) it2.next()).compareTo((Comparable) it.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }
}
