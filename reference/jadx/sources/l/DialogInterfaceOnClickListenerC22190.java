package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩷ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22190 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71494;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71495;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71496;

    public /* synthetic */ DialogInterfaceOnClickListenerC22190(int i, Object obj, Object obj2) {
        this.f71494 = i;
        this.f71496 = obj;
        this.f71495 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f71494) {
            case 0:
                ViewOnClickListenerC20698.m47349((ViewOnClickListenerC20698) this.f71496, (C8230) this.f71495);
                break;
            default:
                C13903.m33853((C13903) this.f71496, (String) this.f71495);
                break;
        }
    }
}
