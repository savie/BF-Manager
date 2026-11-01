package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Q6 */
/* JADX INFO: loaded from: classes4.dex */
public class C12418 implements InterfaceMenuC1957 {
    public static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    public static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    public static final String PRESENTER_KEY = "android:menu:presenters";
    public static final String TAG = "MenuBuilder";
    public static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    public InterfaceC0422 mCallback;
    public final Context mContext;
    public ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    public C23707 mExpandedItem;
    public Drawable mHeaderIcon;
    public CharSequence mHeaderTitle;
    public View mHeaderView;
    public boolean mOverrideVisibleItems;
    public boolean mQwertyMode;
    public final Resources mResources;
    public boolean mShortcutsVisible;
    public int mDefaultShowAsAction = 0;
    public boolean mPreventDispatchingItemsChanged = false;
    public boolean mItemsChangedWhileDispatchPrevented = false;
    public boolean mStructureChangedWhileDispatchPrevented = false;
    public boolean mOptionalIconsVisible = false;
    public boolean mIsClosing = false;
    public ArrayList mTempShortcutItemList = new ArrayList();
    public CopyOnWriteArrayList mPresenters = new CopyOnWriteArrayList();
    public boolean mGroupDividerEnabled = false;
    public ArrayList mItems = new ArrayList();
    public ArrayList mVisibleItems = new ArrayList();
    public boolean mIsVisibleItemsStale = true;
    public ArrayList mActionItems = new ArrayList();
    public ArrayList mNonActionItems = new ArrayList();
    public boolean mIsActionItemsStale = true;

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public C12418 getRootMenu() {
        return this;
    }

    public C12418(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        m30878(true);
    }

    public C12418 setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    public void addMenuPresenter(InterfaceC22026 interfaceC22026) {
        addMenuPresenter(interfaceC22026, this.mContext);
    }

