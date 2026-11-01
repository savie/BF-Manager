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

/* JADX INFO: renamed from: l.۬᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13427 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0219 f44421;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2800 f44422;

    public C13427(C2800 c2800) {
        C0219 c0219 = new C0219();
        this.f44422 = c2800;
        this.f44421 = c0219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1431 m32919(String str) {
        C2800 c2800 = this.f44422;
        C3070 c3070M8504 = c2800.m8504();
        String strM17474 = C6370.m17474(c3070M8504, str, MotionUtils.EASING_TYPE_PATH, false);
        c3070M8504.m9207(strM17474);
        C11268 c11268M8509 = c2800.m8509(strM17474);
        try {
            C1431 c1431M32921 = m32921(strM17474);
            c11268M8509.close();
            return c1431M32921;
        } catch (Throwable th) {
            try {
                c11268M8509.close();
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final l.C1431 m32921(java.lang.String r26) throws l.C12731 {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13427.m32921(java.lang.String):l.֨᩺۬");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32920(String str) throws C12731 {
        m32917(str, this.f44422.m8504());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22599 m32917(String str, C3070 c3070) throws C12731 {
        ArrayDeque arrayDeque = new ArrayDeque();
        C2800 c2800 = this.f44422;
        AbstractC20745 abstractC20745M8508 = c2800.m8508(str);
        String strM32910 = str;
        do {
            c3070.m9207(strM32910);
            String str2 = c3070.f11560;
            AbstractC20745 abstractC20745M8509 = c2800.m8508(strM32910);
            C5928 c5928M32911 = m32911(abstractC20745M8509);
            if (c5928M32911.m16196() == EnumC12279.DIRECTORY) {
                if (!arrayDeque.isEmpty()) {
                    c3070.m9207(strM32910);
                }
                if (abstractC20745M8508.mo33979() || (abstractC20745M8508 instanceof C17589) || (abstractC20745M8508 instanceof C17196)) {
                    String strM32911 = m32910(strM32910);
                    while (strM32911 != null) {
                        AbstractC20745 abstractC20745M85010 = c2800.m8508(strM32911);
                        try {
                            C5928 c5928Mo8394 = abstractC20745M85010.mo33989().mo8394();
                            if (c5928Mo8394.m16196() == EnumC12279.LINK) {
                                throw m32912("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a modifying file tool.", str, str2, "parent_is_link");
                            }
                            if (c5928Mo8394.m16196() != EnumC12279.DIRECTORY) {
                                throw m32912(c5928Mo8394.m16196() != EnumC12279.MISSING ? "FILE_NOT_DIRECTORY" : "FILE_LINK_CHECK_FAILED", "The existing parent chain could not be verified safely.", str, str2, c5928Mo8394.m16196().name().toLowerCase(Locale.ROOT));
                            }
                            strM32911 = abstractC20745M85010.getParent();
                        } catch (C20040 e) {
                            throw m32912("FILE_LINK_CHECK_FAILED", "A parent link status could not be verified safely.", str, str2, e.m45399().name().toLowerCase(Locale.ROOT));
                        }
                    }
                }
                return new C22599(new ArrayList(arrayDeque));
            }
            if (c5928M32911.m16196() != EnumC12279.MISSING) {
                throw m32914(strM32910, c5928M32911.m16196());
            }
            m32916(abstractC20745M8509, str2);
            arrayDeque.addFirst(strM32910);
            strM32910 = m32910(strM32910);
        } while (strM32910 != null);
        throw m32913("FILE_PARENT_NOT_FOUND", "No existing writable parent directory was found.", str, c3070.f11560, "preflight", "parent_missing", false, (String) null, JSON.array(), 0, (String) null, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m32912(String str, String str2, String str3, String str4, String str5) {
        return C12731.m31631(str, str2, "fatal", null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", "check_parent_links").add("backendReason", str5).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5928 m32911(AbstractC20745 abstractC20745) throws C12731 {
        try {
            return abstractC20745.mo33989().mo8394();
        } catch (C20040 e) {
            this.f44422.getClass();
            throw C2800.m8500(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12731 m32914(String str, EnumC12279 enumC12279) {
        int i = C5665.f19342[enumC12279.ordinal()];
        C2800 c2800 = this.f44422;
        if (i == 1) {
            c2800.getClass();
            return C2800.m8499("FILE_IS_SYMLINK", "A symbolic link cannot be used as a mkdir -p directory component.", str, enumC12279);
        }
        if (i == 2) {
            c2800.getClass();
            return C2800.m8499("FILE_UNSUPPORTED_TYPE", "A special node cannot be used as a mkdir -p directory component.", str, enumC12279);
        }
        c2800.getClass();
        return C2800.m8499("FILE_NOT_DIRECTORY", "An existing mkdir -p path component is not a directory.", str, enumC12279);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16512 m32916(AbstractC20745 abstractC20745, String str) throws C12731 {
        EnumC16512 enumC16512Mo1799 = abstractC20745.mo33989().mo1799(EnumC17217.CREATE_DIRECTORY_SINGLE);
        if (enumC16512Mo1799 != EnumC16512.UNSUPPORTED) {
            return enumC16512Mo1799;
        }
        throw m32913("FILE_BACKEND_UNSUPPORTED", "The file backend does not support checked directory creation.", abstractC20745.mo33986(), str, "create_directory", "unsupported", false, (String) null, JSON.array(), 0, (String) null, abstractC20745.mo33986());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m32915(C12731 c12731, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray, int i, String str4, String str5, String str6, boolean z3) {
        JSONObject jSONObject = c12731.f42468;
        JSONArray jSONArray2 = c12731.f42471;
        String str7 = c12731.f42475;
        String str8 = c12731.f42472;
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
        if (c12731.f42469) {
            return C12731.m31627(str8, c12731.getMessage(), str7, jSONArray2, jSONObject2);
        }
        return C12731.m31631(str8, c12731.getMessage(), str7, jSONArray2, jSONObject2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m32913(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, JSONArray jSONArray, int i, String str8, String str9) {
        JSONObject jSONObjectAdd = C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", z).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", true).add("warnings", new JSONArray(jSONArray)).add("createdDirectories", i).add("deepestCreatedPath", str8 == null ? JSON.NULL : JSON.value(str8)).add("failedPath", str9 == null ? JSON.NULL : JSON.value(str9)).add("failureStage", str5).add("safeToRetry", true);
        return "FILE_STORAGE_ERROR".equals(str) ? C12731.m31627(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C12731.m31631(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m32910(String str) {
        if ("/".equals(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == 0 ? "/" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32918(JSONArray jSONArray, String str) {
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
