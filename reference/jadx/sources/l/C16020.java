package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16020 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Set f51847;

    static {
        String[] strArr = {"utf-8", "utf-16be", "utf-16le", "utf-32be", "utf-32le", "gb2312", "gb18030", "gbk", "big5", "big5-hkscs", "cesu-8", "euc-jp", "euc-kr", "ibm866", "ibm850", "iso-8859-1", "iso-8859-2", "iso-8859-3", "iso-8859-4", "iso-8859-5", "iso-8859-6", "iso-8859-7", "iso-8859-8", "iso-8859-9", "iso-8859-10", "iso-8859-13", "iso-8859-14", "iso-8859-15", "koi8-r", "koi8-u", "shiftjis", "windows-1250", "windows-1251", "windows-1252", "windows-1253", "windows-1254", "windows-1255", "windows-1256", "windows-1257", "windows-1258"};
        HashSet hashSet = new HashSet(40);
        for (int i = 0; i < 40; i++) {
            String str = strArr[i];
            C13638.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f51847 = C0561.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37993(String str) throws C12731 {
        if (str.endsWith("-bom")) {
            str = C20630.m46498(4, 0, str);
        }
        if (f51847.contains(str)) {
            return str;
        }
        throw C12731.m31627("FILE_APPEND_ENCODING_UNSUPPORTED", "This encoding does not support independent text append. ISO-2022 encodings are not supported.", "warning", (JSONArray) null, JSON.object());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37996(InputStream inputStream, BufferedOutputStream bufferedOutputStream, long j, boolean z) throws C12731, IOException {
        byte[] bArr = new byte[65536];
        while (true) {
            int i = -1;
            if (j > 0) {
                m37995();
                int i2 = inputStream.read(bArr, 0, (int) Math.min(65536, j));
                if (i2 != 0) {
                    i = i2;
                } else {
                    int i3 = inputStream.read();
                    if (i3 >= 0) {
                        bArr[0] = (byte) i3;
                        i = 1;
                    }
                }
                if (i < 0) {
                    throw new IOException("Source ended before its expected size");
                }
                bufferedOutputStream.write(bArr, 0, i);
                j -= (long) i;
            } else {
                m37995();
                if (z && inputStream.read() != -1) {
                    throw new IOException("Source grew during append");
                }
                m37995();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20958 m37994(InputStream inputStream, OutputStream outputStream, long j, C5518 c5518, byte[] bArr) throws C12731, IOException {
        char[] cArr;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(new C7552(inputStream, j, outputStream), 4);
        byte[] bArr2 = new byte[4];
        int i = 0;
        while (i < 4) {
            int i2 = pushbackInputStream.read(bArr2, i, 4 - i);
            if (i2 < 0) {
                break;
            }
            i += i2;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, i);
        if (!c5518.m15221(bArrCopyOf)) {
            throw C12731.m31627("FILE_TEXT_ENCODING_MISMATCH", "Copy the current file's encoding including its physical BOM.", "warning", (JSONArray) null, JSON.object());
        }
        int iMin = Math.min(bArr.length, 4 - i);
        System.arraycopy(bArr, 0, bArr2, i, iMin);
        if (!c5518.m15221(Arrays.copyOf(bArr2, iMin + i))) {
            throw C12731.m31627("FILE_TEXT_ENCODING_MISMATCH", "Appending this text would change the physical BOM. Adjust writeText to preserve it.", "warning", (JSONArray) null, JSON.object());
        }
        int i3 = c5518.f18939;
        pushbackInputStream.unread(bArrCopyOf, i3, i - i3);
        CharsetDecoder charsetDecoderNewDecoder = c5518.f18938.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        InputStreamReader inputStreamReader = new InputStreamReader(pushbackInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
        char[] cArr2 = new char[8192];
        long j2 = 0;
        long j3 = 0;
        boolean zIsHighSurrogate = false;
        boolean z = false;
        long j4 = 0;
        long j5 = 0;
        while (true) {
            int i4 = inputStreamReader.read(cArr2);
            if (i4 == -1) {
                if (!zIsHighSurrogate) {
                    m37995();
                    outputStream.write(bArr);
                    m37995();
                    return new C20958(j2, j3);
                }
                throw new CharacterCodingException();
            }
            m37995();
            int i5 = 0;
            while (i5 < i4) {
                InputStreamReader inputStreamReader2 = inputStreamReader;
                char c = cArr2[i5];
                if (zIsHighSurrogate) {
                    if (!Character.isLowSurrogate(c)) {
                        throw new CharacterCodingException();
                    }
                    cArr = cArr2;
                    zIsHighSurrogate = false;
                } else {
                    if (Character.isLowSurrogate(c)) {
                        throw new CharacterCodingException();
                    }
                    zIsHighSurrogate = Character.isHighSurrogate(c);
                    cArr = cArr2;
                    if (c == '\n' && z) {
                        z = false;
                    } else {
                        z = c == '\r';
                        if (z || c == '\n') {
                            j3 = j5;
                            j5 = 0;
                            j2 = j4;
                            j4 = 1 + j4;
                        } else {
                            j3 = j5;
                            j5 = 1 + j5;
                            j2 = j4;
                        }
                    }
                }
                i5++;
                inputStreamReader = inputStreamReader2;
                cArr2 = cArr;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37995() throws C12731 {
        if (Thread.currentThread().isInterrupted()) {
            throw C12731.m31627("FILE_WRITE_CANCELED", "The file operation was canceled before publication.", "warning", (JSONArray) null, JSON.object());
        }
    }
}
