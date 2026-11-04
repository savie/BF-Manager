package l;

/* JADX INFO: renamed from: l.᩸ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: P44J */
/* JADX INFO: loaded from: classes.dex */
public final class C22956 implements InterfaceC9772 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ StringBuilder f74565;

    public C22956(StringBuilder sb) {
        this.f74565 = sb;
    }

    @Override // l.InterfaceC9772
    /* JADX INFO: renamed from: ᩷ */
    public final void mo25484(AbstractC17734 abstractC17734, int i) {
        boolean z = abstractC17734 instanceof C12513;
        StringBuilder sb = this.f74565;
        if (z) {
            C12513 c12513 = (C12513) abstractC17734;
            String strM56171 = c12513.m56171();
            if (C15496.m37061(c12513.f58267) || (c12513 instanceof C1415)) {
                sb.append(strM56171);
                return;
            } else {
                C0669.m2900(strM56171, sb, C12513.m31068(sb));
                return;
            }
        }
        if (abstractC17734 instanceof C15496) {
            C15496 c15496 = (C15496) abstractC17734;
            if (sb.length() > 0) {
                if ((c15496.m37074() || c15496.f50435.m17493().equals("br")) && !C12513.m31068(sb)) {
                    sb.append(' ');
                }
            }
        }
    }

    @Override // l.InterfaceC9772
    /* JADX INFO: renamed from: ۙ */
    public final void mo25483(AbstractC17734 abstractC17734, int i) {
        if ((abstractC17734 instanceof C15496) && ((C15496) abstractC17734).m37074() && (abstractC17734.m41541() instanceof C12513)) {
            StringBuilder sb = this.f74565;
            if (C12513.m31068(sb)) {
                return;
            }
            sb.append(' ');
        }
    }
}
