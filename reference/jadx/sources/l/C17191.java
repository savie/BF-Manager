package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: W1DE */
/* JADX INFO: loaded from: classes4.dex */
public class C17191 extends C20719 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public C20719[] f54815 = new C20719[4];

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f54816 = 0;

    /* JADX INFO: renamed from: ֨ۙ */
    public void mo27180() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40113(C20719 c20719) {
        if (c20719 == this || c20719 == null) {
            return;
        }
        int i = this.f54816 + 1;
        C20719[] c20719Arr = this.f54815;
        if (i > c20719Arr.length) {
            this.f54815 = (C20719[]) Arrays.copyOf(c20719Arr, c20719Arr.length * 2);
        }
        C20719[] c20719Arr2 = this.f54815;
        int i2 = this.f54816;
        c20719Arr2[i2] = c20719;
        this.f54816 = i2 + 1;
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ۙ */
    public void mo1745(C20719 c20719, HashMap map) {
        super.mo1745(c20719, map);
        C17191 c17191 = (C17191) c20719;
        this.f54816 = 0;
        int i = c17191.f54816;
        for (int i2 = 0; i2 < i; i2++) {
            m40113((C20719) map.get(c17191.f54815[i2]));
        }
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final void m40114() {
        this.f54816 = 0;
        Arrays.fill(this.f54815, (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40112(int i, C19702 c19702, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f54816; i2++) {
            c19702.m44827(this.f54815[i2]);
        }
        for (int i3 = 0; i3 < this.f54816; i3++) {
            C13352.m32849(this.f54815[i3], i, arrayList, c19702);
        }
    }
}
