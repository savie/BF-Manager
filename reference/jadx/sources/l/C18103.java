package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import bin.mt.plus.R;
import com.google.android.material.internal.NavigationMenuPresenter;

/* JADX INFO: renamed from: l.ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85OU */
/* JADX INFO: loaded from: classes5.dex */
public final class C18103 implements InterfaceC5315, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public LayoutInflater f59246;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f59247;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C3933 f59248;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21087 f59249;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Context f59250;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9898 f59251;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC12772 f59252;

    @Override // l.InterfaceC5315
    public final boolean collapseItemActionView(C9898 c9898, C8407 c8407) {
        return false;
    }

    @Override // l.InterfaceC5315
    public final boolean expandItemActionView(C9898 c9898, C8407 c8407) {
        return false;
    }

    @Override // l.InterfaceC5315
    public final boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC5315
    public final int getId() {
        return 0;
    }

    public C18103(Context context, int i) {
        this.f59247 = i;
        this.f59250 = context;
        this.f59246 = LayoutInflater.from(context);
    }

    @Override // l.InterfaceC5315
    public final void initForMenu(Context context, C9898 c9898) {
        if (this.f59250 != null) {
            this.f59250 = context;
            if (this.f59246 == null) {
                this.f59246 = LayoutInflater.from(context);
            }
        }
        this.f59251 = c9898;
        C21087 c21087 = this.f59249;
        if (c21087 != null) {
            c21087.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11280 m42223(ViewGroup viewGroup) {
        if (this.f59248 == null) {
            this.f59248 = (C3933) this.f59246.inflate(R.layout.MT_Protector, viewGroup, false);
            if (this.f59249 == null) {
                this.f59249 = new C21087(this);
            }
            this.f59248.setAdapter((ListAdapter) this.f59249);
            this.f59248.setOnItemClickListener(this);
        }
        return this.f59248;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ListAdapter m42222() {
        if (this.f59249 == null) {
            this.f59249 = new C21087(this);
        }
        return this.f59249;
    }

    @Override // l.InterfaceC5315
    public final void updateMenuView(boolean z) {
        C21087 c21087 = this.f59249;
        if (c21087 != null) {
            c21087.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC5315
    public final void setCallback(InterfaceC12772 interfaceC12772) {
        this.f59252 = interfaceC12772;
    }

    @Override // l.InterfaceC5315
    public final boolean onSubMenuSelected(SubMenuC12026 subMenuC12026) {
        if (!subMenuC12026.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC9152(subMenuC12026).m24286();
        InterfaceC12772 interfaceC12772 = this.f59252;
        if (interfaceC12772 == null) {
            return true;
        }
        interfaceC12772.mo6418(subMenuC12026);
        return true;
    }

    @Override // l.InterfaceC5315
    public final void onCloseMenu(C9898 c9898, boolean z) {
        InterfaceC12772 interfaceC12772 = this.f59252;
        if (interfaceC12772 != null) {
            interfaceC12772.onCloseMenu(c9898, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f59251.performItemAction(this.f59249.getItem(i), this, 0);
    }

    @Override // l.InterfaceC5315
    public final Parcelable onSaveInstanceState() {
        if (this.f59248 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        C3933 c3933 = this.f59248;
        if (c3933 != null) {
            c3933.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(NavigationMenuPresenter.STATE_HIERARCHY, sparseArray);
        return bundle;
    }

    @Override // l.InterfaceC5315
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray(NavigationMenuPresenter.STATE_HIERARCHY);
        if (sparseParcelableArray != null) {
            this.f59248.restoreHierarchyState(sparseParcelableArray);
        }
    }
}
