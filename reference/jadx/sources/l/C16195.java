package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16195 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC7728 f52291;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View f52292;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2269 f52293;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC21133 f52294;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12418 f52295;

    public C16195(Context context, View view, int i) {
        this(context, view, i, R.attr.MT_Protector);
    }

    public C16195(Context context, View view, int i, int i2) {
        this.f52292 = view;
        C12418 c12418 = new C12418(context);
        this.f52295 = c12418;
        c12418.setCallback(new C9140(this));
        C2269 c2269 = new C2269(context, c12418, view, false, i2, 0);
        this.f52293 = c2269;
        c2269.m6955(i);
        c2269.m6957(new C10551(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38294(int i) {
        this.f52293.m6955(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m38299() {
        return this.f52293.m6963();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12418 m38298() {
        return this.f52295;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m38297() {
        if (!this.f52293.m6952()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38293() {
        this.f52293.m6954();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38296(InterfaceC21133 interfaceC21133) {
        this.f52294 = interfaceC21133;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38295(InterfaceC7728 interfaceC7728) {
        this.f52291 = interfaceC7728;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m38292() {
        this.f52293.m6959(true);
    }
}
