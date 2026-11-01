package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6AA */
/* JADX INFO: loaded from: classes4.dex */
public final class C7974 extends AbstractC15030 implements InterfaceC16441, InterfaceC19263 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f26186;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C0212 f26187;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C23805 f26188;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Object f26189;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17063 f26190;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f26191;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f26192;

    public C7974(C18557 c18557) {
        C23805 c23805 = new C23805();
        this.f26186 = false;
        this.f26192 = 0;
        this.f26191 = c18557;
        this.f26188 = c23805;
        C0212 c0212 = new C0212();
        c0212.f1381 = true;
        c0212.f1386 = c18557;
        c0212.f1383 = c18557;
        c0212.f1385 = new C22791();
        c0212.f1384 = c23805.m52463(2, "DOWN");
        c0212.f1382 = c23805.m52463(3, "UP");
        c0212.f1387 = c23805.m52463(-1, "EOF");
        this.f26187 = c0212;
    }

    @Override // l.AbstractC15030
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object mo21037() {
        C0212 c0212 = this.f26187;
        Object next = c0212.next();
        if (next == c0212.f1382) {
            int i = this.f26192 - 1;
            this.f26192 = i;
            if (i == 0 && this.f26186) {
                return c0212.next();
            }
        } else if (next == c0212.f1384) {
            this.f26192++;
        }
        if (this.f26192 == 0) {
            this.f26188.getClass();
            if (((InterfaceC19969) next).mo41440()) {
                this.f26186 = true;
                c0212.next();
                this.f26192++;
                return c0212.next();
            }
        }
        return next;
    }

    @Override // l.AbstractC15030, l.C22791
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object mo21035() {
        Object objMo21035 = super.mo21035();
        if (this.f74178 == 0 && m21039(this.f49003)) {
            this.f26189 = this.f49003;
        }
        return objMo21035;
    }

    @Override // l.AbstractC15030
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo21034(Object obj) {
        this.f26188.getClass();
        return (obj == null ? 0 : ((InterfaceC19969) obj).getType()) == -1;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3739 m21031() {
        return this.f26190;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21033(C17063 c17063) {
        this.f26190 = c17063;
    }

    @Override // l.InterfaceC16441
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23805 mo21036() {
        return this.f26188;
    }

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo21038(int i) {
        Object objM36017 = m36017(i);
        this.f26188.getClass();
        if (objM36017 == null) {
            return 0;
        }
        return ((InterfaceC19969) objM36017).getType();
    }

    @Override // l.InterfaceC19263
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo21032(boolean z) {
        Object obj;
        int i = this.f74178;
        ArrayList arrayList = this.f74176;
        Object obj2 = arrayList.get(i);
        if (m21039(obj2)) {
            return obj2;
        }
        if (!z) {
            return null;
        }
        int i2 = this.f74178;
        do {
            i2--;
            if (i2 >= 0) {
                obj = arrayList.get(i2);
            } else {
                return this.f26189;
            }
        } while (!m21039(obj));
        return obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m21039(Object obj) {
        this.f26188.getClass();
        InterfaceC12913 interfaceC12913 = obj instanceof C18557 ? ((C18557) obj).f59042 : null;
        return interfaceC12913 != null && interfaceC12913.getLine() > 0;
    }
}
