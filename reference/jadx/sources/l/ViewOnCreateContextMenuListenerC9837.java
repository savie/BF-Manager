package l;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5LX */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnCreateContextMenuListenerC9837 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4751 f33615;

    public ViewOnCreateContextMenuListenerC9837(C4751 c4751) {
        this.f33615 = c4751;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C4751 c4751 = this.f33615;
        CharSequence charSequenceMo13159 = c4751.mo13159();
        if (!c4751.m13178() || TextUtils.isEmpty(charSequenceMo13159)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceMo13159);
        contextMenu.add(0, 0, 0, R.string.MT_Protector).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        C4751 c4751 = this.f33615;
        ClipboardManager clipboardManager = (ClipboardManager) c4751.m13133().getSystemService("clipboard");
        CharSequence charSequenceMo13159 = c4751.mo13159();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceMo13159));
        Toast.makeText(c4751.m13133(), c4751.m13133().getString(R.string.MT_Protector, charSequenceMo13159), 0).show();
        return true;
    }
}
