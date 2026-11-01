package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I8YZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19656 implements InterfaceC19408 {
    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ۙ */
    public final char mo4729() {
        return '~';
    }

    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ۨ */
    public final char mo4732() {
        return '~';
    }

    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ܰ */
    public final int mo4733() {
        return 1;
    }

    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ۙ */
    public final int mo4730(C15113 c15113, C15113 c15114) {
        ArrayList arrayList = c15113.f49359;
        int size = arrayList.size();
        ArrayList arrayList2 = c15114.f49359;
        if (size != arrayList2.size() || arrayList.size() > 2) {
            return 0;
        }
        C17250 c17250M36201 = c15113.m36201();
        if (arrayList.size() == 1) {
            c17250M36201.getClass();
        } else {
            c17250M36201.getClass();
        }
        C18244 c18244 = new C18244();
        C16545 c16545 = new C16545();
        c16545.m38949(c15113.m36202(arrayList.size()));
        for (AbstractC19367 abstractC19367 : C7372.m19640(c17250M36201, (C17250) arrayList2.get(0))) {
            c18244.m44388(abstractC19367);
            c16545.m38948(abstractC19367.m44394());
        }
        c16545.m38949(c15114.m36199(arrayList2.size()));
        c18244.m44384(c16545.m38947());
        c17250M36201.m44393(c18244);
        return arrayList.size();
    }
}
