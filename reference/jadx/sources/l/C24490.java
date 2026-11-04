package l;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩺ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0V */
/* JADX INFO: loaded from: classes.dex */
public final class C24490 extends C6590 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12555 f79464;

    public C24490(TextView textView) {
        this.f79464 = new C12555(textView);
    }

    @Override // l.C6590
    /* JADX INFO: renamed from: ۙ */
    public final TransformationMethod mo18512(TransformationMethod transformationMethod) {
        return !C2203.m7518() ? transformationMethod : this.f79464.mo18512(transformationMethod);
    }

    @Override // l.C6590
    /* JADX INFO: renamed from: ۙ */
    public final void mo18513(boolean z) {
        if (C2203.m7518()) {
            this.f79464.mo18513(z);
        }
    }

    @Override // l.C6590
    /* JADX INFO: renamed from: ۙ */
    public final InputFilter[] mo18515(InputFilter[] inputFilterArr) {
        return !C2203.m7518() ? inputFilterArr : this.f79464.mo18515(inputFilterArr);
    }

    @Override // l.C6590
    /* JADX INFO: renamed from: ᩷ */
    public final void mo18516(boolean z) {
        boolean zM7518 = C2203.m7518();
        C12555 c12555 = this.f79464;
        if (!zM7518) {
            c12555.m31231(z);
        } else {
            c12555.mo18516(z);
        }
    }

    @Override // l.C6590
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18514() {
        return this.f79464.mo18514();
    }
}
