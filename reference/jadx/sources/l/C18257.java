package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1HS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18257 extends AbstractC11202 {
    @Override // l.AbstractC11202, l.AbstractC14730
    /* JADX INFO: renamed from: ۖ */
    public final /* bridge */ /* synthetic */ int mo2831() {
        return 0;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ܰ */
    public final void mo2861(Appendable appendable, int i, C19669 c19669) {
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ܶ */
    public final String mo2863() {
        return "#comment";
    }

    @Override // l.AbstractC11202, l.AbstractC14730
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC14730 mo2867() {
        return this;
    }

    public C18257(String str) {
        this.f37918 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11598 m42447() {
        String strM28139 = m28139();
        String strM46498 = C20630.m46498(1, 1, strM28139);
        if (strM46498.length() > 1 && (strM46498.startsWith("!") || strM46498.startsWith("?"))) {
            return null;
        }
        String strM38890 = C16523.m38890("<", strM46498, ">");
        C13756 c13756 = new C13756(new C5247());
        c13756.m33520();
        C10497 c10497M33517 = c13756.m33517(strM38890, super.mo2853());
        if (c10497M33517.m26640().m2846().size() <= 0) {
            return null;
        }
        C0617 c0617M2828 = c10497M33517.m26640().m2828();
        C11598 c11598 = new C11598(C2028.m6519(c10497M33517).m33519().m12729(c0617M2828.m2837()), strM28139.startsWith("!"));
        c11598.mo2839().m36938(c0617M2828.mo2839());
        return c11598;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m42448() {
        String strM28139 = m28139();
        if (strM28139.length() > 1) {
            return strM28139.startsWith("!") || strM28139.startsWith("?");
        }
        return false;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۙ */
    public final void mo2842(Appendable appendable, int i, C19669 c19669) throws IOException {
        if (c19669.m44800() && this.f48151 == 0) {
            AbstractC14730 abstractC14730 = this.f48150;
            if ((abstractC14730 instanceof C0617) && ((C0617) abstractC14730).m2860().m29050()) {
                AbstractC14730.m35260(appendable, i, c19669);
            }
        }
        appendable.append("<!--").append(m28139()).append("-->");
    }

    @Override // l.AbstractC14730
    public final String toString() {
        return mo26643();
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: clone */
    public final Object mo2874clone() {
        return (C18257) super.mo2874clone();
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: clone */
    public final AbstractC14730 mo2874clone() {
        return (C18257) super.mo2874clone();
    }
}
