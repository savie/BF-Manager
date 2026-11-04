package l;

/* JADX INFO: renamed from: l.᩻᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25286 implements InterfaceC0818 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81672;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f81673;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f81674;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f81675;

    public /* synthetic */ C25286(C23255 c23255, C23255 c23256, C23255 c23257, int i) {
        this.f81672 = i;
        this.f81674 = c23255;
        this.f81673 = c23256;
        this.f81675 = c23257;
    }

    @Override // l.InterfaceC0818
    public final void accept(Object obj) {
        switch (this.f81672) {
            case 0:
                C2077 c2077 = (C2077) obj;
                this.f81674.mo52335((CharSequence) c2077.m7154());
                this.f81673.mo52335((CharSequence) String.valueOf(c2077.m7155()));
                this.f81675.mo52335((CharSequence) c2077.m7156());
                break;
            default:
                C23400 c23400 = (C23400) obj;
                this.f81674.mo52335((CharSequence) c23400.m52584());
                this.f81673.mo52335((CharSequence) String.valueOf(c23400.m52585()));
                this.f81675.mo52335((CharSequence) c23400.m52586());
                break;
        }
    }
}
