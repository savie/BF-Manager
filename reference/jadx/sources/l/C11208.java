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

/* JADX INFO: renamed from: l.ۤ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8GO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11208 extends FrameLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f35361;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C6384 f35362;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f35363;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C12349 f35364;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f35365;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f35366;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public View f35367;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f35368;

    public C11208(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35361 = Collections.EMPTY_LIST;
        this.f35362 = C6384.f21572;
        this.f35363 = 0.0533f;
        this.f35366 = 0.08f;
        this.f35368 = true;
        this.f35365 = true;
        C12349 c12349 = new C12349(context, null);
        this.f35364 = c12349;
        this.f35367 = c12349;
        addView(c12349);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28244(List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f35361 = list;
        m28241();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28243(float f) {
        this.f35363 = f;
        m28241();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28242() {
        this.f35365 = false;
        m28241();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28245(C6384 c6384) {
        this.f35362 = c6384;
        m28241();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28246() {
        this.f35366 = 0.045f;
        m28241();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m28241() {
        List list;
        boolean z = this.f35368;
        if (z && this.f35365) {
            list = this.f35361;
        } else {
            ArrayList arrayList = new ArrayList(this.f35361.size());
            for (int i = 0; i < this.f35361.size(); i++) {
                C5866 c5866M7381 = ((C2137) this.f35361.get(i)).m7381();
                if (!z) {
                    c5866M7381.m17085();
                    if (c5866M7381.m17083() instanceof Spanned) {
                        if (!(c5866M7381.m17083() instanceof Spannable)) {
                            c5866M7381.m17079(SpannableString.valueOf(c5866M7381.m17083()));
                        }
                        CharSequence charSequenceM17083 = c5866M7381.m17083();
                        charSequenceM17083.getClass();
                        Spannable spannable = (Spannable) charSequenceM17083;
                        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                            if (!(obj instanceof InterfaceC17798)) {
                                spannable.removeSpan(obj);
                            }
                        }
                    }
                    C23143.m52063(c5866M7381);
                } else if (!this.f35365) {
                    C23143.m52063(c5866M7381);
                }
                arrayList.add(c5866M7381.m17073());
            }
            list = arrayList;
        }
        this.f35364.m30816(list, this.f35362, this.f35363, this.f35366);
    }
}
