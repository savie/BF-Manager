package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W1DE */
/* JADX INFO: loaded from: classes5.dex */
public class C14174 extends C10445 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C10445[] f44823 = new C10445[4];

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f44822 = 0;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public void mo34463() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34462(C10445 c10445) {
        if (c10445 == this || c10445 == null) {
            return;
        }
        int i = this.f44822 + 1;
        C10445[] c10445Arr = this.f44823;
        if (i > c10445Arr.length) {
            this.f44823 = (C10445[]) Arrays.copyOf(c10445Arr, c10445Arr.length * 2);
        }
        C10445[] c10445Arr2 = this.f44823;
        int i2 = this.f44822;
        c10445Arr2[i2] = c10445;
        this.f44822 = i2 + 1;
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ۙ */
    public void mo9735(C10445 c10445, HashMap map) {
        super.mo9735(c10445, map);
        C14174 c14174 = (C14174) c10445;
        this.f44822 = 0;
        int i = c14174.f44822;
        for (int i2 = 0; i2 < i; i2++) {
            m34462((C10445) map.get(c14174.f44823[i2]));
        }
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final void m34464() {
        this.f44822 = 0;
        Arrays.fill(this.f44823, (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34461(int i, C18059 c18059, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f44822; i2++) {
            c18059.m42080(this.f44823[i2]);
        }
        for (int i3 = 0; i3 < this.f44822; i3++) {
            C23281.m52398(this.f44823[i3], i, arrayList, c18059);
        }
    }
}
