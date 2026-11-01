package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8T9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18801 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13157 f60930;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f60931;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7512 f60932;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IOException f60933;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13863 f60934;

    public /* synthetic */ C18801(C7512 c7512, C13863 c13863, C13157 c13157, IOException iOException, boolean z) {
        this.f60932 = c7512;
        this.f60934 = c13863;
        this.f60930 = c13157;
        this.f60933 = iOException;
        this.f60931 = z;
    }

    @Override // l.InterfaceC1008
    public final void accept(Object obj) {
        InterfaceC20918 interfaceC20918 = (InterfaceC20918) obj;
        C7512 c7512 = this.f60932;
        interfaceC20918.mo2587(c7512.f24996, c7512.f24997, this.f60934, this.f60930, this.f60933, this.f60931);
    }
}
