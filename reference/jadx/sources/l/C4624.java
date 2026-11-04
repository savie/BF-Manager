package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۙۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7FQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4624 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14432(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder(String.format(Locale.US, C21576.m49088(R.string.MT_Protector), "\\u"));
        if (!arrayList.isEmpty()) {
            sb.append('\n');
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C14340 c14340 = (C14340) arrayList.get(i);
            if (i > 0) {
                sb.append('\n');
            }
            sb.append("password=");
            sb.append(m14435(c14340.f45235));
            sb.append("\nremark=");
            String str = c14340.f45234;
            if (str == null) {
                str = "";
            }
            sb.append(m14435(str));
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m14433(String str) throws C21778 {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        String[] strArrSplit = str.replace("\r\n", "\n").replace('\r', '\n').split("\n", -1);
        int i = 0;
        int i2 = -1;
        String strM14431 = null;
        while (i < strArrSplit.length) {
            int i3 = i + 1;
            String strSubstring = strArrSplit[i];
            if (i == 0 && !strSubstring.isEmpty() && strSubstring.charAt(0) == 65279) {
                strSubstring = strSubstring.substring(1);
            }
            if (!strSubstring.isEmpty() && !strSubstring.startsWith("#")) {
                if (strM14431 == null) {
                    if (!strSubstring.startsWith("password=")) {
                        if (strSubstring.startsWith("remark=")) {
                            throw m14434(i3, R.string.MT_Protector);
                        }
                        throw m14434(i3, R.string.MT_Protector);
                    }
                    strM14431 = m14431(i3, strSubstring.substring(9));
                    if (strM14431.isEmpty()) {
                        throw m14434(i3, R.string.MT_Protector);
                    }
                    if (!hashSet.add(strM14431)) {
                        throw m14434(i3, R.string.MT_Protector);
                    }
                    i2 = i3;
                } else {
                    if (!strSubstring.startsWith("remark=")) {
                        if (strSubstring.startsWith("password=")) {
                            throw m14434(i3, R.string.MT_Protector);
                        }
                        throw m14434(i3, R.string.MT_Protector);
                    }
                    arrayList.add(new C14340(strM14431, m14431(i3, strSubstring.substring(7))));
                    strM14431 = null;
                    i2 = -1;
                }
            }
            i = i3;
        }
        if (strM14431 == null) {
            return arrayList;
        }
        throw m14434(i2, R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m14435(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (Character.isISOControl(cCharAt)) {
                sb.append(String.format(Locale.US, "\\u%04X", Integer.valueOf(cCharAt)));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f A[LOOP:1: B:31:0x007c->B:35:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0092 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14431(int i, String str) throws C21778 {
        String strSubstring;
        int i2;
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\\') {
                sb.append(cCharAt);
            } else {
                if (i3 == length - 1) {
                    throw m14434(i, R.string.MT_Protector);
                }
                int i4 = i3 + 1;
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 == 'U') {
                    i4 = i3 + 5;
                    if (i4 < length) {
                        throw m14434(i, R.string.MT_Protector);
                    }
                    strSubstring = str.substring(i3 + 2, i3 + 6);
                    for (i2 = 0; i2 < strSubstring.length(); i2++) {
                        if (Character.digit(strSubstring.charAt(i2), 16) != -1) {
                            throw m14434(i, R.string.MT_Protector);
                        }
                    }
                    sb.append((char) Integer.parseInt(strSubstring, 16));
                } else if (cCharAt2 == '\\') {
                    sb.append('\\');
                } else if (cCharAt2 == 'n') {
                    sb.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb.append('\r');
                } else if (cCharAt2 == 't') {
                    sb.append('\t');
                } else {
                    if (cCharAt2 != 'u') {
                        throw new C21778(i, C21576.m49059(R.string.MT_Protector, Character.valueOf(cCharAt2)));
                    }
                    i4 = i3 + 5;
                    if (i4 < length) {
                        throw m14434(i, R.string.MT_Protector);
                    }
                    strSubstring = str.substring(i3 + 2, i3 + 6);
                    while (i2 < strSubstring.length()) {
                        if (Character.digit(strSubstring.charAt(i2), 16) != -1) {
                            throw m14434(i, R.string.MT_Protector);
                        }
                    }
                    sb.append((char) Integer.parseInt(strSubstring, 16));
                }
                i3 = i4;
            }
            i3++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21778 m14434(int i, int i2) {
        return new C21778(i, C21576.m49088(i2));
    }
}
