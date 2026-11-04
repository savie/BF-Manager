package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7970 extends AbstractC21654 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 f26500;

    public C7970(AbstractC22664 abstractC22664, C14769 c14769) {
        super(abstractC22664);
        this.f26500 = c14769;
    }

    @Override // l.AbstractC21654
    /* JADX INFO: renamed from: ۙ */
    public final void mo12192(InterfaceC14940 interfaceC14940) {
        ((InterfaceC8715) interfaceC14940).mo18302(this);
    }

    @Override // l.InterfaceC19466
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        sb.append((CharSequence) this.f69124.f73596.mo29582());
        sb.append("/*proxy*/{");
        boolean z = true;
        C14769 c14769 = this.f26500;
        while (c14769.m35550()) {
            C5558 c5558 = (C5558) c14769.f48335;
            if (!z) {
                sb.append(",");
            }
            sb.append((CharSequence) c5558.f19300);
            sb.append("=");
            sb.append(c5558.f19301);
            c14769 = c14769.f48336;
            z = false;
        }
        sb.append(l.d);
        return sb.toString();
    }
}
