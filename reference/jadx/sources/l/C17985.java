package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܿ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C17985 extends C14255 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Method f58922;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f58923;

    public C17985(C7323 c7323, String str, Class cls, Class cls2, String str2) {
        super(c7323, str, cls, cls2, str2);
        this.f58923 = AbstractC9035.m24124(cls, C14442.m34865("get", str, "Bytes"), new Class[0]);
        this.f58922 = AbstractC9035.m24124(cls2, C14442.m34865("set", str, "Bytes"), AbstractC17084.class);
    }

    @Override // l.C14255, l.InterfaceC16493
    /* JADX INFO: renamed from: ۤ */
    public final Object mo30209(AbstractC9035 abstractC9035) {
        return AbstractC9035.m24123(this.f58923, abstractC9035, new Object[0]);
    }

    @Override // l.C14255, l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final void mo30208(AbstractC15001 abstractC15001, Object obj) {
        if (obj instanceof AbstractC17084) {
            AbstractC9035.m24123(this.f58922, abstractC15001, obj);
        } else {
            super.mo30208(abstractC15001, obj);
        }
    }
}
