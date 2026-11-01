package l;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes4.dex */
public final class C15640 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC13523 f50838;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0821 f50839;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1527 f50840;

    public C15640(C1527 c1527, C4349 c4349, InterfaceC13523 interfaceC13523, Set set) {
        this.f50839 = c4349;
        this.f50840 = c1527;
        this.f50838 = interfaceC13523;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m37315(str, 0, str.length(), 1, true, new C7172(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m37319(CharSequence charSequence, int i, int i2, boolean z) {
        C22072 c22072;
        AbstractC19873[] abstractC19873Arr;
        boolean z2 = charSequence instanceof C2938;
        if (z2) {
            ((C2938) charSequence).m8771();
        }
        if (z2) {
            c22072 = new C22072((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    c22072 = new C22072((Spannable) charSequence);
                } else {
                    c22072 = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, AbstractC19873.class) > i2) ? null : new C22072(charSequence);
                }
            } finally {
                if (z2) {
                    ((C2938) charSequence).m8772();
                }
            }
        }
        if (c22072 != null && (abstractC19873Arr = (AbstractC19873[]) c22072.getSpans(i, i2, AbstractC19873.class)) != null && abstractC19873Arr.length > 0) {
            for (AbstractC19873 abstractC19873 : abstractC19873Arr) {
                int spanStart = c22072.getSpanStart(abstractC19873);
                int spanEnd = c22072.getSpanEnd(abstractC19873);
                if (spanStart != i2) {
                    c22072.removeSpan(abstractC19873);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i3 = i;
        int i4 = i2;
        if (i3 != i4 && i3 < charSequence.length()) {
            C22072 c22073 = (C22072) m37315(charSequence, i3, i4, Integer.MAX_VALUE, z, new C8584(c22072, this.f50839));
            if (c22073 != null) {
                return c22073.m49022();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m37315(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC9995 interfaceC9995) {
        int iCharCount;
        C20578 c20578 = new C20578(this.f50840.m5298());
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i4 = 0;
        boolean zMo19103 = true;
        loop0: while (true) {
            int iCodePointAt2 = iCodePointAt;
            iCharCount = i;
            while (true) {
                if (iCharCount < i2 && i4 < i3 && zMo19103) {
                    int iM46441 = c20578.m46441(iCodePointAt2);
                    if (iM46441 == 1) {
                        i += Character.charCount(Character.codePointAt(charSequence, i));
                        if (i < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, i);
                            break;
                        }
                    } else if (iM46441 == 2) {
                        iCharCount += Character.charCount(iCodePointAt2);
                        if (iCharCount < i2) {
                            iCodePointAt2 = Character.codePointAt(charSequence, iCharCount);
                        }
                    } else if (iM46441 == 3) {
                        if (z || !m37318(charSequence, i, iCharCount, c20578.m46444())) {
                            zMo19103 = interfaceC9995.mo19103(charSequence, i, iCharCount, c20578.m46444());
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
        if (c20578.m46443() && i4 < i3 && zMo19103 && (z || !m37318(charSequence, i, iCharCount, c20578.m46442()))) {
            interfaceC9995.mo19103(charSequence, i, iCharCount, c20578.m46442());
        }
        return interfaceC9995.mo19102();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37316(Editable editable, int i, KeyEvent keyEvent) {
        boolean zM37317;
        if (i == 67) {
            zM37317 = m37317(editable, keyEvent, false);
        } else {
            zM37317 = i != 112 ? false : m37317(editable, keyEvent, true);
        }
        if (!zM37317) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37317(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC19873[] abstractC19873Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (abstractC19873Arr = (AbstractC19873[]) editable.getSpans(selectionStart, selectionEnd, AbstractC19873.class)) != null && abstractC19873Arr.length > 0) {
                for (AbstractC19873 abstractC19873 : abstractC19873Arr) {
                    int spanStart = editable.getSpanStart(abstractC19873);
                    int spanEnd = editable.getSpanEnd(abstractC19873);
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
    private boolean m37318(CharSequence charSequence, int i, int i2, C4432 c4432) {
        if (c4432.m12375() == 0) {
            c4432.m12371(((C23670) this.f50838).m52113(i, i2, c4432.m12372(), charSequence));
        }
        return c4432.m12375() == 2;
    }
}
