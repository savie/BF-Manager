package l;

/* JADX INFO: renamed from: l.֡ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4KU */
/* JADX INFO: loaded from: classes3.dex */
public final class C0121 extends AbstractC15381 implements InterfaceC5766 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f1106;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f1107;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f1108;

    public C0121(String str, String str2, String str3) {
        this.f1107 = str;
        this.f1108 = str2;
        this.f1106 = str3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C0121 m1182(InterfaceC18735 interfaceC18735) {
        if (interfaceC18735 instanceof C0121) {
            return (C0121) interfaceC18735;
        }
        return new C0121(interfaceC18735.mo1183(), interfaceC18735.getName(), interfaceC18735.getType());
    }

    @Override // l.InterfaceC18735
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo1183() {
        return this.f1107;
    }

    @Override // l.InterfaceC18735
    public final String getName() {
        return this.f1108;
    }

    @Override // l.InterfaceC18735
    public final String getType() {
        return this.f1106;
    }
}
