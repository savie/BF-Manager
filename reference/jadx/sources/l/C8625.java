package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 355C */
/* JADX INFO: loaded from: classes4.dex */
public final class C8625 implements InterfaceC19067 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28185 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9086 f28186 = new C9086();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context f28187;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActionMode.Callback f28188;

    public C8625(Context context, ActionMode.Callback callback) {
        this.f28187 = context;
        this.f28188 = callback;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m23253(AbstractC10116 abstractC10116, Menu menu) {
        C7134 c7134M23252 = m23252(abstractC10116);
        C9086 c9086 = this.f28186;
        Menu menuC24707 = (Menu) c9086.get(menu);
        if (menuC24707 == null) {
            menuC24707 = new MenuC24707(this.f28187, (InterfaceMenuC10774) menu);
            c9086.put(menu, menuC24707);
        }
        return this.f28188.onCreateActionMode(c7134M23252, menuC24707);
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23250(AbstractC10116 abstractC10116, Menu menu) {
        C7134 c7134M23252 = m23252(abstractC10116);
        C9086 c9086 = this.f28186;
        Menu menuC24707 = (Menu) c9086.get(menu);
        if (menuC24707 == null) {
            menuC24707 = new MenuC24707(this.f28187, (InterfaceMenuC10774) menu);
            c9086.put(menu, menuC24707);
        }
        return this.f28188.onPrepareActionMode(c7134M23252, menuC24707);
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23251(AbstractC10116 abstractC10116, MenuItem menuItem) {
        return this.f28188.onActionItemClicked(m23252(abstractC10116), new MenuItemC10534(this.f28187, (InterfaceMenuItemC22709) menuItem));
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23249(AbstractC10116 abstractC10116) {
        this.f28188.onDestroyActionMode(m23252(abstractC10116));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7134 m23252(AbstractC10116 abstractC10116) {
        ArrayList arrayList = this.f28185;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7134 c7134 = (C7134) arrayList.get(i);
            if (c7134 != null && c7134.f23491 == abstractC10116) {
                return c7134;
            }
        }
        C7134 c7135 = new C7134(this.f28187, abstractC10116);
        arrayList.add(c7135);
        return c7135;
    }
}
