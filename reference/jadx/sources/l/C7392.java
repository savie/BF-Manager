package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J4NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7392 extends AbstractC23142 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f24566 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f24567;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17684 f24568;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f24569;

    public C7392(C17684 c17684, int i) {
        this.f24568 = c17684;
        this.f24569 = i;
        C10215 c10215M41165 = c17684.m41165(7);
        if (c10215M41165 != null && i < c10215M41165.m25997()) {
            this.f24567 = (i * 4) + c10215M41165.m25999();
            return;
        }
        throw new C16979(null, "Call site index out of bounds: %d", Integer.valueOf(i));
    }

    @Override // l.InterfaceC18029
    public final String getName() {
        return String.format("call_site_%d", Integer.valueOf(this.f24569));
    }

    @Override // l.InterfaceC18029
    public final int getIndex() {
        return this.f24569;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8152 mo19719() {
        if (m19718().mo17701() < 3) {
            throw new C20749(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        InterfaceC10975 interfaceC10975Mo17703 = m19718().mo17703();
        if (interfaceC10975Mo17703.mo2656() != 22) {
            throw new C20749(null, "Invalid encoded value type (%d) for the first item in call site %d", Integer.valueOf(interfaceC10975Mo17703.mo2656()), Integer.valueOf(this.f24569));
        }
        return ((InterfaceC13528) interfaceC10975Mo17703).getValue();
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List mo19720() {
        ArrayList arrayList = new ArrayList();
        AbstractC14967 abstractC14967M19718 = m19718();
        if (abstractC14967M19718.mo17701() < 3) {
            throw new C20749(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        if (abstractC14967M19718.mo17701() != 3) {
            abstractC14967M19718.mo17700();
            abstractC14967M19718.mo17700();
            abstractC14967M19718.mo17700();
            for (InterfaceC10975 interfaceC10975Mo17703 = abstractC14967M19718.mo17703(); interfaceC10975Mo17703 != null; interfaceC10975Mo17703 = abstractC14967M19718.mo17703()) {
                arrayList.add(interfaceC10975Mo17703);
            }
        }
        return arrayList;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String mo19722() {
        AbstractC14967 abstractC14967M19718 = m19718();
        if (abstractC14967M19718.mo17701() < 3) {
            throw new C20749(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        abstractC14967M19718.mo17700();
        InterfaceC10975 interfaceC10975Mo17703 = abstractC14967M19718.mo17703();
        if (interfaceC10975Mo17703.mo2656() != 23) {
            throw new C20749(null, "Invalid encoded value type (%d) for the second item in call site %d", Integer.valueOf(interfaceC10975Mo17703.mo2656()), Integer.valueOf(this.f24569));
        }
        return ((InterfaceC5060) interfaceC10975Mo17703).getValue();
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19441 mo19721() {
        AbstractC14967 abstractC14967M19718 = m19718();
        if (abstractC14967M19718.mo17701() < 3) {
            throw new C20749(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        abstractC14967M19718.mo17700();
        abstractC14967M19718.mo17700();
        InterfaceC10975 interfaceC10975Mo17703 = abstractC14967M19718.mo17703();
        if (interfaceC10975Mo17703.mo2656() != 21) {
            throw new C20749(null, "Invalid encoded value type (%d) for the second item in call site %d", Integer.valueOf(interfaceC10975Mo17703.mo2656()), Integer.valueOf(this.f24569));
        }
        return ((InterfaceC11411) interfaceC10975Mo17703).getValue();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private AbstractC14967 m19718() {
        int i = this.f24566;
        C17684 c17684 = this.f24568;
        if (i < 0) {
            this.f24566 = c17684.m41166().mo9809(this.f24567);
        }
        return AbstractC14967.m35949(c17684, this.f24566);
    }

    @Override // l.AbstractC8325, l.InterfaceC7446
    /* JADX INFO: renamed from: ۚ */
    public final void mo1997() throws C10269 {
        int i = this.f24569;
        if (i >= 0) {
            C10215 c10215M41165 = this.f24568.m41165(7);
            if (i < (c10215M41165 == null ? 0 : c10215M41165.m25997())) {
                return;
            }
        }
        throw new C10269("callsite@" + i);
    }
}
