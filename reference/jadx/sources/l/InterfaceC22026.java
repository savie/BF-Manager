package l;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15V0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC22026 {
    boolean collapseItemActionView(C12418 c12418, C23707 c23707);

    boolean expandItemActionView(C12418 c12418, C23707 c23707);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, C12418 c12418);

    void onCloseMenu(C12418 c12418, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(SubMenuC7915 subMenuC7915);

    void setCallback(InterfaceC5092 interfaceC5092);

    void updateMenuView(boolean z);
}
