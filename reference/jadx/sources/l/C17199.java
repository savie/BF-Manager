package l;

import com.umeng.analytics.pro.am;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܺ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P904 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17199 extends AbstractC17376 {
    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ */
    public final void mo12252(InterfaceC20029 interfaceC20029, AbstractC11528 abstractC11528, InterfaceC13864 interfaceC13864) {
        if (interfaceC13864.mo14577()) {
            AbstractC17376.m40819(interfaceC20029, abstractC11528, interfaceC13864.mo14574());
        }
        C20775 c20775Builder = interfaceC20029.builder();
        C10420 c10420Mo7360 = interfaceC20029.mo7360();
        InterfaceC16299 interfaceC16299Mo15471 = c10420Mo7360.m26736().mo15471(C13592.class);
        C20775.m47526(c20775Builder, interfaceC16299Mo15471 == null ? null : interfaceC16299Mo15471.mo6845(c10420Mo7360, interfaceC20029.mo7334()), interfaceC13864.start(), interfaceC13864.end());
    }

    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo12251() {
        return Arrays.asList(am.aB, "del");
    }
}
