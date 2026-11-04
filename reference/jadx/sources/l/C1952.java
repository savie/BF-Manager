package l;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J71Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C1952 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6550;

    public C1952(ArrayList arrayList) {
        this.f6550 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse m6736(Uri uri) {
        InterfaceC13138 interfaceC13138;
        String str;
        Iterator it = this.f6550.iterator();
        do {
            interfaceC13138 = null;
            if (!it.hasNext()) {
                return null;
            }
            C5681 c5681 = (C5681) it.next();
            c5681.getClass();
            str = c5681.f19637;
            if (!uri.getScheme().equals(a.s) && ((uri.getScheme().equals(a.s) || uri.getScheme().equals(b.a)) && uri.getAuthority().equals(c5681.f19636) && uri.getPath().startsWith(str))) {
                interfaceC13138 = c5681.f19638;
            }
        } while (interfaceC13138 == null);
        return interfaceC13138.mo3477(uri.getPath().replaceFirst(str, ""));
    }
}
