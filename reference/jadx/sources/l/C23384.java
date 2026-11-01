package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23384 implements InterfaceC17074 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9314 f75755;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8597 f75756;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2921 f75757;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f75758;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC8597 f75759;

    public C23384(C2921 c2921, C9314 c9314) {
        this.f75757 = c2921;
        this.f75755 = c9314;
        InterfaceC8597 interfaceC8597M23887 = c9314.m23887(1);
        this.f75759 = interfaceC8597M23887;
        this.f75756 = new C10684(this, interfaceC8597M23887, c9314);
    }

    @Override // l.InterfaceC17074
    /* JADX INFO: renamed from: ۙ */
    public final void mo39858() {
        synchronized (this.f75757) {
            if (this.f75758) {
                return;
            }
            this.f75758 = true;
            this.f75757.getClass();
            C0140.m1231(this.f75759);
            try {
                this.f75755.m23888();
            } catch (IOException unused) {
            }
        }
    }

    @Override // l.InterfaceC17074
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC8597 mo39859() {
        return this.f75756;
    }
}
