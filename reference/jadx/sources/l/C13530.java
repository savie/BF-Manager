package l;

import android.text.TextUtils;
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B3F */
/* JADX INFO: loaded from: classes3.dex */
public final class C13530 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SoftReference f44668;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static SoftReference f44669;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int m33056(int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        int i4 = 0;
        while (true) {
            int i5 = i2;
            int i6 = i;
            i = i5;
            if (!z) {
                return i4;
            }
            z = (i == i3 && (i & 1) == ((i6 >> 6) & 1)) ? false : true;
            i2 = i >> 7;
            i4++;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static int m33072(int i) {
        int i2 = i >>> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>>= 7;
            i3++;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static synchronized C5062 m33070() {
        C5062 c5062;
        SoftReference softReference = f44669;
        if (softReference != null && (c5062 = (C5062) softReference.get()) != null) {
            return c5062;
        }
        C5062 c5063 = new C5062(m33074());
        f44669 = new SoftReference(c5063);
        return c5063;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized C1493 m33074() {
        C1493 c1493;
        SoftReference softReference = f44668;
        if (softReference != null && (c1493 = (C1493) softReference.get()) != null) {
            return c1493;
        }
        try {
            C1493 c1494 = new C1493(C7291.m19433("/assets/1"));
            f44668 = new SoftReference(c1494);
            return c1494;
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Class m33062(InterfaceC10643 interfaceC10643) {
        C13465.m32966(interfaceC10643, "<this>");
        Class clsMo6762 = ((InterfaceC6282) interfaceC10643).mo6762();
        if (!clsMo6762.isPrimitive()) {
            return clsMo6762;
        }
        String name = clsMo6762.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals(ClassTransform.DOUBLE) ? clsMo6762 : Double.class;
            case 104431:
                return !name.equals(ClassTransform.INTEGER) ? clsMo6762 : Integer.class;
            case 3039496:
                return !name.equals(ClassTransform.BYTE) ? clsMo6762 : Byte.class;
            case 3052374:
                return !name.equals(ClassTransform.CHARACTER) ? clsMo6762 : Character.class;
            case 3327612:
                return !name.equals(ClassTransform.LONG) ? clsMo6762 : Long.class;
            case 3625364:
                return !name.equals(ClassTransform.VOID) ? clsMo6762 : Void.class;
            case 64711720:
                return !name.equals(ClassTransform.BOOLEAN) ? clsMo6762 : Boolean.class;
            case 97526364:
                return !name.equals(ClassTransform.FLOAT) ? clsMo6762 : Float.class;
            case 109413500:
                return !name.equals(ClassTransform.SHORT) ? clsMo6762 : Short.class;
            default:
                return clsMo6762;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33066(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            return Arrays.equals((Object[]) obj, (Object[]) obj2);
        }
        if (!(obj instanceof CharSequence) || !(obj2 instanceof CharSequence)) {
            return obj.equals(obj2);
        }
        return TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static JSONObject m33076() {
        return C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "mt_apk_workspace_open.path value. Use mt://current-apk for the current APK, data.items[i].path (mt://workspace/<workspaceId>) returned by mt_apk_workspace_list with temporary=false to reopen an existing non-temporary workspace, data.items[i].path returned by mt_apk_list_available_apks, an allowed absolute APK path, or a path already present in nextActions[].arguments. File URIs and other URI schemes are not accepted.")), ClassTransform.BOOLEAN, "Set true for one-time generated, candidate, comparison, or diagnostic APK workspaces that may be inspected, edited, built, then deleted as a whole. Set false when the same workspace may need to be reused, reopened, kept long-term, or revisited later.", "temporary", "Arguments for mt_apk_workspace_open.");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static JSONObject m33058() {
        return C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id to inspect; empty string reads the base workspace.")).add("view", C4969.m13786("string", "List view.")).add("prefix", C4969.m13786("string", "Prefix filter.")), "integer", "Page size.", "limit", "Arguments for mt_apk_list.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33065(EnumC10297 enumC10297, EnumC18057 enumC18057) {
        if (enumC10297.f35328 != enumC18057) {
            throw new IllegalArgumentException(C7997.m21055("Invalid opcode ", enumC10297.f35326, " for ", enumC18057.name()));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m33071(int i) {
        if ((i & (-16)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v15, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static JSONObject m33057() {
        return C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id to inspect; empty string reads the base workspace.")).add("locator", C4969.m13786("string", "Exact dex_class locator such as dex_class:Lcom/example/Foo;. Copy the full locator; Java names such as com.example.Foo are invalid.")), "integer", "Maximum fields plus methods.", "limit", "Arguments for mt_apk_dex_read_class_outline.");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33075(int i) {
        if ((i & (-256)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v255, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static JSONObject m33069() {
        return C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id to inspect; empty string reads the base workspace.")).add("locator", C4969.m13786("string", "Text locator.")).add("limit", C4969.m13786("integer", "Line limit.")).add("maxChars", C4969.m13786("integer", "Maximum returned text characters.")).add("startLine", C4969.m13786("integer", "0-based first line within this read target; dex_method and dex_field use member-relative lines. Smali .line N directives are original Java source debug lines, not read_text positions. edit_text does not accept line coordinates.")), "integer", "0-based code point column within startLine.", "startColumn", "Arguments for mt_apk_read_text.");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m33077(int i) {
        if (((-65536) & i) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v65535, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static JSONObject m33073() {
        return C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id to inspect; empty string reads the base workspace.")).add("locator", C4969.m13786("string", "ZIP entry locator.")).add("byteOffset", C4969.m13786("integer", "Byte offset.")), "integer", "Maximum bytes.", "maxBytes", "Arguments for mt_apk_read_bytes.");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static JSONObject m33060() {
        return C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id to inspect; empty string reads the base workspace.")).add("reads", C3184.m9603("type", "array", "description", "Resource reads. Runtime accepts 1..200 items.").add("items", C18828.m43457(JSON.object().add("locator", C4969.m13786("string", "Resource locator string such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.")), "string", "Exact public resource variant to read, such as default; not wildcard *.", "variant", "One resource value read."))).add("maxValueChars", C4969.m13786("integer", "Maximum chars per decoded value summary; suggested value is 4096.")).add("maxValueXmlChars", C4969.m13786("integer", "Maximum chars for complete valueXml; suggested value is 32768.")).add("maxItemsPerValue", C4969.m13786("integer", "Maximum item_list children per top-level value; suggested value is 50.")), "integer", "Reference summary depth; suggested value is 0, allowed values are 0 or 1.", "resolveDepth", "Arguments for mt_apk_resource_read.");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m33068(int i) {
        if (i < -32768 || i > 32767) {
            throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -32768 and 32767, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static JSONObject m33067() {
        return C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C4969.m13786("string", "ZIP entry locator for the native ELF.")).add("addressKind", C4969.m13784("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C4969.m13786("string", "Unsigned address string to pass as mt_apk_native_disassemble.address. Interpret it using this action's addressKind, and copy both values unchanged.")).add("instructionMode", C4969.m13784("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("stopAtSymbolBoundary", C4969.m13786(ClassTransform.BOOLEAN, "Whether to stop at the containing best-effort sized ELF symbol boundary when available.")).add("maxBytes", C4969.m13786("integer", "Maximum bytes to read for this instruction window.")), "integer", "Maximum instructions to include in disassemblyText.", "maxInstructions", "Arguments for mt_apk_native_disassemble.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33063(int i) {
        if (i < 0 || i > 5) {
            throw new IllegalArgumentException(String.format("Invalid register count: %d. Must be between 0 and 5, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m33059(int i) {
        if ((i & (-256)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register count: %d. Must be between 0 and 255, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33064(int i, int i2) {
        if (i > i2) {
            if (i2 == 0) {
                throw new IllegalArgumentException(String.format("Invalid value_arg value %d for an encoded_value. Expecting 0", Integer.valueOf(i)));
            }
            throw new IllegalArgumentException(String.format("Invalid value_arg value %d for an encoded_value. Expecting 0..%d, inclusive", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m33061() {
        return C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Copy nextActions[0].arguments.workspaceId, or use data.workspaceId from the result that produced data.pagination.nextCursor. For mt_apk_list_available_apks continuation, use \"available_apks\".")).add("editSessionId", C4969.m13786("string", "Copy nextActions[0].arguments.editSessionId, or use data.editSessionId from the result that produced data.pagination.nextCursor. Empty string means the base APK or mt_apk_list_available_apks continuation.")).add("nextCursor", C4969.m13786("string", "Copy nextActions[0].arguments.nextCursor or data.pagination.nextCursor unchanged. Do not parse or modify the cursor.")), "integer", "Copy limit from the matching continuation action; see mt_apk_continue.limit for allowed adjustments.", "limit", "Arguments for mt_apk_continue.");
    }
}
