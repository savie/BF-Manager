package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes3.dex */
public final enum C0805 extends EnumC12801 {
    public /* synthetic */ C0805() {
        this(AbstractC11766.MATCH_INSTANCE_STR, 0);
    }

    @Override // l.EnumC12801, l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public /* bridge */ /* synthetic */ boolean mo2342() {
        return true;
    }

    public C0805(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC12801, l.InterfaceC4705
    public int getLength() {
        this.f42637.getClass();
        return this.f42633.getLength() + 6 + this.f42634.getLength() + this.f42632.getLength() + this.f42636.getLength() + this.f42635.getLength();
    }

    @Override // l.EnumC12801, l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        this.f42637.mo2341(interfaceC19275);
        this.f42633.mo2341(interfaceC19275);
        this.f42634.mo2341(interfaceC19275);
        this.f42632.mo2341(interfaceC19275);
        this.f42636.mo2341(interfaceC19275);
        this.f42635.mo2341(interfaceC19275);
    }
}
