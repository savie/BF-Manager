package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K63E */
/* JADX INFO: loaded from: classes2.dex */
public final class C2600 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f8353;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile C0594 f8354;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13786[] f8355;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f8356;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f8357;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C2600 f8352 = m8727(1, Integer.MAX_VALUE, "style");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C2600 f8350 = m8727(1, Integer.MAX_VALUE, "layout");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C2600 f8348 = m8727(2, Integer.MAX_VALUE, "package");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C2600 f8351 = m8727(8, Integer.MAX_VALUE, "coreApp");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2600 f8347 = m8727(4, Integer.MAX_VALUE, "platformBuildVersionCode");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2600 f8349 = m8727(6, Integer.MAX_VALUE, "platformBuildVersionName");

    public C2600(int i, String str, C13786[] c13786Arr, int i2) {
        this.f8357 = i;
        this.f8356 = str;
        this.f8355 = c13786Arr;
        this.f8353 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5509 m8730() {
        if (this.f8354 == null) {
            synchronized (this) {
                if (this.f8354 == null) {
                    this.f8354 = m8728();
                }
            }
        }
        return this.f8354;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C0594 m8728() {
        C0594 c0594 = new C0594();
        c0594.add(1);
        c0594.add(2);
        int i = this.f8357;
        if ((i & 1) != 0) {
            c0594.add(0);
        }
        if ((i & 2) != 0) {
            c0594.add(3);
            c0594.add(0);
        }
        if ((i & 4) != 0) {
            c0594.add(16);
            c0594.add(17);
        }
        if ((i & 8) != 0) {
            c0594.add(18);
        }
        if ((i & 16) != 0) {
            c0594.add(28);
            c0594.add(29);
            c0594.add(30);
            c0594.add(31);
        }
        if ((i & 32) != 0) {
            c0594.add(4);
        }
        if ((i & 64) != 0) {
            c0594.add(5);
        }
        if ((i & 128) != 0) {
            c0594.add(6);
        }
        if ((65536 & i) != 0) {
            c0594.add(16);
            c0594.add(17);
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            c0594.add(16);
            c0594.add(17);
        }
        return c0594;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m8729(int i) {
        C13786[] c13786Arr = this.f8355;
        int length = c13786Arr.length;
        while (length > 0) {
            length--;
            C13786 c13786 = c13786Arr[length];
            if (c13786.f43735 == i) {
                return c13786.f43733;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m8732(int i) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (C13786 c13786 : this.f8355) {
            int i2 = c13786.f43735;
            if ((i & i2) == i2) {
                i &= ~i2;
                arrayList.add(c13786);
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
                        int i5 = ((C13786) arrayList.get(i3)).f43735;
                        int i6 = ((C13786) arrayList.get(i4)).f43735;
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
                sb.append(((C13786) arrayList.get(i8)).f43733);
                sb.append('|');
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2600 m8727(int i, int i2, String str) {
        return new C2600(i, str, new C13786[0], i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m8731() {
        int i = this.f8357;
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
        return obj != null && C2600.class == obj.getClass() && this.f8353 == ((C2600) obj).f8353;
    }

    public final int hashCode() {
        return this.f8353;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8356);
        sb.append("[");
        sb.append(m8731());
        sb.append("], id=");
        return C4791.m14766(sb, this.f8353);
    }
}
