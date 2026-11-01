package l;

import bin.mt.plugin.api.ui.dialog.LoadingDialog;

/* JADX INFO: renamed from: l.᩺ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22797 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74185;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74186;

    public /* synthetic */ RunnableC22797(int i, Object obj) {
        this.f74185 = i;
        this.f74186 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f74185) {
            case 0:
                C3040.m9059((C3040) this.f74186);
                break;
            case 1:
                ((LoadingDialog) this.f74186).lambda$dismiss$2();
                break;
            default:
                C15556.m37197((String[]) this.f74186);
                break;
        }
    }
}
