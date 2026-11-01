package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1HV */
/* JADX INFO: loaded from: classes4.dex */
public final class C10497 extends C0617 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C19669 f35959;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC9086 f35960;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C13756 f35961;

    @Override // l.C0617, l.AbstractC14730
    /* JADX INFO: renamed from: ܶ */
    public final String mo2863() {
        return "#document";
    }

    public C10497(String str) {
        super(C11639.m29046("#root", C4582.f16236), str, null);
        this.f35959 = new C19669();
        this.f35960 = EnumC9086.noQuirks;
        this.f35961 = new C13756(new C5247());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C10497 m26634(String str) {
        C10497 c10497 = new C10497(str);
        c10497.f35961 = c10497.f35961;
        C0617 c0617M2829 = c10497.m2829("html");
        c0617M2829.m2829("head");
        c0617M2829.m2829("body");
        return c10497;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C0617 m26640() {
        C0617 c0617M2829;
        Iterator it = m2857().iterator();
        do {
            if (!it.hasNext()) {
                c0617M2829 = m2829("html");
                break;
            }
            c0617M2829 = (C0617) it.next();
        } while (!c0617M2829.m2833().equals("html"));
        for (C0617 c0617 : c0617M2829.m2857()) {
            if ("body".equals(c0617.m2833()) || "frameset".equals(c0617.m2833())) {
                return c0617;
            }
        }
        return c0617M2829.m2829("body");
    }

    static {
        new C1344("title");
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo26643() {
        return m2850();
    }

    @Override // l.C0617
    /* JADX INFO: renamed from: ܶ */
    public final void mo2864(String str) {
        m26640().mo2864(str);
    }

    @Override // l.C0617, l.AbstractC14730
    /* JADX INFO: renamed from: clone */
    public final Object mo2874clone() {
        C10497 c10497 = (C10497) super.mo2874clone();
        c10497.f35959 = this.f35959.clone();
        return c10497;
    }

    @Override // l.C0617, l.AbstractC14730
    /* JADX INFO: renamed from: clone */
    public final C0617 mo2874clone() {
        C10497 c10497 = (C10497) super.mo2874clone();
        c10497.f35959 = this.f35959.clone();
        return c10497;
    }

    @Override // l.C0617, l.AbstractC14730
    /* JADX INFO: renamed from: clone */
    public final AbstractC14730 mo2874clone() {
        C10497 c10497 = (C10497) super.mo2874clone();
        c10497.f35959 = this.f35959.clone();
        return c10497;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final C10497 m26639() {
        C10497 c10497 = new C10497(mo2853());
        C15436 c15436 = this.f2679;
        if (c15436 != null) {
            c10497.f2679 = c15436.clone();
        }
        c10497.f35959 = this.f35959.clone();
        return c10497;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C19669 m26641() {
        return this.f35959;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26638(C19669 c19669) {
        this.f35959 = c19669;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC9086 m26642() {
        return this.f35960;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26635(EnumC9086 enumC9086) {
        this.f35960 = enumC9086;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final C13756 m26637() {
        return this.f35961;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26636(C13756 c13756) {
        this.f35961 = c13756;
    }
}
