package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16884 extends AbstractC3810 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17589 f53997;

    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ۙ */
    public final long mo11096() {
        return -1L;
    }

    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ۙ */
    public final void mo11098(long j) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16884(C17589 c17589, C17589 c175810, InterfaceC12984 interfaceC12984) {
        super(c175810, interfaceC12984);
        this.f53997 = c17589;
    }

    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ܰ */
    public final int mo11100() throws IOException {
        C17589 c17589 = this.f53997;
        if (!c17589.m40912()) {
            throw new IOException("load mt extras failed");
        }
        return c17589.f55916.f42260;
    }

    @Override // l.AbstractC3810
    /* JADX INFO: renamed from: ۙ */
    public final void mo11097(int i) {
        this.f53997.m40905(i);
    }
}
