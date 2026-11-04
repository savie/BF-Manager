package l;

import bin.mt.plugin.api.ui.dialog.ProgressDialog;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.۠ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8742 implements Consumer, InterfaceC14722, InterfaceC1922 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f28445;

    public /* synthetic */ C8742(Object obj) {
        this.f28445 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    public void accept(Object obj) {
        ((ProgressDialog) this.f28445).lambda$new$0((CharSequence) obj);
    }

    @Override // l.InterfaceC14722
    /* JADX INFO: renamed from: ۙ */
    public void mo18051(C18452 c18452) {
        ViewOnClickListenerC20698.m47359((ViewOnClickListenerC20698) this.f28445);
    }

    @Override // l.InterfaceC1922
    /* JADX INFO: renamed from: ᩷ */
    public String mo2305() {
        C25350 c25350 = (C25350) this.f28445;
        return c25350.m56678(c25350.f81831, c25350.f81857);
    }
}
