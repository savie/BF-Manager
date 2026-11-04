package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8T9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22331 implements InterfaceC8103 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IOException f72297;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f72298;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15617 f72299;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9893 f72300;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14368 f72301;

    public /* synthetic */ C22331(C15617 c15617, C14368 c14368, C9893 c9893, IOException iOException, boolean z) {
        this.f72299 = c15617;
        this.f72301 = c14368;
        this.f72300 = c9893;
        this.f72297 = iOException;
        this.f72298 = z;
    }

    @Override // l.InterfaceC8103
    public final void accept(Object obj) {
        InterfaceC13380 interfaceC13380 = (InterfaceC13380) obj;
        C15617 c15617 = this.f72299;
        interfaceC13380.mo7210(c15617.f50742, c15617.f50743, this.f72301, this.f72300, this.f72297, this.f72298);
    }
}
