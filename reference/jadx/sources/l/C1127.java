package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1127 extends AbstractC0578 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f4196;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f4197;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9329 f4198;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C14769 f4199 = C14769.m35543();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C2920 f4200;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f4201;

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1949(AbstractC8036 abstractC8036) {
        this.f4201 = this.f4198.f30324.f58739.f48263;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        if (!c5887.f26659.m51067(EnumC21172.ERROR)) {
            this.f4201 = c5887.f26659;
        } else {
            this.f4201 = m4170(c5887.f20169, this.f4200.f9550).f38067;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        if (!c23041.f26659.m51067(EnumC21172.ERROR)) {
            this.f4201 = c23041.f26659;
            return;
        }
        boolean z = this.f4196;
        try {
            this.f4196 = false;
            c23041.f74776.mo2284(this);
            AbstractC22664 abstractC22664 = this.f4201;
            this.f4196 = z;
            this.f4201 = m4170(c23041.f74774, abstractC22664.f73596).f38067;
        } catch (Throwable th) {
            this.f4196 = z;
            throw th;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1973(C25191 c25191) {
        if (!c25191.f26659.m51067(EnumC21172.ERROR)) {
            this.f4201 = c25191.f26659;
            return;
        }
        c25191.f81425.mo2284(this);
        C10510 c10510 = (C10510) this.f4201;
        if (this.f4199.contains(c10510.f73596)) {
            C24550 c24550 = (C24550) c10510.f73596;
            int iM35551 = c25191.f81424.m35551();
            C17929 c17929 = this.f4198.f30324;
            C10510 c10511 = (C10510) c24550.f38067;
            C11972.m30026(c10511.f33438.isEmpty());
            if (iM35551 == 1) {
                AbstractC22712 abstractC22712 = c17929.f58729.f49864;
                abstractC22712.getClass();
                char[] charArray = "T".toCharArray();
                c10511.f33438 = c10511.f33438.m35552(new C17969(c24550, c17929.f58739.f48241, abstractC22712.mo2069(charArray, charArray.length)));
            } else {
                while (iM35551 > 0) {
                    c10511.f33438 = c10511.f33438.m35552(new C17969(c24550, c17929.f58739.f48241, c17929.f58729.f49864.m51194(C13645.m33382(iM35551, "T"))));
                    iM35551--;
                }
            }
        }
        C14769 c14769 = c25191.f81424;
        C18499 c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            ((AbstractC8036) it.next()).mo2284(this);
            c18499.m43089(this.f4201);
        }
        this.f4201 = new C19026(c10510.f73596, c25191.f26659, c18499.m43093());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 m4170(AbstractC19728 abstractC19728, AbstractC11781 abstractC11781) {
        C24550 c24550 = new C24550(this.f4196 ? 512 : 0, abstractC19728, abstractC11781);
        c24550.f79576 = new C14654(c24550);
        c24550.f38067 = new C10075(this.f4197, c24550);
        this.f4199 = this.f4199.m35552(c24550);
        return c24550;
    }

    public C1127(AbstractC9329 abstractC9329, C2920 c2920, AbstractC22664 abstractC22664, boolean z) {
        this.f4198 = abstractC9329;
        this.f4200 = c2920;
        this.f4197 = abstractC22664;
        this.f4196 = z;
    }
}
