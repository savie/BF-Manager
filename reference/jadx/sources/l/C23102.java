package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 87EI */
/* JADX INFO: loaded from: classes.dex */
public final class C23102 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f74897;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74898;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 4;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C23102(int i, long j) {
        this.f74898 = i;
        this.f74897 = j;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f74898);
        c11388.m28740((int) this.f74897);
    }
}
