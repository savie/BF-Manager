package l;

import android.content.Context;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes4.dex */
public final class C11649 extends C0733 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3886 f39165;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39166;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f39167;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11649(AbstractC3886 abstractC3886, Context context, EnumC13060[] enumC13060Arr, boolean z, int i) {
        super(context, enumC13060Arr);
        this.f39165 = abstractC3886;
        this.f39167 = z;
        this.f39166 = i;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        boolean z = this.f39167;
        AbstractC3886 abstractC3886 = this.f39165;
        return (!z && (this.f39166 <= 1 || abstractC3886.f14529.isChecked())) || i < abstractC3886.f14521.length + (-5);
    }

    @Override // l.C4406, android.widget.Adapter
    public final int getCount() {
        boolean z = this.f39167;
        AbstractC3886 abstractC3886 = this.f39165;
        if ((z || (this.f39166 > 1 && !abstractC3886.f14529.isChecked())) && abstractC3886.f14540.getSelectedItemPosition() >= abstractC3886.f14521.length - 5) {
            abstractC3886.f14540.setSelection(abstractC3886.f14540.getSelectedItemPosition() - 5);
        }
        return abstractC3886.f14521.length;
    }

    @Override // l.C0733
    /* JADX INFO: renamed from: ۙ */
    public final void mo3188(TextView textView, int i, boolean z) {
        if (z) {
            textView.setAlpha(isEnabled(i) ? 1.0f : 0.3f);
        }
    }
}
