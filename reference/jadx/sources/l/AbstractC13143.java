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

/* JADX INFO: renamed from: l.۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13143 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public HashMap f42031;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Context f42032;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f42033;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public View[] f42034;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42035;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f42036;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f42037;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14174 f42038;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo27673(C10445 c10445, boolean z) {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo32675(C16872 c16872) {
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo2278() {
    }

    public AbstractC13143(Context context) {
        super(context);
        this.f42036 = new int[32];
        this.f42034 = null;
        this.f42031 = new HashMap();
        this.f42032 = context;
        mo19751((AttributeSet) null);
    }

    public AbstractC13143(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42036 = new int[32];
        this.f42034 = null;
        this.f42031 = new HashMap();
        this.f42032 = context;
        mo19751(attributeSet);
    }

    public AbstractC13143(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42036 = new int[32];
        this.f42034 = null;
        this.f42031 = new HashMap();
        this.f42032 = context;
        mo19751(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo19751(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1211.f4439);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f42033 = string;
                    m32670(string);
                } else if (index == 20) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f42037 = string2;
                    m32676(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f42033;
        if (str != null) {
            m32670(str);
        }
        String str2 = this.f42037;
        if (str2 != null) {
            m32676(str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32669(TextView textView) {
        if (textView == this || textView.getId() == -1 || textView.getParent() == null) {
            return;
        }
        this.f42033 = null;
        m32664(textView.getId());
        requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32673(int[] iArr) {
        this.f42033 = null;
        this.f42035 = 0;
        for (int i : iArr) {
            m32664(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32664(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f42035 + 1;
        int[] iArr = this.f42036;
        if (i2 > iArr.length) {
            this.f42036 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f42036;
        int i3 = this.f42035;
        iArr2[i3] = i;
        this.f42035 = i3 + 1;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m32674() {
        if (this.f42038 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C11651) {
            ((C11651) layoutParams).f37714 = this.f42038;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m32665(String str) {
        if (str == null || str.length() == 0 || this.f42032 == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof C16872) {
        }
        int iM32666 = m32666(strTrim);
        if (iM32666 != 0) {
            this.f42031.put(Integer.valueOf(iM32666), strTrim);
            m32664(iM32666);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m32667(String str) {
        if (str == null || str.length() == 0 || this.f42032 == null) {
            return;
        }
        String strTrim = str.trim();
        C16872 c16872 = getParent() instanceof C16872 ? (C16872) getParent() : null;
        if (c16872 == null) {
            return;
        }
        int childCount = c16872.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c16872.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C11651) && strTrim.equals(((C11651) layoutParams).f37696) && childAt.getId() != -1) {
                m32664(childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m32666(String str) {
        C16872 c16872 = getParent() instanceof C16872 ? (C16872) getParent() : null;
        int iM32663 = 0;
        if (isInEditMode() && c16872 != null) {
            Object designInformation = c16872.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iM32663 = ((Integer) designInformation).intValue();
            }
        }
        if (iM32663 == 0 && c16872 != null) {
            iM32663 = m32663(c16872, str);
        }
        if (iM32663 == 0) {
            try {
                iM32663 = C10159.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iM32663 != 0) {
            return iM32663;
        }
        Context context = this.f42032;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m32663(C16872 c16872, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f42032.getResources()) != null) {
            int childCount = c16872.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c16872.getChildAt(i);
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
    public final void m32670(String str) {
        this.f42033 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f42035 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m32665(str.substring(i));
                return;
            } else {
                m32665(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32676(String str) {
        this.f42037 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f42035 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m32667(str.substring(i));
                return;
            } else {
                m32667(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo32672(C16872 c16872) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f42035; i++) {
            View viewById = c16872.getViewById(this.f42036[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32668() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof C16872)) {
            return;
        }
        mo32672((C16872) parent);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m32678(C16872 c16872) {
        if (isInEditMode()) {
            m32670(this.f42033);
        }
        C14174 c14174 = this.f42038;
        if (c14174 == null) {
            return;
        }
        c14174.m34464();
        for (int i = 0; i < this.f42035; i++) {
            int i2 = this.f42036[i];
            View viewById = c16872.getViewById(i2);
            if (viewById == null) {
                Integer numValueOf = Integer.valueOf(i2);
                HashMap map = this.f42031;
                String str = (String) map.get(numValueOf);
                int iM32663 = m32663(c16872, str);
                if (iM32663 != 0) {
                    this.f42036[i] = iM32663;
                    map.put(Integer.valueOf(iM32663), str);
                    viewById = c16872.getViewById(iM32663);
                }
            }
            if (viewById != null) {
                this.f42038.m34462(c16872.getViewWidget(viewById));
            }
        }
        this.f42038.mo34463();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32671(C14174 c14174, SparseArray sparseArray) {
        c14174.m34464();
        for (int i = 0; i < this.f42035; i++) {
            c14174.m34462((C10445) sparseArray.get(this.f42036[i]));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View[] m32677(C16872 c16872) {
        View[] viewArr = this.f42034;
        if (viewArr == null || viewArr.length != this.f42035) {
            this.f42034 = new View[this.f42035];
        }
        for (int i = 0; i < this.f42035; i++) {
            this.f42034[i] = c16872.getViewById(this.f42036[i]);
        }
        return this.f42034;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo27672(C3448 c3448, C14174 c14174, C14634 c14634, SparseArray sparseArray) {
        C20602 c20602 = c3448.f11241;
        int[] iArr = c20602.f65988;
        int i = 0;
        if (iArr != null) {
            m32673(iArr);
        } else {
            String str = c20602.f65966;
            if (str != null && str.length() > 0) {
                String[] strArrSplit = c20602.f65966.split(",");
                getContext();
                int[] iArrCopyOf = new int[strArrSplit.length];
                int i2 = 0;
                for (String str2 : strArrSplit) {
                    int iM32666 = m32666(str2.trim());
                    if (iM32666 != 0) {
                        iArrCopyOf[i2] = iM32666;
                        i2++;
                    }
                }
                if (i2 != strArrSplit.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                }
                c20602.f65988 = iArrCopyOf;
            }
        }
        c14174.m34464();
        if (c20602.f65988 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = c20602.f65988;
            if (i >= iArr2.length) {
                return;
            }
            C10445 c10445 = (C10445) sparseArray.get(iArr2[i]);
            if (c10445 != null) {
                c14174.m34462(c10445);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f42033 == null) {
            m32664(i);
        }
    }
}
