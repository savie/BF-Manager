package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: l.᩺֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9W9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22660 implements InterfaceC3524 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f73811 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f73813 = new HashMap();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f73812 = new LinkedBlockingQueue();

    @Override // l.InterfaceC3524
    /* JADX INFO: renamed from: ۙ */
    public final synchronized InterfaceC4314 mo10387(String str) {
        C6431 c6431;
        c6431 = (C6431) this.f73813.get(str);
        if (c6431 == null) {
            c6431 = new C6431(str, this.f73812, this.f73811);
            this.f73813.put(str, c6431);
        }
        return c6431;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m50196() {
        return new ArrayList(this.f73813.values());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue m50197() {
        return this.f73812;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m50194() {
        this.f73811 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50195() {
        this.f73813.clear();
        this.f73812.clear();
    }
}
