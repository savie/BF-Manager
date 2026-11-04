package l;

import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C3069 extends C12018 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f9947;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Method f9948;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Method f9949;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Method f9950;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Method f9951;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Method f9952;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Method f9953;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8069 f9954;

    public C3069(C7323 c7323, String str, Class cls, Class cls2) {
        super(cls, cls2, str);
        this.f9954 = c7323.m20092();
        this.f9950 = AbstractC9035.m24124(this.f38748, "valueOf", C1357.class);
        this.f9951 = AbstractC9035.m24124(this.f38748, "getValueDescriptor", new Class[0]);
        boolean zM20085 = c7323.m20085();
        this.f9947 = !zM20085;
        if (zM20085) {
            return;
        }
        String strM34865 = C14442.m34865("get", str, "Value");
        Class cls3 = Integer.TYPE;
        this.f9953 = AbstractC9035.m24124(cls, strM34865, cls3);
        this.f9952 = AbstractC9035.m24124(cls2, C14442.m34865("get", str, "Value"), cls3);
        this.f9948 = AbstractC9035.m24124(cls2, C14442.m34865("set", str, "Value"), cls3, cls3);
        this.f9949 = AbstractC9035.m24124(cls2, C14442.m34865("add", str, "Value"), cls3);
    }

    @Override // l.C12018, l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo10006(AbstractC9035 abstractC9035) {
        ArrayList arrayList = new ArrayList();
        int iM46499 = this.f38747.m46499(abstractC9035);
        for (int i = 0; i < iM46499; i++) {
            arrayList.add(mo10005(i, abstractC9035));
        }
        return C4681.unmodifiableList(arrayList);
    }

    @Override // l.C12018, l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object mo10008(AbstractC15001 abstractC15001) {
        ArrayList arrayList = new ArrayList();
        int iM46498 = this.f38747.m46498(abstractC15001);
        for (int i = 0; i < iM46498; i++) {
            arrayList.add(mo10009(abstractC15001, i));
        }
        return C4681.unmodifiableList(arrayList);
    }

    @Override // l.C12018, l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo10005(int i, AbstractC9035 abstractC9035) {
        if (!this.f9947) {
            return AbstractC9035.m24123(this.f9951, this.f38747.m46492(i, abstractC9035), new Object[0]);
        }
        return this.f9954.m21966(((Integer) AbstractC9035.m24123(this.f9953, abstractC9035, Integer.valueOf(i))).intValue());
    }

    @Override // l.C12018, l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object mo10009(AbstractC15001 abstractC15001, int i) {
        if (!this.f9947) {
            return AbstractC9035.m24123(this.f9951, this.f38747.m46494(abstractC15001, i), new Object[0]);
        }
        return this.f9954.m21966(((Integer) AbstractC9035.m24123(this.f9952, abstractC15001, Integer.valueOf(i))).intValue());
    }

    @Override // l.C12018, l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10007(AbstractC15001 abstractC15001, int i, Object obj) {
        if (this.f9947) {
            AbstractC9035.m24123(this.f9948, abstractC15001, Integer.valueOf(i), Integer.valueOf(((C1357) obj).getNumber()));
        } else {
            super.mo10007(abstractC15001, i, AbstractC9035.m24123(this.f9950, (Object) null, obj));
        }
    }

    @Override // l.C12018, l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo10010(AbstractC15001 abstractC15001, Object obj) {
        if (this.f9947) {
            AbstractC9035.m24123(this.f9949, abstractC15001, Integer.valueOf(((C1357) obj).getNumber()));
        } else {
            super.mo10010(abstractC15001, AbstractC9035.m24123(this.f9950, (Object) null, obj));
        }
    }
}
