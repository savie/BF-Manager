package l;

/* JADX INFO: renamed from: l.ܰܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J55P */
/* JADX INFO: loaded from: classes5.dex */
public final class C14662 extends AbstractC15343 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f47948;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f47949;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15125[] f47950;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18392 f47951;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14662(C18392 c18392, C24975 c24975, int i, int i2, InterfaceC15125[] interfaceC15125Arr) {
        super(c24975, i);
        this.f47951 = c18392;
        this.f47950 = interfaceC15125Arr;
        this.f47948 = 0;
        this.f47949 = i2;
    }

    @Override // l.AbstractC15343
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2989(C8565 c8565) {
        InterfaceC15125 interfaceC15125;
        InterfaceC15125 interfaceC15126;
        C24975 c24975 = this.f47951.f59910;
        while (true) {
            int iM22997 = c8565.m22997();
            String strM55822 = null;
            InterfaceC15125[] interfaceC15125Arr = this.f47950;
            boolean z = true;
            switch (iM22997) {
                case 0:
                    m14148();
                    return null;
                case 1:
                    this.f47948 += c8565.m22996();
                    break;
                case 2:
                    this.f47949 += c8565.m23006();
                    break;
                case 3:
                    int iM22996 = c8565.m22996();
                    String strM55803 = c24975.m55803(c8565.m22996() - 1);
                    int iM22998 = c8565.m22996() - 1;
                    if (iM22998 == -1) {
                        c24975.getClass();
                    } else {
                        strM55822 = c24975.m55822(iM22998);
                    }
                    C11219 c11219 = new C11219(strM55803, this.f47948, strM55822, null, iM22996);
                    if (iM22996 >= 0 && iM22996 < interfaceC15125Arr.length) {
                        interfaceC15125Arr[iM22996] = c11219;
                    }
                    return c11219;
                case 4:
                    int iM22999 = c8565.m22996();
                    String strM55804 = c24975.m55803(c8565.m22996() - 1);
                    int iM229910 = c8565.m22996() - 1;
                    if (iM229910 == -1) {
                        c24975.getClass();
                    } else {
                        strM55822 = c24975.m55822(iM229910);
                    }
                    C11219 c112110 = new C11219(strM55804, this.f47948, strM55822, c24975.m55803(c8565.m22996() - 1), iM22999);
                    if (iM22999 >= 0 && iM22999 < interfaceC15125Arr.length) {
                        interfaceC15125Arr[iM22999] = c112110;
                    }
                    return c112110;
                case 5:
                    int iM229911 = c8565.m22996();
                    boolean z2 = false;
                    if (iM229911 >= 0 && iM229911 < interfaceC15125Arr.length) {
                        interfaceC15125 = interfaceC15125Arr[iM229911];
                    } else {
                        interfaceC15125 = C18392.f59907;
                        z = false;
                    }
                    if (interfaceC15125 instanceof InterfaceC22585) {
                        interfaceC15125 = C18392.f59907;
                    } else {
                        z2 = z;
                    }
                    C10078 c10078 = new C10078(interfaceC15125.getName(), this.f47948, interfaceC15125.getType(), interfaceC15125.getSignature(), iM229911);
                    if (z2) {
                        interfaceC15125Arr[iM229911] = c10078;
                    }
                    return c10078;
                case 6:
                    int iM229912 = c8565.m22996();
                    if (iM229912 >= 0 && iM229912 < interfaceC15125Arr.length) {
                        interfaceC15126 = interfaceC15125Arr[iM229912];
                    } else {
                        interfaceC15126 = C18392.f59907;
                    }
                    C2621 c2621 = new C2621(interfaceC15126.getName(), this.f47948, interfaceC15126.getType(), interfaceC15126.getSignature(), iM229912);
                    if (iM229912 >= 0 && iM229912 < interfaceC15125Arr.length) {
                        interfaceC15125Arr[iM229912] = c2621;
                    }
                    return c2621;
                case 7:
                    return new C9332(this.f47948);
                case 8:
                    return new C1130(this.f47948);
                case 9:
                    return new C7096(this.f47948, c24975.m55803(c8565.m22996() - 1));
                default:
                    int i = iM22997 - 10;
                    int i2 = (i / 15) + this.f47948;
                    this.f47948 = i2;
                    int i3 = ((i % 15) - 4) + this.f47949;
                    this.f47949 = i3;
                    return C4903.m15044(i2, i3);
            }
        }
    }
}
