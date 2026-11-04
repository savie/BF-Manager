package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8216 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27048;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27049;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27050;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27051;

    public /* synthetic */ ViewOnClickListenerC8216(Object obj, Object obj2, Object obj3, int i) {
        this.f27049 = i;
        this.f27051 = obj;
        this.f27050 = obj2;
        this.f27048 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f27049;
        Object obj = this.f27048;
        Object obj2 = this.f27050;
        Object obj3 = this.f27051;
        switch (i) {
            case 0:
                C9170 c9170 = (C9170) obj3;
                c9170.m24304();
                C2459.m8293(c9170.f29768, c9170.f29767, (C23255) obj2, (C23255) obj);
                break;
            default:
                C12915 c12915 = (C12915) obj2;
                AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552 = (AbstractDialogInterfaceOnClickListenerC8552) obj;
                String path = ((InterfaceC2386) obj3).getPath();
                boolean z = false;
                AbstractC22044 abstractC22044M35193 = C14584.m35193(path, new String[0]);
                AbstractC22044 abstractC22044M35194 = C14584.m35193(C1402.m5124(4, 0, path), new String[0]);
                if (abstractC22044M35194.mo2934()) {
                    try {
                        C6265.m17912(c12915.m31976(), EnumC12230.MODIFY_DIRECTORY_LINKED);
                        AbstractC22044 abstractC22044M49862 = abstractC22044M35193.m49862(".tmp");
                        boolean z2 = abstractC22044M35194.mo4301(abstractC22044M49862) && abstractC22044M35193.mo4301(abstractC22044M35194) && abstractC22044M49862.mo4301(abstractC22044M35193);
                        if (z2) {
                            DialogInterfaceOnClickListenerC12983.m32395(c12915.m31979(), "restore_backup", C21576.m49059(R.string.MT_Protector, abstractC22044M35194.getName()), true);
                        }
                        z = z2;
                    } catch (C4866 e) {
                        c12915.m31979().m40401(e, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                } else if (abstractC22044M35193.mo4301(abstractC22044M35194)) {
                    z = true;
                }
                if (z) {
                    int i2 = C20108.f64607;
                    C20108.m46233(abstractC22044M35193.mo4294(), true);
                    C20108.m46233(abstractC22044M35194.mo4294(), true);
                    c12915.m31975(abstractC22044M35194.getName());
                    C6331.m18055();
                    C22961.m51805();
                } else {
                    C22673.m51152(R.string.MT_Protector);
                }
                abstractDialogInterfaceOnClickListenerC8552.m22951();
                break;
        }
    }
}
