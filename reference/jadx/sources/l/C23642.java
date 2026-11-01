package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P6LY */
/* JADX INFO: loaded from: classes.dex */
public final class C23642 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20114 f76563;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f76564;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f76565;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f76566;

    public C23642(C17291 c17291) {
        this.f76565 = c17291.f55053;
        this.f76563 = c17291.f55051;
        this.f76564 = new ArrayList(c17291.f55052);
        ArrayList arrayList = new ArrayList(c17291.f55054.size() + 1);
        this.f76566 = arrayList;
        arrayList.addAll(c17291.f55054);
        arrayList.add(new C12353());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52108(AbstractC19367 abstractC19367, StringBuilder sb) {
        C13638.requireNonNull(abstractC19367, "node must not be null");
        C10942 c10942 = new C10942(this, new C14470(sb));
        c10942.m27460(abstractC19367);
        c10942.mo2068(abstractC19367);
        c10942.m27461(abstractC19367);
    }
}
