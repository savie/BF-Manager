package l;

import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

/* JADX INFO: renamed from: l.᩹ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22237 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72698;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72699;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f72700;

    public /* synthetic */ ViewOnClickListenerC22237(boolean[] zArr, Object obj, int i) {
        this.f72699 = i;
        this.f72700 = zArr;
        this.f72698 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f72699;
        int i2 = 0;
        Object obj = this.f72698;
        boolean[] zArr = this.f72700;
        switch (i) {
            case 0:
                ListView listView = (ListView) obj;
                int i3 = ActivityC5677.f19358;
                while (i2 < zArr.length) {
                    zArr[i2] = !zArr[i2];
                    i2++;
                }
                ((BaseAdapter) listView.getAdapter()).notifyDataSetChanged();
                break;
            default:
                C0525 c0525 = (C0525) obj;
                while (i2 < zArr.length) {
                    zArr[i2] = !zArr[i2];
                    i2++;
                }
                c0525.notifyDataSetChanged();
                break;
        }
    }
}
