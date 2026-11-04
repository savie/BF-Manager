package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ᩳۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC18867 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61258;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61259;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61260;

    public /* synthetic */ DialogInterfaceOnClickListenerC18867(int i, Object obj, Object obj2) {
        this.f61258 = i;
        this.f61260 = obj;
        this.f61259 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f61258) {
            case 0:
                C2459.m8294((C9170) this.f61260, (AbstractActivityC17204) this.f61259);
                break;
            default:
                C2864.m9458((C2864) this.f61260, (int[]) this.f61259);
                break;
        }
    }
}
