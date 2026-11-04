package l;

import android.net.Uri;
import android.webkit.WebResourceResponse;

/* JADX INFO: renamed from: l.ܳۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes5.dex */
public final class C15032 implements InterfaceC16512 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3846 f49072;

    public C15032(ActivityC3846 activityC3846) {
        this.f49072 = activityC3846;
    }

    @Override // l.InterfaceC16512
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo36187(Uri uri) {
        ActivityC3846 activityC3846 = this.f49072;
        return activityC3846.f13123.f10024 && C18004.m41986(uri, activityC3846.f13140.f77620);
    }

    @Override // l.InterfaceC16512
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse mo36186(Uri uri) {
        return this.f49072.f13124.mo3477(uri.getPath() == null ? "" : uri.getPath());
    }
}
