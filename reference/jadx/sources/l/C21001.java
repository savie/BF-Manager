package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6G3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21001 extends AbstractC20255 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C18959 f67159;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C12050 f67160;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67161;

    public C21001(C12050 c12050, C18959 c18959) {
        super(c12050);
        this.f67161 = new ArrayList();
        this.f67159 = c18959;
        this.f67160 = new C12050(this);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C18959 m48015() {
        return this.f67159;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList m48017() {
        return this.f67161;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12050 m48016() {
        return this.f67160;
    }

    @Override // l.InterfaceC18213
    /* JADX INFO: renamed from: ܿ */
    public final List mo19035() {
        return this.f67160.mo19035();
    }

    @Override // l.AbstractC20255, l.InterfaceC6281
    /* JADX INFO: renamed from: ۙ */
    public final void mo1987(C13476 c13476, InterfaceC3145 interfaceC3145) {
        c13476.m33158(this, interfaceC3145);
    }

    @Override // l.InterfaceC6281
    /* JADX INFO: renamed from: ᩻ */
    public final String mo1988() {
        return Integer.toHexString(this.f67159.getOffset());
    }

    public final String toString() {
        return "Synchronized:" + this.f67160;
    }
}
