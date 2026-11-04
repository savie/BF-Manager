package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۗ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3673 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12637;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12638;

    public /* synthetic */ ViewOnClickListenerC3673(int i, Object obj) {
        this.f12637 = i;
        this.f12638 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f12637;
        Object obj = this.f12638;
        switch (i) {
            case 0:
                C21576.m49067((CharSequence) obj);
                break;
            case 1:
                C23582.m52777((C23582) obj);
                break;
            case 2:
                C12277.m30666((C12277) obj);
                break;
            case 3:
                C10060.m26009((C10060) obj);
                break;
            case 4:
                int i2 = ActivityC0673.f2550;
                ((ActivityC0673) obj).finish();
                break;
            case 5:
                ActivityC3846.m12424((ActivityC3846) obj);
                break;
            default:
                int i3 = AbstractC16610.f53718;
                ((C10745) obj).m27405();
                break;
        }
    }
}
