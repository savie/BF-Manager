package l;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܿ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8Y5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17682 extends AbstractC2159 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6393 f56150;

    public C17682(C6393 c6393) {
        this.f56150 = c6393;
    }

    @Override // l.AbstractC3382
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo3243() {
        return Collections.singleton("img");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17682 m41159() {
        return new C17682(new C6393(AbstractC21728.m48490()));
    }

    @Override // l.AbstractC2159
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6724(C18410 c18410, InterfaceC9239 interfaceC9239, InterfaceC21022 interfaceC21022) {
        InterfaceC4774 interfaceC4774Mo19014;
        String str = (String) interfaceC21022.attributes().get("src");
        if (TextUtils.isEmpty(str) || (interfaceC4774Mo19014 = c18410.m42695().mo19014(C22895.class)) == null) {
            return null;
        }
        c18410.m42697().getClass();
        C20235 c20235M17541 = this.f56150.m17541(interfaceC21022.attributes());
        AbstractC20940.f68255.m34276(interfaceC9239, str);
        AbstractC20940.f68257.m34276(interfaceC9239, c20235M17541);
        AbstractC20940.f68256.m34276(interfaceC9239, Boolean.FALSE);
        return interfaceC4774Mo19014.mo6311(c18410, interfaceC9239);
    }
}
