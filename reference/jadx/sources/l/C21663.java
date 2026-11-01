package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.᩸ܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21663 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1201 f70254;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2800 f70255;

    public C21663(C2800 c2800, C1201 c1201) {
        this.f70255 = c2800;
        this.f70254 = c1201;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15314 m48397(String str, boolean z, String str2, int i, String str3, C23075 c23075) throws C12731 {
        m48393();
        C14690 c14690M48392 = c23075.f74965.isEmpty() ? null : m48392(c23075.f74965, "namePattern", c23075.f74970, c23075.f74962, false);
        C14690 c14690M48393 = c23075.f74968.isEmpty() ? null : m48392(c23075.f74968, "contentPattern", c23075.f74966, c23075.f74963, true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArrayArray = JSON.array();
        C2612 c2612M4395 = this.f70254.m4395(str, z, str2, i, str3, new C4023(this, c14690M48392, c23075, linkedHashMap, jSONArrayArray, c14690M48393));
        JSONArray jSONArrayArray2 = JSON.array();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONArrayArray2.add(JSON.object().add("reason", (String) entry.getKey()).add("count", ((Integer) entry.getValue()).intValue()));
        }
        return new C15314(c2612M4395, jSONArrayArray2, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48394(JSONArray jSONArray, C5928 c5928, String str) {
        if (jSONArray.size() < 20) {
            jSONArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c5928.m16195().mo33986()).add("reason", str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14690 m48392(String str, String str2, boolean z, boolean z2, boolean z3) throws C12731 {
        int i;
        if (z) {
            i = z3 ? 8 : 0;
        } else {
            i = 16;
        }
        if (!z2) {
            i |= 66;
        }
        try {
            return C14690.m35218(i, str);
        } catch (PatternSyntaxException e) {
            throw C12731.m31626("Invalid regular expression: " + e.getDescription(), str2, JSON.value(str), JSON.array(), JSON.object().add(str2, ""));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48395(LinkedHashMap linkedHashMap, String str) {
        C9735.merge(linkedHashMap, str, 1, new C13582());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48393() {
        if (Thread.currentThread().isInterrupted()) {
            throw C12731.m31627("FILE_SEARCH_CANCELED", "The file search was canceled. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48396(InputStream inputStream, C14690 c14690) throws C12731, IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new C6846(inputStream));
        bufferedInputStream.mark(32768);
        byte[] bArrCopyOf = new byte[32768];
        int i = 0;
        while (i < 32768) {
            int i2 = bufferedInputStream.read(bArrCopyOf, i, 32768 - i);
            if (i2 < 0) {
                break;
            }
            if (i2 == 0) {
                int i3 = bufferedInputStream.read();
                if (i3 < 0) {
                    break;
                }
                bArrCopyOf[i] = (byte) i3;
                i++;
            } else {
                i += i2;
            }
        }
        if (i < 32768) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i);
        }
        C5518 c5518M49942 = C22452.m49942("", bArrCopyOf);
        bufferedInputStream.reset();
        for (int i4 = 0; i4 < c5518M49942.f18939; i4++) {
            if (bufferedInputStream.read() < 0) {
                throw new IOException("File ended inside its BOM.");
            }
        }
        CharsetDecoder charsetDecoderNewDecoder = c5518M49942.f18938.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
        try {
            C18238 c18238 = new C18238(inputStreamReader);
            try {
                boolean zM42385 = c18238.m42385(c14690, new C14021(1), true);
                c18238.close();
                inputStreamReader.close();
                return zM42385;
            } catch (Throwable th) {
                try {
                    c18238.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                inputStreamReader.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
