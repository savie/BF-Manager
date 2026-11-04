package l;

import com.umeng.analytics.pro.am;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UTFDataFormatException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠۠ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 74MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8499 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f27798 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22813(String str, String... strArr) {
        String str2 = strArr.length > 0 ? strArr[0] : "";
        String str3 = strArr.length > 1 ? strArr[1] : str2;
        StringBuilder sb = new StringBuilder(str2);
        for (int i = 0; i < str.length(); i++) {
            sb.append(m22812(str.charAt(i)));
        }
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22812(char c) {
        if (c == '\f') {
            return "\\".concat("f");
        }
        if (c == '\r') {
            return "\\".concat("r");
        }
        if (c == '\"') {
            return "\\".concat("\"");
        }
        if (c == '\'') {
            return "\\".concat("'");
        }
        if (c != '\\') {
            switch (c) {
                case '\b':
                    return "\\".concat("b");
                case '\t':
                    return "\\".concat(am.aI);
                case '\n':
                    return "\\".concat("n");
                default:
                    return Character.isISOControl(c) ? String.format("\\u%04x", Integer.valueOf(c)) : Character.toString(c);
            }
        }
        return "\\".concat("\\");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22815(int i, int i2, DataInputStream dataInputStream) throws Throwable {
        int i3;
        int i4 = i2 / 6;
        int i5 = i4 + 1;
        ArrayList arrayList = new ArrayList();
        C2533 c2533 = new C2533();
        c2533.add(new StringBuilder());
        int i6 = 0;
        StringBuilder sb = (StringBuilder) c2533.get(0);
        String utf = null;
        try {
            try {
                byte[] bArr = new byte[i + 2];
                bArr[0] = (byte) (i >> 8);
                bArr[1] = (byte) i;
                i3 = 0;
                for (int i7 = 0; i7 < i; i7++) {
                    try {
                        byte b = dataInputStream.readByte();
                        bArr[i7 + 2] = b;
                        i3++;
                        sb.append("0x");
                        char[] cArr = f27798;
                        sb.append(cArr[(b >> 4) & 15]);
                        sb.append(cArr[b & 15]);
                        if (i7 % i5 == i4) {
                            sb = new StringBuilder();
                            c2533.add(sb);
                        } else if (i7 + 1 != i) {
                            sb.append(" ");
                        }
                    } catch (NegativeArraySizeException e) {
                        e = e;
                        i6 = i3;
                        throw new IOException("Requested array size exceeds VM limit", e);
                    } catch (Throwable th) {
                        th = th;
                        if (i3 > 0) {
                            ArrayList arrayListM22816 = m22816(i2, (String) null);
                            if (arrayListM22816 != null) {
                                C1170.stream(arrayListM22816).forEach(new C21103(2, arrayList));
                            } else {
                                C1170.stream(c2533).map(new C20299(8)).forEach(new C17424(1, arrayList));
                            }
                        }
                        throw th;
                    }
                }
                if (i3 > 0) {
                    try {
                        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArr));
                        try {
                            utf = DataInputStream.readUTF(dataInputStream2);
                            dataInputStream2.close();
                        } catch (Throwable th2) {
                            try {
                                dataInputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (UTFDataFormatException unused) {
                        c2533.add(0, new StringBuilder("// == The bytes do not represent a valid modified UTF-8 encoding of a Unicode string. =="));
                    } catch (IOException unused2) {
                    }
                }
                if (i3 > 0) {
                    ArrayList arrayListM22817 = m22816(i2, utf);
                    if (arrayListM22817 != null) {
                        C1170.stream(arrayListM22817).forEach(new C21103(2, arrayList));
                    } else {
                        C1170.stream(c2533).map(new C20299(8)).forEach(new C17424(1, arrayList));
                    }
                }
                return arrayList;
            } catch (NegativeArraySizeException e2) {
                e = e2;
            }
        } catch (Throwable th4) {
            th = th4;
            i3 = i6;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22816(int i, String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= ' ' && c <= '~') {
                sb.append(c);
            }
        }
        String string = sb.toString();
        if (string == null || string.isEmpty()) {
            return null;
        }
        for (int i2 = 0; i2 < string.length(); i2++) {
            if (!m22817(string.charAt(i2))) {
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        String string2 = "";
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (string2.length() >= i) {
                arrayList.add(string2);
                string2 = "";
            }
            StringBuilder sbM27333 = C10732.m27333(string2);
            sbM27333.append(m22812(str.charAt(i3)));
            string2 = sbM27333.toString();
        }
        if (!string2.isEmpty()) {
            arrayList.add(string2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22814(int[] iArr) {
        return String.format("{%s}", C13847.stream(iArr).mapToObj(new C9244()).collect(C2025.joining(", ")));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m22817(char c) {
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c);
        return (Character.isISOControl(c) || c == 65535 || unicodeBlockOf == null || unicodeBlockOf == Character.UnicodeBlock.SPECIALS) ? false : true;
    }
}
