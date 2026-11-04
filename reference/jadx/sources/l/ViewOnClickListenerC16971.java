package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6H8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16971 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55489;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f55490;

    public /* synthetic */ ViewOnClickListenerC16971(int i, Object obj) {
        this.f55489 = i;
        this.f55490 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f55489;
        Object obj = this.f55490;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                DialogInterfaceOnDismissListenerC20840.m47642((DialogInterfaceOnDismissListenerC20840) obj);
                break;
            case 2:
                int i2 = DialogInterfaceC8327.f27315;
                C2361 c2361 = new C2361((AbstractActivityC17204) obj);
                c2361.m8021(R.string.MT_Protector);
                c2361.m8000(R.string.MT_Protector);
                c2361.m8026(R.string.MT_Protector, null);
                c2361.m8016();
                break;
            case 3:
                C5848.m17033((C5848) obj);
                break;
            case 4:
                C0168.m1402((C0168) obj, view);
                break;
            default:
                int i3 = ActivityC16147.f52436;
                ((ActivityC16147) obj).finish();
                break;
        }
    }
}
