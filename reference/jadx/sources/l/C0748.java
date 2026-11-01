package l;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.֡᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8YJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0748 extends AbstractC3382 {
    @Override // l.AbstractC3382
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3244(InterfaceC12061 interfaceC12061, AbstractC4332 abstractC4332, InterfaceC21022 interfaceC21022) {
        if (interfaceC21022.mo38114()) {
            AbstractC3382.m10034(interfaceC12061, abstractC4332, interfaceC21022.mo38112());
        }
        C18410 c18410Mo29970 = interfaceC12061.mo29970();
        InterfaceC4774 interfaceC4774Mo19014 = c18410Mo29970.m42695().mo19014(C2036.class);
        if (interfaceC4774Mo19014 != null) {
            C2657.m8180(interfaceC12061.builder(), interfaceC4774Mo19014.mo6311(c18410Mo29970, interfaceC12061.mo29965()), interfaceC21022.start(), interfaceC21022.end());
        }
    }

    @Override // l.AbstractC3382
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection mo3243() {
        return Collections.singleton("blockquote");
    }
}
