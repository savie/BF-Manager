package l;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B0Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C17926 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41839(DragEvent dragEvent, TextView textView, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            C22666.m51084(textView, new C12990(dragEvent.getClipData(), 3).m32397());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }
}
