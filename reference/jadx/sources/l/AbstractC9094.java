package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9094 implements InterfaceC19408 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char f31008;

    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ܰ */
    public final int mo4733() {
        return 1;
    }

    public AbstractC9094(char c) {
        this.f31008 = c;
    }

    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ۨ */
    public final char mo4732() {
        return this.f31008;
    }

    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ۙ */
    public final char mo4729() {
        return this.f31008;
    }

    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ۙ */
    public final int mo4730(C15113 c15113, C15113 c15114) {
        AbstractC19367 c5255;
        ArrayList arrayList = c15114.f49359;
        if ((c15113.m36200() || c15114.m36203()) && c15114.m36198() % 3 != 0) {
            if ((c15114.m36198() + c15113.m36198()) % 3 == 0) {
                return 0;
            }
        }
        int size = c15113.f49359.size();
        char c = this.f31008;
        int i = 2;
        if (size < 2 || arrayList.size() < 2) {
            String.valueOf(c);
            c5255 = new C5255();
            i = 1;
        } else {
            String.valueOf(c);
            c5255 = new C12312();
        }
        C16545 c16545 = new C16545();
        c16545.m38949(c15113.m36202(i));
        C17250 c17250M36201 = c15113.m36201();
        for (AbstractC19367 abstractC19367 : C7372.m19640(c17250M36201, (C17250) arrayList.get(0))) {
            c5255.m44388(abstractC19367);
            c16545.m38948(abstractC19367.m44394());
        }
        c16545.m38949(c15114.m36199(i));
        c5255.m44384(c16545.m38947());
        c17250M36201.m44393(c5255);
        return i;
    }
}
