package l;

/* JADX INFO: renamed from: l.᩷ۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: N44J */
/* JADX INFO: loaded from: classes5.dex */
public final class C20622 extends AbstractC12156 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17094 f67172;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4603 f67173;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4476 f67174;

    @Override // l.AbstractC12156
    /* JADX INFO: renamed from: ܰ */
    public final void mo30243() {
        mo30242();
        Object obj = this.f67173.f16299;
        C6171.m17176(((C16389) obj).f52735.m43728() % 2 == 0);
        ((C16389) obj).f52735.m43723(Integer.valueOf(this.f67172.f54548.m25383()));
    }

    @Override // l.AbstractC12156
    /* JADX INFO: renamed from: ۨ */
    public final void mo30242() {
        C17094 c17094 = this.f67172;
        if (c17094.f54548.m25355()) {
            C4476 c4476 = this.f67174;
            c4476.mo5374();
            c17094.f54548.m25378(195);
            C8628 c8628 = c17094.f54548.f34303;
            int i = c4476.f15926;
            int i2 = c8628.f29775 - 1;
            c8628.f29775 = i2;
            C6171.m17176(c8628.f29780[i2] == i);
            c8628.f29780[c8628.f29775] = -1;
        }
    }

    public C20622(C17094 c17094, C4603 c4603, C4476 c4476) {
        this.f67172 = c17094;
        this.f67173 = c4603;
        this.f67174 = c4476;
    }
}
