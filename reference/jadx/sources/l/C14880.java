package l;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes4.dex */
public final class C14880 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5186 f48620;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5932 f48621;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8914 f48622;

    public C14880(C8914 c8914, C13783 c13783, InterfaceC5186 interfaceC5186, Set set) {
        this.f48621 = c13783;
        this.f48622 = c8914;
        this.f48620 = interfaceC5186;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m35822(str, 0, str.length(), 1, true, new C24578(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m35826(CharSequence charSequence, int i, int i2, boolean z) {
        C15538 c15538;
        AbstractC21594[] abstractC21594Arr;
        boolean z2 = charSequence instanceof C14134;
        if (z2) {
            ((C14134) charSequence).m34355();
        }
        if (z2) {
            c15538 = new C15538((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    c15538 = new C15538((Spannable) charSequence);
                } else {
                    c15538 = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, AbstractC21594.class) > i2) ? null : new C15538(charSequence);
                }
            } finally {
                if (z2) {
                    ((C14134) charSequence).m34356();
                }
            }
        }
        if (c15538 != null && (abstractC21594Arr = (AbstractC21594[]) c15538.getSpans(i, i2, AbstractC21594.class)) != null && abstractC21594Arr.length > 0) {
            for (AbstractC21594 abstractC21594 : abstractC21594Arr) {
                int spanStart = c15538.getSpanStart(abstractC21594);
                int spanEnd = c15538.getSpanEnd(abstractC21594);
                if (spanStart != i2) {
                    c15538.removeSpan(abstractC21594);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i3 = i;
        int i4 = i2;
        if (i3 != i4 && i3 < charSequence.length()) {
            C15538 c15539 = (C15538) m35822(charSequence, i3, i4, Integer.MAX_VALUE, z, new C12643(c15538, this.f48621));
            if (c15539 != null) {
                return c15539.m37221();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m35822(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC6678 interfaceC6678) {
        int iCharCount;
        C4440 c4440 = new C4440(this.f48622.m23830());
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i4 = 0;
        boolean zMo18673 = true;
        loop0: while (true) {
            int iCodePointAt2 = iCodePointAt;
            iCharCount = i;
            while (true) {
                if (iCharCount < i2 && i4 < i3 && zMo18673) {
                    int iM14128 = c4440.m14128(iCodePointAt2);
                    if (iM14128 == 1) {
                        i += Character.charCount(Character.codePointAt(charSequence, i));
                        if (i < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, i);
                            break;
                        }
                    } else if (iM14128 == 2) {
                        iCharCount += Character.charCount(iCodePointAt2);
                        if (iCharCount < i2) {
                            iCodePointAt2 = Character.codePointAt(charSequence, iCharCount);
                        }
                    } else if (iM14128 == 3) {
                        if (z || !m35825(charSequence, i, iCharCount, c4440.m14131())) {
                            zMo18673 = interfaceC6678.mo18673(charSequence, i, iCharCount, c4440.m14131());
                            i4++;
                        }
                        i = iCharCount;
                    }
                    iCodePointAt = iCodePointAt2;
                    break;
                }
                break loop0;
            }
        }
        if (c4440.m14130() && i4 < i3 && zMo18673 && (z || !m35825(charSequence, i, iCharCount, c4440.m14129()))) {
            interfaceC6678.mo18673(charSequence, i, iCharCount, c4440.m14129());
        }
        return interfaceC6678.mo18672();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35823(Editable editable, int i, KeyEvent keyEvent) {
        boolean zM35824;
        if (i == 67) {
            zM35824 = m35824(editable, keyEvent, false);
        } else {
            zM35824 = i != 112 ? false : m35824(editable, keyEvent, true);
        }
        if (!zM35824) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35824(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC21594[] abstractC21594Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (abstractC21594Arr = (AbstractC21594[]) editable.getSpans(selectionStart, selectionEnd, AbstractC21594.class)) != null && abstractC21594Arr.length > 0) {
                for (AbstractC21594 abstractC21594 : abstractC21594Arr) {
                    int spanStart = editable.getSpanStart(abstractC21594);
                    int spanEnd = editable.getSpanEnd(abstractC21594);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m35825(CharSequence charSequence, int i, int i2, C5098 c5098) {
        if (c5098.m15419() == 0) {
            c5098.m15413(((C9308) this.f48620).m24533(i, i2, c5098.m15418(), charSequence));
        }
        return c5098.m15419() == 2;
    }
}
