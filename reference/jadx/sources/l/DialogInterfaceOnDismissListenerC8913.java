package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnDismissListenerC8913 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CheckBox f30567;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC5788 f30569;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30570;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Spinner f30571;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f30572;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13550 f30573;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f30566 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30568 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f30565 = true;

    public DialogInterfaceOnDismissListenerC8913(AbstractActivityC5788 abstractActivityC5788) {
        this.f30569 = abstractActivityC5788;
        View viewM30995 = abstractActivityC5788.m30995(R.layout.MT_Protector);
        this.f30571 = (Spinner) viewM30995.findViewById(R.id.spinner1);
        this.f30567 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f30573 = (C13550) viewM30995.findViewById(R.id.MT_Protector);
        new C21612(this, abstractActivityC5788, viewM30995).m10243();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m23185() {
        String string = ApplicationC0716.f2992.getString("auto_translation_record", null);
        Spinner spinner = this.f30571;
        if (string != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f30566;
                if (i >= arrayList.size()) {
                    break;
                }
                if (string.equals(m23198((AbstractC10324) arrayList.get(i)))) {
                    spinner.setSelection(i);
                    return;
                }
                i++;
            }
        }
        spinner.setSelection(0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m23198(AbstractC10324 abstractC10324) {
        if (abstractC10324 instanceof C13146) {
            C13146 c13146 = (C13146) abstractC10324;
            return C7997.m21055("@|", c13146.m32516(), "|", c13146.m32517().getClass().getName());
        }
        if (abstractC10324 instanceof C13852) {
            return C0252.m1693("#|", ((C13852) abstractC10324).m33691().m1373());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23202() {
        if (this.f30570) {
            new C18084(this).m10243();
        } else {
            m23194();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void m23194() {
        if (!C1709.m5692()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        ArrayList arrayList = this.f30566;
        boolean zIsEmpty = arrayList.isEmpty();
        AbstractActivityC5788 abstractActivityC5788 = this.f30569;
        if (zIsEmpty) {
            C15829.m37611(R.string.MT_Protector);
            abstractActivityC5788.startActivity(new Intent(abstractActivityC5788, (Class<?>) ActivityC1609.class));
            return;
        }
        this.f30572.m44362();
        if (this.f30565) {
            this.f30565 = false;
            this.f30572.m44373().setOnClickListener(new ViewOnClickListenerC23346(1, this));
            this.f30572.m44361().setOnClickListener(new ViewOnClickListenerC2702(2, this));
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size) instanceof C13852) {
                arrayList.remove(size);
            }
        }
        Iterator it = C4678.m12968().iterator();
        while (it.hasNext()) {
            arrayList.add(new C13852(abstractActivityC5788, (C0176) it.next()));
        }
        ((BaseAdapter) this.f30571.getAdapter()).notifyDataSetChanged();
        m23185();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m23199(DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913) {
        AbstractC10324 abstractC10324 = (AbstractC10324) dialogInterfaceOnDismissListenerC8913.f30566.get(dialogInterfaceOnDismissListenerC8913.f30571.getSelectedItemPosition());
        if (abstractC10324.mo26148()) {
            dialogInterfaceOnDismissListenerC8913.f30572.dismiss();
            new C18790(dialogInterfaceOnDismissListenerC8913, abstractC10324, dialogInterfaceOnDismissListenerC8913.f30569.m15953()).m10243();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23189(DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913) {
        AbstractActivityC5788 abstractActivityC5788 = dialogInterfaceOnDismissListenerC8913.f30569;
        abstractActivityC5788.startActivity(new Intent(abstractActivityC5788, (Class<?>) ActivityC1609.class));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23201() {
        Iterator it = this.f30566.iterator();
        while (it.hasNext()) {
            ((AbstractC10324) it.next()).mo26138();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23203() {
        int i = this.f30568;
        if (i == -1 || i == C17132.m40032()) {
            return;
        }
        new C8207(this).m10243();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C13146.m32506();
    }
}
