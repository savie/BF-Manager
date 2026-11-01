package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۬ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13307 extends C22479 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Method f44175;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Method f44176;

    public C13307(C19741 c19741, String str, Class cls, Class cls2, String str2) {
        super(c19741, str, cls, cls2, str2);
        this.f44176 = AbstractC18245.m42416(cls, C16523.m38890("get", str, "Bytes"), new Class[0]);
        this.f44175 = AbstractC18245.m42416(cls2, C16523.m38890("set", str, "Bytes"), AbstractC23725.class);
    }

    @Override // l.C22479, l.InterfaceC23869
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object mo32796(AbstractC18245 abstractC18245) {
        return AbstractC18245.m42415(this.f44176, abstractC18245, new Object[0]);
    }

    @Override // l.C22479, l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final void mo4666(AbstractC0584 abstractC0584, Object obj) {
        if (obj instanceof AbstractC23725) {
            AbstractC18245.m42415(this.f44175, abstractC0584, obj);
        } else {
            super.mo4666(abstractC0584, obj);
        }
    }
}
