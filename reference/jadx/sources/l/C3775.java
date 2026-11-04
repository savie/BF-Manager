package l;

import android.text.style.UnderlineSpan;
import com.umeng.analytics.pro.am;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۗ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C3775 extends AbstractC17376 {
    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12252(InterfaceC20029 interfaceC20029, AbstractC11528 abstractC11528, InterfaceC13864 interfaceC13864) {
        if (interfaceC13864.mo14577()) {
            AbstractC17376.m40819(interfaceC20029, abstractC11528, interfaceC13864.mo14574());
        }
        C20775.m47526(interfaceC20029.builder(), new UnderlineSpan(), interfaceC13864.start(), interfaceC13864.end());
    }

    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection mo12251() {
        return Arrays.asList(am.aH, "ins");
    }
}
