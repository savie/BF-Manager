package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 97S2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21935 implements InterfaceC23955 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ char[] f70809;

    @Override // l.InterfaceC23955
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3124(Object obj, Object obj2) {
        int iIndexOf;
        CharSequence charSequence = (CharSequence) obj;
        int iIntValue = ((Integer) obj2).intValue();
        C15243.m36590(charSequence, "$this$DelimitedRangesSequence");
        C15243.m36590(charSequence, "<this>");
        char[] cArr = this.f70809;
        if (cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            iIndexOf = ((String) charSequence).indexOf(cArr[0], iIntValue);
        } else {
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            int iM27408 = C10746.m27408(charSequence);
            if (iIntValue > iM27408) {
                iIndexOf = -1;
                break;
            }
            loop0: while (true) {
                char cCharAt = charSequence.charAt(iIntValue);
                for (char c : cArr) {
                    if (C14301.m34743(c, cCharAt, false)) {
                        iIndexOf = iIntValue;
                        break loop0;
                    }
                }
                if (iIntValue == iM27408) {
                    iIndexOf = -1;
                    break;
                }
                iIntValue++;
            }
        }
        if (iIndexOf < 0) {
            return null;
        }
        return new C21914(Integer.valueOf(iIndexOf), 1);
    }
}
