package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۜ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public final class C7395 extends C10377 {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f24375;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f24376;

    public C7395(AbstractC19728 abstractC19728, AbstractC22664 abstractC22664, int i, AbstractC11781 abstractC11781) {
        super(9L, abstractC19728, abstractC22664, abstractC11781);
        this.f24376 = Integer.MIN_VALUE;
        this.f24375 = i;
    }

    @Override // l.C10377, l.AbstractC11781
    /* JADX INFO: renamed from: ۙ */
    public final Object mo16953(InterfaceC2087 interfaceC2087, Locale locale) {
        return interfaceC2087.mo7178(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20311(EnumC21461 enumC21461) {
        if (this.f24376 != Integer.MIN_VALUE && !enumC21461.m48825()) {
            return this.f24376;
        }
        int iM23763 = EnumC8886.m23763(enumC21461, this.f24375);
        this.f24376 = iM23763;
        return iM23763;
    }
}
