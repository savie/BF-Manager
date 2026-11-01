package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46X2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19777 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0219 f63528;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2800 f63529;

    public C19777(C2800 c2800) {
        C0219 c0219 = new C0219();
        this.f63529 = c2800;
        this.f63528 = c0219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8488 m44989(String str, boolean z) throws C12731 {
        String str2;
        C2800 c2800 = this.f63529;
        String strM8502 = C2800.m8502(str, c2800.m8504(), MotionUtils.EASING_TYPE_PATH);
        C11268 c11268M8509 = c2800.m8509(strM8502);
        try {
            AbstractC20745 abstractC20745M8508 = c2800.m8508(strM8502);
            m44985(m44971(abstractC20745M8508), strM8502);
            String parent = abstractC20745M8508.getParent();
            if (!z) {
                C8488 c8488M44972 = m44972(strM8502, parent);
                c11268M8509.close();
                return c8488M44972;
            }
            C3070 c3070M8504 = c2800.m8504();
            do {
                c3070M8504.m9207(strM8502);
                str2 = c3070M8504.f11560;
                if (parent != null) {
                    c3070M8504.m9207(parent);
                }
                c3070M8504.m9210(strM8502);
                AbstractC20745 abstractC20745M8509 = c2800.m8508(strM8502);
                c2800.m8507(abstractC20745M8509, new C23305(strM8502, str2));
                m44985(m44971(abstractC20745M8509), strM8502);
                m44988(abstractC20745M8509, c3070M8504, strM8502);
                c3070M8504 = c2800.m8504();
            } while (!str2.equals(c3070M8504.f11560));
            c3070M8504.m9207(strM8502);
            if (parent != null) {
                c3070M8504.m9207(parent);
            }
            c3070M8504.m9210(strM8502);
            AbstractC20745 abstractC20745M85010 = c2800.m8508(strM8502);
            c2800.m8507(abstractC20745M85010, new C23305(strM8502, c3070M8504.f11560));
            m44985(m44971(abstractC20745M85010), strM8502);
            C8488 c8488M44973 = m44973(abstractC20745M85010, c3070M8504, strM8502);
            c11268M8509.close();
            return c8488M44973;
        } catch (Throwable th) {
            try {
                c11268M8509.close();
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
    private C8488 m44972(String str, String str2) throws C12731 {
        C2800 c2800;
        String str3;
        EnumC17217 enumC17217;
        C3070 c3070M8504;
        String str4;
        boolean z;
        C12731 c12731M44977;
        ?? r6;
        JSONArray jSONArray;
        do {
            c2800 = this.f63529;
            C3070 c3070M8505 = c2800.m8504();
            c3070M8505.m9207(str);
            str3 = c3070M8505.f11560;
            if (str2 != null) {
                c3070M8505.m9207(str2);
            }
            c3070M8505.m9210(str);
            AbstractC20745 abstractC20745M8508 = c2800.m8508(str);
            c2800.m8507(abstractC20745M8508, new C23305(str, str3));
            m44985(m44971(abstractC20745M8508), str);
            enumC17217 = EnumC17217.DELETE_EMPTY_DIRECTORY;
            m44980(abstractC20745M8508, enumC17217, str3, "delete_directory");
            c3070M8504 = c2800.m8504();
            str4 = c3070M8504.f11560;
        } while (!str3.equals(str4));
        AbstractC20745 abstractC20745M8509 = c2800.m8508(str);
        c2800.m8507(abstractC20745M8509, new C23305(str, str4));
        m44985(m44971(abstractC20745M8509), str);
        EnumC16512 enumC16512M44980 = m44980(abstractC20745M8509, enumC17217, str4, "delete_directory");
        String str5 = enumC16512M44980 == EnumC16512.ATOMIC ? "atomic" : "best_effort";
        JSONArray jSONArrayArray = JSON.array();
        try {
            abstractC20745M8509.mo33989().mo8390();
        } catch (C20040 e) {
            C18365 c18365M44981 = m44981(str, EnumC12279.DIRECTORY, enumC16512M44980);
            if (c18365M44981.f58569) {
                m44982(jSONArrayArray, "The backend reported an error after the directory disappeared.");
            } else {
                boolean z2 = c18365M44981.f58571;
                boolean z3 = c18365M44981.f58570;
                C12731 c12731M44979 = m44979(e);
                String str6 = c3070M8504.f11560;
                z = z3;
                c12731M44977 = m44977(c12731M44979, str, str6, str5, z2, z3, jSONArrayArray, 0, 0, str, "delete_directory", z);
                r6 = z2;
            }
            if (r6 == 0) {
                try {
                    this.f63528.getClass();
                    C2664.m8195();
                    C22252.m49410(str);
                    C11838.m29532();
                    jSONArray = jSONArrayArray;
                } catch (RuntimeException unused) {
                    jSONArray = jSONArrayArray;
                    m44982(jSONArray, "Directory change notification could not be completed.");
                }
            } else {
                this.f63528.getClass();
                C2664.m8195();
                C22252.m49410(str);
                C11838.m29532();
                jSONArray = jSONArrayArray;
            }
            if (c12731M44977 == null) {
                throw m44977(c12731M44977, str, c3070M8504.f11560, str5, r6, z, jSONArray, 0, 0, str, m44969(c12731M44977, "operation", "delete_directory"), z);
            }
            return new C8488(0, r6, new JSONArray(jSONArray), str);
        }
        c12731M44977 = null;
        r6 = 1;
        z = true;
        if (r6 == 0 || !z) {
            this.f63528.getClass();
            C2664.m8195();
            C22252.m49410(str);
            C11838.m29532();
        }
        jSONArray = jSONArrayArray;
        if (c12731M44977 == null) {
            throw m44977(c12731M44977, str, c3070M8504.f11560, str5, r6, z, jSONArray, 0, 0, str, m44969(c12731M44977, "operation", "delete_directory"), z);
        }
        return new C8488(0, r6, new JSONArray(jSONArray), str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m44988(AbstractC20745 abstractC20745, C3070 c3070, String str) throws C12731 {
        String str2 = c3070.f11560;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C21893(abstractC20745));
        while (!arrayDeque.isEmpty()) {
            C21893 c21893 = (C21893) arrayDeque.peek();
            boolean z = c21893.f71011;
            AbstractC20745 abstractC20746 = c21893.f71015;
            if (!z) {
                String strMo33986 = abstractC20746.mo33986();
                c3070.m9207(strMo33986);
                c3070.m9210(strMo33986);
                C5928 c5928M44971 = c21893.f71013;
                if (c5928M44971 == null) {
                    c5928M44971 = m44971(abstractC20746);
                }
                EnumC12279 enumC12279M16196 = c5928M44971.m16196();
                EnumC12279 enumC12279 = EnumC12279.MISSING;
                C2800 c2800 = this.f63529;
                if (enumC12279M16196 == enumC12279) {
                    if (strMo33986.equals(str)) {
                        c2800.getClass();
                        throw C2800.m8501(str);
                    }
                    arrayDeque.pop();
                } else {
                    if (c5928M44971.m16196() != EnumC12279.DIRECTORY) {
                        throw m44976(strMo33986, c5928M44971.m16196());
                    }
                    m44980(abstractC20746, EnumC17217.DELETE_EMPTY_DIRECTORY, str2, "preflight_delete_directory");
                    c2800.getClass();
                    try {
                        C21893.m48684(c21893, abstractC20746.mo33989().mo27226(c5928M44971), str, str2);
                    } catch (C20040 e) {
                        throw C2800.m8500(e);
                    }
                }
            } else if (c21893.f71014 >= c21893.f71012.size()) {
                arrayDeque.pop();
            } else {
                List list = c21893.f71012;
                int i = c21893.f71014;
                c21893.f71014 = i + 1;
                String strM44987 = m44987(c21893, (C5928) list.get(i), str, str2);
                c3070.m9207(strM44987);
                c3070.m9210(strM44987);
                C5928 c5928 = (C5928) c21893.f71012.get(c21893.f71014 - 1);
                AbstractC20745 abstractC20745M16195 = c5928.m16195();
                int i2 = C15544.f50593[c5928.m16196().ordinal()];
                if (i2 == 2) {
                    arrayDeque.push(new C21893(abstractC20745M16195, c5928, 0));
                } else if (i2 == 3 || i2 == 4) {
                    m44980(abstractC20745M16195, EnumC17217.DELETE_FILE_OR_LINK, str2, "preflight_delete_file");
                } else if (i2 == 5) {
                    throw m44976(strM44987, c5928.m16196());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:80:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r17v1, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r19v3, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r24v0, types: [l.᩵᩺۬] */
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
    private C8488 m44973(AbstractC20745 abstractC20745, C3070 c3070, String str) throws C12731 {
        C19071 c19071;
        boolean z;
        C19071 c19072;
        ?? r8;
        ?? r7;
        C12731 c12731M44977;
        C19071 c19073;
        ?? r12;
        ?? r11;
        ?? r9;
        ?? r10;
        ?? r13;
        ?? r14;
        ?? r15 = str;
        ?? Array = JSON.array();
        C19071 c19074 = new C19071();
        int i = 1;
        c19074.f61639 = true;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C21893(abstractC20745));
        while (!arrayDeque.isEmpty()) {
            try {
                C21893 c21893 = (C21893) arrayDeque.peek();
                if (!c21893.f71011) {
                    try {
                        m44986(c21893, r15, c3070, c19074);
                        if (!c21893.f71011) {
                            arrayDeque.pop();
                        }
                    } catch (C12731 e) {
                        e = e;
                        ?? r23 = r15;
                        r15 = Array;
                        Array = r23;
                        c19071 = c19074;
                        z = true;
                        String str2 = c3070.f11560;
                        if (c19071.f61637 == null) {
                            c19071.f61637 = m44969(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                            c19071.f61634 = m44969(e, "operation", "delete_tree");
                            c19071.f61639 = z;
                            c19071.f61636 = false;
                        }
                        c19072 = c19071;
                        c12731M44977 = m44977(e, str, str2, "non_atomic", C19071.m43844(c19071), c19071.f61639, r15, c19071.f61638, c19071.f61635, c19071.f61637, c19071.f61634, c19071.f61636);
                        r7 = Array;
                        r8 = r15;
                        if (C19071.m43844(c19072)) {
                            try {
                                this.f63528.getClass();
                                C2664.m8195();
                                C22252.m49410(str);
                                C11838.m29532();
                            } catch (RuntimeException unused) {
                                m44982((JSONArray) r8, "Directory change notification could not be completed.");
                            }
                        }
                        if (c12731M44977 == null) {
                            C19071 c19075 = c19072;
                            throw m44977(c12731M44977, str, c3070.f11560, "non_atomic", C19071.m43844(c19075), c19075.f61639, r8, c19075.f61638, c19075.f61635, c19075.f61637, c19075.f61634, c19075.f61636);
                        }
                        C19071 c19076 = c19072;
                        return new C8488(c19076.f61638, c19076.f61635, new JSONArray((JSONArray) r8), r7);
                    }
                } else {
                    if (c21893.f71014 < c21893.f71012.size()) {
                        List list = c21893.f71012;
                        int i2 = c21893.f71014;
                        c21893.f71014 = i2 + 1;
                        String strM44987 = m44987(c21893, (C5928) list.get(i2), r15, c3070.f11560);
                        c3070.m9207(strM44987);
                        c3070.m9210(strM44987);
                        AbstractC20745 abstractC20745M16195 = ((C5928) c21893.f71012.get(c21893.f71014 - i)).m16195();
                        try {
                            C5928 c5928M44971 = m44971(abstractC20745M16195);
                            int i3 = C15544.f50593[c5928M44971.m16196().ordinal()];
                            if (i3 == 2) {
                                c19073 = c19074;
                                r13 = Array;
                                r14 = r15;
                                arrayDeque.push(new C21893(abstractC20745M16195));
                            } else if (i3 == 3 || i3 == 4) {
                                try {
                                    c19073 = c19074;
                                    r12 = Array;
                                    r11 = r15;
                                    try {
                                        m44983(str, strM44987, abstractC20745M16195, c5928M44971.m16196(), c3070, c19073, r12);
                                        r14 = r11;
                                        r13 = r12;
                                    } catch (C12731 e2) {
                                        e = e2;
                                        Array = r11;
                                        r15 = r12;
                                        c19074 = c19073;
                                        c19071 = c19074;
                                        z = true;
                                        String str3 = c3070.f11560;
                                        if (c19071.f61637 == null) {
                                            c19071.f61637 = m44969(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                            c19071.f61634 = m44969(e, "operation", "delete_tree");
                                            c19071.f61639 = z;
                                            c19071.f61636 = false;
                                        }
                                        c19072 = c19071;
                                        c12731M44977 = m44977(e, str, str3, "non_atomic", C19071.m43844(c19071), c19071.f61639, r15, c19071.f61638, c19071.f61635, c19071.f61637, c19071.f61634, c19071.f61636);
                                        r7 = Array;
                                        r8 = r15;
                                        if (C19071.m43844(c19072)) {
                                            this.f63528.getClass();
                                            C2664.m8195();
                                            C22252.m49410(str);
                                            C11838.m29532();
                                        }
                                        if (c12731M44977 == null) {
                                            C19071 c19077 = c19072;
                                            throw m44977(c12731M44977, str, c3070.f11560, "non_atomic", C19071.m43844(c19077), c19077.f61639, r8, c19077.f61638, c19077.f61635, c19077.f61637, c19077.f61634, c19077.f61636);
                                        }
                                        C19071 c19078 = c19072;
                                        return new C8488(c19078.f61638, c19078.f61635, new JSONArray((JSONArray) r8), r7);
                                    }
                                } catch (C12731 e3) {
                                    e = e3;
                                    c19073 = c19074;
                                    r12 = Array;
                                    r11 = r15;
                                    Array = r11;
                                    r15 = r12;
                                    c19074 = c19073;
                                    c19071 = c19074;
                                    z = true;
                                    String str4 = c3070.f11560;
                                    if (c19071.f61637 == null) {
                                        c19071.f61637 = m44969(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                        c19071.f61634 = m44969(e, "operation", "delete_tree");
                                        c19071.f61639 = z;
                                        c19071.f61636 = false;
                                    }
                                    c19072 = c19071;
                                    c12731M44977 = m44977(e, str, str4, "non_atomic", C19071.m43844(c19071), c19071.f61639, r15, c19071.f61638, c19071.f61635, c19071.f61637, c19071.f61634, c19071.f61636);
                                    r7 = Array;
                                    r8 = r15;
                                    if (C19071.m43844(c19072)) {
                                        this.f63528.getClass();
                                        C2664.m8195();
                                        C22252.m49410(str);
                                        C11838.m29532();
                                    }
                                    if (c12731M44977 == null) {
                                        C19071 c19079 = c19072;
                                        throw m44977(c12731M44977, str, c3070.f11560, "non_atomic", C19071.m43844(c19079), c19079.f61639, r8, c19079.f61638, c19079.f61635, c19079.f61637, c19079.f61634, c19079.f61636);
                                    }
                                    C19071 c190710 = c19072;
                                    return new C8488(c190710.f61638, c190710.f61635, new JSONArray((JSONArray) r8), r7);
                                }
                            } else {
                                if (i3 == 5) {
                                    throw m44978(m44976(strM44987, c5928M44971.m16196()), str, c3070.f11560, c19074, strM44987, "delete_file", true, false, (JSONArray) Array, false);
                                }
                                c19071 = c19074;
                                r11 = 1;
                                ?? r24 = r15;
                                r9 = Array;
                                r10 = r24;
                                r12 = r12;
                            }
                            r10 = r14;
                            r9 = r13;
                            c19071 = c19073;
                            r11 = 1;
                            r12 = r13;
                        } catch (C12731 e4) {
                            c19073 = c19074;
                            r12 = Array;
                            r11 = r15;
                            Array = r11;
                            r15 = r12;
                            c19074 = c19073;
                            throw m44978(e4, str, c3070.f11560, c19074, strM44987, "stat_entry", !C19071.m43844(c19073), true, (JSONArray) r15, false);
                        }
                    } else {
                        try {
                            ?? r25 = r15;
                            r15 = Array;
                            Array = r25;
                            z = true;
                            r11 = 1;
                            c19071 = c19074;
                            try {
                                m44984(str, c21893.f71015, c3070, c19074, r15);
                                arrayDeque.pop();
                                r10 = Array;
                                r9 = r15;
                                r12 = r12;
                            } catch (C12731 e5) {
                                e = e5;
                                String str5 = c3070.f11560;
                                if (c19071.f61637 == null) {
                                    c19071.f61637 = m44969(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                    c19071.f61634 = m44969(e, "operation", "delete_tree");
                                    c19071.f61639 = z;
                                    c19071.f61636 = false;
                                }
                                c19072 = c19071;
                                c12731M44977 = m44977(e, str, str5, "non_atomic", C19071.m43844(c19071), c19071.f61639, r15, c19071.f61638, c19071.f61635, c19071.f61637, c19071.f61634, c19071.f61636);
                                r7 = Array;
                                r8 = r15;
                                if (C19071.m43844(c19072)) {
                                    this.f63528.getClass();
                                    C2664.m8195();
                                    C22252.m49410(str);
                                    C11838.m29532();
                                }
                                if (c12731M44977 == null) {
                                    C19071 c190711 = c19072;
                                    throw m44977(c12731M44977, str, c3070.f11560, "non_atomic", C19071.m43844(c190711), c190711.f61639, r8, c190711.f61638, c190711.f61635, c190711.f61637, c190711.f61634, c190711.f61636);
                                }
                                C19071 c190712 = c19072;
                                return new C8488(c190712.f61638, c190712.f61635, new JSONArray((JSONArray) r8), r7);
                            }
                        } catch (C12731 e6) {
                            e = e6;
                            c19071 = c19074;
                            z = true;
                            String str6 = c3070.f11560;
                            if (c19071.f61637 == null) {
                                c19071.f61637 = m44969(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                c19071.f61634 = m44969(e, "operation", "delete_tree");
                                c19071.f61639 = z;
                                c19071.f61636 = false;
                            }
                            c19072 = c19071;
                            c12731M44977 = m44977(e, str, str6, "non_atomic", C19071.m43844(c19071), c19071.f61639, r15, c19071.f61638, c19071.f61635, c19071.f61637, c19071.f61634, c19071.f61636);
                            r7 = Array;
                            r8 = r15;
                            if (C19071.m43844(c19072)) {
                                this.f63528.getClass();
                                C2664.m8195();
                                C22252.m49410(str);
                                C11838.m29532();
                            }
                            if (c12731M44977 == null) {
                                C19071 c190713 = c19072;
                                throw m44977(c12731M44977, str, c3070.f11560, "non_atomic", C19071.m43844(c190713), c190713.f61639, r8, c190713.f61638, c190713.f61635, c190713.f61637, c190713.f61634, c190713.f61636);
                            }
                            C19071 c190714 = c19072;
                            return new C8488(c190714.f61638, c190714.f61635, new JSONArray((JSONArray) r8), r7);
                        }
                    }
                    c19074 = c19071;
                    i = 1;
                    ?? r26 = r9;
                    r15 = r10;
                    Array = r26;
                }
            } catch (C12731 e7) {
                e = e7;
                c19071 = c19074;
                z = true;
                ?? r27 = r15;
                r15 = Array;
                Array = r27;
            }
        }
        ?? r28 = r15;
        r8 = Array;
        r7 = r28;
        c12731M44977 = null;
        c19072 = c19074;
        if (C19071.m43844(c19072)) {
            this.f63528.getClass();
            C2664.m8195();
            C22252.m49410(str);
            C11838.m29532();
        }
        if (c12731M44977 == null) {
            C19071 c190715 = c19072;
            throw m44977(c12731M44977, str, c3070.f11560, "non_atomic", C19071.m43844(c190715), c190715.f61639, r8, c190715.f61638, c190715.f61635, c190715.f61637, c190715.f61634, c190715.f61636);
        }
        C19071 c190716 = c19072;
        return new C8488(c190716.f61638, c190716.f61635, new JSONArray((JSONArray) r8), r7);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44986(C21893 c21893, String str, C3070 c3070, C19071 c19071) throws C12731 {
        AbstractC20745 abstractC20745 = c21893.f71015;
        String strMo33986 = abstractC20745.mo33986();
        c3070.m9207(strMo33986);
        String str2 = c3070.f11560;
        c3070.m9210(strMo33986);
        try {
            C5928 c5928M44971 = m44971(abstractC20745);
            EnumC12279 enumC12279M16196 = c5928M44971.m16196();
            EnumC12279 enumC12279 = EnumC12279.MISSING;
            C2800 c2800 = this.f63529;
            if (enumC12279M16196 == enumC12279) {
                if (strMo33986.equals(str) && c19071.f61635 == 0 && c19071.f61638 == 0) {
                    c2800.getClass();
                    throw C2800.m8501(str);
                }
                return;
            }
            if (c5928M44971.m16196() != EnumC12279.DIRECTORY) {
                throw m44978(m44976(strMo33986, c5928M44971.m16196()), str, c3070.f11560, c19071, strMo33986, "stat_directory", true, false, JSON.array(), false);
            }
            m44980(abstractC20745, EnumC17217.DELETE_EMPTY_DIRECTORY, str2, "delete_directory");
            try {
                c2800.getClass();
                try {
                    C21893.m48684(c21893, abstractC20745.mo33989().mo8389(), str, str2);
                } catch (C20040 e) {
                    throw C2800.m8500(e);
                }
            } catch (C12731 e2) {
                throw m44978(e2, str, c3070.f11560, c19071, strMo33986, "list_directory", !C19071.m43844(c19071), true, JSON.array(), false);
            }
        } catch (C12731 e3) {
            throw m44978(e3, str, c3070.f11560, c19071, strMo33986, "stat_directory", !C19071.m43844(c19071), true, JSON.array(), false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44983(String str, String str2, AbstractC20745 abstractC20745, EnumC12279 enumC12279, C3070 c3070, C19071 c19071, JSONArray jSONArray) throws C12731 {
        EnumC16512 enumC16512M44980 = m44980(abstractC20745, EnumC17217.DELETE_FILE_OR_LINK, c3070.f11560, "delete_file");
        try {
            abstractC20745.mo33989().mo8392();
            c19071.f61638++;
        } catch (C20040 e) {
            C18365 c18365M44981 = m44981(str2, enumC12279, enumC16512M44980);
            if (c18365M44981.f58569) {
                c19071.f61638++;
                m44982(jSONArray, "The backend reported an error after a file or link disappeared.");
            } else {
                C12731 c12731M44979 = m44979(e);
                String str3 = c3070.f11560;
                boolean z = c18365M44981.f58570;
                throw m44978(c12731M44979, str, str3, c19071, str2, "delete_file", z, z, jSONArray, c18365M44981.f58571);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44984(String str, AbstractC20745 abstractC20745, C3070 c3070, C19071 c19071, JSONArray jSONArray) throws C12731 {
        String strMo33986 = abstractC20745.mo33986();
        try {
            C5928 c5928M44971 = m44971(abstractC20745);
            if (c5928M44971.m16196() == EnumC12279.MISSING) {
                return;
            }
            if (c5928M44971.m16196() != EnumC12279.DIRECTORY) {
                throw m44978(m44976(strMo33986, c5928M44971.m16196()), str, c3070.f11560, c19071, strMo33986, "delete_directory", true, false, jSONArray, false);
            }
            EnumC16512 enumC16512M44980 = m44980(abstractC20745, EnumC17217.DELETE_EMPTY_DIRECTORY, c3070.f11560, "delete_directory");
            try {
                abstractC20745.mo33989().mo8390();
                c19071.f61635++;
            } catch (C20040 e) {
                C18365 c18365M44981 = m44981(strMo33986, EnumC12279.DIRECTORY, enumC16512M44980);
                if (c18365M44981.f58569) {
                    c19071.f61635++;
                    m44982(jSONArray, "The backend reported an error after a directory disappeared.");
                } else {
                    C12731 c12731M44979 = m44979(e);
                    String str2 = c3070.f11560;
                    boolean z = c18365M44981.f58570;
                    throw m44978(c12731M44979, str, str2, c19071, strMo33986, "delete_directory", z, z, jSONArray, c18365M44981.f58571);
                }
            }
        } catch (C12731 e2) {
            throw m44978(e2, str, c3070.f11560, c19071, strMo33986, "stat_directory", !C19071.m43844(c19071), true, jSONArray, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5928 m44971(AbstractC20745 abstractC20745) throws C12731 {
        try {
            return abstractC20745.mo33989().mo8394();
        } catch (C20040 e) {
            this.f63529.getClass();
            throw C2800.m8500(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C18365 m44981(String str, EnumC12279 enumC12279, EnumC16512 enumC16512) {
        C5928 c5928Mo8394;
        try {
            c5928Mo8394 = this.f63529.m8508(str).mo33989().mo8394();
        } catch (RuntimeException | C20040 unused) {
            c5928Mo8394 = null;
        }
        if (c5928Mo8394 != null && c5928Mo8394.m16196() == EnumC12279.MISSING) {
            return new C18365(true, true, true);
        }
        if (c5928Mo8394 != null && c5928Mo8394.m16196() == enumC12279) {
            return new C18365(false, true, false);
        }
        boolean z = enumC16512 == EnumC16512.ATOMIC;
        return new C18365(false, z, !z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44985(C5928 c5928, String str) throws C12731 {
        int i = C15544.f50593[c5928.m16196().ordinal()];
        C2800 c2800 = this.f63529;
        if (i == 1) {
            c2800.getClass();
            throw C2800.m8501(str);
        }
        if (i == 3) {
            throw C0280.m1794(c5928, c2800, "FILE_NOT_DIRECTORY", "The requested delete root is not a directory.", str);
        }
        if (i == 4) {
            throw C0280.m1794(c5928, c2800, "FILE_IS_SYMLINK", "Symbolic links are not accepted as directory delete roots.", str);
        }
        if (i == 5) {
            throw C0280.m1794(c5928, c2800, "FILE_UNSUPPORTED_TYPE", "Special nodes cannot be deleted by general directory tools.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12731 m44976(String str, EnumC12279 enumC12279) {
        EnumC12279 enumC122710 = EnumC12279.LINK;
        C2800 c2800 = this.f63529;
        if (enumC12279 == enumC122710) {
            c2800.getClass();
            return C2800.m8499("FILE_IS_SYMLINK", "A directory changed into a symbolic link during deletion.", str, enumC12279);
        }
        if (enumC12279 == EnumC12279.OTHER) {
            c2800.getClass();
            return C2800.m8499("FILE_UNSUPPORTED_TYPE", "The directory tree contains an unsupported special node.", str, enumC12279);
        }
        c2800.getClass();
        return C2800.m8499("FILE_NOT_DIRECTORY", "A directory changed type during deletion.", str, enumC12279);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16512 m44980(AbstractC20745 abstractC20745, EnumC17217 enumC17217, String str, String str2) throws C12731 {
        EnumC16512 enumC16512Mo1799 = abstractC20745.mo33989().mo1799(enumC17217);
        if (enumC16512Mo1799 != EnumC16512.UNSUPPORTED) {
            return enumC16512Mo1799;
        }
        throw m44975("FILE_BACKEND_UNSUPPORTED", "The file backend does not support the required checked delete operation.", abstractC20745.mo33986(), str, str2, "unsupported", (String) null, JSON.array(), abstractC20745.mo33986(), str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m44987(C21893 c21893, C5928 c5928, String str, String str2) throws C12731 {
        String strMo33986 = c5928.m16195().mo33986();
        try {
            if (C6370.m17479(strMo33986, MotionUtils.EASING_TYPE_PATH).equals(strMo33986)) {
                String strSubstring = "/";
                if ("/".equals(strMo33986)) {
                    strSubstring = null;
                } else {
                    int iLastIndexOf = strMo33986.lastIndexOf(47);
                    if (iLastIndexOf != 0) {
                        strSubstring = strMo33986.substring(0, iLastIndexOf);
                    }
                }
                if (C13638.equals(strSubstring, c21893.f71015.mo33986()) && C6370.m17477(strMo33986, str)) {
                    return strMo33986;
                }
            }
            throw m44975("FILE_STORAGE_ERROR", "The backend returned an invalid directory child identity.", str, str2, "list_directory", "invalid_child_path", "non_atomic", JSON.array(), strMo33986, "list_directory");
        } catch (C12731 unused) {
            throw m44975("FILE_STORAGE_ERROR", "The backend returned an invalid directory child identity.", str, str2, "list_directory", "invalid_child_path", "non_atomic", JSON.array(), strMo33986, "list_directory");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12731 m44979(C20040 c20040) {
        this.f63529.getClass();
        C12731 c12731M8500 = C2800.m8500(c20040);
        return c20040.m45399() != EnumC15807.IO_ERROR ? c12731M8500 : C12731.m31627("FILE_DIRECTORY_DELETE_FAILED", "Failed to permanently delete a directory tree node.", "warning", (JSONArray) null, new JSONObject(c12731M8500.f42468));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m44978(C12731 c12731, String str, String str2, C19071 c19071, String str3, String str4, boolean z, boolean z2, JSONArray jSONArray, boolean z3) {
        c19071.f61637 = str3;
        c19071.f61634 = str4;
        c19071.f61639 = z;
        c19071.f61636 = z2;
        c19071.f61633 |= z3;
        return m44977(c12731, str, str2, "non_atomic", C19071.m43844(c19071), z, jSONArray, c19071.f61638, c19071.f61635, str3, str4, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m44977(C12731 c12731, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray, int i, int i2, String str4, String str5, boolean z3) {
        JSONObject jSONObject = c12731.f42468;
        JSONArray jSONArray2 = c12731.f42471;
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
        String str6 = z4 ? "FILE_DIRECTORY_DELETE_PARTIAL" : c12731.f42472;
        if (c12731.f42469 || z4) {
            return C12731.m31627(str6, c12731.getMessage(), "warning", jSONArray2, jSONObject2);
        }
        return C12731.m31631(str6, c12731.getMessage(), c12731.f42475, jSONArray2, jSONObject2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m44975(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONArray jSONArray, String str8, String str9) {
        JSONObject jSONObjectAdd = C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", false).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", true).add("warnings", new JSONArray(jSONArray)).add("deletedFiles", 0).add("deletedDirectories", 0).add("failedPath", str8 == null ? JSON.NULL : JSON.value(str8)).add("failureStage", JSON.value(str9)).add("safeToRetry", false);
        return ("FILE_STORAGE_ERROR".equals(str) || "FILE_DIRECTORY_DELETE_FAILED".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C12731.m31627(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C12731.m31631(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44969(C12731 c12731, String str, String str2) {
        JSONValue jSONValue = c12731.f42468.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? str2 : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44982(JSONArray jSONArray, String str) {
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
