package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C18737 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3168 f60895;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18499 f60896 = new C18499();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC8036 f60897;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0838 f60898;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1496(C4197 c4197) {
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
    }

    @Override // l.C23174
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5474(AbstractC8036 abstractC8036) {
        if (abstractC8036 != null) {
            for (AbstractC7550 abstractC7550 : this.f60898.f3150) {
                if (abstractC7550.f24903.f3156.contains(abstractC7550.f24902) && abstractC8036.m21911(abstractC7550.f24904) && abstractC7550.mo12357(abstractC8036)) {
                    Iterator it = abstractC7550.mo12358(abstractC8036).iterator();
                    while (it.hasNext()) {
                        this.f60896.m43089(new C0092(this.f60898, this.f60897, abstractC8036, (AbstractC8036) it.next(), abstractC7550, this.f60895));
                    }
                    break;
                }
            }
        }
        super.mo5474(abstractC8036);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1507(C8671 c8671) {
        mo5474(c8671.f28314);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1502(C6545 c6545) {
        mo5474(c6545.f21979);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1522(C20057 c20057) {
        mo5474(c20057.f64458);
        m52092(c20057.f64455);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1504(C7180 c7180) {
        mo5474(c7180.f23711);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1517(C15493 c15493) {
        mo5474(c15493.f50422);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1511(C11764 c11764) {
        mo5474(c11764.f38022);
        m52092(c11764.f38025);
        mo5474(c11764.f38024);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1492(C2158 c2158) {
        mo5474(c2158.f7114);
    }

    public C18737(C0838 c0838, AbstractC8036 abstractC8036, C3168 c3168) {
        this.f60898 = c0838;
        this.f60897 = abstractC8036;
        c0838.f3155.getClass();
        this.f60895 = C0310.m1922(c3168);
    }
}
