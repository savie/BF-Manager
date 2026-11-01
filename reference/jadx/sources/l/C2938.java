package l;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB2A */
/* JADX INFO: loaded from: classes2.dex */
public final class C2938 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Class f11039;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f11040;

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    public C2938(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f11040 = new ArrayList();
        C9535.m24383(cls, "watcherClass cannot be null");
        this.f11039 = cls;
    }

    public C2938(Class cls, C2938 c2938, int i, int i2) {
        super(c2938, i, i2);
        this.f11040 = new ArrayList();
        C9535.m24383(cls, "watcherClass cannot be null");
        this.f11039 = cls;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2938 m8767(Class cls, CharSequence charSequence) {
        return new C2938(cls, charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m8770(Object obj) {
        if (obj != null) {
            return this.f11039 == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f11039 == cls) {
            C9290[] c9290Arr = (C9290[]) super.getSpans(i, i2, C9290.class);
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c9290Arr.length);
            for (int i3 = 0; i3 < c9290Arr.length; i3++) {
                objArr[i3] = c9290Arr[i3].f31560;
            }
            return objArr;
        }
        return super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f11039 == cls) {
            cls = C9290.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C2938(this.f11039, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m8770(obj)) {
            C9290 c9290 = new C9290(obj);
            this.f11040.add(c9290);
            obj = c9290;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C9290 c9290M8768;
        if (m8770(obj)) {
            c9290M8768 = m8768(obj);
            if (c9290M8768 != null) {
                obj = c9290M8768;
            }
        } else {
            c9290M8768 = null;
        }
        super.removeSpan(obj);
        if (c9290M8768 != null) {
            this.f11040.remove(c9290M8768);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C9290 c9290M8768;
        if (m8770(obj) && (c9290M8768 = m8768(obj)) != null) {
            obj = c9290M8768;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C9290 c9290M8768;
        if (m8770(obj) && (c9290M8768 = m8768(obj)) != null) {
            obj = c9290M8768;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C9290 c9290M8768;
        if (m8770(obj) && (c9290M8768 = m8768(obj)) != null) {
            obj = c9290M8768;
        }
        return super.getSpanFlags(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9290 m8768(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11040;
            if (i >= arrayList.size()) {
                return null;
            }
            C9290 c9290 = (C9290) arrayList.get(i);
            if (c9290.f31560 == obj) {
                return c9290;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8771() {
        m8766();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8772() {
        m8769();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11040;
            if (i >= arrayList.size()) {
                return;
            }
            ((C9290) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m8766() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11040;
            if (i >= arrayList.size()) {
                return;
            }
            ((C9290) arrayList.get(i)).m23838();
            i++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m8769() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11040;
            if (i >= arrayList.size()) {
                return;
            }
            ((C9290) arrayList.get(i)).m23839();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m8766();
        super.replace(i, i2, charSequence);
        m8769();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m8766();
        super.replace(i, i2, charSequence, i3, i4);
        m8769();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
