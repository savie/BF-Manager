package l;

import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۖ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: F4V4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2184 extends AbstractC18413 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f7921;

    public C2184() {
        super(EnumC9947.LOCAL);
    }

    public C2184(int i) {
        super(EnumC9947.LOCAL);
        this.f7921 = i;
    }

    @Override // l.AbstractC18413, l.AbstractC7124
    public final AbstractC7124 clone() {
        C2184 c2184 = new C2184(this.f7921);
        c2184.f23821 = this.f23821;
        return c2184;
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return c10527.m26669(this);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        return am.av + this.f7921;
    }
}
