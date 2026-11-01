package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.View;

/* JADX INFO: renamed from: l.֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC1710 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9473 f6758;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f6759;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6760;

    public ViewOnClickListenerC1710(Context context, C9473 c9473, XmlResourceParser xmlResourceParser) {
        this.f6760 = -1;
        this.f6759 = 17;
        this.f6758 = c9473;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C16029.f51886);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f6760 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6760);
            } else if (index == 0) {
                this.f6759 = typedArrayObtainStyledAttributes.getInt(index, this.f6759);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5698(C10884 c10884, int i, C9473 c9473) {
        boolean z;
        View viewFindViewById;
        int i2 = this.f6760;
        View view = c10884;
        if (i2 != -1) {
            viewFindViewById = c10884.findViewById(i2);
        }
        if (view == null) {
            view = viewFindViewById;
            return;
        }
        int i3 = c9473.f32051;
        int i4 = c9473.f32053;
        if (i3 == -1) {
            view = viewFindViewById;
            view.setOnClickListener(this);
            return;
        }
        int i5 = this.f6759;
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
        C9473 c9473 = this.f6758;
        C10884 c10884 = c9473.f32058.f11778;
        if (c10884.m27274()) {
            if (c9473.f32051 != -1) {
                C9473 c9474 = c9473.f32058.f11764;
                int i = this.f6759;
                int i2 = i & 1;
                boolean z = false;
                boolean z2 = true;
                boolean z3 = (i2 == 0 && (i & 256) == 0) ? false : true;
                int i3 = i & 16;
                if (i3 == 0 && (i & 4096) == 0) {
                    z2 = false;
                }
                if (z3 && z2) {
                    if (c9473.f32058.f11764 != c9473) {
                        c10884.m27283(c9473);
                    }
                    if (c10884.f37040 != c10884.m27288() && c10884.f37028 <= 0.5f) {
                        z2 = false;
                        z = z3;
                    }
                } else {
                    z = z3;
                }
                if (c9473 != c9474) {
                    int i4 = c9473.f32053;
                    int i5 = c9473.f32051;
                    if (i5 == -1) {
                        if (c10884.f37040 == i4) {
                            return;
                        }
                    } else {
                        int i6 = c10884.f37040;
                        if (i6 != i5 && i6 != i4) {
                            return;
                        }
                    }
                }
                if (z && i2 != 0) {
                    c10884.m27283(c9473);
                    c10884.m27276(1.0f);
                    return;
                }
                if (z2 && i3 != 0) {
                    c10884.m27283(c9473);
                    c10884.m27276(0.0f);
                    return;
                } else if (z && (i & 256) != 0) {
                    c10884.m27283(c9473);
                    c10884.m27289(1.0f);
                    return;
                } else {
                    if (!z2 || (i & 4096) == 0) {
                        return;
                    }
                    c10884.m27283(c9473);
                    c10884.m27289(0.0f);
                    return;
                }
            }
            int i7 = c10884.f37040;
            if (i7 == -1) {
                c10884.m27279(c9473.f32053);
                return;
            }
            C9473 c9475 = new C9473(c9473.f32058, c9473);
            c9475.f32051 = i7;
            c9475.f32053 = c9473.f32053;
            c10884.m27283(c9475);
            c10884.m27276(1.0f);
        }
    }
}
