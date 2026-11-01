package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6ZZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8626 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14690 f29769;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29770;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f29771;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f29772;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f29773;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8626 m22405(C14690 c14690) {
        return new C8626(Collections.singletonList(c14690.pattern()), Collections.EMPTY_LIST, c14690.flags(), c14690);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8626 m22404(ArrayList arrayList, ArrayList arrayList2, int i) {
        C14690 c14690M35218;
        if (arrayList.size() != arrayList2.size() + 1) {
            throw new IllegalArgumentException("Regex template fragments and variables differ");
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C13638.requireNonNull(obj);
            arrayList3.add(obj);
        }
        List listUnmodifiableList = C0561.unmodifiableList(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2.size());
        for (Object obj2 : arrayList2) {
            C13638.requireNonNull(obj2);
            arrayList4.add(obj2);
        }
        List listUnmodifiableList2 = C0561.unmodifiableList(arrayList4);
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
            c14690M35218 = C12859.m31876(i, (String) listUnmodifiableList.get(0));
        } else {
            c14690M35218 = C14690.m35218(i, m22403(listUnmodifiableList, false));
            if (C14690.m35218(i, m22403(listUnmodifiableList, true)).matcher((CharSequence) "").groupCount() != listUnmodifiableList2.size() + c14690M35218.matcher((CharSequence) "").groupCount()) {
                throw new IllegalArgumentException("var() must appear in a regex atom position");
            }
        }
        return new C8626(listUnmodifiableList, listUnmodifiableList2, i, c14690M35218);
    }

    public C8626(List list, List list2, int i, C14690 c14690) {
        this.f29773 = list;
        this.f29771 = list2;
        this.f29770 = i;
        this.f29769 = c14690;
        this.f29772 = c14690.matcher("").groupCount();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22411(C11018 c11018) {
        c11018.mo24508(this.f29770);
        List list = this.f29771;
        c11018.mo24508(list.size());
        List list2 = this.f29773;
        int i = 0;
        c11018.m27782((CharSequence) list2.get(0));
        while (i < list.size()) {
            c11018.m27782((CharSequence) list.get(i));
            i++;
            c11018.m27782((CharSequence) list2.get(i));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14690 m22414() {
        return this.f29769;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3399 m22407() {
        return m22417() ? C3399.f12541 : this.f29769.m35226();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m22415() {
        return this.f29772;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m22417() {
        return !this.f29771.isEmpty();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m22413() {
        return this.f29771;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22408() {
        return this.f29770;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22410(StringBuilder sb) {
        int i = 0;
        boolean z = false;
        while (true) {
            List list = this.f29773;
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
            List list2 = this.f29771;
            if (i < list2.size()) {
                if (z) {
                    sb.append(" + ");
                }
                sb.append("var(\"");
                sb.append(C9461.m24217((String) list2.get(i)));
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
    public static String m22403(List list, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(z ? "(\\Qx\\E)" : "(?:\\Qx\\E)");
            sb.append((String) list.get(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m22416(CharSequence charSequence, int[] iArr, int[] iArr2) {
        return m22401(charSequence, iArr, iArr2) >= 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m22409(CharSequence charSequence, int[] iArr, int[] iArr2) {
        int i;
        int iM22401 = m22401(charSequence, iArr, iArr2);
        if (iM22401 < 0) {
            throw new IllegalArgumentException("Expanded regex exceeds the size limit");
        }
        StringBuilder sb = new StringBuilder(iM22401);
        List list = this.f29773;
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
    public final boolean m22412(String str, CharSequence charSequence, int[] iArr, int[] iArr2) {
        int i;
        m22406(charSequence, iArr, iArr2);
        List list = this.f29773;
        int iM22402 = m22402(0, str, (String) list.get(0));
        if (iM22402 >= 0) {
            int i2 = 0;
            while (i2 < iArr2.length) {
                int iM22403 = m22402(iM22402, str, "(?:\\Q");
                if (iM22403 >= 0) {
                    int i3 = iArr2[i2] << 1;
                    int i4 = iArr[i3];
                    int i5 = iArr[i3 + 1];
                    while (i4 < i5) {
                        char cCharAt = charSequence.charAt(i4);
                        if (cCharAt == '\\' && (i = i4 + 1) < i5 && charSequence.charAt(i) == 'E') {
                            iM22403 = m22402(iM22403, str, "\\E\\\\E\\Q");
                            if (iM22403 >= 0) {
                                i4 = i;
                                i4++;
                            }
                        } else if (iM22403 < str.length()) {
                            int i6 = iM22403 + 1;
                            if (str.charAt(iM22403) == cCharAt) {
                                iM22403 = i6;
                                i4++;
                            }
                        }
                    }
                    int iM22404 = m22402(iM22403, str, "\\E)");
                    if (iM22404 >= 0) {
                        i2++;
                        iM22402 = m22402(iM22404, str, (String) list.get(i2));
                        if (iM22402 < 0) {
                        }
                    }
                }
            }
            if (iM22402 == str.length()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m22406(CharSequence charSequence, int[] iArr, int[] iArr2) {
        if (iArr2.length != this.f29771.size() || (iArr.length & 1) != 0) {
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m22401(CharSequence charSequence, int[] iArr, int[] iArr2) {
        m22406(charSequence, iArr, iArr2);
        long length = ((long) iArr2.length) * ((long) 8);
        Iterator it = this.f29773.iterator();
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
    public static int m22402(int i, String str, String str2) {
        int length = str2.length() + i;
        if (i < 0 || length < i || length > str.length() || !str.regionMatches(i, str2, 0, str2.length())) {
            return -1;
        }
        return length;
    }
}
