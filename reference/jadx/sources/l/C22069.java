package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: renamed from: l.᩹ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes.dex */
public final class C22069 {
    /* JADX WARN: Bottom block not found for handler: all -> 0x00ff */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m49006(l.C5758 r16, l.C9287 r17, l.C0113 r18, l.C8516 r19, l.C1188 r20) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22069.m49006(l.ۛۖ֨, l.ۢۖ֨, l.֡ۖ֨, l.۠᩻᩺, l.֨ܳ᩺):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.ܰۚ֨] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.ۙۚ֨] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1524 m49005(C5758 c5758, C0113 c0113, C23398 c23398, C13603 c13603, C8516 c8516, C1188 c1188, String str) throws Throwable {
        C12109 c12109 = null;
        try {
            C12109 c121010 = new C12109(c5758.m15851(), c8516);
            try {
                int i = c23398.f75788;
                for (int i2 = 0; i2 < i; i2++) {
                    if (c121010.read() == -1) {
                        throw new IOException("Unexpected end of file while skipping BOM");
                    }
                }
                CharsetDecoder charsetDecoderNewDecoder = c23398.f75787.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                C17047 c17047 = c13603 == 0 ? new C17047() : null;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c121010, charsetDecoderOnUnmappableCharacter));
                    try {
                        C10698 c10698 = new C10698(bufferedReader, c17047);
                        C16342 c16342 = c13603 == 0 ? new C16342() : null;
                        if (c13603 == 0) {
                            c13603 = c16342;
                        }
                        if (c0113.f1088 == 2) {
                            m49008(c10698, c0113, (InterfaceC4429) c13603, c1188);
                        } else {
                            m49009(c10698, c0113, c13603, c1188);
                        }
                        if (c17047 != null) {
                            str = c17047.m39828();
                        }
                        C1524 c1524 = new C1524(c13603.mo12362(), str);
                        bufferedReader.close();
                        c121010.close();
                        return c1524;
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (CharacterCodingException e) {
                    throw new IOException("Invalid text encoding", e);
                }
            } catch (Throwable th3) {
                th = th3;
                c12109 = c121010;
                if (c12109 != null) {
                    c12109.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49008(C10698 c10698, C0113 c0113, InterfaceC4429 interfaceC4429, C1188 c1188) throws IOException {
        int i = c0113.f1097;
        if (i < 1 || i > 999999999) {
            throw new IOException("Text length is invalid");
        }
        if (!c0113.f1092) {
            m49007(c10698, i, interfaceC4429, c1188);
            return;
        }
        int iMin = Math.min(i / 10, 4096);
        if (iMin <= 0) {
            m49007(c10698, i, interfaceC4429, c1188);
            return;
        }
        C11486 c11486 = new C11486(iMin + 1);
        boolean z = false;
        while (true) {
            int i2 = 0;
            while (true) {
                int iM26905 = c10698.m26905();
                if (iM26905 == -1) {
                    if (!z || i2 > 0 || c11486.m28672() > 0) {
                        c11486.m28673(interfaceC4429);
                        interfaceC4429.mo12358();
                        return;
                    }
                    return;
                }
                if (!((C2935) c1188.f5283).mo2357()) {
                    c11486.m28669(iM26905);
                    while (c11486.m28672() > iMin) {
                        c11486.m28671(interfaceC4429);
                        i2++;
                    }
                    if (c11486.m28672() + i2 == i) {
                        break;
                    } else {
                        z = true;
                    }
                } else {
                    throw new C14226();
                }
            }
            int iM28668 = c11486.m28668();
            if (iM28668 != -1) {
                c11486.m28670(iM28668 + 1, interfaceC4429);
                interfaceC4429.mo12358();
            } else {
                c11486.m28673(interfaceC4429);
                interfaceC4429.mo12358();
            }
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49007(C10698 c10698, int i, InterfaceC4429 interfaceC4429, C1188 c1188) throws IOException {
        boolean z = false;
        while (true) {
            int i2 = 0;
            do {
                int iM26905 = c10698.m26905();
                if (iM26905 == -1) {
                    if (!z || i2 > 0) {
                        interfaceC4429.mo12358();
                        return;
                    }
                    return;
                }
                if (!((C2935) c1188.f5283).mo2357()) {
                    interfaceC4429.mo12360(iM26905);
                    i2++;
                    z = true;
                } else {
                    throw new C14226();
                }
            } while (i2 != i);
            interfaceC4429.mo12358();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m49009(C10698 c10698, C0113 c0113, InterfaceC4429 interfaceC4429, C1188 c1188) throws IOException {
        String strM49004 = m49004(c0113.f1086);
        StringBuilder sb = new StringBuilder(strM49004.length());
        boolean z = false;
        int i = 0;
        while (i < strM49004.length()) {
            char cCharAt = strM49004.charAt(i);
            if (cCharAt == '\r') {
                int i2 = i + 1;
                if (i2 < strM49004.length() && strM49004.charAt(i2) == '\n') {
                    i = i2;
                }
                sb.append('\n');
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            throw new IOException("Separator is empty");
        }
        C5135 c5135 = new C5135(interfaceC4429, c0113);
        C2312 c2312 = new C2312(string, c5135);
        while (true) {
            int iM26904 = c10698.m26904();
            if (iM26904 == -1) {
                c2312.m7054();
                if (!z) {
                    interfaceC4429.mo12358();
                    return;
                } else {
                    c5135.m14291();
                    return;
                }
            }
            if (!((C2935) c1188.f5283).mo2357()) {
                c2312.m7055((char) iM26904);
                z = true;
            } else {
                throw new C14226();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49004(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\\' || (i = i2 + 1) >= str.length()) {
                sb.append(cCharAt);
            } else {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == 'n') {
                    sb.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb.append('\r');
                } else if (cCharAt2 == 't') {
                    sb.append('\t');
                } else if (cCharAt2 == '\\') {
                    sb.append('\\');
                } else {
                    sb.append('\\');
                    sb.append(cCharAt2);
                }
                i2 = i;
            }
            i2++;
        }
        return sb.toString();
    }
}
