package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.translation.TranslationEngine;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes5.dex */
public final class C21760 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f70518;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19644 f70519;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f70520;

    public C21760(C19644 c19644, ArrayList arrayList, ArrayList arrayList2) {
        this.f70519 = c19644;
        this.f70520 = arrayList;
        this.f70518 = arrayList2;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10247(this.f70519.f63080, R.string.MT_Protector, 200);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        Iterator it = C17132.m40019().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f70518;
            if (zHasNext) {
                C11986 c11986 = (C11986) it.next();
                ArrayList arrayList2 = this.f70520;
                arrayList2.clear();
                c11986.m29810(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        TranslationEngine translationEngine = (TranslationEngine) ((Class) it2.next()).newInstance();
                        translationEngine.init(c11986.m29831());
                        arrayList.add(new C4826(c11986, translationEngine));
                    } catch (Throwable th) {
                        c11986.m29814(th);
                    }
                }
            } else {
                arrayList.add(new C9745());
                return;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ArrayList arrayList = this.f70518;
        C19644 c19644 = this.f70519;
        c19644.f63083 = arrayList;
        c19644.f63079 = C17132.m40032();
        Set<C12588> set = c19644.f63078;
        C13465.m32967(set, "access$getTranslatorBinders$p(...)");
        for (C12588 c12588 : set) {
            C4406 c4406M31327 = c12588 != null ? c12588.m31327() : null;
            C13465.m32962(c4406M31327);
            c4406M31327.m12332();
            c4406M31327.m12329();
            c4406M31327.m12331(c19644.f63083);
            c4406M31327.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f70519.f63080.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        C19644 c19644 = this.f70519;
        c19644.f63082 = false;
        Runnable runnable = c19644.f63081;
        if (runnable != null) {
            ((RunnableC7917) runnable).run();
            c19644.f63081 = null;
        }
    }
}
