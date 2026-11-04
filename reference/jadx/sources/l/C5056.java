package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1HV */
/* JADX INFO: loaded from: classes3.dex */
public final class C5056 extends C15496 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11988 f17633;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7381 f17634;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public EnumC14092 f17635;

    @Override // l.C15496, l.AbstractC17734
    /* JADX INFO: renamed from: ܺ */
    public final String mo5151() {
        return "#document";
    }

    public C5056(String str) {
        super(C6023.m17487("#root", C20193.f64825), str, null);
        this.f17634 = new C7381();
        this.f17635 = EnumC14092.noQuirks;
        this.f17633 = new C11988(new C4310());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C5056 m15292(String str) {
        C5056 c5056 = new C5056(str);
        c5056.f17633 = c5056.f17633;
        C15496 c15496M37088 = c5056.m37088("html");
        c15496M37088.m37088("head");
        c15496M37088.m37088("body");
        return c5056;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C15496 m15302() {
        C15496 c15496M37088;
        Iterator it = m37080().iterator();
        do {
            if (!it.hasNext()) {
                c15496M37088 = m37088("html");
                break;
            }
            c15496M37088 = (C15496) it.next();
        } while (!c15496M37088.m37100().equals("html"));
        for (C15496 c15496 : c15496M37088.m37080()) {
            if ("body".equals(c15496.m37100()) || "frameset".equals(c15496.m37100())) {
                return c15496;
            }
        }
        return c15496M37088.m37088("body");
    }

    static {
        new C20961("title");
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo15298() {
        return m37079();
    }

    @Override // l.C15496
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo15297(String str) {
        m15302().mo15297(str);
    }

    @Override // l.C15496, l.AbstractC17734
    /* JADX INFO: renamed from: clone */
    public final Object mo5153clone() {
        C5056 c5056 = (C5056) super.mo5153clone();
        c5056.f17634 = this.f17634.clone();
        return c5056;
    }

    @Override // l.C15496, l.AbstractC17734
    /* JADX INFO: renamed from: clone */
    public final C15496 mo5153clone() {
        C5056 c5056 = (C5056) super.mo5153clone();
        c5056.f17634 = this.f17634.clone();
        return c5056;
    }

    @Override // l.C15496, l.AbstractC17734
    /* JADX INFO: renamed from: clone */
    public final AbstractC17734 mo5153clone() {
        C5056 c5056 = (C5056) super.mo5153clone();
        c5056.f17634 = this.f17634.clone();
        return c5056;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final C5056 m15299() {
        C5056 c5056 = new C5056(mo37098());
        C10363 c10363 = this.f50433;
        if (c10363 != null) {
            c5056.f50433 = c10363.clone();
        }
        c5056.f17634 = this.f17634.clone();
        return c5056;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C7381 m15300() {
        return this.f17634;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15301(C7381 c7381) {
        this.f17634 = c7381;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final EnumC14092 m15293() {
        return this.f17635;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15295(EnumC14092 enumC14092) {
        this.f17635 = enumC14092;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C11988 m15296() {
        return this.f17633;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15294(C11988 c11988) {
        this.f17633 = c11988;
    }
}
