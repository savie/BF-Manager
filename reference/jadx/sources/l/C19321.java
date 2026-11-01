package l;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩵۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8GO */
/* JADX INFO: loaded from: classes4.dex */
public final class C19321 extends FrameLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f62320;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C14425 f62321;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1723 f62322;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f62323;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f62324;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f62325;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f62326;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f62327;

    public C19321(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62325 = Collections.EMPTY_LIST;
        this.f62322 = C1723.f6825;
        this.f62323 = 0.0533f;
        this.f62320 = 0.08f;
        this.f62327 = true;
        this.f62324 = true;
        C14425 c14425 = new C14425(context, null);
        this.f62321 = c14425;
        this.f62326 = c14425;
        addView(c14425);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44303(List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f62325 = list;
        m44300();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44302(float f) {
        this.f62323 = f;
        m44300();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44301() {
        this.f62324 = false;
        m44300();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44304(C1723 c1723) {
        this.f62322 = c1723;
        m44300();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44305() {
        this.f62320 = 0.045f;
        m44300();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m44300() {
        List list;
        boolean z = this.f62327;
        if (z && this.f62324) {
            list = this.f62325;
        } else {
            ArrayList arrayList = new ArrayList(this.f62325.size());
            for (int i = 0; i < this.f62325.size(); i++) {
                C20369 c20369M2814 = ((C0612) this.f62325.get(i)).m2814();
                if (!z) {
                    c20369M2814.m46008();
                    if (c20369M2814.m46003() instanceof Spanned) {
                        if (!(c20369M2814.m46003() instanceof Spannable)) {
                            c20369M2814.m46002(SpannableString.valueOf(c20369M2814.m46003()));
                        }
                        CharSequence charSequenceM46003 = c20369M2814.m46003();
                        charSequenceM46003.getClass();
                        Spannable spannable = (Spannable) charSequenceM46003;
                        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                            if (!(obj instanceof InterfaceC6257)) {
                                spannable.removeSpan(obj);
                            }
                        }
                    }
                    C8738.m22677(c20369M2814);
                } else if (!this.f62324) {
                    C8738.m22677(c20369M2814);
                }
                arrayList.add(c20369M2814.m45996());
            }
            list = arrayList;
        }
        this.f62321.m34695(list, this.f62322, this.f62323, this.f62320);
    }
}
