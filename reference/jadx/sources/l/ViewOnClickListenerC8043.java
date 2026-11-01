package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8043 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f28180;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28181;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f28182;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f28183;

    public /* synthetic */ ViewOnClickListenerC8043(Object obj, Object obj2, Object obj3, int i) {
        this.f28181 = i;
        this.f28183 = obj;
        this.f28180 = obj2;
        this.f28182 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f28181;
        Object obj = this.f28182;
        Object obj2 = this.f28180;
        Object obj3 = this.f28183;
        switch (i) {
            case 0:
                ViewOnClickListenerC8374.m21947((C22959) obj3, (ViewOnClickListenerC8374) obj2, (C7935) obj);
                break;
            case 1:
                C3246 c3246 = (C3246) obj3;
                c3246.m9718();
                C4388.m12238(c3246.f12072, c3246.f12075, (EditText) obj2, (EditText) obj);
                break;
            default:
                C21422 c21422 = (C21422) obj2;
                AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341 = (AbstractDialogInterfaceOnClickListenerC17341) obj;
                String path = ((InterfaceC2557) obj3).getPath();
                boolean z = false;
                AbstractC20745 abstractC20745M15313 = C5553.m15313(path, new String[0]);
                AbstractC20745 abstractC20745M15314 = C5553.m15313(C20630.m46498(4, 0, path), new String[0]);
                if (abstractC20745M15314.mo33975()) {
                    try {
                        C2462.m7541(c21422.m47966(), EnumC11636.MODIFY_DIRECTORY_LINKED);
                        AbstractC20745 abstractC20745M46733 = abstractC20745M15313.m46733(".tmp");
                        boolean z2 = abstractC20745M15314.mo24646(abstractC20745M46733) && abstractC20745M15313.mo24646(abstractC20745M15314) && abstractC20745M46733.mo24646(abstractC20745M15313);
                        if (z2) {
                            DialogInterfaceOnClickListenerC14147.m34221(c21422.m47980(), "restore_backup", C16737.m39264(R.string.MT_Protector, abstractC20745M15314.getName()), true);
                        }
                        z = z2;
                    } catch (C4987 e) {
                        c21422.m47980().m31002(e, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                } else if (abstractC20745M15313.mo24646(abstractC20745M15314)) {
                    z = true;
                }
                if (z) {
                    int i2 = C22252.f72742;
                    C22252.m49408(abstractC20745M15313.mo33986(), true);
                    C22252.m49408(abstractC20745M15314.mo33986(), true);
                    c21422.m47971(abstractC20745M15314.getName());
                    C21094.m47530();
                    C23186.m51173();
                } else {
                    C15829.m37611(R.string.MT_Protector);
                }
                abstractDialogInterfaceOnClickListenerC17341.m40364();
                break;
        }
    }
}
