package l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l.ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB8V */
/* JADX INFO: loaded from: classes2.dex */
public final class C5051 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile ActivityC1086 f17620;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f17621 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14069(InterfaceC21985 interfaceC21985) {
        ActivityC1086 activityC1086 = this.f17620;
        if (activityC1086 != null) {
            interfaceC21985.mo16498(activityC1086);
        }
        this.f17621.add(interfaceC21985);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14068(ActivityC1086 activityC1086) {
        this.f17620 = activityC1086;
        Iterator it = this.f17621.iterator();
        while (it.hasNext()) {
            ((InterfaceC21985) it.next()).mo16498(activityC1086);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14067() {
        this.f17620 = null;
    }
}
