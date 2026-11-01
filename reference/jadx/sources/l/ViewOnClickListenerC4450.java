package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۙۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4450 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15842;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15843;

    public /* synthetic */ ViewOnClickListenerC4450(int i, Object obj) {
        this.f15842 = i;
        this.f15843 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f15842) {
            case 0:
                ((RunnableC3369) this.f15843).run();
                break;
            case 1:
                C22342.m49526((C22342) this.f15843, view);
                break;
            case 2:
                ActivityC20431.m46197((ActivityC20431) this.f15843);
                break;
            case 3:
                C15347.m36742((C15347) this.f15843);
                break;
            default:
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f15843;
                abstractActivityC12483.mo30999(abstractActivityC12483.getPackageName());
                break;
        }
    }
}
