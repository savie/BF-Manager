package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩶֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C20969 extends C14255 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Method f67058;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f67059;

    public C20969(C7323 c7323, String str, Class cls, Class cls2, String str2) {
        super(c7323, str, cls, cls2, str2);
        this.f67058 = AbstractC9035.m24124(this.f45063, "newBuilder", new Class[0]);
        this.f67059 = AbstractC9035.m24124(cls2, C14442.m34865("get", str, "Builder"), new Class[0]);
    }

    @Override // l.C14255, l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final void mo30208(AbstractC15001 abstractC15001, Object obj) {
        if (!this.f45063.isInstance(obj)) {
            obj = ((InterfaceC14299) AbstractC9035.m24123(this.f67058, (Object) null, new Object[0])).mergeFrom((InterfaceC21013) obj).buildPartial();
        }
        super.mo30208(abstractC15001, obj);
    }

    @Override // l.C14255, l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14299 mo17567() {
        return (InterfaceC14299) AbstractC9035.m24123(this.f67058, (Object) null, new Object[0]);
    }

    @Override // l.C14255, l.InterfaceC16493
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC14299 mo30214(AbstractC15001 abstractC15001) {
        return (InterfaceC14299) AbstractC9035.m24123(this.f67059, abstractC15001, new Object[0]);
    }
}
