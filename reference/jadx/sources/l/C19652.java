package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ᩴۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69OZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19652 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f63297 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63298;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f63299;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public EnumC16711 f63300;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f63301;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f63302;

    public C19652(int i) {
        this.f63298 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45303(InterfaceC21013 interfaceC21013) {
        this.f63301 = interfaceC21013;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45302(EnumC16711 enumC16711) {
        C23447.m52662(enumC16711, "syntax");
        this.f63300 = enumC16711;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45304(boolean z) {
        this.f63302 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45305(int[] iArr) {
        this.f63297 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45301(C10042 c10042) {
        if (this.f63299) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.f63298.add(c10042);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15176 m45300() {
        if (this.f63299) {
            throw new IllegalStateException("Builder can only build once");
        }
        if (this.f63300 == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.f63299 = true;
        ArrayList arrayList = this.f63298;
        Collections.sort(arrayList);
        return new C15176(this.f63300, this.f63302, this.f63297, (C10042[]) arrayList.toArray(new C10042[0]), this.f63301);
    }
}
