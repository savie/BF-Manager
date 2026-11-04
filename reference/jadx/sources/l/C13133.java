package l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13133 extends AbstractC11641 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5676 f42018;

    public C13133(C5676 c5676) {
        this.f42018 = c5676;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00d6  */
    @Override // l.AbstractC11641
    /* JADX INFO: renamed from: ۙ */
    public final void mo29250(int i, float f, int i2) {
        C5676 c5676 = this.f42018;
        ArrayList arrayList = c5676.f73998;
        Object obj = arrayList.get(i);
        C15243.m36591(obj, "get(...)");
        ImageView imageView = (ImageView) obj;
        float f2 = 1;
        C1947.m6728((int) C19967.m45884(f2, f, (c5676.f19584 - f2) * c5676.m51492(), c5676.m51492()), imageView);
        C15243.m36590(arrayList, "<this>");
        if (i2 >= 0 && i2 < arrayList.size()) {
            Object obj2 = arrayList.get(i2);
            C15243.m36591(obj2, "get(...)");
            ImageView imageView2 = (ImageView) obj2;
            C1947.m6728((int) (((c5676.f19584 - f2) * c5676.m51492() * f) + c5676.m51492()), imageView2);
            Drawable background = imageView.getBackground();
            C15243.m36587((Object) background, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            C19846 c19846 = (C19846) background;
            Drawable background2 = imageView2.getBackground();
            C15243.m36587((Object) background2, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            C19846 c19847 = (C19846) background2;
            if (c5676.m16694() != c5676.m51488()) {
                Object objEvaluate = c5676.f19585.evaluate(f, Integer.valueOf(c5676.m16694()), Integer.valueOf(c5676.m51488()));
                C15243.m36587(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                Object objEvaluate2 = c5676.f19585.evaluate(f, Integer.valueOf(c5676.m51488()), Integer.valueOf(c5676.m16694()));
                C15243.m36587(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                c19847.setColor(((Integer) objEvaluate2).intValue());
                if (c5676.f19586) {
                    InterfaceC22084 interfaceC22084M51490 = c5676.m51490();
                    C15243.m36586(interfaceC22084M51490);
                    if (i <= ((C4184) interfaceC22084M51490).m13367()) {
                        c19846.setColor(c5676.m16694());
                    } else {
                        c19846.setColor(iIntValue);
                    }
                } else {
                    c19846.setColor(iIntValue);
                }
            }
        }
        c5676.invalidate();
    }

    @Override // l.AbstractC11641
    /* JADX INFO: renamed from: ۙ */
    public final void mo29249(int i) {
        C5676 c5676 = this.f42018;
        if (i >= c5676.f73998.size()) {
            return;
        }
        Object obj = c5676.f73998.get(i);
        C15243.m36591(obj, "get(...)");
        C1947.m6728((int) c5676.m51492(), (View) obj);
        c5676.mo16695(i);
    }

    @Override // l.AbstractC11641
    /* JADX INFO: renamed from: ۙ */
    public final int mo29247() {
        return this.f42018.f73998.size();
    }
}
