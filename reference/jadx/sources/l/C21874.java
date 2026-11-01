package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBEJ */
/* JADX INFO: loaded from: classes5.dex */
public class C21874 implements InterfaceC23307 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18346 f70972;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12018 f70973;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22580 f70974;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20671 f70975;

    public C21874(C18346 c18346, C22580 c22580) {
        this.f70972 = c18346;
        this.f70974 = c22580;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48657(C12018 c12018, C20671 c20671) {
        this.f70973 = c12018;
        this.f70975 = c20671;
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ */
    public void mo8606(C10607 c10607) {
        AbstractC16438 c19052;
        C12723 c12723M37181 = c10607.m37181();
        if (c12723M37181.m31572() == 54 || c12723M37181.m31572() == 56) {
            return;
        }
        C11312 c11312M37183 = c10607.m37183();
        C17143 c17143M18908 = C7057.m18908(c10607);
        int iM31577 = c12723M37181.m31577();
        if (iM31577 == 1 || iM31577 == 2) {
            c19052 = new C19052(c17143M18908, c11312M37183, C18346.m42600(c10607));
        } else {
            if (iM31577 == 3) {
                return;
            }
            if (iM31577 != 4) {
                if (iM31577 != 6) {
                    throw new RuntimeException("shouldn't happen");
                }
                c19052 = new C19052(c17143M18908, c11312M37183, C18346.m42600(c10607));
            } else {
                c19052 = new C9175(c17143M18908, c11312M37183, C18346.m42600(c10607), this.f70972.f58517.m21027(this.f70973.m29916().get(1)));
            }
        }
        m48658(c19052);
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ */
    public void mo8605(C9196 c9196) {
        C11312 c11312M37183 = c9196.m37183();
        C17143 c17143M18908 = C7057.m18908(c9196);
        C12723 c12723M37181 = c9196.m37181();
        int iM31572 = c12723M37181.m31572();
        if (c12723M37181.m31577() != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        if (iM31572 == 3) {
            C18346 c18346 = this.f70972;
            if (c18346.f58514) {
                return;
            }
            C16251 c16251M37185 = c9196.m37185();
            m48658(new C19052(c17143M18908, c11312M37183, C0727.m3149(c16251M37185, C16251.m38381((c18346.f58520 - c18346.f58522) + ((C21665) c9196.m50100()).mo21658(), c16251M37185.getType()))));
            return;
        }
        m48658(new C15733(c17143M18908, c11312M37183, C18346.m42600(c9196), c9196.m50100()));
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ */
    public void mo8609(C24012 c24012) {
        C11312 c11312M37183 = c24012.m37183();
        C4129 c4129M52843 = c24012.m52843();
        C4129 c4129M29916 = this.f70973.m29916();
        int size = c4129M52843.size();
        int size2 = c4129M29916.size();
        int iM29918 = this.f70973.m29918();
        if (size != size2 - 1 || iM29918 != c4129M29916.get(size)) {
            throw new RuntimeException("shouldn't happen");
        }
        C20671[] c20671Arr = new C20671[size];
        for (int i = 0; i < size; i++) {
            c20671Arr[i] = this.f70972.f58517.m21027(c4129M29916.get(i));
        }
        C20671 c20671 = new C20671(c11312M37183, false);
        C20671 c20672 = new C20671(this.f70975.m38701(), true);
        C19758 c19758 = new C19758(c11312M37183, c20672, c4129M52843, c20671Arr);
        AbstractC16438 c9175 = new C9175(c19758.m44951() ? C5854.f19832 : C5854.f19954, c11312M37183, C18346.m42600(c24012), c20671);
        m48658(c20672);
        m48658(c9175);
        m48659(new C5646(c11312M37183));
        m48659(c20671);
        m48659(c19758);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16251 m48656() {
        int iM29918 = this.f70973.m29918();
        if (iM29918 < 0) {
            return null;
        }
        AbstractC15546 abstractC15546M15274get = this.f70972.f58519.m41141().m15553(iM29918).m29911().m15274get(0);
        if (abstractC15546M15274get.m37181().m31572() != 56) {
            return null;
        }
        return abstractC15546M15274get.m37185();
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ */
    public final void mo8608(C18367 c18367) {
        C11312 c11312M37183 = c18367.m37183();
        C17143 c17143M18908 = C7057.m18908(c18367);
        C12723 c12723M37181 = c18367.m37181();
        if (c12723M37181.m31577() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c12723M37181.m31577());
        }
        if (!c12723M37181.m31571()) {
            throw new RuntimeException("Expected call-like operation");
        }
        m48658(this.f70975);
        m48658(new C2823(c17143M18908, c11312M37183, c18367.m37186(), new AbstractC9901[]{c18367.m42615(), c18367.m42616()}));
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ */
    public void mo8607(C14840 c14840) {
        AbstractC16438 c15733;
        AbstractC16438 abstractC16438M50088;
        int iM40071;
        C11312 c11312M37183 = c14840.m37183();
        C17143 c17143M18908 = C7057.m18908(c14840);
        C12723 c12723M37181 = c14840.m37181();
        AbstractC9901 abstractC9901M50100 = c14840.m50100();
        if (c12723M37181.m31577() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c12723M37181.m31577());
        }
        m48658(this.f70975);
        if (c12723M37181.m31571()) {
            m48658(new C15733(c17143M18908, c11312M37183, c14840.m37186(), abstractC9901M50100));
            return;
        }
        C16251 c16251M48656 = m48656();
        C0727 c0727M42605 = C18346.m42605(c14840, c16251M48656);
        if ((c17143M18908.m40068() || c12723M37181.m31572() == 43) != (c16251M48656 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + c14840);
        }
        if (c12723M37181.m31572() == 41 && c17143M18908.m40071() != 35) {
            c15733 = new C19052(c17143M18908, c11312M37183, c0727M42605);
        } else {
            c15733 = new C15733(c17143M18908, c11312M37183, c0727M42605, abstractC9901M50100);
        }
        C22580 c22580 = this.f70974;
        int iM50091 = c22580.m50091() - 1;
        while (true) {
            if (iM50091 < 0) {
                abstractC16438M50088 = null;
                break;
            }
            abstractC16438M50088 = c22580.m50088(iM50091);
            if (abstractC16438M50088.m38693().m40071() != -1) {
                break;
            } else {
                iM50091--;
            }
        }
        if (c17143M18908.m40071() == 32 && abstractC16438M50088 != null && (((iM40071 = abstractC16438M50088.m38693().m40071()) == 7 || iM40071 == 8 || iM40071 == 9) && c15733.m38695().size() > 0 && abstractC16438M50088.m38695().size() > 1 && c15733.m38695().m15275get(0).m38400() == abstractC16438M50088.m38695().m15275get(1).m38400())) {
            m48658(new C19052(C5854.f19891, c11312M37183, C0727.f3015));
        }
        m48658(c15733);
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ */
    public void mo8603(C2138 c2138) {
        C11312 c11312M37183 = c2138.m37183();
        C17143 c17143M18908 = C7057.m18908(c2138);
        if (c2138.m37181().m31577() != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        C16251 c16251M48656 = m48656();
        if (c17143M18908.m40068() != (c16251M48656 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + c2138);
        }
        m48658(this.f70975);
        m48658(new C19052(c17143M18908, c11312M37183, C18346.m42605(c2138, c16251M48656)));
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ */
    public final void mo8604(C4255 c4255) {
        C11312 c11312M37183 = c4255.m37183();
        AbstractC9901 abstractC9901M12019 = c4255.m12019();
        ArrayList arrayListM12018 = c4255.m12018();
        if (c4255.m37181().m31577() == 1) {
            C20671 c20671 = new C20671(c11312M37183, false);
            AbstractC16438 c18554 = new C18554(c11312M37183, this.f70975, arrayListM12018, abstractC9901M12019);
            AbstractC16438 c9175 = new C9175(C5854.f19935, c11312M37183, C18346.m42600(c4255), c20671);
            m48658(this.f70975);
            m48658(c9175);
            m48659(new C5646(c11312M37183));
            m48659(c20671);
            m48659(c18554);
            return;
        }
        throw new RuntimeException("shouldn't happen");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48658(AbstractC16438 abstractC16438) {
        this.f70974.m50089(abstractC16438);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48659(AbstractC16438 abstractC16438) {
        this.f70974.m50092(abstractC16438);
    }
}
