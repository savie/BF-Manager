package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩺᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes.dex */
public final class C24578 implements InterfaceC6678 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f79661;

    @Override // l.InterfaceC6678
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18672() {
        return this;
    }

    public C24578(String str) {
        this.f79661 = str;
    }

    @Override // l.InterfaceC6678
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18673(CharSequence charSequence, int i, int i2, C5098 c5098) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f79661)) {
            return true;
        }
        c5098.m15409();
        return false;
    }
}
