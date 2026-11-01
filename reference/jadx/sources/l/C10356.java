package l;

/* JADX INFO: renamed from: l.ۤܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10356 extends C20234 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9548 f35501;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20234 f35502;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractMap, java.util.NavigableMap] */
    public C10356(C20234 c20234, C9548 c9548) {
        super(new C16001(C9548.m24392(), c9548, c20234.f65659, 0), 0);
        this.f35502 = c20234;
        this.f35501 = c9548;
    }

    @Override // l.C20234, l.InterfaceC4981
    /* JADX INFO: renamed from: ۙ */
    public final C9548 mo13812(Integer num) {
        C9548 c9548Mo13812;
        C9548 c9548 = this.f35501;
        if (c9548.m24405(num) && (c9548Mo13812 = this.f35502.mo13812(num)) != null) {
            return c9548Mo13812.m24410(c9548);
        }
        return null;
    }

    @Override // l.C20234
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26252(C9548 c9548) {
        C9548 c9549 = this.f35501;
        C18304.m42518(c9549.m24406(c9548), "Cannot add range %s to subRangeSet(%s)", c9548, c9549);
        this.f35502.mo26252(c9548);
    }

    @Override // l.C20234
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo26254(Integer num) {
        return this.f35501.m24405(num) && this.f35502.mo26254(num);
    }

    @Override // l.C20234
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4981 mo26253(C9548 c9548) {
        C9548 c9549 = this.f35501;
        if (c9548.m24406(c9549)) {
            return this;
        }
        if (c9548.m24408(c9549)) {
            return new C10356(this, c9549.m24410(c9548));
        }
        return C17493.m40758();
    }
}
