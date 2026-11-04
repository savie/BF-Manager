package l;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes4.dex */
public final class C10891 extends AbstractC16474 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18350 f34473;

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo27641() {
        return 0.35f;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        return false;
    }

    public C10891(C18350 c18350) {
        this.f34473 = c18350;
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9678(AbstractC11800 abstractC11800) {
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        C18350 c18350 = this.f34473;
        List list = c18350.f59825;
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= ((ArrayList) list).size() || !((AbstractC18900) ((ArrayList) c18350.f59825).get(bindingAdapterPosition)).m43861()) {
            return 0;
        }
        return AbstractC16474.m39083(0, 4);
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۤ */
    public final void mo9677(AbstractC11800 abstractC11800) {
        int bindingAdapterPosition = abstractC11800.getBindingAdapterPosition();
        C18350 c18350 = this.f34473;
        List list = c18350.f59825;
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= ((ArrayList) list).size()) {
            c18350.f59824.notifyDataSetChanged();
            return;
        }
        if (C13678.m33461((AbstractC18900) ((ArrayList) c18350.f59825).get(bindingAdapterPosition))) {
            ((ArrayList) c18350.f59825).remove(bindingAdapterPosition);
            c18350.f59824.notifyItemRemoved(bindingAdapterPosition);
            if (c18350.f59824.getItemCount() == 0) {
                c18350.f59823.setVisibility(0);
                return;
            }
            return;
        }
        c18350.f59824.notifyItemChanged(bindingAdapterPosition);
    }

    @Override // l.AbstractC16474
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27642(Canvas canvas, C25227 c25227, AbstractC11800 abstractC11800, float f, float f2, int i, boolean z) {
        if (i == 1) {
            View view = abstractC11800.itemView;
            float fAbs = 1.0f - (Math.abs(f) / (view.getWidth() / 3.0f));
            if (fAbs < 0.0f) {
                fAbs = 0.0f;
            }
            view.setAlpha(fAbs);
        }
        super.mo27642(canvas, c25227, abstractC11800, f, f2, i, z);
    }
}
