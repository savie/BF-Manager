package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20297 extends AbstractC18805 {
    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo10267() {
        return false;
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ۤ */
    public final void mo10266() {
        this.f61070 = null;
        this.f61068.m39241();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46633(C16567 c16567) {
        C16567 c16568 = this.f61068;
        c16568.f53634.add(c16567);
        c16567.f53625.add(c16568);
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ۙ */
    public final void mo10265() {
        C10445 c10445 = this.f61072;
        if (c10445 instanceof C24618) {
            C16567 c16567 = this.f61068;
            c16567.f53626 = true;
            ArrayList arrayList = c16567.f53625;
            C24618 c24618 = (C24618) c10445;
            int iM54949 = c24618.m54949();
            boolean zM54946 = c24618.m54946();
            int i = 0;
            if (iM54949 == 0) {
                c16567.f53629 = EnumC24773.LEFT;
                while (i < c24618.f44822) {
                    C10445 c10446 = c24618.f44823[i];
                    if (zM54946 || c10446.m26870() != 8) {
                        C16567 c16568 = c10446.f33245.f61068;
                        c16568.f53634.add(c16567);
                        arrayList.add(c16568);
                    }
                    i++;
                }
                m46633(this.f61072.f33245.f61068);
                m46633(this.f61072.f33245.f61071);
                return;
            }
            if (iM54949 == 1) {
                c16567.f53629 = EnumC24773.RIGHT;
                while (i < c24618.f44822) {
                    C10445 c10447 = c24618.f44823[i];
                    if (zM54946 || c10447.m26870() != 8) {
                        C16567 c16569 = c10447.f33245.f61071;
                        c16569.f53634.add(c16567);
                        arrayList.add(c16569);
                    }
                    i++;
                }
                m46633(this.f61072.f33245.f61068);
                m46633(this.f61072.f33245.f61071);
                return;
            }
            if (iM54949 == 2) {
                c16567.f53629 = EnumC24773.TOP;
                while (i < c24618.f44822) {
                    C10445 c10448 = c24618.f44823[i];
                    if (zM54946 || c10448.m26870() != 8) {
                        C16567 c165610 = c10448.f33195.f61068;
                        c165610.f53634.add(c16567);
                        arrayList.add(c165610);
                    }
                    i++;
                }
                m46633(this.f61072.f33195.f61068);
                m46633(this.f61072.f33195.f61071);
                return;
            }
            if (iM54949 != 3) {
                return;
            }
            c16567.f53629 = EnumC24773.BOTTOM;
            while (i < c24618.f44822) {
                C10445 c10449 = c24618.f44823[i];
                if (zM54946 || c10449.m26870() != 8) {
                    C16567 c165611 = c10449.f33195.f61071;
                    c165611.f53634.add(c16567);
                    arrayList.add(c165611);
                }
                i++;
            }
            m46633(this.f61072.f33195.f61068);
            m46633(this.f61072.f33195.f61071);
        }
    }

    @Override // l.AbstractC18805, l.InterfaceC1652
    /* JADX INFO: renamed from: ۙ */
    public final void mo5938(InterfaceC1652 interfaceC1652) {
        C24618 c24618 = (C24618) this.f61072;
        int iM54949 = c24618.m54949();
        C16567 c16567 = this.f61068;
        Iterator it = c16567.f53625.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = ((C16567) it.next()).f53632;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iM54949 == 0 || iM54949 == 2) {
            c16567.mo39242(c24618.m54954() + i2);
        } else {
            c16567.mo39242(c24618.m54954() + i);
        }
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10268() {
        C10445 c10445 = this.f61072;
        if (c10445 instanceof C24618) {
            int iM54949 = ((C24618) c10445).m54949();
            C16567 c16567 = this.f61068;
            if (iM54949 == 0 || iM54949 == 1) {
                this.f61072.m26855(c16567.f53632);
            } else {
                this.f61072.m26836(c16567.f53632);
            }
        }
    }
}
