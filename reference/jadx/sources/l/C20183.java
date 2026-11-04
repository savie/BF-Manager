package l;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ᩴ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 78YS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20183 extends AbstractC25405 {
    @Override // l.AbstractC25405
    /* JADX INFO: renamed from: ۙ */
    public final Object mo17483(C10420 c10420, InterfaceC17045 interfaceC17045, InterfaceC13864 interfaceC13864) {
        int i;
        InterfaceC16299 interfaceC16299Mo15471 = c10420.m26736().mo15471(C8042.class);
        if (interfaceC16299Mo15471 == null) {
            return null;
        }
        try {
            i = Integer.parseInt(interfaceC13864.name().substring(1));
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i < 1 || i > 6) {
            return null;
        }
        AbstractC22881.f74341.m29674(interfaceC17045, Integer.valueOf(i));
        return interfaceC16299Mo15471.mo6845(c10420, interfaceC17045);
    }

    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo12251() {
        return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
    }
}
