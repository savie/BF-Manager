package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.֡ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0580 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f2340;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f2341;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14483 f2342;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22209 f2343;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f2344;

    static {
        SecureRandom secureRandom = new SecureRandom();
        f2340 = secureRandom;
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        f2341 = C15022.m36182(bArr);
    }

    public C0580(C22209 c22209) {
        C14483 c14483 = new C14483(8);
        this.f2344 = new LinkedHashMap(16, 0.75f, true);
        this.f2343 = c22209;
        this.f2342 = c14483;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2072 m2659(String str, String str2, boolean z) throws C10186 {
        C22209 c22209 = this.f2343;
        C9113 c9113M50227 = c22209.m50227();
        String strM50219 = C22209.m50219(str, c9113M50227, "sourcePath");
        String strM50226 = C22209.m50226(str2, c9113M50227, "destinationPath");
        if (strM50219.equals(strM50226)) {
            throw m2623("FILE_INVALID_PATH", "Source and destination must have different normalized absolute paths.", strM50219, strM50226, c9113M50227.f29602, "prepare", "same_path", false, null, true, JSON.array());
        }
        C19225 c19225M50229 = c22209.m50229(Arrays.asList(strM50219, strM50226));
        try {
            C2072 c2072M2617 = m2617(c9113M50227, strM50219, strM50226, z);
            c19225M50229.close();
            return c2072M2617;
        } catch (Throwable th) {
            try {
                c19225M50229.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21463 m2663(String str, boolean z, InterfaceC24447 interfaceC24447) throws C10186 {
        C22209 c22209 = this.f2343;
        C9113 c9113M50227 = c22209.m50227();
        String strM50226 = C22209.m50226(str, c9113M50227, "localPath");
        C19225 c19225M50233 = c22209.m50233(strM50226);
        try {
            try {
                C21463 c21463M2629 = m2629(strM50226, z, new C22955(interfaceC24447), c9113M50227);
                c19225M50233.close();
                return c21463M2629;
            } catch (C10186 e) {
                throw m2625(e, strM50226, c9113M50227.f29602);
            }
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
    public final C16241 m2661(String str, boolean z, C9113 c9113, InterfaceC17733 interfaceC17733) throws C10186 {
        this.f2343.getClass();
        String strM50226 = C22209.m50226(str, c9113, MotionUtils.EASING_TYPE_PATH);
        if (!strM50226.equals(str)) {
            throw C10186.m26301("The claimed file path must be normalized and absolute.", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        try {
            return new C16241(m2629(strM50226, z, new C11020(this, interfaceC17733, strM50226, c9113), c9113));
        } catch (C10186 e) {
            throw m2625(e, strM50226, c9113.f29602);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5977 m2660(String str, C6132 c6132) throws C10186 {
        C22209 c22209 = this.f2343;
        C9113 c9113M50227 = c22209.m50227();
        String strM50219 = C22209.m50219(str, c9113M50227, "localPath");
        C19225 c19225M50228 = c22209.m50228(strM50219);
        try {
            try {
                AbstractC22044 abstractC22044M50232 = c22209.m50232(strM50219);
                c22209.m50230(abstractC22044M50232);
                C1907 c1907M2616 = m2616(abstractC22044M50232.mo4298());
                m2657(c1907M2616, strM50219);
                if (c1907M2616.m6566() > 9007199254740991L) {
                    throw m2624("FILE_STORAGE_ERROR", "The local source size exceeds the supported JSON integer range.", strM50219, c9113M50227.f29602, "source_stat", "size_out_of_range", false, null, true, JSON.array(), null, null);
                }
                C6547 c6547 = new C6547(this, strM50219, abstractC22044M50232, c1907M2616);
                c6547.f21983 = true;
                try {
                    C5977 c5977M42092 = C18064.m42092(c6132.f20943, c6132.f20945, c6132.f20944, c6547);
                    C6547.m18439(c6547);
                    c6547.f21983 = false;
                    c19225M50228.close();
                    return c5977M42092;
                } catch (Throwable th) {
                    c6547.f21983 = false;
                    throw th;
                }
            } catch (C10186 e) {
                throw m2625(e, strM50219, c9113M50227.f29602);
            }
        } catch (Throwable th2) {
            try {
                c19225M50228.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x025b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0264 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0266  */
    /* JADX WARN: Code duplicated, block: B:157:0x026f  */
    /* JADX WARN: Code duplicated, block: B:163:0x029e  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x030d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0322 A[LOOP:1: B:184:0x031c->B:186:0x0322, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x0362  */
    /* JADX WARN: Code duplicated, block: B:190:0x036b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0374  */
    /* JADX WARN: Code duplicated, block: B:194:0x0386  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2072 m2617(C9113 c9113, String str, String str2, boolean z) throws C10186, C22790 {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z2;
        boolean z3;
        String str8;
        boolean z4;
        boolean z5;
        String str9;
        boolean z6;
        String str10;
        String str11;
        boolean z7;
        String str12;
        C10186 c10186;
        boolean z8;
        C10186 c10186M2623;
        String simpleName;
        C10186 c10187;
        String str13;
        String str14;
        boolean z9;
        JSONObject jSONObjectObject;
        JSONArray jSONArray;
        String str15;
        String str16;
        String str17;
        JSONArray jSONArray2;
        EnumC12588 enumC12588M54791;
        EnumC12588 enumC12588M54794;
        C0580 c0580 = this;
        C22209 c22209 = c0580.f2343;
        AbstractC22044 abstractC22044M50232 = c22209.m50232(str);
        AbstractC11601 abstractC11601Mo4298 = abstractC22044M50232.mo4298();
        c22209.m50230(abstractC22044M50232);
        C1907 c1907M2616 = c0580.m2616(abstractC11601Mo4298);
        c0580.m2657(c1907M2616, str);
        if (c1907M2616.m6566() > 9007199254740991L) {
            throw m2623("FILE_STORAGE_ERROR", "The source size exceeds the supported JSON integer range.", str, str2, c9113.f29602, "source_stat", "size_out_of_range", false, null, true, JSON.array());
        }
        JSONArray jSONArrayArray = JSON.array();
        C5801 c5801M2620 = m2620(str2, str, z, c9113, jSONArrayArray);
        AbstractC11601 abstractC11601 = c5801M2620.f19929;
        String str18 = c5801M2620.f19925;
        AbstractC22044 abstractC22044 = c5801M2620.f19927;
        String strMo4294 = abstractC22044.mo4294();
        C3563 c3563 = c5801M2620.f19928;
        String str19 = c3563.f12208;
        String str20 = c9113.f29602;
        String str21 = "copy_to_temp";
        RuntimeException runtimeException = null;
        long jM2614 = 0;
        String str22 = str19;
        try {
            try {
                m2635(str, str2, abstractC11601, c3563, str20, jSONArrayArray);
                jM2614 = m2614(abstractC22044M50232, abstractC22044);
                str3 = str20;
                while (true) {
                    try {
                        C9113 c9113M50227 = c22209.m50227();
                        String str23 = c9113M50227.f29602;
                        try {
                            try {
                                str21 = "pre_publish_validation";
                                c9113M50227.m24268(str);
                                c9113M50227.m24270(str2);
                                c9113M50227.m24270(str18);
                                c9113M50227.m24269(str2);
                                AbstractC22044 abstractC22044M50233 = c22209.m50232(str);
                                AbstractC11601 abstractC11601Mo4299 = abstractC22044M50233.mo4298();
                                c5801M2620.m16916(c9113M50227.f29602);
                                AbstractC22044 abstractC22045 = c5801M2620.f19923;
                                AbstractC11601 abstractC11602 = c5801M2620.f19929;
                                AbstractC22044 abstractC22046 = c5801M2620.f19927;
                                AbstractC11601 abstractC11603 = c5801M2620.f19926;
                                c0580.m2657(c0580.m2616(abstractC11601Mo4299), str);
                                C1907 c1907M2617 = c0580.m2616(abstractC11602);
                                c0580.m2643(c1907M2617, str2);
                                if (!z) {
                                    try {
                                        try {
                                            if (c1907M2617.m6567() != EnumC13093.MISSING) {
                                                str16 = str23;
                                                jSONArray2 = jSONArrayArray;
                                                try {
                                                    try {
                                                        try {
                                                            throw m2623("FILE_ALREADY_EXISTS", "The destination appeared before publication and overwrite is false.", str, str2, c9113M50227.f29602, "pre_publish_destination", "already_exists", false, str22, true, jSONArrayArray);
                                                        } catch (IOException e) {
                                                            e = e;
                                                            jSONArrayArray = jSONArray2;
                                                            str5 = str16;
                                                            str8 = str22;
                                                            z4 = false;
                                                            str9 = str8;
                                                            z6 = z4;
                                                            str10 = str5;
                                                            str12 = str21;
                                                            z7 = false;
                                                            if (z6) {
                                                                simpleName = e.getClass().getSimpleName();
                                                                c10186M2623 = m2623("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                            } else {
                                                                c10186M2623 = m2623("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                            }
                                                            c10186 = c10186M2623;
                                                            z8 = z6;
                                                            str6 = str9;
                                                            c10187 = c10186;
                                                            str13 = str6;
                                                            m2636(strMo4294, str2, z8, jSONArrayArray, runtimeException);
                                                            if (runtimeException != null) {
                                                                throw runtimeException;
                                                            }
                                                            if (c10187 != null) {
                                                                str14 = c10187.f32601;
                                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                    z9 = false;
                                                                } else {
                                                                    z9 = false;
                                                                }
                                                                jSONObjectObject = JSON.object();
                                                                JSONObject<JSONObject.Member> jSONObject = c10187.f32602;
                                                                jSONArray = c10187.f32599;
                                                                str15 = c10187.f32604;
                                                                for (JSONObject.Member member : jSONObject) {
                                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                                }
                                                                jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                                if (c10187.f32600) {
                                                                    throw C10186.m26302(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                }
                                                                throw C10186.m26306(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                                                            }
                                                            return new C2072(str, str2, new JSONArray(jSONArrayArray), jM2614);
                                                        } catch (RuntimeException e2) {
                                                            e = e2;
                                                        }
                                                    } catch (C10186 e3) {
                                                        e = e3;
                                                        jSONArrayArray = jSONArray2;
                                                        str6 = str22;
                                                        z3 = false;
                                                        z5 = false;
                                                        z7 = z5;
                                                        boolean z10 = z3;
                                                        c10186 = e;
                                                        z8 = z10;
                                                        c10187 = c10186;
                                                        str13 = str6;
                                                        m2636(strMo4294, str2, z8, jSONArrayArray, runtimeException);
                                                        if (runtimeException != null) {
                                                            throw runtimeException;
                                                        }
                                                        if (c10187 != null) {
                                                            str14 = c10187.f32601;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                z9 = false;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject2 = c10187.f32602;
                                                            jSONArray = c10187.f32599;
                                                            str15 = c10187.f32604;
                                                            while (r3.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                            if (c10187.f32600) {
                                                                throw C10186.m26302(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C10186.m26306(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C2072(str, str2, new JSONArray(jSONArrayArray), jM2614);
                                                    }
                                                } catch (IOException e4) {
                                                    e = e4;
                                                } catch (RuntimeException e5) {
                                                    e = e5;
                                                    jSONArrayArray = jSONArray2;
                                                }
                                            }
                                        } catch (RuntimeException e6) {
                                            e = e6;
                                            str16 = str23;
                                            jSONArray2 = jSONArrayArray;
                                        }
                                        jSONArrayArray = jSONArray2;
                                    } catch (IOException e7) {
                                        e = e7;
                                        str16 = str23;
                                        jSONArray2 = jSONArrayArray;
                                    } catch (C10186 e8) {
                                        e = e8;
                                        jSONArray2 = jSONArrayArray;
                                    }
                                    str17 = str22;
                                    str22 = str17;
                                    str4 = str16;
                                    str7 = str22;
                                    z2 = false;
                                    str9 = str7;
                                    z6 = z2;
                                    str10 = str4;
                                    str11 = str21;
                                    z7 = false;
                                    if (m2652(e)) {
                                        if (z6) {
                                            simpleName = e.getClass().getSimpleName();
                                            c10186M2623 = m2623("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                        } else {
                                            c10186M2623 = m2623("FILE_STORAGE_ERROR", "The storage backend failed while preparing the copied file.", str, str2, str10, str11, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                        }
                                        c10186 = c10186M2623;
                                        z8 = z6;
                                        str6 = str9;
                                        c10187 = c10186;
                                        str13 = str6;
                                    } else {
                                        c10187 = null;
                                        str13 = str9;
                                        runtimeException = e;
                                        z8 = z6;
                                    }
                                }
                                str16 = str23;
                                try {
                                    m2634(str, str2, c0580.m2616(abstractC11603), c9113M50227.f29602, jSONArrayArray);
                                    boolean z11 = c1907M2617.m6567() == EnumC13093.REGULAR;
                                    C3563 c3563M2654 = m2654(abstractC11603, z11);
                                    String str24 = c3563M2654.f12208;
                                    try {
                                        str9 = str24;
                                        try {
                                            try {
                                                m2635(str, str2, abstractC11602, c3563M2654, c9113M50227.f29602, jSONArrayArray);
                                                C24523 c24523 = new C24523();
                                                try {
                                                    try {
                                                        enumC12588M54791 = c24523.m54791(z11 ? abstractC22045 : abstractC22044M50233);
                                                    } catch (RuntimeException unused) {
                                                        enumC12588M54791 = EnumC12588.FAILED;
                                                    }
                                                    if (c9113M50227.f29602.equals(c22209.m50227().f29602)) {
                                                        if (enumC12588M54791 != EnumC12588.SUCCESS) {
                                                            m2633(jSONArrayArray, z11 ? "Existing destination mode, owner, or group metadata could not be fully captured." : "Source mode, owner, or group metadata could not be fully captured.");
                                                            c24523 = null;
                                                        }
                                                        try {
                                                            str21 = "publish";
                                                            boolean z12 = z11;
                                                            jSONArrayArray = jSONArrayArray;
                                                            try {
                                                                m2640(str2, abstractC22046, abstractC11603, abstractC22045, abstractC11602, c3563M2654, jM2614, c9113M50227.f29602);
                                                                try {
                                                                    try {
                                                                        str21 = "restore_metadata";
                                                                        AbstractC22044 abstractC22044M50234 = c22209.m50232(str2);
                                                                        if (c24523 != null) {
                                                                            try {
                                                                                enumC12588M54794 = c24523.m54794(abstractC22044M50234);
                                                                            } catch (RuntimeException unused2) {
                                                                                enumC12588M54794 = EnumC12588.FAILED;
                                                                            }
                                                                            if (enumC12588M54794 != EnumC12588.SUCCESS) {
                                                                                m2633(jSONArrayArray, z12 ? "Existing destination mode, owner, or group metadata could not be fully restored." : "Source mode, owner, or group metadata could not be fully applied to the destination.");
                                                                            }
                                                                        }
                                                                        if (!z12) {
                                                                            try {
                                                                                C14584.m35196(abstractC22044M50234);
                                                                            } catch (RuntimeException unused3) {
                                                                                m2633(jSONArrayArray, "SELinux context restoration could not be completed.");
                                                                            }
                                                                        }
                                                                        m2644(abstractC22044M50234, c1907M2616.m6568(), jSONArrayArray);
                                                                        z8 = true;
                                                                        c10187 = null;
                                                                        str13 = str9;
                                                                        z7 = true;
                                                                        break;
                                                                    } catch (RuntimeException e9) {
                                                                        e = e9;
                                                                        str11 = str21;
                                                                        str10 = str16;
                                                                        z6 = true;
                                                                        z7 = true;
                                                                        if (m2652(e)) {
                                                                            c10187 = null;
                                                                            str13 = str9;
                                                                            runtimeException = e;
                                                                            z8 = z6;
                                                                        } else {
                                                                            if (z6) {
                                                                                simpleName = e.getClass().getSimpleName();
                                                                                c10186M2623 = m2623("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                                            } else {
                                                                                c10186M2623 = m2623("FILE_STORAGE_ERROR", "The storage backend failed while preparing the copied file.", str, str2, str10, str11, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                                            }
                                                                            c10186 = c10186M2623;
                                                                            z8 = z6;
                                                                            str6 = str9;
                                                                            c10187 = c10186;
                                                                            str13 = str6;
                                                                        }
                                                                    }
                                                                } catch (IOException e10) {
                                                                    e = e10;
                                                                    str12 = str21;
                                                                    str10 = str16;
                                                                    z6 = true;
                                                                    z7 = true;
                                                                    if (z6) {
                                                                        simpleName = e.getClass().getSimpleName();
                                                                        c10186M2623 = m2623("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                                    } else {
                                                                        c10186M2623 = m2623("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                                    }
                                                                    c10186 = c10186M2623;
                                                                    z8 = z6;
                                                                    str6 = str9;
                                                                    c10187 = c10186;
                                                                    str13 = str6;
                                                                } catch (C10186 e11) {
                                                                    e = e11;
                                                                    z3 = true;
                                                                    z5 = true;
                                                                    str6 = str9;
                                                                    z7 = z5;
                                                                    boolean z13 = z3;
                                                                    c10186 = e;
                                                                    z8 = z13;
                                                                    c10187 = c10186;
                                                                    str13 = str6;
                                                                }
                                                            } catch (IOException e12) {
                                                                e = e12;
                                                                str5 = str16;
                                                                str8 = str9;
                                                                z4 = true;
                                                                str9 = str8;
                                                                z6 = z4;
                                                                str10 = str5;
                                                                str12 = str21;
                                                                z7 = false;
                                                            } catch (RuntimeException e13) {
                                                                e = e13;
                                                                str4 = str16;
                                                                str7 = str9;
                                                                z2 = true;
                                                                str9 = str7;
                                                                z6 = z2;
                                                                str10 = str4;
                                                                str11 = str21;
                                                                z7 = false;
                                                            } catch (C10186 e14) {
                                                                e = e14;
                                                                z3 = true;
                                                                str6 = str9;
                                                                z5 = false;
                                                                z7 = z5;
                                                                boolean z14 = z3;
                                                                c10186 = e;
                                                                z8 = z14;
                                                                c10187 = c10186;
                                                                str13 = str6;
                                                                m2636(strMo4294, str2, z8, jSONArrayArray, runtimeException);
                                                                if (runtimeException != null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (c10187 != null) {
                                                                    str14 = c10187.f32601;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                        z9 = false;
                                                                    } else {
                                                                        z9 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject3 = c10187.f32602;
                                                                    jSONArray = c10187.f32599;
                                                                    str15 = c10187.f32604;
                                                                    while (r3.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                                    if (c10187.f32600) {
                                                                        throw C10186.m26302(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C10186.m26306(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C2072(str, str2, new JSONArray(jSONArrayArray), jM2614);
                                                            }
                                                        } catch (IOException e15) {
                                                            e = e15;
                                                            jSONArrayArray = jSONArrayArray;
                                                        } catch (RuntimeException e16) {
                                                            e = e16;
                                                            jSONArrayArray = jSONArrayArray;
                                                        } catch (C10186 e17) {
                                                            e = e17;
                                                            jSONArrayArray = jSONArrayArray;
                                                        }
                                                    } else {
                                                        c0580 = this;
                                                        str3 = str16;
                                                        str22 = str9;
                                                    }
                                                } catch (IOException e18) {
                                                    e = e18;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str22 = str9;
                                                    str5 = str16;
                                                    str8 = str22;
                                                    z4 = false;
                                                } catch (C10186 e19) {
                                                    e = e19;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str6 = str9;
                                                    z3 = false;
                                                    z5 = false;
                                                    z7 = z5;
                                                    boolean z15 = z3;
                                                    c10186 = e;
                                                    z8 = z15;
                                                    c10187 = c10186;
                                                    str13 = str6;
                                                    m2636(strMo4294, str2, z8, jSONArrayArray, runtimeException);
                                                    if (runtimeException != null) {
                                                        throw runtimeException;
                                                    }
                                                    if (c10187 != null) {
                                                        str14 = c10187.f32601;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                            z9 = false;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject4 = c10187.f32602;
                                                        jSONArray = c10187.f32599;
                                                        str15 = c10187.f32604;
                                                        while (r3.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                        if (c10187.f32600) {
                                                            throw C10186.m26302(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C10186.m26306(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C2072(str, str2, new JSONArray(jSONArrayArray), jM2614);
                                                }
                                            } catch (RuntimeException e20) {
                                                e = e20;
                                                jSONArrayArray = jSONArrayArray;
                                                str17 = str9;
                                                str22 = str17;
                                                str4 = str16;
                                                str7 = str22;
                                                z2 = false;
                                            }
                                        } catch (IOException e21) {
                                            e = e21;
                                        } catch (C10186 e22) {
                                            e = e22;
                                        }
                                    } catch (IOException e23) {
                                        e = e23;
                                        str9 = str24;
                                    } catch (RuntimeException e24) {
                                        e = e24;
                                        jSONArrayArray = jSONArrayArray;
                                        str22 = str24;
                                        str17 = str22;
                                    } catch (C10186 e25) {
                                        e = e25;
                                        str9 = str24;
                                    }
                                } catch (IOException e26) {
                                    e = e26;
                                    jSONArrayArray = jSONArrayArray;
                                    str5 = str16;
                                    str8 = str22;
                                    z4 = false;
                                    str9 = str8;
                                    z6 = z4;
                                    str10 = str5;
                                    str12 = str21;
                                    z7 = false;
                                    if (z6) {
                                        simpleName = e.getClass().getSimpleName();
                                        c10186M2623 = m2623("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                    } else {
                                        c10186M2623 = m2623("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                    }
                                    c10186 = c10186M2623;
                                    z8 = z6;
                                    str6 = str9;
                                    c10187 = c10186;
                                    str13 = str6;
                                    m2636(strMo4294, str2, z8, jSONArrayArray, runtimeException);
                                    if (runtimeException != null) {
                                        throw runtimeException;
                                    }
                                    if (c10187 != null) {
                                        str14 = c10187.f32601;
                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        jSONObjectObject = JSON.object();
                                        JSONObject<JSONObject.Member> jSONObject5 = c10187.f32602;
                                        jSONArray = c10187.f32599;
                                        str15 = c10187.f32604;
                                        while (r3.hasNext()) {
                                            jSONObjectObject.put(member.getName(), member.getValue());
                                        }
                                        jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                        if (c10187.f32600) {
                                            throw C10186.m26302(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                                        }
                                        throw C10186.m26306(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                                    }
                                    return new C2072(str, str2, new JSONArray(jSONArrayArray), jM2614);
                                } catch (RuntimeException e27) {
                                    e = e27;
                                    jSONArrayArray = jSONArrayArray;
                                }
                            } catch (IOException e28) {
                                e = e28;
                                str16 = str23;
                            }
                        } catch (RuntimeException e29) {
                            e = e29;
                            str16 = str23;
                        }
                    } catch (IOException e30) {
                        e = e30;
                        str5 = str3;
                        str22 = str22;
                        str8 = str22;
                        z4 = false;
                        str9 = str8;
                        z6 = z4;
                        str10 = str5;
                        str12 = str21;
                        z7 = false;
                        if (z6) {
                            simpleName = e.getClass().getSimpleName();
                            c10186M2623 = m2623("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                        } else {
                            c10186M2623 = m2623("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                        }
                        c10186 = c10186M2623;
                        z8 = z6;
                        str6 = str9;
                        c10187 = c10186;
                        str13 = str6;
                        m2636(strMo4294, str2, z8, jSONArrayArray, runtimeException);
                        if (runtimeException != null) {
                            throw runtimeException;
                        }
                        if (c10187 != null) {
                            str14 = c10187.f32601;
                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            jSONObjectObject = JSON.object();
                            JSONObject<JSONObject.Member> jSONObject6 = c10187.f32602;
                            jSONArray = c10187.f32599;
                            str15 = c10187.f32604;
                            while (r3.hasNext()) {
                                jSONObjectObject.put(member.getName(), member.getValue());
                            }
                            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                            if (c10187.f32600) {
                                throw C10186.m26302(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                            }
                            throw C10186.m26306(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
                        }
                        return new C2072(str, str2, new JSONArray(jSONArrayArray), jM2614);
                    } catch (RuntimeException e31) {
                        e = e31;
                        str4 = str3;
                        str22 = str22;
                    }
                    str9 = str8;
                    z6 = z4;
                    str10 = str5;
                    str12 = str21;
                    z7 = false;
                    if (z6) {
                        simpleName = e.getClass().getSimpleName();
                        c10186M2623 = m2623("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                    } else {
                        c10186M2623 = m2623("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                    }
                    c10186 = c10186M2623;
                    z8 = z6;
                    str6 = str9;
                    c10187 = c10186;
                    str13 = str6;
                }
            } catch (C10186 e32) {
                e = e32;
                jSONArrayArray = jSONArrayArray;
            }
        } catch (IOException e33) {
            e = e33;
            str3 = str20;
        } catch (RuntimeException e34) {
            e = e34;
            str3 = str20;
        }
        m2636(strMo4294, str2, z8, jSONArrayArray, runtimeException);
        if (runtimeException != null) {
            throw runtimeException;
        }
        if (c10187 != null) {
            str14 = c10187.f32601;
            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14) || (z8 && (z7 || !"atomic".equals(str13)))) {
                z9 = false;
            } else {
                z9 = true;
            }
            jSONObjectObject = JSON.object();
            JSONObject<JSONObject.Member> jSONObject7 = c10187.f32602;
            jSONArray = c10187.f32599;
            str15 = c10187.f32604;
            while (r3.hasNext()) {
                jSONObjectObject.put(member.getName(), member.getValue());
            }
            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
            if (c10187.f32600) {
                throw C10186.m26302(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
            }
            throw C10186.m26306(str14, c10187.getMessage(), str15, jSONArray, jSONObjectObject);
        }
        return new C2072(str, str2, new JSONArray(jSONArrayArray), jM2614);
    }

    /* JADX WARN: Code duplicated, block: B:238:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:250:0x043c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0449  */
    /* JADX WARN: Code duplicated, block: B:260:0x0481  */
    /* JADX WARN: Code duplicated, block: B:261:0x048e  */
    /* JADX WARN: Code duplicated, block: B:273:0x04dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:274:0x04de  */
    /* JADX WARN: Code duplicated, block: B:276:0x04e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:281:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:285:0x050b A[LOOP:1: B:283:0x0505->B:285:0x050b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:288:0x0553  */
    /* JADX WARN: Code duplicated, block: B:289:0x055c  */
    /* JADX WARN: Code duplicated, block: B:291:0x0565  */
    /* JADX WARN: Code duplicated, block: B:293:0x0578  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21463 m2629(String str, boolean z, InterfaceC18479 interfaceC18479, C9113 c9113) throws C10186, C22790 {
        String str2;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        String str3;
        long j;
        boolean z5;
        String str4;
        boolean z6;
        String str5;
        long j2;
        boolean z7;
        RuntimeException runtimeException;
        boolean z8;
        RuntimeException runtimeException2;
        C10186 c10186;
        String simpleName;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z9;
        boolean z10;
        RuntimeException runtimeException3;
        boolean z11;
        Object obj2;
        String str10;
        String str11;
        boolean z12;
        C10186 c10186M2624;
        RuntimeException runtimeException4;
        String str12;
        boolean z13;
        JSONObject jSONObjectObject;
        JSONArray jSONArray;
        String str13;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z14;
        boolean z15;
        Object obj6;
        String str14;
        String str15;
        boolean z16;
        String str16;
        boolean z17;
        String str17;
        boolean z18;
        String str18;
        C24523 c24523;
        EnumC12588 enumC12588M54791;
        EnumC12588 enumC12588M54794;
        C0580 c0580 = this;
        String str19 = str;
        C22209 c22209 = c0580.f2343;
        JSONArray jSONArrayArray = JSON.array();
        C5801 c5801M2620 = m2620(str, (String) null, z, c9113, jSONArrayArray);
        AbstractC11601 abstractC11601 = c5801M2620.f19929;
        String str20 = c5801M2620.f19925;
        AbstractC22044 abstractC22044 = c5801M2620.f19927;
        String strMo4294 = abstractC22044.mo4294();
        C3563 c3563 = c5801M2620.f19928;
        String str21 = c3563.f12208;
        String str22 = c9113.f29602;
        String str23 = "produce_temp";
        long j3 = 0;
        try {
            try {
                m2639(str19, abstractC11601, c3563, str22, jSONArrayArray);
                try {
                    C23701 c23701Mo27882 = interfaceC18479.mo27882(abstractC22044);
                    Object obj7 = c23701Mo27882.f76828;
                    try {
                        long j4 = c23701Mo27882.f76829;
                        while (true) {
                            try {
                                C9113 c9113M50227 = c22209.m50227();
                                String str24 = c9113M50227.f29602;
                                try {
                                    c9113M50227.m24270(str19);
                                    c9113M50227.m24270(str20);
                                    c9113M50227.m24269(str19);
                                    c5801M2620.m16916(c9113M50227.f29602);
                                    AbstractC22044 abstractC22045 = c5801M2620.f19923;
                                    AbstractC11601 abstractC11602 = c5801M2620.f19929;
                                    String str25 = str20;
                                    AbstractC22044 abstractC22046 = c5801M2620.f19927;
                                    Object obj8 = obj7;
                                    try {
                                        AbstractC11601 abstractC11603 = c5801M2620.f19926;
                                        C5801 c5801 = c5801M2620;
                                        C1907 c1907M2616 = c0580.m2616(abstractC11602);
                                        c0580.m2643(c1907M2616, str19);
                                        if (z) {
                                            str14 = str24;
                                            str15 = "pre_publish_validation";
                                        } else {
                                            str14 = str24;
                                            try {
                                                try {
                                                    str15 = "pre_publish_validation";
                                                    try {
                                                        if (c1907M2616.m6567() != EnumC13093.MISSING) {
                                                            j = j4;
                                                            try {
                                                                throw m2624("FILE_ALREADY_EXISTS", "The local destination appeared before publication and overwrite is false.", str, c9113M50227.f29602, "pre_publish_destination", "already_exists", false, str21, true, jSONArrayArray, null, null);
                                                            } catch (IOException e) {
                                                                e = e;
                                                                z15 = false;
                                                                obj5 = obj8;
                                                                jSONArrayArray = jSONArrayArray;
                                                                str19 = str19;
                                                                str22 = str14;
                                                                str23 = str15;
                                                                j3 = j;
                                                                z4 = false;
                                                                z5 = z15;
                                                                str4 = str23;
                                                                j = j3;
                                                                str2 = str19;
                                                                obj = obj5;
                                                                if (z5) {
                                                                    e = m2655(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                } else {
                                                                    e = m2624("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                                }
                                                                runtimeException = null;
                                                                z8 = z5;
                                                                runtimeException2 = runtimeException;
                                                                runtimeException3 = runtimeException2;
                                                                z11 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z12 = z8;
                                                                m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                                if (runtimeException3 == null) {
                                                                    throw runtimeException3;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f32601;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject = e.f32602;
                                                                    jSONArray = e.f32599;
                                                                    str13 = e.f32604;
                                                                    for (JSONObject.Member member : jSONObject) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f32600) {
                                                                        throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            } catch (C14749 e2) {
                                                                e = e2;
                                                                z14 = false;
                                                                obj4 = obj8;
                                                                jSONArrayArray = jSONArrayArray;
                                                                str19 = str19;
                                                                str22 = str14;
                                                                str23 = str15;
                                                                j3 = j;
                                                                z4 = false;
                                                                z3 = z14;
                                                                str3 = str23;
                                                                j = j3;
                                                                str2 = str19;
                                                                obj = obj4;
                                                                runtimeException4 = e.f48165;
                                                                if (z3) {
                                                                    c10186M2624 = m2655(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                                } else {
                                                                    simpleName = runtimeException4.getClass().getSimpleName();
                                                                    str6 = null;
                                                                    str7 = null;
                                                                    str8 = "FILE_STORAGE_ERROR";
                                                                    str9 = "The storage backend failed while preparing local file content.";
                                                                    z9 = false;
                                                                    z10 = true;
                                                                    c10186M2624 = m2624(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                                }
                                                                c10186 = c10186M2624;
                                                                e = null;
                                                                z8 = z3;
                                                                runtimeException2 = e;
                                                                e = c10186;
                                                                runtimeException3 = runtimeException2;
                                                                z11 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z12 = z8;
                                                                m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                                if (runtimeException3 == null) {
                                                                    throw runtimeException3;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f32601;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject2 = e.f32602;
                                                                    jSONArray = e.f32599;
                                                                    str13 = e.f32604;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f32600) {
                                                                        throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            } catch (RuntimeException e3) {
                                                                e = e3;
                                                                z2 = true;
                                                                z3 = false;
                                                                z4 = false;
                                                                obj = obj8;
                                                                str22 = str14;
                                                                str3 = str15;
                                                                if (z2) {
                                                                }
                                                                str2 = str19;
                                                                c10186 = null;
                                                                z8 = z3;
                                                                runtimeException2 = e;
                                                                e = c10186;
                                                                runtimeException3 = runtimeException2;
                                                                z11 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z12 = z8;
                                                                m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                                if (runtimeException3 == null) {
                                                                    throw runtimeException3;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f32601;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject3 = e.f32602;
                                                                    jSONArray = e.f32599;
                                                                    str13 = e.f32604;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f32600) {
                                                                        throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            }
                                                        }
                                                    } catch (IOException e4) {
                                                        e = e4;
                                                        j = j4;
                                                        z15 = false;
                                                        obj5 = obj8;
                                                        jSONArrayArray = jSONArrayArray;
                                                        str19 = str19;
                                                        str22 = str14;
                                                        str23 = str15;
                                                        j3 = j;
                                                        z4 = false;
                                                        z5 = z15;
                                                        str4 = str23;
                                                        j = j3;
                                                        str2 = str19;
                                                        obj = obj5;
                                                        if (z5) {
                                                            e = m2655(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                        } else {
                                                            e = m2624("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                        }
                                                        runtimeException = null;
                                                        z8 = z5;
                                                        runtimeException2 = runtimeException;
                                                        runtimeException3 = runtimeException2;
                                                        z11 = z4;
                                                        obj2 = obj;
                                                        str10 = str21;
                                                        str11 = str22;
                                                        z12 = z8;
                                                        m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                        if (runtimeException3 == null) {
                                                            throw runtimeException3;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f32601;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject4 = e.f32602;
                                                            jSONArray = e.f32599;
                                                            str13 = e.f32604;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f32600) {
                                                                throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    } catch (C14749 e5) {
                                                        e = e5;
                                                        j = j4;
                                                        z14 = false;
                                                        obj4 = obj8;
                                                        jSONArrayArray = jSONArrayArray;
                                                        str19 = str19;
                                                        str22 = str14;
                                                        str23 = str15;
                                                        j3 = j;
                                                        z4 = false;
                                                        z3 = z14;
                                                        str3 = str23;
                                                        j = j3;
                                                        str2 = str19;
                                                        obj = obj4;
                                                        runtimeException4 = e.f48165;
                                                        if (z3) {
                                                            c10186M2624 = m2655(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                        } else {
                                                            simpleName = runtimeException4.getClass().getSimpleName();
                                                            str6 = null;
                                                            str7 = null;
                                                            str8 = "FILE_STORAGE_ERROR";
                                                            str9 = "The storage backend failed while preparing local file content.";
                                                            z9 = false;
                                                            z10 = true;
                                                            c10186M2624 = m2624(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                        }
                                                        c10186 = c10186M2624;
                                                        e = null;
                                                        z8 = z3;
                                                        runtimeException2 = e;
                                                        e = c10186;
                                                        runtimeException3 = runtimeException2;
                                                        z11 = z4;
                                                        obj2 = obj;
                                                        str10 = str21;
                                                        str11 = str22;
                                                        z12 = z8;
                                                        m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                        if (runtimeException3 == null) {
                                                            throw runtimeException3;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f32601;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject5 = e.f32602;
                                                            jSONArray = e.f32599;
                                                            str13 = e.f32604;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f32600) {
                                                                throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    } catch (RuntimeException e6) {
                                                        e = e6;
                                                        j = j4;
                                                        z2 = true;
                                                        z3 = false;
                                                        z4 = false;
                                                        obj = obj8;
                                                        str22 = str14;
                                                        str3 = str15;
                                                        if (z2) {
                                                        }
                                                        str2 = str19;
                                                        c10186 = null;
                                                        z8 = z3;
                                                        runtimeException2 = e;
                                                        e = c10186;
                                                        runtimeException3 = runtimeException2;
                                                        z11 = z4;
                                                        obj2 = obj;
                                                        str10 = str21;
                                                        str11 = str22;
                                                        z12 = z8;
                                                        m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                        if (runtimeException3 == null) {
                                                            throw runtimeException3;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f32601;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject6 = e.f32602;
                                                            jSONArray = e.f32599;
                                                            str13 = e.f32604;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f32600) {
                                                                throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    }
                                                } catch (C10186 e7) {
                                                    e = e7;
                                                    j = j4;
                                                    obj6 = obj8;
                                                }
                                            } catch (IOException e8) {
                                                e = e8;
                                                str15 = "pre_publish_validation";
                                            } catch (C14749 e9) {
                                                e = e9;
                                                str15 = "pre_publish_validation";
                                            } catch (RuntimeException e10) {
                                                e = e10;
                                                str15 = "pre_publish_validation";
                                            }
                                            e = e;
                                            obj6 = obj8;
                                            str2 = str19;
                                            obj = obj6;
                                            str22 = str14;
                                            j3 = j;
                                            z6 = false;
                                            str5 = str21;
                                            j2 = j3;
                                            z7 = false;
                                            j = j2;
                                            str21 = str5;
                                            boolean z19 = z7;
                                            z5 = z6;
                                            runtimeException = null;
                                            z4 = z19;
                                            z8 = z5;
                                            runtimeException2 = runtimeException;
                                            runtimeException3 = runtimeException2;
                                            z11 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z12 = z8;
                                        }
                                        j = j4;
                                        try {
                                            try {
                                                m2656(str19, c0580.m2616(abstractC11603), c9113M50227.f29602, jSONArrayArray);
                                                boolean z20 = c1907M2616.m6567() == EnumC13093.REGULAR;
                                                C3563 c3563M2654 = m2654(abstractC11603, z20);
                                                String str26 = c3563M2654.f12208;
                                                try {
                                                    try {
                                                        m2639(str19, abstractC11602, c3563M2654, c9113M50227.f29602, jSONArrayArray);
                                                        if (z20) {
                                                            try {
                                                                try {
                                                                    c24523 = new C24523();
                                                                    try {
                                                                        enumC12588M54791 = c24523.m54791(abstractC22045);
                                                                    } catch (RuntimeException unused) {
                                                                        enumC12588M54791 = EnumC12588.FAILED;
                                                                    }
                                                                    if (enumC12588M54791 != EnumC12588.SUCCESS) {
                                                                        m2633(jSONArrayArray, "Existing destination mode, owner, or group metadata could not be fully captured.");
                                                                        c24523 = null;
                                                                    }
                                                                } catch (C14749 e11) {
                                                                    e = e11;
                                                                    z14 = false;
                                                                    obj4 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str21 = str26;
                                                                    str22 = str14;
                                                                    str23 = str15;
                                                                    j3 = j;
                                                                    str19 = str19;
                                                                    z4 = false;
                                                                    z3 = z14;
                                                                    str3 = str23;
                                                                    j = j3;
                                                                    str2 = str19;
                                                                    obj = obj4;
                                                                    runtimeException4 = e.f48165;
                                                                    if (z3) {
                                                                        c10186M2624 = m2655(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                                    } else {
                                                                        simpleName = runtimeException4.getClass().getSimpleName();
                                                                        str6 = null;
                                                                        str7 = null;
                                                                        str8 = "FILE_STORAGE_ERROR";
                                                                        str9 = "The storage backend failed while preparing local file content.";
                                                                        z9 = false;
                                                                        z10 = true;
                                                                        c10186M2624 = m2624(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                                    }
                                                                    c10186 = c10186M2624;
                                                                    e = null;
                                                                    z8 = z3;
                                                                    runtimeException2 = e;
                                                                    e = c10186;
                                                                    runtimeException3 = runtimeException2;
                                                                    z11 = z4;
                                                                    obj2 = obj;
                                                                    str10 = str21;
                                                                    str11 = str22;
                                                                    z12 = z8;
                                                                } catch (RuntimeException e12) {
                                                                    e = e12;
                                                                    z2 = true;
                                                                    z3 = false;
                                                                    z4 = false;
                                                                    obj = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str21 = str26;
                                                                    str22 = str14;
                                                                    str3 = str15;
                                                                    str19 = str19;
                                                                    if (z2) {
                                                                    }
                                                                    str2 = str19;
                                                                    c10186 = null;
                                                                    z8 = z3;
                                                                    runtimeException2 = e;
                                                                    e = c10186;
                                                                    runtimeException3 = runtimeException2;
                                                                    z11 = z4;
                                                                    obj2 = obj;
                                                                    str10 = str21;
                                                                    str11 = str22;
                                                                    z12 = z8;
                                                                    m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                                    if (runtimeException3 == null) {
                                                                        throw runtimeException3;
                                                                    }
                                                                    if (e != null) {
                                                                        str12 = e.f32601;
                                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                            z13 = false;
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                        jSONObjectObject = JSON.object();
                                                                        JSONObject<JSONObject.Member> jSONObject7 = e.f32602;
                                                                        jSONArray = e.f32599;
                                                                        str13 = e.f32604;
                                                                        while (r4.hasNext()) {
                                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                                        }
                                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                        if (e.f32600) {
                                                                            throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                }
                                                            } catch (IOException e13) {
                                                                e = e13;
                                                                z15 = false;
                                                                obj5 = obj8;
                                                                jSONArrayArray = jSONArrayArray;
                                                                str21 = str26;
                                                                str22 = str14;
                                                                str23 = str15;
                                                                j3 = j;
                                                                str19 = str19;
                                                                z4 = false;
                                                                z5 = z15;
                                                                str4 = str23;
                                                                j = j3;
                                                                str2 = str19;
                                                                obj = obj5;
                                                                if (z5) {
                                                                    e = m2655(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                } else {
                                                                    e = m2624("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                                }
                                                                runtimeException = null;
                                                                z8 = z5;
                                                                runtimeException2 = runtimeException;
                                                                runtimeException3 = runtimeException2;
                                                                z11 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z12 = z8;
                                                            } catch (C10186 e14) {
                                                                e = e14;
                                                                z6 = false;
                                                                z7 = false;
                                                                obj = obj8;
                                                                jSONArrayArray = jSONArrayArray;
                                                                str2 = str19;
                                                                str5 = str26;
                                                                str22 = str14;
                                                                j2 = j;
                                                                j = j2;
                                                                str21 = str5;
                                                                boolean z110 = z7;
                                                                z5 = z6;
                                                                runtimeException = null;
                                                                z4 = z110;
                                                                z8 = z5;
                                                                runtimeException2 = runtimeException;
                                                                runtimeException3 = runtimeException2;
                                                                z11 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z12 = z8;
                                                                m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                                if (runtimeException3 == null) {
                                                                    throw runtimeException3;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f32601;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject8 = e.f32602;
                                                                    jSONArray = e.f32599;
                                                                    str13 = e.f32604;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f32600) {
                                                                        throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            }
                                                        } else {
                                                            c24523 = null;
                                                        }
                                                        C24523 c24524 = c24523;
                                                        try {
                                                            interfaceC18479.mo27883(c9113M50227);
                                                            if (c9113M50227.f29602.equals(c22209.m50227().f29602)) {
                                                                try {
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                    try {
                                                                        m2640(str, abstractC22046, abstractC11603, abstractC22045, abstractC11602, c3563M2654, j, c9113M50227.f29602);
                                                                        try {
                                                                            try {
                                                                                AbstractC22044 abstractC22044M50232 = c22209.m50232(str19);
                                                                                if (c24524 != null) {
                                                                                    try {
                                                                                        enumC12588M54794 = c24524.m54794(abstractC22044M50232);
                                                                                    } catch (RuntimeException unused2) {
                                                                                        enumC12588M54794 = EnumC12588.FAILED;
                                                                                    }
                                                                                    if (enumC12588M54794 != EnumC12588.SUCCESS) {
                                                                                        m2633(jSONArrayArray, "Existing destination mode, owner, or group metadata could not be fully restored.");
                                                                                    }
                                                                                }
                                                                                if (!z20) {
                                                                                    try {
                                                                                        C14584.m35196(abstractC22044M50232);
                                                                                    } catch (RuntimeException unused3) {
                                                                                        m2633(jSONArrayArray, "SELinux context restoration could not be completed.");
                                                                                    }
                                                                                }
                                                                                e = null;
                                                                                runtimeException3 = null;
                                                                                str2 = str19;
                                                                                str10 = str5;
                                                                                str11 = str14;
                                                                                z12 = true;
                                                                                z11 = true;
                                                                                break;
                                                                            } catch (C14749 e15) {
                                                                                e = e15;
                                                                                z3 = true;
                                                                                z4 = true;
                                                                                str3 = "restore_metadata";
                                                                                str2 = str19;
                                                                                obj = obj2;
                                                                                str21 = str5;
                                                                                str22 = str14;
                                                                                runtimeException4 = e.f48165;
                                                                                if (z3) {
                                                                                    c10186M2624 = m2655(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                                                } else {
                                                                                    simpleName = runtimeException4.getClass().getSimpleName();
                                                                                    str6 = null;
                                                                                    str7 = null;
                                                                                    str8 = "FILE_STORAGE_ERROR";
                                                                                    str9 = "The storage backend failed while preparing local file content.";
                                                                                    z9 = false;
                                                                                    z10 = true;
                                                                                    c10186M2624 = m2624(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                                                }
                                                                                c10186 = c10186M2624;
                                                                                e = null;
                                                                                z8 = z3;
                                                                                runtimeException2 = e;
                                                                                e = c10186;
                                                                                runtimeException3 = runtimeException2;
                                                                                z11 = z4;
                                                                                obj2 = obj;
                                                                                str10 = str21;
                                                                                str11 = str22;
                                                                                z12 = z8;
                                                                            } catch (RuntimeException e16) {
                                                                                e = e16;
                                                                                str3 = "restore_metadata";
                                                                                obj = obj2;
                                                                                str21 = str5;
                                                                                str22 = str14;
                                                                                z2 = true;
                                                                                z3 = true;
                                                                                z4 = true;
                                                                                if (z2) {
                                                                                }
                                                                                str2 = str19;
                                                                                c10186 = null;
                                                                                z8 = z3;
                                                                                runtimeException2 = e;
                                                                                e = c10186;
                                                                                runtimeException3 = runtimeException2;
                                                                                z11 = z4;
                                                                                obj2 = obj;
                                                                                str10 = str21;
                                                                                str11 = str22;
                                                                                z12 = z8;
                                                                            }
                                                                        } catch (IOException e17) {
                                                                            e = e17;
                                                                            z5 = true;
                                                                            z4 = true;
                                                                            str4 = "restore_metadata";
                                                                            str2 = str19;
                                                                            obj = obj2;
                                                                            str21 = str5;
                                                                            str22 = str14;
                                                                            if (z5) {
                                                                                e = m2655(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                            } else {
                                                                                e = m2624("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                                            }
                                                                            runtimeException = null;
                                                                            z8 = z5;
                                                                            runtimeException2 = runtimeException;
                                                                            runtimeException3 = runtimeException2;
                                                                            z11 = z4;
                                                                            obj2 = obj;
                                                                            str10 = str21;
                                                                            str11 = str22;
                                                                            z12 = z8;
                                                                        } catch (C10186 e18) {
                                                                            e = e18;
                                                                            z6 = true;
                                                                            z7 = true;
                                                                            str2 = str19;
                                                                            obj = obj2;
                                                                            str22 = str14;
                                                                            j2 = j;
                                                                            j = j2;
                                                                            str21 = str5;
                                                                            boolean z111 = z7;
                                                                            z5 = z6;
                                                                            runtimeException = null;
                                                                            z4 = z111;
                                                                            z8 = z5;
                                                                            runtimeException2 = runtimeException;
                                                                            runtimeException3 = runtimeException2;
                                                                            z11 = z4;
                                                                            obj2 = obj;
                                                                            str10 = str21;
                                                                            str11 = str22;
                                                                            z12 = z8;
                                                                        }
                                                                    } catch (IOException e19) {
                                                                        e = e19;
                                                                        str17 = "publish";
                                                                        z17 = true;
                                                                        z5 = z17;
                                                                        str4 = str17;
                                                                        str21 = str5;
                                                                        z4 = false;
                                                                        str2 = str19;
                                                                        obj = obj2;
                                                                        str22 = str14;
                                                                        if (z5) {
                                                                            e = m2655(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                        } else {
                                                                            e = m2624("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                                        }
                                                                        runtimeException = null;
                                                                        z8 = z5;
                                                                        runtimeException2 = runtimeException;
                                                                        runtimeException3 = runtimeException2;
                                                                        z11 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z12 = z8;
                                                                        m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                                        if (runtimeException3 == null) {
                                                                            throw runtimeException3;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f32601;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject9 = e.f32602;
                                                                            jSONArray = e.f32599;
                                                                            str13 = e.f32604;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f32600) {
                                                                                throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                    } catch (RuntimeException e20) {
                                                                        e = e20;
                                                                        str18 = "publish";
                                                                        z18 = true;
                                                                        z3 = z18;
                                                                        str3 = str18;
                                                                        str21 = str5;
                                                                        z4 = false;
                                                                        z2 = true;
                                                                        obj = obj2;
                                                                        str22 = str14;
                                                                        if (z2) {
                                                                        }
                                                                        str2 = str19;
                                                                        c10186 = null;
                                                                        z8 = z3;
                                                                        runtimeException2 = e;
                                                                        e = c10186;
                                                                        runtimeException3 = runtimeException2;
                                                                        z11 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z12 = z8;
                                                                        m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                                        if (runtimeException3 == null) {
                                                                            throw runtimeException3;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f32601;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject10 = e.f32602;
                                                                            jSONArray = e.f32599;
                                                                            str13 = e.f32604;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f32600) {
                                                                                throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                    } catch (C10186 e21) {
                                                                        e = e21;
                                                                        z6 = true;
                                                                        str2 = str19;
                                                                        obj = obj2;
                                                                        str22 = str14;
                                                                        j2 = j;
                                                                        z7 = false;
                                                                        j = j2;
                                                                        str21 = str5;
                                                                        boolean z112 = z7;
                                                                        z5 = z6;
                                                                        runtimeException = null;
                                                                        z4 = z112;
                                                                        z8 = z5;
                                                                        runtimeException2 = runtimeException;
                                                                        runtimeException3 = runtimeException2;
                                                                        z11 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z12 = z8;
                                                                    } catch (C14749 e22) {
                                                                        e = e22;
                                                                        str16 = "publish";
                                                                        z16 = true;
                                                                        z3 = z16;
                                                                        str3 = str16;
                                                                        str21 = str5;
                                                                        z4 = false;
                                                                        str2 = str19;
                                                                        obj = obj2;
                                                                        str22 = str14;
                                                                        runtimeException4 = e.f48165;
                                                                        if (z3) {
                                                                            c10186M2624 = m2655(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                                        } else {
                                                                            simpleName = runtimeException4.getClass().getSimpleName();
                                                                            str6 = null;
                                                                            str7 = null;
                                                                            str8 = "FILE_STORAGE_ERROR";
                                                                            str9 = "The storage backend failed while preparing local file content.";
                                                                            z9 = false;
                                                                            z10 = true;
                                                                            c10186M2624 = m2624(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                                        }
                                                                        c10186 = c10186M2624;
                                                                        e = null;
                                                                        z8 = z3;
                                                                        runtimeException2 = e;
                                                                        e = c10186;
                                                                        runtimeException3 = runtimeException2;
                                                                        z11 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z12 = z8;
                                                                        m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                                        if (runtimeException3 == null) {
                                                                            throw runtimeException3;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f32601;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject11 = e.f32602;
                                                                            jSONArray = e.f32599;
                                                                            str13 = e.f32604;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f32600) {
                                                                                throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                    }
                                                                } catch (IOException e23) {
                                                                    e = e23;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                } catch (C10186 e24) {
                                                                    e = e24;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                } catch (C14749 e25) {
                                                                    e = e25;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                } catch (RuntimeException e26) {
                                                                    e = e26;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                }
                                                            } else {
                                                                c0580 = this;
                                                                obj7 = obj8;
                                                                str20 = str25;
                                                                c5801M2620 = c5801;
                                                                str21 = str26;
                                                                str22 = str14;
                                                                str23 = str15;
                                                                j4 = j;
                                                            }
                                                        } catch (RuntimeException e27) {
                                                            e = e27;
                                                            z3 = false;
                                                            z4 = false;
                                                            z2 = false;
                                                            obj = obj8;
                                                            str21 = str26;
                                                            str22 = str14;
                                                            str3 = str15;
                                                            if (z2) {
                                                            }
                                                            str2 = str19;
                                                            c10186 = null;
                                                            z8 = z3;
                                                            runtimeException2 = e;
                                                            e = c10186;
                                                            runtimeException3 = runtimeException2;
                                                            z11 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            z12 = z8;
                                                            m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                            if (runtimeException3 == null) {
                                                                throw runtimeException3;
                                                            }
                                                            if (e != null) {
                                                                str12 = e.f32601;
                                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                    z13 = false;
                                                                } else {
                                                                    z13 = false;
                                                                }
                                                                jSONObjectObject = JSON.object();
                                                                JSONObject<JSONObject.Member> jSONObject12 = e.f32602;
                                                                jSONArray = e.f32599;
                                                                str13 = e.f32604;
                                                                while (r4.hasNext()) {
                                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                                }
                                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                if (e.f32600) {
                                                                    throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                        }
                                                    } catch (RuntimeException e28) {
                                                        e = e28;
                                                        obj2 = obj8;
                                                        jSONArrayArray = jSONArrayArray;
                                                        str21 = str26;
                                                        z18 = false;
                                                        str5 = str21;
                                                        str18 = str15;
                                                        z3 = z18;
                                                        str3 = str18;
                                                        str21 = str5;
                                                        z4 = false;
                                                        z2 = true;
                                                        obj = obj2;
                                                        str22 = str14;
                                                        if (z2 || !m2652(e)) {
                                                            str2 = str19;
                                                            c10186 = null;
                                                            z8 = z3;
                                                            runtimeException2 = e;
                                                            e = c10186;
                                                            runtimeException3 = runtimeException2;
                                                            z11 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            z12 = z8;
                                                        } else if (z3) {
                                                            e = m2655(jSONArrayArray, str19, str22, str21, e.getClass().getSimpleName());
                                                            runtimeException3 = null;
                                                            z11 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            str2 = str19;
                                                            z12 = z3;
                                                        } else {
                                                            simpleName = e.getClass().getSimpleName();
                                                            str6 = null;
                                                            str7 = null;
                                                            str8 = "FILE_STORAGE_ERROR";
                                                            str9 = "The storage backend failed while preparing local file content.";
                                                            z9 = false;
                                                            z10 = true;
                                                            str2 = str19;
                                                            c10186M2624 = m2624(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                            c10186 = c10186M2624;
                                                            e = null;
                                                            z8 = z3;
                                                            runtimeException2 = e;
                                                            e = c10186;
                                                            runtimeException3 = runtimeException2;
                                                            z11 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            z12 = z8;
                                                        }
                                                        m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                        if (runtimeException3 == null) {
                                                            throw runtimeException3;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f32601;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject13 = e.f32602;
                                                            jSONArray = e.f32599;
                                                            str13 = e.f32604;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f32600) {
                                                                throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    }
                                                } catch (IOException e29) {
                                                    e = e29;
                                                    obj2 = obj8;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str21 = str26;
                                                    z17 = false;
                                                    str5 = str21;
                                                    str17 = str15;
                                                    z5 = z17;
                                                    str4 = str17;
                                                    str21 = str5;
                                                    z4 = false;
                                                    str2 = str19;
                                                    obj = obj2;
                                                    str22 = str14;
                                                    if (z5) {
                                                        e = m2655(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                    } else {
                                                        e = m2624("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                    }
                                                    runtimeException = null;
                                                    z8 = z5;
                                                    runtimeException2 = runtimeException;
                                                    runtimeException3 = runtimeException2;
                                                    z11 = z4;
                                                    obj2 = obj;
                                                    str10 = str21;
                                                    str11 = str22;
                                                    z12 = z8;
                                                    m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                    if (runtimeException3 == null) {
                                                        throw runtimeException3;
                                                    }
                                                    if (e != null) {
                                                        str12 = e.f32601;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                            z13 = false;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject14 = e.f32602;
                                                        jSONArray = e.f32599;
                                                        str13 = e.f32604;
                                                        while (r4.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                        if (e.f32600) {
                                                            throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                } catch (C10186 e30) {
                                                    e = e30;
                                                    obj6 = obj8;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str21 = str26;
                                                    str2 = str19;
                                                    obj = obj6;
                                                    str22 = str14;
                                                    j3 = j;
                                                    z6 = false;
                                                    str5 = str21;
                                                    j2 = j3;
                                                } catch (C14749 e31) {
                                                    e = e31;
                                                    obj2 = obj8;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str21 = str26;
                                                    z16 = false;
                                                    str5 = str21;
                                                    str16 = str15;
                                                    z3 = z16;
                                                    str3 = str16;
                                                    str21 = str5;
                                                    z4 = false;
                                                    str2 = str19;
                                                    obj = obj2;
                                                    str22 = str14;
                                                    runtimeException4 = e.f48165;
                                                    if (z3) {
                                                        c10186M2624 = m2655(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                    } else {
                                                        simpleName = runtimeException4.getClass().getSimpleName();
                                                        str6 = null;
                                                        str7 = null;
                                                        str8 = "FILE_STORAGE_ERROR";
                                                        str9 = "The storage backend failed while preparing local file content.";
                                                        z9 = false;
                                                        z10 = true;
                                                        c10186M2624 = m2624(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                    }
                                                    c10186 = c10186M2624;
                                                    e = null;
                                                    z8 = z3;
                                                    runtimeException2 = e;
                                                    e = c10186;
                                                    runtimeException3 = runtimeException2;
                                                    z11 = z4;
                                                    obj2 = obj;
                                                    str10 = str21;
                                                    str11 = str22;
                                                    z12 = z8;
                                                    m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                                    if (runtimeException3 == null) {
                                                        throw runtimeException3;
                                                    }
                                                    if (e != null) {
                                                        str12 = e.f32601;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                            z13 = false;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject15 = e.f32602;
                                                        jSONArray = e.f32599;
                                                        str13 = e.f32604;
                                                        while (r4.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                        if (e.f32600) {
                                                            throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                }
                                            } catch (C10186 e32) {
                                                e = e32;
                                                obj6 = obj8;
                                            }
                                        } catch (IOException e33) {
                                            e = e33;
                                            obj2 = obj8;
                                            z17 = false;
                                            str5 = str21;
                                            str17 = str15;
                                            z5 = z17;
                                            str4 = str17;
                                            str21 = str5;
                                            z4 = false;
                                            str2 = str19;
                                            obj = obj2;
                                            str22 = str14;
                                            if (z5) {
                                                e = m2655(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                            } else {
                                                e = m2624("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                            }
                                            runtimeException = null;
                                            z8 = z5;
                                            runtimeException2 = runtimeException;
                                            runtimeException3 = runtimeException2;
                                            z11 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z12 = z8;
                                            m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                            if (runtimeException3 == null) {
                                                throw runtimeException3;
                                            }
                                            if (e != null) {
                                                str12 = e.f32601;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject16 = e.f32602;
                                                jSONArray = e.f32599;
                                                str13 = e.f32604;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f32600) {
                                                    throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                        } catch (C14749 e34) {
                                            e = e34;
                                            obj2 = obj8;
                                            z16 = false;
                                            str5 = str21;
                                            str16 = str15;
                                            z3 = z16;
                                            str3 = str16;
                                            str21 = str5;
                                            z4 = false;
                                            str2 = str19;
                                            obj = obj2;
                                            str22 = str14;
                                            runtimeException4 = e.f48165;
                                            if (z3) {
                                                c10186M2624 = m2655(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                            } else {
                                                simpleName = runtimeException4.getClass().getSimpleName();
                                                str6 = null;
                                                str7 = null;
                                                str8 = "FILE_STORAGE_ERROR";
                                                str9 = "The storage backend failed while preparing local file content.";
                                                z9 = false;
                                                z10 = true;
                                                c10186M2624 = m2624(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                            }
                                            c10186 = c10186M2624;
                                            e = null;
                                            z8 = z3;
                                            runtimeException2 = e;
                                            e = c10186;
                                            runtimeException3 = runtimeException2;
                                            z11 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z12 = z8;
                                            m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                            if (runtimeException3 == null) {
                                                throw runtimeException3;
                                            }
                                            if (e != null) {
                                                str12 = e.f32601;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject17 = e.f32602;
                                                jSONArray = e.f32599;
                                                str13 = e.f32604;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f32600) {
                                                    throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                        } catch (RuntimeException e35) {
                                            e = e35;
                                            obj2 = obj8;
                                            z18 = false;
                                            str5 = str21;
                                            str18 = str15;
                                            z3 = z18;
                                            str3 = str18;
                                            str21 = str5;
                                            z4 = false;
                                            z2 = true;
                                            obj = obj2;
                                            str22 = str14;
                                            if (z2) {
                                            }
                                            str2 = str19;
                                            c10186 = null;
                                            z8 = z3;
                                            runtimeException2 = e;
                                            e = c10186;
                                            runtimeException3 = runtimeException2;
                                            z11 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z12 = z8;
                                            m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                            if (runtimeException3 == null) {
                                                throw runtimeException3;
                                            }
                                            if (e != null) {
                                                str12 = e.f32601;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject18 = e.f32602;
                                                jSONArray = e.f32599;
                                                str13 = e.f32604;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f32600) {
                                                    throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                        }
                                    } catch (IOException e36) {
                                        e = e36;
                                        obj2 = obj8;
                                        str14 = str24;
                                        str15 = "pre_publish_validation";
                                        j = j4;
                                        z17 = false;
                                        str5 = str21;
                                        str17 = str15;
                                        z5 = z17;
                                        str4 = str17;
                                        str21 = str5;
                                        z4 = false;
                                        str2 = str19;
                                        obj = obj2;
                                        str22 = str14;
                                        if (z5) {
                                            e = m2655(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                        } else {
                                            e = m2624("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                        }
                                        runtimeException = null;
                                        z8 = z5;
                                        runtimeException2 = runtimeException;
                                        runtimeException3 = runtimeException2;
                                        z11 = z4;
                                        obj2 = obj;
                                        str10 = str21;
                                        str11 = str22;
                                        z12 = z8;
                                        m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                        if (runtimeException3 == null) {
                                            throw runtimeException3;
                                        }
                                        if (e != null) {
                                            str12 = e.f32601;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject19 = e.f32602;
                                            jSONArray = e.f32599;
                                            str13 = e.f32604;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f32600) {
                                                throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                    } catch (C14749 e37) {
                                        e = e37;
                                        obj2 = obj8;
                                        str14 = str24;
                                        str15 = "pre_publish_validation";
                                        j = j4;
                                        z16 = false;
                                        str5 = str21;
                                        str16 = str15;
                                        z3 = z16;
                                        str3 = str16;
                                        str21 = str5;
                                        z4 = false;
                                        str2 = str19;
                                        obj = obj2;
                                        str22 = str14;
                                        runtimeException4 = e.f48165;
                                        if (z3) {
                                            c10186M2624 = m2655(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                        } else {
                                            simpleName = runtimeException4.getClass().getSimpleName();
                                            str6 = null;
                                            str7 = null;
                                            str8 = "FILE_STORAGE_ERROR";
                                            str9 = "The storage backend failed while preparing local file content.";
                                            z9 = false;
                                            z10 = true;
                                            c10186M2624 = m2624(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                        }
                                        c10186 = c10186M2624;
                                        e = null;
                                        z8 = z3;
                                        runtimeException2 = e;
                                        e = c10186;
                                        runtimeException3 = runtimeException2;
                                        z11 = z4;
                                        obj2 = obj;
                                        str10 = str21;
                                        str11 = str22;
                                        z12 = z8;
                                        m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                        if (runtimeException3 == null) {
                                            throw runtimeException3;
                                        }
                                        if (e != null) {
                                            str12 = e.f32601;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject110 = e.f32602;
                                            jSONArray = e.f32599;
                                            str13 = e.f32604;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f32600) {
                                                throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                    } catch (RuntimeException e38) {
                                        e = e38;
                                        obj2 = obj8;
                                        str14 = str24;
                                        str15 = "pre_publish_validation";
                                        j = j4;
                                        z18 = false;
                                        str5 = str21;
                                        str18 = str15;
                                        z3 = z18;
                                        str3 = str18;
                                        str21 = str5;
                                        z4 = false;
                                        z2 = true;
                                        obj = obj2;
                                        str22 = str14;
                                        if (z2) {
                                        }
                                        str2 = str19;
                                        c10186 = null;
                                        z8 = z3;
                                        runtimeException2 = e;
                                        e = c10186;
                                        runtimeException3 = runtimeException2;
                                        z11 = z4;
                                        obj2 = obj;
                                        str10 = str21;
                                        str11 = str22;
                                        z12 = z8;
                                        m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                        if (runtimeException3 == null) {
                                            throw runtimeException3;
                                        }
                                        if (e != null) {
                                            str12 = e.f32601;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject111 = e.f32602;
                                            jSONArray = e.f32599;
                                            str13 = e.f32604;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f32600) {
                                                throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                    } catch (C10186 e39) {
                                        e = e39;
                                        obj6 = obj8;
                                        str14 = str24;
                                        j = j4;
                                    }
                                } catch (IOException e40) {
                                    e = e40;
                                    obj2 = obj7;
                                } catch (C14749 e41) {
                                    e = e41;
                                    obj2 = obj7;
                                } catch (RuntimeException e42) {
                                    e = e42;
                                    obj2 = obj7;
                                    str14 = str24;
                                    str15 = "pre_publish_validation";
                                    j = j4;
                                    z18 = false;
                                    str5 = str21;
                                    str18 = str15;
                                    z3 = z18;
                                    str3 = str18;
                                    str21 = str5;
                                    z4 = false;
                                    z2 = true;
                                    obj = obj2;
                                    str22 = str14;
                                    if (z2) {
                                    }
                                    str2 = str19;
                                    c10186 = null;
                                    z8 = z3;
                                    runtimeException2 = e;
                                    e = c10186;
                                    runtimeException3 = runtimeException2;
                                    z11 = z4;
                                    obj2 = obj;
                                    str10 = str21;
                                    str11 = str22;
                                    z12 = z8;
                                    m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                    if (runtimeException3 == null) {
                                        throw runtimeException3;
                                    }
                                    if (e != null) {
                                        str12 = e.f32601;
                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                            z13 = false;
                                        } else {
                                            z13 = false;
                                        }
                                        jSONObjectObject = JSON.object();
                                        JSONObject<JSONObject.Member> jSONObject112 = e.f32602;
                                        jSONArray = e.f32599;
                                        str13 = e.f32604;
                                        while (r4.hasNext()) {
                                            jSONObjectObject.put(member.getName(), member.getValue());
                                        }
                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                        if (e.f32600) {
                                            throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                } catch (C10186 e43) {
                                    e = e43;
                                    obj6 = obj7;
                                }
                            } catch (IOException e44) {
                                e = e44;
                                obj5 = obj7;
                                j3 = j4;
                                z15 = false;
                                z4 = false;
                                z5 = z15;
                                str4 = str23;
                                j = j3;
                                str2 = str19;
                                obj = obj5;
                                if (z5) {
                                    e = m2655(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                } else {
                                    e = m2624("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                }
                                runtimeException = null;
                                z8 = z5;
                                runtimeException2 = runtimeException;
                                runtimeException3 = runtimeException2;
                                z11 = z4;
                                obj2 = obj;
                                str10 = str21;
                                str11 = str22;
                                z12 = z8;
                                m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                if (runtimeException3 == null) {
                                    throw runtimeException3;
                                }
                                if (e != null) {
                                    str12 = e.f32601;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject113 = e.f32602;
                                    jSONArray = e.f32599;
                                    str13 = e.f32604;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f32600) {
                                        throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                            } catch (RuntimeException e45) {
                                e = e45;
                                obj3 = obj7;
                                z2 = true;
                                j3 = j4;
                                z3 = false;
                                z4 = false;
                                str3 = str23;
                                j = j3;
                                obj = obj3;
                                if (z2) {
                                }
                                str2 = str19;
                                c10186 = null;
                                z8 = z3;
                                runtimeException2 = e;
                                e = c10186;
                                runtimeException3 = runtimeException2;
                                z11 = z4;
                                obj2 = obj;
                                str10 = str21;
                                str11 = str22;
                                z12 = z8;
                                m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                if (runtimeException3 == null) {
                                    throw runtimeException3;
                                }
                                if (e != null) {
                                    str12 = e.f32601;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject114 = e.f32602;
                                    jSONArray = e.f32599;
                                    str13 = e.f32604;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f32600) {
                                        throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                            } catch (C10186 e46) {
                                e = e46;
                                jSONArrayArray = jSONArrayArray;
                                j = j4;
                                str2 = str19;
                                obj = obj7;
                            } catch (C14749 e47) {
                                e = e47;
                                obj4 = obj7;
                                j3 = j4;
                                z14 = false;
                                z4 = false;
                                z3 = z14;
                                str3 = str23;
                                j = j3;
                                str2 = str19;
                                obj = obj4;
                                runtimeException4 = e.f48165;
                                if (z3) {
                                    c10186M2624 = m2655(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                } else {
                                    simpleName = runtimeException4.getClass().getSimpleName();
                                    str6 = null;
                                    str7 = null;
                                    str8 = "FILE_STORAGE_ERROR";
                                    str9 = "The storage backend failed while preparing local file content.";
                                    z9 = false;
                                    z10 = true;
                                    c10186M2624 = m2624(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                }
                                c10186 = c10186M2624;
                                e = null;
                                z8 = z3;
                                runtimeException2 = e;
                                e = c10186;
                                runtimeException3 = runtimeException2;
                                z11 = z4;
                                obj2 = obj;
                                str10 = str21;
                                str11 = str22;
                                z12 = z8;
                                m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                                if (runtimeException3 == null) {
                                    throw runtimeException3;
                                }
                                if (e != null) {
                                    str12 = e.f32601;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject115 = e.f32602;
                                    jSONArray = e.f32599;
                                    str13 = e.f32604;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f32600) {
                                        throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                            }
                        }
                    } catch (IOException e48) {
                        e = e48;
                        obj5 = obj7;
                    } catch (C10186 e49) {
                        e = e49;
                        jSONArrayArray = jSONArrayArray;
                        str2 = str19;
                        obj = obj7;
                    } catch (C14749 e50) {
                        e = e50;
                        obj4 = obj7;
                    } catch (RuntimeException e51) {
                        e = e51;
                        obj3 = obj7;
                        z2 = false;
                    }
                } catch (IOException e52) {
                    e = e52;
                    str2 = str19;
                    z5 = false;
                    z4 = false;
                    obj = null;
                    str4 = "produce_temp";
                    j = 0;
                    if (z5) {
                        e = m2655(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                    } else {
                        e = m2624("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                    }
                    runtimeException = null;
                    z8 = z5;
                    runtimeException2 = runtimeException;
                    runtimeException3 = runtimeException2;
                    z11 = z4;
                    obj2 = obj;
                    str10 = str21;
                    str11 = str22;
                    z12 = z8;
                    m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                    if (runtimeException3 == null) {
                        throw runtimeException3;
                    }
                    if (e != null) {
                        str12 = e.f32601;
                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        jSONObjectObject = JSON.object();
                        JSONObject<JSONObject.Member> jSONObject116 = e.f32602;
                        jSONArray = e.f32599;
                        str13 = e.f32604;
                        while (r4.hasNext()) {
                            jSONObjectObject.put(member.getName(), member.getValue());
                        }
                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                        if (e.f32600) {
                            throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                        }
                        throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                    }
                    return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                } catch (C10186 e53) {
                    e = e53;
                    str2 = str19;
                    obj = null;
                } catch (C14749 e54) {
                    e = e54;
                    str2 = str19;
                    z3 = false;
                    z4 = false;
                    obj = null;
                    str3 = "produce_temp";
                    j = 0;
                    runtimeException4 = e.f48165;
                    if (z3) {
                        c10186M2624 = m2655(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                    } else {
                        simpleName = runtimeException4.getClass().getSimpleName();
                        str6 = null;
                        str7 = null;
                        str8 = "FILE_STORAGE_ERROR";
                        str9 = "The storage backend failed while preparing local file content.";
                        z9 = false;
                        z10 = true;
                        c10186M2624 = m2624(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                    }
                    c10186 = c10186M2624;
                    e = null;
                    z8 = z3;
                    runtimeException2 = e;
                    e = c10186;
                    runtimeException3 = runtimeException2;
                    z11 = z4;
                    obj2 = obj;
                    str10 = str21;
                    str11 = str22;
                    z12 = z8;
                    m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
                    if (runtimeException3 == null) {
                        throw runtimeException3;
                    }
                    if (e != null) {
                        str12 = e.f32601;
                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        jSONObjectObject = JSON.object();
                        JSONObject<JSONObject.Member> jSONObject117 = e.f32602;
                        jSONArray = e.f32599;
                        str13 = e.f32604;
                        while (r4.hasNext()) {
                            jSONObjectObject.put(member.getName(), member.getValue());
                        }
                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                        if (e.f32600) {
                            throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                        }
                        throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                    }
                    return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                }
            } catch (RuntimeException e55) {
                e = e55;
                jSONArrayArray = jSONArrayArray;
                str19 = str19;
                z2 = false;
                z3 = false;
                z4 = false;
                obj = null;
                str3 = "produce_temp";
                j = 0;
            }
        } catch (IOException e56) {
            e = e56;
            str2 = str19;
        } catch (C10186 e57) {
            e = e57;
            str2 = str19;
        } catch (C14749 e58) {
            e = e58;
            str2 = str19;
        }
        m2636(strMo4294, str, z12, jSONArrayArray, runtimeException3);
        if (runtimeException3 == null) {
            throw runtimeException3;
        }
        if (e != null) {
            str12 = e.f32601;
            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12) || (z12 && (z11 || !"atomic".equals(str10)))) {
                z13 = false;
            } else {
                z13 = true;
            }
            jSONObjectObject = JSON.object();
            JSONObject<JSONObject.Member> jSONObject118 = e.f32602;
            jSONArray = e.f32599;
            str13 = e.f32604;
            while (r4.hasNext()) {
                jSONObjectObject.put(member.getName(), member.getValue());
            }
            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
            if (e.f32600) {
                throw C10186.m26302(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
            }
            throw C10186.m26306(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
        }
        return new C21463(obj2, str, str10, new JSONArray(jSONArrayArray), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5801 m2620(String str, String str2, boolean z, C9113 c9113, JSONArray jSONArray) throws C10186, C22790 {
        C22209 c22209 = this.f2343;
        AbstractC22044 abstractC22044M50232 = c22209.m50232(str);
        AbstractC11601 abstractC11601Mo4298 = abstractC22044M50232.mo4298();
        C1907 c1907M2616 = m2616(abstractC11601Mo4298);
        m2643(c1907M2616, str);
        String str3 = str2 == null ? "The local destination" : "The destination";
        if (!z && c1907M2616.m6567() != EnumC13093.MISSING) {
            String str4 = c9113.f29602;
            String strConcat = str3.concat(" already exists and overwrite is false.");
            if (str2 == null) {
                throw m2624("FILE_ALREADY_EXISTS", strConcat, str, str4, "destination_stat", "already_exists", false, null, true, JSON.array(), null, null);
            }
            throw m2623("FILE_ALREADY_EXISTS", strConcat, str2, str, str4, "destination_stat", "already_exists", false, null, true, JSON.array());
        }
        String parent = abstractC22044M50232.getParent();
        if (parent == null) {
            String str5 = c9113.f29602;
            String strConcat2 = str3.concat(" has no writable parent directory.");
            if (str2 == null) {
                throw m2624("FILE_PARENT_NOT_FOUND", strConcat2, str, str5, "prepare", "parent_missing", false, null, true, JSON.array(), null, null);
            }
            throw m2623("FILE_PARENT_NOT_FOUND", strConcat2, str2, str, str5, "prepare", "parent_missing", false, null, true, JSON.array());
        }
        c9113.m24270(parent);
        String str6 = c9113.f29602;
        AbstractC22044 abstractC22044M50233 = c22209.m50232(parent);
        m2645(abstractC22044M50232, str, str6);
        m2638(str, abstractC22044M50233.mo4298(), str6);
        m2646(abstractC22044M50233, c9113, jSONArray);
        return new C5801(this, str, parent, abstractC22044M50232, abstractC11601Mo4298, m2630(jSONArray, str, parent, str6), c1907M2616.m6567() == EnumC13093.REGULAR);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2636(String str, String str2, boolean z, JSONArray jSONArray, RuntimeException runtimeException) {
        if (!m2649(str)) {
            m2633(jSONArray, "A temporary MCP file could not be removed.");
            if (runtimeException != null) {
                runtimeException.addSuppressed(new IOException("A temporary MCP file could not be removed"));
            }
        }
        if (z) {
            try {
                this.f2342.m34976(str2);
            } catch (RuntimeException e) {
                m2633(jSONArray, "File change notification could not be completed.");
                if (runtimeException == null || e == runtimeException) {
                    return;
                }
                runtimeException.addSuppressed(e);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private l.C20717 m2628(java.lang.String r28, java.lang.String r29, l.InterfaceC13258 r30, l.C9113 r31) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0580.m2628(java.lang.String, java.lang.String, l.۫ܿۚ, l.ۡۘۚ):l.᩵ܿۚ");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m2651(C1907 c1907, String str) throws C10186 {
        int i = C19971.f64179[c1907.m6567().ordinal()];
        C22209 c22209 = this.f2343;
        if (i == 3) {
            throw C24770.m55295(c1907, c22209, "FILE_NOT_REGULAR", "Directories cannot be modified as file content.", str);
        }
        if (i == 4) {
            throw C24770.m55295(c1907, c22209, "FILE_IS_SYMLINK", "Symbolic links cannot be modified by generic file content tools.", str);
        }
        if (i == 5) {
            throw C24770.m55295(c1907, c22209, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be modified as file content.", str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m2657(C1907 c1907, String str) throws C10186 {
        int i = C19971.f64179[c1907.m6567().ordinal()];
        C22209 c22209 = this.f2343;
        if (i == 1) {
            c22209.getClass();
            throw C22209.m50225(str);
        }
        if (i == 3) {
            throw C24770.m55295(c1907, c22209, "FILE_NOT_REGULAR", "Directories cannot be copied by mt_file_copy.", str);
        }
        if (i == 4) {
            throw C24770.m55295(c1907, c22209, "FILE_IS_SYMLINK", "Symbolic links cannot be copied by generic file tools.", str);
        }
        if (i == 5) {
            throw C24770.m55295(c1907, c22209, "FILE_UNSUPPORTED_TYPE", "The source node type cannot be copied by generic file tools.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2643(C1907 c1907, String str) throws C10186 {
        int i = C19971.f64179[c1907.m6567().ordinal()];
        C22209 c22209 = this.f2343;
        if (i == 3) {
            throw C24770.m55295(c1907, c22209, "FILE_NOT_REGULAR", "A directory cannot be used as the file copy destination.", str);
        }
        if (i == 4) {
            throw C24770.m55295(c1907, c22209, "FILE_IS_SYMLINK", "A symbolic link cannot be used as the file copy destination.", str);
        }
        if (i == 5) {
            throw C24770.m55295(c1907, c22209, "FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by generic file tools.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2634(String str, String str2, C1907 c1907, String str3, JSONArray jSONArray) throws C10186 {
        if (c1907.m6567() == EnumC13093.REGULAR) {
            return;
        }
        throw m2623("FILE_STORAGE_ERROR", "The copied temporary file is no longer available for publication.", str, str2, str3, "pre_publish_temp", "temp_" + c1907.m6567().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m2656(String str, C1907 c1907, String str2, JSONArray jSONArray) throws C10186 {
        if (c1907.m6567() == EnumC13093.REGULAR) {
            return;
        }
        throw m2624("FILE_STORAGE_ERROR", "The streamed temporary file is no longer available for publication.", str, str2, "pre_publish_temp", "temp_" + c1907.m6567().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m2638(String str, AbstractC11601 abstractC11601, String str2) throws C10186 {
        C1907 c1907M2616 = m2616(abstractC11601);
        if (c1907M2616.m6567() == EnumC13093.MISSING) {
            throw m2624("FILE_PARENT_NOT_FOUND", "The target parent directory does not exist.", str, str2, "parent_stat", "parent_missing", false, null, true, JSON.array(), null, null);
        }
        if (c1907M2616.m6567() != EnumC13093.DIRECTORY) {
            throw m2624("FILE_NOT_DIRECTORY", "The target parent is not a directory.", str, str2, "parent_stat", c1907M2616.m6567().name().toLowerCase(Locale.ROOT), false, null, true, JSON.array(), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m2645(AbstractC22044 abstractC22044, String str, String str2) throws C10186 {
        this.f2343.m50231(abstractC22044, new C24004(str, str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m2622(String str, String str2, String str3, String str4, String str5) {
        return m2624(str3, str4, str, str2, "check_parent_links", str5, false, null, true, JSON.array(), null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22044 m2630(JSONArray jSONArray, String str, String str2, String str3) throws C10186 {
        boolean zMo29163 = false;
        for (int i = 0; i < 16; i++) {
            StringBuilder sb = new StringBuilder(".mt-mcp-");
            sb.append(f2341);
            sb.append("-");
            byte[] bArr = new byte[18];
            f2340.nextBytes(bArr);
            sb.append(C15022.m36182(bArr));
            sb.append(".tmp");
            String string = sb.toString();
            AbstractC22044 abstractC22044M50232 = this.f2343.m50232("/".equals(str2) ? C25272.m56409("/", string) : C20196.m46451(str2, "/", string));
            AbstractC11601 abstractC11601Mo4298 = abstractC22044M50232.mo4298();
            if (abstractC11601Mo4298.mo8788(EnumC5636.CREATE_FILE_EXCLUSIVE) == EnumC15330.UNSUPPORTED) {
                throw m2624("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot safely create an MCP temporary file.", str, str3, "create_temp", "exclusive_create_unsupported", false, null, true, jSONArray, null, null);
            }
            try {
                abstractC11601Mo4298.mo8791();
                return abstractC22044M50232;
            } catch (C22790 e) {
                if (e.m51409() != EnumC10855.ALREADY_EXISTS) {
                    try {
                        zMo29163 = abstractC11601Mo4298.mo29163();
                    } catch (IOException | RuntimeException unused) {
                    }
                    if (!zMo29163) {
                        m2633(jSONArray, "A temporary MCP file could not be removed after creation failed.");
                    }
                    throw m2624("FILE_STORAGE_ERROR", "Failed to create an MCP temporary file.", str, str3, "create_temp", e.m51409().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray, null, null);
                }
            }
        }
        throw m2624("FILE_STORAGE_ERROR", "Unable to allocate a unique MCP temporary file name.", str, str3, "create_temp", "name_collision", false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2646(AbstractC22044 abstractC22044, C9113 c9113, JSONArray jSONArray) throws C22790 {
        synchronized (this.f2344) {
            if (c9113.f29602.equals(this.f2344.get(abstractC22044.mo4294()))) {
                return;
            }
            this.f2344.put(abstractC22044.mo4294(), c9113.f29602);
            if (this.f2344.size() > 64) {
                LinkedHashMap linkedHashMap = this.f2344;
                linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
            }
            AbstractC11601 abstractC11601Mo4298 = abstractC22044.mo4298();
            if (abstractC11601Mo4298.mo8788(EnumC5636.LIST) == EnumC15330.UNSUPPORTED) {
                return;
            }
            try {
                boolean z = false;
                for (C1907 c1907 : abstractC11601Mo4298.mo8792()) {
                    AbstractC22044 abstractC22044M6565 = c1907.m6565();
                    EnumC13093 enumC13093M6567 = c1907.m6567();
                    EnumC13093 enumC13093 = EnumC13093.REGULAR;
                    if (enumC13093M6567 == enumC13093 && m2658(abstractC22044M6565.getName())) {
                        try {
                            c9113.m24270(abstractC22044M6565.mo4294());
                            AbstractC11601 abstractC11601Mo4299 = abstractC22044M6565.mo4298();
                            if (abstractC11601Mo4299.mo8788(EnumC5636.DELETE_FILE_OR_LINK) == EnumC15330.UNSUPPORTED) {
                                z = true;
                            } else {
                                C1907 c1907Mo8790 = abstractC11601Mo4299.mo8790();
                                if (c1907Mo8790.m6567() == enumC13093 && m2658(c1907Mo8790.m6565().getName())) {
                                    abstractC11601Mo4299.mo8793();
                                }
                            }
                        } catch (RuntimeException | C10186 | C22790 unused) {
                        }
                    }
                }
                if (z) {
                    m2633(jSONArray, "One or more stale MCP temporary files could not be removed.");
                }
            } catch (RuntimeException | C22790 unused2) {
                m2633(jSONArray, "Stale MCP temporary files could not be checked on this storage backend.");
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m2658(String str) {
        if (str.length() != 73 || !str.startsWith(".mt-mcp-") || str.charAt(32) != '-' || !str.endsWith(".tmp") || !m2647(8, 32, str) || !m2647(33, 69, str)) {
            return false;
        }
        String str2 = f2341;
        return !str.regionMatches(8, str2, 0, str2.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2647(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2633(JSONArray jSONArray, String str) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            if (jSONValue.isString() && str.equals(jSONValue.asString())) {
                return;
            }
        }
        jSONArray.add(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15495 m2627(String str, AbstractC22044 abstractC22044, C12512 c12512, InterfaceC13258 interfaceC13258, String str2) throws C10186, IOException {
        MessageDigest messageDigestM36183 = C15022.m36183();
        C11766 c11766 = new C11766(abstractC22044.mo4289(false), messageDigestM36183);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c11766, 65536);
        try {
            interfaceC13258.mo969(c12512, bufferedOutputStream);
            bufferedOutputStream.close();
            if (c11766.f38028 > 9007199254740991L) {
                throw m2624("FILE_STORAGE_ERROR", "The output size exceeds the supported JSON integer range.", str, str2, "write_temp", "size_out_of_range", false, null, true, JSON.array(), null, null);
            }
            return C15495.m37058(c11766.f38028, C15022.m36182(messageDigestM36183.digest()).substring(0, 16));
        } catch (Throwable th) {
            try {
                bufferedOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m2614(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC22044.mo4290(), 65536);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC22045.mo4289(false), 65536);
            try {
                long jM2613 = m2613(bufferedInputStream, bufferedOutputStream);
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return jM2613;
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23701 m2632(AbstractC22044 abstractC22044, InterfaceC24447 interfaceC24447) throws IOException {
        try {
            C25193 c25193 = new C25193(new C4309(abstractC22044.mo4289(false)));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c25193, 65536);
            try {
                Object objMo15357 = interfaceC24447.mo15357(bufferedOutputStream);
                bufferedOutputStream.close();
                return new C23701(c25193.f81429, objMo15357);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RuntimeException e) {
            if ((e instanceof C14749) || !m2652(e)) {
                throw e;
            }
            throw new C14749(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static RuntimeException m2653(RuntimeException runtimeException) {
        return ((runtimeException instanceof C14749) || !m2652(runtimeException)) ? runtimeException : new C14749(runtimeException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3563 m2619(AbstractC22044 abstractC22044, boolean z) {
        EnumC5636 enumC5636;
        if (z) {
            enumC5636 = EnumC5636.REPLACE;
        } else {
            enumC5636 = EnumC5636.RENAME_NO_REPLACE;
        }
        EnumC15330 enumC15330Mo8788 = abstractC22044.mo4298().mo8788(enumC5636);
        if (enumC15330Mo8788 == EnumC15330.ATOMIC) {
            return new C3563(enumC5636, "atomic", true, true);
        }
        if (enumC15330Mo8788 == EnumC15330.BEST_EFFORT || enumC15330Mo8788 == EnumC15330.SUPPORTED) {
            return new C3563(enumC5636, "best_effort", false, true);
        }
        return new C3563(enumC5636, "best_effort", false, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3563 m2654(AbstractC11601 abstractC11601, boolean z) {
        EnumC5636 enumC5636;
        if (z) {
            enumC5636 = EnumC5636.REPLACE;
        } else {
            enumC5636 = EnumC5636.RENAME_NO_REPLACE;
        }
        EnumC15330 enumC15330Mo8788 = abstractC11601.mo8788(enumC5636);
        if (enumC15330Mo8788 == EnumC15330.ATOMIC) {
            return new C3563(enumC5636, "atomic", true, true);
        }
        if (enumC15330Mo8788 == EnumC15330.BEST_EFFORT || enumC15330Mo8788 == EnumC15330.SUPPORTED) {
            return new C3563(enumC5636, "best_effort", false, true);
        }
        return new C3563(enumC5636, "best_effort", false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2635(String str, String str2, AbstractC11601 abstractC11601, C3563 c3563, String str3, JSONArray jSONArray) throws C10186 {
        if (c3563.f12206 == EnumC5636.RENAME_NO_REPLACE && !c3563.f12207 && abstractC11601.mo8788(EnumC5636.CREATE_FILE_EXCLUSIVE) == EnumC15330.UNSUPPORTED) {
            throw m2623("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, str3, "publish_capability", "no_replace_unsupported", false, c3563.f12208, true, jSONArray);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2639(String str, AbstractC11601 abstractC11601, C3563 c3563, String str2, JSONArray jSONArray) throws C10186 {
        if (c3563.f12206 == EnumC5636.RENAME_NO_REPLACE && !c3563.f12207 && abstractC11601.mo8788(EnumC5636.CREATE_FILE_EXCLUSIVE) == EnumC15330.UNSUPPORTED) {
            throw m2624("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, "publish_capability", "no_replace_unsupported", false, c3563.f12208, true, jSONArray, null, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2640(String str, AbstractC22044 abstractC22044, AbstractC11601 abstractC11601, AbstractC22044 abstractC22045, AbstractC11601 abstractC11602, C3563 c3563, long j, String str2) throws C10186, IOException {
        AbstractC22044 abstractC22046;
        AbstractC22044 abstractC22047;
        AbstractC11601 abstractC11603;
        String str3 = c3563.f12208;
        boolean z = c3563.f12207;
        boolean z2 = c3563.f12205;
        EnumC5636 enumC5636 = c3563.f12206;
        if (z) {
            try {
                if (enumC5636 == EnumC5636.REPLACE) {
                    abstractC11601.mo8795(abstractC22045);
                    return;
                } else {
                    abstractC11601.mo8789(abstractC22045);
                    return;
                }
            } catch (C22790 e) {
                C22209 c22209 = this.f2343;
                C16987 c16987 = null;
                if (enumC5636 == EnumC5636.RENAME_NO_REPLACE && !z2 && C17359.equals(abstractC22044.getParent(), abstractC22045.getParent())) {
                    try {
                        AbstractC22044 abstractC22044M50232 = c22209.m50232(abstractC22044.mo4294());
                        AbstractC22044 abstractC22044M50233 = c22209.m50232(abstractC22045.mo4294());
                        AbstractC11601 abstractC11601Mo4298 = abstractC22044M50232.mo4298();
                        AbstractC11601 abstractC11601Mo4299 = abstractC22044M50233.mo4298();
                        C1907 c1907Mo8790 = abstractC11601Mo4298.mo8790();
                        if (c1907Mo8790.m6567() == EnumC13093.REGULAR && ((c1907Mo8790.m6566() < 0 || c1907Mo8790.m6566() == j) && abstractC11601Mo4299.mo8790().m6567() == EnumC13093.MISSING)) {
                            c16987 = new C16987(abstractC22044M50232, abstractC22044M50233, abstractC11601Mo4299);
                        }
                    } catch (RuntimeException | C22790 unused) {
                    }
                }
                if (c16987 == null) {
                    String str4 = z2 ? "FILE_STORAGE_ERROR" : "FILE_OPERATION_STATE_UNKNOWN";
                    String strName = enumC5636.name();
                    Locale locale = Locale.ROOT;
                    String lowerCase = strName.toLowerCase(locale);
                    String lowerCase2 = e.m51409().name().toLowerCase(locale);
                    boolean z3 = c3563.f12205;
                    throw m2624(str4, "Failed to publish local file content.", str, str2, lowerCase, lowerCase2, !z3, str3, z3, JSON.array(), null, null);
                }
                abstractC22046 = c16987.f55518;
                abstractC22047 = c16987.f55517;
                abstractC11603 = c16987.f55519;
            }
        } else {
            abstractC22046 = abstractC22044;
            abstractC22047 = abstractC22045;
            abstractC11603 = abstractC11602;
        }
        if (enumC5636 == EnumC5636.RENAME_NO_REPLACE) {
            if (abstractC11603.mo8788(EnumC5636.CREATE_FILE_EXCLUSIVE) == EnumC15330.UNSUPPORTED) {
                throw m2624("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, "publish_capability", "no_replace_unsupported", false, str3, true, JSON.array(), null, null);
            }
            try {
                abstractC11603.mo8791();
            } catch (C22790 e2) {
                throw m2624("FILE_OPERATION_STATE_UNKNOWN", "Failed to create the final local file before publishing content.", str, str2, "create_target", e2.m51409().name().toLowerCase(Locale.ROOT), true, str3, false, JSON.array(), null, null);
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC22046.mo4290(), 65536);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC22047.mo4289(false), 65536);
            try {
                m2613(bufferedInputStream, bufferedOutputStream);
                bufferedOutputStream.close();
                bufferedInputStream.close();
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                bufferedInputStream.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15495 m2626(String str, C1907 c1907, String str2, String str3) throws C10186 {
        if (c1907.m6567() == EnumC13093.MISSING) {
            return C15495.m37057();
        }
        try {
            C13588 c13588M15150 = C4945.m15150(c1907.m6565(), 0L, 1);
            long j = c13588M15150.f43160;
            C1907 c1907M2616 = m2616(c1907.m6565().mo4298());
            if (c1907M2616.m6567() != EnumC13093.REGULAR || ((c1907.m6566() >= 0 && c1907.m6566() != j) || (c1907M2616.m6566() >= 0 && c1907M2616.m6566() != j))) {
                throw m2624("FILE_CHANGED_DURING_READ", "The file changed while its targetVersion was being calculated.", str, str2, str3, "metadata_changed", false, null, true, JSON.array(), null, null);
            }
            return C15495.m37058(j, c13588M15150.f43162);
        } catch (IOException e) {
            throw m2624("FILE_STORAGE_ERROR", "Failed to read current local file content.", str, str2, str3, e.getClass().getSimpleName(), false, null, true, JSON.array(), null, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m2649(String str) {
        try {
            AbstractC11601 abstractC11601Mo4298 = this.f2343.m50232(str).mo4298();
            C1907 c1907Mo8790 = abstractC11601Mo4298.mo8790();
            if (c1907Mo8790.m6567() == EnumC13093.MISSING) {
                return true;
            }
            if (c1907Mo8790.m6567() == EnumC13093.REGULAR && abstractC11601Mo4298.mo8788(EnumC5636.DELETE_FILE_OR_LINK) != EnumC15330.UNSUPPORTED) {
                abstractC11601Mo4298.mo8793();
                return true;
            }
            return false;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2644(AbstractC22044 abstractC22044, long j, JSONArray jSONArray) {
        if (C21576.m49078()) {
            if (j < 0) {
                m2633(jSONArray, "Source modified time was unavailable and could not be preserved.");
                return;
            }
            try {
                if (abstractC22044.mo2945() && abstractC22044.mo2942(j)) {
                    return;
                }
                m2633(jSONArray, "Source modified time could not be applied to the destination.");
            } catch (RuntimeException unused) {
                m2633(jSONArray, "Source modified time could not be applied to the destination.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1907 m2616(AbstractC11601 abstractC11601) throws C10186 {
        try {
            return abstractC11601.mo8790();
        } catch (C22790 e) {
            this.f2343.getClass();
            throw C22209.m50224(e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2652(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m2625(C10186 c10186, String str, String str2) {
        boolean z = c10186.f32597;
        JSONArray jSONArray = c10186.f32599;
        String str3 = c10186.f32604;
        String str4 = c10186.f32601;
        if (z) {
            return c10186;
        }
        JSONObject jSONObjectObject = JSON.object();
        for (JSONObject.Member member : c10186.f32602) {
            jSONObjectObject.put(member.getName(), member.getValue());
        }
        jSONObjectObject.put("localPath", str);
        JSONValue jSONValue = jSONObjectObject.get("policyRevision");
        if (jSONValue == null || !jSONValue.isString()) {
            jSONObjectObject.put("policyRevision", str2);
        }
        if (c10186.f32600) {
            return C10186.m26302(str4, c10186.getMessage(), str3, jSONArray, jSONObjectObject);
        }
        return C10186.m26306(str4, c10186.getMessage(), str3, jSONArray, jSONObjectObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m2623(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, boolean z2, JSONArray jSONArray) {
        JSONObject jSONObjectAdd = C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "targetPath", str4).add("policyRevision", str5).add("operation", str6).add("backendReason", str7).add("changed", z).add("operationMode", str8 == null ? JSON.NULL : JSON.value(str8)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
        return ("FILE_ALREADY_EXISTS".equals(str) || "FILE_STORAGE_ERROR".equals(str) || "FILE_CHANGED_DURING_READ".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C10186.m26302(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C10186.m26306(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m2621(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        return m2624("FILE_STORAGE_ERROR", str, str2, str3, str4, "size_out_of_range", false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m2655(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        return m2624("FILE_OPERATION_STATE_UNKNOWN", "The file operation may have changed the target, but its final state is unknown.", str, str2, "publish", str4, true, str3, false, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m2624(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, JSONArray jSONArray, String str8, String str9) {
        JSONObject jSONObjectAdd = C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", z).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
        if (str8 != null) {
            jSONObjectAdd.add("expectedTargetVersion", str8).add("actualTargetVersion", str9);
        }
        return (("parent_stat".equals(str5) && (("FILE_PARENT_NOT_FOUND".equals(str) && "parent_missing".equals(str6)) || ("FILE_NOT_DIRECTORY".equals(str) && "regular".equals(str6)))) || "FILE_ALREADY_EXISTS".equals(str) || "FILE_STORAGE_ERROR".equals(str) || "FILE_CHANGED_DURING_READ".equals(str) || "FILE_TARGET_VERSION_MISMATCH".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C10186.m26302(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C10186.m26306(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20717 m2662(String str, String str2, InterfaceC13258 interfaceC13258) throws C10186 {
        boolean zEquals = "missing".equals(str2);
        if (!zEquals && str2 != null && str2.length() == 16) {
            zEquals = false;
            int i = 0;
            while (true) {
                if (i >= str2.length()) {
                    zEquals = true;
                    break;
                }
                char cCharAt = str2.charAt(i);
                if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                    break;
                }
                i++;
            }
        }
        if (zEquals) {
            C22209 c22209 = this.f2343;
            C9113 c9113M50227 = c22209.m50227();
            String strM50226 = C22209.m50226(str, c9113M50227, MotionUtils.EASING_TYPE_PATH);
            C19225 c19225M50233 = c22209.m50233(strM50226);
            try {
                C20717 c20717M2628 = m2628(strM50226, str2, interfaceC13258, c9113M50227);
                c19225M50233.close();
                return c20717M2628;
            } catch (Throwable th) {
                try {
                    c19225M50233.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw C10186.m26301("Invalid targetVersion", "targetVersion", str2 == null ? null : JSON.value(str2), JSON.array().add("missing").add("<16 lowercase hex digits copied from the latest read>"), JSON.object().add("targetVersion", "missing"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m2613(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        long j;
        byte[] bArr = new byte[65536];
        long j2 = 0;
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i < 0) {
                break;
            }
            if (i == 0) {
                int i2 = bufferedInputStream.read();
                if (i2 < 0) {
                    break;
                }
                bufferedOutputStream.write(i2);
                j = 1;
                if (j2 > 9007199254740991L - j) {
                    throw new IOException("Copied size exceeds the supported JSON integer range");
                }
            } else {
                bufferedOutputStream.write(bArr, 0, i);
                j = i;
                if (j2 > 9007199254740991L - j) {
                    throw new IOException("Copied size exceeds the supported JSON integer range");
                }
            }
            j2 += j;
        }
        return j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2650(C15495 c15495, C15495 c15496) {
        return c15495.f50427 == c15496.f50427 && c15495.f50429 == c15496.f50429 && c15495.f50428.equals(c15496.f50428);
    }
}
