package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۚᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8JY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5540 extends AbstractC0509 implements InterfaceC9753 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f19001;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC9753 f19002;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15246(long j, InterfaceC9753 interfaceC9753, long j2) {
        this.f2202 = j;
        this.f19002 = interfaceC9753;
        if (j2 != C17492.FOREVER_NS) {
            j = j2;
        }
        this.f19001 = j;
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo15243() {
        InterfaceC9753 interfaceC9753 = this.f19002;
        interfaceC9753.getClass();
        return interfaceC9753.mo15243();
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo15245(int i) {
        InterfaceC9753 interfaceC9753 = this.f19002;
        interfaceC9753.getClass();
        return interfaceC9753.mo15245(i) + this.f19001;
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo15244(long j) {
        InterfaceC9753 interfaceC9753 = this.f19002;
        interfaceC9753.getClass();
        return interfaceC9753.mo15244(j - this.f19001);
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List mo15247(long j) {
        InterfaceC9753 interfaceC9753 = this.f19002;
        interfaceC9753.getClass();
        return interfaceC9753.mo15247(j - this.f19001);
    }

    @Override // l.AbstractC0509, l.AbstractC18148
    /* JADX INFO: renamed from: ܰ */
    public final void mo7() {
        super.mo7();
        this.f19002 = null;
    }
}
