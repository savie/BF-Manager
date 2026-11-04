package l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l.۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: DB8V */
/* JADX INFO: loaded from: classes4.dex */
public final class C13385 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile ActivityC5577 f42670;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f42671 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33009(InterfaceC5928 interfaceC5928) {
        ActivityC5577 activityC5577 = this.f42670;
        if (activityC5577 != null) {
            interfaceC5928.mo5165(activityC5577);
        }
        this.f42671.add(interfaceC5928);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33008(ActivityC5577 activityC5577) {
        this.f42670 = activityC5577;
        Iterator it = this.f42671.iterator();
        while (it.hasNext()) {
            ((InterfaceC5928) it.next()).mo5165(activityC5577);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33007() {
        this.f42670 = null;
    }
}
