package l;

import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C3406 extends C14013 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Method f12570;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7040 f12571;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f12572;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Method f12573;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Method f12574;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Method f12575;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Method f12576;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Method f12577;

    public C3406(C19741 c19741, String str, Class cls, Class cls2) {
        super(cls, cls2, str);
        this.f12571 = c19741.m44901();
        this.f12574 = AbstractC18245.m42416(this.f46053, "valueOf", C21857.class);
        this.f12570 = AbstractC18245.m42416(this.f46053, "getValueDescriptor", new Class[0]);
        boolean zM44905 = c19741.m44905();
        this.f12572 = !zM44905;
        if (zM44905) {
            return;
        }
        String strM38890 = C16523.m38890("get", str, "Value");
        Class cls3 = Integer.TYPE;
        this.f12573 = AbstractC18245.m42416(cls, strM38890, cls3);
        this.f12577 = AbstractC18245.m42416(cls2, C16523.m38890("get", str, "Value"), cls3);
        this.f12576 = AbstractC18245.m42416(cls2, C16523.m38890("set", str, "Value"), cls3, cls3);
        this.f12575 = AbstractC18245.m42416(cls2, C16523.m38890("add", str, "Value"), cls3);
    }

    @Override // l.C14013, l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8303(AbstractC18245 abstractC18245) {
        ArrayList arrayList = new ArrayList();
        int iM13430 = this.f46052.m13430(abstractC18245);
        for (int i = 0; i < iM13430; i++) {
            arrayList.add(mo10105(i, abstractC18245));
        }
        return C0561.unmodifiableList(arrayList);
    }

    @Override // l.C14013, l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public final Object mo8304(AbstractC0584 abstractC0584) {
        ArrayList arrayList = new ArrayList();
        int iM13429 = this.f46052.m13429(abstractC0584);
        for (int i = 0; i < iM13429; i++) {
            arrayList.add(mo10107(abstractC0584, i));
        }
        return C0561.unmodifiableList(arrayList);
    }

    @Override // l.C14013, l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo10105(int i, AbstractC18245 abstractC18245) {
        if (!this.f12572) {
            return AbstractC18245.m42415(this.f12570, this.f46052.m13423(i, abstractC18245), new Object[0]);
        }
        return this.f12571.m18885(((Integer) AbstractC18245.m42415(this.f12573, abstractC18245, Integer.valueOf(i))).intValue());
    }

    @Override // l.C14013, l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object mo10107(AbstractC0584 abstractC0584, int i) {
        if (!this.f12572) {
            return AbstractC18245.m42415(this.f12570, this.f46052.m13424(abstractC0584, i), new Object[0]);
        }
        return this.f12571.m18885(((Integer) AbstractC18245.m42415(this.f12577, abstractC0584, Integer.valueOf(i))).intValue());
    }

    @Override // l.C14013, l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10106(AbstractC0584 abstractC0584, int i, Object obj) {
        if (this.f12572) {
            AbstractC18245.m42415(this.f12576, abstractC0584, Integer.valueOf(i), Integer.valueOf(((C21857) obj).getNumber()));
        } else {
            super.mo10106(abstractC0584, i, AbstractC18245.m42415(this.f12574, (Object) null, obj));
        }
    }

    @Override // l.C14013, l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo10108(AbstractC0584 abstractC0584, Object obj) {
        if (this.f12572) {
            AbstractC18245.m42415(this.f12575, abstractC0584, Integer.valueOf(((C21857) obj).getNumber()));
        } else {
            super.mo10108(abstractC0584, AbstractC18245.m42415(this.f12574, (Object) null, obj));
        }
    }
}
