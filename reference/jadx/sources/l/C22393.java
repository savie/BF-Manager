package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHK */
/* JADX INFO: loaded from: classes.dex */
public final class C22393 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f72496;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f72495 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7521 f72494 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f72493 = null;

    public C22393(int i) {
        this.f72496 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50465(int i, int i2) {
        int[] iArr = this.f72493;
        boolean z = iArr == null;
        if (i != 0 || z) {
            if (i < 0) {
                throw new RuntimeException("shouldn't happen");
            }
            if (z || i2 >= iArr.length) {
                int i3 = i2 + 1;
                C7521 c7521 = new C7521(i3);
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    c7521.m20591(this.f72494);
                    int[] iArr3 = this.f72493;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.f72494 = c7521;
                this.f72493 = iArr2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50469(int i, C7521 c7521) {
        int iM20590 = c7521.m20590();
        m50465(i, iM20590 - 1);
        for (int i2 = 0; i2 < iM20590; i2++) {
            C20946 c20946 = this.f72494.get(i2);
            C20946 c20946M47892 = c7521.get(i2);
            if (c20946M47892 != null && c20946M47892.getType() == C5085.f17762) {
                c20946M47892 = c20946M47892.m47892(C5085.f17733);
            }
            if (c20946 == null) {
                if (c20946M47892 != null) {
                    m50471(i, c20946M47892);
                }
            } else if (c20946M47892 != null) {
                if (!c20946M47892.m47900(c20946)) {
                    m50470(i, EnumC13662.END_SIMPLY, c20946);
                    m50471(i, c20946M47892);
                }
            } else {
                m50470(i, EnumC13662.END_SIMPLY, c20946);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50471(int i, C20946 c20946) {
        C20946 c20947;
        C20946 c20948;
        int iM47903 = c20946.m47903();
        if (c20946.getType() == C5085.f17762) {
            c20946 = c20946.m47892(C5085.f17733);
        }
        m50465(i, iM47903);
        C20946 c20949 = this.f72494.get(iM47903);
        if (c20946.m47900(c20949)) {
            return;
        }
        C20946 c20946M20586 = this.f72494.m20586(c20946);
        if (c20946M20586 != null) {
            m50466(i, EnumC13662.END_MOVED, c20946M20586);
        }
        int i2 = this.f72493[iM47903];
        if (c20949 != null) {
            m50467(i, EnumC13662.END_REPLACED, c20949);
        } else if (i2 >= 0) {
            ArrayList arrayList = this.f72496;
            C5239 c5239 = (C5239) arrayList.get(i2);
            if (c5239.m15740() == i) {
                if (c5239.m15743(c20946)) {
                    arrayList.set(i2, null);
                    this.f72495++;
                    this.f72494.m20592(c20946);
                    this.f72493[iM47903] = -1;
                    return;
                }
                arrayList.set(i2, c5239.m15742(EnumC13662.END_REPLACED));
            }
        }
        if (iM47903 > 0 && (c20948 = this.f72494.get(iM47903 - 1)) != null && c20948.m47895()) {
            m50466(i, EnumC13662.END_CLOBBERED_BY_NEXT, c20948);
        }
        if (c20946.m47895() && (c20947 = this.f72494.get(iM47903 + 1)) != null) {
            m50466(i, EnumC13662.END_CLOBBERED_BY_PREV, c20947);
        }
        m50467(i, EnumC13662.START, c20946);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50470(int i, EnumC13662 enumC13662, C20946 c20946) {
        int iM47903 = c20946.m47903();
        if (c20946.getType() == C5085.f17762) {
            c20946 = c20946.m47892(C5085.f17733);
        }
        m50465(i, iM47903);
        if (this.f72493[iM47903] >= 0) {
            return;
        }
        ArrayList arrayList = this.f72496;
        boolean z = true;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            C5239 c5239 = (C5239) arrayList.get(size);
            if (c5239 != null) {
                if (c5239.m15740() != i) {
                    m50467(i, enumC13662, c20946);
                    return;
                } else if (c5239.m15743(c20946)) {
                    break;
                }
            }
            size--;
        }
        this.f72494.m20589(c20946);
        C5239 c52310 = null;
        arrayList.set(size, null);
        this.f72495++;
        int iM47904 = c20946.m47903();
        while (true) {
            size--;
            if (size < 0) {
                z = false;
                break;
            }
            c52310 = (C5239) arrayList.get(size);
            if (c52310 != null && c52310.m15744().m47903() == iM47904) {
                break;
            }
        }
        if (z) {
            this.f72493[iM47904] = size;
            if (c52310.m15740() == i) {
                arrayList.set(size, c52310.m15742(EnumC13662.END_SIMPLY));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m50467(int i, EnumC13662 enumC13662, C20946 c20946) {
        int iM47903 = c20946.m47903();
        C5239 c5239 = new C5239(i, enumC13662, c20946);
        ArrayList arrayList = this.f72496;
        arrayList.add(c5239);
        if (enumC13662 == EnumC13662.START) {
            this.f72494.m20592(c20946);
            this.f72493[iM47903] = -1;
        } else {
            this.f72494.m20589(c20946);
            this.f72493[iM47903] = arrayList.size() - 1;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m50466(int i, EnumC13662 enumC13662, C20946 c20946) {
        if (enumC13662 == EnumC13662.START) {
            throw new RuntimeException("shouldn't happen");
        }
        int i2 = this.f72493[c20946.m47903()];
        if (i2 >= 0) {
            ArrayList arrayList = this.f72496;
            C5239 c5239 = (C5239) arrayList.get(i2);
            if (c5239.m15740() == i && c5239.m15744().equals(c20946)) {
                arrayList.set(i2, c5239.m15742(enumC13662));
                this.f72494.m20589(c20946);
                return;
            }
        }
        m50470(i, enumC13662, c20946);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11204 m50468() {
        m50465(Integer.MAX_VALUE, 0);
        ArrayList<C5239> arrayList = this.f72496;
        int size = arrayList.size();
        int i = size - this.f72495;
        if (i == 0) {
            return C11204.f35346;
        }
        C5239[] c5239Arr = new C5239[i];
        if (size == i) {
            arrayList.toArray(c5239Arr);
        } else {
            int i2 = 0;
            for (C5239 c5239 : arrayList) {
                if (c5239 != null) {
                    c5239Arr[i2] = c5239;
                    i2++;
                }
            }
        }
        Arrays.sort(c5239Arr);
        C11204 c11204 = new C11204(i);
        for (int i3 = 0; i3 < i; i3++) {
            c11204.m31600(i3, c5239Arr[i3]);
        }
        c11204.mo15005();
        return c11204;
    }
}
