package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܺ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15615 extends AbstractC6123 {
    @Override // l.AbstractC6123
    /* JADX INFO: renamed from: ۙ */
    public final C10357 mo9808(String str) {
        C6490 c6490 = new C6490();
        c6490.m17683(C0091.f1007);
        c6490.m17686(str);
        try {
            C18485 c18485Execute = C0091.f1006.m14157(c6490.m17678()).execute();
            AbstractC19191 abstractC19191M42860 = c18485Execute.m42860();
            String strSubstring = null;
            InputStream inputStreamM44051 = abstractC19191M42860 != null ? abstractC19191M42860.m44051() : null;
            if (inputStreamM44051 == null) {
                throw new IllegalStateException("Response does not contain body: ".concat(str));
            }
            String strM42859 = c18485Execute.m42859("Content-Type");
            if (strM42859 != null) {
                int iIndexOf = strM42859.indexOf(59);
                strSubstring = iIndexOf > -1 ? strM42859.substring(0, iIndexOf) : strM42859;
            }
            return AbstractC7534.m20057(inputStreamM44051, strSubstring);
        } catch (Throwable th) {
            throw new IllegalStateException("Exception obtaining network resource: ".concat(str), th);
        }
    }

    @Override // l.AbstractC6123
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo9807() {
        return Arrays.asList(a.s, b.a);
    }
}
