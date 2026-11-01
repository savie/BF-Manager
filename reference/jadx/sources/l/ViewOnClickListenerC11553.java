package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11553 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38849;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f38850;

    public /* synthetic */ ViewOnClickListenerC11553(AbstractActivityC12483 abstractActivityC12483, int i) {
        this.f38849 = i;
        this.f38850 = abstractActivityC12483;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f38849) {
            case 0:
                ViewOnClickListenerC13209.m32681(this.f38850, false);
                break;
            default:
                this.f38850.m30996(R.string.MT_Protector, R.string.MT_Protector, false);
                break;
        }
    }
}
