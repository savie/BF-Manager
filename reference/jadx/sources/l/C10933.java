package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10933 extends AbstractC1002 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24975 f34586;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f34587;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f34588 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f34589;

    public C10933(C24975 c24975, int i) {
        this.f34586 = c24975;
        this.f34589 = i;
        C22122 c22122M55819 = c24975.m55819(7);
        if (c22122M55819 != null && i < c22122M55819.m50079()) {
            this.f34587 = (i * 4) + c22122M55819.m50081();
            return;
        }
        throw new C1854(null, "Call site index out of bounds: %d", Integer.valueOf(i));
    }

    @Override // l.InterfaceC2338
    public final String getName() {
        return String.format("call_site_%d", Integer.valueOf(this.f34589));
    }

    @Override // l.InterfaceC2338
    public final int getIndex() {
        return this.f34589;
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6813 mo7875() {
        if (m27745().mo4474() < 3) {
            throw new C23044(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        InterfaceC16791 interfaceC16791Mo4476 = m27745().mo4476();
        if (interfaceC16791Mo4476.mo5414() != 22) {
            throw new C23044(null, "Invalid encoded value type (%d) for the first item in call site %d", Integer.valueOf(interfaceC16791Mo4476.mo5414()), Integer.valueOf(this.f34589));
        }
        return ((InterfaceC6351) interfaceC16791Mo4476).getValue();
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ۧ */
    public final List mo7876() {
        ArrayList arrayList = new ArrayList();
        AbstractC1239 abstractC1239M27745 = m27745();
        if (abstractC1239M27745.mo4474() < 3) {
            throw new C23044(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        if (abstractC1239M27745.mo4474() != 3) {
            abstractC1239M27745.mo4477();
            abstractC1239M27745.mo4477();
            abstractC1239M27745.mo4477();
            for (InterfaceC16791 interfaceC16791Mo4476 = abstractC1239M27745.mo4476(); interfaceC16791Mo4476 != null; interfaceC16791Mo4476 = abstractC1239M27745.mo4476()) {
                arrayList.add(interfaceC16791Mo4476);
            }
        }
        return arrayList;
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ܺ */
    public final String mo7877() {
        AbstractC1239 abstractC1239M27745 = m27745();
        if (abstractC1239M27745.mo4474() < 3) {
            throw new C23044(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        abstractC1239M27745.mo4477();
        InterfaceC16791 interfaceC16791Mo4476 = abstractC1239M27745.mo4476();
        if (interfaceC16791Mo4476.mo5414() != 23) {
            throw new C23044(null, "Invalid encoded value type (%d) for the second item in call site %d", Integer.valueOf(interfaceC16791Mo4476.mo5414()), Integer.valueOf(this.f34589));
        }
        return ((InterfaceC14553) interfaceC16791Mo4476).getValue();
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC13524 mo7878() {
        AbstractC1239 abstractC1239M27745 = m27745();
        if (abstractC1239M27745.mo4474() < 3) {
            throw new C23044(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        abstractC1239M27745.mo4477();
        abstractC1239M27745.mo4477();
        InterfaceC16791 interfaceC16791Mo4476 = abstractC1239M27745.mo4476();
        if (interfaceC16791Mo4476.mo5414() != 21) {
            throw new C23044(null, "Invalid encoded value type (%d) for the second item in call site %d", Integer.valueOf(interfaceC16791Mo4476.mo5414()), Integer.valueOf(this.f34589));
        }
        return ((InterfaceC24251) interfaceC16791Mo4476).getValue();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private AbstractC1239 m27745() {
        int i = this.f34588;
        C24975 c24975 = this.f34586;
        if (i < 0) {
            this.f34588 = c24975.m55818().mo8719(this.f34587);
        }
        return AbstractC1239.m4473(c24975, this.f34588);
    }

    @Override // l.AbstractC13679, l.InterfaceC10824
    /* JADX INFO: renamed from: ᩴ */
    public final void mo6806() throws C22013 {
        int i = this.f34589;
        if (i >= 0) {
            C22122 c22122M55819 = this.f34586.m55819(7);
            if (i < (c22122M55819 == null ? 0 : c22122M55819.m50079())) {
                return;
            }
        }
        throw new C22013("callsite@" + i);
    }
}
