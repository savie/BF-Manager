package l;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 51Z1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20634 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static long f66174;

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        c12915.m31970("local");
        ArrayList arrayList = new ArrayList();
        Iterator it = c12915.m31982().iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2386) it.next()).getPath());
        }
        C20065 c20065M23194 = c12915.m31983().m23194();
        if (arrayList.size() <= 5) {
            C22961.m51815(arrayList, c20065M23194.m46167());
            m47244(c12915.m31979());
            return;
        }
        C2361 c2361BuildDialog = c12915.m31979().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(C21576.m49059(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC4074(arrayList, c20065M23194, c12915, 1));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.֫ۡܳ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47244(Main main) {
        if (C16730.m39495() && System.currentTimeMillis() - f66174 > 60000) {
            View viewM40395 = main.m40395(R.layout.MT_Protector);
            PopupWindow popupWindow = new PopupWindow(viewM40395, -1, -1, true);
            popupWindow.setBackgroundDrawable(new ColorDrawable(-2013265920));
            popupWindow.showAtLocation(main.findViewById(R.id.MT_Protector), 0, 0, 0);
            final View viewFindViewById = viewM40395.findViewById(R.id.MT_Protector);
            final int iM19160 = C6907.m19160(200.0f);
            final C11488 c11488 = new C11488();
            c11488.mo28874(0.0f, 1.0f);
            c11488.m28873((C1815) new InterfaceC21931() { // from class: l.֫ۡܳ
                @Override // l.InterfaceC21931
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final Object mo6294(float f, Float f2, Float f3) {
                    float f4 = f * 1.4f;
                    View view = viewFindViewById;
                    if (f4 <= 0.2f) {
                        view.setAlpha(f4 * 5.0f);
                        view.setTranslationY(0.0f);
                    } else {
                        int i = iM19160;
                        if (f4 <= 1.2f) {
                            view.setAlpha(1.0f);
                            view.setTranslationY((-i) * (f4 - 0.2f));
                        } else {
                            view.setAlpha(1.0f - ((f4 - 1.2f) * 5.0f));
                            view.setTranslationY(-i);
                        }
                    }
                    return 0;
                }
            });
            c11488.mo28882(1200L);
            c11488.m28880();
            c11488.m28879();
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.ۧۡܳ
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    c11488.m28869();
                }
            });
            viewM40395.findViewById(R.id.textView3).setOnClickListener(new ViewOnClickListenerC24936(0, popupWindow));
            f66174 = System.currentTimeMillis();
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }
}
