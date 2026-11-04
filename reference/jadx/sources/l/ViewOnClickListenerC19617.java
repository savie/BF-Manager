package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.View;

/* JADX INFO: renamed from: l.ᩴۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC19617 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f63229;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15141 f63230;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63231;

    public ViewOnClickListenerC19617(Context context, C15141 c15141, XmlResourceParser xmlResourceParser) {
        this.f63231 = -1;
        this.f63229 = 17;
        this.f63230 = c15141;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1211.f4424);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f63231 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63231);
            } else if (index == 0) {
                this.f63229 = typedArrayObtainStyledAttributes.getInt(index, this.f63229);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45268(C21855 c21855, int i, C15141 c15141) {
        boolean z;
        View viewFindViewById;
        int i2 = this.f63231;
        View view = c21855;
        if (i2 != -1) {
            viewFindViewById = c21855.findViewById(i2);
        }
        if (view == null) {
            view = viewFindViewById;
            return;
        }
        int i3 = c15141.f49397;
        int i4 = c15141.f49407;
        if (i3 == -1) {
            view = viewFindViewById;
            view.setOnClickListener(this);
            return;
        }
        int i5 = this.f63229;
        int i6 = i5 & 1;
        boolean z2 = false;
        if (i6 == 0 || i != i3) {
            view = viewFindViewById;
            z = false;
        } else {
            z = true;
        }
        boolean z3 = (i6 != 0 && i == i3) | z | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
        if ((i5 & 4096) != 0 && i == i4) {
            z2 = true;
        }
        if (z3 || z2) {
            view.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C15141 c15141 = this.f63230;
        C21855 c21855 = c15141.f49404.f41272;
        if (c21855.m49555()) {
            if (c15141.f49397 != -1) {
                C15141 c15142 = c15141.f49404.f41276;
                int i = this.f63229;
                int i2 = i & 1;
                boolean z = false;
                boolean z2 = true;
                boolean z3 = (i2 == 0 && (i & 256) == 0) ? false : true;
                int i3 = i & 16;
                if (i3 == 0 && (i & 4096) == 0) {
                    z2 = false;
                }
                if (z3 && z2) {
                    if (c15141.f49404.f41276 != c15141) {
                        c21855.m49548(c15141);
                    }
                    if (c21855.f69627 != c21855.m49553() && c21855.f69653 <= 0.5f) {
                        z2 = false;
                        z = z3;
                    }
                } else {
                    z = z3;
                }
                if (c15141 != c15142) {
                    int i4 = c15141.f49407;
                    int i5 = c15141.f49397;
                    if (i5 == -1) {
                        if (c21855.f69627 == i4) {
                            return;
                        }
                    } else {
                        int i6 = c21855.f69627;
                        if (i6 != i5 && i6 != i4) {
                            return;
                        }
                    }
                }
                if (z && i2 != 0) {
                    c21855.m49548(c15141);
                    c21855.m49541(1.0f);
                    return;
                }
                if (z2 && i3 != 0) {
                    c21855.m49548(c15141);
                    c21855.m49541(0.0f);
                    return;
                } else if (z && (i & 256) != 0) {
                    c21855.m49548(c15141);
                    c21855.m49554(1.0f);
                    return;
                } else {
                    if (!z2 || (i & 4096) == 0) {
                        return;
                    }
                    c21855.m49548(c15141);
                    c21855.m49554(0.0f);
                    return;
                }
            }
            int i7 = c21855.f69627;
            if (i7 == -1) {
                c21855.m49544(c15141.f49407);
                return;
            }
            C15141 c15143 = new C15141(c15141.f49404, c15141);
            c15143.f49397 = i7;
            c15143.f49407 = c15141.f49407;
            c21855.m49548(c15143);
            c21855.m49541(1.0f);
        }
    }
}
