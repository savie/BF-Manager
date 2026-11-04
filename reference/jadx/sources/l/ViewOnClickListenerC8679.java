package l;

import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8679 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28331;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f28332;

    public /* synthetic */ ViewOnClickListenerC8679(int i, Object obj) {
        this.f28331 = i;
        this.f28332 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28331) {
            case 0:
                C20065.m46124((C20065) this.f28332, view);
                break;
            case 1:
                ((C15107) this.f28332).m36383();
                view.setEnabled(false);
                ((Button) view).setTextColor(-7829368);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f28332;
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(((Spanned) it.next()).toString());
                    sb.append("\n");
                }
                C21576.m49067((CharSequence) sb.toString());
                break;
        }
    }
}
