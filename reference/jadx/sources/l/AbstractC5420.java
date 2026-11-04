package l;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 98O4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5420 extends AbstractC9395 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashMap f18911 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC4639 f18912;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Handler f18913;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo16146(int i, Object obj) {
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long mo16147(long j, Object obj) {
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C8402 mo16148(Object obj, C8402 c8402);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo16149(Object obj, AbstractC9395 abstractC9395, AbstractC24755 abstractC24755);

    @Override // l.AbstractC9395
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo16151(InterfaceC4639 interfaceC4639) {
        this.f18912 = interfaceC4639;
        this.f18913 = C7116.m19479((Handler.Callback) null);
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo16154() {
        Iterator it = this.f18911.values().iterator();
        while (it.hasNext()) {
            ((C12877) it.next()).f41211.mo16154();
        }
    }

    @Override // l.AbstractC9395
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo16152() {
        for (C12877 c12877 : this.f18911.values()) {
            c12877.f41211.mo24724(c12877.f41210);
        }
    }

    @Override // l.AbstractC9395
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo16153() {
        for (C12877 c12877 : this.f18911.values()) {
            c12877.f41211.mo24730(c12877.f41210);
        }
    }

    @Override // l.AbstractC9395
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo16145() {
        HashMap map = this.f18911;
        for (C12877 c12877 : map.values()) {
            InterfaceC13622 interfaceC13622 = c12877.f41211;
            C15114 c15114 = c12877.f41212;
            interfaceC13622.mo24735(c12877.f41210);
            interfaceC13622.mo24726((InterfaceC13380) c15114);
            interfaceC13622.mo24723((InterfaceC5537) c15114);
        }
        map.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ۜۙ᩷, l.ᩴۙ᩷] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16150(final Object obj, InterfaceC13622 interfaceC13622) {
        HashMap map = this.f18911;
        C20782.m47565(!map.containsKey(obj));
        ?? r1 = new InterfaceC6911() { // from class: l.ᩴۙ᩷
            @Override // l.InterfaceC6911
            /* JADX INFO: renamed from: ۙ */
            public final void mo19189(AbstractC9395 abstractC9395, AbstractC24755 abstractC24755) {
                this.f63166.mo16149(obj, abstractC9395, abstractC24755);
            }
        };
        C15114 c15114 = new C15114(this, obj);
        map.put(obj, new C12877(interfaceC13622, r1, c15114));
        Handler handler = this.f18913;
        handler.getClass();
        interfaceC13622.mo24722(handler, (InterfaceC13380) c15114);
        Handler handler2 = this.f18913;
        handler2.getClass();
        interfaceC13622.mo24721(handler2, (InterfaceC5537) c15114);
        interfaceC13622.mo24725((InterfaceC6911) r1, this.f18912, m24732());
        if (m24729()) {
            return;
        }
        interfaceC13622.mo24730(r1);
    }
}
