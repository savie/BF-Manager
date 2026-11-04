package l;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.SpannableStringBuilder;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I53K */
/* JADX INFO: loaded from: classes.dex */
public final class C3033 implements Iterable {

    /* JADX INFO: renamed from: ۜ᩻۫, reason: not valid java name and contains not printable characters */
    public static int f9831;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f9832 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ActivityC4348 f9833;

    /* JADX INFO: renamed from: ֨ۙ᩷, reason: not valid java name and contains not printable characters */
    public static int m9845() {
        return 450735908;
    }

    /* JADX INFO: renamed from: ֨᩸ᩳ, reason: not valid java name and contains not printable characters */
    public static void m9846(Object obj, Object obj2) {
        C20653.m47272((String) obj, (Throwable) obj2);
    }

    /* JADX INFO: renamed from: ۘ᩺ۘ, reason: not valid java name and contains not printable characters */
    public static String m9847(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m9848(Object obj, int i, Object obj2) {
        ((C2361) obj).m8022(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static int m9849(Object obj) {
        return ((C20348) obj).m46749();
    }

    /* JADX INFO: renamed from: ۤ֡᩺, reason: not valid java name and contains not printable characters */
    public static String m9850(Object obj, int i) {
        return C1364.m5010((C13778) obj, i);
    }

    /* JADX INFO: renamed from: ۨܽۗ, reason: not valid java name and contains not printable characters */
    public static int m9851(Object obj) {
        return ((C24132) obj).m53993();
    }

    /* JADX INFO: renamed from: ۬᩷ۚ, reason: not valid java name and contains not printable characters */
    public static void m9852(Object obj) {
        ((AbstractC12964) obj).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܰۗ᩸, reason: not valid java name and contains not printable characters */
    public static String m9853(Object obj) {
        return ((String) obj).trim();
    }

    /* JADX INFO: renamed from: ܶۚۖ, reason: not valid java name and contains not printable characters */
    public static void m9854(Object obj, int i) {
        ((AbstractC18900) obj).m43868(i);
    }

    /* JADX INFO: renamed from: ܶ᩵᩷, reason: not valid java name and contains not printable characters */
    public static JSONArray m9855() {
        return JSON.array();
    }

    /* JADX INFO: renamed from: ܽ֫ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9856(Object obj) {
        return ((C15152) obj).m36475();
    }

    /* JADX INFO: renamed from: ܽܰۘ, reason: not valid java name and contains not printable characters */
    public static void m9857(Object obj, Object obj2) {
        ViewOnClickListenerC2063.m7128((SpannableStringBuilder) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ᩴ֨ᩳ, reason: not valid java name and contains not printable characters */
    public static void m9858(Object obj, Object obj2) {
        ((InterfaceC15712) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ᩺ۜۛ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9860(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).add((String) obj2, (JSONValue) obj3);
    }

    /* JADX INFO: renamed from: ᩻ܿܰ, reason: not valid java name and contains not printable characters */
    public static void m9861(Object obj) {
        ((C22941) obj).close();
    }

    public C3033(ActivityC4348 activityC4348) {
        this.f9833 = activityC4348;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3033 m9859(ActivityC4348 activityC4348) {
        return new C3033(activityC4348);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9862(ActivityC4348 activityC4348) {
        Intent intentMo13855 = activityC4348.mo13855();
        if (intentMo13855 == null) {
            intentMo13855 = C25188.m56153(activityC4348);
        }
        if (intentMo13855 != null) {
            ComponentName component = intentMo13855.getComponent();
            ActivityC4348 activityC4349 = this.f9833;
            if (component == null) {
                component = intentMo13855.resolveActivity(activityC4349.getPackageManager());
            }
            ArrayList arrayList = this.f9832;
            int size = arrayList.size();
            try {
                for (Intent intentM56154 = C25188.m56154(activityC4349, component); intentM56154 != null; intentM56154 = C25188.m56154(activityC4349, intentM56154.getComponent())) {
                    arrayList.add(size, intentM56154);
                }
                arrayList.add(intentMo13855);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.f9832.iterator();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9863() {
        ArrayList arrayList = this.f9832;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f9833.startActivities(intentArr, null);
    }
}
