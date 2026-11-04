package l;

import android.content.Context;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes5.dex */
public final class C15260 extends C3054 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49899;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16752 f49900;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49901;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15260(AbstractC16752 abstractC16752, Context context, EnumC24958[] enumC24958Arr, boolean z, int i) {
        super(context, enumC24958Arr);
        this.f49900 = abstractC16752;
        this.f49899 = z;
        this.f49901 = i;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        boolean z = this.f49899;
        AbstractC16752 abstractC16752 = this.f49900;
        return (!z && (this.f49901 <= 1 || abstractC16752.f54094.isChecked())) || i < abstractC16752.f54081.length + (-5);
    }

    @Override // l.C19131, android.widget.Adapter
    public final int getCount() {
        boolean z = this.f49899;
        AbstractC16752 abstractC16752 = this.f49900;
        if ((z || (this.f49901 > 1 && !abstractC16752.f54094.isChecked())) && abstractC16752.f54098.getSelectedItemPosition() >= abstractC16752.f54081.length - 5) {
            abstractC16752.f54098.setSelection(abstractC16752.f54098.getSelectedItemPosition() - 5);
        }
        return abstractC16752.f54081.length;
    }

    @Override // l.C3054
    /* JADX INFO: renamed from: ۙ */
    public final void mo9928(TextView textView, int i, boolean z) {
        if (z) {
            textView.setAlpha(isEnabled(i) ? 1.0f : 0.3f);
        }
    }
}
