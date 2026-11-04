package l;

import android.content.DialogInterface;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewParent;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0148 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f1117;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f1118;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f1119;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public HashMap f1120;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f1121;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f1122;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f1123;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f1124;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f1125;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f1126;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f1127;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f1128;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f1129;

    public abstract C20613 getIcon();

    public abstract String getName();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo1325();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC18881 mo1326(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo1328(AbstractActivityC17204 abstractActivityC17204);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean mo1329() {
        return this instanceof C21799;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract String mo1330();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract String mo1332();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract String mo1333();

    public AbstractC0148(int i) {
        this.f1122 = "";
        this.f1128 = "";
        this.f1129 = false;
        this.f1123 = true;
        this.f1126 = true;
        this.f1124 = true;
        this.f1119 = true;
        this.f1117 = "10MB";
        this.f1121 = m1314("10MB");
        this.f1118 = 10;
        this.f1125 = false;
        this.f1120 = new HashMap();
        this.f1127 = i;
    }

    public AbstractC0148(JSONObject jSONObject) {
        this.f1122 = "";
        this.f1128 = "";
        this.f1129 = false;
        this.f1123 = true;
        this.f1126 = true;
        this.f1124 = true;
        this.f1119 = true;
        this.f1117 = "10MB";
        this.f1121 = m1314("10MB");
        this.f1118 = 10;
        this.f1125 = false;
        this.f1120 = new HashMap();
        this.f1127 = jSONObject.getInt("id");
        this.f1122 = jSONObject.getString("rk");
        this.f1128 = jSONObject.getString("ip");
        if (jSONObject.contains("hs")) {
            this.f1129 = jSONObject.getBoolean("hs");
        }
        if (jSONObject.contains("mt")) {
            this.f1123 = jSONObject.getBoolean("mt");
        }
        if (jSONObject.contains("fg")) {
            this.f1126 = jSONObject.getBoolean("fg");
        }
        if (jSONObject.contains("lt")) {
            this.f1124 = jSONObject.getBoolean("lt");
        }
        if (jSONObject.contains("ow")) {
            this.f1119 = jSONObject.getBoolean("ow");
        }
        if (jSONObject.contains("il")) {
            String string = jSONObject.getString("il");
            this.f1117 = string;
            this.f1121 = m1314(string);
        }
        if (jSONObject.contains("tl")) {
            this.f1118 = jSONObject.getInt("tl");
        }
        if (mo1329() && jSONObject.contains("sp")) {
            this.f1125 = jSONObject.getBoolean("sp");
        }
        if (jSONObject.contains("sm")) {
            JSONArray jSONArray = jSONObject.getJSONArray("sm");
            int size = jSONArray.size();
            for (int i = 0; i < size; i += 2) {
                this.f1120.put(jSONArray.getString(i), Integer.valueOf(jSONArray.getInt(i + 1)));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1327(AbstractC0148 abstractC0148) {
        this.f1122 = abstractC0148.f1122;
        this.f1128 = abstractC0148.f1128;
        this.f1129 = abstractC0148.f1129;
        this.f1123 = abstractC0148.f1123;
        this.f1125 = abstractC0148.f1125;
        HashMap map = this.f1120;
        map.clear();
        map.putAll(abstractC0148.f1120);
        m1334(abstractC0148);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1334(AbstractC0148 abstractC0148) {
        this.f1126 = abstractC0148.f1126;
        this.f1124 = abstractC0148.f1124;
        this.f1119 = abstractC0148.f1119;
        String str = abstractC0148.f1117;
        this.f1117 = str;
        this.f1118 = abstractC0148.f1118;
        this.f1121 = m1314(str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public JSONObject mo1331() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f1127);
        jSONObject.put("rk", this.f1122);
        jSONObject.put("ip", this.f1128);
        jSONObject.put("hs", this.f1129);
        jSONObject.put("mt", this.f1123);
        jSONObject.put("fg", this.f1126);
        jSONObject.put("lt", this.f1124);
        jSONObject.put("ow", this.f1119);
        jSONObject.put("il", this.f1117);
        jSONObject.put("tl", this.f1118);
        if (mo1329()) {
            jSONObject.put("sp", this.f1125);
        }
        HashMap map = this.f1120;
        if (!map.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : map.entrySet()) {
                jSONArray.add((String) entry.getKey());
                jSONArray.add(((Integer) entry.getValue()).intValue());
            }
            jSONObject.put("sm", jSONArray);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1315(C23255 c23255, String str) {
        return c23255.m54099() > 0 ? c23255.m54021().toString() : str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m1313() {
        return C7606.m20796();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1320(C23255 c23255) {
        if (c23255.m54099() <= 0) {
            return true;
        }
        try {
            Charset.forName(c23255.m54021().toString());
            return true;
        } catch (Exception unused) {
            C22673.m51152(R.string.MT_Protector);
            c23255.requestFocus();
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m1324(C23255 c23255) {
        if (!m1321(c23255, R.string.MT_Protector)) {
            return false;
        }
        String string = c23255.m54021().toString();
        int iIndexOf = string.indexOf("://");
        if (iIndexOf != -1) {
            c23255.m54021().delete(0, iIndexOf + 3);
            string = c23255.m54021().toString();
        }
        int iIndexOf2 = string.indexOf(47, iIndexOf);
        if (iIndexOf2 <= 0) {
            return true;
        }
        m1323(c23255, R.string.MT_Protector);
        c23255.mo52316(iIndexOf2, c23255.m54099());
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1321(C23255 c23255, int i) {
        if (c23255.m54099() != 0) {
            return true;
        }
        m1323(c23255, i);
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m1323(C23255 c23255, int i) {
        C1626 c1626;
        c23255.requestFocus();
        ViewParent parent = c23255.getParent();
        while (true) {
            if (parent == null) {
                c1626 = null;
                break;
            } else {
                if (parent instanceof C1626) {
                    c1626 = (C1626) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        C17359.requireNonNull(c1626);
        c1626.m5769(true);
        c1626.m5768(C21576.m49075(i));
        if (c1626.getTag() instanceof TextWatcher) {
            return;
        }
        C17301 c17301 = new C17301(c1626);
        c1626.setTag(c17301);
        c23255.m53899(c17301);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1317(final C23255 c23255, final AbstractActivityC17204 abstractActivityC17204) {
        C1626 c1626;
        for (ViewParent parent = c23255.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof C1626) {
                c1626 = (C1626) parent;
                C17359.requireNonNull(c1626);
                c1626.m5767(-1);
                c1626.m5757(R.drawable.MT_Protector);
                c1626.m5759(new View.OnClickListener() { // from class: l.ۧۗ۫
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final C23255 c23256 = c23255;
                        String string = c23256.m54021().toString();
                        ArrayList arrayList = new ArrayList(C2448.f7865 - 1);
                        int size = -1;
                        for (int i = 0; i < C2448.f7865; i++) {
                            String strM8274 = C2448.m8274(i);
                            if (!strM8274.equals("UTF-8-BOM")) {
                                if (strM8274.equalsIgnoreCase(string)) {
                                    size = arrayList.size();
                                }
                                arrayList.add(strM8274);
                            }
                        }
                        final String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
                        c2361BuildDialog.m8021(R.string.MT_Protector);
                        c2361BuildDialog.m8013(strArr, size, new DialogInterface.OnClickListener() { // from class: l.᩻ۗ۫
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                c23256.mo52335((CharSequence) strArr[i2]);
                                dialogInterface.dismiss();
                            }
                        });
                        c2361BuildDialog.m8026(R.string.MT_Protector, null);
                        c2361BuildDialog.m8016();
                    }
                });
            }
        }
        c1626 = null;
        C17359.requireNonNull(c1626);
        c1626.m5767(-1);
        c1626.m5757(R.drawable.MT_Protector);
        c1626.m5759(new View.OnClickListener() { // from class: l.ۧۗ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C23255 c23256 = c23255;
                String string = c23256.m54021().toString();
                ArrayList arrayList = new ArrayList(C2448.f7865 - 1);
                int size = -1;
                for (int i = 0; i < C2448.f7865; i++) {
                    String strM8274 = C2448.m8274(i);
                    if (!strM8274.equals("UTF-8-BOM")) {
                        if (strM8274.equalsIgnoreCase(string)) {
                            size = arrayList.size();
                        }
                        arrayList.add(strM8274);
                    }
                }
                final String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8013(strArr, size, new DialogInterface.OnClickListener() { // from class: l.᩻ۗ۫
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        c23256.mo52335((CharSequence) strArr[i2]);
                        dialogInterface.dismiss();
                    }
                });
                c2361BuildDialog.m8026(R.string.MT_Protector, null);
                c2361BuildDialog.m8016();
            }
        });
    }

    @Override // 
    public final AbstractC0148 clone() {
        try {
            return (AbstractC0148) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC0148 abstractC0148 = (AbstractC0148) obj;
            if (this.f1127 == abstractC0148.f1127 && C17359.equals(this.f1122, abstractC0148.f1122) && C17359.equals(this.f1128, abstractC0148.f1128) && this.f1129 == abstractC0148.f1129 && this.f1123 == abstractC0148.f1123 && this.f1125 == abstractC0148.f1125 && this.f1126 == abstractC0148.f1126 && this.f1124 == abstractC0148.f1124 && this.f1119 == abstractC0148.f1119 && this.f1121 == abstractC0148.f1121 && this.f1118 == abstractC0148.f1118) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iM55771 = (((((((((C24966.m55771(C24966.m55771(this.f1127 * 31, 31, this.f1122), 31, this.f1128) + (this.f1129 ? 1231 : 1237)) * 31) + (this.f1123 ? 1231 : 1237)) * 31) + (this.f1125 ? 1231 : 1237)) * 31) + (this.f1126 ? 1231 : 1237)) * 31) + (this.f1124 ? 1231 : 1237)) * 31;
        int i = this.f1119 ? 1231 : 1237;
        long j = this.f1121;
        return ((((iM55771 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f1118;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1318(C23255 c23255, C23255 c23256) {
        m1319(c23255, c23256, new C0415(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m1314(String str) {
        long j;
        long j2 = str.endsWith("KB") ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS : 1048576L;
        try {
            j = Integer.parseInt(str.substring(0, str.length() - 2));
        } catch (NumberFormatException unused) {
            j = 10;
        }
        return j2 * j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1319(C23255 c23255, C23255 c23256, Function function) {
        c23256.m52337(((CharSequence) function.apply(c23255.m54021())).toString());
        c23255.m53899(new C15809(c23256, function));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1316(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.contains(str) || !jSONObject.contains(str2)) {
            return;
        }
        jSONObject.put(str, jSONObject.getBoolean(str2));
        jSONObject.remove(str2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m1322(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.contains(str) || !jSONObject.contains(str2)) {
            return;
        }
        jSONObject.put(str, jSONObject.getString(str2));
        jSONObject.remove(str2);
    }
}
