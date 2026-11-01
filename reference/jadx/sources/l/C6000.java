package l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6000 extends AbstractC14468 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10940 f20399;

    public C6000(C10940 c10940) {
        this.f20399 = c10940;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00d6  */
    @Override // l.AbstractC14468
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16285(int i, float f, int i2) {
        C10940 c10940 = this.f20399;
        ArrayList arrayList = c10940.f53230;
        Object obj = arrayList.get(i);
        C13465.m32967(obj, "get(...)");
        ImageView imageView = (ImageView) obj;
        float f2 = 1;
        C23640.m52103((int) C0280.m1792(f2, f, (c10940.f37202 - f2) * c10940.m39018(), c10940.m39018()), imageView);
        C13465.m32966(arrayList, "<this>");
        if (i2 >= 0 && i2 < arrayList.size()) {
            Object obj2 = arrayList.get(i2);
            C13465.m32967(obj2, "get(...)");
            ImageView imageView2 = (ImageView) obj2;
            C23640.m52103((int) (((c10940.f37202 - f2) * c10940.m39018() * f) + c10940.m39018()), imageView2);
            Drawable background = imageView.getBackground();
            C13465.m32963((Object) background, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            C12351 c12351 = (C12351) background;
            Drawable background2 = imageView2.getBackground();
            C13465.m32963((Object) background2, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            C12351 c12352 = (C12351) background2;
            if (c10940.m27459() != c10940.m39020()) {
                Object objEvaluate = c10940.f37207.evaluate(f, Integer.valueOf(c10940.m27459()), Integer.valueOf(c10940.m39020()));
                C13465.m32963(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                Object objEvaluate2 = c10940.f37207.evaluate(f, Integer.valueOf(c10940.m39020()), Integer.valueOf(c10940.m27459()));
                C13465.m32963(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                c12352.setColor(((Integer) objEvaluate2).intValue());
                if (c10940.f37203) {
                    InterfaceC20112 interfaceC20112M39012 = c10940.m39012();
                    C13465.m32962(interfaceC20112M39012);
                    if (i <= ((C3799) interfaceC20112M39012).m11089()) {
                        c12351.setColor(c10940.m27459());
                    } else {
                        c12351.setColor(iIntValue);
                    }
                } else {
                    c12351.setColor(iIntValue);
                }
            }
        }
        c10940.invalidate();
    }

    @Override // l.AbstractC14468
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16284(int i) {
        C10940 c10940 = this.f20399;
        if (i >= c10940.f53230.size()) {
            return;
        }
        Object obj = c10940.f53230.get(i);
        C13465.m32967(obj, "get(...)");
        C23640.m52103((int) c10940.m39018(), (View) obj);
        c10940.mo7259(i);
    }

    @Override // l.AbstractC14468
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo16283() {
        return this.f20399.f53230.size();
    }
}
