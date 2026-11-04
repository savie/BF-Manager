package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public class C12018 implements InterfaceC16493 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20223 f38747;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Class f38748;

    public C12018(Class cls, Class cls2, String str) {
        C20223 c20223 = new C20223(cls, cls2, str);
        this.f38748 = c20223.f64910.getReturnType();
        this.f38747 = c20223;
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public Object mo10006(AbstractC9035 abstractC9035) {
        return this.f38747.m46493(abstractC9035);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public Object mo10008(AbstractC15001 abstractC15001) {
        return this.f38747.m46500(abstractC15001);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object mo30209(AbstractC9035 abstractC9035) {
        return mo10006(abstractC9035);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30208(AbstractC15001 abstractC15001, Object obj) {
        mo30207(abstractC15001);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            mo10010(abstractC15001, it.next());
        }
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public Object mo10005(int i, AbstractC9035 abstractC9035) {
        return this.f38747.m46492(i, abstractC9035);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public Object mo10009(AbstractC15001 abstractC15001, int i) {
        return this.f38747.m46494(abstractC15001, i);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public void mo10007(AbstractC15001 abstractC15001, int i, Object obj) {
        this.f38747.m46496(abstractC15001, i, obj);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public void mo10010(AbstractC15001 abstractC15001, Object obj) {
        this.f38747.m46497(abstractC15001, obj);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo30212(AbstractC9035 abstractC9035) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo30210(AbstractC15001 abstractC15001) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo30213(AbstractC9035 abstractC9035) {
        return this.f38747.m46499(abstractC9035);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo30211(AbstractC15001 abstractC15001) {
        return this.f38747.m46498(abstractC15001);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30207(AbstractC15001 abstractC15001) {
        this.f38747.m46495(abstractC15001);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC14299 mo17567() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC14299 mo30214(AbstractC15001 abstractC15001) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC14299 mo17568(AbstractC15001 abstractC15001, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }
}
