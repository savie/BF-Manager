package l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB2A */
/* JADX INFO: loaded from: classes2.dex */
public final class C2657 implements Appendable, CharSequence {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f10325 = new ArrayDeque(8);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f10324 = new StringBuilder((CharSequence) "");

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    public C2657() {
        m8179(0, "");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8186(String str) {
        this.f10324.append(str);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f10324.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final void append(char c) {
        this.f10324.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.f10324;
        m8179(sb.length(), charSequenceSubSequence);
        sb.append(charSequenceSubSequence);
        return this;
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        this.f10325.push(new C13948(obj, i, i2, i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8180(C2657 c2657, Object obj, int i, int i2) {
        if (obj != null) {
            int length = c2657.f10324.length();
            if (i2 <= i || i < 0 || i2 > length) {
                return;
            }
            m8181(c2657, obj, i, i2);
        }
    }

    @Override // java.lang.Appendable
    public final void append(CharSequence charSequence) {
        StringBuilder sb = this.f10324;
        m8179(sb.length(), charSequence);
        sb.append(charSequence);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f10324.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m8182() {
        StringBuilder sb = this.f10324;
        return sb.charAt(sb.length() - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m8183(int i, int i2) {
        int i3;
        int length = this.f10324.length();
        if (i2 <= i || i < 0 || i2 > length) {
            return Collections.EMPTY_LIST;
        }
        ArrayDeque arrayDeque = this.f10325;
        if (i == 0 && length == i2) {
            ArrayList arrayList = new ArrayList(arrayDeque);
            Collections.reverse(arrayList);
            return C0561.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            C13948 c13948 = (C13948) itDescendingIterator.next();
            int i4 = c13948.f45900;
            if ((i4 >= i && i4 < i2) || (((i3 = c13948.f45899) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                arrayList2.add(c13948);
            }
        }
        return C0561.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence m8185(int i) {
        C13948 c13948;
        int i2;
        StringBuilder sb = this.f10324;
        int length = sb.length();
        C11831 c11831 = new C11831(sb.subSequence(i, length));
        Iterator it = this.f10325.iterator();
        while (it.hasNext() && (c13948 = (C13948) it.next()) != null) {
            int i3 = c13948.f45900;
            if (i3 >= i && (i2 = c13948.f45899) <= length) {
                c11831.setSpan(c13948.f45898, i3 - i, i2 - i, 33);
                it.remove();
            }
        }
        sb.replace(i, length, "");
        return c11831;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f10324.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<C13948> listM8183 = m8183(i, i2);
        boolean zIsEmpty = listM8183.isEmpty();
        StringBuilder sb = this.f10324;
        if (zIsEmpty) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length = spannableStringBuilder.length();
        for (C13948 c13948 : listM8183) {
            int iMax = Math.max(0, c13948.f45900 - i);
            int iMin = Math.min(length, (c13948.f45899 - c13948.f45900) + iMax);
            Object obj = c13948.f45898;
            int i3 = c13948.f45901;
            if (obj instanceof C22995) {
                i3 |= 16711680;
            }
            spannableStringBuilder.setSpan(obj, iMax, iMin, i3);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f10324.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m8184() {
        C11831 c11831 = new C11831(this.f10324);
        for (C13948 c13948 : this.f10325) {
            Object obj = c13948.f45898;
            int i = c13948.f45900;
            int i2 = c13948.f45899;
            int i3 = c13948.f45901;
            if (obj instanceof C22995) {
                i3 |= 16711680;
            }
            c11831.setSpan(obj, i, i2, i3);
        }
        return c11831;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8179(int i, CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        boolean z = spanned instanceof C11831;
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        int length = spans != null ? spans.length : 0;
        if (length <= 0) {
            return;
        }
        if (!z) {
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = spans[i2];
                setSpan(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj));
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            Object obj2 = spans[length];
            setSpan(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m8181(C2657 c2657, Object obj, int i, int i2) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    m8181(c2657, obj2, i, i2);
                }
                return;
            }
            c2657.setSpan(obj, i, i2, 33);
        }
    }
}
