package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܿۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76AL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17055 extends AbstractC18908 implements InterfaceC5766 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f54458;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f54459;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f54460;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f54461;

    public C17055(String str, String str2, String str3, List list) {
        this.f54459 = str;
        this.f54461 = str2;
        this.f54458 = C1532.m5304(list);
        this.f54460 = str3;
    }

    public C17055(String str, String str2, AbstractC22433 abstractC22433) {
        this.f54459 = str;
        this.f54461 = str2;
        this.f54458 = abstractC22433 == null ? AbstractC22433.of() : abstractC22433;
        this.f54460 = "V";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17055 m39832(InterfaceC8858 interfaceC8858) {
        if (interfaceC8858 instanceof C17055) {
            return (C17055) interfaceC8858;
        }
        return new C17055(interfaceC8858.mo9700(), interfaceC8858.getName(), interfaceC8858.mo9698(), interfaceC8858.mo9699());
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩹ */
    public final String mo9700() {
        return this.f54459;
    }

    @Override // l.InterfaceC8858
    public final String getName() {
        return this.f54461;
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩳ */
    public final List mo9699() {
        return this.f54458;
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ۖ */
    public final String mo9698() {
        return this.f54460;
    }
}
