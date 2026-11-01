package l;

import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBI9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12681 implements InterfaceC5520 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17619 f42349;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16251[] f42350;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f42351;

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4612(C6330 c6330) {
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4613(C9859 c9859) {
    }

    public C12681(C17619 c17619, C16251[] c16251Arr, HashSet hashSet) {
        this.f42349 = c17619;
        this.f42350 = c16251Arr;
        this.f42351 = hashSet;
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ܰ */
    public final void mo4614(C6330 c6330) {
        if (c6330.mo17426().m31572() != 3) {
            return;
        }
        int iMo21658 = ((C21665) ((AbstractC22601) c6330.mo17428()).m50100()).mo21658();
        C16251[] c16251Arr = this.f42350;
        C16251 c16251 = c16251Arr[iMo21658];
        if (c16251 == null) {
            c16251Arr[iMo21658] = c6330.m49955();
            return;
        }
        C16251 c16251M49955 = c6330.m49955();
        C19073 c19073M38386 = c16251.m38386();
        C19073 c19073M38387 = c16251M49955.m38386();
        if (c19073M38386 == null) {
            c19073M38386 = c19073M38387;
        } else if (c19073M38387 != null && !c19073M38386.equals(c19073M38387)) {
            return;
        }
        C17619 c17619 = this.f42349;
        c17619.f56023.m11684(c16251.m38400()).m49953(c19073M38386);
        C16914 c16914 = new C16914(this, c16251M49955, c16251);
        List listM11667 = c17619.f56023.m11667(c16251M49955.m38400());
        int size = listM11667.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AbstractC22454) listM11667.get(size)).mo17427(c16914);
            } else {
                this.f42351.add(c6330);
                return;
            }
        }
    }
}
