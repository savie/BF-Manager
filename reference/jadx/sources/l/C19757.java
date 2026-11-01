package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩵᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8MR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19757 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f63485;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f63486;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f63489;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f63490;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C18345 f63484 = new C18345();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C19051 f63483 = new C19051();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C8468[] f63488 = new C8468[5];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f63491 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63487 = -1;

    public C19757(int i) {
        this.f63490 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44949() {
        this.f63491.clear();
        this.f63487 = -1;
        this.f63489 = 0;
        this.f63485 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44948(float f, int i) {
        C8468 c8468;
        int i2 = this.f63487;
        ArrayList arrayList = this.f63491;
        if (i2 != 1) {
            Collections.sort(arrayList, f63484);
            this.f63487 = 1;
        }
        int i3 = this.f63486;
        C8468[] c8468Arr = this.f63488;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f63486 = i4;
            c8468 = c8468Arr[i4];
        } else {
            c8468 = new C8468(0);
        }
        int i5 = this.f63489;
        this.f63489 = i5 + 1;
        c8468.f29366 = i5;
        c8468.f29367 = i;
        c8468.f29368 = f;
        arrayList.add(c8468);
        this.f63485 += i;
        while (true) {
            int i6 = this.f63485;
            int i7 = this.f63490;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            C8468 c8469 = (C8468) arrayList.get(0);
            int i9 = c8469.f29367;
            if (i9 <= i8) {
                this.f63485 -= i9;
                arrayList.remove(0);
                int i10 = this.f63486;
                if (i10 < 5) {
                    this.f63486 = i10 + 1;
                    c8468Arr[i10] = c8469;
                }
            } else {
                c8469.f29367 = i9 - i8;
                this.f63485 -= i8;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m44947() {
        int i = this.f63487;
        ArrayList arrayList = this.f63491;
        if (i != 0) {
            Collections.sort(arrayList, f63483);
            this.f63487 = 0;
        }
        float f = this.f63485 * 0.5f;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C8468 c8468 = (C8468) arrayList.get(i3);
            i2 += c8468.f29367;
            if (i2 >= f) {
                return c8468.f29368;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C8468) C19084.m43861(arrayList, 1)).f29368;
    }
}
