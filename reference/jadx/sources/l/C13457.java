package l;

/* JADX INFO: renamed from: l.۫᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4KU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13457 extends AbstractC9204 implements InterfaceC25392 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f42839;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f42840;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f42841;

    public C13457(String str, String str2, String str3) {
        this.f42839 = str;
        this.f42841 = str2;
        this.f42840 = str3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13457 m33096(InterfaceC8304 interfaceC8304) {
        if (interfaceC8304 instanceof C13457) {
            return (C13457) interfaceC8304;
        }
        return new C13457(interfaceC8304.mo4500(), interfaceC8304.getName(), interfaceC8304.getType());
    }

    @Override // l.InterfaceC8304
    /* JADX INFO: renamed from: ܳ */
    public final String mo4500() {
        return this.f42839;
    }

    @Override // l.InterfaceC8304
    public final String getName() {
        return this.f42841;
    }

    @Override // l.InterfaceC8304
    public final String getType() {
        return this.f42840;
    }
}
