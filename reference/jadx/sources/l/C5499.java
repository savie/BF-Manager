package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۚ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5499 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f19129;

    public C5499() {
        int iM9136 = 0;
        Object[] objArr = {a.s, b.a, "mailto", e.m};
        ArrayList arrayList = new ArrayList(4);
        while (iM9136 < 4) {
            Object obj = objArr[iM9136];
            iM9136 = C2764.m9136(obj, arrayList, obj, iM9136, 1);
        }
        this.f19129 = new HashSet(C4681.unmodifiableList(arrayList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m16326(String str) {
        char cCharAt;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '\t' || cCharAt == '\n' || cCharAt == '\f' || cCharAt == '\r' || cCharAt == ' ')) {
            length--;
        }
        int i = 0;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 != '\t' && cCharAt2 != '\n' && cCharAt2 != '\f' && cCharAt2 != '\r' && cCharAt2 != ' ') {
                break;
            }
            i++;
        }
        if (i != 0 || length != str.length()) {
            str = str.substring(i, length);
        }
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt3 = str.charAt(i2);
            if (cCharAt3 == '#' || cCharAt3 == '/') {
                return str;
            }
            if (cCharAt3 == ':') {
                return !this.f19129.contains(str.substring(0, i2).toLowerCase()) ? "" : str;
            }
            if (cCharAt3 == '?') {
                return str;
            }
        }
        return str;
    }
}
