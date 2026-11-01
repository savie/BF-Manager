package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64S */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7327 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f24359;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC10150 f24360 = EnumC10150.NOT_READY;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC14384 abstractC14384;
        EnumC10150 enumC10150 = this.f24360;
        EnumC10150 enumC10151 = EnumC10150.FAILED;
        C18304.m42523(enumC10150 != enumC10151);
        int iOrdinal = this.f24360.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f24360 = enumC10151;
            AbstractC0664 abstractC0664 = (AbstractC0664) this;
            int i = abstractC0664.f2803;
            while (true) {
                int i2 = abstractC0664.f2803;
                if (i2 == -1) {
                    abstractC0664.f24360 = EnumC10150.DONE;
                    string = null;
                    break;
                }
                int iMo2987 = abstractC0664.mo2987(i2);
                CharSequence charSequence = abstractC0664.f2804;
                if (iMo2987 == -1) {
                    iMo2987 = charSequence.length();
                    abstractC0664.f2803 = -1;
                } else {
                    abstractC0664.f2803 = abstractC0664.mo2988(iMo2987);
                }
                int i3 = abstractC0664.f2803;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    abstractC0664.f2803 = i4;
                    if (i4 > charSequence.length()) {
                        abstractC0664.f2803 = -1;
                    }
                } else {
                    while (true) {
                        abstractC14384 = abstractC0664.f2801;
                        if (i >= iMo2987 || !abstractC14384.mo1772(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (iMo2987 > i && abstractC14384.mo1772(charSequence.charAt(iMo2987 - 1))) {
                        iMo2987--;
                    }
                    if (abstractC0664.f2802 && i == iMo2987) {
                        i = abstractC0664.f2803;
                    } else {
                        int i5 = abstractC0664.f2800;
                        if (i5 == 1) {
                            iMo2987 = charSequence.length();
                            abstractC0664.f2803 = -1;
                            while (iMo2987 > i && abstractC14384.mo1772(charSequence.charAt(iMo2987 - 1))) {
                                iMo2987--;
                            }
                        } else {
                            abstractC0664.f2800 = i5 - 1;
                        }
                        string = charSequence.subSequence(i, iMo2987).toString();
                        break;
                    }
                }
            }
            this.f24359 = string;
            if (this.f24360 != EnumC10150.DONE) {
                this.f24360 = EnumC10150.READY;
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
        this.f24360 = EnumC10150.NOT_READY;
        String str = this.f24359;
        this.f24359 = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
