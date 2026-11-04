package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩶ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC21269 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67829;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67830;

    public /* synthetic */ DialogInterfaceOnClickListenerC21269(int i, Object obj) {
        this.f67829 = i;
        this.f67830 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f67829) {
            case 0:
                C22761 c22761 = (C22761) this.f67830;
                c22761.m51326(3);
                c22761.m51333();
                break;
            default:
                AbstractActivityC10144.m26216((AbstractActivityC10144) this.f67830);
                break;
        }
    }
}
