package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C1311 extends C22479 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Method f5591;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Method f5592;

    public C1311(C19741 c19741, String str, Class cls, Class cls2, String str2) {
        super(c19741, str, cls, cls2, str2);
        this.f5591 = AbstractC18245.m42416(this.f73378, "newBuilder", new Class[0]);
        this.f5592 = AbstractC18245.m42416(cls2, C16523.m38890("get", str, "Builder"), new Class[0]);
    }

    @Override // l.C22479, l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4666(AbstractC0584 abstractC0584, Object obj) {
        if (!this.f73378.isInstance(obj)) {
            obj = ((InterfaceC22500) AbstractC18245.m42415(this.f5591, (Object) null, new Object[0])).mergeFrom((InterfaceC1332) obj).buildPartial();
        }
        super.mo4666(abstractC0584, obj);
    }

    @Override // l.C22479, l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22500 mo4665() {
        return (InterfaceC22500) AbstractC18245.m42415(this.f5591, (Object) null, new Object[0]);
    }

    @Override // l.C22479, l.InterfaceC23869
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22500 mo4664(AbstractC0584 abstractC0584) {
        return (InterfaceC22500) AbstractC18245.m42415(this.f5592, abstractC0584, new Object[0]);
    }
}
