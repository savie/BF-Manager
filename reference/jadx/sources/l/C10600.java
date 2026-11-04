package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KQ */
/* JADX INFO: loaded from: classes4.dex */
public class C10600 extends C10445 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f33652 = new ArrayList();

    @Override // l.C10445
    /* JADX INFO: renamed from: ۠ */
    public void mo5339() {
        this.f33652.clear();
        super.mo5339();
    }

    /* JADX INFO: renamed from: ܳۙ */
    public void mo5343() {
        ArrayList arrayList = this.f33652;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C10445 c10445 = (C10445) this.f33652.get(i);
            if (c10445 instanceof C10600) {
                ((C10600) c10445).mo5343();
            }
        }
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ۙ */
    public final void mo26816(C11937 c11937) {
        super.mo26816(c11937);
        int size = this.f33652.size();
        for (int i = 0; i < size; i++) {
            ((C10445) this.f33652.get(i)).mo26816(c11937);
        }
    }
}
