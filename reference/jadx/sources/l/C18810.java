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
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ᩴܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 879H */
/* JADX INFO: loaded from: classes4.dex */
public final class C18810 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21632 m43393(String str, int i, String str2, String str3) throws C12731 {
        C21632 c21632M43401;
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 11);
            if (bArrDecode.length <= 2) {
                throw m43392((String) null);
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrDecode, bArrDecode.length - 2);
            C17367 c17367 = new C17367(bArrCopyOf);
            if (m43414(c17367) != 3) {
                throw m43392((String) null);
            }
            int iM43414 = m43414(c17367);
            byte[] bArrM43400 = m43400(iM43414, str2, str3, i, bArrCopyOf, bArrCopyOf.length);
            if (bArrDecode[bArrDecode.length - 2] != bArrM43400[0] || bArrDecode[bArrDecode.length - 1] != bArrM43400[1]) {
                throw m43392((String) null);
            }
            int iM43409 = m43409(c17367);
            int iM434010 = m43409(c17367);
            if (iM43409 < 1 || iM434010 < 1 || iM43409 > iM434010) {
                throw m43392((String) null);
            }
            if (iM43414 == 4) {
                c21632M43401 = m43404(c17367);
            } else if (iM43414 == 12) {
                c21632M43401 = m43394(c17367);
            } else if (iM43414 == 6) {
                c21632M43401 = m43413(c17367);
            } else if (iM43414 == 14) {
                c21632M43401 = m43385(c17367);
            } else if (iM43414 == 8) {
                c21632M43401 = m43388(c17367);
            } else if (iM43414 == 9) {
                c21632M43401 = m43410(c17367);
            } else if (iM43414 == 10) {
                c21632M43401 = m43411(c17367);
            } else if (iM43414 == 13) {
                c21632M43401 = m43405(c17367);
            } else if (iM43414 == 15) {
                c21632M43401 = m43387(c17367);
            } else {
                if (iM43414 != 16) {
                    throw m43392((String) null);
                }
                c21632M43401 = m43401(c17367);
            }
            if (c17367.available() != 0) {
                throw m43392((String) null);
            }
            c21632M43401.f70156.add("recommendedLimit", iM43409).add("limitMax", iM434010);
            return new C21632(m43389(iM43414), c21632M43401.f70156, c21632M43401.f70155, iM43409, iM434010);
        } catch (C12731 unused) {
            throw m43392(str);
        } catch (Exception unused2) {
            throw m43392(str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m43407(String str) {
        return C22253.m49424(C22253.m49421().digest(str.getBytes(StandardCharsets.UTF_8)));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C21632 m43404(C17367 c17367) throws C12731 {
        String str;
        int iM43414 = m43414(c17367);
        if (iM43414 == 1) {
            str = "zip_entries";
        } else if (iM43414 == 2) {
            str = "dex_classes";
        } else {
            if (iM43414 != 3) {
                throw m43392((String) null);
            }
            str = "resource_table";
        }
        JSONObject jSONObjectAdd = JSON.object().add("view", str);
        JSONObject jSONObjectObject = JSON.object();
        jSONObjectAdd.add("prefix", m43402(c17367));
        jSONObjectObject.add("offset", m43409(c17367));
        return new C21632(jSONObjectAdd, jSONObjectObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21632 m43394(C17367 c17367) {
        return new C21632(JSON.object().add("prefix", m43402(c17367)), JSON.object().add("offset", m43409(c17367)));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C21632 m43413(C17367 c17367) {
        return new C21632(JSON.object().add("locator", m43402(c17367)), JSON.object().add("memberOffset", m43409(c17367)));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C21632 m43385(C17367 c17367) throws C12731 {
        String str;
        int iM43414 = m43414(c17367);
        String strM43391 = m43391(c17367, iM43414);
        int iM43415 = m43414(c17367);
        if (iM43415 == 1) {
            str = TextBundle.TEXT_ENTRY;
        } else {
            if (iM43415 != 2) {
                throw m43392((String) null);
            }
            str = "hex";
        }
        if (iM43415 == 2 && iM43414 != 1) {
            throw m43392((String) null);
        }
        JSONObject jSONObjectM9603 = C3184.m9603("target", strM43391, "format", str);
        JSONObject jSONObjectObject = JSON.object();
        if (iM43415 == 2) {
            jSONObjectObject.add("hexOffset", m43409(c17367));
        } else if (iM43414 == 6) {
            jSONObjectM9603.add("variant", m43402(c17367)).add("maxValueChars", m43409(c17367)).add("maxValueXmlChars", m43409(c17367)).add("maxItemsPerValue", m43409(c17367)).add("resolveDepth", m43409(c17367));
            jSONObjectObject.add("valueOffset", m43409(c17367));
        } else {
            jSONObjectM9603.add("maxChars", m43409(c17367));
            jSONObjectObject.add("lineOffset", m43409(c17367)).add("lineCharOffset", m43409(c17367));
        }
        return new C21632(jSONObjectM9603, jSONObjectObject);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C21632 m43388(C17367 c17367) throws C12731 {
        String str;
        String str2;
        String strM43402;
        String strM43403;
        String str3;
        String str4;
        JSONObject jSONObjectAdd = JSON.object().add("query", m43402(c17367));
        int iM43414 = m43414(c17367);
        if (iM43414 == 1) {
            str = "literal";
        } else {
            if (iM43414 != 2) {
                throw m43392((String) null);
            }
            str = "regex";
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("queryType", str).add("caseSensitive", m43408(c17367));
        int iM43415 = m43414(c17367);
        if (iM43415 == 1) {
            str2 = "contains";
        } else {
            if (iM43415 != 2) {
                throw m43392((String) null);
            }
            str2 = "exact";
        }
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("matchMode", str2);
        int iM43409 = m43409(c17367);
        if ((iM43409 & (-8192)) != 0 || iM43409 == 0) {
            throw m43392((String) null);
        }
        JSONArray jSONArrayArray = JSON.array();
        m43395(iM43409, 1, jSONArrayArray, "zip_entries");
        m43395(iM43409, 2, jSONArrayArray, "axml");
        m43395(iM43409, 4, jSONArrayArray, "resource_table_id");
        m43395(iM43409, 8, jSONArrayArray, "resource_table_name");
        m43395(iM43409, 16, jSONArrayArray, "resource_table_value");
        m43395(iM43409, 1024, jSONArrayArray, "resource_table_file_path");
        m43395(iM43409, 32, jSONArrayArray, "dex_class");
        m43395(iM43409, 64, jSONArrayArray, "dex_field");
        m43395(iM43409, 128, jSONArrayArray, "dex_method");
        m43395(iM43409, 256, jSONArrayArray, "dex_string");
        String str5 = "smali";
        m43395(iM43409, 512, jSONArrayArray, "smali");
        m43395(iM43409, 2048, jSONArrayArray, "native_symbol");
        m43395(iM43409, 4096, jSONArrayArray, "native_string");
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("scopes", jSONArrayArray).add("includeSnippet", m43408(c17367)).add("snippetMaxChars", m43409(c17367)).add("explicitScopes", m43408(c17367)).add("includeMatchOffsets", m43408(c17367));
        int iM43416 = m43414(c17367);
        if (iM43416 == 0) {
            strM43402 = null;
        } else {
            if (iM43416 != 1) {
                throw m43392((String) null);
            }
            strM43402 = m43402(c17367);
        }
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("zipEntryPrefix", strM43402);
        int iM43417 = m43414(c17367);
        if (iM43417 == 0) {
            strM43403 = null;
        } else {
            if (iM43417 != 1) {
                throw m43392((String) null);
            }
            strM43403 = m43402(c17367);
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("resourcePrefix", strM43403);
        int iM43418 = m43414(c17367);
        if (iM43418 == 0) {
            str3 = "none";
        } else if (iM43418 == 1) {
            str3 = "prefix";
        } else {
            if (iM43418 != 2) {
                throw m43392((String) null);
            }
            str3 = "descriptorExact";
        }
        jSONObjectAdd6.add("classPrefixMode", str3);
        jSONObjectAdd6.add("classPrefix", iM43418 == 0 ? null : m43402(c17367));
        int iM43419 = m43414(c17367);
        if (iM43419 == 1) {
            str4 = Name.LABEL;
        } else {
            if (iM43419 != 2) {
                throw m43392((String) null);
            }
            str4 = "member";
        }
        jSONObjectAdd6.add("dexStringResultMode", str4);
        JSONObject jSONObjectAdd7 = JSON.object().add("scopeIndex", m43409(c17367)).add("entryIndex", m43409(c17367)).add("classIndex", m43409(c17367)).add("memberIndex", m43409(c17367) - 1).add("classCharOffset", m43409(c17367));
        if (c17367.available() > 0) {
            int iM434110 = m43414(c17367);
            if (iM434110 == 1) {
                str5 = "overview";
            } else if (iM434110 == 2) {
                str5 = "files";
            } else if (iM434110 == 3) {
                str5 = "resource_table_names";
            } else if (iM434110 == 4) {
                str5 = "resource_table_values";
            } else if (iM434110 == 5) {
                str5 = "resource_table_file_paths";
            } else if (iM434110 == 6) {
                str5 = "dex_names";
            } else if (iM434110 == 7) {
                str5 = "dex_strings";
            } else if (iM434110 == 8) {
                str5 = "dex_string_members";
            } else if (iM434110 != 9) {
                if (iM434110 == 10) {
                    str5 = "native_symbols";
                } else {
                    if (iM434110 != 11) {
                        throw m43392((String) null);
                    }
                    str5 = "native_strings";
                }
            }
            jSONObjectAdd6.add("target", str5);
        }
        if (c17367.available() > 0) {
            if (!"native_strings".equals(jSONObjectAdd6.getString("target", null))) {
                throw m43392((String) null);
            }
            jSONObjectAdd7.add("nativeStringTotalCount", m43409(c17367)).add("nativeStringScanOffset", m43408(c17367) ? m43412(c17367) : -1L);
        }
        return new C21632(jSONObjectAdd6, jSONObjectAdd7);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C21632 m43410(C17367 c17367) throws C12731 {
        return new C21632(JSON.object().add("targetLocator", m43391(c17367, 4)).add("methodResolution", m43406(m43414(c17367))), JSON.object().add("classIndex", m43409(c17367)).add("memberIndex", m43409(c17367)).add("instructionIndex", m43409(c17367)));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C21632 m43411(C17367 c17367) throws C12731 {
        int iM43414 = m43414(c17367);
        if (iM43414 != 4 && iM43414 != 5 && iM43414 != 3) {
            throw m43392((String) null);
        }
        return new C21632(JSON.object().add("targetLocator", m43391(c17367, iM43414)).add("methodResolution", m43406(m43414(c17367))), JSON.object().add("classIndex", m43409(c17367)).add("memberIndex", m43409(c17367)).add("instructionIndex", m43409(c17367)));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C21632 m43405(C17367 c17367) throws C12731 {
        String str;
        String strM43391 = m43391(c17367, 6);
        int iM43409 = m43409(c17367);
        if (iM43409 <= 0 || iM43409 > 3) {
            throw m43392((String) null);
        }
        JSONArray jSONArrayArray = JSON.array();
        for (int i = 0; i < iM43409; i++) {
            int iM43414 = m43414(c17367);
            if (iM43414 == 1) {
                str = "dex";
            } else if (iM43414 == 2) {
                str = "axml";
            } else {
                if (iM43414 != 3) {
                    throw m43392((String) null);
                }
                str = "resource_table";
            }
            jSONArrayArray.add(str);
        }
        return new C21632(JSON.object().add("targetLocator", strM43391).add("scopes", jSONArrayArray), JSON.object().add("scopeIndex", m43409(c17367)).add("entryIndex", m43409(c17367)).add("classIndex", m43409(c17367)).add("memberIndex", m43409(c17367)).add("instructionIndex", m43409(c17367)).add("innerIndex", m43409(c17367)));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C21632 m43387(C17367 c17367) throws C12731 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m43402(c17367));
        int iM43414 = m43414(c17367);
        if (iM43414 < 1 || iM43414 > 9) {
            throw m43392((String) null);
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("itemKind", C20952.f68286[iM43414 - 1]).add("namePrefix", m43402(c17367)).add("demangle", m43408(c17367));
        long jM43412 = m43412(c17367);
        long jM43413 = m43412(c17367);
        if (jM43413 > 4294967295L) {
            throw m43392((String) null);
        }
        jSONObjectAdd2.add("entrySize", jM43412).add("entryCrc", jM43413).add("totalCount", m43409(c17367));
        return new C21632(jSONObjectAdd2, JSON.object().add("offset", m43409(c17367)));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C21632 m43401(C17367 c17367) throws C12731 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m43402(c17367)).add("addressKind", m43402(c17367)).add("address", m43412(c17367)).add("instructionMode", m43402(c17367));
        String strM43402 = m43402(c17367);
        C17886.m41515(strM43402);
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("scanKind", strM43402).add("resolvedInstructionMode", m43402(c17367)).add("targetVirtualAddress", m43412(c17367)).add("arch", m43402(c17367)).add("bits", m43409(c17367));
        int iM43409 = m43409(c17367);
        C21845.m48623(iM43409);
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("referenceKindMask", iM43409).add("maxScanBytes", m43409(c17367));
        long jM43412 = m43412(c17367);
        long jM43413 = m43412(c17367);
        if (jM43413 > 4294967295L) {
            throw m43392((String) null);
        }
        try {
            C17886.m41514(jSONObjectAdd3.getInt("referenceKindMask", -1), jSONObjectAdd3.getString("scanKind", ""));
            jSONObjectAdd3.add("entrySize", jM43412).add("entryCrc", jM43413);
            return new C21632(jSONObjectAdd3, JSON.object().add("phaseIndex", m43409(c17367)).add("rangeIndex", m43409(c17367)).add("byteOffsetInRange", m43412(c17367)).add("relocationIndex", m43409(c17367)));
        } catch (RuntimeException unused) {
            throw m43392((String) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43397(C11018 c11018, int i, String str) {
        String strM41017 = C17638.m41017(str);
        if (i == 1 || i == 2) {
            m43399(c11018, strM41017);
            return;
        }
        if (i == 3) {
            m43399(c11018, strM41017);
            return;
        }
        if (i == 4) {
            C18104 c18104M43403 = m43403(strM41017);
            m43399(c11018, c18104M43403.f57890);
            m43399(c11018, c18104M43403.f57891);
            return;
        }
        if (i == 5) {
            C18104 c18104M43404 = m43403(strM41017);
            m43399(c11018, c18104M43404.f57890);
            m43399(c11018, c18104M43404.f57891);
        } else {
            if (i != 6) {
                throw new IllegalArgumentException("Unsupported read target");
            }
            if (strM41017 == null || strM41017.length() != 10 || !strM41017.regionMatches(true, 0, "0x", 0, 2)) {
                throw new IllegalArgumentException("Invalid resource key");
            }
            long j = Long.parseLong(strM41017.substring(2), 16);
            if (j >= 0 && j <= 4294967295L) {
                c11018.writeInt((int) j);
                return;
            }
            throw new IllegalArgumentException("Invalid resource key");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43391(C17367 c17367, int i) throws C12731 {
        String str;
        if (i != 1 && i != 2) {
            if (i == 3) {
                return C17638.m41044("dex_class", (String) null, m43402(c17367), (String) null, (String) null, (String) null);
            }
            if (i == 4) {
                return C17638.m41044("dex_method", (String) null, m43402(c17367), m43402(c17367), (String) null, (String) null);
            }
            if (i == 5) {
                return C17638.m41044("dex_field", (String) null, m43402(c17367), (String) null, m43402(c17367), (String) null);
            }
            if (i != 6) {
                throw m43392((String) null);
            }
            if (c17367.available() < 4) {
                throw m43392((String) null);
            }
            return C17638.m41044("resource", (String) null, (String) null, (String) null, (String) null, String.format(Locale.ROOT, "0x%08x", Integer.valueOf(c17367.readInt())));
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
                throw m43392((String) null);
            }
            str = "resource";
        }
        return C17638.m41044(str, m43402(c17367), (String) null, (String) null, (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C18104 m43403(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Missing smali target");
        }
        int iIndexOf = str.indexOf("->");
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf("->")) {
            throw new IllegalArgumentException("Invalid smali target");
        }
        return new C18104(str.substring(0, iIndexOf), str.substring(iIndexOf + 2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43400(int i, String str, String str2, int i2, byte[] bArr, int i3) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            byte[] bytes2 = str2.getBytes(charset);
            C11018 c11018 = new C11018(bytes.length + 8 + bytes2.length + i3);
            c11018.writeByte(i);
            m43396(c11018, bytes.length);
            c11018.write(bytes, 0, bytes.length);
            m43396(c11018, bytes2.length);
            c11018.write(bytes2, 0, bytes2.length);
            m43396(c11018, i2);
            c11018.write(bArr, 0, i3);
            MessageDigest messageDigestM49421 = C22253.m49421();
            messageDigestM49421.update(c11018.m27788(), 0, c11018.size());
            byte[] bArrDigest = messageDigestM49421.digest();
            return new byte[]{bArrDigest[0], bArrDigest[1]};
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43396(C11018 c11018, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative varint");
        }
        while ((i & a.g) != 0) {
            c11018.writeByte((i & 127) | 128);
            i >>>= 7;
        }
        c11018.writeByte(i);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static int m43409(C17367 c17367) throws C12731 {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int iM43414 = m43414(c17367);
            if (i3 == 4 && (iM43414 & 248) != 0) {
                throw m43392((String) null);
            }
            i |= (iM43414 & 127) << i2;
            if ((iM43414 & 128) == 0) {
                return i;
            }
            i2 += 7;
        }
        throw m43392((String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43398(C11018 c11018, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Negative varlong");
        }
        while (((-128) & j) != 0) {
            c11018.writeByte((int) ((127 & j) | 128));
            j >>>= 7;
        }
        c11018.writeByte((int) j);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long m43412(C17367 c17367) throws C12731 {
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            int iM43414 = m43414(c17367);
            j |= ((long) (iM43414 & 127)) << i;
            if ((iM43414 & 128) == 0) {
                return j;
            }
            i += 7;
        }
        throw m43392((String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43399(C11018 c11018, String str) {
        if (str == null) {
            throw new IllegalArgumentException("Missing string");
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        m43396(c11018, bytes.length);
        c11018.write(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m43402(C17367 c17367) throws C12731 {
        int iM43409 = m43409(c17367);
        if (c17367.available() >= iM43409) {
            byte[] bArr = new byte[iM43409];
            c17367.m40446(iM43409, bArr);
            return new String(bArr, StandardCharsets.UTF_8);
        }
        throw m43392((String) null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m43408(C17367 c17367) throws C12731 {
        int iM43414 = m43414(c17367);
        if (iM43414 == 0) {
            return false;
        }
        if (iM43414 == 1) {
            return true;
        }
        throw m43392((String) null);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static int m43414(C17367 c17367) throws C12731 {
        if (c17367.available() <= 0) {
            throw m43392((String) null);
        }
        return c17367.readByte() & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43395(int i, int i2, JSONArray jSONArray, String str) {
        if ((i & i2) != 0) {
            jSONArray.add(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43390(String str, String str2, String str3, int i, JSONObject jSONObject, JSONObject jSONObject2) {
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
        JSONArray jSONArray;
        int i11;
        int i12;
        int i13;
        if ("list".equals(str)) {
            i2 = 4;
        } else if ("available_apks".equals(str)) {
            i2 = 12;
        } else if ("outline_class".equals(str)) {
            i2 = 6;
        } else if ("read".equals(str)) {
            i2 = 14;
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
                throw new IllegalArgumentException("Unsupported cursor type: ".concat(str));
            }
            i2 = 16;
        }
        C11018 c11018 = new C11018(128);
        c11018.writeByte(3);
        c11018.writeByte(i2);
        m43396(c11018, jSONObject.getInt("recommendedLimit", -1));
        m43396(c11018, jSONObject.getInt("limitMax", -1));
        if (i2 == 4) {
            String string = jSONObject.getString("view", null);
            if ("zip_entries".equals(string)) {
                i13 = 1;
            } else if ("dex_classes".equals(string)) {
                i13 = 2;
            } else {
                if (!"resource_table".equals(string)) {
                    throw new IllegalArgumentException(C0252.m1693("Unsupported list view: ", string));
                }
                i13 = 3;
            }
            c11018.writeByte(i13);
            m43399(c11018, jSONObject.getString("prefix", ""));
            m43396(c11018, jSONObject2.getInt("offset", -1));
        } else if (i2 == 12) {
            m43399(c11018, jSONObject.getString("prefix", ""));
            m43396(c11018, jSONObject2.getInt("offset", -1));
        } else {
            if (i2 != 6) {
                if (i2 == 14) {
                    String string2 = jSONObject.getString("target", null);
                    int iM43386 = m43386(C17638.m41108(string2));
                    String string3 = jSONObject.getString("format", TextBundle.TEXT_ENTRY);
                    if (TextBundle.TEXT_ENTRY.equals(string3)) {
                        i12 = 1;
                    } else {
                        if (!"hex".equals(string3)) {
                            throw new IllegalArgumentException(C0252.m1693("Unsupported read format: ", string3));
                        }
                        i12 = 2;
                    }
                    if (i12 == 2 && iM43386 != 1) {
                        throw new IllegalArgumentException("Byte read cursors are valid only for zip_entry targets");
                    }
                    c11018.writeByte(iM43386);
                    m43397(c11018, iM43386, string2);
                    c11018.writeByte(i12);
                    if (i12 == 2) {
                        m43396(c11018, jSONObject2.getInt("hexOffset", -1));
                    } else if (iM43386 == 6) {
                        m43399(c11018, jSONObject.getString("variant", null));
                        m43396(c11018, jSONObject.getInt("maxValueChars", -1));
                        m43396(c11018, jSONObject.getInt("maxValueXmlChars", 32768));
                        m43396(c11018, jSONObject.getInt("maxItemsPerValue", -1));
                        m43396(c11018, jSONObject.getInt("resolveDepth", -1));
                        m43396(c11018, jSONObject2.getInt("valueOffset", -1));
                    } else {
                        m43396(c11018, jSONObject.getInt("maxChars", -1));
                        m43396(c11018, jSONObject2.getInt("lineOffset", -1));
                        m43396(c11018, jSONObject2.getInt("lineCharOffset", -1));
                    }
                } else if (i2 == 8) {
                    m43399(c11018, jSONObject.getString("query", null));
                    String string4 = jSONObject.getString("queryType", null);
                    if ("literal".equals(string4)) {
                        i6 = 1;
                    } else {
                        if (!"regex".equals(string4)) {
                            throw new IllegalArgumentException(C0252.m1693("Unsupported queryType: ", string4));
                        }
                        i6 = 2;
                    }
                    c11018.writeByte(i6);
                    c11018.writeByte(jSONObject.getBoolean("caseSensitive", false) ? 1 : 0);
                    String string5 = jSONObject.getString("matchMode", null);
                    if ("contains".equals(string5)) {
                        i7 = 1;
                    } else {
                        if (!"exact".equals(string5)) {
                            throw new IllegalArgumentException(C0252.m1693("Unsupported matchMode: ", string5));
                        }
                        i7 = 2;
                    }
                    c11018.writeByte(i7);
                    JSONArray jSONArray2 = jSONObject.getJSONArray("scopes");
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        int i16 = i2;
                        if (i14 >= jSONArray2.size()) {
                            m43396(c11018, i15);
                            c11018.writeByte(jSONObject.getBoolean("includeSnippet", false) ? 1 : 0);
                            m43396(c11018, jSONObject.getInt("snippetMaxChars", -1));
                            c11018.writeByte(jSONObject.getBoolean("explicitScopes", false) ? 1 : 0);
                            c11018.writeByte(jSONObject.getBoolean("includeMatchOffsets", false) ? 1 : 0);
                            String string6 = jSONObject.getString("zipEntryPrefix", null);
                            if (string6 == null) {
                                c11018.writeByte(0);
                            } else {
                                c11018.writeByte(1);
                                m43399(c11018, string6);
                            }
                            String string7 = jSONObject.getString("resourcePrefix", null);
                            if (string7 == null) {
                                c11018.writeByte(0);
                            } else {
                                c11018.writeByte(1);
                                m43399(c11018, string7);
                            }
                            String string8 = jSONObject.getString("classPrefixMode", null);
                            if ("none".equals(string8)) {
                                i8 = 0;
                            } else if ("prefix".equals(string8)) {
                                i8 = 1;
                            } else {
                                if (!"descriptorExact".equals(string8)) {
                                    throw new IllegalArgumentException(C0252.m1693("Unsupported classPrefixMode: ", string8));
                                }
                                i8 = 2;
                            }
                            c11018.writeByte(i8);
                            if (i8 != 0) {
                                str4 = null;
                                m43399(c11018, jSONObject.getString("classPrefix", null));
                            } else {
                                str4 = null;
                            }
                            String string9 = jSONObject.getString("dexStringResultMode", str4);
                            if (Name.LABEL.equals(string9)) {
                                i9 = 1;
                            } else {
                                if (!"member".equals(string9)) {
                                    throw new IllegalArgumentException(C0252.m1693("Unsupported dex string result mode: ", string9));
                                }
                                i9 = 2;
                            }
                            c11018.writeByte(i9);
                            m43396(c11018, jSONObject2.getInt("scopeIndex", -1));
                            m43396(c11018, jSONObject2.getInt("entryIndex", -1));
                            m43396(c11018, jSONObject2.getInt("classIndex", -1));
                            m43396(c11018, jSONObject2.getInt("memberIndex", -2) + 1);
                            m43396(c11018, jSONObject2.getInt("classCharOffset", -1));
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
                                c11018.writeByte(i10);
                            }
                            int i17 = jSONObject2.getInt("nativeStringTotalCount", -1);
                            if (i17 >= 0) {
                                if (!"native_strings".equals(string10)) {
                                    throw new IllegalArgumentException("Native string scan state requires native_strings target");
                                }
                                m43396(c11018, i17);
                                long j = jSONObject2.getLong("nativeStringScanOffset", -1L);
                                c11018.writeByte(j >= 0 ? 1 : 0);
                                if (j >= 0) {
                                    m43398(c11018, j);
                                }
                            }
                            i3 = i16;
                            break;
                        }
                        String strAsString = jSONArray2.get(i14).asString();
                        if ("zip_entries".equals(strAsString)) {
                            i11 = 1;
                        } else {
                            if ("axml".equals(strAsString)) {
                                i11 = 2;
                            } else {
                                jSONArray = jSONArray2;
                                if ("resource_table_id".equals(strAsString)) {
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
                                        throw new IllegalArgumentException(C0252.m1693("Unsupported scope: ", strAsString));
                                    }
                                    i11 = 4096;
                                }
                            }
                            i15 |= i11;
                            i14++;
                            jSONArray2 = jSONArray;
                            i2 = i16;
                        }
                        jSONArray = jSONArray2;
                        i15 |= i11;
                        i14++;
                        jSONArray2 = jSONArray;
                        i2 = i16;
                    }
                } else {
                    i3 = i2;
                    if (i3 == 10) {
                        String string11 = jSONObject.getString("targetLocator", null);
                        int iM43387 = m43386(C17638.m41108(string11));
                        if (iM43387 != 4 && iM43387 != 5 && iM43387 != 3) {
                            throw new IllegalArgumentException("Xref cursors are valid only for dex targets");
                        }
                        c11018.writeByte(iM43387);
                        m43397(c11018, iM43387, string11);
                        String string12 = jSONObject.getString("methodResolution", null);
                        if ("exact".equals(string12)) {
                            i5 = 1;
                        } else if ("slot".equals(string12)) {
                            i5 = 2;
                        } else if ("dispatch".equals(string12)) {
                            i5 = 3;
                        } else {
                            if (!"not_applicable".equals(string12)) {
                                throw new IllegalArgumentException(C0252.m1693("Unsupported xref methodResolution: ", string12));
                            }
                            i5 = 4;
                        }
                        c11018.writeByte(i5);
                        m43396(c11018, jSONObject2.getInt("classIndex", -1));
                        m43396(c11018, jSONObject2.getInt("memberIndex", -1));
                        m43396(c11018, jSONObject2.getInt("instructionIndex", -1));
                    } else if (i3 == 13) {
                        String string13 = jSONObject.getString("targetLocator", null);
                        int iM43388 = m43386(C17638.m41108(string13));
                        if (iM43388 != 6) {
                            throw new IllegalArgumentException("Resource xref cursors are valid only for resource targets");
                        }
                        m43397(c11018, iM43388, string13);
                        JSONArray jSONArray3 = jSONObject.getJSONArray("scopes");
                        m43396(c11018, jSONArray3.size());
                        for (int i18 = 0; i18 < jSONArray3.size(); i18++) {
                            String strAsString2 = jSONArray3.get(i18).asString();
                            if ("dex".equals(strAsString2)) {
                                i4 = 1;
                            } else if ("axml".equals(strAsString2)) {
                                i4 = 2;
                            } else {
                                if (!"resource_table".equals(strAsString2)) {
                                    throw new IllegalArgumentException(C0252.m1693("Unsupported resource xref scope: ", strAsString2));
                                }
                                i4 = 3;
                            }
                            c11018.writeByte(i4);
                        }
                        m43396(c11018, jSONObject2.getInt("scopeIndex", -1));
                        m43396(c11018, jSONObject2.getInt("entryIndex", -1));
                        m43396(c11018, jSONObject2.getInt("classIndex", -1));
                        m43396(c11018, jSONObject2.getInt("memberIndex", -1));
                        m43396(c11018, jSONObject2.getInt("instructionIndex", -1));
                        m43396(c11018, jSONObject2.getInt("innerIndex", -1));
                    } else {
                        if (i3 == 15) {
                            m43399(c11018, jSONObject.getString("locator", null));
                            String string14 = jSONObject.getString("itemKind", null);
                            for (int i19 = 0; i19 < 9; i19++) {
                                if (C20952.f68286[i19].equals(string14)) {
                                    c11018.writeByte(i19 + 1);
                                    m43399(c11018, jSONObject.getString("namePrefix", null));
                                    c11018.writeByte(jSONObject.getBoolean("demangle", false) ? 1 : 0);
                                    m43398(c11018, jSONObject.getLong("entrySize", -1L));
                                    long j2 = jSONObject.getLong("entryCrc", -1L);
                                    if (j2 < 0 || j2 > 4294967295L) {
                                        throw new IllegalArgumentException("Invalid native entry CRC");
                                    }
                                    m43398(c11018, j2);
                                    m43396(c11018, jSONObject.getInt("totalCount", -1));
                                    m43396(c11018, jSONObject2.getInt("offset", -1));
                                }
                            }
                            throw new IllegalArgumentException(C0252.m1693("Unsupported native itemKind: ", string14));
                        }
                        if (i3 != 16) {
                            throw new IllegalArgumentException("Unsupported cursor type: ".concat(str));
                        }
                        m43399(c11018, jSONObject.getString("locator", ""));
                        m43399(c11018, jSONObject.getString("addressKind", ""));
                        m43398(c11018, jSONObject.getLong("address", -1L));
                        m43399(c11018, jSONObject.getString("instructionMode", ""));
                        String string15 = jSONObject.getString("scanKind", "");
                        C17886.m41515(string15);
                        m43399(c11018, string15);
                        m43399(c11018, jSONObject.getString("resolvedInstructionMode", ""));
                        m43398(c11018, jSONObject.getLong("targetVirtualAddress", -1L));
                        m43399(c11018, jSONObject.getString("arch", ""));
                        m43396(c11018, jSONObject.getInt("bits", -1));
                        int i20 = jSONObject.getInt("referenceKindMask", -1);
                        C21845.m48623(i20);
                        m43396(c11018, i20);
                        m43396(c11018, jSONObject.getInt("maxScanBytes", -1));
                        long j3 = jSONObject.getLong("entrySize", -1L);
                        long j4 = jSONObject.getLong("entryCrc", -1L);
                        if (j4 < 0 || j4 > 4294967295L) {
                            throw new IllegalArgumentException("Invalid native entry CRC");
                        }
                        m43398(c11018, j3);
                        m43398(c11018, j4);
                        m43396(c11018, jSONObject2.getInt("phaseIndex", -1));
                        m43396(c11018, jSONObject2.getInt("rangeIndex", -1));
                        m43398(c11018, jSONObject2.getLong("byteOffsetInRange", -1L));
                        m43396(c11018, jSONObject2.getInt("relocationIndex", -1));
                    }
                }
                c11018.write(m43400(i3, str2, str3, i, c11018.m27788(), c11018.size()), 0, 2);
                return Base64.encodeToString(c11018.m27788(), 0, c11018.size(), 11);
            }
            m43399(c11018, jSONObject.getString("locator", null));
            m43396(c11018, jSONObject2.getInt("memberOffset", -1));
        }
        i3 = i2;
        c11018.write(m43400(i3, str2, str3, i, c11018.m27788(), c11018.size()), 0, 2);
        return Base64.encodeToString(c11018.m27788(), 0, c11018.size(), 11);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m43386(String str) {
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
        throw new IllegalArgumentException(C0252.m1693("Unsupported target kind: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43389(int i) throws C12731 {
        if (i == 4) {
            return "list";
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
        throw m43392((String) null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m43406(int i) throws C12731 {
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
        throw m43392((String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m43392(String str) {
        return C12731.m31626("Invalid cursor", "nextCursor", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }
}
