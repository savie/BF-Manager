package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11209 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35369;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35370;

    public /* synthetic */ RunnableC11209(int i, Object obj) {
        this.f35369 = i;
        this.f35370 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35369) {
            case 0:
                ActivityC3409 activity = ((C7941) this.f35370).getActivity();
                if (activity != null) {
                    ((ActivityC18143) activity).m42308(R.layout.MT_Protector);
                }
                break;
            default:
                ((ActivityC3846) this.f35370).m12389();
                break;
        }
    }
}
