package l;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܽۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB2C */
/* JADX INFO: loaded from: classes4.dex */
public final class C16428 extends AbstractC11406 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f52849;

    public C16428(EditText editText) {
        this.f52849 = new WeakReference(editText);
    }

    @Override // l.AbstractC11406
    /* JADX INFO: renamed from: ܰ */
    public final void mo28510() {
        C12195.m30297((EditText) this.f52849.get(), 1);
    }
}
