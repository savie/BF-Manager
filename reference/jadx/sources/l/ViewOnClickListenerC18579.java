package l;

import android.view.View;

/* JADX INFO: renamed from: l.ᩴۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18579 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59076;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59077;

    public /* synthetic */ ViewOnClickListenerC18579(int i, Object obj) {
        this.f59076 = i;
        this.f59077 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f59076;
        Object obj = this.f59077;
        switch (i) {
            case 0:
                C23519.m51788((C23519) obj);
                break;
            case 1:
                C16737.m39272((CharSequence) obj);
                break;
            case 2:
                ActivityC23025.m50955((ActivityC23025) obj);
                break;
            default:
                int i2 = ActivityC15966.f51729;
                ((ActivityC15966) obj).finish();
                break;
        }
    }
}
