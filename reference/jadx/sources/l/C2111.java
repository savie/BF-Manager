package l;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* JADX INFO: renamed from: l.֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes2.dex */
public final class C2111 extends CursorAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3602 f6984;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23740 f6985;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f6986;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17026 f6987;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f6988;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2111(C17026 c17026, ContextThemeWrapper contextThemeWrapper, Cursor cursor, C23740 c23740, C3602 c3602) {
        super((Context) contextThemeWrapper, cursor, false);
        this.f6987 = c17026;
        this.f6985 = c23740;
        this.f6984 = c3602;
        Cursor cursor2 = getCursor();
        this.f6988 = cursor2.getColumnIndexOrThrow(c17026.f55648);
        this.f6986 = cursor2.getColumnIndexOrThrow(c17026.f55650);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f6988));
        this.f6985.setItemChecked(cursor.getPosition(), cursor.getInt(this.f6986) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f6987.f55629.inflate(this.f6984.f12324, viewGroup, false);
    }
}
