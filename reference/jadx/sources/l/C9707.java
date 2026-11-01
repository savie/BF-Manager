package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 97S2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9707 implements InterfaceC8400 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ char[] f32697;

    @Override // l.InterfaceC8400
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3208(Object obj, Object obj2) {
        int iIndexOf;
        CharSequence charSequence = (CharSequence) obj;
        int iIntValue = ((Integer) obj2).intValue();
        C13465.m32966(charSequence, "$this$DelimitedRangesSequence");
        C13465.m32966(charSequence, "<this>");
        char[] cArr = this.f32697;
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
            int iM10010 = C3355.m10010(charSequence);
            if (iIntValue > iM10010) {
                iIndexOf = -1;
                break;
            }
            loop0: while (true) {
                char cCharAt = charSequence.charAt(iIntValue);
                for (char c : cArr) {
                    if (C10413.m26319(c, cCharAt, false)) {
                        iIndexOf = iIntValue;
                        break loop0;
                    }
                }
                if (iIntValue == iM10010) {
                    iIndexOf = -1;
                    break;
                }
                iIntValue++;
            }
        }
        if (iIndexOf < 0) {
            return null;
        }
        return new C15083(Integer.valueOf(iIndexOf), 1);
    }
}
