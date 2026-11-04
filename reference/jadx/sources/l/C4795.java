package l;

import android.text.TextUtils;
import com.alipay.sdk.m.n.c;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.ۙۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4795 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f16792;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f16793;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f16794;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16796;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f16797;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C25154 f16801;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f16802;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f16803;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC18900 f16804;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public List f16806;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f16808;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f16810;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f16811;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f16813;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21578 f16814;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C21578 f16815;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f16816;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public List f16817;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f16818;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f16809 = "running";

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f16799 = "";

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f16812 = "";

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f16798 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f16795 = "";

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f16807 = "";

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f16800 = "";

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f16805 = "";

    public C4795(String str, String str2) {
        C21578 c21578 = C21578.f68936;
        this.f16815 = c21578;
        this.f16814 = c21578;
        this.f16803 = "";
        List list = Collections.EMPTY_LIST;
        this.f16817 = list;
        this.f16806 = list;
        this.f16802 = list;
        this.f16794 = list;
        this.f16792 = str;
        this.f16810 = str2;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m14796(C4795 c4795) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("taskId", c4795.f16792);
        linkedHashMap2.put("type", c4795.f16810);
        linkedHashMap2.put("done", Boolean.valueOf(c4795.f16818));
        linkedHashMap2.put(c.a, c4795.f16809);
        linkedHashMap2.put("title", c4795.f16799);
        linkedHashMap2.put("name", c4795.f16812);
        linkedHashMap2.put("progress", Integer.valueOf(c4795.f16798));
        linkedHashMap2.put("remaining", c4795.f16795);
        linkedHashMap2.put("speed", Long.valueOf(c4795.f16813));
        linkedHashMap2.put(d.O, c4795.f16807);
        linkedHashMap2.put("refreshDirectories", c4795.f16817);
        linkedHashMap2.put("invalidatePrefixes", c4795.f16806);
        linkedHashMap2.put("pathMoves", c4795.f16802);
        linkedHashMap2.put("markedPaths", c4795.f16794);
        if (TextUtils.isEmpty(c4795.f16800)) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("id", c4795.f16800);
            linkedHashMap3.put(MotionUtils.EASING_TYPE_PATH, c4795.f16805);
            linkedHashMap3.put("incoming", C21949.m49659(c4795.f16815));
            linkedHashMap3.put("existing", C21949.m49659(c4795.f16814));
            linkedHashMap3.put("selectedAction", c4795.f16803);
            linkedHashMap3.put("recyclable", Boolean.valueOf(c4795.f16797));
            linkedHashMap3.put("moveToRecycleBin", Boolean.valueOf(c4795.f16811));
            linkedHashMap = linkedHashMap3;
        }
        linkedHashMap2.put("conflict", linkedHashMap);
        return linkedHashMap2;
    }
}
