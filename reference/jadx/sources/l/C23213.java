package l;

import java.util.HashMap;
import java.util.Queue;

/* JADX INFO: renamed from: l.᩹֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes.dex */
public final class C23213 implements InterfaceC12024 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f75197 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0838 f75198;

    public C23213(C0838 c0838) {
        this.f75198 = c0838;
    }

    @Override // l.InterfaceC12024
    /* JADX INFO: renamed from: ۙ */
    public final void mo30216(C0092 c0092) {
        ((Queue) C11392.computeIfAbsent(this.f75197, c0092.f1006.f10279.f26345.mo9564(), new C15753(0))).add(c0092);
    }

    @Override // l.InterfaceC12024
    /* JADX INFO: renamed from: ۙ */
    public final void mo30217(C3168 c3168) {
        HashMap map = this.f75197;
        if (map.isEmpty()) {
            return;
        }
        C0838 c0838 = this.f75198;
        InterfaceC12024 interfaceC12024 = c0838.f3152;
        try {
            c0838.f3152 = c0838.f3147;
            Queue queue = (Queue) map.get(c3168.f10279.f26345.mo9564());
            while (queue != null && !queue.isEmpty()) {
                c0838.m3340((C0092) queue.remove());
            }
            c0838.f3152 = interfaceC12024;
        } catch (Throwable th) {
            c0838.f3152 = interfaceC12024;
            throw th;
        }
    }
}
