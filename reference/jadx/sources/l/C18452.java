package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GJ */
/* JADX INFO: loaded from: classes4.dex */
public class C18452 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View f60068;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC21436 f60069;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15009 f60070;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9898 f60071;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC14722 f60072;

    public C18452(Context context, View view, int i) {
        this(context, view, i, R.attr.MT_Protector);
    }

    public C18452(Context context, View view, int i, int i2) {
        this.f60068 = view;
        C9898 c9898 = new C9898(context);
        this.f60071 = c9898;
        c9898.setCallback(new C24420(this));
        C15009 c15009 = new C15009(context, c9898, view, false, i2, 0);
        this.f60070 = c15009;
        c15009.m36141(i);
        c15009.m36143(new C4282(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42992(int i) {
        this.f60070.m36141(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m42996() {
        return this.f60070.m36150();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9898 m42995() {
        return this.f60071;
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo21878() {
        if (!this.f60070.m36148()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42991() {
        this.f60070.m36140();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42994(InterfaceC21436 interfaceC21436) {
        this.f60069 = interfaceC21436;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42993(InterfaceC14722 interfaceC14722) {
        this.f60072 = interfaceC14722;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m42997() {
        this.f60070.m36145(true);
    }
}
