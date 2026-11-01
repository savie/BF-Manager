package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes5.dex */
public class DialogInterfaceOnDismissListenerC20991 extends AbstractC18168 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static int[] f68353 = m47151();

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m47153() {
        return f68353;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static void m47152() {
        f68353 = m47151();
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static int[] m47151() {
        int[] iArrMo16348 = ApplicationC0716.f2992.mo16348("file_menu_sort");
        if (iArrMo16348 != null && iArrMo16348.length == 10) {
            boolean[] zArr = new boolean[10];
            for (int i : iArrMo16348) {
                if (i >= 0 && i < 10 && !zArr[i]) {
                    zArr[i] = true;
                }
            }
            return iArrMo16348;
        }
        return AbstractC11462.f38576;
    }

    public DialogInterfaceOnDismissListenerC20991(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DialogInterfaceOnDismissListenerC20991(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DialogInterfaceOnDismissListenerC20991(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogInterfaceOnDismissListenerC20991(Context context) {
        super(context);
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        C17492 c17492 = (C17492) viewM30995.findViewById(R.id.MT_Protector);
        c17492.setAdapter(new C10408());
        c17492.setLayoutManager(new C16062((Context) abstractActivityC12483, 2));
        new C4647(new C8997()).m12825(c17492);
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
        ApplicationC0716.f2992.edit().mo4068("file_menu_sort", f68353).apply();
    }
}
