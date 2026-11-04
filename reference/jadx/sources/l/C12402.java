package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۨܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6XG */
/* JADX INFO: loaded from: classes3.dex */
public final class C12402 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13921 f39898;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22209 f39899;

    public C12402(C22209 c22209) {
        C13921 c13921 = new C13921(1);
        this.f39899 = c22209;
        this.f39898 = c13921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20607 m30879(String str) throws C10186 {
        C22209 c22209 = this.f39899;
        C9113 c9113M50227 = c22209.m50227();
        String strM50226 = C22209.m50226(str, c9113M50227, MotionUtils.EASING_TYPE_PATH);
        C19225 c19225M50233 = c22209.m50233(strM50226);
        try {
            C20607 c20607M30877 = m30877(strM50226, c9113M50227);
            c19225M50233.close();
            return c20607M30877;
        } catch (Throwable th) {
            try {
                c19225M50233.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20607 m30877(String str, C9113 c9113) throws C10186 {
        String str2;
        C9113 c9113M50227;
        String str3;
        C3453 c3453;
        boolean z;
        boolean z2;
        C10186 c10186M30875;
        C22209 c22209 = this.f39899;
        AbstractC22044 abstractC22044M50232 = c22209.m50232(str);
        m30878(m30874(abstractC22044M50232), str);
        m30876(abstractC22044M50232, c9113.f29602);
        String parent = abstractC22044M50232.getParent();
        do {
            C9113 c9113M50228 = c22209.m50227();
            c9113M50228.m24270(str);
            str2 = c9113M50228.f29602;
            if (parent != null) {
                c9113M50228.m24270(parent);
            }
            c9113M50228.m24269(str);
            AbstractC22044 abstractC22044M50233 = c22209.m50232(str);
            c22209.m50231(abstractC22044M50233, new C10577(str, str2));
            m30878(m30874(abstractC22044M50233), str);
            m30876(abstractC22044M50233, str2);
            c9113M50227 = c22209.m50227();
            str3 = c9113M50227.f29602;
        } while (!str2.equals(str3));
        AbstractC22044 abstractC22044M50234 = c22209.m50232(str);
        c22209.m50231(abstractC22044M50234, new C10577(str, str3));
        m30878(m30874(abstractC22044M50234), str);
        EnumC15330 enumC15330M30876 = m30876(abstractC22044M50234, str3);
        String str4 = enumC15330M30876 == EnumC15330.ATOMIC ? "atomic" : "best_effort";
        JSONArray<JSONValue> jSONArrayArray = JSON.array();
        try {
            abstractC22044M50234.mo4298().mo8793();
            c10186M30875 = null;
            z = true;
            z2 = true;
        } catch (C22790 e) {
            try {
                C1907 c1907Mo8790 = c22209.m50232(str).mo4298().mo8790();
                if (c1907Mo8790.m6567() == EnumC13093.MISSING) {
                    c3453 = new C3453(true, true);
                } else if (c1907Mo8790.m6567() == EnumC13093.REGULAR) {
                    c3453 = new C3453(false, true);
                } else {
                    c3453 = new C3453(true, false);
                }
            } catch (RuntimeException | C22790 unused) {
                boolean z3 = enumC15330M30876 == EnumC15330.ATOMIC;
                c3453 = new C3453(!z3, z3);
            }
            C10186 c10186M50224 = C22209.m50224(e);
            C10186 c10186M26302 = e.m51409() != EnumC10855.IO_ERROR ? c10186M50224 : C10186.m26302("FILE_DELETE_FAILED", "Failed to permanently delete the local file.", "warning", (JSONArray) null, new JSONObject(c10186M50224.f32602));
            String str5 = c9113M50227.f29602;
            z = c3453.f11256;
            z2 = c3453.f11257;
            c10186M30875 = m30875(c10186M26302, str, str5, str4, z, z2, jSONArrayArray);
        }
        if (z || !z2) {
            try {
                this.f39898.getClass();
                AbstractC11810.m29655();
                C20108.m46239(str);
                C20081.m46203();
            } catch (RuntimeException unused2) {
                for (JSONValue jSONValue : jSONArrayArray) {
                    if (!jSONValue.isString() || !"File change notification could not be completed.".equals(jSONValue.asString())) {
                    }
                }
                jSONArrayArray.add("File change notification could not be completed.");
            }
        }
        if (c10186M30875 != null) {
            throw m30875(c10186M30875, str, c9113M50227.f29602, str4, z, z2, jSONArrayArray);
        }
        return new C20607(new JSONArray(jSONArrayArray), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1907 m30874(AbstractC22044 abstractC22044) throws C10186 {
        try {
            return abstractC22044.mo4298().mo8790();
        } catch (C22790 e) {
            this.f39899.getClass();
            throw C22209.m50224(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30878(C1907 c1907, String str) throws C10186 {
        int i = C23591.f76596[c1907.m6567().ordinal()];
        C22209 c22209 = this.f39899;
        if (i == 2) {
            c22209.getClass();
            throw C22209.m50225(str);
        }
        if (i == 3) {
            throw C24770.m55295(c1907, c22209, "FILE_NOT_REGULAR", "Directory paths must be deleted with mt_file_delete_directory.", str);
        }
        if (i == 4) {
            throw C24770.m55295(c1907, c22209, "FILE_IS_SYMLINK", "Symbolic links are not accepted by mt_file_delete.", str);
        }
        if (i == 5) {
            throw C24770.m55295(c1907, c22209, "FILE_UNSUPPORTED_TYPE", "Special nodes cannot be deleted by general file tools.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC15330 m30876(AbstractC22044 abstractC22044, String str) throws C10186 {
        EnumC15330 enumC15330Mo8788 = abstractC22044.mo4298().mo8788(EnumC5636.DELETE_FILE_OR_LINK);
        if (enumC15330Mo8788 != EnumC15330.UNSUPPORTED) {
            return enumC15330Mo8788;
        }
        throw C10186.m26306("FILE_BACKEND_UNSUPPORTED", "The file backend does not support checked permanent deletion.", "fatal", null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, abstractC22044.mo4294(), "policyRevision", str).add("operation", "delete_file").add("backendReason", "unsupported").add("changed", false).add("operationMode", JSON.NULL).add("stateKnown", true).add("warnings", new JSONArray(JSON.array())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m30875(C10186 c10186, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray) {
        JSONObject jSONObject = c10186.f32602;
        JSONArray jSONArray2 = c10186.f32599;
        String str4 = c10186.f32604;
        String str5 = c10186.f32601;
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, str);
        jSONObject2.put("policyRevision", str2);
        jSONObject2.put("changed", z);
        jSONObject2.put("operationMode", JSON.value(str3));
        jSONObject2.put("stateKnown", z2);
        jSONObject2.put("warnings", new JSONArray(jSONArray));
        if (c10186.f32600) {
            return C10186.m26302(str5, c10186.getMessage(), str4, jSONArray2, jSONObject2);
        }
        return C10186.m26306(str5, c10186.getMessage(), str4, jSONArray2, jSONObject2);
    }
}
