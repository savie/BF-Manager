package l;

import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۫ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13296 implements AdapterView.OnItemLongClickListener {
    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = C17771.f58342;
        TextView textView = ((ViewOnClickListenerC25231) view.getTag()).f81493;
        Layout layout = textView.getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            for (int i3 = 0; i3 < lineCount; i3++) {
                if (layout.getEllipsisCount(i3) > 0) {
                    C22673.m51154(textView.getText());
                    return true;
                }
            }
        }
        return false;
    }
}
