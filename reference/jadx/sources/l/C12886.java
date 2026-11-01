package l;

/* JADX INFO: renamed from: l.۬ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6YU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12886 extends C0145 {
    @Override // l.AbstractC23430
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo3563() {
        if (!super.mo3563() || !C9754.m24746("MULTI_PROCESS")) {
            return false;
        }
        int i = C7201.f24016;
        if (C6535.f22001.mo3563()) {
            return C15003.f48930.getStatics().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
