package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۛ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C6053 extends C12018 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Method f20701;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Method f20702;

    public C6053(Class cls, Class cls2, String str) {
        super(cls, cls2, str);
        this.f20702 = AbstractC9035.m24124(this.f38748, "newBuilder", new Class[0]);
        this.f20701 = AbstractC9035.m24124(cls2, C14442.m34865("get", str, "Builder"), Integer.TYPE);
    }

    @Override // l.C12018, l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final void mo10007(AbstractC15001 abstractC15001, int i, Object obj) {
        if (!this.f38748.isInstance(obj)) {
            obj = ((InterfaceC14299) AbstractC9035.m24123(this.f20702, (Object) null, new Object[0])).mergeFrom((InterfaceC21013) obj).build();
        }
        super.mo10007(abstractC15001, i, obj);
    }

    @Override // l.C12018, l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10010(AbstractC15001 abstractC15001, Object obj) {
        if (!this.f38748.isInstance(obj)) {
            obj = ((InterfaceC14299) AbstractC9035.m24123(this.f20702, (Object) null, new Object[0])).mergeFrom((InterfaceC21013) obj).build();
        }
        super.mo10010(abstractC15001, obj);
    }

    @Override // l.C12018, l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14299 mo17567() {
        return (InterfaceC14299) AbstractC9035.m24123(this.f20702, (Object) null, new Object[0]);
    }

    @Override // l.C12018, l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14299 mo17568(AbstractC15001 abstractC15001, int i) {
        return (InterfaceC14299) AbstractC9035.m24123(this.f20701, abstractC15001, Integer.valueOf(i));
    }
}
