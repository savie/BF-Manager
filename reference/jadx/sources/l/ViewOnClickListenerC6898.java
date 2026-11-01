package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۜܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6898 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23223;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23224;

    public /* synthetic */ ViewOnClickListenerC6898(int i, Object obj) {
        this.f23223 = i;
        this.f23224 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23223) {
            case 0:
                C16737.m39272((CharSequence) this.f23224);
                break;
            default:
                ActivityC23892.m52661((ActivityC23892) this.f23224);
                break;
        }
    }
}
