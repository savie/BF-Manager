package l;

import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܶ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15510 implements AdapterView.OnItemLongClickListener {
    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = C9160.f31137;
        TextView textView = ((ViewOnClickListenerC8454) view.getTag()).f29328;
        Layout layout = textView.getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            for (int i3 = 0; i3 < lineCount; i3++) {
                if (layout.getEllipsisCount(i3) > 0) {
                    C15829.m37613(textView.getText());
                    return true;
                }
            }
        }
        return false;
    }
}
