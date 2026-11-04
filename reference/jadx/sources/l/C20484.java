package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20484 implements InterfaceC13025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21230 f65619;

    public C20484(C21230 c21230) {
        this.f65619 = c21230;
    }

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ۙ */
    public final void mo6341(C1356 c1356) {
        m46985((AbstractC5568) c1356);
    }

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ۙ */
    public final void mo6342(C14033 c14033) {
        m46985((AbstractC5568) c14033);
    }

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6343(C1356 c1356) {
        m46985((AbstractC5568) c1356);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46985(AbstractC5568 abstractC5568) {
        C20946 c20946Mo4991 = abstractC5568.mo4991();
        C21230 c21230 = this.f65619;
        if (c20946Mo4991 != null) {
            C3046 c3046M47896 = c20946Mo4991.m47896();
            ArrayList arrayList = (ArrayList) c21230.f67751.get(c3046M47896);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c21230.f67751.put(c3046M47896, arrayList);
            }
            arrayList.add(c20946Mo4991);
        }
        if (abstractC5568 instanceof C1356) {
            if (abstractC5568.mo4988().m43509() == 56) {
                c21230.f67749.add((C1356) abstractC5568);
                return;
            }
            C5284 c5284M9353 = C2847.m9353();
            C18708 c18708M40434 = abstractC5568.mo4993().m40434();
            C0063 c0063Mo4992 = abstractC5568.mo4992();
            c5284M9353.getClass();
            if (c18708M40434.m43505()) {
                int size = c0063Mo4992.size();
                int iM47901 = 0;
                for (int i = 0; i < size; i++) {
                    iM47901 += c0063Mo4992.m31619get(i).m47901();
                }
                if (iM47901 >= 6) {
                    c21230.f67746.add((C1356) abstractC5568);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC5568 instanceof C14033) {
            c21230.f67745.add((C14033) abstractC5568);
        }
    }
}
