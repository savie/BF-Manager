package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C17239 implements InterfaceC16493 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7323 f56167;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15045 f56168;

    public C17239(C7323 c7323, Class cls) {
        this.f56167 = c7323;
        this.f56168 = ((AbstractC9035) AbstractC9035.m24123(AbstractC9035.m24124(cls, "getDefaultInstance", new Class[0]), (Object) null, new Object[0])).internalGetMapFieldReflection(c7323.getNumber()).mo46535();
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10005(int i, AbstractC9035 abstractC9035) {
        return abstractC9035.internalGetMapFieldReflection(this.f56167.getNumber()).mo46533().get(i);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩸ */
    public final int mo30213(AbstractC9035 abstractC9035) {
        return abstractC9035.internalGetMapFieldReflection(this.f56167.getNumber()).mo46533().size();
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩴ */
    public final int mo30211(AbstractC15001 abstractC15001) {
        return abstractC15001.internalGetMapFieldReflection(this.f56167.getNumber()).mo46533().size();
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo10009(AbstractC15001 abstractC15001, int i) {
        return abstractC15001.internalGetMapFieldReflection(this.f56167.getNumber()).mo46533().get(i);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final void mo30207(AbstractC15001 abstractC15001) {
        ((ArrayList) abstractC15001.internalGetMutableMapFieldReflection(this.f56167.getNumber()).mo46534()).clear();
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final void mo10007(AbstractC15001 abstractC15001, int i, Object obj) {
        List listMo46534 = abstractC15001.internalGetMutableMapFieldReflection(this.f56167.getNumber()).mo46534();
        InterfaceC21013 interfaceC21013Build = (InterfaceC21013) obj;
        if (interfaceC21013Build == null) {
            interfaceC21013Build = null;
        } else {
            C15045 c15045 = this.f56168;
            if (!c15045.getClass().isInstance(interfaceC21013Build)) {
                interfaceC21013Build = c15045.toBuilder().mergeFrom(interfaceC21013Build).build();
            }
        }
        ((ArrayList) listMo46534).set(i, interfaceC21013Build);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10010(AbstractC15001 abstractC15001, Object obj) {
        List listMo46534 = abstractC15001.internalGetMutableMapFieldReflection(this.f56167.getNumber()).mo46534();
        InterfaceC21013 interfaceC21013Build = (InterfaceC21013) obj;
        if (interfaceC21013Build == null) {
            interfaceC21013Build = null;
        } else {
            C15045 c15045 = this.f56168;
            if (!c15045.getClass().isInstance(interfaceC21013Build)) {
                interfaceC21013Build = c15045.toBuilder().mergeFrom(interfaceC21013Build).build();
            }
        }
        ((ArrayList) listMo46534).add(interfaceC21013Build);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10006(AbstractC9035 abstractC9035) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo30213(abstractC9035); i++) {
            arrayList.add(mo10005(i, abstractC9035));
        }
        return C4681.unmodifiableList(arrayList);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo10008(AbstractC15001 abstractC15001) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo30211(abstractC15001); i++) {
            arrayList.add(mo10009(abstractC15001, i));
        }
        return C4681.unmodifiableList(arrayList);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۤ */
    public final Object mo30209(AbstractC9035 abstractC9035) {
        return mo10006(abstractC9035);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final void mo30208(AbstractC15001 abstractC15001, Object obj) {
        mo30207(abstractC15001);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            mo10010(abstractC15001, it.next());
        }
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo30212(AbstractC9035 abstractC9035) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo30210(AbstractC15001 abstractC15001) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14299 mo17567() {
        this.f56168.getClass();
        throw null;
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC14299 mo30214(AbstractC15001 abstractC15001) {
        throw new UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14299 mo17568(AbstractC15001 abstractC15001, int i) {
        throw new UnsupportedOperationException("Map fields cannot be repeated");
    }
}
