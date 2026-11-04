package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46X2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16131 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13921 f52414;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22209 f52415;

    public C16131(C22209 c22209) {
        C13921 c13921 = new C13921(1);
        this.f52415 = c22209;
        this.f52414 = c13921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17623 m38310(String str, boolean z) throws C10186 {
        String str2;
        C22209 c22209 = this.f52415;
        String strM50226 = C22209.m50226(str, c22209.m50227(), MotionUtils.EASING_TYPE_PATH);
        C19225 c19225M50233 = c22209.m50233(strM50226);
        try {
            AbstractC22044 abstractC22044M50232 = c22209.m50232(strM50226);
            m38306(m38292(abstractC22044M50232), strM50226);
            String parent = abstractC22044M50232.getParent();
            if (!z) {
                C17623 c17623M38300 = m38300(strM50226, parent);
                c19225M50233.close();
                return c17623M38300;
            }
            C9113 c9113M50227 = c22209.m50227();
            do {
                c9113M50227.m24270(strM50226);
                str2 = c9113M50227.f29602;
                if (parent != null) {
                    c9113M50227.m24270(parent);
                }
                c9113M50227.m24269(strM50226);
                AbstractC22044 abstractC22044M50233 = c22209.m50232(strM50226);
                c22209.m50231(abstractC22044M50233, new C24023(strM50226, str2));
                m38306(m38292(abstractC22044M50233), strM50226);
                m38309(abstractC22044M50233, c9113M50227, strM50226);
                c9113M50227 = c22209.m50227();
            } while (!str2.equals(c9113M50227.f29602));
            c9113M50227.m24270(strM50226);
            if (parent != null) {
                c9113M50227.m24270(parent);
            }
            c9113M50227.m24269(strM50226);
            AbstractC22044 abstractC22044M50234 = c22209.m50232(strM50226);
            c22209.m50231(abstractC22044M50234, new C24023(strM50226, c9113M50227.f29602));
            m38306(m38292(abstractC22044M50234), strM50226);
            C17623 c17623M38301 = m38301(abstractC22044M50234, c9113M50227, strM50226);
            c19225M50233.close();
            return c17623M38301;
        } catch (Throwable th) {
            try {
                c19225M50233.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00df  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17623 m38300(String str, String str2) throws C10186 {
        C22209 c22209;
        String str3;
        EnumC5636 enumC5636;
        C9113 c9113M50227;
        String str4;
        boolean z;
        C10186 c10186M38296;
        ?? r6;
        JSONArray jSONArray;
        do {
            c22209 = this.f52415;
            C9113 c9113M50228 = c22209.m50227();
            c9113M50228.m24270(str);
            str3 = c9113M50228.f29602;
            if (str2 != null) {
                c9113M50228.m24270(str2);
            }
            c9113M50228.m24269(str);
            AbstractC22044 abstractC22044M50232 = c22209.m50232(str);
            c22209.m50231(abstractC22044M50232, new C24023(str, str3));
            m38306(m38292(abstractC22044M50232), str);
            enumC5636 = EnumC5636.DELETE_EMPTY_DIRECTORY;
            m38299(abstractC22044M50232, enumC5636, str3, "delete_directory");
            c9113M50227 = c22209.m50227();
            str4 = c9113M50227.f29602;
        } while (!str3.equals(str4));
        AbstractC22044 abstractC22044M50233 = c22209.m50232(str);
        c22209.m50231(abstractC22044M50233, new C24023(str, str4));
        m38306(m38292(abstractC22044M50233), str);
        EnumC15330 enumC15330M38299 = m38299(abstractC22044M50233, enumC5636, str4, "delete_directory");
        String str5 = enumC15330M38299 == EnumC15330.ATOMIC ? "atomic" : "best_effort";
        JSONArray jSONArrayArray = JSON.array();
        try {
            abstractC22044M50233.mo4298().mo8796();
        } catch (C22790 e) {
            C25083 c25083M38302 = m38302(str, EnumC13093.DIRECTORY, enumC15330M38299);
            if (c25083M38302.f81110) {
                m38303(jSONArrayArray, "The backend reported an error after the directory disappeared.");
            } else {
                boolean z2 = c25083M38302.f81112;
                boolean z3 = c25083M38302.f81111;
                C10186 c10186M38298 = m38298(e);
                String str6 = c9113M50227.f29602;
                z = z3;
                c10186M38296 = m38296(c10186M38298, str, str6, str5, z2, z3, jSONArrayArray, 0, 0, str, "delete_directory", z);
                r6 = z2;
            }
            if (r6 == 0) {
                try {
                    this.f52414.getClass();
                    AbstractC11810.m29655();
                    C20108.m46237(str);
                    C20081.m46203();
                    jSONArray = jSONArrayArray;
                } catch (RuntimeException unused) {
                    jSONArray = jSONArrayArray;
                    m38303(jSONArray, "Directory change notification could not be completed.");
                }
            } else {
                this.f52414.getClass();
                AbstractC11810.m29655();
                C20108.m46237(str);
                C20081.m46203();
                jSONArray = jSONArrayArray;
            }
            if (c10186M38296 == null) {
                throw m38296(c10186M38296, str, c9113M50227.f29602, str5, r6, z, jSONArray, 0, 0, str, m38290(c10186M38296, "operation", "delete_directory"), z);
            }
            return new C17623(0, r6, new JSONArray(jSONArray), str);
        }
        c10186M38296 = null;
        r6 = 1;
        z = true;
        if (r6 == 0 || !z) {
            this.f52414.getClass();
            AbstractC11810.m29655();
            C20108.m46237(str);
            C20081.m46203();
        }
        jSONArray = jSONArrayArray;
        if (c10186M38296 == null) {
            throw m38296(c10186M38296, str, c9113M50227.f29602, str5, r6, z, jSONArray, 0, 0, str, m38290(c10186M38296, "operation", "delete_directory"), z);
        }
        return new C17623(0, r6, new JSONArray(jSONArray), str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m38309(AbstractC22044 abstractC22044, C9113 c9113, String str) throws C10186 {
        String str2 = c9113.f29602;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C11656(abstractC22044));
        while (!arrayDeque.isEmpty()) {
            C11656 c11656 = (C11656) arrayDeque.peek();
            boolean z = c11656.f37784;
            AbstractC22044 abstractC22045 = c11656.f37783;
            if (!z) {
                String strMo4294 = abstractC22045.mo4294();
                c9113.m24270(strMo4294);
                c9113.m24269(strMo4294);
                C1907 c1907M38292 = c11656.f37782;
                if (c1907M38292 == null) {
                    c1907M38292 = m38292(abstractC22045);
                }
                EnumC13093 enumC13093M6567 = c1907M38292.m6567();
                EnumC13093 enumC13093 = EnumC13093.MISSING;
                C22209 c22209 = this.f52415;
                if (enumC13093M6567 == enumC13093) {
                    if (strMo4294.equals(str)) {
                        c22209.getClass();
                        throw C22209.m50225(str);
                    }
                    arrayDeque.pop();
                } else {
                    if (c1907M38292.m6567() != EnumC13093.DIRECTORY) {
                        throw m38295(strMo4294, c1907M38292.m6567());
                    }
                    m38299(abstractC22045, EnumC5636.DELETE_EMPTY_DIRECTORY, str2, "preflight_delete_directory");
                    c22209.getClass();
                    try {
                        C11656.m29334(c11656, abstractC22045.mo4298().mo29161(c1907M38292), str, str2);
                    } catch (C22790 e) {
                        throw C22209.m50224(e);
                    }
                }
            } else if (c11656.f37781 >= c11656.f37780.size()) {
                arrayDeque.pop();
            } else {
                List list = c11656.f37780;
                int i = c11656.f37781;
                c11656.f37781 = i + 1;
                String strM38308 = m38308(c11656, (C1907) list.get(i), str, str2);
                c9113.m24270(strM38308);
                c9113.m24269(strM38308);
                C1907 c1907 = (C1907) c11656.f37780.get(c11656.f37781 - 1);
                AbstractC22044 abstractC22044M6565 = c1907.m6565();
                int i2 = C1962.f6581[c1907.m6567().ordinal()];
                if (i2 == 2) {
                    arrayDeque.push(new C11656(abstractC22044M6565, c1907, 0));
                } else if (i2 == 3 || i2 == 4) {
                    m38299(abstractC22044M6565, EnumC5636.DELETE_FILE_OR_LINK, str2, "preflight_delete_file");
                } else if (i2 == 5) {
                    throw m38295(strM38308, c1907.m6567());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r16v0, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r17v1, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r19v3, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r24v0, types: [l.ܶܰۚ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17623 m38301(AbstractC22044 abstractC22044, C9113 c9113, String str) throws C10186 {
        C16877 c16877;
        boolean z;
        C16877 c16878;
        ?? r8;
        ?? r7;
        C10186 c10186M38296;
        ?? r9;
        ?? r10;
        C16877 c16879;
        ?? r12;
        ?? r11;
        ?? r13;
        ?? r14;
        ?? r15 = str;
        ?? Array = JSON.array();
        C16877 c168710 = new C16877();
        int i = 1;
        c168710.f55216 = true;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C11656(abstractC22044));
        while (!arrayDeque.isEmpty()) {
            try {
                C11656 c11656 = (C11656) arrayDeque.peek();
                if (!c11656.f37784) {
                    try {
                        m38307(c11656, r15, c9113, c168710);
                        if (!c11656.f37784) {
                            arrayDeque.pop();
                        }
                    } catch (C10186 e) {
                        e = e;
                        ?? r23 = r15;
                        r15 = Array;
                        Array = r23;
                        c16877 = c168710;
                        z = true;
                        String str2 = c9113.f29602;
                        if (c16877.f55214 == null) {
                            c16877.f55214 = m38290(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                            c16877.f55219 = m38290(e, "operation", "delete_tree");
                            c16877.f55216 = z;
                            c16877.f55217 = false;
                        }
                        c16878 = c16877;
                        c10186M38296 = m38296(e, str, str2, "non_atomic", C16877.m39840(c16877), c16877.f55216, r15, c16877.f55218, c16877.f55213, c16877.f55214, c16877.f55219, c16877.f55217);
                        r7 = Array;
                        r8 = r15;
                        if (C16877.m39840(c16878)) {
                            try {
                                this.f52414.getClass();
                                AbstractC11810.m29655();
                                C20108.m46237(str);
                                C20081.m46203();
                            } catch (RuntimeException unused) {
                                m38303((JSONArray) r8, "Directory change notification could not be completed.");
                            }
                        }
                        if (c10186M38296 == null) {
                            C16877 c168711 = c16878;
                            throw m38296(c10186M38296, str, c9113.f29602, "non_atomic", C16877.m39840(c168711), c168711.f55216, r8, c168711.f55218, c168711.f55213, c168711.f55214, c168711.f55219, c168711.f55217);
                        }
                        C16877 c168712 = c16878;
                        return new C17623(c168712.f55218, c168712.f55213, new JSONArray((JSONArray) r8), r7);
                    }
                } else {
                    if (c11656.f37781 < c11656.f37780.size()) {
                        List list = c11656.f37780;
                        int i2 = c11656.f37781;
                        c11656.f37781 = i2 + 1;
                        String strM38308 = m38308(c11656, (C1907) list.get(i2), r15, c9113.f29602);
                        c9113.m24270(strM38308);
                        c9113.m24269(strM38308);
                        AbstractC22044 abstractC22044M6565 = ((C1907) c11656.f37780.get(c11656.f37781 - i)).m6565();
                        try {
                            C1907 c1907M38292 = m38292(abstractC22044M6565);
                            int i3 = C1962.f6581[c1907M38292.m6567().ordinal()];
                            if (i3 == 2) {
                                c16879 = c168710;
                                r13 = Array;
                                r14 = r15;
                                arrayDeque.push(new C11656(abstractC22044M6565));
                            } else if (i3 == 3 || i3 == 4) {
                                try {
                                    c16879 = c168710;
                                    r12 = Array;
                                    r11 = r15;
                                    try {
                                        m38304(str, strM38308, abstractC22044M6565, c1907M38292.m6567(), c9113, c16879, r12);
                                        r14 = r11;
                                        r13 = r12;
                                    } catch (C10186 e2) {
                                        e = e2;
                                        Array = r11;
                                        r15 = r12;
                                        c168710 = c16879;
                                        c16877 = c168710;
                                        z = true;
                                        String str3 = c9113.f29602;
                                        if (c16877.f55214 == null) {
                                            c16877.f55214 = m38290(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                            c16877.f55219 = m38290(e, "operation", "delete_tree");
                                            c16877.f55216 = z;
                                            c16877.f55217 = false;
                                        }
                                        c16878 = c16877;
                                        c10186M38296 = m38296(e, str, str3, "non_atomic", C16877.m39840(c16877), c16877.f55216, r15, c16877.f55218, c16877.f55213, c16877.f55214, c16877.f55219, c16877.f55217);
                                        r7 = Array;
                                        r8 = r15;
                                        if (C16877.m39840(c16878)) {
                                            this.f52414.getClass();
                                            AbstractC11810.m29655();
                                            C20108.m46237(str);
                                            C20081.m46203();
                                        }
                                        if (c10186M38296 == null) {
                                            C16877 c168713 = c16878;
                                            throw m38296(c10186M38296, str, c9113.f29602, "non_atomic", C16877.m39840(c168713), c168713.f55216, r8, c168713.f55218, c168713.f55213, c168713.f55214, c168713.f55219, c168713.f55217);
                                        }
                                        C16877 c168714 = c16878;
                                        return new C17623(c168714.f55218, c168714.f55213, new JSONArray((JSONArray) r8), r7);
                                    }
                                } catch (C10186 e3) {
                                    e = e3;
                                    c16879 = c168710;
                                    r12 = Array;
                                    r11 = r15;
                                    Array = r11;
                                    r15 = r12;
                                    c168710 = c16879;
                                    c16877 = c168710;
                                    z = true;
                                    String str4 = c9113.f29602;
                                    if (c16877.f55214 == null) {
                                        c16877.f55214 = m38290(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                        c16877.f55219 = m38290(e, "operation", "delete_tree");
                                        c16877.f55216 = z;
                                        c16877.f55217 = false;
                                    }
                                    c16878 = c16877;
                                    c10186M38296 = m38296(e, str, str4, "non_atomic", C16877.m39840(c16877), c16877.f55216, r15, c16877.f55218, c16877.f55213, c16877.f55214, c16877.f55219, c16877.f55217);
                                    r7 = Array;
                                    r8 = r15;
                                    if (C16877.m39840(c16878)) {
                                        this.f52414.getClass();
                                        AbstractC11810.m29655();
                                        C20108.m46237(str);
                                        C20081.m46203();
                                    }
                                    if (c10186M38296 == null) {
                                        C16877 c168715 = c16878;
                                        throw m38296(c10186M38296, str, c9113.f29602, "non_atomic", C16877.m39840(c168715), c168715.f55216, r8, c168715.f55218, c168715.f55213, c168715.f55214, c168715.f55219, c168715.f55217);
                                    }
                                    C16877 c168716 = c16878;
                                    return new C17623(c168716.f55218, c168716.f55213, new JSONArray((JSONArray) r8), r7);
                                }
                            } else {
                                if (i3 == 5) {
                                    throw m38297(m38295(strM38308, c1907M38292.m6567()), str, c9113.f29602, c168710, strM38308, "delete_file", true, false, (JSONArray) Array, false);
                                }
                                c16877 = c168710;
                                ?? r24 = r15;
                                r9 = Array;
                                r10 = r24;
                            }
                            r10 = r14;
                            r9 = r13;
                            c16877 = c16879;
                        } catch (C10186 e4) {
                            c16879 = c168710;
                            r12 = Array;
                            r11 = r15;
                            Array = r11;
                            r15 = r12;
                            c168710 = c16879;
                            throw m38297(e4, str, c9113.f29602, c168710, strM38308, "stat_entry", !C16877.m39840(c16879), true, (JSONArray) r15, false);
                        }
                    } else {
                        try {
                            ?? r25 = r15;
                            r15 = Array;
                            Array = r25;
                            z = true;
                            c16877 = c168710;
                            try {
                                m38305(str, c11656.f37783, c9113, c168710, r15);
                                arrayDeque.pop();
                                r10 = Array;
                                r9 = r15;
                            } catch (C10186 e5) {
                                e = e5;
                                String str5 = c9113.f29602;
                                if (c16877.f55214 == null) {
                                    c16877.f55214 = m38290(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                    c16877.f55219 = m38290(e, "operation", "delete_tree");
                                    c16877.f55216 = z;
                                    c16877.f55217 = false;
                                }
                                c16878 = c16877;
                                c10186M38296 = m38296(e, str, str5, "non_atomic", C16877.m39840(c16877), c16877.f55216, r15, c16877.f55218, c16877.f55213, c16877.f55214, c16877.f55219, c16877.f55217);
                                r7 = Array;
                                r8 = r15;
                                if (C16877.m39840(c16878)) {
                                    this.f52414.getClass();
                                    AbstractC11810.m29655();
                                    C20108.m46237(str);
                                    C20081.m46203();
                                }
                                if (c10186M38296 == null) {
                                    C16877 c168717 = c16878;
                                    throw m38296(c10186M38296, str, c9113.f29602, "non_atomic", C16877.m39840(c168717), c168717.f55216, r8, c168717.f55218, c168717.f55213, c168717.f55214, c168717.f55219, c168717.f55217);
                                }
                                C16877 c168718 = c16878;
                                return new C17623(c168718.f55218, c168718.f55213, new JSONArray((JSONArray) r8), r7);
                            }
                        } catch (C10186 e6) {
                            e = e6;
                            c16877 = c168710;
                            z = true;
                            String str6 = c9113.f29602;
                            if (c16877.f55214 == null) {
                                c16877.f55214 = m38290(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                c16877.f55219 = m38290(e, "operation", "delete_tree");
                                c16877.f55216 = z;
                                c16877.f55217 = false;
                            }
                            c16878 = c16877;
                            c10186M38296 = m38296(e, str, str6, "non_atomic", C16877.m39840(c16877), c16877.f55216, r15, c16877.f55218, c16877.f55213, c16877.f55214, c16877.f55219, c16877.f55217);
                            r7 = Array;
                            r8 = r15;
                            if (C16877.m39840(c16878)) {
                                this.f52414.getClass();
                                AbstractC11810.m29655();
                                C20108.m46237(str);
                                C20081.m46203();
                            }
                            if (c10186M38296 == null) {
                                C16877 c168719 = c16878;
                                throw m38296(c10186M38296, str, c9113.f29602, "non_atomic", C16877.m39840(c168719), c168719.f55216, r8, c168719.f55218, c168719.f55213, c168719.f55214, c168719.f55219, c168719.f55217);
                            }
                            C16877 c1687110 = c16878;
                            return new C17623(c1687110.f55218, c1687110.f55213, new JSONArray((JSONArray) r8), r7);
                        }
                    }
                    c168710 = c16877;
                    i = 1;
                    ?? r26 = r9;
                    r15 = r10;
                    Array = r26;
                }
            } catch (C10186 e7) {
                e = e7;
                c16877 = c168710;
                z = true;
                ?? r27 = r15;
                r15 = Array;
                Array = r27;
            }
        }
        ?? r28 = r15;
        r8 = Array;
        r7 = r28;
        c10186M38296 = null;
        c16878 = c168710;
        if (C16877.m39840(c16878)) {
            this.f52414.getClass();
            AbstractC11810.m29655();
            C20108.m46237(str);
            C20081.m46203();
        }
        if (c10186M38296 == null) {
            C16877 c1687111 = c16878;
            throw m38296(c10186M38296, str, c9113.f29602, "non_atomic", C16877.m39840(c1687111), c1687111.f55216, r8, c1687111.f55218, c1687111.f55213, c1687111.f55214, c1687111.f55219, c1687111.f55217);
        }
        C16877 c1687112 = c16878;
        return new C17623(c1687112.f55218, c1687112.f55213, new JSONArray((JSONArray) r8), r7);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38307(C11656 c11656, String str, C9113 c9113, C16877 c16877) throws C10186 {
        AbstractC22044 abstractC22044 = c11656.f37783;
        String strMo4294 = abstractC22044.mo4294();
        c9113.m24270(strMo4294);
        String str2 = c9113.f29602;
        c9113.m24269(strMo4294);
        try {
            C1907 c1907M38292 = m38292(abstractC22044);
            EnumC13093 enumC13093M6567 = c1907M38292.m6567();
            EnumC13093 enumC13093 = EnumC13093.MISSING;
            C22209 c22209 = this.f52415;
            if (enumC13093M6567 == enumC13093) {
                if (strMo4294.equals(str) && c16877.f55213 == 0 && c16877.f55218 == 0) {
                    c22209.getClass();
                    throw C22209.m50225(str);
                }
                return;
            }
            if (c1907M38292.m6567() != EnumC13093.DIRECTORY) {
                throw m38297(m38295(strMo4294, c1907M38292.m6567()), str, c9113.f29602, c16877, strMo4294, "stat_directory", true, false, JSON.array(), false);
            }
            m38299(abstractC22044, EnumC5636.DELETE_EMPTY_DIRECTORY, str2, "delete_directory");
            try {
                c22209.getClass();
                try {
                    C11656.m29334(c11656, abstractC22044.mo4298().mo14281(), str, str2);
                } catch (C22790 e) {
                    throw C22209.m50224(e);
                }
            } catch (C10186 e2) {
                throw m38297(e2, str, c9113.f29602, c16877, strMo4294, "list_directory", !C16877.m39840(c16877), true, JSON.array(), false);
            }
        } catch (C10186 e3) {
            throw m38297(e3, str, c9113.f29602, c16877, strMo4294, "stat_directory", !C16877.m39840(c16877), true, JSON.array(), false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38304(String str, String str2, AbstractC22044 abstractC22044, EnumC13093 enumC13093, C9113 c9113, C16877 c16877, JSONArray jSONArray) throws C10186 {
        EnumC15330 enumC15330M38299 = m38299(abstractC22044, EnumC5636.DELETE_FILE_OR_LINK, c9113.f29602, "delete_file");
        try {
            abstractC22044.mo4298().mo8793();
            c16877.f55218++;
        } catch (C22790 e) {
            C25083 c25083M38302 = m38302(str2, enumC13093, enumC15330M38299);
            if (c25083M38302.f81110) {
                c16877.f55218++;
                m38303(jSONArray, "The backend reported an error after a file or link disappeared.");
            } else {
                C10186 c10186M38298 = m38298(e);
                String str3 = c9113.f29602;
                boolean z = c25083M38302.f81111;
                throw m38297(c10186M38298, str, str3, c16877, str2, "delete_file", z, z, jSONArray, c25083M38302.f81112);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38305(String str, AbstractC22044 abstractC22044, C9113 c9113, C16877 c16877, JSONArray jSONArray) throws C10186 {
        String strMo4294 = abstractC22044.mo4294();
        try {
            C1907 c1907M38292 = m38292(abstractC22044);
            if (c1907M38292.m6567() == EnumC13093.MISSING) {
                return;
            }
            if (c1907M38292.m6567() != EnumC13093.DIRECTORY) {
                throw m38297(m38295(strMo4294, c1907M38292.m6567()), str, c9113.f29602, c16877, strMo4294, "delete_directory", true, false, jSONArray, false);
            }
            EnumC15330 enumC15330M38299 = m38299(abstractC22044, EnumC5636.DELETE_EMPTY_DIRECTORY, c9113.f29602, "delete_directory");
            try {
                abstractC22044.mo4298().mo8796();
                c16877.f55213++;
            } catch (C22790 e) {
                C25083 c25083M38302 = m38302(strMo4294, EnumC13093.DIRECTORY, enumC15330M38299);
                if (c25083M38302.f81110) {
                    c16877.f55213++;
                    m38303(jSONArray, "The backend reported an error after a directory disappeared.");
                } else {
                    C10186 c10186M38298 = m38298(e);
                    String str2 = c9113.f29602;
                    boolean z = c25083M38302.f81111;
                    throw m38297(c10186M38298, str, str2, c16877, strMo4294, "delete_directory", z, z, jSONArray, c25083M38302.f81112);
                }
            }
        } catch (C10186 e2) {
            throw m38297(e2, str, c9113.f29602, c16877, strMo4294, "stat_directory", !C16877.m39840(c16877), true, jSONArray, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1907 m38292(AbstractC22044 abstractC22044) throws C10186 {
        try {
            return abstractC22044.mo4298().mo8790();
        } catch (C22790 e) {
            this.f52415.getClass();
            throw C22209.m50224(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C25083 m38302(String str, EnumC13093 enumC13093, EnumC15330 enumC15330) {
        C1907 c1907Mo8790;
        try {
            c1907Mo8790 = this.f52415.m50232(str).mo4298().mo8790();
        } catch (RuntimeException | C22790 unused) {
            c1907Mo8790 = null;
        }
        if (c1907Mo8790 != null && c1907Mo8790.m6567() == EnumC13093.MISSING) {
            return new C25083(true, true, true);
        }
        if (c1907Mo8790 != null && c1907Mo8790.m6567() == enumC13093) {
            return new C25083(false, true, false);
        }
        boolean z = enumC15330 == EnumC15330.ATOMIC;
        return new C25083(false, z, !z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38306(C1907 c1907, String str) throws C10186 {
        int i = C1962.f6581[c1907.m6567().ordinal()];
        C22209 c22209 = this.f52415;
        if (i == 1) {
            c22209.getClass();
            throw C22209.m50225(str);
        }
        if (i == 3) {
            throw C24770.m55295(c1907, c22209, "FILE_NOT_DIRECTORY", "The requested delete root is not a directory.", str);
        }
        if (i == 4) {
            throw C24770.m55295(c1907, c22209, "FILE_IS_SYMLINK", "Symbolic links are not accepted as directory delete roots.", str);
        }
        if (i == 5) {
            throw C24770.m55295(c1907, c22209, "FILE_UNSUPPORTED_TYPE", "Special nodes cannot be deleted by general directory tools.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10186 m38295(String str, EnumC13093 enumC13093) {
        EnumC13093 enumC13094 = EnumC13093.LINK;
        C22209 c22209 = this.f52415;
        if (enumC13093 == enumC13094) {
            c22209.getClass();
            return C22209.m50223("FILE_IS_SYMLINK", "A directory changed into a symbolic link during deletion.", str, enumC13093);
        }
        if (enumC13093 == EnumC13093.OTHER) {
            c22209.getClass();
            return C22209.m50223("FILE_UNSUPPORTED_TYPE", "The directory tree contains an unsupported special node.", str, enumC13093);
        }
        c22209.getClass();
        return C22209.m50223("FILE_NOT_DIRECTORY", "A directory changed type during deletion.", str, enumC13093);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC15330 m38299(AbstractC22044 abstractC22044, EnumC5636 enumC5636, String str, String str2) throws C10186 {
        EnumC15330 enumC15330Mo8788 = abstractC22044.mo4298().mo8788(enumC5636);
        if (enumC15330Mo8788 != EnumC15330.UNSUPPORTED) {
            return enumC15330Mo8788;
        }
        throw m38294("FILE_BACKEND_UNSUPPORTED", "The file backend does not support the required checked delete operation.", abstractC22044.mo4294(), str, str2, "unsupported", (String) null, JSON.array(), abstractC22044.mo4294(), str2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m38308(C11656 c11656, C1907 c1907, String str, String str2) throws C10186 {
        String strMo4294 = c1907.m6565().mo4294();
        try {
            if (C0470.m2304(strMo4294, MotionUtils.EASING_TYPE_PATH).equals(strMo4294)) {
                String strSubstring = "/";
                if ("/".equals(strMo4294)) {
                    strSubstring = null;
                } else {
                    int iLastIndexOf = strMo4294.lastIndexOf(47);
                    if (iLastIndexOf != 0) {
                        strSubstring = strMo4294.substring(0, iLastIndexOf);
                    }
                }
                if (C17359.equals(strSubstring, c11656.f37783.mo4294()) && C0470.m2302(strMo4294, str)) {
                    return strMo4294;
                }
            }
            throw m38294("FILE_STORAGE_ERROR", "The backend returned an invalid directory child identity.", str, str2, "list_directory", "invalid_child_path", "non_atomic", JSON.array(), strMo4294, "list_directory");
        } catch (C10186 unused) {
            throw m38294("FILE_STORAGE_ERROR", "The backend returned an invalid directory child identity.", str, str2, "list_directory", "invalid_child_path", "non_atomic", JSON.array(), strMo4294, "list_directory");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10186 m38298(C22790 c22790) {
        this.f52415.getClass();
        C10186 c10186M50224 = C22209.m50224(c22790);
        return c22790.m51409() != EnumC10855.IO_ERROR ? c10186M50224 : C10186.m26302("FILE_DIRECTORY_DELETE_FAILED", "Failed to permanently delete a directory tree node.", "warning", (JSONArray) null, new JSONObject(c10186M50224.f32602));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m38297(C10186 c10186, String str, String str2, C16877 c16877, String str3, String str4, boolean z, boolean z2, JSONArray jSONArray, boolean z3) {
        c16877.f55214 = str3;
        c16877.f55219 = str4;
        c16877.f55216 = z;
        c16877.f55217 = z2;
        c16877.f55215 |= z3;
        return m38296(c10186, str, str2, "non_atomic", C16877.m39840(c16877), z, jSONArray, c16877.f55218, c16877.f55213, str3, str4, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m38296(C10186 c10186, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray, int i, int i2, String str4, String str5, boolean z3) {
        JSONObject jSONObject = c10186.f32602;
        JSONArray jSONArray2 = c10186.f32599;
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, str);
        jSONObject2.put("policyRevision", str2);
        jSONObject2.put("changed", z);
        jSONObject2.put("operationMode", JSON.value(str3));
        jSONObject2.put("stateKnown", z2);
        jSONObject2.put("warnings", new JSONArray(jSONArray));
        jSONObject2.put("deletedFiles", i);
        jSONObject2.put("deletedDirectories", i2);
        jSONObject2.put("failedPath", str4 == null ? JSON.NULL : JSON.value(str4));
        jSONObject2.put("failureStage", str5 == null ? JSON.NULL : JSON.value(str5));
        jSONObject2.put("safeToRetry", z3);
        boolean z4 = "non_atomic".equals(str3) && (i > 0 || i2 > 0 || z);
        String str6 = z4 ? "FILE_DIRECTORY_DELETE_PARTIAL" : c10186.f32601;
        if (c10186.f32600 || z4) {
            return C10186.m26302(str6, c10186.getMessage(), "warning", jSONArray2, jSONObject2);
        }
        return C10186.m26306(str6, c10186.getMessage(), c10186.f32604, jSONArray2, jSONObject2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m38294(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONArray jSONArray, String str8, String str9) {
        JSONObject jSONObjectAdd = C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", false).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", true).add("warnings", new JSONArray(jSONArray)).add("deletedFiles", 0).add("deletedDirectories", 0).add("failedPath", str8 == null ? JSON.NULL : JSON.value(str8)).add("failureStage", JSON.value(str9)).add("safeToRetry", false);
        return ("FILE_STORAGE_ERROR".equals(str) || "FILE_DIRECTORY_DELETE_FAILED".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C10186.m26302(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C10186.m26306(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38290(C10186 c10186, String str, String str2) {
        JSONValue jSONValue = c10186.f32602.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? str2 : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38303(JSONArray jSONArray, String str) {
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
