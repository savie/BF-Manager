package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 45OX */
/* JADX INFO: loaded from: classes5.dex */
public final class C15337 extends AbstractC10116 implements InterfaceC7662 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC19067 f50090;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public WeakReference f50091;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13100 f50092;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Context f50093;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9898 f50094;

    public C15337(C13100 c13100, Context context, InterfaceC19067 interfaceC19067) {
        this.f50092 = c13100;
        this.f50093 = context;
        this.f50090 = interfaceC19067;
        C9898 defaultShowAsAction = new C9898(context).setDefaultShowAsAction(1);
        this.f50094 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ᩸ */
    public final MenuInflater mo8812() {
        return new C21833(this.f50093);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۤ */
    public final C9898 mo8805() {
        return this.f50094;
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۙ */
    public final void mo8800() {
        C13100 c13100 = this.f50092;
        if (c13100.f41863 != this) {
            return;
        }
        if (c13100.f41874) {
            c13100.f41867 = this;
            c13100.f41883 = this.f50090;
        } else {
            ((C15402) this.f50090).mo23249(this);
        }
        this.f50090 = null;
        c13100.m32568(false);
        c13100.f41871.m1182();
        c13100.f41865.m7868(c13100.f41881);
        c13100.f41863 = null;
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ֫ */
    public final void mo8799() {
        if (this.f50092.f41863 != this) {
            return;
        }
        C9898 c9898 = this.f50094;
        c9898.stopDispatchingItemsChanged();
        try {
            this.f50090.mo23250(this, c9898);
        } finally {
            c9898.startDispatchingItemsChanged();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m36787() {
        C9898 c9898 = this.f50094;
        c9898.stopDispatchingItemsChanged();
        try {
            return ((C15402) this.f50090).m36882(this, c9898);
        } finally {
            c9898.startDispatchingItemsChanged();
        }
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۙ */
    public final void mo8802(View view) {
        this.f50092.f41871.m1184(view);
        this.f50091 = new WeakReference(view);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۙ */
    public final void mo8803(CharSequence charSequence) {
        this.f50092.f41871.m1185(charSequence);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8811(CharSequence charSequence) {
        this.f50092.f41871.m1192(charSequence);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8810(int i) {
        mo8811(this.f50092.f41876.getResources().getString(i));
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۙ */
    public final void mo8801(int i) {
        mo8803((CharSequence) this.f50092.f41876.getResources().getString(i));
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۫ */
    public final CharSequence mo8807() {
        return this.f50092.f41871.m1188();
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ᩴ */
    public final CharSequence mo8808() {
        return this.f50092.f41871.m1191();
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۙ */
    public final void mo8804(boolean z) {
        super.mo8804(z);
        this.f50092.f41871.m1187(z);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8806() {
        return this.f50092.f41871.m1193();
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ᩷ */
    public final View mo8809() {
        WeakReference weakReference = this.f50091;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.InterfaceC7662
    public final boolean onMenuItemSelected(C9898 c9898, MenuItem menuItem) {
        InterfaceC19067 interfaceC19067 = this.f50090;
        if (interfaceC19067 != null) {
            return ((C15402) interfaceC19067).mo23251(this, menuItem);
        }
        return false;
    }

    @Override // l.InterfaceC7662
    public final void onMenuModeChange(C9898 c9898) {
        if (this.f50090 == null) {
            return;
        }
        mo8799();
        this.f50092.f41871.m1189();
    }
}
