package l;

import android.text.method.TextKeyListener;

/* JADX INFO: renamed from: l.ܰۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC14303 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45168;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f45169;

    public /* synthetic */ RunnableC14303(int i, Object obj) {
        this.f45168 = i;
        this.f45169 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f45168;
        Object obj = this.f45169;
        switch (i) {
            case 0:
                TextKeyListener textKeyListener = C24132.f77977;
                C21576.m49068(new RunnableC18779(0, (C24132) obj));
                break;
            default:
                ((C13378) obj).close();
                break;
        }
    }
}
