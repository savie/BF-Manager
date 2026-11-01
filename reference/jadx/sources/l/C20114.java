package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩶ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LR */
/* JADX INFO: loaded from: classes4.dex */
public final class C20114 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f65325;

    public C20114() {
        int iM51269 = 0;
        Object[] objArr = {a.s, b.a, "mailto", e.m};
        ArrayList arrayList = new ArrayList(4);
        while (iM51269 < 4) {
            Object obj = objArr[iM51269];
            iM51269 = C23234.m51269(obj, arrayList, obj, iM51269, 1);
        }
        this.f65325 = new HashSet(C0561.unmodifiableList(arrayList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m45476(String str) {
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
                return !this.f65325.contains(str.substring(0, i2).toLowerCase()) ? "" : str;
            }
            if (cCharAt3 == '?') {
                return str;
            }
        }
        return str;
    }
}
