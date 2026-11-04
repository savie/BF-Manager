package l;

import android.view.View;
import com.alipay.sdk.m.y.c;

/* JADX INFO: renamed from: l.ۤ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11152 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35126;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35127;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35128;

    public /* synthetic */ ViewOnClickListenerC11152(int i, Object obj, Object obj2) {
        this.f35126 = i;
        this.f35128 = obj;
        this.f35127 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f35126;
        Object obj = this.f35127;
        Object obj2 = this.f35128;
        int i2 = 0;
        switch (i) {
            case 0:
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) obj;
                if (((C24720) obj2).m55199()) {
                    abstractActivityC17204.m40399(new RunnableC19752());
                    C21998.m49729(abstractActivityC17204);
                    C6679.m18693();
                    C21576.m49069(new RunnableC9309(i2), 1000L);
                    C21576.m49069(new RunnableC9309(i2), c.a);
                }
                break;
            default:
                boolean[] zArr = (boolean[]) obj2;
                C21581 c21581 = (C21581) obj;
                int i3 = ActivityC22597.f73044;
                while (i2 < zArr.length) {
                    zArr[i2] = !zArr[i2];
                    i2++;
                }
                c21581.notifyDataSetChanged();
                break;
        }
    }
}
