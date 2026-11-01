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

/* JADX INFO: renamed from: l.ܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 85OU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15946 implements InterfaceC22026, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Context f51646;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12418 f51647;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C20884 f51648;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LayoutInflater f51649;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C10301 f51650;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC5092 f51651;

    @Override // l.InterfaceC22026
    public final boolean collapseItemActionView(C12418 c12418, C23707 c23707) {
        return false;
    }

    @Override // l.InterfaceC22026
    public final boolean expandItemActionView(C12418 c12418, C23707 c23707) {
        return false;
    }

    @Override // l.InterfaceC22026
    public final boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC22026
    public final int getId() {
        return 0;
    }

    public C15946(Context context) {
        this.f51646 = context;
        this.f51649 = LayoutInflater.from(context);
    }

    @Override // l.InterfaceC22026
    public final void initForMenu(Context context, C12418 c12418) {
        if (this.f51646 != null) {
            this.f51646 = context;
            if (this.f51649 == null) {
                this.f51649 = LayoutInflater.from(context);
            }
        }
        this.f51647 = c12418;
        C20884 c20884 = this.f51648;
        if (c20884 != null) {
            c20884.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12854 m37908(ViewGroup viewGroup) {
        if (this.f51650 == null) {
            this.f51650 = (C10301) this.f51649.inflate(R.layout.MT_Protector, viewGroup, false);
            if (this.f51648 == null) {
                this.f51648 = new C20884(this);
            }
            this.f51650.setAdapter((ListAdapter) this.f51648);
            this.f51650.setOnItemClickListener(this);
        }
        return this.f51650;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ListAdapter m37907() {
        if (this.f51648 == null) {
            this.f51648 = new C20884(this);
        }
        return this.f51648;
    }

    @Override // l.InterfaceC22026
    public final void updateMenuView(boolean z) {
        C20884 c20884 = this.f51648;
        if (c20884 != null) {
            c20884.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC22026
    public final void setCallback(InterfaceC5092 interfaceC5092) {
        this.f51651 = interfaceC5092;
    }

    @Override // l.InterfaceC22026
    public final boolean onSubMenuSelected(SubMenuC7915 subMenuC7915) {
        if (!subMenuC7915.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC6067(subMenuC7915).m16466();
        InterfaceC5092 interfaceC5092 = this.f51651;
        if (interfaceC5092 == null) {
            return true;
        }
        interfaceC5092.mo3701(subMenuC7915);
        return true;
    }

    @Override // l.InterfaceC22026
    public final void onCloseMenu(C12418 c12418, boolean z) {
        InterfaceC5092 interfaceC5092 = this.f51651;
        if (interfaceC5092 != null) {
            interfaceC5092.onCloseMenu(c12418, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f51647.performItemAction(this.f51648.getItem(i), this, 0);
    }

    @Override // l.InterfaceC22026
    public final Parcelable onSaveInstanceState() {
        if (this.f51650 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        C10301 c10301 = this.f51650;
        if (c10301 != null) {
            c10301.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(NavigationMenuPresenter.STATE_HIERARCHY, sparseArray);
        return bundle;
    }

    @Override // l.InterfaceC22026
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray(NavigationMenuPresenter.STATE_HIERARCHY);
        if (sparseParcelableArray != null) {
            this.f51650.restoreHierarchyState(sparseParcelableArray);
        }
    }
}
