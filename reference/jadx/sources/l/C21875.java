package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1NH */
/* JADX INFO: loaded from: classes5.dex */
public final class C21875 implements InterfaceC17144 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20464 f70976;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f70977;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f70978;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Iterator f70979;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f70980;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f70981;

    public C21875(InterfaceC13409 interfaceC13409, int i, int i2, int i3, int i4) {
        this.f70979 = interfaceC13409.mo11890();
        this.f70978 = i;
        this.f70977 = i2;
        this.f70981 = i3;
        this.f70980 = i4;
        next();
    }

    @Override // l.InterfaceC17144
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo34577() {
        return this.f70976 != null;
    }

    @Override // l.InterfaceC17144
    public final void next() {
        int i;
        int i2;
        this.f70976 = null;
        while (true) {
            Iterator it = this.f70979;
            if (!it.hasNext()) {
                return;
            }
            C20464 c20464 = (C20464) it.next();
            int i3 = c20464.f66400;
            int i4 = c20464.f66399;
            int i5 = c20464.f66402;
            int i6 = this.f70978;
            if (i3 >= i6 && i5 >= (i = this.f70981)) {
                int i7 = c20464.f66401;
                int i8 = this.f70977;
                if (i7 > i8 || i4 > (i2 = this.f70980)) {
                    return;
                }
                C20464 c20465 = new C20464(Math.max(i6, i7) - i6, Math.min(i8, c20464.f66400) - i6, Math.max(i, i4) - i, Math.min(i2, i5) - i);
                if (!c20465.m46276()) {
                    this.f70976 = c20465;
                    return;
                }
            }
        }
    }

    @Override // l.InterfaceC17144
    /* JADX INFO: renamed from: ۖ */
    public final int mo34576() {
        return this.f70976.f66401;
    }

    @Override // l.InterfaceC17144
    /* JADX INFO: renamed from: ۚ */
    public final int mo34578() {
        return this.f70976.f66399;
    }

    @Override // l.InterfaceC17144
    /* JADX INFO: renamed from: ۨ */
    public final int mo34579() {
        return this.f70976.f66400;
    }

    @Override // l.InterfaceC17144
    /* JADX INFO: renamed from: ܰ */
    public final int mo34580() {
        return this.f70976.f66402;
    }
}
