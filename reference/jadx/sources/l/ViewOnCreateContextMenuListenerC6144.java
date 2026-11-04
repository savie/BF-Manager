package l;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O5LX */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnCreateContextMenuListenerC6144 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3906 f20969;

    public ViewOnCreateContextMenuListenerC6144(C3906 c3906) {
        this.f20969 = c3906;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C3906 c3906 = this.f20969;
        CharSequence charSequenceMo12597 = c3906.mo12597();
        if (!c3906.m12588() || TextUtils.isEmpty(charSequenceMo12597)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceMo12597);
        contextMenu.add(0, 0, 0, R.string.MT_Protector).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        C3906 c3906 = this.f20969;
        ClipboardManager clipboardManager = (ClipboardManager) c3906.m12560().getSystemService("clipboard");
        CharSequence charSequenceMo12597 = c3906.mo12597();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceMo12597));
        Toast.makeText(c3906.m12560(), c3906.m12560().getString(R.string.MT_Protector, charSequenceMo12597), 0).show();
        return true;
    }
}
