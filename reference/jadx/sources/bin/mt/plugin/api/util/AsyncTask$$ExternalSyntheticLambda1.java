package bin.mt.plugin.api.util;

import l.ViewOnClickListenerC20698;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AsyncTask$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AsyncTask$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((AsyncTask) this.f$0).lambda$handleError$2((Exception) this.f$1);
                break;
            default:
                ViewOnClickListenerC20698.m47345((ViewOnClickListenerC20698) this.f$0, (Runnable) this.f$1);
                break;
        }
    }
}
