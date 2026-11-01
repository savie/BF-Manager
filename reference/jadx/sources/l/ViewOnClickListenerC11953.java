package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۨ᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11953 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40077;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f40078;

    public /* synthetic */ ViewOnClickListenerC11953(int i, Object obj) {
        this.f40077 = i;
        this.f40078 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f40077;
        Object obj = this.f40078;
        switch (i) {
            case 0:
                ActivityC15481.m37058((ActivityC15481) obj);
                break;
            case 1:
                int i2 = ActivityC20807.f67639;
                ((ActivityC20807) obj).finish();
                break;
            case 2:
                C17998.m41902((C17998) obj);
                break;
            default:
                AbstractViewOnClickListenerC15449.m36962((AbstractViewOnClickListenerC15449) obj);
                break;
        }
    }
}
