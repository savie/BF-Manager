package l;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98O4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15711 extends AbstractC6537 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f50995 = new HashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19706 f50996;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Handler f50997;

    /* JADX INFO: renamed from: ۙ */
    public int mo5888(int i, Object obj) {
        return i;
    }

    /* JADX INFO: renamed from: ۙ */
    public long mo5889(long j, Object obj) {
        return j;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract C15274 mo5890(Object obj, C15274 c15274);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5891(Object obj, AbstractC6537 abstractC6537, AbstractC16511 abstractC16511);

    @Override // l.AbstractC6537
    /* JADX INFO: renamed from: ۙ */
    public void mo4110(InterfaceC19706 interfaceC19706) {
        this.f50996 = interfaceC19706;
        this.f50997 = C17983.m41832((Handler.Callback) null);
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ܰ */
    public void mo4111() {
        Iterator it = this.f50995.values().iterator();
        while (it.hasNext()) {
            ((C20649) it.next()).f67220.mo4111();
        }
    }

    @Override // l.AbstractC6537
    /* JADX INFO: renamed from: ᩹ */
    public final void mo17769() {
        for (C20649 c20649 : this.f50995.values()) {
            c20649.f67220.mo17761(c20649.f67219);
        }
    }

    @Override // l.AbstractC6537
    /* JADX INFO: renamed from: ۚ */
    public final void mo17763() {
        for (C20649 c20649 : this.f50995.values()) {
            c20649.f67220.mo17764(c20649.f67219);
        }
    }

    @Override // l.AbstractC6537
    /* JADX INFO: renamed from: ۘ */
    public void mo4104() {
        HashMap map = this.f50995;
        for (C20649 c20649 : map.values()) {
            InterfaceC18095 interfaceC18095 = c20649.f67220;
            C7243 c7243 = c20649.f67221;
            interfaceC18095.mo17768(c20649.f67219);
            interfaceC18095.mo17760((InterfaceC20918) c7243);
            interfaceC18095.mo17758((InterfaceC16262) c7243);
        }
        map.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ۤۙܰ, l.᩸ܰܰ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37415(final Object obj, InterfaceC18095 interfaceC18095) {
        HashMap map = this.f50995;
        C2023.m6507(!map.containsKey(obj));
        ?? r1 = new InterfaceC21623() { // from class: l.ۤۙܰ
            @Override // l.InterfaceC21623
            /* JADX INFO: renamed from: ۙ */
            public final void mo18265(AbstractC6537 abstractC6537, AbstractC16511 abstractC16511) {
                this.f34394.mo5891(obj, abstractC6537, abstractC16511);
            }
        };
        C7243 c7243 = new C7243(this, obj);
        map.put(obj, new C20649(interfaceC18095, r1, c7243));
        Handler handler = this.f50997;
        handler.getClass();
        interfaceC18095.mo17757(handler, (InterfaceC20918) c7243);
        Handler handler2 = this.f50997;
        handler2.getClass();
        interfaceC18095.mo17756(handler2, (InterfaceC16262) c7243);
        interfaceC18095.mo17762((InterfaceC21623) r1, this.f50996, m17753());
        if (m17765()) {
            return;
        }
        interfaceC18095.mo17764(r1);
    }
}
