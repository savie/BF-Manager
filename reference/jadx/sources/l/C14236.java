package l;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes4.dex */
public final class C14236 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f44976;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f44977;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f44978;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f44979;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f44980;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f44981;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f44982;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f44983;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f44984;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f44985;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f44986;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f44987;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m34557(C2523 c2523) {
        List list = this.f44987;
        if (list == null) {
            View viewM8425 = c2523.m8425(this.f44985);
            this.f44985 += this.f44984;
            return viewM8425;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((AbstractC11800) this.f44987.get(i)).itemView;
            C18185 c18185 = (C18185) view.getLayoutParams();
            if (!c18185.f59428.isRemoved() && this.f44985 == c18185.f59428.getLayoutPosition()) {
                m34558(view);
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34558(View view) {
        int layoutPosition;
        int size = this.f44987.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC11800) this.f44987.get(i2)).itemView;
            C18185 c18185 = (C18185) view3.getLayoutParams();
            if (view3 != view && !c18185.f59428.isRemoved() && (layoutPosition = (c18185.f59428.getLayoutPosition() - this.f44985) * this.f44984) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f44985 = -1;
        } else {
            this.f44985 = ((C18185) view2.getLayoutParams()).f59428.getLayoutPosition();
        }
    }
}
