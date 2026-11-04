package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ViewOnClickListenerC20378 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65351;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65352;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65353;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65354;

    public /* synthetic */ ViewOnClickListenerC20378(Object obj, Object obj2, Object obj3, int i) {
        this.f65352 = i;
        this.f65354 = obj;
        this.f65353 = obj2;
        this.f65351 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f65352) {
            case 0:
                boolean[] zArr = (boolean[]) this.f65354;
                ArrayList arrayList = (ArrayList) this.f65353;
                DialogInterfaceC8327 dialogInterfaceC8327 = (DialogInterfaceC8327) this.f65351;
                for (int i = 0; i < zArr.length; i++) {
                    boolean z = ((C20332) arrayList.get(i)).m46712() || !zArr[i];
                    zArr[i] = z;
                    dialogInterfaceC8327.m22437().setItemChecked(i, z);
                }
                break;
            default:
                C9170 c9170 = (C9170) this.f65354;
                C23255 c23255 = (C23255) this.f65353;
                C23255 c23256 = (C23255) this.f65351;
                c9170.m24304();
                C2459.m8293(c9170.f29768, c9170.f29767, c23255, c23256);
                break;
        }
    }
}
