package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6ZZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15703 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f51027;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f51028;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f51029;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f51030;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18415 f51031;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15703 m37485(C18415 c18415) {
        return new C15703(Collections.singletonList(c18415.pattern()), Collections.EMPTY_LIST, c18415.flags(), c18415);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15703 m37484(ArrayList arrayList, ArrayList arrayList2, int i) {
        C18415 c18415M42924;
        if (arrayList.size() != arrayList2.size() + 1) {
            throw new IllegalArgumentException("Regex template fragments and variables differ");
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C17359.requireNonNull(obj);
            arrayList3.add(obj);
        }
        List listUnmodifiableList = C4681.unmodifiableList(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2.size());
        for (Object obj2 : arrayList2) {
            C17359.requireNonNull(obj2);
            arrayList4.add(obj2);
        }
        List listUnmodifiableList2 = C4681.unmodifiableList(arrayList4);
        if (!listUnmodifiableList2.isEmpty()) {
            long size = ((long) listUnmodifiableList2.size()) * ((long) 8);
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                size += (long) ((String) it.next()).length();
                if (size > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                    break;
                }
            }
            if (size > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                throw new IllegalArgumentException("Dynamic regex template exceeds the size limit");
            }
        }
        if (listUnmodifiableList2.isEmpty()) {
            c18415M42924 = C9341.m24595(i, (String) listUnmodifiableList.get(0));
        } else {
            c18415M42924 = C18415.m42924(i, m37483(listUnmodifiableList, false));
            if (C18415.m42924(i, m37483(listUnmodifiableList, true)).matcher((CharSequence) "").groupCount() != listUnmodifiableList2.size() + c18415M42924.matcher((CharSequence) "").groupCount()) {
                throw new IllegalArgumentException("var() must appear in a regex atom position");
            }
        }
        return new C15703(listUnmodifiableList, listUnmodifiableList2, i, c18415M42924);
    }

    public C15703(List list, List list2, int i, C18415 c18415) {
        this.f51030 = list;
        this.f51029 = list2;
        this.f51027 = i;
        this.f51031 = c18415;
        this.f51028 = c18415.matcher("").groupCount();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37491(C6178 c6178) {
        c6178.mo17812(this.f51027);
        List list = this.f51029;
        c6178.mo17812(list.size());
        List list2 = this.f51030;
        int i = 0;
        c6178.m17786((CharSequence) list2.get(0));
        while (i < list.size()) {
            c6178.m17786((CharSequence) list.get(i));
            i++;
            c6178.m17786((CharSequence) list2.get(i));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18415 m37493() {
        return this.f51031;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19161 m37498() {
        return m37494() ? C19161.f61997 : this.f51031.m42931();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m37496() {
        return this.f51028;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m37494() {
        return !this.f51029.isEmpty();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m37495() {
        return this.f51029;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37488() {
        return this.f51027;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37490(StringBuilder sb) {
        int i = 0;
        boolean z = false;
        while (true) {
            List list = this.f51030;
            if (i >= list.size()) {
                break;
            }
            String str = (String) list.get(i);
            if (!str.isEmpty()) {
                if (z) {
                    sb.append(" + ");
                }
                sb.append('/');
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == '\n') {
                        sb.append("\\n");
                    } else if (cCharAt == '\r') {
                        sb.append("\\r");
                    } else if (cCharAt == '/') {
                        sb.append("\\/");
                    } else {
                        sb.append(cCharAt);
                    }
                }
                sb.append('/');
                z = true;
            }
            List list2 = this.f51029;
            if (i < list2.size()) {
                if (z) {
                    sb.append(" + ");
                }
                sb.append("var(\"");
                sb.append(C3652.m11834((String) list2.get(i)));
                sb.append("\")");
                z = true;
            }
            i++;
        }
        if (z) {
            return;
        }
        sb.append("/(?=)/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37483(List list, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(z ? "(\\Qx\\E)" : "(?:\\Qx\\E)");
            sb.append((String) list.get(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m37497(CharSequence charSequence, int[] iArr, int[] iArr2) {
        return m37487(charSequence, iArr, iArr2) >= 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m37489(CharSequence charSequence, int[] iArr, int[] iArr2) {
        int i;
        int iM37487 = m37487(charSequence, iArr, iArr2);
        if (iM37487 < 0) {
            throw new IllegalArgumentException("Expanded regex exceeds the size limit");
        }
        StringBuilder sb = new StringBuilder(iM37487);
        List list = this.f51030;
        int i2 = 0;
        sb.append((String) list.get(0));
        while (i2 < iArr2.length) {
            int i3 = iArr2[i2] << 1;
            int i4 = iArr[i3];
            int i5 = iArr[i3 + 1];
            sb.append("(?:\\Q");
            while (i4 < i5) {
                char cCharAt = charSequence.charAt(i4);
                if (cCharAt == '\\' && (i = i4 + 1) < i5 && charSequence.charAt(i) == 'E') {
                    sb.append("\\E\\\\E\\Q");
                    i4 = i;
                } else {
                    sb.append(cCharAt);
                }
                i4++;
            }
            sb.append("\\E)");
            i2++;
            sb.append((String) list.get(i2));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37492(String str, CharSequence charSequence, int[] iArr, int[] iArr2) {
        int i;
        m37486(charSequence, iArr, iArr2);
        List list = this.f51030;
        int iM37482 = m37482(0, str, (String) list.get(0));
        if (iM37482 >= 0) {
            int i2 = 0;
            while (i2 < iArr2.length) {
                int iM37483 = m37482(iM37482, str, "(?:\\Q");
                if (iM37483 >= 0) {
                    int i3 = iArr2[i2] << 1;
                    int i4 = iArr[i3];
                    int i5 = iArr[i3 + 1];
                    while (i4 < i5) {
                        char cCharAt = charSequence.charAt(i4);
                        if (cCharAt == '\\' && (i = i4 + 1) < i5 && charSequence.charAt(i) == 'E') {
                            iM37483 = m37482(iM37483, str, "\\E\\\\E\\Q");
                            if (iM37483 >= 0) {
                                i4 = i;
                                i4++;
                            }
                        } else if (iM37483 < str.length()) {
                            int i6 = iM37483 + 1;
                            if (str.charAt(iM37483) == cCharAt) {
                                iM37483 = i6;
                                i4++;
                            }
                        }
                    }
                    int iM37484 = m37482(iM37483, str, "\\E)");
                    if (iM37484 >= 0) {
                        i2++;
                        iM37482 = m37482(iM37484, str, (String) list.get(i2));
                        if (iM37482 < 0) {
                        }
                    }
                }
            }
            if (iM37482 == str.length()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m37486(CharSequence charSequence, int[] iArr, int[] iArr2) {
        if (iArr2.length != this.f51029.size() || (iArr.length & 1) != 0) {
            throw new IllegalArgumentException("Invalid regex template bindings");
        }
        for (int i : iArr2) {
            if (i < 0 || i >= iArr.length / 2) {
                throw new IllegalArgumentException("Invalid regex template binding slot");
            }
            int i2 = i << 1;
            int i3 = iArr[i2];
            int i4 = iArr[i2 + 1];
            if (i3 < 0 || i4 < i3 || i4 > charSequence.length()) {
                throw new IllegalArgumentException("Invalid regex template binding range");
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m37487(CharSequence charSequence, int[] iArr, int[] iArr2) {
        m37486(charSequence, iArr, iArr2);
        long length = ((long) iArr2.length) * ((long) 8);
        Iterator it = this.f51030.iterator();
        while (it.hasNext()) {
            length += (long) ((String) it.next()).length();
            if (length > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                return -1;
            }
        }
        for (int i : iArr2) {
            int i2 = i << 1;
            int i3 = iArr[i2];
            int i4 = iArr[i2 + 1];
            length += (long) (i4 - i3);
            if (length > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                return -1;
            }
            while (true) {
                int i5 = i3 + 1;
                if (i5 < i4) {
                    if (charSequence.charAt(i3) == '\\' && charSequence.charAt(i5) == 'E') {
                        length += (long) 5;
                        if (length > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                            return -1;
                        }
                        i3 = i5;
                    }
                    i3++;
                }
            }
        }
        return (int) length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37482(int i, String str, String str2) {
        int length = str2.length() + i;
        if (i < 0 || length < i || length > str.length() || !str.regionMatches(i, str2, 0, str2.length())) {
            return -1;
        }
        return length;
    }
}
