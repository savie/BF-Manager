package l;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۧ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4WH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10872 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27237(int i) {
        return (i & 240) >>> 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27238(Canvas canvas, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Layout layoutM43319 = C18761.m43319(spanned);
            if (layoutM43319 != null) {
                return layoutM43319.getWidth();
            }
            TextView textViewM21476 = C8178.m21476(spanned);
            if (textViewM21476 != null) {
                return (textViewM21476.getWidth() - textViewM21476.getPaddingLeft()) - textViewM21476.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10975 m27239(C17684 c17684, C18825 c18825) {
        int iM43447 = c18825.m43447();
        try {
            int iM43453 = c18825.m43453();
            int i = iM43453 & 31;
            int i2 = iM43453 >>> 5;
            if (i == 0) {
                C13530.m33064(i2, 0);
                return new C13611((byte) c18825.m43434());
            }
            if (i == 6) {
                C13530.m33064(i2, 7);
                return new C15022(c18825.m43433(i2 + 1));
            }
            if (i == 2) {
                C13530.m33064(i2, 1);
                return new C19255((short) c18825.m43444(i2 + 1));
            }
            if (i == 3) {
                C13530.m33064(i2, 1);
                return new C11494((char) c18825.m43431(i2 + 1));
            }
            if (i == 4) {
                C13530.m33064(i2, 3);
                return new C22783(c18825.m43444(i2 + 1));
            }
            if (i == 16) {
                C13530.m33064(i2, 3);
                return new C6554(Float.intBitsToFloat(c18825.m43440(i2 + 1)));
            }
            if (i == 17) {
                C13530.m33064(i2, 7);
                return new C2320(Double.longBitsToDouble(c18825.m43455(i2 + 1)));
            }
            switch (i) {
                case 21:
                    C13530.m33064(i2, 3);
                    return new C2971(c17684, c18825, i2);
                case 22:
                    C13530.m33064(i2, 3);
                    return new C9323(c17684, c18825, i2);
                case 23:
                    C13530.m33064(i2, 3);
                    return new C4416(c17684, c18825, i2);
                case 24:
                    C13530.m33064(i2, 3);
                    return new C13590(c17684, c18825, i2);
                case 25:
                    C13530.m33064(i2, 3);
                    return new C14262(c17684, c18825, i2);
                case 26:
                    C13530.m33064(i2, 3);
                    return new C1560(c17684, c18825, i2);
                case 27:
                    C13530.m33064(i2, 3);
                    return new C23434(c17684, c18825, i2);
                case 28:
                    C13530.m33064(i2, 0);
                    return new C10734(c17684, c18825);
                case 29:
                    C13530.m33064(i2, 0);
                    return new C17083(c17684, c18825);
                case 30:
                    C13530.m33064(i2, 0);
                    return C7966.f26159;
                case 31:
                    C13530.m33064(i2, 1);
                    return i2 == 1 ? C4437.f15773 : C4437.f15774;
                default:
                    throw new C20749(null, "Invalid encoded_value type: 0x%x", Integer.valueOf(i));
            }
        } catch (Exception e) {
            throw C20749.m46751(e, "Error while reading encoded value at offset 0x%x", Integer.valueOf(iM43447));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27240(C18825 c18825) {
        int iM43447 = c18825.m43447();
        try {
            int iM43453 = c18825.m43453();
            int i = iM43453 & 31;
            if (i == 0) {
                c18825.m43442();
                return;
            }
            if (i != 6 && i != 2 && i != 3 && i != 4 && i != 16 && i != 17) {
                switch (i) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        break;
                    case 28:
                        int iM43449 = c18825.m43449();
                        for (int i2 = 0; i2 < iM43449; i2++) {
                            m27240(c18825);
                        }
                        return;
                    case 29:
                        C17083.m39867(c18825);
                        return;
                    case 30:
                    case 31:
                        return;
                    default:
                        throw new C20749(null, "Invalid encoded_value type: 0x%x", Integer.valueOf(i));
                }
            }
            c18825.m43437((iM43453 >>> 5) + 1);
        } catch (Exception e) {
            throw C20749.m46751(e, "Error while skipping encoded value at offset 0x%x", Integer.valueOf(iM43447));
        }
    }
}
