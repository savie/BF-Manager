package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.᩺᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC24545 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f79569;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f79570;

    public /* synthetic */ CallableC24545(int i, Object obj) {
        this.f79569 = i;
        this.f79570 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f79569) {
            case 0:
                return Boolean.valueOf(((C0678) this.f79570).m2930());
            default:
                return Byte.valueOf(C15945.m37971((C15945) this.f79570));
        }
    }
}
