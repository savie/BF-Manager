package l;

/* JADX INFO: renamed from: l.ۜܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public final class C7275 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23967;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f23968;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1309 f23969;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f23970;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f23971;

    public C7275(InterfaceC1309 interfaceC1309, C12495 c12495) {
        this.f23969 = interfaceC1309;
        this.f23968 = C4994.m15219(c12495.f40118);
        this.f23971 = c12495.f40123;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19917(String str) {
        InterfaceC1309 interfaceC1309 = this.f23969;
        boolean z = this.f23971;
        int i = this.f23968;
        if (i == 2) {
            if (this.f23967 || !z) {
                String str2 = this.f23970;
                if (str2 != null) {
                    interfaceC1309.mo4778(str2);
                    this.f23970 = null;
                }
                interfaceC1309.mo4776();
            }
            this.f23967 = false;
            this.f23970 = str;
            return;
        }
        if (!z || this.f23967) {
            if (i == 0) {
                interfaceC1309.mo4778(str);
            }
            interfaceC1309.mo4776();
            this.f23967 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19915() {
        int i = this.f23968;
        InterfaceC1309 interfaceC1309 = this.f23969;
        boolean z = this.f23971;
        if (i == 2) {
            if (this.f23967 || !z) {
                String str = this.f23970;
                if (str != null) {
                    interfaceC1309.mo4778(str);
                    this.f23970 = null;
                }
                interfaceC1309.mo4776();
                return;
            }
            return;
        }
        if (this.f23967 || !z) {
            interfaceC1309.mo4776();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19916(char c) {
        String str = this.f23970;
        InterfaceC1309 interfaceC1309 = this.f23969;
        if (str != null) {
            interfaceC1309.mo4778(str);
            this.f23970 = null;
        }
        interfaceC1309.mo4780(c);
        this.f23967 = true;
    }
}
