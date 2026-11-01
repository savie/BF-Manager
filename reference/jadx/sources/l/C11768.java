package l;

import android.text.style.UnderlineSpan;
import com.umeng.analytics.pro.am;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۨܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S91K */
/* JADX INFO: loaded from: classes4.dex */
public final class C11768 extends AbstractC3382 {
    @Override // l.AbstractC3382
    /* JADX INFO: renamed from: ۙ */
    public final void mo3244(InterfaceC12061 interfaceC12061, AbstractC4332 abstractC4332, InterfaceC21022 interfaceC21022) {
        if (interfaceC21022.mo38114()) {
            AbstractC3382.m10034(interfaceC12061, abstractC4332, interfaceC21022.mo38112());
        }
        C2657.m8180(interfaceC12061.builder(), new UnderlineSpan(), interfaceC21022.start(), interfaceC21022.end());
    }

    @Override // l.AbstractC3382
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo3243() {
        return Arrays.asList(am.aH, "ins");
    }
}
