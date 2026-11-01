package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K63E */
/* JADX INFO: loaded from: classes3.dex */
public final class C11413 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f38427;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38428;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21996[] f38429;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile C18597 f38430;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f38431;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static C11413 f38426 = m28513(1, Integer.MAX_VALUE, "style");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C11413 f38421 = m28513(1, Integer.MAX_VALUE, "layout");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C11413 f38424 = m28513(2, Integer.MAX_VALUE, "package");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C11413 f38425 = m28513(8, Integer.MAX_VALUE, "coreApp");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C11413 f38422 = m28513(4, Integer.MAX_VALUE, "platformBuildVersionCode");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C11413 f38423 = m28513(6, Integer.MAX_VALUE, "platformBuildVersionName");

    public C11413(int i, String str, C21996[] c21996Arr, int i2) {
        this.f38427 = i;
        this.f38431 = str;
        this.f38429 = c21996Arr;
        this.f38428 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14842 m28516() {
        if (this.f38430 == null) {
            synchronized (this) {
                if (this.f38430 == null) {
                    this.f38430 = m28514();
                }
            }
        }
        return this.f38430;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C18597 m28514() {
        C18597 c18597 = new C18597();
        c18597.add(1);
        c18597.add(2);
        int i = this.f38427;
        if ((i & 1) != 0) {
            c18597.add(0);
        }
        if ((i & 2) != 0) {
            c18597.add(3);
            c18597.add(0);
        }
        if ((i & 4) != 0) {
            c18597.add(16);
            c18597.add(17);
        }
        if ((i & 8) != 0) {
            c18597.add(18);
        }
        if ((i & 16) != 0) {
            c18597.add(28);
            c18597.add(29);
            c18597.add(30);
            c18597.add(31);
        }
        if ((i & 32) != 0) {
            c18597.add(4);
        }
        if ((i & 64) != 0) {
            c18597.add(5);
        }
        if ((i & 128) != 0) {
            c18597.add(6);
        }
        if ((65536 & i) != 0) {
            c18597.add(16);
            c18597.add(17);
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            c18597.add(16);
            c18597.add(17);
        }
        return c18597;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m28515(int i) {
        C21996[] c21996Arr = this.f38429;
        int length = c21996Arr.length;
        while (length > 0) {
            length--;
            C21996 c21996 = c21996Arr[length];
            if (c21996.f71329 == i) {
                return c21996.f71327;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m28518(int i) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (C21996 c21996 : this.f38429) {
            int i2 = c21996.f71329;
            if ((i & i2) == i2) {
                i &= ~i2;
                arrayList.add(c21996);
            }
        }
        if (i != 0 || arrayList.size() <= 0) {
            return null;
        }
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i3 = 0; i3 < size - 1; i3++) {
            if (!zArr[i3]) {
                for (int i4 = i3 + 1; i4 < size; i4++) {
                    if (!zArr[i4]) {
                        int i5 = ((C21996) arrayList.get(i3)).f71329;
                        int i6 = ((C21996) arrayList.get(i4)).f71329;
                        int i7 = i5 & i6;
                        if (i7 != i6) {
                            if (i7 == i5) {
                                zArr[i3] = true;
                                break;
                            }
                        } else {
                            zArr[i4] = true;
                        }
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            if (!zArr[i8]) {
                sb.append(((C21996) arrayList.get(i8)).f71327);
                sb.append('|');
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11413 m28513(int i, int i2, String str) {
        return new C11413(i, str, new C21996[0], i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m28517() {
        int i = this.f38427;
        if (i == 65535) {
            return "any";
        }
        StringBuilder sb = new StringBuilder();
        if ((i & 1) != 0) {
            sb.append("|reference");
        }
        if ((i & 2) != 0) {
            sb.append("|string");
        }
        if ((i & 4) != 0) {
            sb.append("|integer");
        }
        if ((i & 8) != 0) {
            sb.append("|boolean");
        }
        if ((i & 16) != 0) {
            sb.append("|color");
        }
        if ((i & 32) != 0) {
            sb.append("|float");
        }
        if ((i & 64) != 0) {
            sb.append("|dimension");
        }
        if ((i & 128) != 0) {
            sb.append("|fraction");
        }
        if ((65536 & i) != 0) {
            sb.append("|enum");
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            sb.append("|flags");
        }
        if (sb.length() == 0) {
            return "null";
        }
        sb.deleteCharAt(0);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C11413.class == obj.getClass() && this.f38428 == ((C11413) obj).f38428;
    }

    public final int hashCode() {
        return this.f38428;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38431);
        sb.append("[");
        sb.append(m28517());
        sb.append("], id=");
        return C9576.m24440(sb, this.f38428);
    }
}
