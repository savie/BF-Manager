package l;

import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܽܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R905 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17703 extends AbstractC13228 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11736 f58184;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC16957 f58185;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17703 m41463() {
        return new C17703(new C25163(), new C2042());
    }

    public C17703(AbstractC16957 abstractC16957, AbstractC11736 abstractC11736) {
        this.f58185 = abstractC16957;
        this.f58184 = abstractC11736;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    @Override // l.AbstractC13228
    /* JADX INFO: renamed from: ۙ */
    public final C8995 mo31020(String str) {
        String str2;
        String str3;
        boolean zEquals;
        String strReplaceAll;
        C5771 c5771;
        String[] strArrSplit;
        int length;
        if (!str.startsWith("data:")) {
            throw new IllegalStateException("Invalid data-uri: ".concat(str));
        }
        String strSubstring = str.substring(5);
        ((C25163) this.f58185).getClass();
        int iIndexOf = strSubstring.indexOf(44);
        byte[] bytes = null;
        if (iIndexOf < 0) {
            c5771 = null;
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
            c5771 = new C5771(str3, strReplaceAll, zEquals);
        }
        if (c5771 == null) {
            throw new IllegalStateException("Invalid data-uri: ".concat(str));
        }
        try {
            ((C2042) this.f58184).getClass();
            String strM16853 = c5771.m16853();
            if (!TextUtils.isEmpty(strM16853)) {
                if (c5771.m16852()) {
                    bytes = Base64.decode(strM16853.getBytes(a.D), 0);
                } else {
                    bytes = strM16853.getBytes(a.D);
                }
            }
            if (bytes == null) {
                throw new IllegalStateException("Decoding data-uri failed: ".concat(str));
            }
            return AbstractC7504.m20557(new ByteArrayInputStream(bytes), c5771.m16854());
        } catch (Throwable th) {
            throw new IllegalStateException("Cannot decode data-uri: ".concat(str), th);
        }
    }

    @Override // l.AbstractC13228
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo31019() {
        return Collections.singleton(e.m);
    }
}
