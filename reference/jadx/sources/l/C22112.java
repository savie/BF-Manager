package l;

import android.os.Bundle;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C22112 extends C9959 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f71262;

    public C22112(C7941 c7941) {
        this.f71262 = c7941;
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ᩷ */
    public final String mo4583() {
        String string = this.f71262.f23990.getString("filePath");
        return string == null ? "untitled" : C11293.m28558(string);
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ۤ */
    public final String mo10079() {
        String string = this.f71262.f23990.getString("filePath");
        if (string == null || !string.equals("untitled")) {
            return string;
        }
        return null;
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo25792() {
        return this.f71262.m21577();
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ᩸ */
    public final int mo25793() {
        C7941 c7941 = this.f71262;
        if (c7941.m21577()) {
            return c7941.f26374.f52982.m34016();
        }
        return 0;
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ۙ */
    public final int mo25790() {
        C7941 c7941 = this.f71262;
        if (c7941.m21577()) {
            return c7941.f26374.f52991;
        }
        return 0;
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ۙ */
    public final void mo25791(int i, ResultCallback resultCallback) {
        C7941 c7941 = this.f71262;
        if (c7941.m21577()) {
            c7941.m21523(i, (Runnable) null).m52931((InterfaceC2017) new C0156(2, resultCallback));
        } else if (resultCallback != null) {
            resultCallback.onFailure(ResultCallback.ERROR_UNSUPPORTED_OPERATION);
        }
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4582() {
        return this.f71262.m19933();
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ۙ */
    public final void mo4581(ResultCallback resultCallback) {
        C7941 c7941 = this.f71262;
        if (c7941.m19941() && c7941.f26399 != null) {
            c7941.f26401 = resultCallback;
            c7941.f26399.m53470(null, R.string.MT_Protector, c7941.m19934().f30601.getName(), Bundle.EMPTY);
            return;
        }
        c7941.m21628((ActivityC18143) c7941.requireActivity(), resultCallback);
    }
}
