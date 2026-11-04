package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1NH */
/* JADX INFO: loaded from: classes4.dex */
public final class C10457 implements InterfaceC5984 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f33268;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Iterator f33269;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f33270;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f33271;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f33272;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22547 f33273;

    public C10457(InterfaceC21646 interfaceC21646, int i, int i2, int i3, int i4) {
        this.f33269 = interfaceC21646.mo3129();
        this.f33271 = i;
        this.f33268 = i2;
        this.f33270 = i3;
        this.f33272 = i4;
        next();
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo17407() {
        return this.f33273 != null;
    }

    @Override // l.InterfaceC5984
    public final void next() {
        int i;
        int i2;
        this.f33273 = null;
        while (true) {
            Iterator it = this.f33269;
            if (!it.hasNext()) {
                return;
            }
            C22547 c22547 = (C22547) it.next();
            int i3 = c22547.f72891;
            int i4 = c22547.f72894;
            int i5 = c22547.f72893;
            int i6 = this.f33271;
            if (i3 >= i6 && i5 >= (i = this.f33270)) {
                int i7 = c22547.f72892;
                int i8 = this.f33268;
                if (i7 > i8 || i4 > (i2 = this.f33272)) {
                    return;
                }
                C22547 c22548 = new C22547(Math.max(i6, i7) - i6, Math.min(i8, c22547.f72891) - i6, Math.max(i, i4) - i, Math.min(i2, i5) - i);
                if (!c22548.m50782()) {
                    this.f33273 = c22548;
                    return;
                }
            }
        }
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ᩸ */
    public final int mo17411() {
        return this.f33273.f72892;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ᩴ */
    public final int mo17409() {
        return this.f33273.f72894;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ۤ */
    public final int mo17408() {
        return this.f33273.f72891;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ᩷ */
    public final int mo17410() {
        return this.f33273.f72893;
    }
}
