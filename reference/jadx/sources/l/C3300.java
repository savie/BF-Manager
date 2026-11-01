package l;

import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۗܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R905 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3300 extends AbstractC6123 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14591 f12207;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC9652 f12208;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C3300 m9806() {
        return new C3300(new C1889(), new C23763());
    }

    public C3300(AbstractC9652 abstractC9652, AbstractC14591 abstractC14591) {
        this.f12208 = abstractC9652;
        this.f12207 = abstractC14591;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    @Override // l.AbstractC6123
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10357 mo9808(String str) {
        String str2;
        String str3;
        boolean zEquals;
        String strReplaceAll;
        C11063 c11063;
        String[] strArrSplit;
        int length;
        if (!str.startsWith("data:")) {
            throw new IllegalStateException("Invalid data-uri: ".concat(str));
        }
        String strSubstring = str.substring(5);
        ((C1889) this.f12208).getClass();
        int iIndexOf = strSubstring.indexOf(44);
        byte[] bytes = null;
        if (iIndexOf < 0) {
            c11063 = null;
        } else {
            if (iIndexOf <= 0 || (length = (strArrSplit = strSubstring.substring(0, iIndexOf).split(l.b)).length) <= 0) {
                str2 = null;
                str3 = str2;
                zEquals = false;
            } else if (length == 1) {
                str2 = strArrSplit[0];
                if ("base64".equals(str2)) {
                    zEquals = true;
                    str3 = null;
                } else {
                    if (str2.indexOf(47) <= -1) {
                        str2 = null;
                    }
                    str3 = str2;
                    zEquals = false;
                }
            } else {
                str3 = strArrSplit[0].indexOf(47) > -1 ? strArrSplit[0] : null;
                zEquals = "base64".equals(strArrSplit[length - 1]);
            }
            if (iIndexOf < strSubstring.length()) {
                strReplaceAll = strSubstring.substring(iIndexOf + 1, strSubstring.length()).replaceAll("\n", "");
                if (strReplaceAll.length() == 0) {
                    strReplaceAll = null;
                }
            } else {
                strReplaceAll = null;
            }
            c11063 = new C11063(str3, strReplaceAll, zEquals);
        }
        if (c11063 == null) {
            throw new IllegalStateException("Invalid data-uri: ".concat(str));
        }
        try {
            ((C23763) this.f12207).getClass();
            String strM27883 = c11063.m27883();
            if (!TextUtils.isEmpty(strM27883)) {
                if (c11063.m27882()) {
                    bytes = Base64.decode(strM27883.getBytes(a.D), 0);
                } else {
                    bytes = strM27883.getBytes(a.D);
                }
            }
            if (bytes == null) {
                throw new IllegalStateException("Decoding data-uri failed: ".concat(str));
            }
            return AbstractC7534.m20057(new ByteArrayInputStream(bytes), c11063.m27884());
        } catch (Throwable th) {
            throw new IllegalStateException("Cannot decode data-uri: ".concat(str), th);
        }
    }

    @Override // l.AbstractC6123
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection mo9807() {
        return Collections.singleton(e.m);
    }
}
