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
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩵᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceOnDismissListenerC20840 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f66724;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CheckBox f66725;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C4925 f66727;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC10144 f66729;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Spinner f66731;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f66732;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66728 = new ArrayList();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f66726 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f66730 = true;

    public DialogInterfaceOnDismissListenerC20840(AbstractActivityC10144 abstractActivityC10144) {
        this.f66729 = abstractActivityC10144;
        View viewM40395 = abstractActivityC10144.m40395(R.layout.MT_Protector);
        this.f66731 = (Spinner) viewM40395.findViewById(R.id.spinner1);
        this.f66725 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f66727 = (C4925) viewM40395.findViewById(R.id.MT_Protector);
        new C17110(this, abstractActivityC10144, viewM40395).m8197();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m47655() {
        String string = ApplicationC17729.f58258.getString("auto_translation_record", null);
        Spinner spinner = this.f66731;
        if (string != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f66728;
                if (i >= arrayList.size()) {
                    break;
                }
                if (string.equals(m47653((AbstractC12635) arrayList.get(i)))) {
                    spinner.setSelection(i);
                    return;
                }
                i++;
            }
        }
        spinner.setSelection(0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m47653(AbstractC12635 abstractC12635) {
        if (abstractC12635 instanceof C13381) {
            C13381 c13381 = (C13381) abstractC12635;
            return ExternalValue$$ExternalSyntheticOutline0.m("@|", c13381.m33005(), "|", c13381.m33006().getClass().getName());
        }
        if (abstractC12635 instanceof C13623) {
            return C25272.m56409("#|", ((C13623) abstractC12635).m33373().m42221());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m47658() {
        if (this.f66724) {
            new C17856(this).m8197();
        } else {
            m47652();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m47652() {
        if (!C18978.m44079()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        ArrayList arrayList = this.f66728;
        boolean zIsEmpty = arrayList.isEmpty();
        AbstractActivityC10144 abstractActivityC10144 = this.f66729;
        if (zIsEmpty) {
            C22673.m51152(R.string.MT_Protector);
            abstractActivityC10144.startActivity(new Intent(abstractActivityC10144, (Class<?>) ActivityC24268.class));
            return;
        }
        this.f66732.m22432();
        if (this.f66730) {
            this.f66730 = false;
            int i = 1;
            this.f66732.m22436().setOnClickListener(new ViewOnClickListenerC25177(i, this));
            this.f66732.m22440().setOnClickListener(new ViewOnClickListenerC16971(i, this));
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size) instanceof C13623) {
                arrayList.remove(size);
            }
        }
        Iterator it = C6912.m19190().iterator();
        while (it.hasNext()) {
            arrayList.add(new C13623(abstractActivityC10144, (C18099) it.next()));
        }
        ((BaseAdapter) this.f66731.getAdapter()).notifyDataSetChanged();
        m47655();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m47654(DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840) {
        AbstractC12635 abstractC12635 = (AbstractC12635) dialogInterfaceOnDismissListenerC20840.f66728.get(dialogInterfaceOnDismissListenerC20840.f66731.getSelectedItemPosition());
        if (abstractC12635.mo31408()) {
            dialogInterfaceOnDismissListenerC20840.f66732.dismiss();
            new C16364(dialogInterfaceOnDismissListenerC20840, abstractC12635, dialogInterfaceOnDismissListenerC20840.f66729.m26256()).m8197();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47642(DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840) {
        AbstractActivityC10144 abstractActivityC10144 = dialogInterfaceOnDismissListenerC20840.f66729;
        abstractActivityC10144.startActivity(new Intent(abstractActivityC10144, (Class<?>) ActivityC24268.class));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47657() {
        Iterator it = this.f66728.iterator();
        while (it.hasNext()) {
            ((AbstractC12635) it.next()).mo31410();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47659() {
        int i = this.f66726;
        if (i == -1 || i == C23522.m52716()) {
            return;
        }
        new C23824(this).m8197();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C13381.m32988();
    }
}
