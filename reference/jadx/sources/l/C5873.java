package l;

/* JADX INFO: renamed from: l.ۛۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AMS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5873 implements InterfaceC18713 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18713 f20057;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23513 f20058;

    public C5873(InterfaceC18713 interfaceC18713, C23513 c23513) {
        this.f20057 = interfaceC18713;
        this.f20058 = c23513;
    }

    @Override // l.InterfaceC18713
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo16086(InterfaceC8130 interfaceC8130, InterfaceC14771 interfaceC14771) {
        Object objMo16086 = this.f20057.mo16086(new C17162(interfaceC8130, this.f20058), interfaceC14771);
        return objMo16086 == EnumC13214.COROUTINE_SUSPENDED ? objMo16086 : C7321.f24318;
    }
}
