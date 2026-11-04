package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C12095 extends C8279 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4790 f38940;

    public C12095(C2466 c2466) {
        this.f38940 = c2466;
    }

    @Override // l.AbstractC9024
    /* JADX INFO: renamed from: ۙ */
    public final Object mo24076(C10377 c10377, Object obj) {
        Object obj2 = (Set) obj;
        m18928(c10377.mo5575(), obj2);
        List parameters = c10377.getParameters();
        C14769 c14769Mo5575 = c10377.mo5575();
        if (!c14769Mo5575.isEmpty()) {
            ArrayList arrayList = new ArrayList(c14769Mo5575);
            arrayList.addAll(parameters);
            parameters = arrayList;
        }
        return (Set) m18928(parameters, obj2);
    }

    @Override // l.AbstractC9024
    /* JADX INFO: renamed from: ۙ */
    public final Object mo24077(C14106 c14106, Object obj) {
        return (Set) obj;
    }

    @Override // l.AbstractC9024
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8141(C24550 c24550, Object obj) {
        Object obj2 = (Set) obj;
        m18928(c24550.mo5575(), obj2);
        List listMo9561 = c24550.mo9561();
        C14769 c14769Mo5575 = c24550.mo5575();
        if (!c14769Mo5575.isEmpty()) {
            ArrayList arrayList = new ArrayList(c14769Mo5575);
            arrayList.addAll(listMo9561);
            listMo9561 = arrayList;
        }
        return (Set) m18928(listMo9561, obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m30271(InterfaceC12753 interfaceC12753, Set set) {
        Iterator it = ((C2466) this.f38940).m8321(interfaceC12753).iterator();
        while (it.hasNext()) {
            set.add((InterfaceC3804) ((InterfaceC22450) it.next()).mo50625().mo14287());
        }
        return (Set) interfaceC12753.mo7871(this, set);
    }
}
