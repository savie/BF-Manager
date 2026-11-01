package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ܰۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes4.dex */
public final class C13766 extends AbstractC12561 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3886 f45374;

    public C13766(AbstractC3886 abstractC3886) {
        this.f45374 = abstractC3886;
    }

    @Override // l.AbstractC12561, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f45374.f14539.setEnabled(editable.length() > 0);
    }
}
