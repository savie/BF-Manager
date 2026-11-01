package l;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes4.dex */
public final class C15787 extends AbstractC11123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4184 f51130;

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final float mo28052() {
        return 0.35f;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        return false;
    }

    public C15787(C4184 c4184) {
        this.f51130 = c4184;
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ܰ */
    public final int mo8538(AbstractC12554 abstractC12554) {
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        C4184 c4184 = this.f51130;
        List list = c4184.f15235;
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= ((ArrayList) list).size() || !((AbstractC17902) ((ArrayList) c4184.f15235).get(bindingAdapterPosition)).m41588()) {
            return 0;
        }
        return AbstractC11123.m28050(0, 4);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۨ */
    public final void mo8536(AbstractC12554 abstractC12554) {
        int bindingAdapterPosition = abstractC12554.getBindingAdapterPosition();
        C4184 c4184 = this.f51130;
        List list = c4184.f15235;
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= ((ArrayList) list).size()) {
            c4184.f15238.notifyDataSetChanged();
            return;
        }
        if (C20725.m46656((AbstractC17902) ((ArrayList) c4184.f15235).get(bindingAdapterPosition))) {
            ((ArrayList) c4184.f15235).remove(bindingAdapterPosition);
            c4184.f15238.notifyItemRemoved(bindingAdapterPosition);
            if (c4184.f15238.getItemCount() == 0) {
                c4184.f15237.setVisibility(0);
                return;
            }
            return;
        }
        c4184.f15238.notifyItemChanged(bindingAdapterPosition);
    }

    @Override // l.AbstractC11123
    /* JADX INFO: renamed from: ۙ */
    public final void mo28054(Canvas canvas, C17492 c17492, AbstractC12554 abstractC12554, float f, float f2, int i, boolean z) {
        if (i == 1) {
            View view = abstractC12554.itemView;
            float fAbs = 1.0f - (Math.abs(f) / (view.getWidth() / 3.0f));
            if (fAbs < 0.0f) {
                fAbs = 0.0f;
            }
            view.setAlpha(fAbs);
        }
        super.mo28054(canvas, c17492, abstractC12554, f, f2, i, z);
    }
}
