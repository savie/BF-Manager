package l;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51Z1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10361 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static long f35510;

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        c21422.m47963("local");
        final ArrayList arrayList = new ArrayList();
        Iterator it = c21422.m47979().iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2557) it.next()).getPath());
        }
        final C6936 c6936M28807 = c21422.m47965().m28807();
        if (arrayList.size() <= 5) {
            C23186.m51199(arrayList, c6936M28807.m18653());
            m26259(c21422.m47980());
            return;
        }
        C8067 c8067BuildDialog = c21422.m47980().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(C16737.m39264(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡܳ᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C23186.m51199(arrayList, c6936M28807.m18653());
                C10361.m26259(c21422.m47980());
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.֨᩷᩹] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26259(Main main) {
        if (C4197.m11846() && System.currentTimeMillis() - f35510 > 60000) {
            View viewM30995 = main.m30995(R.layout.MT_Protector);
            PopupWindow popupWindow = new PopupWindow(viewM30995, -1, -1, true);
            popupWindow.setBackgroundDrawable(new ColorDrawable(-2013265920));
            popupWindow.showAtLocation(main.findViewById(R.id.MT_Protector), 0, 0, 0);
            final View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
            final int iM33769 = C13932.m33769(200.0f);
            final C14736 c14736 = new C14736();
            c14736.mo15352(0.0f, 1.0f);
            c14736.m35311((C1375) new InterfaceC20380() { // from class: l.֨᩷᩹
                @Override // l.InterfaceC20380
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final Object mo4824(float f, Float f2, Float f3) {
                    float f4 = f * 1.4f;
                    View view = viewFindViewById;
                    if (f4 <= 0.2f) {
                        view.setAlpha(f4 * 5.0f);
                        view.setTranslationY(0.0f);
                    } else {
                        int i = iM33769;
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
            c14736.mo15353(1200L);
            c14736.m35315();
            c14736.m35318();
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.۬᩷᩹
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    c14736.m35309();
                }
            });
            viewM30995.findViewById(R.id.textView3).setOnClickListener(new ViewOnClickListenerC20535(3, popupWindow));
            f35510 = System.currentTimeMillis();
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }
}
