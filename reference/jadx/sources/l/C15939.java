package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6LY */
/* JADX INFO: loaded from: classes5.dex */
public final class C15939 implements InterfaceC1770 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51757;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25197 f51758 = new C25197();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3261 f51759;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23399 f51760;

    public C15939(C23399 c23399, C3261 c3261) {
        this.f51760 = c23399;
        this.f51759 = c3261;
        this.f51757 = new ArrayList(c23399.f75747.size());
        Iterator it = c23399.f75747.iterator();
        while (it.hasNext()) {
            this.f51757.add(((InterfaceC19669) it.next()).create());
        }
        Iterator it2 = c23399.f75749.iterator();
        while (it2.hasNext()) {
            this.f51758.m56173(((InterfaceC11464) it2.next()).mo15151(this));
        }
    }

    @Override // l.InterfaceC1770
    /* JADX INFO: renamed from: ۙ */
    public final LinkedHashMap mo6221(AbstractC4534 abstractC4534, String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it = this.f51757.iterator();
        while (it.hasNext()) {
            ((InterfaceC22653) it.next()).mo8767(abstractC4534, str, linkedHashMap);
        }
        return linkedHashMap;
    }

    @Override // l.InterfaceC1770
    /* JADX INFO: renamed from: ۙ */
    public final C3261 mo6222() {
        return this.f51759;
    }

    @Override // l.InterfaceC1770
    /* JADX INFO: renamed from: ۙ */
    public final void mo6223(AbstractC4534 abstractC4534) {
        this.f51758.m56174(abstractC4534);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m37965(AbstractC4534 abstractC4534) {
        this.f51758.m56175(abstractC4534);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37966(AbstractC4534 abstractC4534) {
        this.f51758.m56172(abstractC4534);
    }
}
