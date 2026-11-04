package l;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۤ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W8YJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11232 extends AbstractC17376 {
    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ */
    public final void mo12252(InterfaceC20029 interfaceC20029, AbstractC11528 abstractC11528, InterfaceC13864 interfaceC13864) {
        if (interfaceC13864.mo14577()) {
            AbstractC17376.m40819(interfaceC20029, abstractC11528, interfaceC13864.mo14574());
        }
        C10420 c10420Mo7360 = interfaceC20029.mo7360();
        InterfaceC16299 interfaceC16299Mo15471 = c10420Mo7360.m26736().mo15471(C3567.class);
        if (interfaceC16299Mo15471 != null) {
            C20775.m47526(interfaceC20029.builder(), interfaceC16299Mo15471.mo6845(c10420Mo7360, interfaceC20029.mo7334()), interfaceC13864.start(), interfaceC13864.end());
        }
    }

    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo12251() {
        return Collections.singleton("blockquote");
    }
}
