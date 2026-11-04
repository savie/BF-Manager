package l;

import android.util.Base64;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.p.a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܿ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 879H */
/* JADX INFO: loaded from: classes4.dex */
public final class C18326 {
    /* JADX WARN: Code duplicated, block: B:67:0x013f A[Catch: Exception -> 0x0174, ۢܳۚ -> 0x0179, TryCatch #2 {ۢܳۚ -> 0x0179, Exception -> 0x0174, blocks: (B:8:0x000d, B:10:0x0015, B:12:0x0027, B:14:0x003d, B:16:0x0046, B:27:0x0066, B:65:0x0135, B:67:0x013f, B:69:0x015b, B:70:0x015f, B:30:0x0070, B:33:0x00a2, B:36:0x00c4, B:39:0x00ce, B:42:0x00d7, B:45:0x00e0, B:48:0x00e9, B:51:0x00f2, B:54:0x00fb, B:57:0x0104, B:60:0x010d, B:61:0x0112, B:62:0x0116, B:63:0x0117, B:71:0x0160, B:72:0x0164, B:73:0x0165, B:74:0x0169, B:75:0x016a, B:76:0x016e, B:77:0x016f, B:78:0x0173), top: B:84:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015b A[Catch: Exception -> 0x0174, ۢܳۚ -> 0x0179, TryCatch #2 {ۢܳۚ -> 0x0179, Exception -> 0x0174, blocks: (B:8:0x000d, B:10:0x0015, B:12:0x0027, B:14:0x003d, B:16:0x0046, B:27:0x0066, B:65:0x0135, B:67:0x013f, B:69:0x015b, B:70:0x015f, B:30:0x0070, B:33:0x00a2, B:36:0x00c4, B:39:0x00ce, B:42:0x00d7, B:45:0x00e0, B:48:0x00e9, B:51:0x00f2, B:54:0x00fb, B:57:0x0104, B:60:0x010d, B:61:0x0112, B:62:0x0116, B:63:0x0117, B:71:0x0160, B:72:0x0164, B:73:0x0165, B:74:0x0169, B:75:0x016a, B:76:0x016e, B:77:0x016f, B:78:0x0173), top: B:84:0x000d }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14596 m42760(String str, int i, String str2, String str3) throws C10186 {
        C14596 c14596;
        C14596 c14596M42769;
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 11);
            if (bArrDecode.length <= 2) {
                throw m42759((String) null);
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrDecode, bArrDecode.length - 2);
            C20348 c20348 = new C20348(bArrCopyOf);
            if (m42784(c20348) != 3) {
                throw m42759((String) null);
            }
            int iM42784 = m42784(c20348);
            byte[] bArrM42767 = m42767(iM42784, str2, str3, i, bArrCopyOf, bArrCopyOf.length);
            if (bArrDecode[bArrDecode.length - 2] != bArrM42767[0] || bArrDecode[bArrDecode.length - 1] != bArrM42767[1]) {
                throw m42759((String) null);
            }
            int iM42775 = m42775(c20348);
            int iM42776 = m42775(c20348);
            if (iM42775 < 1 || iM42776 < 1 || iM42775 > iM42776) {
                throw m42759((String) null);
            }
            if (iM42784 != 20 && iM42784 != 21) {
                if (iM42784 == 22) {
                    c14596M42769 = m42772(c20348);
                } else if (iM42784 == 18) {
                    c14596M42769 = new C14596(JSON.object().add("query", m42771(c20348)).add("appType", m42771(c20348)), JSON.object().add("afterPackage", m42771(c20348)));
                } else if (iM42784 == 12) {
                    c14596 = new C14596(JSON.object().add("prefix", m42771(c20348)), JSON.object().add("offset", m42775(c20348)));
                } else if (iM42784 == 6) {
                    c14596M42769 = m42782(c20348);
                } else if (iM42784 == 14) {
                    c14596M42769 = m42773(c20348);
                } else if (iM42784 == 17) {
                    c14596M42769 = m42777(c20348);
                } else if (iM42784 == 8) {
                    c14596M42769 = m42755(c20348);
                } else if (iM42784 == 9) {
                    c14596M42769 = m42774(c20348);
                } else if (iM42784 == 10) {
                    c14596M42769 = m42783(c20348);
                } else if (iM42784 == 13) {
                    c14596M42769 = m42768(c20348);
                } else if (iM42784 == 15) {
                    c14596M42769 = m42780(c20348);
                } else {
                    if (iM42784 != 16) {
                        throw m42759((String) null);
                    }
                    c14596M42769 = m42769(c20348);
                }
                if (c20348.available() == 0) {
                    throw m42759((String) null);
                }
                c14596M42769.f45982.add("recommendedLimit", iM42775).add("limitMax", iM42776);
                return new C14596(m42756(iM42784), c14596M42769.f45982, c14596M42769.f45980, iM42775, iM42776);
            }
            c14596 = new C14596(JSON.object().add("prefix", m42771(c20348)), JSON.object().add("offset", m42775(c20348)));
            c14596M42769 = c14596;
            if (c20348.available() == 0) {
                throw m42759((String) null);
            }
            c14596M42769.f45982.add("recommendedLimit", iM42775).add("limitMax", iM42776);
            return new C14596(m42756(iM42784), c14596M42769.f45982, c14596M42769.f45980, iM42775, iM42776);
        } catch (C10186 unused) {
            throw m42759(str);
        } catch (Exception unused2) {
            throw m42759(str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m42779(String str) {
        return C15022.m36182(C15022.m36179().digest(str.getBytes(StandardCharsets.UTF_8)));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C14596 m42772(C20348 c20348) throws C10186 {
        String str;
        JSONObject jSONObjectObject = JSON.object();
        int iM42784 = m42784(c20348);
        if (iM42784 == 1) {
            str = "resource_table";
        } else {
            if (iM42784 != 2) {
                throw m42759((String) null);
            }
            str = "resource_table_variants";
        }
        return new C14596(jSONObjectObject.add("view", str).add("typeName", m42771(c20348)).add("variant", m42771(c20348)), JSON.object().add("offset", m42775(c20348)));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C14596 m42782(C20348 c20348) {
        return new C14596(JSON.object().add("locator", m42771(c20348)), JSON.object().add("memberOffset", m42775(c20348)));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C14596 m42773(C20348 c20348) throws C10186 {
        String str;
        int iM42784 = m42784(c20348);
        String strM42758 = m42758(c20348, iM42784);
        int iM42785 = m42784(c20348);
        if (iM42785 == 1) {
            str = TextBundle.TEXT_ENTRY;
        } else {
            if (iM42785 != 2) {
                throw m42759((String) null);
            }
            str = "hex";
        }
        if (iM42785 == 2 && iM42784 != 1) {
            throw m42759((String) null);
        }
        JSONObject jSONObjectM50076 = C22121.m50076("target", strM42758, "format", str);
        JSONObject jSONObjectObject = JSON.object();
        if (iM42785 == 2) {
            jSONObjectObject.add("hexOffset", m42775(c20348));
        } else if (iM42784 == 6) {
            jSONObjectM50076.add("variant", m42771(c20348)).add("maxValueChars", m42775(c20348)).add("maxValueXmlChars", m42775(c20348)).add("maxItemsPerValue", m42775(c20348)).add("resolveDepth", m42775(c20348));
            jSONObjectObject.add("valueOffset", m42775(c20348));
        } else {
            jSONObjectM50076.add("maxChars", m42775(c20348));
            jSONObjectObject.add("lineOffset", m42775(c20348)).add("lineCharOffset", m42775(c20348));
        }
        return new C14596(jSONObjectM50076, jSONObjectObject);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C14596 m42777(C20348 c20348) {
        return new C14596(JSON.object().add("target", m42771(c20348)).add("style", m42771(c20348)).add("textHash", m42771(c20348)).add("maxChars", m42775(c20348)), JSON.object().add("lineOffset", m42775(c20348)).add("lineCharOffset", m42775(c20348)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14596 m42755(C20348 c20348) throws C10186 {
        String str;
        String str2;
        String strM42771;
        String strM42772;
        String str3;
        String str4;
        JSONObject jSONObjectAdd = JSON.object().add("query", m42771(c20348));
        int iM42784 = m42784(c20348);
        if (iM42784 == 1) {
            str = "literal";
        } else {
            if (iM42784 != 2) {
                throw m42759((String) null);
            }
            str = "regex";
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("queryType", str).add("caseSensitive", m42766(c20348));
        int iM42785 = m42784(c20348);
        if (iM42785 == 1) {
            str2 = "contains";
        } else {
            if (iM42785 != 2) {
                throw m42759((String) null);
            }
            str2 = "exact";
        }
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("matchMode", str2);
        int iM42775 = m42775(c20348);
        if ((iM42775 & (-8192)) != 0 || iM42775 == 0) {
            throw m42759((String) null);
        }
        JSONArray jSONArrayArray = JSON.array();
        m42761(iM42775, 1, jSONArrayArray, "zip_entries");
        m42761(iM42775, 2, jSONArrayArray, "axml");
        m42761(iM42775, 4, jSONArrayArray, "resource_table_id");
        m42761(iM42775, 8, jSONArrayArray, "resource_table_name");
        m42761(iM42775, 16, jSONArrayArray, "resource_table_value");
        m42761(iM42775, 1024, jSONArrayArray, "resource_table_file_path");
        m42761(iM42775, 32, jSONArrayArray, "dex_class");
        m42761(iM42775, 64, jSONArrayArray, "dex_field");
        m42761(iM42775, 128, jSONArrayArray, "dex_method");
        m42761(iM42775, 256, jSONArrayArray, "dex_string");
        String str5 = "smali";
        m42761(iM42775, 512, jSONArrayArray, "smali");
        m42761(iM42775, 2048, jSONArrayArray, "native_symbol");
        m42761(iM42775, 4096, jSONArrayArray, "native_string");
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("scopes", jSONArrayArray).add("includeSnippet", m42766(c20348)).add("snippetMaxChars", m42775(c20348)).add("explicitScopes", m42766(c20348)).add("includeMatchOffsets", m42766(c20348));
        int iM42786 = m42784(c20348);
        if (iM42786 == 0) {
            strM42771 = null;
        } else {
            if (iM42786 != 1) {
                throw m42759((String) null);
            }
            strM42771 = m42771(c20348);
        }
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("zipEntryPrefix", strM42771);
        int iM42787 = m42784(c20348);
        if (iM42787 == 0) {
            strM42772 = null;
        } else {
            if (iM42787 != 1) {
                throw m42759((String) null);
            }
            strM42772 = m42771(c20348);
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("resourcePrefix", strM42772);
        int iM42788 = m42784(c20348);
        if (iM42788 == 0) {
            str3 = "none";
        } else if (iM42788 == 1) {
            str3 = "prefix";
        } else {
            if (iM42788 != 2) {
                throw m42759((String) null);
            }
            str3 = "descriptorExact";
        }
        jSONObjectAdd6.add("classPrefixMode", str3);
        jSONObjectAdd6.add("classPrefix", iM42788 == 0 ? null : m42771(c20348));
        int iM42789 = m42784(c20348);
        if (iM42789 == 1) {
            str4 = Name.LABEL;
        } else {
            if (iM42789 != 2) {
                throw m42759((String) null);
            }
            str4 = "member";
        }
        jSONObjectAdd6.add("dexStringResultMode", str4);
        JSONObject jSONObjectAdd7 = JSON.object().add("scopeIndex", m42775(c20348)).add("entryIndex", m42775(c20348)).add("classIndex", m42775(c20348)).add("memberIndex", m42775(c20348) - 1).add("classCharOffset", m42775(c20348));
        if (c20348.available() > 0) {
            int iM427810 = m42784(c20348);
            if (iM427810 == 1) {
                str5 = "overview";
            } else if (iM427810 == 2) {
                str5 = "files";
            } else if (iM427810 == 3) {
                str5 = "resource_table_names";
            } else if (iM427810 == 4) {
                str5 = "resource_table_values";
            } else if (iM427810 == 5) {
                str5 = "resource_table_file_paths";
            } else if (iM427810 == 6) {
                str5 = "dex_names";
            } else if (iM427810 == 7) {
                str5 = "dex_strings";
            } else if (iM427810 == 8) {
                str5 = "dex_string_members";
            } else if (iM427810 != 9) {
                if (iM427810 == 10) {
                    str5 = "native_symbols";
                } else {
                    if (iM427810 != 11) {
                        throw m42759((String) null);
                    }
                    str5 = "native_strings";
                }
            }
            jSONObjectAdd6.add("target", str5);
        }
        if (c20348.available() > 0) {
            if (!"native_strings".equals(jSONObjectAdd6.getString("target", null))) {
                throw m42759((String) null);
            }
            jSONObjectAdd7.add("nativeStringTotalCount", m42775(c20348)).add("nativeStringScanOffset", m42766(c20348) ? m42776(c20348) : -1L);
        }
        return new C14596(jSONObjectAdd6, jSONObjectAdd7);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static C14596 m42774(C20348 c20348) throws C10186 {
        return new C14596(JSON.object().add("targetLocator", m42758(c20348, 4)).add("methodResolution", m42778(m42784(c20348))), JSON.object().add("classIndex", m42775(c20348)).add("memberIndex", m42775(c20348)).add("instructionIndex", m42775(c20348)));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C14596 m42783(C20348 c20348) throws C10186 {
        int iM42784 = m42784(c20348);
        if (iM42784 != 4 && iM42784 != 5 && iM42784 != 3) {
            throw m42759((String) null);
        }
        return new C14596(JSON.object().add("targetLocator", m42758(c20348, iM42784)).add("methodResolution", m42778(m42784(c20348))), JSON.object().add("classIndex", m42775(c20348)).add("memberIndex", m42775(c20348)).add("instructionIndex", m42775(c20348)));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C14596 m42768(C20348 c20348) throws C10186 {
        String str;
        String strM42758 = m42758(c20348, 6);
        int iM42775 = m42775(c20348);
        if (iM42775 <= 0 || iM42775 > 3) {
            throw m42759((String) null);
        }
        JSONArray jSONArrayArray = JSON.array();
        for (int i = 0; i < iM42775; i++) {
            int iM42784 = m42784(c20348);
            if (iM42784 == 1) {
                str = "dex";
            } else if (iM42784 == 2) {
                str = "axml";
            } else {
                if (iM42784 != 3) {
                    throw m42759((String) null);
                }
                str = "resource_table";
            }
            jSONArrayArray.add(str);
        }
        return new C14596(JSON.object().add("targetLocator", strM42758).add("scopes", jSONArrayArray), JSON.object().add("scopeIndex", m42775(c20348)).add("entryIndex", m42775(c20348)).add("classIndex", m42775(c20348)).add("memberIndex", m42775(c20348)).add("instructionIndex", m42775(c20348)).add("innerIndex", m42775(c20348)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14596 m42780(C20348 c20348) throws C10186 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m42771(c20348));
        int iM42784 = m42784(c20348);
        if (iM42784 < 1 || iM42784 > 9) {
            throw m42759((String) null);
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("itemKind", C10717.f34032[iM42784 - 1]).add("namePrefix", m42771(c20348)).add("demangle", m42766(c20348));
        long jM42776 = m42776(c20348);
        long jM42777 = m42776(c20348);
        if (jM42777 > 4294967295L) {
            throw m42759((String) null);
        }
        jSONObjectAdd2.add("entrySize", jM42776).add("entryCrc", jM42777).add("totalCount", m42775(c20348));
        return new C14596(jSONObjectAdd2, JSON.object().add("offset", m42775(c20348)));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C14596 m42769(C20348 c20348) throws C10186 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m42771(c20348)).add("addressKind", m42771(c20348)).add("address", m42776(c20348)).add("instructionMode", m42771(c20348));
        String strM42771 = m42771(c20348);
        C11972.m30028(strM42771);
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("scanKind", strM42771).add("resolvedInstructionMode", m42771(c20348)).add("targetVirtualAddress", m42776(c20348)).add("arch", m42771(c20348)).add("bits", m42775(c20348));
        int iM42775 = m42775(c20348);
        C9225.m24407(iM42775);
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("referenceKindMask", iM42775).add("maxScanBytes", m42775(c20348));
        long jM42776 = m42776(c20348);
        long jM42777 = m42776(c20348);
        if (jM42777 > 4294967295L) {
            throw m42759((String) null);
        }
        try {
            C11972.m30020(jSONObjectAdd3.getInt("referenceKindMask", -1), jSONObjectAdd3.getString("scanKind", ""));
            jSONObjectAdd3.add("entrySize", jM42776).add("entryCrc", jM42777);
            return new C14596(jSONObjectAdd3, JSON.object().add("phaseIndex", m42775(c20348)).add("rangeIndex", m42775(c20348)).add("byteOffsetInRange", m42776(c20348)).add("relocationIndex", m42775(c20348)));
        } catch (RuntimeException unused) {
            throw m42759((String) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42763(C6178 c6178, int i, String str) {
        String strM13943 = C4375.m13943(str);
        if (i == 1 || i == 2) {
            m42765(c6178, strM13943);
            return;
        }
        if (i == 3) {
            m42765(c6178, strM13943);
            return;
        }
        if (i == 4) {
            C21310 c21310M42770 = m42770(strM13943);
            m42765(c6178, c21310M42770.f67916);
            m42765(c6178, c21310M42770.f67917);
            return;
        }
        if (i == 5) {
            C21310 c21310M42771 = m42770(strM13943);
            m42765(c6178, c21310M42771.f67916);
            m42765(c6178, c21310M42771.f67917);
        } else {
            if (i != 6) {
                throw new IllegalArgumentException("Unsupported read target");
            }
            if (strM13943 == null || strM13943.length() != 10 || !strM13943.regionMatches(true, 0, "0x", 0, 2)) {
                throw new IllegalArgumentException("Invalid resource key");
            }
            long j = Long.parseLong(strM13943.substring(2), 16);
            if (j >= 0 && j <= 4294967295L) {
                c6178.writeInt((int) j);
                return;
            }
            throw new IllegalArgumentException("Invalid resource key");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42758(C20348 c20348, int i) throws C10186 {
        String str;
        if (i != 1 && i != 2) {
            if (i == 3) {
                return C4375.m13906("dex_class", (String) null, m42771(c20348), (String) null, (String) null, (String) null);
            }
            if (i == 4) {
                return C4375.m13906("dex_method", (String) null, m42771(c20348), m42771(c20348), (String) null, (String) null);
            }
            if (i == 5) {
                return C4375.m13906("dex_field", (String) null, m42771(c20348), (String) null, m42771(c20348), (String) null);
            }
            if (i != 6) {
                throw m42759((String) null);
            }
            if (c20348.available() < 4) {
                throw m42759((String) null);
            }
            return C4375.m13906("resource", (String) null, (String) null, (String) null, (String) null, String.format(Locale.ROOT, "0x%08x", Integer.valueOf(c20348.readInt())));
        }
        if (i == 1) {
            str = "zip_entry";
        } else if (i == 2) {
            str = "axml";
        } else if (i == 3) {
            str = "dex_class";
        } else if (i == 4) {
            str = "dex_method";
        } else if (i == 5) {
            str = "dex_field";
        } else {
            if (i != 6) {
                throw m42759((String) null);
            }
            str = "resource";
        }
        return C4375.m13906(str, m42771(c20348), (String) null, (String) null, (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C21310 m42770(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Missing smali target");
        }
        int iIndexOf = str.indexOf("->");
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf("->")) {
            throw new IllegalArgumentException("Invalid smali target");
        }
        return new C21310(str.substring(0, iIndexOf), str.substring(iIndexOf + 2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m42767(int i, String str, String str2, int i2, byte[] bArr, int i3) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            byte[] bytes2 = str2.getBytes(charset);
            C6178 c6178 = new C6178(bytes.length + 8 + bytes2.length + i3);
            c6178.writeByte(i);
            m42762(c6178, bytes.length);
            c6178.write(bytes, 0, bytes.length);
            m42762(c6178, bytes2.length);
            c6178.write(bytes2, 0, bytes2.length);
            m42762(c6178, i2);
            c6178.write(bArr, 0, i3);
            MessageDigest messageDigestM36179 = C15022.m36179();
            messageDigestM36179.update(c6178.m17808(), 0, c6178.size());
            byte[] bArrDigest = messageDigestM36179.digest();
            return new byte[]{bArrDigest[0], bArrDigest[1]};
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42762(C6178 c6178, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative varint");
        }
        while ((i & a.g) != 0) {
            c6178.writeByte((i & 127) | 128);
            i >>>= 7;
        }
        c6178.writeByte(i);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int m42775(C20348 c20348) throws C10186 {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int iM42784 = m42784(c20348);
            if (i3 == 4 && (iM42784 & 248) != 0) {
                throw m42759((String) null);
            }
            i |= (iM42784 & 127) << i2;
            if ((iM42784 & 128) == 0) {
                return i;
            }
            i2 += 7;
        }
        throw m42759((String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42764(C6178 c6178, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Negative varlong");
        }
        while (((-128) & j) != 0) {
            c6178.writeByte((int) ((127 & j) | 128));
            j >>>= 7;
        }
        c6178.writeByte((int) j);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m42776(C20348 c20348) throws C10186 {
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            int iM42784 = m42784(c20348);
            j |= ((long) (iM42784 & 127)) << i;
            if ((iM42784 & 128) == 0) {
                return j;
            }
            i += 7;
        }
        throw m42759((String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42765(C6178 c6178, String str) {
        if (str == null) {
            throw new IllegalArgumentException("Missing string");
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        m42762(c6178, bytes.length);
        c6178.write(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m42771(C20348 c20348) throws C10186 {
        int iM42775 = m42775(c20348);
        if (c20348.available() >= iM42775) {
            byte[] bArr = new byte[iM42775];
            c20348.m46745(iM42775, bArr);
            return new String(bArr, StandardCharsets.UTF_8);
        }
        throw m42759((String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42766(C20348 c20348) throws C10186 {
        int iM42784 = m42784(c20348);
        if (iM42784 == 0) {
            return false;
        }
        if (iM42784 == 1) {
            return true;
        }
        throw m42759((String) null);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m42784(C20348 c20348) throws C10186 {
        if (c20348.available() <= 0) {
            throw m42759((String) null);
        }
        return c20348.readByte() & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42761(int i, int i2, JSONArray jSONArray, String str) {
        if ((i & i2) != 0) {
            jSONArray.add(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42757(String str, String str2, String str3, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if ("list_entries".equals(str)) {
            i2 = 20;
        } else if ("dex_list_classes".equals(str)) {
            i2 = 21;
        } else if ("resource_list".equals(str)) {
            i2 = 22;
        } else if ("installed_apps".equals(str)) {
            i2 = 18;
        } else if ("available_apks".equals(str)) {
            i2 = 12;
        } else if ("outline_class".equals(str)) {
            i2 = 6;
        } else if ("read".equals(str)) {
            i2 = 14;
        } else if ("java_pseudocode".equals(str)) {
            i2 = 17;
        } else if ("search".equals(str)) {
            i2 = 8;
        } else if ("xref".equals(str)) {
            i2 = 10;
        } else if ("resource_xref".equals(str)) {
            i2 = 13;
        } else if ("native_items".equals(str)) {
            i2 = 15;
        } else {
            if (!"native_xref".equals(str)) {
                throw new IllegalArgumentException(C25272.m56409("Unsupported cursor type: ", str));
            }
            i2 = 16;
        }
        C6178 c6178 = new C6178(128);
        c6178.writeByte(3);
        c6178.writeByte(i2);
        m42762(c6178, jSONObject.getInt("recommendedLimit", -1));
        m42762(c6178, jSONObject.getInt("limitMax", -1));
        if (i2 != 20 && i2 != 21) {
            if (i2 == 22) {
                String string = jSONObject.getString("view");
                if ("resource_table".equals(string)) {
                    i13 = 1;
                } else {
                    if (!"resource_table_variants".equals(string)) {
                        throw new IllegalArgumentException(C25272.m56409("Unsupported list view: ", string));
                    }
                    i13 = 2;
                }
                c6178.writeByte(i13);
                m42765(c6178, jSONObject.getString("typeName"));
                m42765(c6178, jSONObject.getString("variant"));
                m42762(c6178, jSONObject2.getInt("offset", -1));
            } else if (i2 == 18) {
                m42765(c6178, jSONObject.getString("query", ""));
                m42765(c6178, jSONObject.getString("appType", ProviderConfigurationPermission.ALL_STR));
                m42765(c6178, jSONObject2.getString("afterPackage", ""));
            } else if (i2 == 12) {
                m42765(c6178, jSONObject.getString("prefix", ""));
                i3 = jSONObject2.getInt("offset", -1);
            } else if (i2 == 6) {
                m42765(c6178, jSONObject.getString("locator", null));
                m42762(c6178, jSONObject2.getInt("memberOffset", -1));
            } else if (i2 == 14) {
                String string2 = jSONObject.getString("target", null);
                int iM42781 = m42781(C4375.m13947(string2));
                String string3 = jSONObject.getString("format", TextBundle.TEXT_ENTRY);
                if (TextBundle.TEXT_ENTRY.equals(string3)) {
                    i12 = 1;
                } else {
                    if (!"hex".equals(string3)) {
                        throw new IllegalArgumentException(C25272.m56409("Unsupported read format: ", string3));
                    }
                    i12 = 2;
                }
                if (i12 == 2 && iM42781 != 1) {
                    throw new IllegalArgumentException("Byte read cursors are valid only for zip_entry targets");
                }
                c6178.writeByte(iM42781);
                m42763(c6178, iM42781, string2);
                c6178.writeByte(i12);
                if (i12 == 2) {
                    m42762(c6178, jSONObject2.getInt("hexOffset", -1));
                } else if (iM42781 == 6) {
                    m42765(c6178, jSONObject.getString("variant", null));
                    m42762(c6178, jSONObject.getInt("maxValueChars", -1));
                    m42762(c6178, jSONObject.getInt("maxValueXmlChars", 32768));
                    m42762(c6178, jSONObject.getInt("maxItemsPerValue", -1));
                    m42762(c6178, jSONObject.getInt("resolveDepth", -1));
                    m42762(c6178, jSONObject2.getInt("valueOffset", -1));
                } else {
                    m42762(c6178, jSONObject.getInt("maxChars", -1));
                    m42762(c6178, jSONObject2.getInt("lineOffset", -1));
                    m42762(c6178, jSONObject2.getInt("lineCharOffset", -1));
                }
            } else if (i2 == 17) {
                m42765(c6178, jSONObject.getString("target", null));
                m42765(c6178, jSONObject.getString("style", null));
                m42765(c6178, jSONObject.getString("textHash", null));
                m42762(c6178, jSONObject.getInt("maxChars", -1));
                m42762(c6178, jSONObject2.getInt("lineOffset", -1));
                m42762(c6178, jSONObject2.getInt("lineCharOffset", -1));
            } else if (i2 == 8) {
                m42765(c6178, jSONObject.getString("query", null));
                String string4 = jSONObject.getString("queryType", null);
                if ("literal".equals(string4)) {
                    i6 = 1;
                } else {
                    if (!"regex".equals(string4)) {
                        throw new IllegalArgumentException(C25272.m56409("Unsupported queryType: ", string4));
                    }
                    i6 = 2;
                }
                c6178.writeByte(i6);
                c6178.writeByte(jSONObject.getBoolean("caseSensitive", false) ? 1 : 0);
                String string5 = jSONObject.getString("matchMode", null);
                if ("contains".equals(string5)) {
                    i7 = 1;
                } else {
                    if (!"exact".equals(string5)) {
                        throw new IllegalArgumentException(C25272.m56409("Unsupported matchMode: ", string5));
                    }
                    i7 = 2;
                }
                c6178.writeByte(i7);
                JSONArray jSONArray = jSONObject.getJSONArray("scopes");
                int i14 = 0;
                for (int i15 = 0; i15 < jSONArray.size(); i15++) {
                    String strAsString = jSONArray.get(i15).asString();
                    if ("zip_entries".equals(strAsString)) {
                        i11 = 1;
                    } else if ("axml".equals(strAsString)) {
                        i11 = 2;
                    } else if ("resource_table_id".equals(strAsString)) {
                        i11 = 4;
                    } else if ("resource_table_name".equals(strAsString)) {
                        i11 = 8;
                    } else if ("resource_table_value".equals(strAsString)) {
                        i11 = 16;
                    } else if ("resource_table_file_path".equals(strAsString)) {
                        i11 = 1024;
                    } else if ("dex_class".equals(strAsString)) {
                        i11 = 32;
                    } else if ("dex_field".equals(strAsString)) {
                        i11 = 64;
                    } else if ("dex_method".equals(strAsString)) {
                        i11 = 128;
                    } else if ("dex_string".equals(strAsString)) {
                        i11 = 256;
                    } else if ("smali".equals(strAsString)) {
                        i11 = 512;
                    } else if ("native_symbol".equals(strAsString)) {
                        i11 = 2048;
                    } else {
                        if (!"native_string".equals(strAsString)) {
                            throw new IllegalArgumentException(C25272.m56409("Unsupported scope: ", strAsString));
                        }
                        i11 = 4096;
                    }
                    i14 |= i11;
                }
                m42762(c6178, i14);
                c6178.writeByte(jSONObject.getBoolean("includeSnippet", false) ? 1 : 0);
                m42762(c6178, jSONObject.getInt("snippetMaxChars", -1));
                c6178.writeByte(jSONObject.getBoolean("explicitScopes", false) ? 1 : 0);
                c6178.writeByte(jSONObject.getBoolean("includeMatchOffsets", false) ? 1 : 0);
                String string6 = jSONObject.getString("zipEntryPrefix", null);
                if (string6 == null) {
                    c6178.writeByte(0);
                } else {
                    c6178.writeByte(1);
                    m42765(c6178, string6);
                }
                String string7 = jSONObject.getString("resourcePrefix", null);
                if (string7 == null) {
                    c6178.writeByte(0);
                } else {
                    c6178.writeByte(1);
                    m42765(c6178, string7);
                }
                String string8 = jSONObject.getString("classPrefixMode", null);
                if ("none".equals(string8)) {
                    i8 = 0;
                } else if ("prefix".equals(string8)) {
                    i8 = 1;
                } else {
                    if (!"descriptorExact".equals(string8)) {
                        throw new IllegalArgumentException(C25272.m56409("Unsupported classPrefixMode: ", string8));
                    }
                    i8 = 2;
                }
                c6178.writeByte(i8);
                if (i8 != 0) {
                    str4 = null;
                    m42765(c6178, jSONObject.getString("classPrefix", null));
                } else {
                    str4 = null;
                }
                String string9 = jSONObject.getString("dexStringResultMode", str4);
                if (Name.LABEL.equals(string9)) {
                    i9 = 1;
                } else {
                    if (!"member".equals(string9)) {
                        throw new IllegalArgumentException(C25272.m56409("Unsupported dex string result mode: ", string9));
                    }
                    i9 = 2;
                }
                c6178.writeByte(i9);
                m42762(c6178, jSONObject2.getInt("scopeIndex", -1));
                m42762(c6178, jSONObject2.getInt("entryIndex", -1));
                m42762(c6178, jSONObject2.getInt("classIndex", -1));
                m42762(c6178, jSONObject2.getInt("memberIndex", -2) + 1);
                m42762(c6178, jSONObject2.getInt("classCharOffset", -1));
                String string10 = jSONObject.getString("target", null);
                if (string10 != null && !string10.isEmpty()) {
                    if ("overview".equals(string10)) {
                        i10 = 1;
                    } else if ("files".equals(string10)) {
                        i10 = 2;
                    } else if ("resource_table_names".equals(string10)) {
                        i10 = 3;
                    } else if ("resource_table_values".equals(string10)) {
                        i10 = 4;
                    } else if ("resource_table_file_paths".equals(string10)) {
                        i10 = 5;
                    } else if ("dex_names".equals(string10)) {
                        i10 = 6;
                    } else if ("dex_strings".equals(string10)) {
                        i10 = 7;
                    } else if ("dex_string_members".equals(string10)) {
                        i10 = 8;
                    } else if ("smali".equals(string10)) {
                        i10 = 9;
                    } else if ("native_symbols".equals(string10)) {
                        i10 = 10;
                    } else {
                        if (!"native_strings".equals(string10)) {
                            throw new IllegalArgumentException("Unsupported search target: ".concat(string10));
                        }
                        i10 = 11;
                    }
                    c6178.writeByte(i10);
                }
                int i16 = jSONObject2.getInt("nativeStringTotalCount", -1);
                if (i16 >= 0) {
                    if (!"native_strings".equals(string10)) {
                        throw new IllegalArgumentException("Native string scan state requires native_strings target");
                    }
                    m42762(c6178, i16);
                    long j = jSONObject2.getLong("nativeStringScanOffset", -1L);
                    c6178.writeByte(j >= 0 ? 1 : 0);
                    if (j >= 0) {
                        m42764(c6178, j);
                    }
                }
            } else if (i2 == 10) {
                String string11 = jSONObject.getString("targetLocator", null);
                int iM42782 = m42781(C4375.m13947(string11));
                if (iM42782 != 4 && iM42782 != 5 && iM42782 != 3) {
                    throw new IllegalArgumentException("Xref cursors are valid only for dex targets");
                }
                c6178.writeByte(iM42782);
                m42763(c6178, iM42782, string11);
                String string12 = jSONObject.getString("methodResolution", null);
                if ("exact".equals(string12)) {
                    i5 = 1;
                } else if ("slot".equals(string12)) {
                    i5 = 2;
                } else if ("dispatch".equals(string12)) {
                    i5 = 3;
                } else {
                    if (!"not_applicable".equals(string12)) {
                        throw new IllegalArgumentException(C25272.m56409("Unsupported xref methodResolution: ", string12));
                    }
                    i5 = 4;
                }
                c6178.writeByte(i5);
                m42762(c6178, jSONObject2.getInt("classIndex", -1));
                m42762(c6178, jSONObject2.getInt("memberIndex", -1));
                m42762(c6178, jSONObject2.getInt("instructionIndex", -1));
            } else if (i2 == 13) {
                String string13 = jSONObject.getString("targetLocator", null);
                int iM42783 = m42781(C4375.m13947(string13));
                if (iM42783 != 6) {
                    throw new IllegalArgumentException("Resource xref cursors are valid only for resource targets");
                }
                m42763(c6178, iM42783, string13);
                JSONArray jSONArray2 = jSONObject.getJSONArray("scopes");
                m42762(c6178, jSONArray2.size());
                for (int i17 = 0; i17 < jSONArray2.size(); i17++) {
                    String strAsString2 = jSONArray2.get(i17).asString();
                    if ("dex".equals(strAsString2)) {
                        i4 = 1;
                    } else if ("axml".equals(strAsString2)) {
                        i4 = 2;
                    } else {
                        if (!"resource_table".equals(strAsString2)) {
                            throw new IllegalArgumentException(C25272.m56409("Unsupported resource xref scope: ", strAsString2));
                        }
                        i4 = 3;
                    }
                    c6178.writeByte(i4);
                }
                m42762(c6178, jSONObject2.getInt("scopeIndex", -1));
                m42762(c6178, jSONObject2.getInt("entryIndex", -1));
                m42762(c6178, jSONObject2.getInt("classIndex", -1));
                m42762(c6178, jSONObject2.getInt("memberIndex", -1));
                m42762(c6178, jSONObject2.getInt("instructionIndex", -1));
                m42762(c6178, jSONObject2.getInt("innerIndex", -1));
            } else {
                if (i2 == 15) {
                    m42765(c6178, jSONObject.getString("locator", null));
                    String string14 = jSONObject.getString("itemKind", null);
                    for (int i18 = 0; i18 < 9; i18++) {
                        if (C10717.f34032[i18].equals(string14)) {
                            c6178.writeByte(i18 + 1);
                            m42765(c6178, jSONObject.getString("namePrefix", null));
                            c6178.writeByte(jSONObject.getBoolean("demangle", false) ? 1 : 0);
                            m42764(c6178, jSONObject.getLong("entrySize", -1L));
                            long j2 = jSONObject.getLong("entryCrc", -1L);
                            if (j2 < 0 || j2 > 4294967295L) {
                                throw new IllegalArgumentException("Invalid native entry CRC");
                            }
                            m42764(c6178, j2);
                            m42762(c6178, jSONObject.getInt("totalCount", -1));
                            m42762(c6178, jSONObject2.getInt("offset", -1));
                        }
                    }
                    throw new IllegalArgumentException(C25272.m56409("Unsupported native itemKind: ", string14));
                }
                if (i2 != 16) {
                    throw new IllegalArgumentException(C25272.m56409("Unsupported cursor type: ", str));
                }
                m42765(c6178, jSONObject.getString("locator", ""));
                m42765(c6178, jSONObject.getString("addressKind", ""));
                m42764(c6178, jSONObject.getLong("address", -1L));
                m42765(c6178, jSONObject.getString("instructionMode", ""));
                String string15 = jSONObject.getString("scanKind", "");
                C11972.m30028(string15);
                m42765(c6178, string15);
                m42765(c6178, jSONObject.getString("resolvedInstructionMode", ""));
                m42764(c6178, jSONObject.getLong("targetVirtualAddress", -1L));
                m42765(c6178, jSONObject.getString("arch", ""));
                m42762(c6178, jSONObject.getInt("bits", -1));
                int i19 = jSONObject.getInt("referenceKindMask", -1);
                C9225.m24407(i19);
                m42762(c6178, i19);
                m42762(c6178, jSONObject.getInt("maxScanBytes", -1));
                long j3 = jSONObject.getLong("entrySize", -1L);
                long j4 = jSONObject.getLong("entryCrc", -1L);
                if (j4 < 0 || j4 > 4294967295L) {
                    throw new IllegalArgumentException("Invalid native entry CRC");
                }
                m42764(c6178, j3);
                m42764(c6178, j4);
                m42762(c6178, jSONObject2.getInt("phaseIndex", -1));
                m42762(c6178, jSONObject2.getInt("rangeIndex", -1));
                m42764(c6178, jSONObject2.getLong("byteOffsetInRange", -1L));
                m42762(c6178, jSONObject2.getInt("relocationIndex", -1));
            }
            c6178.write(m42767(i2, str2, str3, i, c6178.m17808(), c6178.size()), 0, 2);
            return Base64.encodeToString(c6178.m17808(), 0, c6178.size(), 11);
        }
        m42765(c6178, jSONObject.getString("prefix", ""));
        i3 = jSONObject2.getInt("offset", -1);
        m42762(c6178, i3);
        c6178.write(m42767(i2, str2, str3, i, c6178.m17808(), c6178.size()), 0, 2);
        return Base64.encodeToString(c6178.m17808(), 0, c6178.size(), 11);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m42781(String str) {
        if ("zip_entry".equals(str)) {
            return 1;
        }
        if ("axml".equals(str)) {
            return 2;
        }
        if ("dex_class".equals(str)) {
            return 3;
        }
        if ("dex_method".equals(str)) {
            return 4;
        }
        if ("dex_field".equals(str)) {
            return 5;
        }
        if ("resource".equals(str)) {
            return 6;
        }
        throw new IllegalArgumentException(C25272.m56409("Unsupported target kind: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42756(int i) throws C10186 {
        if (i == 20) {
            return "list_entries";
        }
        if (i == 21) {
            return "dex_list_classes";
        }
        if (i == 22) {
            return "resource_list";
        }
        if (i == 18) {
            return "installed_apps";
        }
        if (i == 12) {
            return "available_apks";
        }
        if (i == 6) {
            return "outline_class";
        }
        if (i == 14) {
            return "read";
        }
        if (i == 17) {
            return "java_pseudocode";
        }
        if (i == 8) {
            return "search";
        }
        if (i == 9 || i == 10) {
            return "xref";
        }
        if (i == 13) {
            return "resource_xref";
        }
        if (i == 15) {
            return "native_items";
        }
        if (i == 16) {
            return "native_xref";
        }
        throw m42759((String) null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m42778(int i) throws C10186 {
        if (i == 1) {
            return "exact";
        }
        if (i == 2) {
            return "slot";
        }
        if (i == 3) {
            return "dispatch";
        }
        if (i == 4) {
            return "not_applicable";
        }
        throw m42759((String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42759(String str) {
        return C10186.m26301("Invalid cursor", "nextCursor", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }
}
