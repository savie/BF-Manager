package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4J0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11792 extends AbstractC13284 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static C20528 f38094 = new C20528(200);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f38095;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11792 m29628(int i, InterfaceC19601 interfaceC19601) {
        C11792 c11792 = (C11792) f38094.m47061();
        if (c11792 != null) {
            c11792.f63511 = i;
            c11792.f38095 = interfaceC19601.getLineNumber();
        } else {
            c11792 = new C11792(i, -2);
            c11792.f38095 = interfaceC19601.getLineNumber();
        }
        if (interfaceC19601 instanceof C4903) {
            ((C4903) interfaceC19601).m15045();
        }
        return c11792;
    }

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2720() {
        f38094.m47060(this);
    }

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4982(C2161 c2161) throws IOException {
        c2161.getClass();
        c2161.write(".line ", 0, 6);
        c2161.m7438(this.f38095);
        return true;
    }
}
