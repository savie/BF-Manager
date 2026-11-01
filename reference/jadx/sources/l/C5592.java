package l;

import android.os.Bundle;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5592 extends C9640 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f19199;

    public C5592(C20409 c20409) {
        this.f19199 = c20409;
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ܰ */
    public final String mo7025() {
        String string = this.f19199.f16884.getString("filePath");
        return string == null ? "untitled" : C6730.m18175(string);
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String mo15468() {
        String string = this.f19199.f16884.getString("filePath");
        if (string == null || !string.equals("untitled")) {
            return string;
        }
        return null;
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo15469() {
        return this.f19199.m46085();
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo15465() {
        C20409 c20409 = this.f19199;
        if (c20409.m46085()) {
            return c20409.f66151.f47155.m24720();
        }
        return 0;
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo15466() {
        C20409 c20409 = this.f19199;
        if (c20409.m46085()) {
            return c20409.f66151.f47153;
        }
        return 0;
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15467(int i, ResultCallback resultCallback) {
        C20409 c20409 = this.f19199;
        if (c20409.m46085()) {
            c20409.m46056(i, (Runnable) null).m30016((InterfaceC7486) new C20742(resultCallback));
        } else if (resultCallback != null) {
            resultCallback.onFailure(ResultCallback.ERROR_UNSUPPORTED_OPERATION);
        }
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo7024() {
        return this.f19199.m13338();
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۙ */
    public final void mo7023(ResultCallback resultCallback) {
        C20409 c20409 = this.f19199;
        if (c20409.m13356() && c20409.f66131 != null) {
            c20409.f66128 = resultCallback;
            c20409.f66131.m40156(null, R.string.MT_Protector, c20409.m13346().f53983.getName(), Bundle.EMPTY);
            return;
        }
        c20409.m46139((ActivityC11632) c20409.requireActivity(), resultCallback);
    }
}
