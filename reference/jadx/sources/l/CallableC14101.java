package l;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.۬᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC14101 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44611;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f44612;

    public /* synthetic */ CallableC14101(int i, Serializable serializable) {
        this.f44611 = i;
        this.f44612 = serializable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f44611) {
            case 0:
                return Long.valueOf(C20069.m46195(((C22965) this.f44612).f74596.m22013()));
            default:
                return new String((byte[]) this.f44612, StandardCharsets.UTF_8);
        }
    }
}
