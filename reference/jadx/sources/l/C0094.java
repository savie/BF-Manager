package l;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֡֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5XV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0094 implements Editable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final WeakReference f1018;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f1019;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f1020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f1021;

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

    public C0094(C6111 c6111, int i) {
        this.f1018 = new WeakReference(c6111);
        this.f1019 = c6111.m17000();
        this.f1020 = c6111.m16925();
        this.f1021 = i;
    }

    @Override // android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (!m1055()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f1020;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i3);
            boolean z = iIndexOf != -1 && iIndexOf < i4;
            InterfaceC2916 interfaceC2916 = this.f1019;
            if (z) {
                interfaceC2916.replace(i, i2, C1590.m5421(charSequence.subSequence(i3, i4)));
                return this;
            }
            interfaceC2916.replace(i, i2, charSequence, i3, i4);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence) {
        C6111 c6111;
        if (!m1055()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f1020;
        atomicInteger.incrementAndGet();
        if (charSequence == null) {
            charSequence = "";
        }
        try {
            if (charSequence.length() == 1 && charSequence.charAt(0) == '\n' && (c6111 = (C6111) this.f1018.get()) != null) {
                c6111.m16823(i, i2);
                return this;
            }
            this.f1019.replace(i, i2, C1590.m5421(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        if (!m1055()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f1020;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i2);
            boolean z = iIndexOf != -1 && iIndexOf < i3;
            InterfaceC2916 interfaceC2916 = this.f1019;
            if (z) {
                interfaceC2916.insert(i, C1590.m5421(charSequence.subSequence(i2, i3)));
                return this;
            }
            interfaceC2916.insert(i, charSequence, i2, i3);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        if (!m1055()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f1020;
        atomicInteger.incrementAndGet();
        try {
            this.f1019.insert(i, C1590.m5421(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final Editable delete(int i, int i2) {
        if (!m1055()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f1020;
        atomicInteger.incrementAndGet();
        try {
            this.f1019.delete(i, i2);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        if (!m1055()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f1020;
        atomicInteger.incrementAndGet();
        try {
            this.f1019.append(C1590.m5421(charSequence));
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        if (!m1055()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f1020;
        atomicInteger.incrementAndGet();
        try {
            int iIndexOf = TextUtils.indexOf(charSequence, '\r', i);
            boolean z = iIndexOf != -1 && iIndexOf < i2;
            InterfaceC2916 interfaceC2916 = this.f1019;
            if (z) {
                interfaceC2916.append(C1590.m5421(charSequence.subSequence(i, i2)));
                return this;
            }
            interfaceC2916.append(charSequence, i, i2);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        if (!m1055()) {
            return this;
        }
        AtomicInteger atomicInteger = this.f1020;
        atomicInteger.incrementAndGet();
        try {
            this.f1019.append(c);
            return this;
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    @Override // android.text.Editable
    public final void clear() {
        if (m1055()) {
            AtomicInteger atomicInteger = this.f1020;
            atomicInteger.incrementAndGet();
            try {
                this.f1019.clear();
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
    }

    @Override // android.text.Editable
    public final void clearSpans() {
        if (m1055()) {
            this.f1019.clearSpans();
        }
    }

    @Override // android.text.Editable
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (m1055()) {
            this.f1019.setFilters(inputFilterArr);
        }
    }

    @Override // android.text.Editable
    public final InputFilter[] getFilters() {
        return this.f1019.getFilters();
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f1019.getChars(i, i2, cArr, i3);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m1055()) {
            this.f1019.setSpan(obj, i, i2, i3);
        }
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f1019.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1019.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1019.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1019.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f1019.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1019.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1019.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f1019.subSequence(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m1055() {
        C6111 c6111 = (C6111) this.f1018.get();
        return c6111 != null && c6111.m16908(this.f1021);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        C6111 c6111 = (C6111) this.f1018.get();
        if (c6111 == null || !c6111.m16828(this.f1021)) {
            return;
        }
        this.f1019.removeSpan(obj);
    }
}
