package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩹᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22581 extends C2824 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List f73604;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f73605;

    public C22581(List list, List list2) {
        super(list.size(), list2.size());
        this.f73604 = list;
        this.f73605 = list2;
    }

    @Override // l.C2824, l.AbstractC5647
    /* JADX INFO: renamed from: ۙ */
    public final void mo8576(int i, int i2, int i3, int i4) {
        C20464 c20464M30310 = C12206.m30310(this.f73604, this.f73605, i, i2, i3, i4);
        if (c20464M30310.m46276()) {
            return;
        }
        super.mo8576(c20464M30310.f66401, c20464M30310.f66399, c20464M30310.f66400, c20464M30310.f66402);
    }
}
