package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩶ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC20268 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65715;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65716;

    public /* synthetic */ DialogInterfaceOnClickListenerC20268(int i, Object obj) {
        this.f65715 = i;
        this.f65716 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f65715) {
            case 0:
                ViewOnLayoutChangeListenerC3333.m9903((ViewOnLayoutChangeListenerC3333) this.f65716);
                break;
            case 1:
                AbstractActivityC5788.m15921((AbstractActivityC5788) this.f65716);
                break;
            case 2:
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f65716;
                abstractActivityC12483.startActivity(new Intent(abstractActivityC12483, (Class<?>) ActivityC12499.class));
                break;
            case 3:
                C5755.m15849((C5755) this.f65716);
                break;
            default:
                ActivityC5677.m15580((ActivityC5677) this.f65716);
                break;
        }
    }
}
