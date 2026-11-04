package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܳܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15385 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13921 f50166;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22209 f50167;

    public C15385(C22209 c22209) {
        C13921 c13921 = new C13921(1);
        this.f50167 = c22209;
        this.f50166 = c13921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19861 m36856(String str) throws C10186 {
        C22209 c22209 = this.f50167;
        C9113 c9113M50227 = c22209.m50227();
        String strM2299 = C0470.m2299(c9113M50227, str, MotionUtils.EASING_TYPE_PATH, false);
        c9113M50227.m24270(strM2299);
        C19225 c19225M50233 = c22209.m50233(strM2299);
        try {
            C19861 c19861M36858 = m36858(strM2299);
            c19225M50233.close();
            return c19861M36858;
        } catch (Throwable th) {
            try {
                c19225M50233.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6931. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final l.C19861 m36858(java.lang.String r26) throws l.C10186 {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15385.m36858(java.lang.String):l.ᩴܰۚ");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36857(String str) throws C10186 {
        m36853(str, this.f50167.m50227());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22845 m36853(String str, C9113 c9113) throws C10186 {
        ArrayDeque arrayDeque = new ArrayDeque();
        C22209 c22209 = this.f50167;
        AbstractC22044 abstractC22044M50232 = c22209.m50232(str);
        String strM36855 = str;
        do {
            c9113.m24270(strM36855);
            String str2 = c9113.f29602;
            AbstractC22044 abstractC22044M50233 = c22209.m50232(strM36855);
            C1907 c1907M36847 = m36847(abstractC22044M50233);
            if (c1907M36847.m6567() == EnumC13093.DIRECTORY) {
                if (!arrayDeque.isEmpty()) {
                    c9113.m24270(strM36855);
                }
                if (abstractC22044M50232.mo19981() || (abstractC22044M50232 instanceof C0678) || (abstractC22044M50232 instanceof C18379)) {
                    String strM36856 = m36855(strM36855);
                    while (strM36856 != null) {
                        AbstractC22044 abstractC22044M50234 = c22209.m50232(strM36856);
                        try {
                            C1907 c1907Mo8790 = abstractC22044M50234.mo4298().mo8790();
                            if (c1907Mo8790.m6567() == EnumC13093.LINK) {
                                throw m36848("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a modifying file tool.", str, str2, "parent_is_link");
                            }
                            if (c1907Mo8790.m6567() != EnumC13093.DIRECTORY) {
                                throw m36848(c1907Mo8790.m6567() != EnumC13093.MISSING ? "FILE_NOT_DIRECTORY" : "FILE_LINK_CHECK_FAILED", "The existing parent chain could not be verified safely.", str, str2, c1907Mo8790.m6567().name().toLowerCase(Locale.ROOT));
                            }
                            strM36856 = abstractC22044M50234.getParent();
                        } catch (C22790 e) {
                            throw m36848("FILE_LINK_CHECK_FAILED", "A parent link status could not be verified safely.", str, str2, e.m51409().name().toLowerCase(Locale.ROOT));
                        }
                    }
                }
                return new C22845(new ArrayList(arrayDeque));
            }
            if (c1907M36847.m6567() != EnumC13093.MISSING) {
                throw m36850(strM36855, c1907M36847.m6567());
            }
            m36852(abstractC22044M50233, str2);
            arrayDeque.addFirst(strM36855);
            strM36855 = m36855(strM36855);
        } while (strM36855 != null);
        throw m36849("FILE_PARENT_NOT_FOUND", "No existing writable parent directory was found.", str, c9113.f29602, "preflight", "parent_missing", false, (String) null, JSON.array(), 0, (String) null, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m36848(String str, String str2, String str3, String str4, String str5) {
        return C10186.m26306(str, str2, "fatal", null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", "check_parent_links").add("backendReason", str5).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1907 m36847(AbstractC22044 abstractC22044) throws C10186 {
        try {
            return abstractC22044.mo4298().mo8790();
        } catch (C22790 e) {
            this.f50167.getClass();
            throw C22209.m50224(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10186 m36850(String str, EnumC13093 enumC13093) {
        int i = C10910.f34541[enumC13093.ordinal()];
        C22209 c22209 = this.f50167;
        if (i == 1) {
            c22209.getClass();
            return C22209.m50223("FILE_IS_SYMLINK", "A symbolic link cannot be used as a mkdir -p directory component.", str, enumC13093);
        }
        if (i == 2) {
            c22209.getClass();
            return C22209.m50223("FILE_UNSUPPORTED_TYPE", "A special node cannot be used as a mkdir -p directory component.", str, enumC13093);
        }
        c22209.getClass();
        return C22209.m50223("FILE_NOT_DIRECTORY", "An existing mkdir -p path component is not a directory.", str, enumC13093);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC15330 m36852(AbstractC22044 abstractC22044, String str) throws C10186 {
        EnumC15330 enumC15330Mo8788 = abstractC22044.mo4298().mo8788(EnumC5636.CREATE_DIRECTORY_SINGLE);
        if (enumC15330Mo8788 != EnumC15330.UNSUPPORTED) {
            return enumC15330Mo8788;
        }
        throw m36849("FILE_BACKEND_UNSUPPORTED", "The file backend does not support checked directory creation.", abstractC22044.mo4294(), str, "create_directory", "unsupported", false, (String) null, JSON.array(), 0, (String) null, abstractC22044.mo4294());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m36851(C10186 c10186, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray, int i, String str4, String str5, String str6, boolean z3) {
        JSONObject jSONObject = c10186.f32602;
        JSONArray jSONArray2 = c10186.f32599;
        String str7 = c10186.f32604;
        String str8 = c10186.f32601;
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, str);
        jSONObject2.put("policyRevision", str2);
        jSONObject2.put("changed", z);
        jSONObject2.put("operationMode", JSON.value(str3));
        jSONObject2.put("stateKnown", z2);
        jSONObject2.put("warnings", new JSONArray(jSONArray));
        jSONObject2.put("createdDirectories", i);
        jSONObject2.put("deepestCreatedPath", str4 == null ? JSON.NULL : JSON.value(str4));
        jSONObject2.put("failedPath", str5 == null ? JSON.NULL : JSON.value(str5));
        jSONObject2.put("failureStage", str6 == null ? JSON.NULL : JSON.value(str6));
        jSONObject2.put("safeToRetry", z3);
        if (c10186.f32600) {
            return C10186.m26302(str8, c10186.getMessage(), str7, jSONArray2, jSONObject2);
        }
        return C10186.m26306(str8, c10186.getMessage(), str7, jSONArray2, jSONObject2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m36849(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, JSONArray jSONArray, int i, String str8, String str9) {
        JSONObject jSONObjectAdd = C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", z).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", true).add("warnings", new JSONArray(jSONArray)).add("createdDirectories", i).add("deepestCreatedPath", str8 == null ? JSON.NULL : JSON.value(str8)).add("failedPath", str9 == null ? JSON.NULL : JSON.value(str9)).add("failureStage", str5).add("safeToRetry", true);
        return "FILE_STORAGE_ERROR".equals(str) ? C10186.m26302(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C10186.m26306(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m36855(String str) {
        if ("/".equals(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == 0 ? "/" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36854(JSONArray jSONArray, String str) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            if (jSONValue.isString() && str.equals(jSONValue.asString())) {
                return;
            }
        }
        jSONArray.add(str);
    }
}
