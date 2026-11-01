package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J55P */
/* JADX INFO: loaded from: classes2.dex */
public final class C0854 extends AbstractC3676 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC19940 f3502 = new C11439();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4007 f3503;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f3504;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17684 f3505;

    public C0854(C17684 c17684, int i, C4007 c4007) {
        this.f3505 = c17684;
        this.f3504 = i;
        this.f3503 = c4007;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC19940 interfaceC19940;
        String type;
        C18825 c18825M42184 = this.f3505.m41166().m42184(this.f3504);
        int iM43445 = c18825M42184.m43445();
        C4007 c4007 = this.f3503;
        int iMo11507 = c4007.mo11507();
        InterfaceC19940[] interfaceC19940Arr = new InterfaceC19940[iMo11507];
        InterfaceC19940 interfaceC19941 = f3502;
        Arrays.fill(interfaceC19940Arr, interfaceC19941);
        C11770 c11770 = c4007.f14852;
        C19200 c19200 = new C19200(c11770.mo9699(), c11770.m29400(), new C22022(this, c18825M42184, c18825M42184.m43449()));
        int i = 0;
        if (!EnumC15236.STATIC.m36501(c11770.f39510)) {
            interfaceC19940Arr[0] = new C2265(this);
            i = 1;
        }
        while (c19200.hasNext()) {
            interfaceC19940Arr[i] = (InterfaceC19940) c19200.next();
            i++;
        }
        if (i < iMo11507) {
            int i2 = iMo11507 - 1;
            while (true) {
                i--;
                if (i <= -1 || ((type = (interfaceC19940 = interfaceC19940Arr[i]).getType()) != null && ((type.equals("J") || type.equals("D")) && (i2 = i2 - 1) == i))) {
                    break;
                }
                interfaceC19940Arr[i2] = interfaceC19940;
                interfaceC19940Arr[i] = interfaceC19941;
                i2--;
            }
        }
        int iM43447 = c18825M42184.m43447();
        c18825M42184.m43450();
        return new C5088(this, this.f3505, iM43447, iM43445, interfaceC19940Arr);
    }

    @Override // l.AbstractC3676
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterator mo3467() {
        C18825 c18825M42184 = this.f3505.m41166().m42184(this.f3504);
        c18825M42184.m43452();
        return new C22022(this, c18825M42184, c18825M42184.m43449());
    }
}
