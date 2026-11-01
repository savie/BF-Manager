package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T12U */
/* JADX INFO: loaded from: classes3.dex */
public class DialogInterfaceOnDismissListenerC5468 extends AbstractC18168 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static int[] f18839 = m15135();

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m15137() {
        return f18839;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static void m15136() {
        f18839 = m15135();
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static int[] m15135() {
        List list = C6695.f22573;
        int[] iArrMo16348 = ApplicationC0716.f2992.mo16348("built_in_method_sort");
        int i = 0;
        if (iArrMo16348 == null || iArrMo16348.length > list.size()) {
            int[] iArr = new int[list.size()];
            while (i < list.size()) {
                iArr[i] = ((C6695) list.get(i)).f22574;
                i++;
            }
            return iArr;
        }
        if (iArrMo16348.length < list.size()) {
            C15070 c15070 = new C15070(list.size());
            C15070 c15071 = new C15070(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c15071.add(((C6695) it.next()).f22574);
            }
            int length = iArrMo16348.length;
            while (i < length) {
                int i2 = iArrMo16348[i];
                if (c15071.mo3182(i2)) {
                    c15070.add(i2);
                }
                i++;
            }
            c15070.mo3173((InterfaceC10609) c15071);
            return c15070.mo3181();
        }
        C18597 c18597 = new C18597(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c18597.add(((C6695) it2.next()).f22574);
        }
        boolean zIsEmpty = true;
        for (int i3 : iArrMo16348) {
            if (!c18597.remove(i3)) {
                zIsEmpty = false;
            }
        }
        if (zIsEmpty) {
            zIsEmpty = c18597.isEmpty();
        }
        if (!zIsEmpty) {
            while (i < list.size()) {
                iArrMo16348[i] = ((C6695) list.get(i)).f22574;
                i++;
            }
        }
        return iArrMo16348;
    }

    public DialogInterfaceOnDismissListenerC5468(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DialogInterfaceOnDismissListenerC5468(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DialogInterfaceOnDismissListenerC5468(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogInterfaceOnDismissListenerC5468(Context context) {
        super(context);
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        C17492 c17492 = (C17492) viewM30995.findViewById(R.id.MT_Protector);
        c17492.setAdapter(new C11819());
        c17492.setLayoutManager(new C16062((Context) abstractActivityC12483, 3));
        new C4647(new C13936()).m12825(c17492);
        c17492.getItemAnimator().m5954(200L);
        c17492.getItemAnimator().m5952(200L);
        c17492.getItemAnimator().m5961(200L);
        c17492.getItemAnimator().m5964(200L);
        Context contextM13133 = m13133();
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(contextM13133);
        c8067.m21258(viewM30995);
        c8067.m21257(this);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21269();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ApplicationC0716.f2992.edit().mo4068("built_in_method_sort", f18839).apply();
    }
}
