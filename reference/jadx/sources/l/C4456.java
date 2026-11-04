package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4456 extends EnumC14896 {
    public /* synthetic */ C4456() {
        this(AbstractC0329.MATCH_INSTANCE_STR, 0);
    }

    @Override // l.EnumC14896, l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public /* bridge */ /* synthetic */ boolean mo6416() {
        return true;
    }

    public C4456(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC14896, l.InterfaceC3359
    public int getLength() {
        this.f48662.getClass();
        return this.f48658.getLength() + 6 + this.f48659.getLength() + this.f48660.getLength() + this.f48661.getLength() + this.f48657.getLength();
    }

    @Override // l.EnumC14896, l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        this.f48662.mo1599(interfaceC9397);
        this.f48658.mo1599(interfaceC9397);
        this.f48659.mo1599(interfaceC9397);
        this.f48660.mo1599(interfaceC9397);
        this.f48661.mo1599(interfaceC9397);
        this.f48657.mo1599(interfaceC9397);
    }
}
