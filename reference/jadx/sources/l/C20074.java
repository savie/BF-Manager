package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩶ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 69OZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20074 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f65211;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f65212 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumC23911 f65213;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65214;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f65215;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f65216;

    public C20074(int i) {
        this.f65214 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45440(InterfaceC1332 interfaceC1332) {
        this.f65215 = interfaceC1332;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45442(EnumC23911 enumC23911) {
        C9779.m24889(enumC23911, "syntax");
        this.f65213 = enumC23911;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45443(boolean z) {
        this.f65211 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45444(int[] iArr) {
        this.f65212 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45441(C15403 c15403) {
        if (this.f65216) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.f65214.add(c15403);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0317 m45439() {
        if (this.f65216) {
            throw new IllegalStateException("Builder can only build once");
        }
        if (this.f65213 == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.f65216 = true;
        ArrayList arrayList = this.f65214;
        Collections.sort(arrayList);
        return new C0317(this.f65213, this.f65211, this.f65212, (C15403[]) arrayList.toArray(new C15403[0]), this.f65215);
    }
}
