package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۨᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public final class C11896 extends C14013 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Method f39909;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Method f39910;

    public C11896(Class cls, Class cls2, String str) {
        super(cls, cls2, str);
        this.f39909 = AbstractC18245.m42416(this.f46053, "newBuilder", new Class[0]);
        this.f39910 = AbstractC18245.m42416(cls2, C16523.m38890("get", str, "Builder"), Integer.TYPE);
    }

    @Override // l.C14013, l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final void mo10106(AbstractC0584 abstractC0584, int i, Object obj) {
        if (!this.f46053.isInstance(obj)) {
            obj = ((InterfaceC22500) AbstractC18245.m42415(this.f39909, (Object) null, new Object[0])).mergeFrom((InterfaceC1332) obj).build();
        }
        super.mo10106(abstractC0584, i, obj);
    }

    @Override // l.C14013, l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public final void mo10108(AbstractC0584 abstractC0584, Object obj) {
        if (!this.f46053.isInstance(obj)) {
            obj = ((InterfaceC22500) AbstractC18245.m42415(this.f39909, (Object) null, new Object[0])).mergeFrom((InterfaceC1332) obj).build();
        }
        super.mo10108(abstractC0584, obj);
    }

    @Override // l.C14013, l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22500 mo4665() {
        return (InterfaceC22500) AbstractC18245.m42415(this.f39909, (Object) null, new Object[0]);
    }

    @Override // l.C14013, l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22500 mo29658(AbstractC0584 abstractC0584, int i) {
        return (InterfaceC22500) AbstractC18245.m42415(this.f39910, abstractC0584, Integer.valueOf(i));
    }
}
