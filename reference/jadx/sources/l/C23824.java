package l;

import android.content.DialogInterface;
import android.widget.BaseAdapter;
import bin.mt.plugin.api.translation.TranslationEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23824 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC20840 f77163;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f77164 = new ArrayList();

    public C23824(DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840) {
        this.f77163 = dialogInterfaceOnDismissListenerC20840;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f77163.f66729);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ArrayList arrayList = new ArrayList();
        if (C18978.m44078()) {
            for (C18300 c18300 : C23522.m52705()) {
                c18300.m42684(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        TranslationEngine translationEngine = (TranslationEngine) ((Class) it.next()).newInstance();
                        translationEngine.init(c18300.m42678());
                        this.f77164.add(new C3686(c18300, translationEngine));
                    } catch (Throwable th) {
                        c18300.m42654(th);
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        boolean zM44078 = C18978.m44078();
        DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840 = this.f77163;
        if (!zM44078) {
            m53158();
            dialogInterfaceOnDismissListenerC20840.f66728.add(0, new C23078(dialogInterfaceOnDismissListenerC20840.f66729));
            return;
        }
        ArrayList<C3686> arrayList = this.f77164;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C3686 c3686 : arrayList) {
            arrayList2.add(new C13381(dialogInterfaceOnDismissListenerC20840.f66729, c3686.f12673, c3686.f12672));
        }
        m53158();
        dialogInterfaceOnDismissListenerC20840.f66728.addAll(0, arrayList2);
        dialogInterfaceOnDismissListenerC20840.f66726 = C23522.m52716();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        m53158();
        this.f77163.f66729.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m53158() {
        DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840 = this.f77163;
        int size = dialogInterfaceOnDismissListenerC20840.f66728.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (dialogInterfaceOnDismissListenerC20840.f66728.get(size) instanceof C13381) {
                dialogInterfaceOnDismissListenerC20840.f66728.remove(size);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840 = this.f77163;
        ((BaseAdapter) dialogInterfaceOnDismissListenerC20840.f66731.getAdapter()).notifyDataSetChanged();
        dialogInterfaceOnDismissListenerC20840.m47655();
        dialogInterfaceOnDismissListenerC20840.f66731.getOnItemSelectedListener().onItemSelected(null, null, dialogInterfaceOnDismissListenerC20840.f66731.getSelectedItemPosition(), 0L);
        m8196();
    }
}