    public void addMenuPresenter(InterfaceC22026 interfaceC22026, Context context) {
        this.mPresenters.add(new WeakReference(interfaceC22026));
        interfaceC22026.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    public void removeMenuPresenter(InterfaceC22026 interfaceC22026) {
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC22026 interfaceC22027 = (InterfaceC22026) weakReference.get();
            if (interfaceC22027 == null || interfaceC22027 == interfaceC22026) {
                this.mPresenters.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30875(boolean z) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC22026 interfaceC22026 = (InterfaceC22026) weakReference.get();
            if (interfaceC22026 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                interfaceC22026.updateMenuView(z);
            }
        }
        startDispatchingItemsChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m30876(SubMenuC7915 subMenuC7915, InterfaceC22026 interfaceC22026) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = interfaceC22026 != null ? interfaceC22026.onSubMenuSelected(subMenuC7915) : false;
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC22026 interfaceC22027 = (InterfaceC22026) weakReference.get();
            if (interfaceC22027 == null) {
                this.mPresenters.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = interfaceC22027.onSubMenuSelected(subMenuC7915);
            }
        }
        return zOnSubMenuSelected;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m30877(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC22026 interfaceC22026 = (InterfaceC22026) weakReference.get();
            if (interfaceC22026 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = interfaceC22026.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = interfaceC22026.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30874(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC22026 interfaceC22026 = (InterfaceC22026) weakReference.get();
            if (interfaceC22026 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = interfaceC22026.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC22026.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    public void savePresenterStates(Bundle bundle) {
        m30877(bundle);
    }

    public void restorePresenterStates(Bundle bundle) {
        m30874(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC7915) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC7915) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i2 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void setCallback(InterfaceC0422 interfaceC0422) {
        this.mCallback = interfaceC0422;
    }

    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int iM30869 = m30869(i3);
        C23707 c23707M30871 = m30871(i, i2, i3, iM30869, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            c23707M30871.m52172(contextMenuInfo);
        }
        ArrayList arrayList = this.mItems;
        arrayList.add(m30870(arrayList, iM30869), c23707M30871);
        onItemsChanged(true);
        return c23707M30871;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23707 m30871(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C23707(this, i, i2, i3, i4, charSequence, i5);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return addInternal(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C23707 c23707 = (C23707) addInternal(i, i2, i3, charSequence);
        SubMenuC7915 subMenuC7915 = new SubMenuC7915(this.mContext, this, c23707);
        c23707.m52173(subMenuC7915);
        return subMenuC7915;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // l.InterfaceMenuC1957, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mGroupDividerEnabled = z;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m30873(findItemIndex(i), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iFindGroupIndex = findGroupIndex(i);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C23707) this.mItems.get(iFindGroupIndex)).getGroupId() != i) {
                    break;
                }
                m30873(iFindGroupIndex, false);
                i2 = i3;
            }
            onItemsChanged(true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30873(int i, boolean z) {
        if (i < 0 || i >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i);
        if (z) {
            onItemsChanged(true);
        }
    }

    public void removeItemAt(int i) {
        m30873(i, true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    @Override // android.view.Menu
    public void clear() {
        C23707 c23707 = this.mExpandedItem;
        if (c23707 != null) {
            collapseItemActionView(c23707);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i = 0; i < size; i++) {
            C23707 c23707 = (C23707) this.mItems.get(i);
            if (c23707.getGroupId() == groupId && c23707.m52177() && c23707.isCheckable()) {
                c23707.m52180(c23707 == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            C23707 c23707 = (C23707) this.mItems.get(i2);
            if (c23707.getGroupId() == i) {
                c23707.m52178(z2);
                c23707.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.mItems.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C23707 c23707 = (C23707) this.mItems.get(i2);
            if (c23707.getGroupId() == i && c23707.m52176(z)) {
                z2 = true;
            }
        }
        if (z2) {
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            C23707 c23707 = (C23707) this.mItems.get(i2);
            if (c23707.getGroupId() == i) {
                c23707.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C23707) this.mItems.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C23707 c23707 = (C23707) this.mItems.get(i2);
            if (c23707.getItemId() == i) {
                return c23707;
            }
            if (c23707.hasSubMenu() && (menuItemFindItem = c23707.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C23707) this.mItems.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    public int findGroupIndex(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C23707) this.mItems.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return (MenuItem) this.mItems.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30869(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    public void setShortcutsVisible(boolean z) {
        if (this.mShortcutsVisible == z) {
            return;
        }
        m30878(z);
        onItemsChanged(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m30878(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.mResources.getConfiguration().keyboard != 1 && C3619.m10720(ViewConfiguration.get(this.mContext), this.mContext);
        }
        this.mShortcutsVisible = z2;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean dispatchMenuItemSelected(C12418 c12418, MenuItem menuItem) {
        InterfaceC0422 interfaceC0422 = this.mCallback;
        return interfaceC0422 != null && interfaceC0422.onMenuItemSelected(c12418, menuItem);
    }

    public void changeMenuMode() {
        InterfaceC0422 interfaceC0422 = this.mCallback;
        if (interfaceC0422 != null) {
            interfaceC0422.onMenuModeChange(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30870(ArrayList arrayList, int i) {
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return 0;
            }
        } while (((C23707) arrayList.get(size)).m52168() > i);
        return size + 1;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C23707 c23707FindItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        boolean zPerformItemAction = c23707FindItemWithShortcutForKey != null ? performItemAction(c23707FindItemWithShortcutForKey, i2) : false;
        if ((i2 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    public void findItemsWithShortcutForKey(List list, int i, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.mItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                C23707 c23707 = (C23707) this.mItems.get(i2);
                if (c23707.hasSubMenu()) {
                    ((C12418) c23707.getSubMenu()).findItemsWithShortcutForKey(list, i, keyEvent);
                }
                char alphabeticShortcut = zIsQwertyMode ? c23707.getAlphabeticShortcut() : c23707.getNumericShortcut();
                if ((modifiers & 69647) == ((zIsQwertyMode ? c23707.getAlphabeticModifiers() : c23707.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zIsQwertyMode && alphabeticShortcut == '\b' && i == 67)) && c23707.isEnabled()) {
                        list.add(c23707);
                    }
                }
            }
        }
    }

    public C23707 findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C23707) arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i2 = 0; i2 < size; i2++) {
            C23707 c23707 = (C23707) arrayList.get(i2);
            if (zIsQwertyMode) {
                numericShortcut = c23707.getAlphabeticShortcut();
            } else {
                numericShortcut = c23707.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && numericShortcut == '\b' && i == 67))) {
                return c23707;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
        return performItemAction(menuItem, null, i);
    }

    public boolean performItemAction(MenuItem menuItem, InterfaceC22026 interfaceC22026, int i) {
        C23707 c23707 = (C23707) menuItem;
        if (c23707 == null || !c23707.isEnabled()) {
            return false;
        }
        boolean zM52179 = c23707.m52179();
        AbstractC5674 abstractC5674Mo4156 = c23707.mo4156();
        boolean z = abstractC5674Mo4156 != null && abstractC5674Mo4156.mo15568();
        if (c23707.m52167()) {
            boolean zExpandActionView = c23707.expandActionView() | zM52179;
            if (zExpandActionView) {
                close(true);
            }
            return zExpandActionView;
        }
        if (!c23707.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                close(true);
            }
            return zM52179;
        }
        if ((i & 4) == 0) {
            close(false);
        }
        if (!c23707.hasSubMenu()) {
            c23707.m52173(new SubMenuC7915(getContext(), this, c23707));
        }
        SubMenuC7915 subMenuC7915 = (SubMenuC7915) c23707.getSubMenu();
        if (z) {
            abstractC5674Mo4156.mo15567(subMenuC7915);
        }
        boolean zM30876 = m30876(subMenuC7915, interfaceC22026) | zM52179;
        if (!zM30876) {
            close(true);
        }
        return zM30876;
    }

    public final void close(boolean z) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC22026 interfaceC22026 = (InterfaceC22026) weakReference.get();
            if (interfaceC22026 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                interfaceC22026.onCloseMenu(this, z);
            }
        }
        this.mIsClosing = false;
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public void onItemsChanged(boolean z) {
        if (!this.mPreventDispatchingItemsChanged) {
            if (z) {
                this.mIsVisibleItemsStale = true;
                this.mIsActionItemsStale = true;
            }
            m30875(z);
            return;
        }
        this.mItemsChangedWhileDispatchPrevented = true;
        if (z) {
            this.mStructureChangedWhileDispatchPrevented = true;
        }
    }

    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void onItemVisibleChanged(C23707 c23707) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemActionRequestChanged(C23707 c23707) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public ArrayList getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            C23707 c23707 = (C23707) this.mItems.get(i);
            if (c23707.isVisible()) {
                this.mVisibleItems.add(c23707);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    public void flagActionItems() {
        ArrayList visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            boolean zFlagActionItems = false;
            for (WeakReference weakReference : this.mPresenters) {
                InterfaceC22026 interfaceC22026 = (InterfaceC22026) weakReference.get();
                if (interfaceC22026 == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zFlagActionItems |= interfaceC22026.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i = 0; i < size; i++) {
                    C23707 c23707 = (C23707) visibleItems.get(i);
                    if (c23707.m52170()) {
                        this.mActionItems.add(c23707);
                    } else {
                        this.mNonActionItems.add(c23707);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public ArrayList getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30872(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i > 0) {
                this.mHeaderTitle = resources.getText(i);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i2 > 0) {
                this.mHeaderIcon = C10405.m26304(getContext(), i2);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    public C12418 setHeaderTitleInt(CharSequence charSequence) {
        m30872(0, charSequence, 0, null, null);
        return this;
    }

    public C12418 setHeaderTitleInt(int i) {
        m30872(i, null, 0, null, null);
        return this;
    }

    public C12418 setHeaderIconInt(Drawable drawable) {
        m30872(0, null, 0, drawable, null);
        return this;
    }

    public C12418 setHeaderIconInt(int i) {
        m30872(0, null, i, null, null);
        return this;
    }

    public C12418 setHeaderViewInt(View view) {
        m30872(0, null, 0, null, view);
        return this;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public void setOptionalIconsVisible(boolean z) {
        this.mOptionalIconsVisible = z;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public boolean expandItemActionView(C23707 c23707) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC22026 interfaceC22026 = (InterfaceC22026) weakReference.get();
            if (interfaceC22026 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                zExpandItemActionView = interfaceC22026.expandItemActionView(this, c23707);
                if (zExpandItemActionView) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = c23707;
        }
        return zExpandItemActionView;
    }

    public boolean collapseItemActionView(C23707 c23707) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == c23707) {
            stopDispatchingItemsChanged();
            for (WeakReference weakReference : this.mPresenters) {
                InterfaceC22026 interfaceC22026 = (InterfaceC22026) weakReference.get();
                if (interfaceC22026 == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zCollapseItemActionView = interfaceC22026.collapseItemActionView(this, c23707);
                    if (zCollapseItemActionView) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    public C23707 getExpandedItem() {
        return this.mExpandedItem;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.mOverrideVisibleItems = z;
    }
}
