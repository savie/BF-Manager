package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DK */
/* JADX INFO: loaded from: classes3.dex */
public final class C4105 extends AbstractC5948 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21588 f13971;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1195 f13972;

    public C4105(C17355 c17355, int i, C21588 c21588) {
        super(c17355.f20376, (C1122) c17355.m17326(), i);
        this.f20380 = EnumC5670.field_info;
        this.f13971 = c21588;
        if (EnumC16856.m39778(i)) {
            m17322();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21588 m13203() {
        return this.f13971;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13202(C7660 c7660) {
        this.f13972 = new C1195(this.f20376, EnumC13127.f41953, c7660);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1195 m13201() {
        return this.f13972;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13200(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f20372);
        C21588 c21588 = this.f13971;
        c11388.m28740(((C7660) ((C18941) c21588.f61224).f61428).f67820);
        c11388.m28740(((C7660) ((C18941) c21588.f61224).f61429).f67820);
        m17321(this.f13972, this.f20371, this.f20378, this.f20373).m29082(c11388);
    }
}
