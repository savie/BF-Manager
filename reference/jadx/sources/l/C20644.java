package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes5.dex */
public final class C20644 extends AbstractC5948 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C17355 f66209;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4105 f66210;

    public C20644(C17355 c17355, C4105 c4105) {
        super(c17355.f20376, c17355.m17326(), 0);
        this.f20380 = EnumC5670.record_component_info;
        this.f66209 = c17355;
        this.f66210 = c4105;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11562 m47262() {
        return this.f66209.m17321((InterfaceC3359[]) new C14618[]{this.f20373});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47261(InterfaceC9397 interfaceC9397) throws IOException {
        C4105 c4105 = this.f66210;
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(((C7660) ((C18941) c4105.m13203().f61224).f61428).f67820);
        c11388.m28740(((C7660) ((C18941) c4105.m13203().f61224).f61429).f67820);
        m47262().m29082(c11388);
    }
}
