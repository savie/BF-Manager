package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ᩴۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes5.dex */
public final class C19736 extends AbstractC21318 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16752 f63513;

    public C19736(AbstractC16752 abstractC16752) {
        this.f63513 = abstractC16752;
    }

    @Override // l.AbstractC21318, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f63513.f54085.setEnabled(editable.length() > 0);
    }
}
