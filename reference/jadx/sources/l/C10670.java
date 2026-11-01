package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes4.dex */
public final class C10670 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C9259 f36394;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f36395;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0085 f36396;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 f36397;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0209 f36398;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20255 f36399;

    public C10670(C20255 c20255, C0209 c0209, boolean z, InterfaceC14093 interfaceC14093) {
        super(4, -1);
        if (c0209 == null) {
            throw new NullPointerException("code == null");
        }
        if (interfaceC14093 == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f36399 = c20255;
        this.f36398 = c0209;
        this.f36395 = z;
        this.f36397 = interfaceC14093;
        this.f36396 = null;
        this.f36394 = null;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_CODE_ITEM;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        C16665 c16665M12873 = c4669.m12873();
        C11457 c11457M12877 = c4669.m12877();
        C0209 c0209 = this.f36398;
        if (c0209.m1560() || c0209.m1565()) {
            C9259 c9259 = new C9259(c0209, this.f36395, this.f36399);
            this.f36394 = c9259;
            c16665M12873.m39128((AbstractC12432) c9259);
        }
        if (c0209.m1558()) {
            Iterator it = c0209.m1561().iterator();
            while (it.hasNext()) {
                c11457M12877.m28605((C3320) it.next());
            }
            this.f36396 = new C0085(c0209);
        }
        Iterator it2 = c0209.m1564().iterator();
        while (it2.hasNext()) {
            c4669.m12883((AbstractC9901) it2.next());
        }
    }

    public final String toString() {
        return "CodeItem{" + this.f36399.mo2376() + l.d;
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        return this.f36399.mo2376();
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo19042(C16665 c16665, int i) {
        int iM1026;
        C4669 c4669M52251 = c16665.m52251();
        C5730 c5730 = new C5730(c4669M52251);
        C0209 c0209 = this.f36398;
        c0209.m1562(c5730);
        C0085 c0085 = this.f36396;
        if (c0085 != null) {
            c0085.m1025(c4669M52251);
            iM1026 = this.f36396.m1026();
        } else {
            iM1026 = 0;
        }
        int iM30306 = c0209.m1559().m30306();
        if ((iM30306 & 1) != 0) {
            iM30306++;
        }
        m30903((iM30306 * 2) + 16 + iM1026);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010e  */
    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        int i;
        String string;
        boolean zM8288 = c2718.m8288();
        C0209 c0209 = this.f36398;
        int iM30307 = c0209.m1559().m30307();
        int iM30305 = c0209.m1559().m30305();
        boolean z = this.f36395;
        C20255 c20255 = this.f36399;
        int iM24602 = c20255.m29453(z).m6222().m24602();
        int iM30306 = c0209.m1559().m30306();
        boolean z2 = (iM30306 & 1) != 0;
        C0085 c0085 = this.f36396;
        int iM1023 = c0085 == null ? 0 : c0085.m1023();
        C9259 c9259 = this.f36394;
        int iM30904 = c9259 == null ? 0 : c9259.m30904();
        if (zM8288) {
            c2718.m8283(0, m30901() + ' ' + c20255.mo2376());
            c2718.m8283(2, "  registers_size: ".concat(C22475.m49982(iM30307)));
            c2718.m8283(2, "  ins_size:       ".concat(C22475.m49982(iM24602)));
            c2718.m8283(2, "  outs_size:      ".concat(C22475.m49982(iM30305)));
            c2718.m8283(2, "  tries_size:     ".concat(C22475.m49982(iM1023)));
            c2718.m8283(4, "  debug_off:      ".concat(C22475.m49978(iM30904)));
            c2718.m8283(4, "  insns_size:     ".concat(C22475.m49978(iM30306)));
            InterfaceC14093 interfaceC14093 = this.f36397;
            if (interfaceC14093.size() != 0) {
                StringBuilder sb = new StringBuilder("  throws ");
                int size = interfaceC14093.size();
                if (size == 0) {
                    string = "<empty>";
                } else {
                    StringBuilder sb2 = new StringBuilder(100);
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = size;
                        if (i2 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(interfaceC14093.getType(i2).mo2376());
                        i2++;
                        size = i3;
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                c2718.m8283(0, sb.toString());
            } else {
                c20255 = c20255;
            }
        } else {
            c20255 = c20255;
        }
        c2718.m8297(iM30307);
        c2718.m8297(iM24602);
        c2718.m8297(iM30305);
        c2718.m8297(iM1023);
        c2718.m8289(iM30904);
        c2718.m8289(iM30306);
        try {
            c0209.m1559().m30304(c2718);
            if (this.f36396 != null) {
                if (z2) {
                    if (zM8288) {
                        c2718.m8283(2, "  padding: 0");
                    }
                    i = 0;
                    c2718.m8297(0);
                } else {
                    i = 0;
                }
                this.f36396.m1024(c2718);
            } else {
                i = 0;
            }
            if (!zM8288 || this.f36394 == null) {
                return;
            }
            c2718.m8283(i, "  debug info");
            this.f36394.m23784(c4669, c2718);
        } catch (RuntimeException e) {
            throw C7513.m20020("...while writing instructions for " + c20255.mo2376(), e);
        }
    }
}
