package l;

import android.R;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.۠ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8121 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f28441;

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo21386() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8121(Main main, C11545 c11545) {
        super(main, R.string.paste);
        this.f28441 = c11545;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (!strM40352.startsWith("/")) {
            strM40352 = "/".concat(strM40352);
        }
        boolean zEndsWith = strM40352.endsWith("/");
        C11545 c11545 = this.f28441;
        if (!zEndsWith && c11545.m28817().mo13041(strM40352)) {
            c11545.m28763(C6730.m18175(strM40352));
            strM40352 = C6730.m18172(strM40352);
        }
        c11545.m28812(strM40352, false);
        m40364();
    }
}
