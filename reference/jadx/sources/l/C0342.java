package l;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S78W */
/* JADX INFO: loaded from: classes2.dex */
public final class C0342 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SharedPreferences f1834;

    public C0342() {
        this(C21576.m49084());
    }

    public C0342(Application application) {
        this.f1834 = application.getSharedPreferences("remote_auth", 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m2078() {
        String string = this.f1834.getString("trusted_devices_json", "");
        if (TextUtils.isEmpty(string)) {
            return new ArrayList();
        }
        try {
            JSONObject jSONObjectM48360 = C21203.m48360(string);
            if (C21203.m48368(jSONObjectM48360, "version") != 2) {
                m2076();
                return new ArrayList();
            }
            try {
                JSONArray jSONArray = jSONObjectM48360.getJSONArray("devices");
                if (jSONArray == null) {
                    return new ArrayList();
                }
                ArrayList arrayList = new ArrayList(jSONArray.size());
                for (int i = 0; i < jSONArray.size(); i++) {
                    C18241 c18241M2075 = m2075(jSONArray, i);
                    if (c18241M2075 != null) {
                        arrayList.add(c18241M2075);
                    }
                }
                return arrayList;
            } catch (RuntimeException e) {
                throw C21203.m48365(e);
            }
        } catch (C14489 unused) {
            m2076();
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2079(ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C18241 c18241 = (C18241) it.next();
            jSONArray.add(new JSONObject().add("deviceId", c18241.f59545).add("deviceName", c18241.f59551).add("publicKey", c18241.f59549).add("firstAccessAt", c18241.f59547).add("lastAccessAt", c18241.f59552).add("lastIp", c18241.f59550).add("userAgent", c18241.f59546).add("temporary", c18241.f59548));
        }
        jSONObject.add("version", 2);
        jSONObject.add("devices", jSONArray);
        this.f1834.edit().putString("trusted_devices_json", jSONObject.toString()).apply();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m2076() {
        this.f1834.edit().putString("trusted_devices_json", new JSONObject().add("version", 2).add("devices", new JSONArray()).toString()).commit();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2080(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayListM2078 = m2078();
        boolean zRemoveIf = C1170.removeIf(arrayListM2078, new Predicate() { // from class: l.᩶ۢۧ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C18241) obj).f59545);
            }
        });
        if (zRemoveIf) {
            m2079(arrayListM2078);
        }
        return zRemoveIf;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m2077(ArrayList arrayList) {
        C12884.sort(arrayList, C8627.reversed(C2661.comparingLong(new C14511())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18241 m2075(JSONArray jSONArray, int i) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C18241 c18241 = new C18241();
            String strM48367 = C21203.m48367(jSONObject, "deviceId");
            c18241.f59545 = strM48367;
            if (TextUtils.isEmpty(strM48367)) {
                return null;
            }
            c18241.f59551 = C21203.m48367(jSONObject, "deviceName");
            c18241.f59549 = C21203.m48367(jSONObject, "publicKey");
            c18241.f59547 = C21203.m48368(jSONObject, "firstAccessAt");
            c18241.f59552 = C21203.m48368(jSONObject, "lastAccessAt");
            c18241.f59550 = C21203.m48367(jSONObject, "lastIp");
            c18241.f59546 = C21203.m48367(jSONObject, "userAgent");
            c18241.f59548 = false;
            return c18241;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4071 m2074(C18241 c18241) {
        return new C4071(c18241.f59545, c18241.f59551, c18241.f59547, c18241.f59552, c18241.f59550, c18241.f59546, c18241.f59548);
    }
}
