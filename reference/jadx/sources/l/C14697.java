package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public final class C14697 implements InterfaceC23869 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19741 f48015;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0296 f48016;

    public C14697(C19741 c19741, Class cls) {
        this.f48015 = c19741;
        this.f48016 = ((AbstractC18245) AbstractC18245.m42415(AbstractC18245.m42416(cls, "getDefaultInstance", new Class[0]), (Object) null, new Object[0])).internalGetMapFieldReflection(c19741.getNumber()).mo13559();
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۖ */
    public final int mo33880(AbstractC18245 abstractC18245) {
        return abstractC18245.internalGetMapFieldReflection(this.f48015.getNumber()).mo13557().size();
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10105(int i, AbstractC18245 abstractC18245) {
        return abstractC18245.internalGetMapFieldReflection(this.f48015.getNumber()).mo13557().get(i);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۚ */
    public final int mo33882(AbstractC0584 abstractC0584) {
        return abstractC0584.internalGetMapFieldReflection(this.f48015.getNumber()).mo13557().size();
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public final Object mo10107(AbstractC0584 abstractC0584, int i) {
        return abstractC0584.internalGetMapFieldReflection(this.f48015.getNumber()).mo13557().get(i);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final void mo33881(AbstractC0584 abstractC0584) {
        ((ArrayList) abstractC0584.internalGetMutableMapFieldReflection(this.f48015.getNumber()).mo13558()).clear();
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final void mo10106(AbstractC0584 abstractC0584, int i, Object obj) {
        List listMo13558 = abstractC0584.internalGetMutableMapFieldReflection(this.f48015.getNumber()).mo13558();
        InterfaceC1332 interfaceC1332Build = (InterfaceC1332) obj;
        if (interfaceC1332Build == null) {
            interfaceC1332Build = null;
        } else {
            C0296 c0296 = this.f48016;
            if (!c0296.getClass().isInstance(interfaceC1332Build)) {
                interfaceC1332Build = c0296.toBuilder().mergeFrom(interfaceC1332Build).build();
            }
        }
        ((ArrayList) listMo13558).set(i, interfaceC1332Build);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public final void mo10108(AbstractC0584 abstractC0584, Object obj) {
        List listMo13558 = abstractC0584.internalGetMutableMapFieldReflection(this.f48015.getNumber()).mo13558();
        InterfaceC1332 interfaceC1332Build = (InterfaceC1332) obj;
        if (interfaceC1332Build == null) {
            interfaceC1332Build = null;
        } else {
            C0296 c0296 = this.f48016;
            if (!c0296.getClass().isInstance(interfaceC1332Build)) {
                interfaceC1332Build = c0296.toBuilder().mergeFrom(interfaceC1332Build).build();
            }
        }
        ((ArrayList) listMo13558).add(interfaceC1332Build);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8303(AbstractC18245 abstractC18245) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo33880(abstractC18245); i++) {
            arrayList.add(mo10105(i, abstractC18245));
        }
        return C0561.unmodifiableList(arrayList);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public final Object mo8304(AbstractC0584 abstractC0584) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo33882(abstractC0584); i++) {
            arrayList.add(mo10107(abstractC0584, i));
        }
        return C0561.unmodifiableList(arrayList);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۨ */
    public final Object mo32796(AbstractC18245 abstractC18245) {
        return mo8303(abstractC18245);
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final void mo4666(AbstractC0584 abstractC0584, Object obj) {
        mo33881(abstractC0584);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            mo10108(abstractC0584, it.next());
        }
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo33884(AbstractC18245 abstractC18245) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo33883(AbstractC0584 abstractC0584) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22500 mo4665() {
        this.f48016.getClass();
        throw null;
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC22500 mo4664(AbstractC0584 abstractC0584) {
        throw new UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22500 mo29658(AbstractC0584 abstractC0584, int i) {
        throw new UnsupportedOperationException("Map fields cannot be repeated");
    }
}
