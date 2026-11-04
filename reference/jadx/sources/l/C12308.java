package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M7DZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12308 extends C14618 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7660 f39575;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C15291 f39576;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7660 f39577;

    @Override // l.C14618
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1603() {
        return 4;
    }

    public C12308(C15291 c15291, C7660 c7660, C7660 c7661) {
        super(c15291, EnumC13127.f41952);
        this.f39576 = c15291;
        this.f39577 = c7660;
        this.f39575 = c7661;
    }

    @Override // l.C14618, l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        super.mo1599(interfaceC9397);
        boolean zMo20871 = this.f39577.mo20871();
        C15291 c15291 = this.f39576;
        if (!zMo20871) {
            this.f39577 = c15291.m36713(this.f39577);
            if (!c15291.m36717().m25835(Integer.valueOf(this.f39577.f67820))) {
                c15291.f49997.m4163("\"{0}\" not found in Constant Pool", this.f39577);
                throw null;
            }
        }
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f39577.f67820);
        C7660 c7660 = this.f39575;
        if (c7660 != null && !c7660.mo20871()) {
            this.f39575 = c15291.m36713(this.f39575);
            if (!c15291.m36717().m25835(Integer.valueOf(this.f39575.f67820))) {
                c15291.f49997.m4163("\"{0}\" not found in Constant Pool", this.f39575);
                throw null;
            }
        }
        C7660 c7661 = this.f39575;
        c11388.m28740(c7661 != null ? c7661.f67820 : 0);
    }
}
