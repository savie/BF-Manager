package l;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۫ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB13 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12174 implements InterfaceC2580 {
    @Override // l.InterfaceC2580
    /* JADX INFO: renamed from: ۙ */
    public final C18374 mo8037(View view, C18374 c18374) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            C13638.toString(c18374);
        }
        if (c18374.m42620() == 2) {
            return c18374;
        }
        ClipData clipDataM42619 = c18374.m42619();
        int iM42621 = c18374.m42621();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataM42619.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataM42619.getItemAt(i);
            if ((iM42621 & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
