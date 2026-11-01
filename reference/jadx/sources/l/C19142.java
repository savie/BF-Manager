package l;

import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.᩵֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19142 extends C12766 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0091 f61826;

    public C19142(C0091 c0091) {
        this.f61826 = c0091;
    }

    @Override // l.C12766, l.InterfaceC19822
    /* JADX INFO: renamed from: ۙ */
    public final void mo31742(InterfaceC12061 interfaceC12061, AbstractC19367 abstractC19367) {
        if (interfaceC12061.length() > 0) {
            interfaceC12061.mo29968();
            float fMo1040 = this.f61826.mo1040(abstractC19367);
            C2657 c2657Builder = interfaceC12061.builder();
            int length = interfaceC12061.length();
            c2657Builder.setSpan(new RelativeSizeSpan(fMo1040), length - 1, length, 33);
        }
    }
}
