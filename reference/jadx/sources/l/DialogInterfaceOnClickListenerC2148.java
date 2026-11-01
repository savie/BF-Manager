package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֫᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2148 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7817;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7818;

    public /* synthetic */ DialogInterfaceOnClickListenerC2148(int i, Object obj) {
        this.f7817 = i;
        this.f7818 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f7817;
        Object obj = this.f7818;
        switch (i2) {
            case 0:
                C18377 c18377 = (C18377) obj;
                c18377.m42649(3);
                c18377.m42659();
                break;
            case 1:
                C6732.m18179((C6732) obj);
                break;
            case 2:
                ViewOnClickListenerC19497.m44548((ViewOnClickListenerC19497) obj);
                break;
            default:
                int i3 = ActivityC11220.f37969;
                ((ActivityC11220) obj).finish();
                break;
        }
    }
}
