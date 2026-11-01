package l;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* JADX INFO: renamed from: l.֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes2.dex */
public final class C0900 extends CursorAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6545 f3622;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21362 f3623;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f3624;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17834 f3625;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f3626;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0900(C6545 c6545, ContextThemeWrapper contextThemeWrapper, Cursor cursor, C21362 c21362, C17834 c17834) {
        super((Context) contextThemeWrapper, cursor, false);
        this.f3622 = c6545;
        this.f3623 = c21362;
        this.f3625 = c17834;
        Cursor cursor2 = getCursor();
        this.f3626 = cursor2.getColumnIndexOrThrow(c6545.f22074);
        this.f3624 = cursor2.getColumnIndexOrThrow(c6545.f22080);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f3626));
        this.f3623.setItemChecked(cursor.getPosition(), cursor.getInt(this.f3624) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3622.f22055.inflate(this.f3625.f56510, viewGroup, false);
    }
}
