package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: l.ܰܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J9W9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14742 implements InterfaceC11759 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f48157 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f48158 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f48156 = new LinkedBlockingQueue();

    @Override // l.InterfaceC11759
    /* JADX INFO: renamed from: ۙ */
    public final synchronized InterfaceC25186 mo18415(String str) {
        C4302 c4302;
        c4302 = (C4302) this.f48158.get(str);
        if (c4302 == null) {
            c4302 = new C4302(str, this.f48156, this.f48157);
            this.f48158.put(str, c4302);
        }
        return c4302;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m35429() {
        return new ArrayList(this.f48158.values());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue m35430() {
        return this.f48156;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m35431() {
        this.f48157 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35428() {
        this.f48158.clear();
        this.f48156.clear();
    }
}
