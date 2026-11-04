package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17035 implements InterfaceC5652 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7099 f55656;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f55657;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3611 f55658;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC7099 f55659;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16092 f55660;

    public C17035(C3611 c3611, C16092 c16092) {
        this.f55658 = c3611;
        this.f55660 = c16092;
        InterfaceC7099 interfaceC7099M38246 = c16092.m38246(1);
        this.f55659 = interfaceC7099M38246;
        this.f55656 = new C25241(this, interfaceC7099M38246, c16092);
    }

    @Override // l.InterfaceC5652
    /* JADX INFO: renamed from: ۙ */
    public final void mo16638() {
        synchronized (this.f55658) {
            if (this.f55657) {
                return;
            }
            this.f55657 = true;
            this.f55658.getClass();
            C19822.m45601(this.f55659);
            try {
                this.f55660.m38247();
            } catch (IOException unused) {
            }
        }
    }

    @Override // l.InterfaceC5652
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC7099 mo16639() {
        return this.f55656;
    }
}
