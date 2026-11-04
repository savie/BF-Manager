package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6373 extends AbstractC9950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21523;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f21525;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6373 f21527 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C6373 f21524 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f21526 = new ArrayList();

    public C6373(int i, int i2) {
        this.f21525 = i;
        this.f21523 = i2;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo4114() {
        return this.f21525;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۤ */
    public final int mo4115() {
        return this.f21523 - this.f21525;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ᩷ */
    public final List mo4116() {
        return this.f21526;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6373 m18111(int i) {
        int i2 = this.f21523;
        ArrayList arrayList = this.f21526;
        C6373 c6373 = new C6373();
        c6373.f21527 = null;
        c6373.f21524 = null;
        c6373.f21526 = new ArrayList();
        c6373.f21525 = i;
        c6373.f21523 = i2;
        arrayList.getClass();
        c6373.f21526 = new ArrayList(arrayList);
        this.f21523 = i;
        C6373 c6374 = this.f21524;
        c6374.f21527 = c6373;
        c6373.f21524 = c6374;
        c6373.f21527 = this;
        this.f21524 = c6373;
        return c6373;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18112(C6373 c6373) {
        C6373 c6374 = this.f21527;
        c6374.f21524 = c6373;
        c6373.f21527 = c6374;
        c6373.f21524 = this;
        this.f21527 = c6373;
    }
}
