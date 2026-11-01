package l;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.۫᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12744 extends AbstractC2159 {
    @Override // l.AbstractC2159
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6724(C18410 c18410, InterfaceC9239 interfaceC9239, InterfaceC21022 interfaceC21022) {
        int i;
        InterfaceC4774 interfaceC4774Mo19014 = c18410.m42695().mo19014(C13017.class);
        if (interfaceC4774Mo19014 == null) {
            return null;
        }
        try {
            i = Integer.parseInt(interfaceC21022.name().substring(1));
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i < 1 || i > 6) {
            return null;
        }
        AbstractC16769.f53674.m34276(interfaceC9239, Integer.valueOf(i));
        return interfaceC4774Mo19014.mo6311(c18410, interfaceC9239);
    }

    @Override // l.AbstractC3382
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo3243() {
        return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
    }
}
