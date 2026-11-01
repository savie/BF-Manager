package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JO */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3472 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int[] f12747;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View[] f12748;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Context f12749;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f12750;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f12751;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f12752;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f12753;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17191 f12754;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo8331(C20719 c20719, boolean z) {
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo10203(C5444 c5444) {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo10204() {
    }

    public AbstractC3472(Context context) {
        super(context);
        this.f12747 = new int[32];
        this.f12748 = null;
        this.f12752 = new HashMap();
        this.f12749 = context;
        mo8328((AttributeSet) null);
    }

    public AbstractC3472(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12747 = new int[32];
        this.f12748 = null;
        this.f12752 = new HashMap();
        this.f12749 = context;
        mo8328(attributeSet);
    }

    public AbstractC3472(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12747 = new int[32];
        this.f12748 = null;
        this.f12752 = new HashMap();
        this.f12749 = context;
        mo8328(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo8328(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16029.f51890);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f12750 = string;
                    m10198(string);
                } else if (index == 20) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f12753 = string2;
                    m10205(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f12750;
        if (str != null) {
            m10198(str);
        }
        String str2 = this.f12753;
        if (str2 != null) {
            m10205(str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10197(TextView textView) {
        if (textView == this || textView.getId() == -1 || textView.getParent() == null) {
            return;
        }
        this.f12750 = null;
        m10192(textView.getId());
        requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10201(int[] iArr) {
        this.f12750 = null;
        this.f12751 = 0;
        for (int i : iArr) {
            m10192(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10192(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f12751 + 1;
        int[] iArr = this.f12747;
        if (i2 > iArr.length) {
            this.f12747 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f12747;
        int i3 = this.f12751;
        iArr2[i3] = i;
        this.f12751 = i3 + 1;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m10202() {
        if (this.f12754 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C11795) {
            ((C11795) layoutParams).f39661 = this.f12754;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m10194(String str) {
        if (str == null || str.length() == 0 || this.f12749 == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof C5444) {
        }
        int iM10193 = m10193(strTrim);
        if (iM10193 != 0) {
            this.f12752.put(Integer.valueOf(iM10193), strTrim);
            m10192(iM10193);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m10190(String str) {
        if (str == null || str.length() == 0 || this.f12749 == null) {
            return;
        }
        String strTrim = str.trim();
        C5444 c5444 = getParent() instanceof C5444 ? (C5444) getParent() : null;
        if (c5444 == null) {
            return;
        }
        int childCount = c5444.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c5444.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C11795) && strTrim.equals(((C11795) layoutParams).f39606) && childAt.getId() != -1) {
                m10192(childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m10193(String str) {
        C5444 c5444 = getParent() instanceof C5444 ? (C5444) getParent() : null;
        int iM10191 = 0;
        if (isInEditMode() && c5444 != null) {
            Object designInformation = c5444.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iM10191 = ((Integer) designInformation).intValue();
            }
        }
        if (iM10191 == 0 && c5444 != null) {
            iM10191 = m10191(c5444, str);
        }
        if (iM10191 == 0) {
            try {
                iM10191 = C20967.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iM10191 != 0) {
            return iM10191;
        }
        Context context = this.f12749;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m10191(C5444 c5444, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f12749.getResources()) != null) {
            int childCount = c5444.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c5444.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10198(String str) {
        this.f12750 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f12751 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m10194(str.substring(i));
                return;
            } else {
                m10194(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10205(String str) {
        this.f12753 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f12751 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m10190(str.substring(i));
                return;
            } else {
                m10190(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo10199(C5444 c5444) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f12751; i++) {
            View viewById = c5444.getViewById(this.f12747[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10196() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof C5444)) {
            return;
        }
        mo10199((C5444) parent);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m10195(C5444 c5444) {
        if (isInEditMode()) {
            m10198(this.f12750);
        }
        C17191 c17191 = this.f12754;
        if (c17191 == null) {
            return;
        }
        c17191.m40114();
        for (int i = 0; i < this.f12751; i++) {
            int i2 = this.f12747[i];
            View viewById = c5444.getViewById(i2);
            if (viewById == null) {
                Integer numValueOf = Integer.valueOf(i2);
                HashMap map = this.f12752;
                String str = (String) map.get(numValueOf);
                int iM10191 = m10191(c5444, str);
                if (iM10191 != 0) {
                    this.f12747[i] = iM10191;
                    map.put(Integer.valueOf(iM10191), str);
                    viewById = c5444.getViewById(iM10191);
                }
            }
            if (viewById != null) {
                this.f12754.m40113(c5444.getViewWidget(viewById));
            }
        }
        this.f12754.mo27180();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10200(C17191 c17191, SparseArray sparseArray) {
        c17191.m40114();
        for (int i = 0; i < this.f12751; i++) {
            c17191.m40113((C20719) sparseArray.get(this.f12747[i]));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View[] m10206(C5444 c5444) {
        View[] viewArr = this.f12748;
        if (viewArr == null || viewArr.length != this.f12751) {
            this.f12748 = new View[this.f12751];
        }
        for (int i = 0; i < this.f12751; i++) {
            this.f12748[i] = c5444.getViewById(this.f12747[i]);
        }
        return this.f12748;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo8329(C4032 c4032, C17191 c17191, C18850 c18850, SparseArray sparseArray) {
        C6855 c6855 = c4032.f14903;
        int[] iArr = c6855.f23085;
        int i = 0;
        if (iArr != null) {
            m10201(iArr);
        } else {
            String str = c6855.f23077;
            if (str != null && str.length() > 0) {
                String[] strArrSplit = c6855.f23077.split(",");
                getContext();
                int[] iArrCopyOf = new int[strArrSplit.length];
                int i2 = 0;
                for (String str2 : strArrSplit) {
                    int iM10193 = m10193(str2.trim());
                    if (iM10193 != 0) {
                        iArrCopyOf[i2] = iM10193;
                        i2++;
                    }
                }
                if (i2 != strArrSplit.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                }
                c6855.f23085 = iArrCopyOf;
            }
        }
        c17191.m40114();
        if (c6855.f23085 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = c6855.f23085;
            if (i >= iArr2.length) {
                return;
            }
            C20719 c20719 = (C20719) sparseArray.get(iArr2[i]);
            if (c20719 != null) {
                c17191.m40113(c20719);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f12750 == null) {
            m10192(i);
        }
    }
}
