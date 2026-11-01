package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15853 implements InterfaceC13320 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12325 f51315;

    public final String toString() {
        return "unnamedModule Completer";
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ boolean mo1180() {
        return false;
    }

    public C15853(C12325 c12325) {
        this.f51315 = c12325;
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public final void mo1179(AbstractC23903 abstractC23903) {
        C12325 c12325 = this.f51315;
        if (c12325.f41207) {
            abstractC23903.f77451 = this;
            return;
        }
        C19670 c19670 = (C19670) abstractC23903;
        HashSet hashSet = new HashSet(c12325.m30630());
        hashSet.remove(c12325.f41213.f14288);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C19670) it.next()).mo49994();
        }
        c12325.m30608(c19670, hashSet);
    }
}
