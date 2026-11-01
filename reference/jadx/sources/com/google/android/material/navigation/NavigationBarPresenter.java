package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;
import l.C12418;
import l.C23707;
import l.InterfaceC12854;
import l.InterfaceC22026;
import l.InterfaceC5092;
import l.SubMenuC7915;

/* JADX INFO: loaded from: classes.dex */
public class NavigationBarPresenter implements InterfaceC22026 {
    public int id;
    public C12418 menu;
    public NavigationBarMenuView menuView;
    public boolean updateSuspended = false;

    @Override // l.InterfaceC22026
    public boolean collapseItemActionView(C12418 c12418, C23707 c23707) {
        return false;
    }

    @Override // l.InterfaceC22026
    public boolean expandItemActionView(C12418 c12418, C23707 c23707) {
        return false;
    }

    @Override // l.InterfaceC22026
    public boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC22026
    public void onCloseMenu(C12418 c12418, boolean z) {
    }

    @Override // l.InterfaceC22026
    public boolean onSubMenuSelected(SubMenuC7915 subMenuC7915) {
        return false;
    }

    @Override // l.InterfaceC22026
    public void setCallback(InterfaceC5092 interfaceC5092) {
    }

    public void setMenuView(NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    @Override // l.InterfaceC22026
    public void initForMenu(Context context, C12418 c12418) {
        this.menu = c12418;
        this.menuView.initialize(c12418);
    }

    public InterfaceC12854 getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // l.InterfaceC22026
    public void updateMenuView(boolean z) {
        if (this.updateSuspended) {
            return;
        }
        if (z) {
            this.menuView.buildMenuView();
        } else {
            this.menuView.updateMenuView();
        }
    }

    public void setId(int i) {
        this.id = i;
    }

    @Override // l.InterfaceC22026
    public int getId() {
        return this.id;
    }

    @Override // l.InterfaceC22026
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    @Override // l.InterfaceC22026
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.restoreBadgeDrawables(BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    public void setUpdateSuspended(boolean z) {
        this.updateSuspended = z;
    }

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public ParcelableSparseArray badgeSavedStates;
        public int selectedItemId;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }
    }
}
