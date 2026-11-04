package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: renamed from: l.۬ܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C13986 {
    /* JADX WARN: Bottom block not found for handler: all -> 0x00ff */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m34075(l.C14732 r16, l.C19208 r17, l.C12495 r18, l.C3374 r19, l.C5256 r20) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13986.m34075(l.ܰܽ۫, l.ᩳܽ۫, l.ۨܽ۫, l.ۗۧܺ, l.ۙ᩻ۧ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.ۡܽ۫] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.֨ܽ۫] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8021 m34074(C14732 c14732, C12495 c12495, C18462 c18462, C9511 c9511, C3374 c3374, C5256 c5256, String str) throws Throwable {
        C24430 c24430 = null;
        try {
            C24430 c24431 = new C24430(c14732.m35417(), c3374);
            try {
                int i = c18462.f60088;
                for (int i2 = 0; i2 < i; i2++) {
                    if (c24431.read() == -1) {
                        throw new IOException("Unexpected end of file while skipping BOM");
                    }
                }
                CharsetDecoder charsetDecoderNewDecoder = c18462.f60087.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                C4292 c4292 = c9511 == 0 ? new C4292() : null;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c24431, charsetDecoderOnUnmappableCharacter));
                    try {
                        C21446 c21446 = new C21446(bufferedReader, c4292);
                        C6530 c6530 = c9511 == 0 ? new C6530() : null;
                        if (c9511 == 0) {
                            c9511 = c6530;
                        }
                        if (c12495.f40122 == 2) {
                            m34077(c21446, c12495, (InterfaceC1309) c9511, c5256);
                        } else {
                            m34078(c21446, c12495, c9511, c5256);
                        }
                        if (c4292 != null) {
                            str = c4292.m13667();
                        }
                        C8021 c8021 = new C8021(c9511.mo4779(), str);
                        bufferedReader.close();
                        c24431.close();
                        return c8021;
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
                c24430 = c24431;
                if (c24430 != null) {
                    c24430.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34077(C21446 c21446, C12495 c12495, InterfaceC1309 interfaceC1309, C5256 c5256) throws IOException {
        int i = c12495.f40121;
        if (i < 1 || i > 999999999) {
            throw new IOException("Text length is invalid");
        }
        if (!c12495.f40117) {
            m34076(c21446, i, interfaceC1309, c5256);
            return;
        }
        int iMin = Math.min(i / 10, 4096);
        if (iMin <= 0) {
            m34076(c21446, i, interfaceC1309, c5256);
            return;
        }
        C2800 c2800 = new C2800(iMin + 1);
        boolean z = false;
        while (true) {
            int i2 = 0;
            while (true) {
                int iM48770 = c21446.m48770();
                if (iM48770 == -1) {
                    if (!z || i2 > 0 || c2800.m9267() > 0) {
                        c2800.m9268(interfaceC1309);
                        interfaceC1309.mo4776();
                        return;
                    }
                    return;
                }
                if (!((C10257) c5256.f18526).mo924()) {
                    c2800.m9264(iM48770);
                    while (c2800.m9267() > iMin) {
                        c2800.m9266(interfaceC1309);
                        i2++;
                    }
                    if (c2800.m9267() + i2 == i) {
                        break;
                    } else {
                        z = true;
                    }
                } else {
                    throw new C0563();
                }
            }
            int iM9263 = c2800.m9263();
            if (iM9263 != -1) {
                c2800.m9265(iM9263 + 1, interfaceC1309);
                interfaceC1309.mo4776();
            } else {
                c2800.m9268(interfaceC1309);
                interfaceC1309.mo4776();
            }
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34076(C21446 c21446, int i, InterfaceC1309 interfaceC1309, C5256 c5256) throws IOException {
        boolean z = false;
        while (true) {
            int i2 = 0;
            do {
                int iM48770 = c21446.m48770();
                if (iM48770 == -1) {
                    if (!z || i2 > 0) {
                        interfaceC1309.mo4776();
                        return;
                    }
                    return;
                }
                if (!((C10257) c5256.f18526).mo924()) {
                    interfaceC1309.mo4777(iM48770);
                    i2++;
                    z = true;
                } else {
                    throw new C0563();
                }
            } while (i2 != i);
            interfaceC1309.mo4776();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m34078(C21446 c21446, C12495 c12495, InterfaceC1309 interfaceC1309, C5256 c5256) throws IOException {
        String strM34073 = m34073(c12495.f40120);
        StringBuilder sb = new StringBuilder(strM34073.length());
        boolean z = false;
        int i = 0;
        while (i < strM34073.length()) {
            char cCharAt = strM34073.charAt(i);
            if (cCharAt == '\r') {
                int i2 = i + 1;
                if (i2 < strM34073.length() && strM34073.charAt(i2) == '\n') {
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
        C7275 c7275 = new C7275(interfaceC1309, c12495);
        C8766 c8766 = new C8766(string, c7275);
        while (true) {
            int iM48769 = c21446.m48769();
            if (iM48769 == -1) {
                c8766.m23461();
                if (!z) {
                    interfaceC1309.mo4776();
                    return;
                } else {
                    c7275.m19915();
                    return;
                }
            }
            if (!((C10257) c5256.f18526).mo924()) {
                c8766.m23462((char) iM48769);
                z = true;
            } else {
                throw new C0563();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34073(String str) {
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
