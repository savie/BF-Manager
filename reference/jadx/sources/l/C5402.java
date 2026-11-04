package l;

import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ۚۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5402 extends C4455 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23302 f18896;

    public C5402(C23302 c23302) {
        this.f18896 = c23302;
    }

    @Override // l.C4455, l.InterfaceC22267
    /* JADX INFO: renamed from: ۙ */
    public final void mo14155(InterfaceC20029 interfaceC20029, AbstractC4534 abstractC4534) {
        if (interfaceC20029.length() > 0) {
            interfaceC20029.mo7362();
            float fMo2599 = this.f18896.mo2599(abstractC4534);
            C20775 c20775Builder = interfaceC20029.builder();
            int length = interfaceC20029.length();
            c20775Builder.setSpan(new RelativeSizeSpan(fMo2599), length - 1, length, 33);
        }
    }
}
