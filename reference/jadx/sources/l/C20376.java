package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBAF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20376 extends AbstractC4493 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f65346;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21122 f65347;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f65348;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f65349;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 f65350;

    public C20376(C9012 c9012, C21122 c21122, ArrayList arrayList, AbstractC13487 abstractC13487) {
        super(c9012, C0063.f947);
        if (c21122 == null) {
            throw new NullPointerException("user == null");
        }
        if (arrayList == null) {
            throw new NullPointerException("values == null");
        }
        if (arrayList.size() <= 0) {
            throw new IllegalArgumentException("Illegal number of init values");
        }
        this.f65350 = abstractC13487;
        if (abstractC13487 == C1028.f3732 || abstractC13487 == C1028.f3715) {
            this.f65349 = 1;
        } else if (abstractC13487 == C1028.f3728 || abstractC13487 == C1028.f3716) {
            this.f65349 = 2;
        } else if (abstractC13487 == C1028.f3719 || abstractC13487 == C1028.f3721) {
            this.f65349 = 4;
        } else if (abstractC13487 == C1028.f3726 || abstractC13487 == C1028.f3718) {
            this.f65349 = 8;
        } else {
            throw new IllegalArgumentException("Unexpected constant type");
        }
        this.f65347 = c21122;
        this.f65346 = arrayList;
        this.f65348 = arrayList.size();
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8331() {
        return (((this.f65348 * this.f65349) + 1) / 2) + 4;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final void mo8329(C15000 c15000) {
        ArrayList arrayList = this.f65346;
        int size = arrayList.size();
        c15000.m36123(768);
        int i = this.f65349;
        c15000.m36123(i);
        c15000.m36124(this.f65348);
        if (i == 1) {
            for (int i2 = 0; i2 < size; i2++) {
                c15000.m36129((byte) ((AbstractC12214) ((AbstractC13487) arrayList.get(i2))).mo17877());
            }
        } else if (i == 2) {
            for (int i3 = 0; i3 < size; i3++) {
                c15000.m36123((short) ((AbstractC12214) ((AbstractC13487) arrayList.get(i3))).mo17877());
            }
        } else if (i == 4) {
            for (int i4 = 0; i4 < size; i4++) {
                c15000.m36124(((AbstractC12214) ((AbstractC13487) arrayList.get(i4))).mo17877());
            }
        } else if (i == 8) {
            for (int i5 = 0; i5 < size; i5++) {
                c15000.m36112(((AbstractC6249) ((AbstractC13487) arrayList.get(i5))).mo17876());
            }
        }
        if (i != 1 || size % 2 == 0) {
            return;
        }
        c15000.m36129(0);
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo18813(C0063 c0063) {
        return new C20376(m43799(), this.f65347, this.f65346, this.f65350);
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final String mo18812() {
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f65346;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\n    ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC13487) arrayList.get(i)).mo1843());
        }
        return sb.toString();
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ܺ */
    public final String mo8330() {
        int iM43804 = this.f65347.m43804();
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f65346;
        int size = arrayList.size();
        sb.append("fill-array-data-payload // for fill-array-data @ ");
        sb.append(C5306.m15934(iM43804));
        for (int i = 0; i < size; i++) {
            sb.append("\n  ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC13487) arrayList.get(i)).mo1843());
        }
        return sb.toString();
    }
}
