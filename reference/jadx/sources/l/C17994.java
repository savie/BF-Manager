package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M89X */
/* JADX INFO: loaded from: classes4.dex */
public final class C17994 extends IOException {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f57534 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC1019 f57535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f57536;

    public C17994(int i) {
        this.f57536 = i;
        this.f57535 = EnumC1019.m3849(i);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return String.format("Fault: %s (0x%08X)", this.f57535, Integer.valueOf(this.f57536));
    }
}
