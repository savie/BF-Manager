package l;

import android.text.Spanned;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC13773 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45394;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f45395;

    public /* synthetic */ ViewOnClickListenerC13773(int i, Object obj) {
        this.f45394 = i;
        this.f45395 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f45394) {
            case 0:
                DialogInterfaceOnClickListenerC8128.m21401((DialogInterfaceOnClickListenerC8128) this.f45395, view);
                break;
            case 1:
                AbstractC21013.m47189((AbstractC21013) this.f45395);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f45395;
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(((Spanned) it.next()).toString());
                    sb.append("\n");
                }
                C16737.m39272((CharSequence) sb.toString());
                break;
        }
    }
}
