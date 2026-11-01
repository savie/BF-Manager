package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P6LY */
/* JADX INFO: loaded from: classes4.dex */
public final class C10942 implements InterfaceC0357 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23642 f37208;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37209;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17559 f37210 = new C17559();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14470 f37211;

    public C10942(C23642 c23642, C14470 c14470) {
        this.f37208 = c23642;
        this.f37211 = c14470;
        this.f37209 = new ArrayList(c23642.f76564.size());
        Iterator it = c23642.f76564.iterator();
        while (it.hasNext()) {
            this.f37209.add(((InterfaceC7413) it.next()).create());
        }
        Iterator it2 = c23642.f76566.iterator();
        while (it2.hasNext()) {
            this.f37210.m40829(((InterfaceC16586) it2.next()).mo10137(this));
        }
    }

    @Override // l.InterfaceC0357
    /* JADX INFO: renamed from: ۙ */
    public final LinkedHashMap mo2066(AbstractC19367 abstractC19367, String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it = this.f37209.iterator();
        while (it.hasNext()) {
            ((InterfaceC10236) it.next()).mo26029(abstractC19367, str, linkedHashMap);
        }
        return linkedHashMap;
    }

    @Override // l.InterfaceC0357
    /* JADX INFO: renamed from: ۙ */
    public final C14470 mo2067() {
        return this.f37211;
    }

    @Override // l.InterfaceC0357
    /* JADX INFO: renamed from: ۙ */
    public final void mo2068(AbstractC19367 abstractC19367) {
        this.f37210.m40831(abstractC19367);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m27460(AbstractC19367 abstractC19367) {
        this.f37210.m40832(abstractC19367);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27461(AbstractC19367 abstractC19367) {
        this.f37210.m40830(abstractC19367);
    }
}
