package l;

import android.text.TextUtils;
import com.umeng.analytics.pro.am;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۧ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11333 extends AbstractC2159 {
    @Override // l.AbstractC2159
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6724(C18410 c18410, InterfaceC9239 interfaceC9239, InterfaceC21022 interfaceC21022) {
        InterfaceC4774 interfaceC4774Mo19014;
        String str = (String) interfaceC21022.attributes().get("href");
        if (TextUtils.isEmpty(str) || (interfaceC4774Mo19014 = c18410.m42695().mo19014(C21483.class)) == null) {
            return null;
        }
        AbstractC16769.f53671.m34276(interfaceC9239, str);
        return interfaceC4774Mo19014.mo6311(c18410, interfaceC9239);
    }

    @Override // l.AbstractC3382
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo3243() {
        return Collections.singleton(am.av);
    }
}
