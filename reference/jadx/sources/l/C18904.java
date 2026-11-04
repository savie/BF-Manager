package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M89X */
/* JADX INFO: loaded from: classes4.dex */
public final class C18904 extends IOException {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61345 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC24169 f61346;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f61347;

    public C18904(int i) {
        this.f61347 = i;
        this.f61346 = EnumC24169.m54140(i);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return String.format("Fault: %s (0x%08X)", this.f61346, Integer.valueOf(this.f61347));
    }
}
