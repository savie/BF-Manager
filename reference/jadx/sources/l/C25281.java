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

/* JADX INFO: renamed from: l.᩻᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes.dex */
public final class C25281 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23043 f81666;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22209 f81667;

    public C25281(C22209 c22209, C23043 c23043) {
        this.f81667 = c22209;
        this.f81666 = c23043;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11854 m56462(String str, boolean z, String str2, int i, String str3, C2160 c2160) throws C10186 {
        m56458();
        C18415 c18415M56456 = c2160.f7121.isEmpty() ? null : m56456(c2160.f7121, "namePattern", c2160.f7127, c2160.f7117, false);
        C18415 c18415M56457 = c2160.f7125.isEmpty() ? null : m56456(c2160.f7125, "contentPattern", c2160.f7120, c2160.f7118, true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArrayArray = JSON.array();
        C5143 c5143M51949 = this.f81666.m51949(str, z, str2, i, str3, new C13346(this, c18415M56456, c2160, linkedHashMap, jSONArrayArray, c18415M56457));
        JSONArray jSONArrayArray2 = JSON.array();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONArrayArray2.add(JSON.object().add("reason", (String) entry.getKey()).add("count", ((Integer) entry.getValue()).intValue()));
        }
        return new C11854(c5143M51949, jSONArrayArray2, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56459(JSONArray jSONArray, C1907 c1907, String str) {
        if (jSONArray.size() < 20) {
            jSONArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c1907.m6565().mo4294()).add("reason", str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18415 m56456(String str, String str2, boolean z, boolean z2, boolean z3) throws C10186 {
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
            return C18415.m42924(i, str);
        } catch (PatternSyntaxException e) {
            throw C10186.m26301("Invalid regular expression: " + e.getDescription(), str2, JSON.value(str), JSON.array(), JSON.object().add(str2, ""));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56460(LinkedHashMap linkedHashMap, String str) {
        C11392.merge(linkedHashMap, str, 1, new C10828());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56458() {
        if (Thread.currentThread().isInterrupted()) {
            throw C10186.m26302("FILE_SEARCH_CANCELED", "The file search was canceled. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56461(InputStream inputStream, C18415 c18415) throws C10186, IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new C5889(inputStream));
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
        C10495 c10495M50579 = C22430.m50579("", bArrCopyOf);
        bufferedInputStream.reset();
        for (int i4 = 0; i4 < c10495M50579.f33394; i4++) {
            if (bufferedInputStream.read() < 0) {
                throw new IOException("File ended inside its BOM.");
            }
        }
        CharsetDecoder charsetDecoderNewDecoder = c10495M50579.f33393.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
        try {
            C5957 c5957 = new C5957(inputStreamReader);
            try {
                boolean zM17336 = c5957.m17336(C15407.m36883(c18415, c5957), new C15583(), true);
                c5957.close();
                inputStreamReader.close();
                return zM17336;
            } catch (Throwable th) {
                try {
                    c5957.close();
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
