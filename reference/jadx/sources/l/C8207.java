package l;

import android.content.DialogInterface;
import android.widget.BaseAdapter;
import bin.mt.plugin.api.translation.TranslationEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8207 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC8913 f28580;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f28581 = new ArrayList();

    public C8207(DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913) {
        this.f28580 = dialogInterfaceOnDismissListenerC8913;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f28580.f30569);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        ArrayList arrayList = new ArrayList();
        if (C1709.m5693()) {
            for (C11986 c11986 : C17132.m40019()) {
                c11986.m29810(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        TranslationEngine translationEngine = (TranslationEngine) ((Class) it.next()).newInstance();
                        translationEngine.init(c11986.m29831());
                        this.f28581.add(new C19496(c11986, translationEngine));
                    } catch (Throwable th) {
                        c11986.m29814(th);
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        boolean zM5693 = C1709.m5693();
        DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913 = this.f28580;
        if (!zM5693) {
            m21494();
            dialogInterfaceOnDismissListenerC8913.f30566.add(0, new C5384(dialogInterfaceOnDismissListenerC8913.f30569));
            return;
        }
        ArrayList<C19496> arrayList = this.f28581;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C19496 c19496 : arrayList) {
            arrayList2.add(new C13146(dialogInterfaceOnDismissListenerC8913.f30569, c19496.f62726, c19496.f62725));
        }
        m21494();
        dialogInterfaceOnDismissListenerC8913.f30566.addAll(0, arrayList2);
        dialogInterfaceOnDismissListenerC8913.f30568 = C17132.m40032();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        m21494();
        this.f28580.f30569.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m21494() {
        DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913 = this.f28580;
        int size = dialogInterfaceOnDismissListenerC8913.f30566.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (dialogInterfaceOnDismissListenerC8913.f30566.get(size) instanceof C13146) {
                dialogInterfaceOnDismissListenerC8913.f30566.remove(size);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913 = this.f28580;
        ((BaseAdapter) dialogInterfaceOnDismissListenerC8913.f30571.getAdapter()).notifyDataSetChanged();
        dialogInterfaceOnDismissListenerC8913.m23185();
        dialogInterfaceOnDismissListenerC8913.f30571.getOnItemSelectedListener().onItemSelected(null, null, dialogInterfaceOnDismissListenerC8913.f30571.getSelectedItemPosition(), 0L);
        m10251();
    }
}
