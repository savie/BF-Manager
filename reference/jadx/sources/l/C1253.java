package l;

import java.io.IOException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F7CM */
/* JADX INFO: loaded from: classes3.dex */
public final class C1253 extends C14618 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7660 f4531;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f4532;

    @Override // l.C14618
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1603() {
        return 2;
    }

    public C1253(C15291 c15291, String str) {
        super(c15291, EnumC13127.f41962);
        this.f4531 = null;
        this.f4532 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4535(C15291 c15291, Function function) {
        C7660 c7660M36705 = c15291.m36705(function);
        this.f4531 = c7660M36705;
        String str = this.f4532;
        if (c7660M36705 != null) {
            c7660M36705.f25232.f61224 = str;
        } else {
            this.f4531 = c15291.m36704(str);
        }
    }

    @Override // l.C14618, l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        if (this.f4531 != null) {
            super.mo1599(interfaceC9397);
            ((C11388) interfaceC9397).m28740(this.f4531.f67820);
        }
    }
}
