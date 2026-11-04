package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes3.dex */
public class DialogInterfaceOnDismissListenerC3610 extends AbstractC11813 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static int[] f12369 = m11715();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static int[] m11713() {
        return f12369;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static void m11714() {
        f12369 = m11715();
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m11715() {
        int[] iArrMo7904 = ApplicationC17729.f58258.mo7904("file_menu_sort");
        if (iArrMo7904 != null && iArrMo7904.length == 10) {
            boolean[] zArr = new boolean[10];
            for (int i : iArrMo7904) {
                if (i >= 0 && i < 10 && !zArr[i]) {
                    zArr[i] = true;
                }
            }
            return iArrMo7904;
        }
        return AbstractC7364.f24212;
    }

    public DialogInterfaceOnDismissListenerC3610(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DialogInterfaceOnDismissListenerC3610(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DialogInterfaceOnDismissListenerC3610(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogInterfaceOnDismissListenerC3610(Context context) {
        super(context);
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        C25227 c25227 = (C25227) viewM40395.findViewById(R.id.MT_Protector);
        c25227.setAdapter(new C16288());
        c25227.setLayoutManager(new C19458((Context) abstractActivityC17204, 2));
        new C11999(new C17780()).m30173(c25227);
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
        ApplicationC17729.f58258.edit().mo3489("file_menu_sort", f12369).apply();
    }
}
