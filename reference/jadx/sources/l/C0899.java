package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.translation.TranslationEngine;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes3.dex */
public final class C0899 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6865 f3337;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f3338;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f3339;

    public C0899(C6865 c6865, ArrayList arrayList, ArrayList arrayList2) {
        this.f3337 = c6865;
        this.f3339 = arrayList;
        this.f3338 = arrayList2;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8192(this.f3337.f22791, R.string.MT_Protector, 200);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        Iterator it = C23522.m52705().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f3338;
            if (zHasNext) {
                C18300 c18300 = (C18300) it.next();
                ArrayList arrayList2 = this.f3339;
                arrayList2.clear();
                c18300.m42684(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        TranslationEngine translationEngine = (TranslationEngine) ((Class) it2.next()).newInstance();
                        translationEngine.init(c18300.m42678());
                        arrayList.add(new C12085(c18300, translationEngine));
                    } catch (Throwable th) {
                        c18300.m42654(th);
                    }
                }
            } else {
                arrayList.add(new C3136());
                return;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ArrayList arrayList = this.f3338;
        C6865 c6865 = this.f3337;
        c6865.f22796 = arrayList;
        c6865.f22797 = C23522.m52716();
        Set<C13334> set = c6865.f22793;
        C15243.m36591(set, "access$getTranslatorBinders$p(...)");
        for (C13334 c13334 : set) {
            C19131 c19131M32921 = c13334 != null ? c13334.m32921() : null;
            C15243.m36586(c19131M32921);
            c19131M32921.m44267();
            c19131M32921.m44264();
            c19131M32921.m44266(c6865.f22796);
            c19131M32921.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f3337.f22791.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
        C6865 c6865 = this.f3337;
        c6865.f22792 = false;
        Runnable runnable = c6865.f22795;
        if (runnable != null) {
            ((RunnableC11879) runnable).run();
            c6865.f22795 = null;
        }
    }
}
