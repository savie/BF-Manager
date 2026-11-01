package l;

/* JADX INFO: renamed from: l.ۚۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J55P */
/* JADX INFO: loaded from: classes3.dex */
public final class C5088 extends AbstractC19906 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19940[] f17739;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f17740;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f17741;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0854 f17742;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5088(C0854 c0854, C17684 c17684, int i, int i2, InterfaceC19940[] interfaceC19940Arr) {
        super(c17684, i);
        this.f17742 = c0854;
        this.f17739 = interfaceC19940Arr;
        this.f17741 = 0;
        this.f17740 = i2;
    }

    @Override // l.AbstractC19906
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5043(C18825 c18825) {
        InterfaceC19940 interfaceC19940;
        InterfaceC19940 interfaceC19941;
        C17684 c17684 = this.f17742.f3505;
        while (true) {
            int iM43453 = c18825.m43453();
            String strM41204 = null;
            InterfaceC19940[] interfaceC19940Arr = this.f17739;
            boolean z = true;
            switch (iM43453) {
                case 0:
                    m25170();
                    return null;
                case 1:
                    this.f17741 += c18825.m43449();
                    break;
                case 2:
                    this.f17740 += c18825.m43456();
                    break;
                case 3:
                    int iM43449 = c18825.m43449();
                    String strM41164 = c17684.m41164(c18825.m43449() - 1);
                    int iM434410 = c18825.m43449() - 1;
                    if (iM434410 == -1) {
                        c17684.getClass();
                    } else {
                        strM41204 = c17684.m41204(iM434410);
                    }
                    C7177 c7177 = new C7177(strM41164, this.f17741, strM41204, null, iM43449);
                    if (iM43449 >= 0 && iM43449 < interfaceC19940Arr.length) {
                        interfaceC19940Arr[iM43449] = c7177;
                    }
                    return c7177;
                case 4:
                    int iM434411 = c18825.m43449();
                    String strM41165 = c17684.m41164(c18825.m43449() - 1);
                    int iM434412 = c18825.m43449() - 1;
                    if (iM434412 == -1) {
                        c17684.getClass();
                    } else {
                        strM41204 = c17684.m41204(iM434412);
                    }
                    C7177 c7178 = new C7177(strM41165, this.f17741, strM41204, c17684.m41164(c18825.m43449() - 1), iM434411);
                    if (iM434411 >= 0 && iM434411 < interfaceC19940Arr.length) {
                        interfaceC19940Arr[iM434411] = c7178;
                    }
                    return c7178;
                case 5:
                    int iM434413 = c18825.m43449();
                    boolean z2 = false;
                    if (iM434413 >= 0 && iM434413 < interfaceC19940Arr.length) {
                        interfaceC19940 = interfaceC19940Arr[iM434413];
                    } else {
                        interfaceC19940 = C0854.f3502;
                        z = false;
                    }
                    if (interfaceC19940 instanceof InterfaceC20645) {
                        interfaceC19940 = C0854.f3502;
                    } else {
                        z2 = z;
                    }
                    C22700 c22700 = new C22700(interfaceC19940.getName(), this.f17741, interfaceC19940.getType(), interfaceC19940.getSignature(), iM434413);
                    if (z2) {
                        interfaceC19940Arr[iM434413] = c22700;
                    }
                    return c22700;
                case 6:
                    int iM434414 = c18825.m43449();
                    if (iM434414 >= 0 && iM434414 < interfaceC19940Arr.length) {
                        interfaceC19941 = interfaceC19940Arr[iM434414];
                    } else {
                        interfaceC19941 = C0854.f3502;
                    }
                    C17760 c17760 = new C17760(interfaceC19941.getName(), this.f17741, interfaceC19941.getType(), interfaceC19941.getSignature(), iM434414);
                    if (iM434414 >= 0 && iM434414 < interfaceC19940Arr.length) {
                        interfaceC19940Arr[iM434414] = c17760;
                    }
                    return c17760;
                case 7:
                    return new C21288(this.f17741);
                case 8:
                    return new C14939(this.f17741);
                case 9:
                    return new C7883(this.f17741, c17684.m41164(c18825.m43449() - 1));
                default:
                    int i = iM43453 - 10;
                    int i2 = (i / 15) + this.f17741;
                    this.f17741 = i2;
                    int i3 = ((i % 15) - 4) + this.f17740;
                    this.f17740 = i3;
                    return C8617.m22392(i2, i3);
            }
        }
    }
}
