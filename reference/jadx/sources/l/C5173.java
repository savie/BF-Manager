package l;

import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۚۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5173 implements InterfaceC21133 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f17940;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0414 f17941;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f17942;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f17943;

    public C5173(ArrayList arrayList, boolean z, View view, AbstractC0414 abstractC0414) {
        this.f17943 = arrayList;
        this.f17940 = z;
        this.f17942 = view;
        this.f17941 = abstractC0414;
    }

    @Override // l.InterfaceC21133
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList arrayList = this.f17943;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int itemId = menuItem.getItemId();
        boolean z = this.f17940;
        if (itemId == R.string.MT_Protector) {
            C3386.m10046(arrayList, 0, z);
        } else if (itemId == R.string.MT_Protector) {
            C3386.m10046(arrayList, 1, z);
        } else if (itemId == R.string.MT_Protector) {
            C3386.m10046(arrayList, 2, z);
        } else if (itemId == R.string.MT_Protector) {
            C3386.m10046(arrayList, 3, z);
        } else if (itemId == R.string.MT_Protector) {
            Collections.reverse(arrayList);
            menuItem.setChecked(!z);
            this.f17942.setTag(R.id.MT_Protector, !z ? Object.class : null);
        }
        C4066.m11593(new C2350(this, arrayList2)).m15146(this.f17941);
        return true;
    }
}
