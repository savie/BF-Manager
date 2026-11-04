package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 255M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20763 extends AbstractC10408 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f66506;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f66507;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f66508;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C25042[] f66509;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12558 f66510;

    public C20763(C12558 c12558, String str, C25042[] c25042Arr, boolean z) {
        this.f66508 = -1;
        str.getClass();
        this.f66510 = c12558;
        this.f66507 = str;
        this.f66509 = c25042Arr;
        if (c25042Arr == null || !z) {
            return;
        }
        for (C25042 c25042 : c25042Arr) {
            c12558.m31256(c25042.f81015);
        }
    }

    public C20763(C12558 c12558, String str) {
        this(c12558, str, null, false);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m47469() {
        int i = this.f66508;
        C12558 c12558 = this.f66510;
        if (i != -1 && c12558.getItem(i) == this) {
            return this.f66508;
        }
        int iM31247 = c12558.m31247(this);
        this.f66508 = iM31247;
        return iM31247;
    }

    @Override // l.InterfaceC16090
    public final String getValue() {
        return this.f66507;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m47468(String str) {
        C25042[] c25042Arr = this.f66509;
        C12558 c12558 = this.f66510;
        if (c25042Arr == null) {
            if (this.f66507.equals(str)) {
                return;
            }
            c12558.f40329.remove(this.f66507);
            this.f66507 = str;
            c12558.f40329.put(str, this);
            return;
        }
        c12558.f40328.remove(this);
        this.f66507 = str;
        this.f66509 = null;
        c12558.f40329.put(str, this);
    }

    @Override // l.InterfaceC16090
    public final int[] getStyle() {
        if (!mo8825()) {
            return null;
        }
        C25042[] c25042ArrM41245 = C17582.m41245(m26720(this.f66509));
        int[] iArr = new int[c25042ArrM41245.length * 3];
        for (int i = 0; i < c25042ArrM41245.length; i++) {
            C25042 c25042 = c25042ArrM41245[i];
            int i2 = i * 3;
            iArr[i2] = this.f66510.m31251(c25042.f81015);
            iArr[i2 + 1] = c25042.f81016;
            iArr[i2 + 2] = c25042.f81014 - 1;
        }
        return iArr;
    }

    @Override // l.InterfaceC16090
    /* JADX INFO: renamed from: ܿۙ */
    public final C25042[] mo8826() {
        C25042[] c25042Arr = this.f66509;
        return c25042Arr != null ? (C25042[]) c25042Arr.clone() : c25042Arr;
    }

    @Override // l.InterfaceC16090
    /* JADX INFO: renamed from: ۜۙ */
    public final C25042[] mo8824() {
        return m26720(this.f66509);
    }

    @Override // l.InterfaceC16090
    /* JADX INFO: renamed from: ۠ۙ */
    public final boolean mo8825() {
        C25042[] c25042Arr = this.f66509;
        return c25042Arr != null && c25042Arr.length > 0;
    }

    @Override // l.AbstractC10408
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20763.class == obj.getClass()) {
            C20763 c20763 = (C20763) obj;
            if (Arrays.equals(this.f66509, c20763.f66509) && this.f66507.equals(c20763.f66507)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC10408
    public final int hashCode() {
        return this.f66507.hashCode();
    }
}
