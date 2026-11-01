package l;

/* JADX INFO: renamed from: l.ܺ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P44J */
/* JADX INFO: loaded from: classes4.dex */
public final class C16141 implements InterfaceC23218 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ StringBuilder f52150;

    public C16141(StringBuilder sb) {
        this.f52150 = sb;
    }

    @Override // l.InterfaceC23218
    /* JADX INFO: renamed from: ܰ */
    public final void mo20359(AbstractC14730 abstractC14730, int i) {
        boolean z = abstractC14730 instanceof C13715;
        StringBuilder sb = this.f52150;
        if (z) {
            C13715 c13715 = (C13715) abstractC14730;
            String strM28139 = c13715.m28139();
            if (C0617.m2826(c13715.f48150) || (c13715 instanceof C21785)) {
                sb.append(strM28139);
                return;
            } else {
                C4145.m11784(strM28139, sb, C13715.m33422(sb));
                return;
            }
        }
        if (abstractC14730 instanceof C0617) {
            C0617 c0617 = (C0617) abstractC14730;
            if (sb.length() > 0) {
                if ((c0617.m2844() || c0617.f2677.m29052().equals("br")) && !C13715.m33422(sb)) {
                    sb.append(' ');
                }
            }
        }
    }

    @Override // l.InterfaceC23218
    /* JADX INFO: renamed from: ۙ */
    public final void mo20358(AbstractC14730 abstractC14730, int i) {
        if ((abstractC14730 instanceof C0617) && ((C0617) abstractC14730).m2844() && (abstractC14730.m35273() instanceof C13715)) {
            StringBuilder sb = this.f52150;
            if (C13715.m33422(sb)) {
                return;
            }
            sb.append(' ');
        }
    }
}
