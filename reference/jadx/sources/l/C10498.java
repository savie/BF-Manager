package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۤ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public final class C10498 extends C18258 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f35962;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f35963;

    public C10498(AbstractC11242 abstractC11242, AbstractC16579 abstractC16579, int i, AbstractC23903 abstractC23903) {
        super(9L, abstractC11242, abstractC16579, abstractC23903);
        this.f35963 = Integer.MIN_VALUE;
        this.f35962 = i;
    }

    @Override // l.C18258, l.AbstractC23903
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2879(InterfaceC11203 interfaceC11203, Locale locale) {
        return interfaceC11203.mo24875(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26644(EnumC18651 enumC18651) {
        if (this.f35963 != Integer.MIN_VALUE && !enumC18651.m43138()) {
            return this.f35963;
        }
        int iM23426 = EnumC9087.m23426(enumC18651, this.f35962);
        this.f35963 = iM23426;
        return iM23426;
    }
}
