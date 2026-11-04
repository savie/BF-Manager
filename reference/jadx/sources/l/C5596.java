package l;

import android.content.Context;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.cb;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۚۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public class C5596 implements InterfaceC4020 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5596 f19421;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Context f19422;

    @Override // l.InterfaceC4020
    public void onAnimationCancel() {
    }

    @Override // l.InterfaceC4020
    /* JADX INFO: renamed from: ۙ */
    public void mo12073() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16567(String str, C10186 c10186) {
        JSONObject jSONObjectObject = JSON.object();
        for (String str2 : m16570(str)) {
            JSONValue jSONValue = c10186.f32602.get(str2);
            str2.getClass();
            boolean zAsBoolean = true;
            boolean zAsBoolean2 = false;
            byte b = -1;
            switch (str2.hashCode()) {
                case -1621907296:
                    if (str2.equals("safeToRetry")) {
                        b = 0;
                    }
                    break;
                case -1492123349:
                    if (str2.equals("failedEditIndex")) {
                        b = 1;
                    }
                    break;
                case -1422939762:
                    if (str2.equals("actual")) {
                        b = 2;
                    }
                    break;
                case -1356028430:
                    if (str2.equals("deletedDirectories")) {
                        b = 3;
                    }
                    break;
                case -732012665:
                    if (str2.equals("totalBytes")) {
                        b = 4;
                    }
                    break;
                case -316096034:
                    if (str2.equals("deletedFiles")) {
                        b = 5;
                    }
                    break;
                case -246218446:
                    if (str2.equals("stateKnown")) {
                        b = 6;
                    }
                    break;
                case -31933575:
                    if (str2.equals("expectedReplacements")) {
                        b = 7;
                    }
                    break;
                case 102976443:
                    if (str2.equals("limit")) {
                        b = 8;
                    }
                    break;
                case 355023498:
                    if (str2.equals("finalLine")) {
                        b = 9;
                    }
                    break;
                case 368036795:
                    if (str2.equals("byteOffset")) {
                        b = 10;
                    }
                    break;
                case 498091095:
                    if (str2.equals("warnings")) {
                        b = 11;
                    }
                    break;
                case 505289462:
                    if (str2.equals("endByteOffset")) {
                        b = 12;
                    }
                    break;
                case 596577671:
                    if (str2.equals("failedPatchIndex")) {
                        b = cb.k;
                    }
                    break;
                case 738943668:
                    if (str2.equals("changed")) {
                        b = cb.f82047l;
                    }
                    break;
                case 1043220472:
                    if (str2.equals("conflictingEditIndex")) {
                        b = 15;
                    }
                    break;
                case 1319996751:
                    if (str2.equals("actualReplacements")) {
                        b = 16;
                    }
                    break;
                case 1623003244:
                    if (str2.equals("finalColumn")) {
                        b = 17;
                    }
                    break;
                case 1882824794:
                    if (str2.equals("conflictingPatchIndex")) {
                        b = 18;
                    }
                    break;
                case 1892700099:
                    if (str2.equals("createdDirectories")) {
                        b = 19;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 14:
                    if (jSONValue != null && jSONValue.isBoolean()) {
                        zAsBoolean2 = jSONValue.asBoolean();
                    }
                    jSONObjectObject.add(str2, zAsBoolean2);
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    if (jSONValue == null || !jSONValue.isNumber()) {
                        jSONValue = JSON.NULL;
                    }
                    jSONObjectObject.add(str2, jSONValue);
                    break;
                case 6:
                    if (jSONValue != null && jSONValue.isBoolean()) {
                        zAsBoolean = jSONValue.asBoolean();
                    }
                    jSONObjectObject.add(str2, zAsBoolean);
                    break;
                case 11:
                    JSONArray jSONArrayArray = JSON.array();
                    if (jSONValue != null && jSONValue.isArray()) {
                        for (JSONValue jSONValue2 : jSONValue.asArray()) {
                            if (jSONValue2.isString()) {
                                jSONArrayArray.add(jSONValue2.asString());
                            }
                        }
                    }
                    jSONObjectObject.add(str2, jSONArrayArray);
                    break;
                default:
                    jSONObjectObject.add(str2, C12556.m31237(jSONValue));
                    break;
            }
        }
        return C15300.m36730(c10186, jSONObjectObject, c10186.f32599);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m16576(String str) {
        String str2;
        String str3;
        String str4;
        JSONObject jSONObjectAdd;
        JSONObject jSONObjectObject = JSON.object();
        for (String str5 : m16570(str)) {
            str5.getClass();
            byte b = -1;
            switch (str5.hashCode()) {
                case -1621907296:
                    if (str5.equals("safeToRetry")) {
                        b = 0;
                    }
                    break;
                case -1492123349:
                    if (str5.equals("failedEditIndex")) {
                        b = 1;
                    }
                    break;
                case -1422939762:
                    if (str5.equals("actual")) {
                        b = 2;
                    }
                    break;
                case -1356028430:
                    if (str5.equals("deletedDirectories")) {
                        b = 3;
                    }
                    break;
                case -1170699495:
                    if (str5.equals("actualTargetVersion")) {
                        b = 4;
                    }
                    break;
                case -732012665:
                    if (str5.equals("totalBytes")) {
                        b = 5;
                    }
                    break;
                case -316096034:
                    if (str5.equals("deletedFiles")) {
                        b = 6;
                    }
                    break;
                case -291790413:
                    if (str5.equals("deepestCreatedPath")) {
                        b = 7;
                    }
                    break;
                case -246218446:
                    if (str5.equals("stateKnown")) {
                        b = 8;
                    }
                    break;
                case -201390188:
                    if (str5.equals("failureStage")) {
                        b = 9;
                    }
                    break;
                case -130866641:
                    if (str5.equals("expectedTargetVersion")) {
                        b = 10;
                    }
                    break;
                case -31933575:
                    if (str5.equals("expectedReplacements")) {
                        b = 11;
                    }
                    break;
                case 3433509:
                    if (str5.equals(MotionUtils.EASING_TYPE_PATH)) {
                        b = 12;
                    }
                    break;
                case 91781034:
                    if (str5.equals("operationMode")) {
                        b = cb.k;
                    }
                    break;
                case 102976443:
                    if (str5.equals("limit")) {
                        b = cb.f82047l;
                    }
                    break;
                case 355023498:
                    if (str5.equals("finalLine")) {
                        b = 15;
                    }
                    break;
                case 368036795:
                    if (str5.equals("byteOffset")) {
                        b = 16;
                    }
                    break;
                case 486480214:
                    if (str5.equals("targetPath")) {
                        b = 17;
                    }
                    break;
                case 498091095:
                    if (str5.equals("warnings")) {
                        b = 18;
                    }
                    break;
                case 505289462:
                    if (str5.equals("endByteOffset")) {
                        b = 19;
                    }
                    break;
                case 528834221:
                    if (str5.equals("actualHex")) {
                        b = 20;
                    }
                    break;
                case 565052930:
                    if (str5.equals("failedPath")) {
                        b = 21;
                    }
                    break;
                case 596577671:
                    if (str5.equals("failedPatchIndex")) {
                        b = 22;
                    }
                    break;
                case 738943668:
                    if (str5.equals("changed")) {
                        b = 23;
                    }
                    break;
                case 1043220472:
                    if (str5.equals("conflictingEditIndex")) {
                        b = 24;
                    }
                    break;
                case 1319996751:
                    if (str5.equals("actualReplacements")) {
                        b = 25;
                    }
                    break;
                case 1529329987:
                    if (str5.equals("expectedHex")) {
                        b = 26;
                    }
                    break;
                case 1623003244:
                    if (str5.equals("finalColumn")) {
                        b = 27;
                    }
                    break;
                case 1882824794:
                    if (str5.equals("conflictingPatchIndex")) {
                        b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                    }
                    break;
                case 1892700099:
                    if (str5.equals("createdDirectories")) {
                        b = 29;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    str2 = "Whether retrying the same requested mutation is safe.";
                    jSONObjectAdd = C10932.m27740(ClassTransform.BOOLEAN, str2);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 1:
                    str3 = "Zero-based index in the input edits array of the rejected text edit, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 2:
                    str3 = "Actual content or item count, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 3:
                    str3 = "Directories confirmed deleted before a failure, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 4:
                    str4 = "Current targetVersion for a version mismatch during reading or writing, or null.";
                    jSONObjectAdd = C10932.m27743("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 5:
                    str3 = "Current file size for a range failure, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 6:
                    str3 = "Files or recognized links confirmed deleted before a failure, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 7:
                    str4 = "Deepest path confirmed created before a failure, or null.";
                    jSONObjectAdd = C10932.m27743("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 8:
                    str2 = "Whether the target final state is known.";
                    jSONObjectAdd = C10932.m27740(ClassTransform.BOOLEAN, str2);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 9:
                    str4 = "Stable mutation stage that failed, or null.";
                    jSONObjectAdd = C10932.m27743("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 10:
                    str4 = "Requested targetVersion for a version mismatch during reading or writing, or null.";
                    jSONObjectAdd = C10932.m27743("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 11:
                    str3 = "Requested selected replacement count when the count check fails; otherwise null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 12:
                    str4 = "Normalized absolute path involved in the failure.";
                    jSONObjectAdd = C10932.m27743("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 13:
                    str4 = "atomic replaces a target in one step; best_effort may leave a changed target after failure; non_atomic may leave partially completed changes. Null when not applicable. Inspect changed and stateKnown before retrying.";
                    jSONObjectAdd = C10932.m27743("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 14:
                    str3 = "Applicable content or item limit, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 15:
                    str3 = "Zero-based logical line at end of file for a text position error; null when unavailable.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 16:
                    str3 = "Rejected byte offset, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 17:
                    str4 = "Normalized absolute second path for a two-path operation.";
                    jSONObjectAdd = C10932.m27743("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 18:
                    jSONObjectAdd = C22121.m50076("type", "array", "description", "Non-fatal cleanup, metadata, or notification degradation.").add("items", C10932.m27740("string", "One warning message."));
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 19:
                    str3 = "Exclusive rejected byte end, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 20:
                    str4 = "Current patch bytes in uppercase hex, or null.";
                    jSONObjectAdd = C10932.m27743("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 21:
                    str4 = "Exact path whose mutation failed, or null.";
                    jSONObjectAdd = C10932.m27743("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 22:
                    str3 = "Zero-based index in the input patches array of the rejected byte patch, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 23:
                    str2 = "Whether the target may already have changed.";
                    jSONObjectAdd = C10932.m27740(ClassTransform.BOOLEAN, str2);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 24:
                    str3 = "Zero-based index in the input edits array of the conflicting text edit, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 25:
                    str3 = "Observed selected replacement count when the count check fails; otherwise null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 26:
                    str4 = "Expected patch bytes in uppercase hex, or null.";
                    jSONObjectAdd = C10932.m27743("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 27:
                    str3 = "Zero-based Unicode code-point column at end of file on finalLine. Reading at (finalLine, finalColumn) returns an empty page; null when unavailable.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 28:
                    str3 = "Zero-based index in the input patches array of the conflicting byte patch, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 29:
                    str3 = "Directory levels confirmed created before a failure, or null.";
                    jSONObjectAdd = C10932.m27743("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown diagnostic field: ".concat(str5));
            }
        }
        return C10932.m27741(C10932.m27731(jSONObjectObject, "Local file failure context for this tool; unavailable values are null."));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m16570(String str) {
        ArrayList arrayList;
        List listUnmodifiableList;
        ArrayList arrayList2;
        int iM9136 = 0;
        Object[] objArr = {MotionUtils.EASING_TYPE_PATH};
        ArrayList arrayList3 = new ArrayList(1);
        Object obj = objArr[0];
        ArrayList arrayList4 = new ArrayList(C24579.m54899(obj, arrayList3, obj, arrayList3));
        byte b = -1;
        switch (str.hashCode()) {
            case -2123511115:
                if (str.equals("mt_file_create_directory")) {
                    b = 0;
                }
                break;
            case -1827097805:
                if (str.equals("mt_file_search")) {
                    b = 1;
                }
                break;
            case -1174937436:
                if (str.equals("mt_file_delete_directory")) {
                    b = 2;
                }
                break;
            case -1070178551:
                if (str.equals("mt_file_patch_bytes")) {
                    b = 3;
                }
                break;
            case -299333417:
                if (str.equals("mt_file_edit_text")) {
                    b = 4;
                }
                break;
            case -207074976:
                if (str.equals("mt_file_write_bytes")) {
                    b = 5;
                }
                break;
            case 250516771:
                if (str.equals("mt_file_replace_text")) {
                    b = 6;
                }
                break;
            case 386458560:
                if (str.equals("mt_file_copy")) {
                    b = 7;
                }
                break;
            case 386721001:
                if (str.equals("mt_file_list")) {
                    b = 8;
                }
                break;
            case 386756636:
                if (str.equals("mt_file_move")) {
                    b = 9;
                }
                break;
            case 386939551:
                if (str.equals("mt_file_stat")) {
                    b = 10;
                }
                break;
            case 453244107:
                if (str.equals("mt_file_read_text")) {
                    b = 11;
                }
                break;
            case 462356615:
                if (str.equals("mt_file_append_text")) {
                    b = 12;
                }
                break;
            case 769908445:
                if (str.equals("mt_file_truncate_bytes")) {
                    b = cb.k;
                }
                break;
            case 1149633677:
                if (str.equals("mt_file_read_bytes")) {
                    b = cb.f82047l;
                }
                break;
            case 1432121425:
                if (str.equals("mt_file_append_bytes")) {
                    b = 15;
                }
                break;
            case 1809273529:
                if (str.equals("mt_file_search_text")) {
                    b = 16;
                }
                break;
            case 2038747958:
                if (str.equals("mt_file_delete")) {
                    b = 17;
                }
                break;
        }
        switch (b) {
            case 0:
                Object[] objArr2 = {"changed", "operationMode", "stateKnown", "warnings", "createdDirectories", "deepestCreatedPath", "failedPath", "failureStage", "safeToRetry"};
                arrayList = new ArrayList(9);
                while (iM9136 < 9) {
                    Object obj2 = objArr2[iM9136];
                    iM9136 = C2764.m9136(obj2, arrayList, obj2, iM9136, 1);
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 1:
            case 8:
            case 10:
            case 16:
                listUnmodifiableList = Collections.EMPTY_LIST;
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 2:
                Object[] objArr3 = {"changed", "operationMode", "stateKnown", "warnings", "deletedFiles", "deletedDirectories", "failedPath", "failureStage", "safeToRetry"};
                arrayList = new ArrayList(9);
                while (iM9136 < 9) {
                    Object obj3 = objArr3[iM9136];
                    iM9136 = C2764.m9136(obj3, arrayList, obj3, iM9136, 1);
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 3:
                String[] strArr = {"targetPath", "changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "failedPatchIndex", "conflictingPatchIndex", "byteOffset", "endByteOffset", "totalBytes", "limit", "actual", "expectedHex", "actualHex"};
                arrayList2 = new ArrayList(16);
                while (iM9136 < 16) {
                    String str2 = strArr[iM9136];
                    C17359.requireNonNull(str2);
                    arrayList2.add(str2);
                    iM9136++;
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList2);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 4:
                String[] strArr2 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "failedEditIndex", "conflictingEditIndex", "limit", "actual"};
                arrayList2 = new ArrayList(11);
                while (iM9136 < 11) {
                    String str3 = strArr2[iM9136];
                    C17359.requireNonNull(str3);
                    arrayList2.add(str3);
                    iM9136++;
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList2);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 5:
                Object[] objArr4 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "limit", "actual"};
                arrayList = new ArrayList(9);
                while (iM9136 < 9) {
                    Object obj4 = objArr4[iM9136];
                    iM9136 = C2764.m9136(obj4, arrayList, obj4, iM9136, 1);
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 6:
                Object[] objArr5 = {"changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "expectedReplacements", "actualReplacements", "limit", "actual"};
                arrayList = new ArrayList(10);
                while (iM9136 < 10) {
                    Object obj5 = objArr5[iM9136];
                    iM9136 = C2764.m9136(obj5, arrayList, obj5, iM9136, 1);
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 7:
                Object[] objArr6 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings"};
                arrayList = new ArrayList(5);
                while (iM9136 < 5) {
                    Object obj6 = objArr6[iM9136];
                    iM9136 = C2764.m9136(obj6, arrayList, obj6, iM9136, 1);
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 9:
                Object[] objArr7 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings"};
                arrayList = new ArrayList(5);
                while (iM9136 < 5) {
                    Object obj7 = objArr7[iM9136];
                    iM9136 = C2764.m9136(obj7, arrayList, obj7, iM9136, 1);
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 11:
                Object[] objArr8 = {"expectedTargetVersion", "actualTargetVersion", "finalLine", "finalColumn"};
                arrayList = new ArrayList(4);
                while (iM9136 < 4) {
                    Object obj8 = objArr8[iM9136];
                    iM9136 = C2764.m9136(obj8, arrayList, obj8, iM9136, 1);
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 12:
            case 13:
            case 15:
                Object[] objArr9 = {"changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "limit", "actual"};
                arrayList = new ArrayList(8);
                while (iM9136 < 8) {
                    Object obj9 = objArr9[iM9136];
                    iM9136 = C2764.m9136(obj9, arrayList, obj9, iM9136, 1);
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 14:
                Object[] objArr10 = {"expectedTargetVersion", "actualTargetVersion", "byteOffset", "totalBytes"};
                arrayList = new ArrayList(4);
                while (iM9136 < 4) {
                    Object obj10 = objArr10[iM9136];
                    iM9136 = C2764.m9136(obj10, arrayList, obj10, iM9136, 1);
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 17:
                Object[] objArr11 = {"changed", "operationMode", "stateKnown", "warnings"};
                arrayList = new ArrayList(4);
                while (iM9136 < 4) {
                    Object obj11 = objArr11[iM9136];
                    iM9136 = C2764.m9136(obj11, arrayList, obj11, iM9136, 1);
                }
                listUnmodifiableList = C4681.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            default:
                throw new IllegalArgumentException("Unknown file tool: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m16572() {
        Context context = f19422;
        if ((context == null ? null : context) == null) {
            return "";
        }
        if (context == null) {
            context = null;
        }
        return context.getPackageName();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Context m16575() {
        Context context = f19422;
        if (context == null) {
            return null;
        }
        return context;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static File m16578() {
        File[] externalFilesDirs;
        Context context = f19422;
        if (context == null) {
            context = null;
        }
        if (context == null) {
            return null;
        }
        try {
            externalFilesDirs = context.getExternalFilesDirs(null);
        } catch (Throwable th) {
            C21587.m49112("openSDK_LOG.Util", "getExternalFilesDirs exception", th);
            externalFilesDirs = null;
        }
        if (externalFilesDirs == null || externalFilesDirs.length <= 0) {
            return null;
        }
        return externalFilesDirs[0];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m16574() {
        if (f19421 == null) {
            f19421 = new C5596();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16571(Context context) {
        f19422 = context;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m16568(int i) {
        return m16569(i, 30257, 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m16577(int i) {
        return m16569(i, 20703, 2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m16573(int i) {
        return m16569(i, 204287, 3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m16569(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(80);
        int i4 = (~i2) & i;
        int i5 = i & i2;
        if ((i5 & 1) != 0) {
            sb.append("|public");
        }
        if ((i5 & 2) != 0) {
            sb.append("|private");
        }
        if ((i5 & 4) != 0) {
            sb.append("|protected");
        }
        if ((i5 & 8) != 0) {
            sb.append("|static");
        }
        if ((i5 & 16) != 0) {
            sb.append("|final");
        }
        if ((i5 & 32) != 0) {
            if (i3 == 1) {
                sb.append("|super");
            } else {
                sb.append("|synchronized");
            }
        }
        if ((i5 & 64) != 0) {
            if (i3 == 3) {
                sb.append("|bridge");
            } else {
                sb.append("|volatile");
            }
        }
        if ((i5 & 128) != 0) {
            if (i3 == 3) {
                sb.append("|varargs");
            } else {
                sb.append("|transient");
            }
        }
        if ((i5 & 256) != 0) {
            sb.append("|native");
        }
        if ((i5 & 512) != 0) {
            sb.append("|interface");
        }
        if ((i5 & 1024) != 0) {
            sb.append("|abstract");
        }
        if ((i5 & 2048) != 0) {
            sb.append("|strictfp");
        }
        if ((i5 & 4096) != 0) {
            sb.append("|synthetic");
        }
        if ((i5 & 8192) != 0) {
            sb.append("|annotation");
        }
        if ((i5 & 16384) != 0) {
            sb.append("|enum");
        }
        if ((65536 & i5) != 0) {
            sb.append("|constructor");
        }
        if ((i5 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            sb.append("|declared_synchronized");
        }
        if (i4 != 0 || sb.length() == 0) {
            sb.append('|');
            sb.append(C5306.m15934(i4));
        }
        return sb.substring(1);
    }
}
