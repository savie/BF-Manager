package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.֡᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class C0675 extends C22444 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15967 f2836;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0675(Object obj, C15967 c15967) {
        super(obj);
        this.f2836 = c15967;
    }

    @Override // l.C22444
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo3032() {
        int iM49803 = m49803() & 2;
        C15967 c15967 = this.f2836;
        if (iM49803 != 0) {
            c15967.m37948(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", null);
        c15967.m37948(0, bundle);
    }
}
