package l;

import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ᩴۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19757 implements InterfaceC21436 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f63583;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12964 f63584;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f63585;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f63586;

    public C19757(ArrayList arrayList, boolean z, View view, AbstractC12964 abstractC12964) {
        this.f63586 = arrayList;
        this.f63585 = z;
        this.f63583 = view;
        this.f63584 = abstractC12964;
    }

    @Override // l.InterfaceC21436
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList arrayList = this.f63586;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int itemId = menuItem.getItemId();
        boolean z = this.f63585;
        if (itemId == R.string.MT_Protector) {
            C14118.m34287(arrayList, 0, z);
        } else if (itemId == R.string.MT_Protector) {
            C14118.m34287(arrayList, 1, z);
        } else if (itemId == R.string.MT_Protector) {
            C14118.m34287(arrayList, 2, z);
        } else if (itemId == R.string.MT_Protector) {
            C14118.m34287(arrayList, 3, z);
        } else if (itemId == R.string.MT_Protector) {
            Collections.reverse(arrayList);
            menuItem.setChecked(!z);
            this.f63583.setTag(R.id.MT_Protector, !z ? Object.class : null);
        }
        C8050.m21936(new C22741(this, arrayList2), true).m35496(this.f63584);
        return true;
    }
}
