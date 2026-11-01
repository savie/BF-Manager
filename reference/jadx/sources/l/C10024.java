package l;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10024 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34232;

    public C10024(ArrayList arrayList) {
        this.f34232 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse m25302(Uri uri) {
        InterfaceC19196 interfaceC19196;
        String str;
        Iterator it = this.f34232.iterator();
        do {
            interfaceC19196 = null;
            if (!it.hasNext()) {
                return null;
            }
            C8613 c8613 = (C8613) it.next();
            c8613.getClass();
            str = c8613.f29734;
            if (!uri.getScheme().equals(a.s) && ((uri.getScheme().equals(a.s) || uri.getScheme().equals(b.a)) && uri.getAuthority().equals(c8613.f29733) && uri.getPath().startsWith(str))) {
                interfaceC19196 = c8613.f29735;
            }
        } while (interfaceC19196 == null);
        return interfaceC19196.mo44106(uri.getPath().replaceFirst(str, ""));
    }
}
