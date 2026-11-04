package l;

import android.text.Spanned;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC7876 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26215;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26216;

    public /* synthetic */ ViewOnClickListenerC7876(int i, Object obj) {
        this.f26215 = i;
        this.f26216 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f26215;
        Object obj = this.f26216;
        switch (i) {
            case 0:
                ActivityC18143 activityC18143 = (ActivityC18143) obj;
                activityC18143.f59341.smoothScrollToPosition(activityC18143.f59340);
                break;
            case 1:
                int i2 = ActivityC3786.f12968;
                ((ActivityC3786) obj).finish();
                break;
            case 2:
                AbstractActivityC10144.m26233((AbstractActivityC10144) obj);
                break;
            case 3:
                C21425.m48747((C21425) obj);
                break;
            case 4:
                int i3 = ActivityC6138.f20955;
                ((ActivityC6138) obj).finish();
                break;
            case 5:
                StringBuilder sb = new StringBuilder();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    sb.append(((Spanned) it.next()).toString());
                    sb.append("\n");
                }
                C21576.m49067((CharSequence) sb.toString());
                break;
            default:
                int i4 = ActivityC0885.f3292;
                ((ActivityC0885) obj).finish();
                break;
        }
    }
}
