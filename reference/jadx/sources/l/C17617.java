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

/* JADX INFO: renamed from: l.ܿ᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17617 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String f55977;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f55978;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0833 f55979;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2800 f55980;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f55981;

    static {
        SecureRandom secureRandom = new SecureRandom();
        f55978 = secureRandom;
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        f55977 = C22253.m49424(bArr);
    }

    public C17617(C2800 c2800) {
        C0833 c0833 = new C0833();
        this.f55981 = new LinkedHashMap(16, 0.75f, true);
        this.f55980 = c2800;
        this.f55979 = c0833;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15502 m40989(String str, String str2, boolean z) throws C12731 {
        C2800 c2800 = this.f55980;
        C3070 c3070M8504 = c2800.m8504();
        String strM8495 = C2800.m8495(str, c3070M8504, "sourcePath");
        String strM8502 = C2800.m8502(str2, c3070M8504, "destinationPath");
        if (strM8495.equals(strM8502)) {
            throw m40955("FILE_INVALID_PATH", "Source and destination must have different normalized absolute paths.", strM8495, strM8502, c3070M8504.f11560, "prepare", "same_path", false, null, true, JSON.array());
        }
        C11268 c11268M8506 = c2800.m8506(Arrays.asList(strM8495, strM8502));
        try {
            C15502 c15502M40958 = m40958(c3070M8504, strM8495, strM8502, z);
            c11268M8506.close();
            return c15502M40958;
        } catch (Throwable th) {
            try {
                c11268M8506.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16912 m40990(String str, boolean z, final C15772 c15772) throws C12731 {
        C2800 c2800 = this.f55980;
        C3070 c3070M8504 = c2800.m8504();
        String strM8502 = C2800.m8502(str, c3070M8504, "localPath");
        C11268 c11268M8509 = c2800.m8509(strM8502);
        try {
            try {
                C16912 c16912M40959 = m40959(strM8502, z, new InterfaceC12679() { // from class: l.᩹᩸۬
                    @Override // l.InterfaceC12679
                    /* JADX INFO: renamed from: ۙ */
                    public final C9152 mo4873(AbstractC20745 abstractC20745) {
                        return C17617.m40950(c15772, abstractC20745);
                    }

                    @Override // l.InterfaceC12679
                    /* JADX INFO: renamed from: ۙ */
                    public final /* synthetic */ void mo4874(C3070 c3070) {
                    }
                }, c3070M8504);
                c11268M8509.close();
                return c16912M40959;
            } catch (C12731 e) {
                throw m40957(e, strM8502, c3070M8504.f11560);
            }
        } catch (Throwable th) {
            try {
                c11268M8509.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19735 m40991(String str, boolean z, C3070 c3070, InterfaceC8446 interfaceC8446) throws C12731 {
        this.f55980.getClass();
        String strM8502 = C2800.m8502(str, c3070, MotionUtils.EASING_TYPE_PATH);
        if (!strM8502.equals(str)) {
            throw C12731.m31626("The claimed file path must be normalized and absolute.", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        try {
            return new C19735(m40959(strM8502, z, new C1389(this, interfaceC8446, strM8502, c3070), c3070));
        } catch (C12731 e) {
            throw m40957(e, strM8502, c3070.f11560);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22744 m40992(String str, C20005 c20005) throws C12731 {
        C2800 c2800 = this.f55980;
        C3070 c3070M8504 = c2800.m8504();
        String strM8495 = C2800.m8495(str, c3070M8504, "localPath");
        C11268 c11268M8505 = c2800.m8505(strM8495);
        try {
            try {
                AbstractC20745 abstractC20745M8508 = c2800.m8508(strM8495);
                C5928 c5928M40947 = m40947(abstractC20745M8508.mo33989());
                m40986(c5928M40947, strM8495);
                if (c5928M40947.m16197() > 9007199254740991L) {
                    throw m40956("FILE_STORAGE_ERROR", "The local source size exceeds the supported JSON integer range.", strM8495, c3070M8504.f11560, "source_stat", "size_out_of_range", false, null, true, JSON.array(), null, null);
                }
                C16207 c16207 = new C16207(this, strM8495, abstractC20745M8508, c5928M40947);
                c16207.f52314 = true;
                try {
                    C22744 c22744M16128 = C5893.m16128(c20005.f64025, c20005.f64027, c20005.f64026, c16207);
                    C16207.m38314(c16207);
                    c16207.f52314 = false;
                    c11268M8505.close();
                    return c22744M16128;
                } catch (Throwable th) {
                    c16207.f52314 = false;
                    throw th;
                }
            } catch (C12731 e) {
                throw m40957(e, strM8495, c3070M8504.f11560);
            }
        } catch (Throwable th2) {
            try {
                c11268M8505.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0258  */
    /* JADX WARN: Code duplicated, block: B:155:0x0261 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0263  */
    /* JADX WARN: Code duplicated, block: B:157:0x026c  */
    /* JADX WARN: Code duplicated, block: B:163:0x029b  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:177:0x02fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x030a  */
    /* JADX WARN: Code duplicated, block: B:186:0x031f A[LOOP:1: B:184:0x0319->B:186:0x031f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x035f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0368  */
    /* JADX WARN: Code duplicated, block: B:192:0x0371  */
    /* JADX WARN: Code duplicated, block: B:194:0x0383  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15502 m40958(C3070 c3070, String str, String str2, boolean z) throws C12731, C20040 {
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
        C12731 c12731;
        boolean z8;
        C12731 c12731M40955;
        String simpleName;
        C12731 c12732;
        String str13;
        String str14;
        boolean z9;
        JSONObject jSONObjectObject;
        JSONArray jSONArray;
        String str15;
        String str16;
        String str17;
        JSONArray jSONArray2;
        EnumC11573 enumC11573M14403;
        EnumC11573 enumC11573M14406;
        C17617 c17617 = this;
        C2800 c2800 = c17617.f55980;
        AbstractC20745 abstractC20745M8508 = c2800.m8508(str);
        C5928 c5928M40947 = c17617.m40947(abstractC20745M8508.mo33989());
        c17617.m40986(c5928M40947, str);
        if (c5928M40947.m16197() > 9007199254740991L) {
            throw m40955("FILE_STORAGE_ERROR", "The source size exceeds the supported JSON integer range.", str, str2, c3070.f11560, "source_stat", "size_out_of_range", false, null, true, JSON.array());
        }
        JSONArray jSONArrayArray = JSON.array();
        C23263 c23263M40961 = m40961(str2, str, z, c3070, jSONArrayArray);
        AbstractC10868 abstractC10868 = c23263M40961.f75484;
        String str18 = c23263M40961.f75482;
        AbstractC20745 abstractC20745 = c23263M40961.f75485;
        String strMo33986 = abstractC20745.mo33986();
        C10563 c10563 = c23263M40961.f75481;
        String str19 = c10563.f36158;
        String str20 = c3070.f11560;
        String str21 = "copy_to_temp";
        RuntimeException runtimeException = null;
        long jM40943 = 0;
        String str22 = str19;
        try {
            try {
                m40964(str, str2, abstractC10868, c10563, str20, jSONArrayArray);
                jM40943 = m40943(abstractC20745M8508, abstractC20745);
                str3 = str20;
                while (true) {
                    try {
                        C3070 c3070M8504 = c2800.m8504();
                        String str23 = c3070M8504.f11560;
                        try {
                            try {
                                str21 = "pre_publish_validation";
                                c3070M8504.m9209(str);
                                c3070M8504.m9207(str2);
                                c3070M8504.m9207(str18);
                                c3070M8504.m9210(str2);
                                AbstractC20745 abstractC20745M8509 = c2800.m8508(str);
                                AbstractC10868 abstractC10868Mo33989 = abstractC20745M8509.mo33989();
                                c23263M40961.m51346(c3070M8504.f11560);
                                AbstractC20745 abstractC20746 = c23263M40961.f75480;
                                AbstractC10868 abstractC10869 = c23263M40961.f75484;
                                AbstractC20745 abstractC20747 = c23263M40961.f75485;
                                AbstractC10868 abstractC108610 = c23263M40961.f75477;
                                c17617.m40986(c17617.m40947(abstractC10868Mo33989), str);
                                C5928 c5928M40948 = c17617.m40947(abstractC10869);
                                c17617.m40970(c5928M40948, str2);
                                if (!z) {
                                    try {
                                        try {
                                            if (c5928M40948.m16196() != EnumC12279.MISSING) {
                                                str16 = str23;
                                                jSONArray2 = jSONArrayArray;
                                                try {
                                                    try {
                                                        try {
                                                            throw m40955("FILE_ALREADY_EXISTS", "The destination appeared before publication and overwrite is false.", str, str2, c3070M8504.f11560, "pre_publish_destination", "already_exists", false, str22, true, jSONArrayArray);
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
                                                                c12731M40955 = m40955("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                            } else {
                                                                c12731M40955 = m40955("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                            }
                                                            c12731 = c12731M40955;
                                                            z8 = z6;
                                                            str6 = str9;
                                                            c12732 = c12731;
                                                            str13 = str6;
                                                            m40965(strMo33986, str2, z8, jSONArrayArray, runtimeException);
                                                            if (runtimeException != null) {
                                                                throw runtimeException;
                                                            }
                                                            if (c12732 != null) {
                                                                str14 = c12732.f42472;
                                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                    z9 = false;
                                                                } else {
                                                                    z9 = false;
                                                                }
                                                                jSONObjectObject = JSON.object();
                                                                JSONObject<JSONObject.Member> jSONObject = c12732.f42468;
                                                                jSONArray = c12732.f42471;
                                                                str15 = c12732.f42475;
                                                                for (JSONObject.Member member : jSONObject) {
                                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                                }
                                                                jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                                if (c12732.f42469) {
                                                                    throw C12731.m31627(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                }
                                                                throw C12731.m31631(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                                                            }
                                                            return new C15502(str, str2, new JSONArray(jSONArrayArray), jM40943);
                                                        } catch (RuntimeException e2) {
                                                            e = e2;
                                                        }
                                                    } catch (C12731 e3) {
                                                        e = e3;
                                                        jSONArrayArray = jSONArray2;
                                                        str6 = str22;
                                                        z3 = false;
                                                        z5 = false;
                                                        z7 = z5;
                                                        boolean z10 = z3;
                                                        c12731 = e;
                                                        z8 = z10;
                                                        c12732 = c12731;
                                                        str13 = str6;
                                                        m40965(strMo33986, str2, z8, jSONArrayArray, runtimeException);
                                                        if (runtimeException != null) {
                                                            throw runtimeException;
                                                        }
                                                        if (c12732 != null) {
                                                            str14 = c12732.f42472;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                z9 = false;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject2 = c12732.f42468;
                                                            jSONArray = c12732.f42471;
                                                            str15 = c12732.f42475;
                                                            while (r3.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                            if (c12732.f42469) {
                                                                throw C12731.m31627(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C12731.m31631(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C15502(str, str2, new JSONArray(jSONArrayArray), jM40943);
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
                                    } catch (C12731 e8) {
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
                                    if (m40981(e)) {
                                        if (z6) {
                                            simpleName = e.getClass().getSimpleName();
                                            c12731M40955 = m40955("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                        } else {
                                            c12731M40955 = m40955("FILE_STORAGE_ERROR", "The storage backend failed while preparing the copied file.", str, str2, str10, str11, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                        }
                                        c12731 = c12731M40955;
                                        z8 = z6;
                                        str6 = str9;
                                        c12732 = c12731;
                                        str13 = str6;
                                    } else {
                                        c12732 = null;
                                        str13 = str9;
                                        runtimeException = e;
                                        z8 = z6;
                                    }
                                }
                                str16 = str23;
                                try {
                                    m40963(str, str2, c17617.m40947(abstractC108610), c3070M8504.f11560, jSONArrayArray);
                                    boolean z11 = c5928M40948.m16196() == EnumC12279.REGULAR;
                                    C10563 c10563M40983 = m40983(abstractC108610, z11);
                                    String str24 = c10563M40983.f36158;
                                    try {
                                        str9 = str24;
                                        try {
                                            try {
                                                m40964(str, str2, abstractC10869, c10563M40983, c3070M8504.f11560, jSONArrayArray);
                                                C5222 c5222 = new C5222();
                                                try {
                                                    try {
                                                        enumC11573M14403 = c5222.m14403(z11 ? abstractC20746 : abstractC20745M8509);
                                                    } catch (RuntimeException unused) {
                                                        enumC11573M14403 = EnumC11573.FAILED;
                                                    }
                                                    if (c3070M8504.f11560.equals(c2800.m8504().f11560)) {
                                                        if (enumC11573M14403 != EnumC11573.SUCCESS) {
                                                            m40962(jSONArrayArray, z11 ? "Existing destination mode, owner, or group metadata could not be fully captured." : "Source mode, owner, or group metadata could not be fully captured.");
                                                            c5222 = null;
                                                        }
                                                        try {
                                                            str21 = "publish";
                                                            boolean z12 = z11;
                                                            jSONArrayArray = jSONArrayArray;
                                                            try {
                                                                m40969(str2, abstractC20747, abstractC108610, abstractC20746, abstractC10869, c10563M40983, jM40943, c3070M8504.f11560);
                                                                try {
                                                                    try {
                                                                        str21 = "restore_metadata";
                                                                        AbstractC20745 abstractC20745M85010 = c2800.m8508(str2);
                                                                        if (c5222 != null) {
                                                                            try {
                                                                                enumC11573M14406 = c5222.m14406(abstractC20745M85010);
                                                                            } catch (RuntimeException unused2) {
                                                                                enumC11573M14406 = EnumC11573.FAILED;
                                                                            }
                                                                            if (enumC11573M14406 != EnumC11573.SUCCESS) {
                                                                                m40962(jSONArrayArray, z12 ? "Existing destination mode, owner, or group metadata could not be fully restored." : "Source mode, owner, or group metadata could not be fully applied to the destination.");
                                                                            }
                                                                        }
                                                                        if (!z12) {
                                                                            try {
                                                                                C5553.m15317(abstractC20745M85010);
                                                                            } catch (RuntimeException unused3) {
                                                                                m40962(jSONArrayArray, "SELinux context restoration could not be completed.");
                                                                            }
                                                                        }
                                                                        m40973(abstractC20745M85010, c5928M40947.m16198(), jSONArrayArray);
                                                                        z8 = true;
                                                                        c12732 = null;
                                                                        str13 = str9;
                                                                        z7 = true;
                                                                        break;
                                                                    } catch (RuntimeException e9) {
                                                                        e = e9;
                                                                        str11 = str21;
                                                                        str10 = str16;
                                                                        z6 = true;
                                                                        z7 = true;
                                                                        if (m40981(e)) {
                                                                            c12732 = null;
                                                                            str13 = str9;
                                                                            runtimeException = e;
                                                                            z8 = z6;
                                                                        } else {
                                                                            if (z6) {
                                                                                simpleName = e.getClass().getSimpleName();
                                                                                c12731M40955 = m40955("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                                            } else {
                                                                                c12731M40955 = m40955("FILE_STORAGE_ERROR", "The storage backend failed while preparing the copied file.", str, str2, str10, str11, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                                            }
                                                                            c12731 = c12731M40955;
                                                                            z8 = z6;
                                                                            str6 = str9;
                                                                            c12732 = c12731;
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
                                                                        c12731M40955 = m40955("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                                    } else {
                                                                        c12731M40955 = m40955("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                                    }
                                                                    c12731 = c12731M40955;
                                                                    z8 = z6;
                                                                    str6 = str9;
                                                                    c12732 = c12731;
                                                                    str13 = str6;
                                                                } catch (C12731 e11) {
                                                                    e = e11;
                                                                    z3 = true;
                                                                    z5 = true;
                                                                    str6 = str9;
                                                                    z7 = z5;
                                                                    boolean z13 = z3;
                                                                    c12731 = e;
                                                                    z8 = z13;
                                                                    c12732 = c12731;
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
                                                            } catch (C12731 e14) {
                                                                e = e14;
                                                                z3 = true;
                                                                str6 = str9;
                                                                z5 = false;
                                                                z7 = z5;
                                                                boolean z14 = z3;
                                                                c12731 = e;
                                                                z8 = z14;
                                                                c12732 = c12731;
                                                                str13 = str6;
                                                                m40965(strMo33986, str2, z8, jSONArrayArray, runtimeException);
                                                                if (runtimeException != null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (c12732 != null) {
                                                                    str14 = c12732.f42472;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                        z9 = false;
                                                                    } else {
                                                                        z9 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject3 = c12732.f42468;
                                                                    jSONArray = c12732.f42471;
                                                                    str15 = c12732.f42475;
                                                                    while (r3.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                                    if (c12732.f42469) {
                                                                        throw C12731.m31627(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C12731.m31631(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C15502(str, str2, new JSONArray(jSONArrayArray), jM40943);
                                                            }
                                                        } catch (IOException e15) {
                                                            e = e15;
                                                            jSONArrayArray = jSONArrayArray;
                                                        } catch (RuntimeException e16) {
                                                            e = e16;
                                                            jSONArrayArray = jSONArrayArray;
                                                        } catch (C12731 e17) {
                                                            e = e17;
                                                            jSONArrayArray = jSONArrayArray;
                                                        }
                                                    } else {
                                                        c17617 = this;
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
                                                } catch (C12731 e19) {
                                                    e = e19;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str6 = str9;
                                                    z3 = false;
                                                    z5 = false;
                                                    z7 = z5;
                                                    boolean z15 = z3;
                                                    c12731 = e;
                                                    z8 = z15;
                                                    c12732 = c12731;
                                                    str13 = str6;
                                                    m40965(strMo33986, str2, z8, jSONArrayArray, runtimeException);
                                                    if (runtimeException != null) {
                                                        throw runtimeException;
                                                    }
                                                    if (c12732 != null) {
                                                        str14 = c12732.f42472;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                            z9 = false;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject4 = c12732.f42468;
                                                        jSONArray = c12732.f42471;
                                                        str15 = c12732.f42475;
                                                        while (r3.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                        if (c12732.f42469) {
                                                            throw C12731.m31627(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C12731.m31631(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C15502(str, str2, new JSONArray(jSONArrayArray), jM40943);
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
                                        } catch (C12731 e22) {
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
                                    } catch (C12731 e25) {
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
                                        c12731M40955 = m40955("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                    } else {
                                        c12731M40955 = m40955("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                    }
                                    c12731 = c12731M40955;
                                    z8 = z6;
                                    str6 = str9;
                                    c12732 = c12731;
                                    str13 = str6;
                                    m40965(strMo33986, str2, z8, jSONArrayArray, runtimeException);
                                    if (runtimeException != null) {
                                        throw runtimeException;
                                    }
                                    if (c12732 != null) {
                                        str14 = c12732.f42472;
                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        jSONObjectObject = JSON.object();
                                        JSONObject<JSONObject.Member> jSONObject5 = c12732.f42468;
                                        jSONArray = c12732.f42471;
                                        str15 = c12732.f42475;
                                        while (r3.hasNext()) {
                                            jSONObjectObject.put(member.getName(), member.getValue());
                                        }
                                        jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                        if (c12732.f42469) {
                                            throw C12731.m31627(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                                        }
                                        throw C12731.m31631(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                                    }
                                    return new C15502(str, str2, new JSONArray(jSONArrayArray), jM40943);
                                } catch (RuntimeException e27) {
                                    e = e27;
                                    jSONArrayArray = jSONArrayArray;
                                }
                            } catch (RuntimeException e28) {
                                e = e28;
                                str16 = str23;
                            }
                        } catch (IOException e29) {
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
                            c12731M40955 = m40955("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                        } else {
                            c12731M40955 = m40955("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                        }
                        c12731 = c12731M40955;
                        z8 = z6;
                        str6 = str9;
                        c12732 = c12731;
                        str13 = str6;
                        m40965(strMo33986, str2, z8, jSONArrayArray, runtimeException);
                        if (runtimeException != null) {
                            throw runtimeException;
                        }
                        if (c12732 != null) {
                            str14 = c12732.f42472;
                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            jSONObjectObject = JSON.object();
                            JSONObject<JSONObject.Member> jSONObject6 = c12732.f42468;
                            jSONArray = c12732.f42471;
                            str15 = c12732.f42475;
                            while (r3.hasNext()) {
                                jSONObjectObject.put(member.getName(), member.getValue());
                            }
                            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                            if (c12732.f42469) {
                                throw C12731.m31627(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                            }
                            throw C12731.m31631(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
                        }
                        return new C15502(str, str2, new JSONArray(jSONArrayArray), jM40943);
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
                        c12731M40955 = m40955("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                    } else {
                        c12731M40955 = m40955("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                    }
                    c12731 = c12731M40955;
                    z8 = z6;
                    str6 = str9;
                    c12732 = c12731;
                    str13 = str6;
                }
            } catch (C12731 e32) {
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
        m40965(strMo33986, str2, z8, jSONArrayArray, runtimeException);
        if (runtimeException != null) {
            throw runtimeException;
        }
        if (c12732 != null) {
            str14 = c12732.f42472;
            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14) || (z8 && (z7 || !"atomic".equals(str13)))) {
                z9 = false;
            } else {
                z9 = true;
            }
            jSONObjectObject = JSON.object();
            JSONObject<JSONObject.Member> jSONObject7 = c12732.f42468;
            jSONArray = c12732.f42471;
            str15 = c12732.f42475;
            while (r3.hasNext()) {
                jSONObjectObject.put(member.getName(), member.getValue());
            }
            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
            if (c12732.f42469) {
                throw C12731.m31627(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
            }
            throw C12731.m31631(str14, c12732.getMessage(), str15, jSONArray, jSONObjectObject);
        }
        return new C15502(str, str2, new JSONArray(jSONArrayArray), jM40943);
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
    private C16912 m40959(String str, boolean z, InterfaceC12679 interfaceC12679, C3070 c3070) throws C12731, C20040 {
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
        C12731 c12731;
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
        C12731 c12731M40956;
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
        C5222 c5222;
        EnumC11573 enumC11573M14403;
        EnumC11573 enumC11573M14406;
        C17617 c17617 = this;
        String str19 = str;
        C2800 c2800 = c17617.f55980;
        JSONArray jSONArrayArray = JSON.array();
        C23263 c23263M40961 = m40961(str, (String) null, z, c3070, jSONArrayArray);
        AbstractC10868 abstractC10868 = c23263M40961.f75484;
        String str20 = c23263M40961.f75482;
        AbstractC20745 abstractC20745 = c23263M40961.f75485;
        String strMo33986 = abstractC20745.mo33986();
        C10563 c10563 = c23263M40961.f75481;
        String str21 = c10563.f36158;
        String str22 = c3070.f11560;
        String str23 = "produce_temp";
        long j3 = 0;
        try {
            try {
                m40968(str19, abstractC10868, c10563, str22, jSONArrayArray);
                try {
                    C9152 c9152Mo4873 = interfaceC12679.mo4873(abstractC20745);
                    Object obj7 = c9152Mo4873.f31102;
                    try {
                        long j4 = c9152Mo4873.f31103;
                        while (true) {
                            try {
                                C3070 c3070M8504 = c2800.m8504();
                                String str24 = c3070M8504.f11560;
                                try {
                                    c3070M8504.m9207(str19);
                                    c3070M8504.m9207(str20);
                                    c3070M8504.m9210(str19);
                                    c23263M40961.m51346(c3070M8504.f11560);
                                    AbstractC20745 abstractC20746 = c23263M40961.f75480;
                                    AbstractC10868 abstractC10869 = c23263M40961.f75484;
                                    String str25 = str20;
                                    AbstractC20745 abstractC20747 = c23263M40961.f75485;
                                    Object obj8 = obj7;
                                    try {
                                        AbstractC10868 abstractC108610 = c23263M40961.f75477;
                                        C23263 c23263 = c23263M40961;
                                        C5928 c5928M40947 = c17617.m40947(abstractC10869);
                                        c17617.m40970(c5928M40947, str19);
                                        if (z) {
                                            str14 = str24;
                                            str15 = "pre_publish_validation";
                                        } else {
                                            str14 = str24;
                                            try {
                                                try {
                                                    str15 = "pre_publish_validation";
                                                    try {
                                                        if (c5928M40947.m16196() != EnumC12279.MISSING) {
                                                            j = j4;
                                                            try {
                                                                throw m40956("FILE_ALREADY_EXISTS", "The local destination appeared before publication and overwrite is false.", str, c3070M8504.f11560, "pre_publish_destination", "already_exists", false, str21, true, jSONArrayArray, null, null);
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
                                                                    e = m40984(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                } else {
                                                                    e = m40956("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                                m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                                if (runtimeException3 == null) {
                                                                    throw runtimeException3;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f42472;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject = e.f42468;
                                                                    jSONArray = e.f42471;
                                                                    str13 = e.f42475;
                                                                    for (JSONObject.Member member : jSONObject) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f42469) {
                                                                        throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            } catch (C0683 e2) {
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
                                                                runtimeException4 = e.f2858;
                                                                if (z3) {
                                                                    c12731M40956 = m40984(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                                } else {
                                                                    simpleName = runtimeException4.getClass().getSimpleName();
                                                                    str6 = null;
                                                                    str7 = null;
                                                                    str8 = "FILE_STORAGE_ERROR";
                                                                    str9 = "The storage backend failed while preparing local file content.";
                                                                    z9 = false;
                                                                    z10 = true;
                                                                    c12731M40956 = m40956(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                                }
                                                                c12731 = c12731M40956;
                                                                e = null;
                                                                z8 = z3;
                                                                runtimeException2 = e;
                                                                e = c12731;
                                                                runtimeException3 = runtimeException2;
                                                                z11 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z12 = z8;
                                                                m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                                if (runtimeException3 == null) {
                                                                    throw runtimeException3;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f42472;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject2 = e.f42468;
                                                                    jSONArray = e.f42471;
                                                                    str13 = e.f42475;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f42469) {
                                                                        throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                                c12731 = null;
                                                                z8 = z3;
                                                                runtimeException2 = e;
                                                                e = c12731;
                                                                runtimeException3 = runtimeException2;
                                                                z11 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z12 = z8;
                                                                m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                                if (runtimeException3 == null) {
                                                                    throw runtimeException3;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f42472;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject3 = e.f42468;
                                                                    jSONArray = e.f42471;
                                                                    str13 = e.f42475;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f42469) {
                                                                        throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                            e = m40984(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                        } else {
                                                            e = m40956("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                        m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                        if (runtimeException3 == null) {
                                                            throw runtimeException3;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f42472;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject4 = e.f42468;
                                                            jSONArray = e.f42471;
                                                            str13 = e.f42475;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f42469) {
                                                                throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    } catch (C0683 e5) {
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
                                                        runtimeException4 = e.f2858;
                                                        if (z3) {
                                                            c12731M40956 = m40984(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                        } else {
                                                            simpleName = runtimeException4.getClass().getSimpleName();
                                                            str6 = null;
                                                            str7 = null;
                                                            str8 = "FILE_STORAGE_ERROR";
                                                            str9 = "The storage backend failed while preparing local file content.";
                                                            z9 = false;
                                                            z10 = true;
                                                            c12731M40956 = m40956(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                        }
                                                        c12731 = c12731M40956;
                                                        e = null;
                                                        z8 = z3;
                                                        runtimeException2 = e;
                                                        e = c12731;
                                                        runtimeException3 = runtimeException2;
                                                        z11 = z4;
                                                        obj2 = obj;
                                                        str10 = str21;
                                                        str11 = str22;
                                                        z12 = z8;
                                                        m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                        if (runtimeException3 == null) {
                                                            throw runtimeException3;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f42472;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject5 = e.f42468;
                                                            jSONArray = e.f42471;
                                                            str13 = e.f42475;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f42469) {
                                                                throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                        c12731 = null;
                                                        z8 = z3;
                                                        runtimeException2 = e;
                                                        e = c12731;
                                                        runtimeException3 = runtimeException2;
                                                        z11 = z4;
                                                        obj2 = obj;
                                                        str10 = str21;
                                                        str11 = str22;
                                                        z12 = z8;
                                                        m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                        if (runtimeException3 == null) {
                                                            throw runtimeException3;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f42472;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject6 = e.f42468;
                                                            jSONArray = e.f42471;
                                                            str13 = e.f42475;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f42469) {
                                                                throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    }
                                                } catch (C12731 e7) {
                                                    e = e7;
                                                    j = j4;
                                                    obj6 = obj8;
                                                }
                                            } catch (IOException e8) {
                                                e = e8;
                                                str15 = "pre_publish_validation";
                                            } catch (C0683 e9) {
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
                                                m40985(str19, c17617.m40947(abstractC108610), c3070M8504.f11560, jSONArrayArray);
                                                boolean z20 = c5928M40947.m16196() == EnumC12279.REGULAR;
                                                C10563 c10563M40983 = m40983(abstractC108610, z20);
                                                String str26 = c10563M40983.f36158;
                                                try {
                                                    try {
                                                        m40968(str19, abstractC10869, c10563M40983, c3070M8504.f11560, jSONArrayArray);
                                                        if (z20) {
                                                            try {
                                                                try {
                                                                    c5222 = new C5222();
                                                                    try {
                                                                        enumC11573M14403 = c5222.m14403(abstractC20746);
                                                                    } catch (RuntimeException unused) {
                                                                        enumC11573M14403 = EnumC11573.FAILED;
                                                                    }
                                                                    if (enumC11573M14403 != EnumC11573.SUCCESS) {
                                                                        m40962(jSONArrayArray, "Existing destination mode, owner, or group metadata could not be fully captured.");
                                                                        c5222 = null;
                                                                    }
                                                                } catch (IOException e11) {
                                                                    e = e11;
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
                                                                        e = m40984(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                    } else {
                                                                        e = m40956("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                                } catch (C12731 e12) {
                                                                    e = e12;
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
                                                                    m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                                    if (runtimeException3 == null) {
                                                                        throw runtimeException3;
                                                                    }
                                                                    if (e != null) {
                                                                        str12 = e.f42472;
                                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                            z13 = false;
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                        jSONObjectObject = JSON.object();
                                                                        JSONObject<JSONObject.Member> jSONObject7 = e.f42468;
                                                                        jSONArray = e.f42471;
                                                                        str13 = e.f42475;
                                                                        while (r4.hasNext()) {
                                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                                        }
                                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                        if (e.f42469) {
                                                                            throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                }
                                                            } catch (C0683 e13) {
                                                                e = e13;
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
                                                                runtimeException4 = e.f2858;
                                                                if (z3) {
                                                                    c12731M40956 = m40984(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                                } else {
                                                                    simpleName = runtimeException4.getClass().getSimpleName();
                                                                    str6 = null;
                                                                    str7 = null;
                                                                    str8 = "FILE_STORAGE_ERROR";
                                                                    str9 = "The storage backend failed while preparing local file content.";
                                                                    z9 = false;
                                                                    z10 = true;
                                                                    c12731M40956 = m40956(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                                }
                                                                c12731 = c12731M40956;
                                                                e = null;
                                                                z8 = z3;
                                                                runtimeException2 = e;
                                                                e = c12731;
                                                                runtimeException3 = runtimeException2;
                                                                z11 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z12 = z8;
                                                            } catch (RuntimeException e14) {
                                                                e = e14;
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
                                                                c12731 = null;
                                                                z8 = z3;
                                                                runtimeException2 = e;
                                                                e = c12731;
                                                                runtimeException3 = runtimeException2;
                                                                z11 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z12 = z8;
                                                                m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                                if (runtimeException3 == null) {
                                                                    throw runtimeException3;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f42472;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject8 = e.f42468;
                                                                    jSONArray = e.f42471;
                                                                    str13 = e.f42475;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f42469) {
                                                                        throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            }
                                                        } else {
                                                            c5222 = null;
                                                        }
                                                        C5222 c5223 = c5222;
                                                        try {
                                                            interfaceC12679.mo4874(c3070M8504);
                                                            if (c3070M8504.f11560.equals(c2800.m8504().f11560)) {
                                                                try {
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                    try {
                                                                        m40969(str, abstractC20747, abstractC108610, abstractC20746, abstractC10869, c10563M40983, j, c3070M8504.f11560);
                                                                        try {
                                                                            try {
                                                                                AbstractC20745 abstractC20745M8508 = c2800.m8508(str19);
                                                                                if (c5223 != null) {
                                                                                    try {
                                                                                        enumC11573M14406 = c5223.m14406(abstractC20745M8508);
                                                                                    } catch (RuntimeException unused2) {
                                                                                        enumC11573M14406 = EnumC11573.FAILED;
                                                                                    }
                                                                                    if (enumC11573M14406 != EnumC11573.SUCCESS) {
                                                                                        m40962(jSONArrayArray, "Existing destination mode, owner, or group metadata could not be fully restored.");
                                                                                    }
                                                                                }
                                                                                if (!z20) {
                                                                                    try {
                                                                                        C5553.m15317(abstractC20745M8508);
                                                                                    } catch (RuntimeException unused3) {
                                                                                        m40962(jSONArrayArray, "SELinux context restoration could not be completed.");
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
                                                                            } catch (C0683 e15) {
                                                                                e = e15;
                                                                                z3 = true;
                                                                                z4 = true;
                                                                                str3 = "restore_metadata";
                                                                                str2 = str19;
                                                                                obj = obj2;
                                                                                str21 = str5;
                                                                                str22 = str14;
                                                                                runtimeException4 = e.f2858;
                                                                                if (z3) {
                                                                                    c12731M40956 = m40984(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                                                } else {
                                                                                    simpleName = runtimeException4.getClass().getSimpleName();
                                                                                    str6 = null;
                                                                                    str7 = null;
                                                                                    str8 = "FILE_STORAGE_ERROR";
                                                                                    str9 = "The storage backend failed while preparing local file content.";
                                                                                    z9 = false;
                                                                                    z10 = true;
                                                                                    c12731M40956 = m40956(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                                                }
                                                                                c12731 = c12731M40956;
                                                                                e = null;
                                                                                z8 = z3;
                                                                                runtimeException2 = e;
                                                                                e = c12731;
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
                                                                                c12731 = null;
                                                                                z8 = z3;
                                                                                runtimeException2 = e;
                                                                                e = c12731;
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
                                                                                e = m40984(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                            } else {
                                                                                e = m40956("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                                        } catch (C12731 e18) {
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
                                                                            e = m40984(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                        } else {
                                                                            e = m40956("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                                        m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                                        if (runtimeException3 == null) {
                                                                            throw runtimeException3;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f42472;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject9 = e.f42468;
                                                                            jSONArray = e.f42471;
                                                                            str13 = e.f42475;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f42469) {
                                                                                throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                    } catch (C0683 e20) {
                                                                        e = e20;
                                                                        str16 = "publish";
                                                                        z16 = true;
                                                                        z3 = z16;
                                                                        str3 = str16;
                                                                        str21 = str5;
                                                                        z4 = false;
                                                                        str2 = str19;
                                                                        obj = obj2;
                                                                        str22 = str14;
                                                                        runtimeException4 = e.f2858;
                                                                        if (z3) {
                                                                            c12731M40956 = m40984(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                                        } else {
                                                                            simpleName = runtimeException4.getClass().getSimpleName();
                                                                            str6 = null;
                                                                            str7 = null;
                                                                            str8 = "FILE_STORAGE_ERROR";
                                                                            str9 = "The storage backend failed while preparing local file content.";
                                                                            z9 = false;
                                                                            z10 = true;
                                                                            c12731M40956 = m40956(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                                        }
                                                                        c12731 = c12731M40956;
                                                                        e = null;
                                                                        z8 = z3;
                                                                        runtimeException2 = e;
                                                                        e = c12731;
                                                                        runtimeException3 = runtimeException2;
                                                                        z11 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z12 = z8;
                                                                        m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                                        if (runtimeException3 == null) {
                                                                            throw runtimeException3;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f42472;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject10 = e.f42468;
                                                                            jSONArray = e.f42471;
                                                                            str13 = e.f42475;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f42469) {
                                                                                throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                    } catch (RuntimeException e21) {
                                                                        e = e21;
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
                                                                        c12731 = null;
                                                                        z8 = z3;
                                                                        runtimeException2 = e;
                                                                        e = c12731;
                                                                        runtimeException3 = runtimeException2;
                                                                        z11 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z12 = z8;
                                                                        m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                                        if (runtimeException3 == null) {
                                                                            throw runtimeException3;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f42472;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject11 = e.f42468;
                                                                            jSONArray = e.f42471;
                                                                            str13 = e.f42475;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f42469) {
                                                                                throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                    } catch (C12731 e22) {
                                                                        e = e22;
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
                                                                    }
                                                                } catch (IOException e23) {
                                                                    e = e23;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                } catch (C0683 e24) {
                                                                    e = e24;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                } catch (RuntimeException e25) {
                                                                    e = e25;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
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
                                                                    c12731 = null;
                                                                    z8 = z3;
                                                                    runtimeException2 = e;
                                                                    e = c12731;
                                                                    runtimeException3 = runtimeException2;
                                                                    z11 = z4;
                                                                    obj2 = obj;
                                                                    str10 = str21;
                                                                    str11 = str22;
                                                                    z12 = z8;
                                                                    m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                                    if (runtimeException3 == null) {
                                                                        throw runtimeException3;
                                                                    }
                                                                    if (e != null) {
                                                                        str12 = e.f42472;
                                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                            z13 = false;
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                        jSONObjectObject = JSON.object();
                                                                        JSONObject<JSONObject.Member> jSONObject12 = e.f42468;
                                                                        jSONArray = e.f42471;
                                                                        str13 = e.f42475;
                                                                        while (r4.hasNext()) {
                                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                                        }
                                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                        if (e.f42469) {
                                                                            throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                } catch (C12731 e26) {
                                                                    e = e26;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                }
                                                            } else {
                                                                c17617 = this;
                                                                obj7 = obj8;
                                                                str20 = str25;
                                                                c23263M40961 = c23263;
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
                                                            c12731 = null;
                                                            z8 = z3;
                                                            runtimeException2 = e;
                                                            e = c12731;
                                                            runtimeException3 = runtimeException2;
                                                            z11 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            z12 = z8;
                                                            m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                            if (runtimeException3 == null) {
                                                                throw runtimeException3;
                                                            }
                                                            if (e != null) {
                                                                str12 = e.f42472;
                                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                    z13 = false;
                                                                } else {
                                                                    z13 = false;
                                                                }
                                                                jSONObjectObject = JSON.object();
                                                                JSONObject<JSONObject.Member> jSONObject13 = e.f42468;
                                                                jSONArray = e.f42471;
                                                                str13 = e.f42475;
                                                                while (r4.hasNext()) {
                                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                                }
                                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                if (e.f42469) {
                                                                    throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                        if (z2) {
                                                        }
                                                        str2 = str19;
                                                        c12731 = null;
                                                        z8 = z3;
                                                        runtimeException2 = e;
                                                        e = c12731;
                                                        runtimeException3 = runtimeException2;
                                                        z11 = z4;
                                                        obj2 = obj;
                                                        str10 = str21;
                                                        str11 = str22;
                                                        z12 = z8;
                                                        m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                        if (runtimeException3 == null) {
                                                            throw runtimeException3;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f42472;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject14 = e.f42468;
                                                            jSONArray = e.f42471;
                                                            str13 = e.f42475;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f42469) {
                                                                throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                        e = m40984(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                    } else {
                                                        e = m40956("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                    m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                    if (runtimeException3 == null) {
                                                        throw runtimeException3;
                                                    }
                                                    if (e != null) {
                                                        str12 = e.f42472;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                            z13 = false;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject15 = e.f42468;
                                                        jSONArray = e.f42471;
                                                        str13 = e.f42475;
                                                        while (r4.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                        if (e.f42469) {
                                                            throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                } catch (C0683 e30) {
                                                    e = e30;
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
                                                    runtimeException4 = e.f2858;
                                                    if (z3) {
                                                        c12731M40956 = m40984(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                                    } else {
                                                        simpleName = runtimeException4.getClass().getSimpleName();
                                                        str6 = null;
                                                        str7 = null;
                                                        str8 = "FILE_STORAGE_ERROR";
                                                        str9 = "The storage backend failed while preparing local file content.";
                                                        z9 = false;
                                                        z10 = true;
                                                        c12731M40956 = m40956(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                                    }
                                                    c12731 = c12731M40956;
                                                    e = null;
                                                    z8 = z3;
                                                    runtimeException2 = e;
                                                    e = c12731;
                                                    runtimeException3 = runtimeException2;
                                                    z11 = z4;
                                                    obj2 = obj;
                                                    str10 = str21;
                                                    str11 = str22;
                                                    z12 = z8;
                                                    m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                                    if (runtimeException3 == null) {
                                                        throw runtimeException3;
                                                    }
                                                    if (e != null) {
                                                        str12 = e.f42472;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                            z13 = false;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject16 = e.f42468;
                                                        jSONArray = e.f42471;
                                                        str13 = e.f42475;
                                                        while (r4.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                        if (e.f42469) {
                                                            throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                } catch (C12731 e31) {
                                                    e = e31;
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
                                                }
                                            } catch (C12731 e32) {
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
                                                e = m40984(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                            } else {
                                                e = m40956("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                            m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                            if (runtimeException3 == null) {
                                                throw runtimeException3;
                                            }
                                            if (e != null) {
                                                str12 = e.f42472;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject17 = e.f42468;
                                                jSONArray = e.f42471;
                                                str13 = e.f42475;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f42469) {
                                                    throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                        } catch (C0683 e34) {
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
                                            runtimeException4 = e.f2858;
                                            if (z3) {
                                                c12731M40956 = m40984(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                            } else {
                                                simpleName = runtimeException4.getClass().getSimpleName();
                                                str6 = null;
                                                str7 = null;
                                                str8 = "FILE_STORAGE_ERROR";
                                                str9 = "The storage backend failed while preparing local file content.";
                                                z9 = false;
                                                z10 = true;
                                                c12731M40956 = m40956(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                            }
                                            c12731 = c12731M40956;
                                            e = null;
                                            z8 = z3;
                                            runtimeException2 = e;
                                            e = c12731;
                                            runtimeException3 = runtimeException2;
                                            z11 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z12 = z8;
                                            m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                            if (runtimeException3 == null) {
                                                throw runtimeException3;
                                            }
                                            if (e != null) {
                                                str12 = e.f42472;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject18 = e.f42468;
                                                jSONArray = e.f42471;
                                                str13 = e.f42475;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f42469) {
                                                    throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                            c12731 = null;
                                            z8 = z3;
                                            runtimeException2 = e;
                                            e = c12731;
                                            runtimeException3 = runtimeException2;
                                            z11 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z12 = z8;
                                            m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                            if (runtimeException3 == null) {
                                                throw runtimeException3;
                                            }
                                            if (e != null) {
                                                str12 = e.f42472;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject19 = e.f42468;
                                                jSONArray = e.f42471;
                                                str13 = e.f42475;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f42469) {
                                                    throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                            e = m40984(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                        } else {
                                            e = m40956("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                        m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                        if (runtimeException3 == null) {
                                            throw runtimeException3;
                                        }
                                        if (e != null) {
                                            str12 = e.f42472;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject110 = e.f42468;
                                            jSONArray = e.f42471;
                                            str13 = e.f42475;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f42469) {
                                                throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                    } catch (C0683 e37) {
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
                                        runtimeException4 = e.f2858;
                                        if (z3) {
                                            c12731M40956 = m40984(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                        } else {
                                            simpleName = runtimeException4.getClass().getSimpleName();
                                            str6 = null;
                                            str7 = null;
                                            str8 = "FILE_STORAGE_ERROR";
                                            str9 = "The storage backend failed while preparing local file content.";
                                            z9 = false;
                                            z10 = true;
                                            c12731M40956 = m40956(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                        }
                                        c12731 = c12731M40956;
                                        e = null;
                                        z8 = z3;
                                        runtimeException2 = e;
                                        e = c12731;
                                        runtimeException3 = runtimeException2;
                                        z11 = z4;
                                        obj2 = obj;
                                        str10 = str21;
                                        str11 = str22;
                                        z12 = z8;
                                        m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                        if (runtimeException3 == null) {
                                            throw runtimeException3;
                                        }
                                        if (e != null) {
                                            str12 = e.f42472;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject111 = e.f42468;
                                            jSONArray = e.f42471;
                                            str13 = e.f42475;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f42469) {
                                                throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                        c12731 = null;
                                        z8 = z3;
                                        runtimeException2 = e;
                                        e = c12731;
                                        runtimeException3 = runtimeException2;
                                        z11 = z4;
                                        obj2 = obj;
                                        str10 = str21;
                                        str11 = str22;
                                        z12 = z8;
                                        m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                        if (runtimeException3 == null) {
                                            throw runtimeException3;
                                        }
                                        if (e != null) {
                                            str12 = e.f42472;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject112 = e.f42468;
                                            jSONArray = e.f42471;
                                            str13 = e.f42475;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f42469) {
                                                throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                    } catch (C12731 e39) {
                                        e = e39;
                                        obj6 = obj8;
                                        str14 = str24;
                                        j = j4;
                                    }
                                } catch (IOException e40) {
                                    e = e40;
                                    obj2 = obj7;
                                } catch (C0683 e41) {
                                    e = e41;
                                    obj2 = obj7;
                                } catch (RuntimeException e42) {
                                    e = e42;
                                    obj2 = obj7;
                                } catch (C12731 e43) {
                                    e = e43;
                                    obj6 = obj7;
                                    str14 = str24;
                                    j = j4;
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
                                    boolean z113 = z7;
                                    z5 = z6;
                                    runtimeException = null;
                                    z4 = z113;
                                    z8 = z5;
                                    runtimeException2 = runtimeException;
                                    runtimeException3 = runtimeException2;
                                    z11 = z4;
                                    obj2 = obj;
                                    str10 = str21;
                                    str11 = str22;
                                    z12 = z8;
                                    m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                    if (runtimeException3 == null) {
                                        throw runtimeException3;
                                    }
                                    if (e != null) {
                                        str12 = e.f42472;
                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                            z13 = false;
                                        } else {
                                            z13 = false;
                                        }
                                        jSONObjectObject = JSON.object();
                                        JSONObject<JSONObject.Member> jSONObject113 = e.f42468;
                                        jSONArray = e.f42471;
                                        str13 = e.f42475;
                                        while (r4.hasNext()) {
                                            jSONObjectObject.put(member.getName(), member.getValue());
                                        }
                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                        if (e.f42469) {
                                            throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                    e = m40984(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                } else {
                                    e = m40956("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                if (runtimeException3 == null) {
                                    throw runtimeException3;
                                }
                                if (e != null) {
                                    str12 = e.f42472;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject114 = e.f42468;
                                    jSONArray = e.f42471;
                                    str13 = e.f42475;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f42469) {
                                        throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                            } catch (C0683 e45) {
                                e = e45;
                                obj4 = obj7;
                                j3 = j4;
                                z14 = false;
                                z4 = false;
                                z3 = z14;
                                str3 = str23;
                                j = j3;
                                str2 = str19;
                                obj = obj4;
                                runtimeException4 = e.f2858;
                                if (z3) {
                                    c12731M40956 = m40984(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                                } else {
                                    simpleName = runtimeException4.getClass().getSimpleName();
                                    str6 = null;
                                    str7 = null;
                                    str8 = "FILE_STORAGE_ERROR";
                                    str9 = "The storage backend failed while preparing local file content.";
                                    z9 = false;
                                    z10 = true;
                                    c12731M40956 = m40956(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                                }
                                c12731 = c12731M40956;
                                e = null;
                                z8 = z3;
                                runtimeException2 = e;
                                e = c12731;
                                runtimeException3 = runtimeException2;
                                z11 = z4;
                                obj2 = obj;
                                str10 = str21;
                                str11 = str22;
                                z12 = z8;
                                m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                if (runtimeException3 == null) {
                                    throw runtimeException3;
                                }
                                if (e != null) {
                                    str12 = e.f42472;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject115 = e.f42468;
                                    jSONArray = e.f42471;
                                    str13 = e.f42475;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f42469) {
                                        throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                            } catch (RuntimeException e46) {
                                e = e46;
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
                                c12731 = null;
                                z8 = z3;
                                runtimeException2 = e;
                                e = c12731;
                                runtimeException3 = runtimeException2;
                                z11 = z4;
                                obj2 = obj;
                                str10 = str21;
                                str11 = str22;
                                z12 = z8;
                                m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                                if (runtimeException3 == null) {
                                    throw runtimeException3;
                                }
                                if (e != null) {
                                    str12 = e.f42472;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject116 = e.f42468;
                                    jSONArray = e.f42471;
                                    str13 = e.f42475;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f42469) {
                                        throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                            } catch (C12731 e47) {
                                e = e47;
                                jSONArrayArray = jSONArrayArray;
                                j = j4;
                                str2 = str19;
                                obj = obj7;
                            }
                        }
                    } catch (IOException e48) {
                        e = e48;
                        obj5 = obj7;
                    } catch (C0683 e49) {
                        e = e49;
                        obj4 = obj7;
                    } catch (RuntimeException e50) {
                        e = e50;
                        obj3 = obj7;
                        z2 = false;
                    } catch (C12731 e51) {
                        e = e51;
                        jSONArrayArray = jSONArrayArray;
                        str2 = str19;
                        obj = obj7;
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
                        e = m40984(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                    } else {
                        e = m40956("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                    m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                    if (runtimeException3 == null) {
                        throw runtimeException3;
                    }
                    if (e != null) {
                        str12 = e.f42472;
                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        jSONObjectObject = JSON.object();
                        JSONObject<JSONObject.Member> jSONObject117 = e.f42468;
                        jSONArray = e.f42471;
                        str13 = e.f42475;
                        while (r4.hasNext()) {
                            jSONObjectObject.put(member.getName(), member.getValue());
                        }
                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                        if (e.f42469) {
                            throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                        }
                        throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                    }
                    return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                } catch (C0683 e53) {
                    e = e53;
                    str2 = str19;
                    z3 = false;
                    z4 = false;
                    obj = null;
                    str3 = "produce_temp";
                    j = 0;
                    runtimeException4 = e.f2858;
                    if (z3) {
                        c12731M40956 = m40984(jSONArrayArray, str2, str22, str21, runtimeException4.getClass().getSimpleName());
                    } else {
                        simpleName = runtimeException4.getClass().getSimpleName();
                        str6 = null;
                        str7 = null;
                        str8 = "FILE_STORAGE_ERROR";
                        str9 = "The storage backend failed while preparing local file content.";
                        z9 = false;
                        z10 = true;
                        c12731M40956 = m40956(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                    }
                    c12731 = c12731M40956;
                    e = null;
                    z8 = z3;
                    runtimeException2 = e;
                    e = c12731;
                    runtimeException3 = runtimeException2;
                    z11 = z4;
                    obj2 = obj;
                    str10 = str21;
                    str11 = str22;
                    z12 = z8;
                    m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                    if (runtimeException3 == null) {
                        throw runtimeException3;
                    }
                    if (e != null) {
                        str12 = e.f42472;
                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        jSONObjectObject = JSON.object();
                        JSONObject<JSONObject.Member> jSONObject118 = e.f42468;
                        jSONArray = e.f42471;
                        str13 = e.f42475;
                        while (r4.hasNext()) {
                            jSONObjectObject.put(member.getName(), member.getValue());
                        }
                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                        if (e.f42469) {
                            throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                        }
                        throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                    }
                    return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                } catch (C12731 e54) {
                    e = e54;
                    str2 = str19;
                    obj = null;
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
                if (z2 || !m40981(e)) {
                    str2 = str19;
                    c12731 = null;
                    z8 = z3;
                    runtimeException2 = e;
                    e = c12731;
                    runtimeException3 = runtimeException2;
                    z11 = z4;
                    obj2 = obj;
                    str10 = str21;
                    str11 = str22;
                    z12 = z8;
                } else if (z3) {
                    e = m40984(jSONArrayArray, str19, str22, str21, e.getClass().getSimpleName());
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
                    c12731M40956 = m40956(str8, str9, str, str22, str3, simpleName, z9, str21, z10, jSONArrayArray, str6, str7);
                    c12731 = c12731M40956;
                    e = null;
                    z8 = z3;
                    runtimeException2 = e;
                    e = c12731;
                    runtimeException3 = runtimeException2;
                    z11 = z4;
                    obj2 = obj;
                    str10 = str21;
                    str11 = str22;
                    z12 = z8;
                }
                m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
                if (runtimeException3 == null) {
                    throw runtimeException3;
                }
                if (e != null) {
                    str12 = e.f42472;
                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    jSONObjectObject = JSON.object();
                    JSONObject<JSONObject.Member> jSONObject119 = e.f42468;
                    jSONArray = e.f42471;
                    str13 = e.f42475;
                    while (r4.hasNext()) {
                        jSONObjectObject.put(member.getName(), member.getValue());
                    }
                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                    if (e.f42469) {
                        throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                    }
                    throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                }
                return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
            }
        } catch (IOException e56) {
            e = e56;
            str2 = str19;
        } catch (C0683 e57) {
            e = e57;
            str2 = str19;
        } catch (C12731 e58) {
            e = e58;
            str2 = str19;
        }
        m40965(strMo33986, str, z12, jSONArrayArray, runtimeException3);
        if (runtimeException3 == null) {
            throw runtimeException3;
        }
        if (e != null) {
            str12 = e.f42472;
            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12) || (z12 && (z11 || !"atomic".equals(str10)))) {
                z13 = false;
            } else {
                z13 = true;
            }
            jSONObjectObject = JSON.object();
            JSONObject<JSONObject.Member> jSONObject1110 = e.f42468;
            jSONArray = e.f42471;
            str13 = e.f42475;
            while (r4.hasNext()) {
                jSONObjectObject.put(member.getName(), member.getValue());
            }
            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
            if (e.f42469) {
                throw C12731.m31627(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
            }
            throw C12731.m31631(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
        }
        return new C16912(obj2, str, str10, new JSONArray(jSONArrayArray), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23263 m40961(String str, String str2, boolean z, C3070 c3070, JSONArray jSONArray) throws C12731, C20040 {
        C2800 c2800 = this.f55980;
        AbstractC20745 abstractC20745M8508 = c2800.m8508(str);
        AbstractC10868 abstractC10868Mo33989 = abstractC20745M8508.mo33989();
        C5928 c5928M40947 = m40947(abstractC10868Mo33989);
        m40970(c5928M40947, str);
        String str3 = str2 == null ? "The local destination" : "The destination";
        if (!z && c5928M40947.m16196() != EnumC12279.MISSING) {
            String str4 = c3070.f11560;
            String strConcat = str3.concat(" already exists and overwrite is false.");
            if (str2 == null) {
                throw m40956("FILE_ALREADY_EXISTS", strConcat, str, str4, "destination_stat", "already_exists", false, null, true, JSON.array(), null, null);
            }
            throw m40955("FILE_ALREADY_EXISTS", strConcat, str2, str, str4, "destination_stat", "already_exists", false, null, true, JSON.array());
        }
        String parent = abstractC20745M8508.getParent();
        if (parent == null) {
            String str5 = c3070.f11560;
            String strConcat2 = str3.concat(" has no writable parent directory.");
            if (str2 == null) {
                throw m40956("FILE_PARENT_NOT_FOUND", strConcat2, str, str5, "prepare", "parent_missing", false, null, true, JSON.array(), null, null);
            }
            throw m40955("FILE_PARENT_NOT_FOUND", strConcat2, str2, str, str5, "prepare", "parent_missing", false, null, true, JSON.array());
        }
        c3070.m9207(parent);
        String str6 = c3070.f11560;
        AbstractC20745 abstractC20745M8509 = c2800.m8508(parent);
        m40974(abstractC20745M8508, str, str6);
        m40967(str, abstractC20745M8509.mo33989(), str6);
        m40975(abstractC20745M8509, c3070, jSONArray);
        return new C23263(this, str, parent, abstractC20745M8508, abstractC10868Mo33989, m40960(jSONArray, str, parent, str6), c5928M40947.m16196() == EnumC12279.REGULAR);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40965(String str, String str2, boolean z, JSONArray jSONArray, RuntimeException runtimeException) {
        if (!m40978(str)) {
            m40962(jSONArray, "A temporary MCP file could not be removed.");
            if (runtimeException != null) {
                runtimeException.addSuppressed(new IOException("A temporary MCP file could not be removed"));
            }
        }
        if (z) {
            try {
                this.f55979.m3431(str2);
            } catch (RuntimeException e) {
                m40962(jSONArray, "File change notification could not be completed.");
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
    private l.C7740 m40949(java.lang.String r28, java.lang.String r29, l.InterfaceC7034 r30, l.C3070 r31) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17617.m40949(java.lang.String, java.lang.String, l.ۜ᩸۬, l.ۗۜ۬):l.۟᩸۬");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m40980(C5928 c5928, String str) throws C12731 {
        int i = C13385.f44331[c5928.m16196().ordinal()];
        C2800 c2800 = this.f55980;
        if (i == 3) {
            throw C0280.m1794(c5928, c2800, "FILE_NOT_REGULAR", "Directories cannot be modified as file content.", str);
        }
        if (i == 4) {
            throw C0280.m1794(c5928, c2800, "FILE_IS_SYMLINK", "Symbolic links cannot be modified by generic file content tools.", str);
        }
        if (i == 5) {
            throw C0280.m1794(c5928, c2800, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be modified as file content.", str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m40986(C5928 c5928, String str) throws C12731 {
        int i = C13385.f44331[c5928.m16196().ordinal()];
        C2800 c2800 = this.f55980;
        if (i == 1) {
            c2800.getClass();
            throw C2800.m8501(str);
        }
        if (i == 3) {
            throw C0280.m1794(c5928, c2800, "FILE_NOT_REGULAR", "Directories cannot be copied by mt_file_copy.", str);
        }
        if (i == 4) {
            throw C0280.m1794(c5928, c2800, "FILE_IS_SYMLINK", "Symbolic links cannot be copied by generic file tools.", str);
        }
        if (i == 5) {
            throw C0280.m1794(c5928, c2800, "FILE_UNSUPPORTED_TYPE", "The source node type cannot be copied by generic file tools.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40970(C5928 c5928, String str) throws C12731 {
        int i = C13385.f44331[c5928.m16196().ordinal()];
        C2800 c2800 = this.f55980;
        if (i == 3) {
            throw C0280.m1794(c5928, c2800, "FILE_NOT_REGULAR", "A directory cannot be used as the file copy destination.", str);
        }
        if (i == 4) {
            throw C0280.m1794(c5928, c2800, "FILE_IS_SYMLINK", "A symbolic link cannot be used as the file copy destination.", str);
        }
        if (i == 5) {
            throw C0280.m1794(c5928, c2800, "FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by generic file tools.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40963(String str, String str2, C5928 c5928, String str3, JSONArray jSONArray) throws C12731 {
        if (c5928.m16196() == EnumC12279.REGULAR) {
            return;
        }
        throw m40955("FILE_STORAGE_ERROR", "The copied temporary file is no longer available for publication.", str, str2, str3, "pre_publish_temp", "temp_" + c5928.m16196().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m40985(String str, C5928 c5928, String str2, JSONArray jSONArray) throws C12731 {
        if (c5928.m16196() == EnumC12279.REGULAR) {
            return;
        }
        throw m40956("FILE_STORAGE_ERROR", "The streamed temporary file is no longer available for publication.", str, str2, "pre_publish_temp", "temp_" + c5928.m16196().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m40967(String str, AbstractC10868 abstractC10868, String str2) throws C12731 {
        C5928 c5928M40947 = m40947(abstractC10868);
        if (c5928M40947.m16196() == EnumC12279.MISSING) {
            throw m40956("FILE_PARENT_NOT_FOUND", "The target parent directory does not exist.", str, str2, "parent_stat", "parent_missing", false, null, true, JSON.array(), null, null);
        }
        if (c5928M40947.m16196() != EnumC12279.DIRECTORY) {
            throw m40956("FILE_NOT_DIRECTORY", "The target parent is not a directory.", str, str2, "parent_stat", c5928M40947.m16196().name().toLowerCase(Locale.ROOT), false, null, true, JSON.array(), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m40974(AbstractC20745 abstractC20745, String str, String str2) throws C12731 {
        this.f55980.m8507(abstractC20745, new C5623(str, str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m40954(String str, String str2, String str3, String str4, String str5) {
        return m40956(str3, str4, str, str2, "check_parent_links", str5, false, null, true, JSON.array(), null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC20745 m40960(JSONArray jSONArray, String str, String str2, String str3) throws C12731 {
        boolean zMo27228 = false;
        for (int i = 0; i < 16; i++) {
            StringBuilder sb = new StringBuilder(".mt-mcp-");
            sb.append(f55977);
            sb.append("-");
            byte[] bArr = new byte[18];
            f55978.nextBytes(bArr);
            sb.append(C22253.m49424(bArr));
            sb.append(".tmp");
            String string = sb.toString();
            AbstractC20745 abstractC20745M8508 = this.f55980.m8508("/".equals(str2) ? C0252.m1693("/", string) : C1679.m5594(str2, "/", string));
            AbstractC10868 abstractC10868Mo33989 = abstractC20745M8508.mo33989();
            if (abstractC10868Mo33989.mo1799(EnumC17217.CREATE_FILE_EXCLUSIVE) == EnumC16512.UNSUPPORTED) {
                throw m40956("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot safely create an MCP temporary file.", str, str3, "create_temp", "exclusive_create_unsupported", false, null, true, jSONArray, null, null);
            }
            try {
                abstractC10868Mo33989.mo8393();
                return abstractC20745M8508;
            } catch (C20040 e) {
                if (e.m45399() != EnumC15807.ALREADY_EXISTS) {
                    try {
                        zMo27228 = abstractC10868Mo33989.mo27228();
                    } catch (IOException | RuntimeException unused) {
                    }
                    if (!zMo27228) {
                        m40962(jSONArray, "A temporary MCP file could not be removed after creation failed.");
                    }
                    throw m40956("FILE_STORAGE_ERROR", "Failed to create an MCP temporary file.", str, str3, "create_temp", e.m45399().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray, null, null);
                }
            }
        }
        throw m40956("FILE_STORAGE_ERROR", "Unable to allocate a unique MCP temporary file name.", str, str3, "create_temp", "name_collision", false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40975(AbstractC20745 abstractC20745, C3070 c3070, JSONArray jSONArray) throws C20040 {
        synchronized (this.f55981) {
            if (c3070.f11560.equals(this.f55981.get(abstractC20745.mo33986()))) {
                return;
            }
            this.f55981.put(abstractC20745.mo33986(), c3070.f11560);
            if (this.f55981.size() > 64) {
                LinkedHashMap linkedHashMap = this.f55981;
                linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
            }
            AbstractC10868 abstractC10868Mo33989 = abstractC20745.mo33989();
            if (abstractC10868Mo33989.mo1799(EnumC17217.LIST) == EnumC16512.UNSUPPORTED) {
                return;
            }
            try {
                boolean z = false;
                for (C5928 c5928 : abstractC10868Mo33989.mo8397()) {
                    AbstractC20745 abstractC20745M16195 = c5928.m16195();
                    EnumC12279 enumC12279M16196 = c5928.m16196();
                    EnumC12279 enumC12279 = EnumC12279.REGULAR;
                    if (enumC12279M16196 == enumC12279 && m40987(abstractC20745M16195.getName())) {
                        try {
                            c3070.m9207(abstractC20745M16195.mo33986());
                            AbstractC10868 abstractC10868Mo339810 = abstractC20745M16195.mo33989();
                            if (abstractC10868Mo339810.mo1799(EnumC17217.DELETE_FILE_OR_LINK) == EnumC16512.UNSUPPORTED) {
                                z = true;
                            } else {
                                C5928 c5928Mo8394 = abstractC10868Mo339810.mo8394();
                                if (c5928Mo8394.m16196() == enumC12279 && m40987(c5928Mo8394.m16195().getName())) {
                                    abstractC10868Mo339810.mo8392();
                                }
                            }
                        } catch (RuntimeException | C12731 | C20040 unused) {
                        }
                    }
                }
                if (z) {
                    m40962(jSONArray, "One or more stale MCP temporary files could not be removed.");
                }
            } catch (RuntimeException | C20040 unused2) {
                m40962(jSONArray, "Stale MCP temporary files could not be checked on this storage backend.");
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m40987(String str) {
        if (str.length() != 73 || !str.startsWith(".mt-mcp-") || str.charAt(32) != '-' || !str.endsWith(".tmp") || !m40976(8, 32, str) || !m40976(33, 69, str)) {
            return false;
        }
        String str2 = f55977;
        return !str.regionMatches(8, str2, 0, str2.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40976(int i, int i2, String str) {
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
    public static void m40962(JSONArray jSONArray, String str) {
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
    public static C4211 m40946(String str, AbstractC20745 abstractC20745, C21145 c21145, InterfaceC7034 interfaceC7034, String str2) throws C12731, IOException {
        MessageDigest messageDigestM49425 = C22253.m49425();
        C21851 c21851 = new C21851(abstractC20745.mo33976(false), messageDigestM49425);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c21851, 65536);
        try {
            interfaceC7034.mo2749(c21145, bufferedOutputStream);
            bufferedOutputStream.close();
            if (c21851.f70920 > 9007199254740991L) {
                throw m40956("FILE_STORAGE_ERROR", "The output size exceeds the supported JSON integer range.", str, str2, "write_temp", "size_out_of_range", false, null, true, JSON.array(), null, null);
            }
            return C4211.m11876(c21851.f70920, C22253.m49424(messageDigestM49425.digest()).substring(0, 16));
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
    public static long m40943(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC20745.mo33970(), 65536);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC20746.mo33976(false), 65536);
            try {
                long jM40942 = m40942(bufferedInputStream, bufferedOutputStream);
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return jM40942;
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
    public static C9152 m40950(C15772 c15772, AbstractC20745 abstractC20745) throws IOException {
        try {
            C18323 c18323 = new C18323(new C20440(abstractC20745.mo33976(false)));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c18323, 65536);
            try {
                C22744 c22744M16129 = C5893.m16129(c15772.f51081, c15772.f51083, c15772.f51082, bufferedOutputStream);
                bufferedOutputStream.close();
                return new C9152(c18323.f58460, c22744M16129);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RuntimeException e) {
            if ((e instanceof C0683) || !m40981(e)) {
                throw e;
            }
            throw new C0683(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static RuntimeException m40982(RuntimeException runtimeException) {
        return ((runtimeException instanceof C0683) || !m40981(runtimeException)) ? runtimeException : new C0683(runtimeException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10563 m40952(AbstractC20745 abstractC20745, boolean z) {
        EnumC17217 enumC17217;
        if (z) {
            enumC17217 = EnumC17217.REPLACE;
        } else {
            enumC17217 = EnumC17217.RENAME_NO_REPLACE;
        }
        EnumC16512 enumC16512Mo1799 = abstractC20745.mo33989().mo1799(enumC17217);
        if (enumC16512Mo1799 == EnumC16512.ATOMIC) {
            return new C10563(enumC17217, "atomic", true, true);
        }
        if (enumC16512Mo1799 == EnumC16512.BEST_EFFORT || enumC16512Mo1799 == EnumC16512.SUPPORTED) {
            return new C10563(enumC17217, "best_effort", false, true);
        }
        return new C10563(enumC17217, "best_effort", false, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C10563 m40983(AbstractC10868 abstractC10868, boolean z) {
        EnumC17217 enumC17217;
        if (z) {
            enumC17217 = EnumC17217.REPLACE;
        } else {
            enumC17217 = EnumC17217.RENAME_NO_REPLACE;
        }
        EnumC16512 enumC16512Mo1799 = abstractC10868.mo1799(enumC17217);
        if (enumC16512Mo1799 == EnumC16512.ATOMIC) {
            return new C10563(enumC17217, "atomic", true, true);
        }
        if (enumC16512Mo1799 == EnumC16512.BEST_EFFORT || enumC16512Mo1799 == EnumC16512.SUPPORTED) {
            return new C10563(enumC17217, "best_effort", false, true);
        }
        return new C10563(enumC17217, "best_effort", false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40964(String str, String str2, AbstractC10868 abstractC10868, C10563 c10563, String str3, JSONArray jSONArray) throws C12731 {
        if (c10563.f36160 == EnumC17217.RENAME_NO_REPLACE && !c10563.f36161 && abstractC10868.mo1799(EnumC17217.CREATE_FILE_EXCLUSIVE) == EnumC16512.UNSUPPORTED) {
            throw m40955("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, str3, "publish_capability", "no_replace_unsupported", false, c10563.f36158, true, jSONArray);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40968(String str, AbstractC10868 abstractC10868, C10563 c10563, String str2, JSONArray jSONArray) throws C12731 {
        if (c10563.f36160 == EnumC17217.RENAME_NO_REPLACE && !c10563.f36161 && abstractC10868.mo1799(EnumC17217.CREATE_FILE_EXCLUSIVE) == EnumC16512.UNSUPPORTED) {
            throw m40956("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, "publish_capability", "no_replace_unsupported", false, c10563.f36158, true, jSONArray, null, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40969(String str, AbstractC20745 abstractC20745, AbstractC10868 abstractC10868, AbstractC20745 abstractC20746, AbstractC10868 abstractC10869, C10563 c10563, long j, String str2) throws C12731, IOException {
        AbstractC20745 abstractC20747;
        AbstractC20745 abstractC20748;
        AbstractC10868 abstractC108610;
        String str3 = c10563.f36158;
        boolean z = c10563.f36161;
        boolean z2 = c10563.f36159;
        EnumC17217 enumC17217 = c10563.f36160;
        if (z) {
            try {
                if (enumC17217 == EnumC17217.REPLACE) {
                    abstractC10868.mo8396(abstractC20746);
                    return;
                } else {
                    abstractC10868.mo8391(abstractC20746);
                    return;
                }
            } catch (C20040 e) {
                C2800 c2800 = this.f55980;
                C19029 c19029 = null;
                if (enumC17217 == EnumC17217.RENAME_NO_REPLACE && !z2 && C13638.equals(abstractC20745.getParent(), abstractC20746.getParent())) {
                    try {
                        AbstractC20745 abstractC20745M8508 = c2800.m8508(abstractC20745.mo33986());
                        AbstractC20745 abstractC20745M8509 = c2800.m8508(abstractC20746.mo33986());
                        AbstractC10868 abstractC10868Mo33989 = abstractC20745M8508.mo33989();
                        AbstractC10868 abstractC10868Mo339810 = abstractC20745M8509.mo33989();
                        C5928 c5928Mo8394 = abstractC10868Mo33989.mo8394();
                        if (c5928Mo8394.m16196() == EnumC12279.REGULAR && ((c5928Mo8394.m16197() < 0 || c5928Mo8394.m16197() == j) && abstractC10868Mo339810.mo8394().m16196() == EnumC12279.MISSING)) {
                            c19029 = new C19029(abstractC20745M8508, abstractC20745M8509, abstractC10868Mo339810);
                        }
                    } catch (RuntimeException | C20040 unused) {
                    }
                }
                if (c19029 == null) {
                    String str4 = z2 ? "FILE_STORAGE_ERROR" : "FILE_OPERATION_STATE_UNKNOWN";
                    String strName = enumC17217.name();
                    Locale locale = Locale.ROOT;
                    String lowerCase = strName.toLowerCase(locale);
                    String lowerCase2 = e.m45399().name().toLowerCase(locale);
                    boolean z3 = c10563.f36159;
                    throw m40956(str4, "Failed to publish local file content.", str, str2, lowerCase, lowerCase2, !z3, str3, z3, JSON.array(), null, null);
                }
                abstractC20747 = c19029.f61555;
                abstractC20748 = c19029.f61554;
                abstractC108610 = c19029.f61556;
            }
        } else {
            abstractC20747 = abstractC20745;
            abstractC20748 = abstractC20746;
            abstractC108610 = abstractC10869;
        }
        if (enumC17217 == EnumC17217.RENAME_NO_REPLACE) {
            if (abstractC108610.mo1799(EnumC17217.CREATE_FILE_EXCLUSIVE) == EnumC16512.UNSUPPORTED) {
                throw m40956("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, "publish_capability", "no_replace_unsupported", false, str3, true, JSON.array(), null, null);
            }
            try {
                abstractC108610.mo8393();
            } catch (C20040 e2) {
                throw m40956("FILE_OPERATION_STATE_UNKNOWN", "Failed to create the final local file before publishing content.", str, str2, "create_target", e2.m45399().name().toLowerCase(Locale.ROOT), true, str3, false, JSON.array(), null, null);
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC20747.mo33970(), 65536);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC20748.mo33976(false), 65536);
            try {
                m40942(bufferedInputStream, bufferedOutputStream);
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
    private C4211 m40945(String str, C5928 c5928, String str2, String str3) throws C12731 {
        if (c5928.m16196() == EnumC12279.MISSING) {
            return C4211.m11875();
        }
        try {
            C12016 c12016M8600 = C2842.m8600(c5928.m16195(), 0L, 1);
            long j = c12016M8600.f40254;
            C5928 c5928M40947 = m40947(c5928.m16195().mo33989());
            if (c5928M40947.m16196() != EnumC12279.REGULAR || ((c5928.m16197() >= 0 && c5928.m16197() != j) || (c5928M40947.m16197() >= 0 && c5928M40947.m16197() != j))) {
                throw m40956("FILE_CHANGED_DURING_READ", "The file changed while its targetVersion was being calculated.", str, str2, str3, "metadata_changed", false, null, true, JSON.array(), null, null);
            }
            return C4211.m11876(j, c12016M8600.f40252);
        } catch (IOException e) {
            throw m40956("FILE_STORAGE_ERROR", "Failed to read current local file content.", str, str2, str3, e.getClass().getSimpleName(), false, null, true, JSON.array(), null, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m40978(String str) {
        try {
            AbstractC10868 abstractC10868Mo33989 = this.f55980.m8508(str).mo33989();
            C5928 c5928Mo8394 = abstractC10868Mo33989.mo8394();
            if (c5928Mo8394.m16196() == EnumC12279.MISSING) {
                return true;
            }
            if (c5928Mo8394.m16196() == EnumC12279.REGULAR && abstractC10868Mo33989.mo1799(EnumC17217.DELETE_FILE_OR_LINK) != EnumC16512.UNSUPPORTED) {
                abstractC10868Mo33989.mo8392();
                return true;
            }
            return false;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40973(AbstractC20745 abstractC20745, long j, JSONArray jSONArray) {
        if (C16737.m39280()) {
            if (j < 0) {
                m40962(jSONArray, "Source modified time was unavailable and could not be preserved.");
                return;
            }
            try {
                if (abstractC20745.mo8448() && abstractC20745.mo32855(j)) {
                    return;
                }
                m40962(jSONArray, "Source modified time could not be applied to the destination.");
            } catch (RuntimeException unused) {
                m40962(jSONArray, "Source modified time could not be applied to the destination.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5928 m40947(AbstractC10868 abstractC10868) throws C12731 {
        try {
            return abstractC10868.mo8394();
        } catch (C20040 e) {
            this.f55980.getClass();
            throw C2800.m8500(e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m40981(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m40957(C12731 c12731, String str, String str2) {
        boolean z = c12731.f42473;
        JSONArray jSONArray = c12731.f42471;
        String str3 = c12731.f42475;
        String str4 = c12731.f42472;
        if (z) {
            return c12731;
        }
        JSONObject jSONObjectObject = JSON.object();
        for (JSONObject.Member member : c12731.f42468) {
            jSONObjectObject.put(member.getName(), member.getValue());
        }
        jSONObjectObject.put("localPath", str);
        JSONValue jSONValue = jSONObjectObject.get("policyRevision");
        if (jSONValue == null || !jSONValue.isString()) {
            jSONObjectObject.put("policyRevision", str2);
        }
        if (c12731.f42469) {
            return C12731.m31627(str4, c12731.getMessage(), str3, jSONArray, jSONObjectObject);
        }
        return C12731.m31631(str4, c12731.getMessage(), str3, jSONArray, jSONObjectObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m40955(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, boolean z2, JSONArray jSONArray) {
        JSONObject jSONObjectAdd = C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "targetPath", str4).add("policyRevision", str5).add("operation", str6).add("backendReason", str7).add("changed", z).add("operationMode", str8 == null ? JSON.NULL : JSON.value(str8)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
        return ("FILE_ALREADY_EXISTS".equals(str) || "FILE_STORAGE_ERROR".equals(str) || "FILE_CHANGED_DURING_READ".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C12731.m31627(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C12731.m31631(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m40953(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        return m40956("FILE_STORAGE_ERROR", str, str2, str3, str4, "size_out_of_range", false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m40984(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        return m40956("FILE_OPERATION_STATE_UNKNOWN", "The file operation may have changed the target, but its final state is unknown.", str, str2, "publish", str4, true, str3, false, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m40956(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, JSONArray jSONArray, String str8, String str9) {
        JSONObject jSONObjectAdd = C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", z).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
        if (str8 != null) {
            jSONObjectAdd.add("expectedTargetVersion", str8).add("actualTargetVersion", str9);
        }
        return (("parent_stat".equals(str5) && (("FILE_PARENT_NOT_FOUND".equals(str) && "parent_missing".equals(str6)) || ("FILE_NOT_DIRECTORY".equals(str) && "regular".equals(str6)))) || "FILE_ALREADY_EXISTS".equals(str) || "FILE_STORAGE_ERROR".equals(str) || "FILE_CHANGED_DURING_READ".equals(str) || "FILE_TARGET_VERSION_MISMATCH".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C12731.m31627(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C12731.m31631(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7740 m40988(String str, String str2, InterfaceC7034 interfaceC7034) throws C12731 {
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
            C2800 c2800 = this.f55980;
            C3070 c3070M8504 = c2800.m8504();
            String strM8502 = C2800.m8502(str, c3070M8504, MotionUtils.EASING_TYPE_PATH);
            C11268 c11268M8509 = c2800.m8509(strM8502);
            try {
                C7740 c7740M40949 = m40949(strM8502, str2, interfaceC7034, c3070M8504);
                c11268M8509.close();
                return c7740M40949;
            } catch (Throwable th) {
                try {
                    c11268M8509.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw C12731.m31626("Invalid targetVersion", "targetVersion", str2 == null ? null : JSON.value(str2), JSON.array().add("missing").add("<16 lowercase hex digits copied from the latest read>"), JSON.object().add("targetVersion", "missing"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m40942(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
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
    public static boolean m40979(C4211 c4211, C4211 c4212) {
        return c4211.f15286 == c4212.f15286 && c4211.f15288 == c4212.f15288 && c4211.f15287.equals(c4212.f15287);
    }
}
