package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ܳ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC14537 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47602;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47603;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47604;

    public /* synthetic */ DialogInterfaceOnClickListenerC14537(int i, Object obj, Object obj2) {
        this.f47603 = i;
        this.f47604 = obj;
        this.f47602 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f47603) {
            case 0:
                C4388.m12239((C3246) this.f47604, (AbstractActivityC12483) this.f47602);
                break;
            case 1:
                C20409 c20409 = (C20409) this.f47604;
                ActivityC11632 activityC11632 = (ActivityC11632) this.f47602;
                c20409.m46140(activityC11632, new RunnableC0860(1, activityC11632));
                break;
            case 2:
                ((PluginDialog.OnClickListener) this.f47602).onClick(((C15680) this.f47604).f50910, i);
                break;
            case 3:
                ViewOnClickListenerC8374.m21963((AbstractC20745) this.f47604, (ViewOnClickListenerC8374) this.f47602);
                break;
            case 4:
                ((C7236) this.f47604).m50126((ActivityC5677) this.f47602);
                break;
            default:
                C22315.m49478((C22315) this.f47604, (AbstractActivityC12483) this.f47602);
                break;
        }
    }
}
