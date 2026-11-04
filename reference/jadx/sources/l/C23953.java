package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩺֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes.dex */
public final class C23953 extends C14255 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Method f77536;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Method f77537;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Method f77538;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Method f77539;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8069 f77540;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Method f77541;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f77542;

    public C23953(C7323 c7323, String str, Class cls, Class cls2, String str2) {
        super(c7323, str, cls, cls2, str2);
        this.f77540 = c7323.m20092();
        this.f77541 = AbstractC9035.m24124(this.f45063, "valueOf", C1357.class);
        this.f77539 = AbstractC9035.m24124(this.f45063, "getValueDescriptor", new Class[0]);
        boolean zM20085 = c7323.m20085();
        this.f77542 = !zM20085;
        if (zM20085) {
            return;
        }
        this.f77537 = AbstractC9035.m24124(cls, C14442.m34865("get", str, "Value"), new Class[0]);
        this.f77536 = AbstractC9035.m24124(cls2, C14442.m34865("get", str, "Value"), new Class[0]);
        this.f77538 = AbstractC9035.m24124(cls2, C14442.m34865("set", str, "Value"), Integer.TYPE);
    }

    @Override // l.C14255, l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10006(AbstractC9035 abstractC9035) {
        if (this.f77542) {
            return this.f77540.m21966(((Integer) AbstractC9035.m24123(this.f77537, abstractC9035, new Object[0])).intValue());
        }
        return AbstractC9035.m24123(this.f77539, this.f45062.m12347(abstractC9035), new Object[0]);
    }

    @Override // l.C14255, l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo10008(AbstractC15001 abstractC15001) {
        if (this.f77542) {
            return this.f77540.m21966(((Integer) AbstractC9035.m24123(this.f77536, abstractC15001, new Object[0])).intValue());
        }
        return AbstractC9035.m24123(this.f77539, this.f45062.m12353(abstractC15001), new Object[0]);
    }

    @Override // l.C14255, l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final void mo30208(AbstractC15001 abstractC15001, Object obj) {
        if (this.f77542) {
            AbstractC9035.m24123(this.f77538, abstractC15001, Integer.valueOf(((C1357) obj).getNumber()));
        } else {
            super.mo30208(abstractC15001, AbstractC9035.m24123(this.f77541, (Object) null, obj));
        }
    }
}
