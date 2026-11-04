package l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UB2A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20775 implements Appendable, CharSequence {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f66557 = new ArrayDeque(8);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f66556 = new StringBuilder((CharSequence) "");

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    public C20775() {
        m47525(0, "");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47532(String str) {
        this.f66556.append(str);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f66556.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final void append(char c) {
        this.f66556.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.f66556;
        m47525(sb.length(), charSequenceSubSequence);
        sb.append(charSequenceSubSequence);
        return this;
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        this.f66557.push(new C23759(obj, i, i2, i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47526(C20775 c20775, Object obj, int i, int i2) {
        if (obj != null) {
            int length = c20775.f66556.length();
            if (i2 <= i || i < 0 || i2 > length) {
                return;
            }
            m47527(c20775, obj, i, i2);
        }
    }

    @Override // java.lang.Appendable
    public final void append(CharSequence charSequence) {
        StringBuilder sb = this.f66556;
        m47525(sb.length(), charSequence);
        sb.append(charSequence);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f66556.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m47528() {
        StringBuilder sb = this.f66556;
        return sb.charAt(sb.length() - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m47529(int i, int i2) {
        int i3;
        int length = this.f66556.length();
        if (i2 <= i || i < 0 || i2 > length) {
            return Collections.EMPTY_LIST;
        }
        ArrayDeque arrayDeque = this.f66557;
        if (i == 0 && length == i2) {
            ArrayList arrayList = new ArrayList(arrayDeque);
            Collections.reverse(arrayList);
            return C4681.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            C23759 c23759 = (C23759) itDescendingIterator.next();
            int i4 = c23759.f76990;
            if ((i4 >= i && i4 < i2) || (((i3 = c23759.f76989) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                arrayList2.add(c23759);
            }
        }
        return C4681.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence m47531(int i) {
        C23759 c23759;
        int i2;
        StringBuilder sb = this.f66556;
        int length = sb.length();
        C3621 c3621 = new C3621(sb.subSequence(i, length));
        Iterator it = this.f66557.iterator();
        while (it.hasNext() && (c23759 = (C23759) it.next()) != null) {
            int i3 = c23759.f76990;
            if (i3 >= i && (i2 = c23759.f76989) <= length) {
                c3621.setSpan(c23759.f76992, i3 - i, i2 - i, 33);
                it.remove();
            }
        }
        sb.replace(i, length, "");
        return c3621;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f66556.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<C23759> listM47529 = m47529(i, i2);
        boolean zIsEmpty = listM47529.isEmpty();
        StringBuilder sb = this.f66556;
        if (zIsEmpty) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length = spannableStringBuilder.length();
        for (C23759 c23759 : listM47529) {
            int iMax = Math.max(0, c23759.f76990 - i);
            int iMin = Math.min(length, (c23759.f76989 - c23759.f76990) + iMax);
            Object obj = c23759.f76992;
            int i3 = c23759.f76991;
            if (obj instanceof C18405) {
                i3 |= 16711680;
            }
            spannableStringBuilder.setSpan(obj, iMax, iMin, i3);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f66556.toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m47530() {
        C3621 c3621 = new C3621(this.f66556);
        for (C23759 c23759 : this.f66557) {
            Object obj = c23759.f76992;
            int i = c23759.f76990;
            int i2 = c23759.f76989;
            int i3 = c23759.f76991;
            if (obj instanceof C18405) {
                i3 |= 16711680;
            }
            c3621.setSpan(obj, i, i2, i3);
        }
        return c3621;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47525(int i, CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        boolean z = spanned instanceof C3621;
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m47527(C20775 c20775, Object obj, int i, int i2) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    m47527(c20775, obj2, i, i2);
                }
                return;
            }
            c20775.setSpan(obj, i, i2, 33);
        }
    }
}
