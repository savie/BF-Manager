package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 355C */
/* JADX INFO: loaded from: classes.dex */
public final class C23356 implements InterfaceC16300 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ActionMode.Callback f75660;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f75661 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12274 f75662 = new C12274();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f75663;

    public C23356(Context context, ActionMode.Callback callback) {
        this.f75663 = context;
        this.f75660 = callback;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m51472(AbstractC12067 abstractC12067, Menu menu) {
        C14184 c14184M51471 = m51471(abstractC12067);
        C12274 c12274 = this.f75662;
        Menu menuC3680 = (Menu) c12274.getOrDefault(menu, null);
        if (menuC3680 == null) {
            menuC3680 = new MenuC3680(this.f75663, (InterfaceMenuC1957) menu);
            c12274.put(menu, menuC3680);
        }
        return this.f75660.onCreateActionMode(c14184M51471, menuC3680);
    }

    @Override // l.InterfaceC16300
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8541(AbstractC12067 abstractC12067, Menu menu) {
        C14184 c14184M51471 = m51471(abstractC12067);
        C12274 c12274 = this.f75662;
        Menu menuC3680 = (Menu) c12274.getOrDefault(menu, null);
        if (menuC3680 == null) {
            menuC3680 = new MenuC3680(this.f75663, (InterfaceMenuC1957) menu);
            c12274.put(menu, menuC3680);
        }
        return this.f75660.onPrepareActionMode(c14184M51471, menuC3680);
    }

    @Override // l.InterfaceC16300
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8542(AbstractC12067 abstractC12067, MenuItem menuItem) {
        return this.f75660.onActionItemClicked(m51471(abstractC12067), new MenuItemC4386(this.f75663, (InterfaceMenuItemC9720) menuItem));
    }

    @Override // l.InterfaceC16300
    /* JADX INFO: renamed from: ۙ */
    public final void mo8540(AbstractC12067 abstractC12067) {
        this.f75660.onDestroyActionMode(m51471(abstractC12067));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14184 m51471(AbstractC12067 abstractC12067) {
        ArrayList arrayList = this.f75661;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C14184 c14184 = (C14184) arrayList.get(i);
            if (c14184 != null && c14184.f46535 == abstractC12067) {
                return c14184;
            }
        }
        C14184 c14185 = new C14184(this.f75663, abstractC12067);
        arrayList.add(c14185);
        return c14185;
    }
}
