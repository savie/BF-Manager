package l;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩶ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0V */
/* JADX INFO: loaded from: classes5.dex */
public final class C19956 extends C15723 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20661 f63914;

    public C19956(TextView textView) {
        this.f63914 = new C20661(textView);
    }

    @Override // l.C15723
    /* JADX INFO: renamed from: ۙ */
    public final TransformationMethod mo37445(TransformationMethod transformationMethod) {
        return !C12817.m31812() ? transformationMethod : this.f63914.mo37445(transformationMethod);
    }

    @Override // l.C15723
    /* JADX INFO: renamed from: ۙ */
    public final void mo37446(boolean z) {
        if (C12817.m31812()) {
            this.f63914.mo37446(z);
        }
    }

    @Override // l.C15723
    /* JADX INFO: renamed from: ۙ */
    public final InputFilter[] mo37448(InputFilter[] inputFilterArr) {
        return !C12817.m31812() ? inputFilterArr : this.f63914.mo37448(inputFilterArr);
    }

    @Override // l.C15723
    /* JADX INFO: renamed from: ܰ */
    public final void mo37449(boolean z) {
        boolean zM31812 = C12817.m31812();
        C20661 c20661 = this.f63914;
        if (!zM31812) {
            c20661.m46513(z);
        } else {
            c20661.mo37449(z);
        }
    }

    @Override // l.C15723
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo37447() {
        return this.f63914.mo37447();
    }
}
