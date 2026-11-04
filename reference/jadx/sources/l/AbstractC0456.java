package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64S */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0456 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f2047;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC18355 f2048 = EnumC18355.NOT_READY;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC21825 abstractC21825;
        EnumC18355 enumC18355 = this.f2048;
        EnumC18355 enumC18356 = EnumC18355.FAILED;
        C12128.m30315(enumC18355 != enumC18356);
        int iOrdinal = this.f2048.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f2048 = enumC18356;
            AbstractC18841 abstractC18841 = (AbstractC18841) this;
            int i = abstractC18841.f61202;
            while (true) {
                int i2 = abstractC18841.f61202;
                if (i2 == -1) {
                    abstractC18841.f2048 = EnumC18355.DONE;
                    string = null;
                    break;
                }
                int iMo1564 = abstractC18841.mo1564(i2);
                CharSequence charSequence = abstractC18841.f61206;
                if (iMo1564 == -1) {
                    iMo1564 = charSequence.length();
                    abstractC18841.f61202 = -1;
                } else {
                    abstractC18841.f61202 = abstractC18841.mo1565(iMo1564);
                }
                int i3 = abstractC18841.f61202;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    abstractC18841.f61202 = i4;
                    if (i4 > charSequence.length()) {
                        abstractC18841.f61202 = -1;
                    }
                } else {
                    while (true) {
                        abstractC21825 = abstractC18841.f61204;
                        if (i >= iMo1564 || !abstractC21825.mo4420(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (iMo1564 > i && abstractC21825.mo4420(charSequence.charAt(iMo1564 - 1))) {
                        iMo1564--;
                    }
                    if (abstractC18841.f61203 && i == iMo1564) {
                        i = abstractC18841.f61202;
                    } else {
                        int i5 = abstractC18841.f61205;
                        if (i5 == 1) {
                            iMo1564 = charSequence.length();
                            abstractC18841.f61202 = -1;
                            while (iMo1564 > i && abstractC21825.mo4420(charSequence.charAt(iMo1564 - 1))) {
                                iMo1564--;
                            }
                        } else {
                            abstractC18841.f61205 = i5 - 1;
                        }
                        string = charSequence.subSequence(i, iMo1564).toString();
                        break;
                    }
                }
            }
            this.f2047 = string;
            if (this.f2048 != EnumC18355.DONE) {
                this.f2048 = EnumC18355.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2048 = EnumC18355.NOT_READY;
        String str = this.f2047;
        this.f2047 = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
