package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9295 implements InterfaceC7322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f30227;

    public C9295(ArrayList arrayList) {
        this.f30227 = arrayList;
    }

    @Override // l.InterfaceC7322
    /* JADX INFO: renamed from: ۙ */
    public final void mo20078(C14033 c14033) {
        C0063 c0063Mo4992 = c14033.mo4992();
        C20946 c20946M16508 = c14033.m16508();
        int size = c0063Mo4992.size();
        for (int i = 0; i < size; i++) {
            ((C19738) this.f30227.get(c14033.m34186(i))).m45458(c20946M16508, c0063Mo4992.m31619get(i));
        }
    }
}
