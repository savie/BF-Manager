package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T12U */
/* JADX INFO: loaded from: classes3.dex */
public class DialogInterfaceOnDismissListenerC5102 extends AbstractC11813 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static int[] f17804 = m15445();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static int[] m15443() {
        return f17804;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static void m15444() {
        f17804 = m15445();
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m15445() {
        List list = C1512.f5258;
        int[] iArrMo7904 = ApplicationC17729.f58258.mo7904("built_in_method_sort");
        int i = 0;
        if (iArrMo7904 == null || iArrMo7904.length > list.size()) {
            int[] iArr = new int[list.size()];
            while (i < list.size()) {
                iArr[i] = ((C1512) list.get(i)).f5259;
                i++;
            }
            return iArr;
        }
        if (iArrMo7904.length < list.size()) {
            C14763 c14763 = new C14763(list.size());
            C14763 c14764 = new C14763(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c14764.add(((C1512) it.next()).f5259);
            }
            int length = iArrMo7904.length;
            while (i < length) {
                int i2 = iArrMo7904[i];
                if (c14764.mo4933(i2)) {
                    c14763.add(i2);
                }
                i++;
            }
            c14763.mo14693((InterfaceC9018) c14764);
            return c14763.mo2687();
        }
        C0594 c0594 = new C0594(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c0594.add(((C1512) it2.next()).f5259);
        }
        boolean zIsEmpty = true;
        for (int i3 : iArrMo7904) {
            if (!c0594.remove(i3)) {
                zIsEmpty = false;
            }
        }
        if (zIsEmpty) {
            zIsEmpty = c0594.isEmpty();
        }
        if (!zIsEmpty) {
            while (i < list.size()) {
                iArrMo7904[i] = ((C1512) list.get(i)).f5259;
                i++;
            }
        }
        return iArrMo7904;
    }

    public DialogInterfaceOnDismissListenerC5102(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DialogInterfaceOnDismissListenerC5102(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DialogInterfaceOnDismissListenerC5102(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogInterfaceOnDismissListenerC5102(Context context) {
        super(context);
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        C25227 c25227 = (C25227) viewM40395.findViewById(R.id.MT_Protector);
        c25227.setAdapter(new C7427());
        c25227.setLayoutManager(new C19458((Context) abstractActivityC17204, 3));
        new C11999(new C8918()).m30173(c25227);
        c25227.getItemAnimator().m10754(200L);
        c25227.getItemAnimator().m10769(200L);
        c25227.getItemAnimator().m10761(200L);
        c25227.getItemAnimator().m10766(200L);
        Context contextM12560 = m12560();
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(contextM12560);
        c2361.m8005(viewM40395);
        c2361.m8004(this);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8016();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ApplicationC17729.f58258.edit().mo3489("built_in_method_sort", f17804).apply();
    }
}
