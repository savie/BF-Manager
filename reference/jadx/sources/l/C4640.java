package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C4640 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11697 f16393;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f16394 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f16396 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f16395 = new ArrayList();

    public C4640(C11697 c11697) {
        this.f16393 = c11697;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12811() {
        while (!this.f16396.isEmpty() && ((C14644) this.f16396.get(0)).f47887.isEmpty()) {
            this.f16396.remove(0);
        }
        while (!this.f16396.isEmpty() && ((C14644) C19084.m43861(this.f16396, 1)).f47887.isEmpty()) {
            C19028.m43762(this.f16396, 1);
        }
        if (this.f16396.size() == 1 && ((C14644) this.f16396.get(0)).f47887.equals("nop")) {
            this.f16396.clear();
            return;
        }
        if (this.f16396.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f16394;
        arrayList.add(new C3353(this.f16393, arrayList.size(), this.f16396));
        this.f16396 = new ArrayList();
    }
}
