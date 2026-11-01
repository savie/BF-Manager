package l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩺ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22734 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74061;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74062;

    public /* synthetic */ ViewOnClickListenerC22734(int i, Object obj) {
        this.f74061 = i;
        this.f74062 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f74061;
        Object obj = this.f74062;
        switch (i) {
            case 0:
                ((ActivityC4471) obj).f15897.m36067();
                break;
            case 1:
                C10948 c10948 = (C10948) obj;
                String string = ((TextView) view).getText().toString();
                int iM16916 = c10948.m16916();
                int iM17020 = c10948.m17020();
                if (iM16916 > iM17020) {
                    iM17020 = iM16916;
                    iM16916 = iM17020;
                }
                c10948.m17000().replace(iM16916, iM17020, string);
                c10948.mo17029(string.length() + iM16916);
                break;
            case 2:
                C4677.m12954((C4677) obj);
                break;
            case 3:
                int i2 = AbstractC23941.f77530;
                ((C1777) obj).m5825();
                break;
            default:
                int i3 = ActivityC23892.f77393;
                ((ActivityC23892) obj).finish();
                break;
        }
    }
}
