package l;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

/* JADX INFO: renamed from: l.ܽۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16621 implements InterfaceC20544, InterfaceC8601 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53327;

    public /* synthetic */ C16621(Object obj) {
        this.f53327 = obj;
    }

    @Override // l.InterfaceC8601
    public boolean perform(View view, AbstractC6483 abstractC6483) {
        return ((BottomSheetDragHandleView) this.f53327).lambda$onBottomSheetStateChanged$0(view, abstractC6483);
    }

    @Override // l.InterfaceC20544
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2120(String str) {
        return ((String) this.f53327).equals(str);
    }
}
