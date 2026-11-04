package l;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۨ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S5XV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12393 implements Editable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f39872;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f39873;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final WeakReference f39874;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f39875;

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        append(c);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    public C12393(C24132 c24132, int i) {
        this.f39874 = new WeakReference(c24132);
        this.f39873 = c24132.m54021();
        this.f39872 = c24132.m54028();
        this.f39875 = i;
    }

    @Override // android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (!m30865()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f39872;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i3);
            boolean z = iIndexOf != -1 && iIndexOf < i4;
            InterfaceC19106 interfaceC19106 = this.f39873;
            if (z) {
                interfaceC19106.replace(i, i2, C14540.m35080(charSequence.subSequence(i3, i4)));
                return this;
            }
            interfaceC19106.replace(i, i2, charSequence, i3, i4);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence) {
        C24132 c24132;
        if (!m30865()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f39872;
        atomicInteger.incrementAndGet();
        if (charSequence == null) {
            charSequence = "";
        }
        try {
            if (charSequence.length() == 1 && charSequence.charAt(0) == '\n' && (c24132 = (C24132) this.f39874.get()) != null) {
                c24132.m54088(i, i2);
                return this;
            }
            this.f39873.replace(i, i2, C14540.m35080(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        if (!m30865()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f39872;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i2);
            boolean z = iIndexOf != -1 && iIndexOf < i3;
            InterfaceC19106 interfaceC19106 = this.f39873;
            if (z) {
                interfaceC19106.insert(i, C14540.m35080(charSequence.subSequence(i2, i3)));
                return this;
            }
            interfaceC19106.insert(i, charSequence, i2, i3);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        if (!m30865()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f39872;
        atomicInteger.incrementAndGet();
        try {
            this.f39873.insert(i, C14540.m35080(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable delete(int i, int i2) {
        if (!m30865()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f39872;
        atomicInteger.incrementAndGet();
        try {
            this.f39873.delete(i, i2);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        if (!m30865()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f39872;
        atomicInteger.incrementAndGet();
        try {
            this.f39873.append(C14540.m35080(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        if (!m30865()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f39872;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i);
            boolean z = iIndexOf != -1 && iIndexOf < i2;
            InterfaceC19106 interfaceC19106 = this.f39873;
            if (z) {
                interfaceC19106.append(C14540.m35080(charSequence.subSequence(i, i2)));
                return this;
            }
            interfaceC19106.append(charSequence, i, i2);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        if (!m30865()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f39872;
        atomicInteger.incrementAndGet();
        try {
            this.f39873.append(c);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final void clear() {
        if (m30865()) {
            AtomicInteger atomicInteger = this.f39872;
            atomicInteger.incrementAndGet();
            try {
                this.f39873.clear();
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
    }

    @Override // android.text.Editable
    public final void clearSpans() {
        if (m30865()) {
            this.f39873.clearSpans();
        }
    }

    @Override // android.text.Editable
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (m30865()) {
            this.f39873.setFilters(inputFilterArr);
        }
    }

    @Override // android.text.Editable
    public final InputFilter[] getFilters() {
        return this.f39873.getFilters();
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f39873.getChars(i, i2, cArr, i3);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m30865()) {
            this.f39873.setSpan(obj, i, i2, i3);
        }
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f39873.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f39873.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f39873.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f39873.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f39873.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f39873.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f39873.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f39873.subSequence(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m30865() {
        C24132 c24132 = (C24132) this.f39874.get();
        return c24132 != null && c24132.m54053(this.f39875);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        C24132 c24132 = (C24132) this.f39874.get();
        if (c24132 == null || !c24132.m54092(this.f39875)) {
            return;
        }
        this.f39873.removeSpan(obj);
    }
}
