package l;

import android.text.TextUtils;
import com.alipay.sdk.m.n.c;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.ۤ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes3.dex */
public final class C10163 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f34695;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20321 f34696;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f34697;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34698;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f34699;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18727 f34700;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f34701;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public List f34702;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f34703;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f34707;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20321 f34708;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC17902 f34710;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f34711;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f34712;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f34713;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f34714;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f34716;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f34718;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f34720;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f34694 = "running";

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f34706 = "";

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f34715 = "";

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f34704 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f34717 = "";

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f34709 = "";

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f34705 = "";

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f34719 = "";

    public C10163(String str, String str2) {
        C20321 c20321 = C20321.f65801;
        this.f34696 = c20321;
        this.f34708 = c20321;
        this.f34695 = "";
        List list = Collections.EMPTY_LIST;
        this.f34701 = list;
        this.f34713 = list;
        this.f34703 = list;
        this.f34702 = list;
        this.f34711 = str;
        this.f34712 = str2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m25889(C10163 c10163) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("taskId", c10163.f34711);
        linkedHashMap2.put("type", c10163.f34712);
        linkedHashMap2.put("done", Boolean.valueOf(c10163.f34720));
        linkedHashMap2.put(c.a, c10163.f34694);
        linkedHashMap2.put("title", c10163.f34706);
        linkedHashMap2.put("name", c10163.f34715);
        linkedHashMap2.put("progress", Integer.valueOf(c10163.f34704));
        linkedHashMap2.put("remaining", c10163.f34717);
        linkedHashMap2.put("speed", Long.valueOf(c10163.f34716));
        linkedHashMap2.put(d.O, c10163.f34709);
        linkedHashMap2.put("refreshDirectories", c10163.f34701);
        linkedHashMap2.put("invalidatePrefixes", c10163.f34713);
        linkedHashMap2.put("pathMoves", c10163.f34703);
        linkedHashMap2.put("markedPaths", c10163.f34702);
        if (TextUtils.isEmpty(c10163.f34705)) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("id", c10163.f34705);
            linkedHashMap3.put(MotionUtils.EASING_TYPE_PATH, c10163.f34719);
            linkedHashMap3.put("incoming", C7340.m19606(c10163.f34696));
            linkedHashMap3.put("existing", C7340.m19606(c10163.f34708));
            linkedHashMap3.put("selectedAction", c10163.f34695);
            linkedHashMap3.put("recyclable", Boolean.valueOf(c10163.f34707));
            linkedHashMap3.put("moveToRecycleBin", Boolean.valueOf(c10163.f34699));
            linkedHashMap = linkedHashMap3;
        }
        linkedHashMap2.put("conflict", linkedHashMap);
        return linkedHashMap2;
    }
}
