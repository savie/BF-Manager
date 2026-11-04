package l;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 15V0 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5315 {
    boolean collapseItemActionView(C9898 c9898, C8407 c8407);

    boolean expandItemActionView(C9898 c9898, C8407 c8407);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, C9898 c9898);

    void onCloseMenu(C9898 c9898, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(SubMenuC12026 subMenuC12026);

    void setCallback(InterfaceC12772 interfaceC12772);

    void updateMenuView(boolean z);
}
